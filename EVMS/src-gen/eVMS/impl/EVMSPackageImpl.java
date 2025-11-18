/**
 */
package eVMS.impl;

import eVMS.EVMSFactory;
import eVMS.EVMSPackage;
import eVMS.Evenement;
import eVMS.Inscription;
import eVMS.Lieu;
import eVMS.Notification;
import eVMS.Utilisateur;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EVMSPackageImpl extends EPackageImpl implements EVMSPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilisateurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lieuEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evenementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notificationEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eVMS.EVMSPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private EVMSPackageImpl() {
		super(eNS_URI, EVMSFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link EVMSPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static EVMSPackage init() {
		if (isInited)
			return (EVMSPackage) EPackage.Registry.INSTANCE.getEPackage(EVMSPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredEVMSPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		EVMSPackageImpl theEVMSPackage = registeredEVMSPackage instanceof EVMSPackageImpl
				? (EVMSPackageImpl) registeredEVMSPackage
				: new EVMSPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theEVMSPackage.createPackageContents();

		// Initialize created meta-data
		theEVMSPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theEVMSPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(EVMSPackage.eNS_URI, theEVMSPackage);
		return theEVMSPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getUtilisateur() {
		return utilisateurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUtilisateur_Id() {
		return (EAttribute) utilisateurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUtilisateur_Nom() {
		return (EAttribute) utilisateurEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUtilisateur_Email() {
		return (EAttribute) utilisateurEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUtilisateur_MotDePasse() {
		return (EAttribute) utilisateurEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getUtilisateur_Role() {
		return (EAttribute) utilisateurEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUtilisateur_Inscriptions() {
		return (EReference) utilisateurEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUtilisateur_NotificationsRecues() {
		return (EReference) utilisateurEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getUtilisateur_EvenementsCrees() {
		return (EReference) utilisateurEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getLieu() {
		return lieuEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLieu_Id() {
		return (EAttribute) lieuEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLieu_Nom() {
		return (EAttribute) lieuEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLieu_Adresse() {
		return (EAttribute) lieuEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getLieu_Capacite() {
		return (EAttribute) lieuEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getLieu_Evenements() {
		return (EReference) lieuEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvenement() {
		return evenementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvenement_Id() {
		return (EAttribute) evenementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvenement_Titre() {
		return (EAttribute) evenementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvenement_Description() {
		return (EAttribute) evenementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvenement_DateDebut() {
		return (EAttribute) evenementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEvenement_DateFin() {
		return (EAttribute) evenementEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvenement_Lieu() {
		return (EReference) evenementEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvenement_Createur() {
		return (EReference) evenementEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvenement_Inscriptions() {
		return (EReference) evenementEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvenement_Notifications() {
		return (EReference) evenementEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInscription() {
		return inscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInscription_Id() {
		return (EAttribute) inscriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInscription_DateInscription() {
		return (EAttribute) inscriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInscription_Statut() {
		return (EAttribute) inscriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInscription_Utilisateur() {
		return (EReference) inscriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getInscription_Evenement() {
		return (EReference) inscriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNotification() {
		return notificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotification_Id() {
		return (EAttribute) notificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotification_Message() {
		return (EAttribute) notificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNotification_DateEnvoi() {
		return (EAttribute) notificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNotification_Utilisateur() {
		return (EReference) notificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNotification_Evenement() {
		return (EReference) notificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EVMSFactory getEVMSFactory() {
		return (EVMSFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		utilisateurEClass = createEClass(UTILISATEUR);
		createEAttribute(utilisateurEClass, UTILISATEUR__ID);
		createEAttribute(utilisateurEClass, UTILISATEUR__NOM);
		createEAttribute(utilisateurEClass, UTILISATEUR__EMAIL);
		createEAttribute(utilisateurEClass, UTILISATEUR__MOT_DE_PASSE);
		createEAttribute(utilisateurEClass, UTILISATEUR__ROLE);
		createEReference(utilisateurEClass, UTILISATEUR__INSCRIPTIONS);
		createEReference(utilisateurEClass, UTILISATEUR__NOTIFICATIONS_RECUES);
		createEReference(utilisateurEClass, UTILISATEUR__EVENEMENTS_CREES);

		lieuEClass = createEClass(LIEU);
		createEAttribute(lieuEClass, LIEU__ID);
		createEAttribute(lieuEClass, LIEU__NOM);
		createEAttribute(lieuEClass, LIEU__ADRESSE);
		createEAttribute(lieuEClass, LIEU__CAPACITE);
		createEReference(lieuEClass, LIEU__EVENEMENTS);

		evenementEClass = createEClass(EVENEMENT);
		createEAttribute(evenementEClass, EVENEMENT__ID);
		createEAttribute(evenementEClass, EVENEMENT__TITRE);
		createEAttribute(evenementEClass, EVENEMENT__DESCRIPTION);
		createEAttribute(evenementEClass, EVENEMENT__DATE_DEBUT);
		createEAttribute(evenementEClass, EVENEMENT__DATE_FIN);
		createEReference(evenementEClass, EVENEMENT__LIEU);
		createEReference(evenementEClass, EVENEMENT__CREATEUR);
		createEReference(evenementEClass, EVENEMENT__INSCRIPTIONS);
		createEReference(evenementEClass, EVENEMENT__NOTIFICATIONS);

		inscriptionEClass = createEClass(INSCRIPTION);
		createEAttribute(inscriptionEClass, INSCRIPTION__ID);
		createEAttribute(inscriptionEClass, INSCRIPTION__DATE_INSCRIPTION);
		createEAttribute(inscriptionEClass, INSCRIPTION__STATUT);
		createEReference(inscriptionEClass, INSCRIPTION__UTILISATEUR);
		createEReference(inscriptionEClass, INSCRIPTION__EVENEMENT);

		notificationEClass = createEClass(NOTIFICATION);
		createEAttribute(notificationEClass, NOTIFICATION__ID);
		createEAttribute(notificationEClass, NOTIFICATION__MESSAGE);
		createEAttribute(notificationEClass, NOTIFICATION__DATE_ENVOI);
		createEReference(notificationEClass, NOTIFICATION__UTILISATEUR);
		createEReference(notificationEClass, NOTIFICATION__EVENEMENT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(utilisateurEClass, Utilisateur.class, "Utilisateur", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUtilisateur_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Utilisateur.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilisateur_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Utilisateur.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilisateur_Email(), ecorePackage.getEString(), "email", null, 0, 1, Utilisateur.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilisateur_MotDePasse(), ecorePackage.getEString(), "motDePasse", null, 0, 1,
				Utilisateur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getUtilisateur_Role(), ecorePackage.getEString(), "role", null, 0, 1, Utilisateur.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtilisateur_Inscriptions(), this.getInscription(), this.getInscription_Utilisateur(),
				"inscriptions", null, 0, -1, Utilisateur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtilisateur_NotificationsRecues(), this.getNotification(), this.getNotification_Utilisateur(),
				"notificationsRecues", null, 0, -1, Utilisateur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUtilisateur_EvenementsCrees(), this.getEvenement(), this.getEvenement_Createur(),
				"evenementsCrees", null, 0, -1, Utilisateur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lieuEClass, Lieu.class, "Lieu", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLieu_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Lieu.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLieu_Nom(), ecorePackage.getEString(), "nom", null, 0, 1, Lieu.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLieu_Adresse(), ecorePackage.getEString(), "adresse", null, 0, 1, Lieu.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLieu_Capacite(), ecorePackage.getEInt(), "capacite", null, 0, 1, Lieu.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLieu_Evenements(), this.getEvenement(), this.getEvenement_Lieu(), "evenements", null, 0, -1,
				Lieu.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(evenementEClass, Evenement.class, "Evenement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEvenement_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Evenement.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvenement_Titre(), ecorePackage.getEString(), "titre", null, 0, 1, Evenement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvenement_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				Evenement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvenement_DateDebut(), ecorePackage.getEDate(), "dateDebut", null, 0, 1, Evenement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEvenement_DateFin(), ecorePackage.getEDate(), "dateFin", null, 0, 1, Evenement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvenement_Lieu(), this.getLieu(), this.getLieu_Evenements(), "lieu", null, 1, 1,
				Evenement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvenement_Createur(), this.getUtilisateur(), this.getUtilisateur_EvenementsCrees(),
				"createur", null, 1, 1, Evenement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvenement_Inscriptions(), this.getInscription(), this.getInscription_Evenement(),
				"inscriptions", null, 0, -1, Evenement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEvenement_Notifications(), this.getNotification(), this.getNotification_Evenement(),
				"notifications", null, 0, -1, Evenement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inscriptionEClass, Inscription.class, "Inscription", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInscription_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Inscription.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInscription_DateInscription(), ecorePackage.getEDate(), "dateInscription", null, 0, 1,
				Inscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getInscription_Statut(), ecorePackage.getEString(), "statut", null, 0, 1, Inscription.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInscription_Utilisateur(), this.getUtilisateur(), this.getUtilisateur_Inscriptions(),
				"utilisateur", null, 1, 1, Inscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInscription_Evenement(), this.getEvenement(), this.getEvenement_Inscriptions(), "evenement",
				null, 1, 1, Inscription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(notificationEClass, Notification.class, "Notification", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNotification_Id(), ecorePackage.getEInt(), "id", null, 0, 1, Notification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotification_Message(), ecorePackage.getEString(), "message", null, 0, 1, Notification.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNotification_DateEnvoi(), ecorePackage.getEDate(), "dateEnvoi", null, 0, 1,
				Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getNotification_Utilisateur(), this.getUtilisateur(), this.getUtilisateur_NotificationsRecues(),
				"utilisateur", null, 1, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNotification_Evenement(), this.getEvenement(), this.getEvenement_Notifications(), "evenement",
				null, 1, 1, Notification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //EVMSPackageImpl
