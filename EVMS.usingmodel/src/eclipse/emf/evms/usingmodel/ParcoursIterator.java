package eclipse.emf.evms.usingmodel;

import java.util.Iterator;
import eVMS.Evenement;
import eVMS.Inscription;
import eVMS.Lieu;
import eVMS.Notification;
import eVMS.Utilisateur;

public class ParcoursIterator {

    /**
     * Affiche tous les événements avec leurs détails complets
     */
    public static void afficherEvenements(Iterator<Evenement> itEvenements) {
        System.out.println("=== LISTE DES ÉVÉNEMENTS (via Iterator) ===\n");

        if (!itEvenements.hasNext()) {
            System.out.println("Aucun événement trouvé.");
            return;
        }

        while (itEvenements.hasNext()) {
            Evenement evt = itEvenements.next();

            System.out.println("Événement ID  : " + evt.getId());
            System.out.println("Titre         : " + evt.getTitre());
            System.out.println("Description   : " + evt.getDescription());
            System.out.println("Date début    : " + evt.getDateDebut());
            System.out.println("Date fin      : " + evt.getDateFin());

            // Lieu
            Lieu lieu = evt.getLieu();
            System.out.println("Lieu          : " + (lieu != null ? lieu.getNom() + " (" + lieu.getAdresse() + ", " + lieu.getCapacite() + " places)" : "Non défini"));

            // Créateur
            Utilisateur createur = evt.getCreateur();
            System.out.println("Organisateur  : " + (createur != null ? createur.getNom() + " <" + createur.getEmail() + ">" : "Inconnu"));

            // Inscriptions
            System.out.println("Inscriptions (" + evt.getInscriptions().size() + ") :");
            Iterator<Inscription> itInsc = evt.getInscriptions().iterator();
            if (!itInsc.hasNext()) {
                System.out.println("   → Aucune inscription");
            }
            while (itInsc.hasNext()) {
                Inscription insc = itInsc.next();
                Utilisateur user = insc.getUtilisateur();
                System.out.println("   → " + user.getNom() +
                        " | Statut: " + insc.getStatut() +
                        " | Inscrit le: " + insc.getDateInscription());
            }

            // Notifications
            System.out.println("Notifications (" + evt.getNotifications().size() + ") :");
            Iterator<Notification> itNotif = evt.getNotifications().iterator();
            if (!itNotif.hasNext()) {
                System.out.println("   → Aucune notification");
            }
            while (itNotif.hasNext()) {
                Notification n = itNotif.next();
                System.out.println("   → \"" + n.getMessage() + "\" (envoyée le " + n.getDateEnvoi() + ")");
            }

            System.out.println("─".repeat(70));
            System.out.println();
        }
    }

    /**
     * Méthode principale : charge le modèle et parcourt les événements avec un Iterator
     */
    public static void main(String[] args) {
        LoadModel loader = new LoadModel();

        // Charger le modèle (crée un exemple si le fichier n'existe pas)
        loader.loadAndDisplay();  // Affiche déjà les objets

        System.out.println("\n" + "=".repeat(50));
        System.out.println("PARCOURS VIA ITERATOR PUR");
        System.out.println("=".repeat(50));

        // Récupérer tous les EObject du fichier chargé
        var allRoots = loader.getLastLoadedResource().getContents();

        // Filtrer uniquement les Evenement → créer un Iterator<Evenement>
        Iterator<Evenement> evenementsIterator = allRoots.stream()
                .filter(obj -> obj instanceof Evenement)
                .map(obj -> (Evenement) obj)
                .iterator();

        afficherEvenements(evenementsIterator);
    }

    // === Ajout nécessaire dans LoadModel.java (à copier-coller là-bas) ===
    // Ajoute cette méthode dans ta classe LoadModel pour que ParcoursIterator puisse accéder à la ressource :
    /*
    private Resource lastResource = null;

    public Resource getLastLoadedResource() {
        return lastResource;
    }

    // Et dans load, après avoir chargé la ressource :
    resource = resSet.getResource(uri, true);
    this.lastResource = resource;  // ← Ajouter cette ligne
    */
}