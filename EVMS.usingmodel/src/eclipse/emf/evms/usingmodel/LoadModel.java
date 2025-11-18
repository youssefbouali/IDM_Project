package eclipse.emf.evms.usingmodel;

import java.io.File;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.*;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import eVMS.EVMSPackage;
import eVMS.Evenement;
import eVMS.Inscription;
import eVMS.Lieu;
import eVMS.Notification;
import eVMS.Utilisateur;

public class LoadModel {

    // Stocke la dernière ressource chargée (utile pour ParcoursIterator)
    private Resource lastResource = null;

    public Resource getLastLoadedResource() {
        return lastResource;
    }

    // Crée automatiquement un exemple si le fichier n’existe pas
    private void creerExempleSiAbsent() {
        File file = new File("evms-data/mon-evms.xmi");
        if (!file.exists()) {
            System.out.println("Fichier non trouvé → création automatique d’un exemple avec UsingModel...");
            UsingModel.main(new String[0]);  // Appelle directement la création
            System.out.println("Exemple créé avec succès dans evms-data/mon-evms.xmi\n");
        }
    }

    public void loadAndDisplay() {
        creerExempleSiAbsent();

        // Initialisation du package (obligatoire pour EMF)
        EVMSPackage.eINSTANCE.eClass();

        // Enregistrement de la factory XMI
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
                .put("xmi", new XMIResourceFactoryImpl());

        // Chargement du fichier
        ResourceSet resSet = new ResourceSetImpl();
        URI uri = URI.createFileURI(new File("evms-data/mon-evms.xmi").getAbsolutePath());
        Resource resource = resSet.getResource(uri, true);
        this.lastResource = resource;  // Stockage pour ParcoursIterator

        System.out.println("════════════════════════════════════════════════");
        System.out.println("   MODÈLE eVMS CHARGÉ ET AFFICHÉ CORRECTEMENT");
        System.out.println("════════════════════════════════════════════════\n");

        for (EObject obj : resource.getContents()) {

            if (obj instanceof Evenement) {
                Evenement e = (Evenement) obj;
                System.out.println("ÉVÉNEMENT : " + e.getTitre());
                System.out.println("  Description : " + e.getDescription());
                System.out.println("  Date        : " + e.getDateDebut() + " → " + e.getDateFin());
                System.out.println("  Lieu        : " + (e.getLieu() != null ? e.getLieu().getNom() : "Non défini"));
                System.out.println("  Créateur    : " + (e.getCreateur() != null ? e.getCreateur().getNom() : "Inconnu"));
                System.out.println("  Inscriptions : " + e.getInscriptions().size());
                for (Inscription i : e.getInscriptions()) {
                    System.out.println("     → " + i.getUtilisateur().getNom() +
                                     " | Statut: " + i.getStatut() +
                                     " | Inscrit le: " + i.getDateInscription());
                }
                System.out.println();
            }

            if (obj instanceof Utilisateur) {
                Utilisateur u = (Utilisateur) obj;
                System.out.println("UTILISATEUR : " + u.getNom() +
                                 " <" + u.getEmail() + "> [" + u.getRole() + "]");
                System.out.println("  Inscrit à " + u.getInscriptions().size() + " événement(s)");
                if (!u.getNotificationsRecues().isEmpty()) {
                    System.out.println("  Notifications reçues : " + u.getNotificationsRecues().size());
                    for (Notification n : u.getNotificationsRecues()) {
                        System.out.println("     → \"" + n.getMessage() + "\" (envoyée le " + n.getDateEnvoi() + ")");
                    }
                }
                System.out.println();
            }

            if (obj instanceof Lieu) {
                Lieu l = (Lieu) obj;
                System.out.println("LIEU : " + l.getNom());
                System.out.println("  Adresse  : " + l.getAdresse());
                System.out.println("  Capacité : " + l.getCapacite() + " places\n");
            }
        }

        afficherStructureMetamodel();
    }

    private void afficherStructureMetamodel() {
        System.out.println("════════════════════════════════════════════════");
        System.out.println("     STRUCTURE DU MÉTAMODÈLE eVMS");
        System.out.println("════════════════════════════════════════════════");
        for (EClassifier c : EVMSPackage.eINSTANCE.getEClassifiers()) {
            if (c instanceof EClass) {
                EClass cls = (EClass) c;
                System.out.println("Classe : " + cls.getName());
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        new LoadModel().loadAndDisplay();
    }
}