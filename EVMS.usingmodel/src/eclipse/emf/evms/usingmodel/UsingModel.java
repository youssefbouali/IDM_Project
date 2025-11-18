package eclipse.emf.evms.usingmodel;

import eVMS.EVMSFactory;
import eVMS.Evenement;
import eVMS.Inscription;
import eVMS.Lieu;
import eVMS.Notification;
import eVMS.Utilisateur;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import java.util.Collections;
import java.util.Date;

public class UsingModel {

    public static void main(String[] args) {

        // 1. Factory
        EVMSFactory factory = EVMSFactory.eINSTANCE;

        // === Utilisateurs ===
        Utilisateur organisateur = factory.createUtilisateur();
        organisateur.setId(1);
        organisateur.setNom("Jean Dupont");
        organisateur.setEmail("jean.dupont@example.com");
        organisateur.setMotDePasse("secret123");
        organisateur.setRole("organisateur");

        Utilisateur participant = factory.createUtilisateur();
        participant.setId(2);
        participant.setNom("Marie Curie");
        participant.setEmail("marie@example.com");
        participant.setMotDePasse("marie2025");
        participant.setRole("participant");

        // === Lieu ===
        Lieu lieu = factory.createLieu();
        lieu.setId(1);
        lieu.setNom("Grand Amphithéâtre");
        lieu.setAdresse("10 Rue de l’Université, Paris");
        lieu.setCapacite(200);

        // === Événement ===
        Evenement event = factory.createEvenement();
        event.setId(1);
        event.setTitre("Atelier EMF & Xtext");
        event.setDescription("Découverte du framework Eclipse Modeling");
        event.setDateDebut(new Date());
        event.setDateFin(new Date(System.currentTimeMillis() + 4 * 60 * 60 * 1000));
        event.setLieu(lieu);
        event.setCreateur(organisateur);
        organisateur.getEvenementsCrees().add(event);

        // === Inscription ===
        Inscription inscription = factory.createInscription();
        inscription.setId(1);
        inscription.setDateInscription(new Date());
        inscription.setStatut("confirmée");
        inscription.setUtilisateur(participant);
        inscription.setEvenement(event);

        event.getInscriptions().add(inscription);
        participant.getInscriptions().add(inscription);

        // === Notification ===
        Notification notif = factory.createNotification();
        notif.setId(1);
        notif.setMessage("Votre inscription est confirmée !");
        notif.setDateEnvoi(new Date());
        notif.setUtilisateur(participant);
        notif.setEvenement(event);

        participant.getNotificationsRecues().add(notif);
        event.getNotifications().add(notif);

        // === SAUVEGARDE CORRIGÉE (TOUS les objets ajoutés comme racines) ===
        Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
                .put("xmi", new XMIResourceFactoryImpl());

        new java.io.File("evms-data").mkdirs();

        ResourceSet resSet = new ResourceSetImpl();
        Resource resource = resSet.createResource(
                URI.createFileURI("evms-data/mon-evms.xmi"));

        // TOUS les objets doivent être racines → sinon ils sont perdus
        resource.getContents().add(organisateur);
        resource.getContents().add(participant);
        resource.getContents().add(lieu);
        resource.getContents().add(event);
        resource.getContents().add(inscription);   // IMPORTANT
        resource.getContents().add(notif);         // IMPORTANT

        try {
            resource.save(Collections.emptyMap());
            System.out.println("Modèle eVMS sauvegardé CORRECTEMENT dans evms-data/mon-evms.xmi");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\nÉvénement créé : " + event.getTitre());
        System.out.println("Participant inscrit : " + participant.getNom());
        System.out.println("Inscriptions dans l'événement : " + event.getInscriptions().size());
        System.out.println("Notifications reçues par " + participant.getNom() + " : " + participant.getNotificationsRecues().size());
    }
}