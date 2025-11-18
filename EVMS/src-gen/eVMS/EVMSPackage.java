/**
 */
package eVMS;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eVMS.EVMSFactory
 * @model kind="package"
 * @generated
 */
public interface EVMSPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "eVMS";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/eVMS";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eVMS";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EVMSPackage eINSTANCE = eVMS.impl.EVMSPackageImpl.init();

	/**
	 * The meta object id for the '{@link eVMS.impl.UtilisateurImpl <em>Utilisateur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eVMS.impl.UtilisateurImpl
	 * @see eVMS.impl.EVMSPackageImpl#getUtilisateur()
	 * @generated
	 */
	int UTILISATEUR = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__ID = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__NOM = 1;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__EMAIL = 2;

	/**
	 * The feature id for the '<em><b>Mot De Passe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__MOT_DE_PASSE = 3;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__ROLE = 4;

	/**
	 * The feature id for the '<em><b>Inscriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__INSCRIPTIONS = 5;

	/**
	 * The feature id for the '<em><b>Notifications Recues</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__NOTIFICATIONS_RECUES = 6;

	/**
	 * The feature id for the '<em><b>Evenements Crees</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__EVENEMENTS_CREES = 7;

	/**
	 * The number of structural features of the '<em>Utilisateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Utilisateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eVMS.impl.LieuImpl <em>Lieu</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eVMS.impl.LieuImpl
	 * @see eVMS.impl.EVMSPackageImpl#getLieu()
	 * @generated
	 */
	int LIEU = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEU__ID = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEU__NOM = 1;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEU__ADRESSE = 2;

	/**
	 * The feature id for the '<em><b>Capacite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEU__CAPACITE = 3;

	/**
	 * The feature id for the '<em><b>Evenements</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEU__EVENEMENTS = 4;

	/**
	 * The number of structural features of the '<em>Lieu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEU_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Lieu</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIEU_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eVMS.impl.EvenementImpl <em>Evenement</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eVMS.impl.EvenementImpl
	 * @see eVMS.impl.EVMSPackageImpl#getEvenement()
	 * @generated
	 */
	int EVENEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENEMENT__ID = 0;

	/**
	 * The feature id for the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENEMENT__TITRE = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENEMENT__DESCRIPTION = 2;

	/**
	 * The feature id for the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENEMENT__DATE_DEBUT = 3;

	/**
	 * The feature id for the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENEMENT__DATE_FIN = 4;

	/**
	 * The feature id for the '<em><b>Lieu</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENEMENT__LIEU = 5;

	/**
	 * The feature id for the '<em><b>Createur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENEMENT__CREATEUR = 6;

	/**
	 * The feature id for the '<em><b>Inscriptions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENEMENT__INSCRIPTIONS = 7;

	/**
	 * The feature id for the '<em><b>Notifications</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENEMENT__NOTIFICATIONS = 8;

	/**
	 * The number of structural features of the '<em>Evenement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENEMENT_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Evenement</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EVENEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eVMS.impl.InscriptionImpl <em>Inscription</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eVMS.impl.InscriptionImpl
	 * @see eVMS.impl.EVMSPackageImpl#getInscription()
	 * @generated
	 */
	int INSCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Date Inscription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION__DATE_INSCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Statut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION__STATUT = 2;

	/**
	 * The feature id for the '<em><b>Utilisateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION__UTILISATEUR = 3;

	/**
	 * The feature id for the '<em><b>Evenement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION__EVENEMENT = 4;

	/**
	 * The number of structural features of the '<em>Inscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Inscription</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSCRIPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eVMS.impl.NotificationImpl <em>Notification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eVMS.impl.NotificationImpl
	 * @see eVMS.impl.EVMSPackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__ID = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>Date Envoi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__DATE_ENVOI = 2;

	/**
	 * The feature id for the '<em><b>Utilisateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__UTILISATEUR = 3;

	/**
	 * The feature id for the '<em><b>Evenement</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION__EVENEMENT = 4;

	/**
	 * The number of structural features of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Notification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTIFICATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link eVMS.Utilisateur <em>Utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilisateur</em>'.
	 * @see eVMS.Utilisateur
	 * @generated
	 */
	EClass getUtilisateur();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Utilisateur#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eVMS.Utilisateur#getId()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EAttribute getUtilisateur_Id();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Utilisateur#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see eVMS.Utilisateur#getNom()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EAttribute getUtilisateur_Nom();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Utilisateur#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see eVMS.Utilisateur#getEmail()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EAttribute getUtilisateur_Email();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Utilisateur#getMotDePasse <em>Mot De Passe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mot De Passe</em>'.
	 * @see eVMS.Utilisateur#getMotDePasse()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EAttribute getUtilisateur_MotDePasse();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Utilisateur#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see eVMS.Utilisateur#getRole()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EAttribute getUtilisateur_Role();

	/**
	 * Returns the meta object for the reference list '{@link eVMS.Utilisateur#getInscriptions <em>Inscriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inscriptions</em>'.
	 * @see eVMS.Utilisateur#getInscriptions()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EReference getUtilisateur_Inscriptions();

	/**
	 * Returns the meta object for the reference list '{@link eVMS.Utilisateur#getNotificationsRecues <em>Notifications Recues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Notifications Recues</em>'.
	 * @see eVMS.Utilisateur#getNotificationsRecues()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EReference getUtilisateur_NotificationsRecues();

	/**
	 * Returns the meta object for the reference list '{@link eVMS.Utilisateur#getEvenementsCrees <em>Evenements Crees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evenements Crees</em>'.
	 * @see eVMS.Utilisateur#getEvenementsCrees()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EReference getUtilisateur_EvenementsCrees();

	/**
	 * Returns the meta object for class '{@link eVMS.Lieu <em>Lieu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Lieu</em>'.
	 * @see eVMS.Lieu
	 * @generated
	 */
	EClass getLieu();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Lieu#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eVMS.Lieu#getId()
	 * @see #getLieu()
	 * @generated
	 */
	EAttribute getLieu_Id();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Lieu#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see eVMS.Lieu#getNom()
	 * @see #getLieu()
	 * @generated
	 */
	EAttribute getLieu_Nom();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Lieu#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see eVMS.Lieu#getAdresse()
	 * @see #getLieu()
	 * @generated
	 */
	EAttribute getLieu_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Lieu#getCapacite <em>Capacite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacite</em>'.
	 * @see eVMS.Lieu#getCapacite()
	 * @see #getLieu()
	 * @generated
	 */
	EAttribute getLieu_Capacite();

	/**
	 * Returns the meta object for the reference list '{@link eVMS.Lieu#getEvenements <em>Evenements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Evenements</em>'.
	 * @see eVMS.Lieu#getEvenements()
	 * @see #getLieu()
	 * @generated
	 */
	EReference getLieu_Evenements();

	/**
	 * Returns the meta object for class '{@link eVMS.Evenement <em>Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Evenement</em>'.
	 * @see eVMS.Evenement
	 * @generated
	 */
	EClass getEvenement();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Evenement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eVMS.Evenement#getId()
	 * @see #getEvenement()
	 * @generated
	 */
	EAttribute getEvenement_Id();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Evenement#getTitre <em>Titre</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Titre</em>'.
	 * @see eVMS.Evenement#getTitre()
	 * @see #getEvenement()
	 * @generated
	 */
	EAttribute getEvenement_Titre();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Evenement#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see eVMS.Evenement#getDescription()
	 * @see #getEvenement()
	 * @generated
	 */
	EAttribute getEvenement_Description();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Evenement#getDateDebut <em>Date Debut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Debut</em>'.
	 * @see eVMS.Evenement#getDateDebut()
	 * @see #getEvenement()
	 * @generated
	 */
	EAttribute getEvenement_DateDebut();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Evenement#getDateFin <em>Date Fin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Fin</em>'.
	 * @see eVMS.Evenement#getDateFin()
	 * @see #getEvenement()
	 * @generated
	 */
	EAttribute getEvenement_DateFin();

	/**
	 * Returns the meta object for the reference '{@link eVMS.Evenement#getLieu <em>Lieu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Lieu</em>'.
	 * @see eVMS.Evenement#getLieu()
	 * @see #getEvenement()
	 * @generated
	 */
	EReference getEvenement_Lieu();

	/**
	 * Returns the meta object for the reference '{@link eVMS.Evenement#getCreateur <em>Createur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Createur</em>'.
	 * @see eVMS.Evenement#getCreateur()
	 * @see #getEvenement()
	 * @generated
	 */
	EReference getEvenement_Createur();

	/**
	 * Returns the meta object for the reference list '{@link eVMS.Evenement#getInscriptions <em>Inscriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Inscriptions</em>'.
	 * @see eVMS.Evenement#getInscriptions()
	 * @see #getEvenement()
	 * @generated
	 */
	EReference getEvenement_Inscriptions();

	/**
	 * Returns the meta object for the reference list '{@link eVMS.Evenement#getNotifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Notifications</em>'.
	 * @see eVMS.Evenement#getNotifications()
	 * @see #getEvenement()
	 * @generated
	 */
	EReference getEvenement_Notifications();

	/**
	 * Returns the meta object for class '{@link eVMS.Inscription <em>Inscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inscription</em>'.
	 * @see eVMS.Inscription
	 * @generated
	 */
	EClass getInscription();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Inscription#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eVMS.Inscription#getId()
	 * @see #getInscription()
	 * @generated
	 */
	EAttribute getInscription_Id();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Inscription#getDateInscription <em>Date Inscription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Inscription</em>'.
	 * @see eVMS.Inscription#getDateInscription()
	 * @see #getInscription()
	 * @generated
	 */
	EAttribute getInscription_DateInscription();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Inscription#getStatut <em>Statut</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statut</em>'.
	 * @see eVMS.Inscription#getStatut()
	 * @see #getInscription()
	 * @generated
	 */
	EAttribute getInscription_Statut();

	/**
	 * Returns the meta object for the reference '{@link eVMS.Inscription#getUtilisateur <em>Utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Utilisateur</em>'.
	 * @see eVMS.Inscription#getUtilisateur()
	 * @see #getInscription()
	 * @generated
	 */
	EReference getInscription_Utilisateur();

	/**
	 * Returns the meta object for the reference '{@link eVMS.Inscription#getEvenement <em>Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evenement</em>'.
	 * @see eVMS.Inscription#getEvenement()
	 * @see #getInscription()
	 * @generated
	 */
	EReference getInscription_Evenement();

	/**
	 * Returns the meta object for class '{@link eVMS.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Notification</em>'.
	 * @see eVMS.Notification
	 * @generated
	 */
	EClass getNotification();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Notification#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see eVMS.Notification#getId()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Id();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Notification#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Message</em>'.
	 * @see eVMS.Notification#getMessage()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_Message();

	/**
	 * Returns the meta object for the attribute '{@link eVMS.Notification#getDateEnvoi <em>Date Envoi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Envoi</em>'.
	 * @see eVMS.Notification#getDateEnvoi()
	 * @see #getNotification()
	 * @generated
	 */
	EAttribute getNotification_DateEnvoi();

	/**
	 * Returns the meta object for the reference '{@link eVMS.Notification#getUtilisateur <em>Utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Utilisateur</em>'.
	 * @see eVMS.Notification#getUtilisateur()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_Utilisateur();

	/**
	 * Returns the meta object for the reference '{@link eVMS.Notification#getEvenement <em>Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Evenement</em>'.
	 * @see eVMS.Notification#getEvenement()
	 * @see #getNotification()
	 * @generated
	 */
	EReference getNotification_Evenement();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	EVMSFactory getEVMSFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eVMS.impl.UtilisateurImpl <em>Utilisateur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eVMS.impl.UtilisateurImpl
		 * @see eVMS.impl.EVMSPackageImpl#getUtilisateur()
		 * @generated
		 */
		EClass UTILISATEUR = eINSTANCE.getUtilisateur();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILISATEUR__ID = eINSTANCE.getUtilisateur_Id();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILISATEUR__NOM = eINSTANCE.getUtilisateur_Nom();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILISATEUR__EMAIL = eINSTANCE.getUtilisateur_Email();

		/**
		 * The meta object literal for the '<em><b>Mot De Passe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILISATEUR__MOT_DE_PASSE = eINSTANCE.getUtilisateur_MotDePasse();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UTILISATEUR__ROLE = eINSTANCE.getUtilisateur_Role();

		/**
		 * The meta object literal for the '<em><b>Inscriptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILISATEUR__INSCRIPTIONS = eINSTANCE.getUtilisateur_Inscriptions();

		/**
		 * The meta object literal for the '<em><b>Notifications Recues</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILISATEUR__NOTIFICATIONS_RECUES = eINSTANCE.getUtilisateur_NotificationsRecues();

		/**
		 * The meta object literal for the '<em><b>Evenements Crees</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILISATEUR__EVENEMENTS_CREES = eINSTANCE.getUtilisateur_EvenementsCrees();

		/**
		 * The meta object literal for the '{@link eVMS.impl.LieuImpl <em>Lieu</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eVMS.impl.LieuImpl
		 * @see eVMS.impl.EVMSPackageImpl#getLieu()
		 * @generated
		 */
		EClass LIEU = eINSTANCE.getLieu();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIEU__ID = eINSTANCE.getLieu_Id();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIEU__NOM = eINSTANCE.getLieu_Nom();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIEU__ADRESSE = eINSTANCE.getLieu_Adresse();

		/**
		 * The meta object literal for the '<em><b>Capacite</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIEU__CAPACITE = eINSTANCE.getLieu_Capacite();

		/**
		 * The meta object literal for the '<em><b>Evenements</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIEU__EVENEMENTS = eINSTANCE.getLieu_Evenements();

		/**
		 * The meta object literal for the '{@link eVMS.impl.EvenementImpl <em>Evenement</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eVMS.impl.EvenementImpl
		 * @see eVMS.impl.EVMSPackageImpl#getEvenement()
		 * @generated
		 */
		EClass EVENEMENT = eINSTANCE.getEvenement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENEMENT__ID = eINSTANCE.getEvenement_Id();

		/**
		 * The meta object literal for the '<em><b>Titre</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENEMENT__TITRE = eINSTANCE.getEvenement_Titre();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENEMENT__DESCRIPTION = eINSTANCE.getEvenement_Description();

		/**
		 * The meta object literal for the '<em><b>Date Debut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENEMENT__DATE_DEBUT = eINSTANCE.getEvenement_DateDebut();

		/**
		 * The meta object literal for the '<em><b>Date Fin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EVENEMENT__DATE_FIN = eINSTANCE.getEvenement_DateFin();

		/**
		 * The meta object literal for the '<em><b>Lieu</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENEMENT__LIEU = eINSTANCE.getEvenement_Lieu();

		/**
		 * The meta object literal for the '<em><b>Createur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENEMENT__CREATEUR = eINSTANCE.getEvenement_Createur();

		/**
		 * The meta object literal for the '<em><b>Inscriptions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENEMENT__INSCRIPTIONS = eINSTANCE.getEvenement_Inscriptions();

		/**
		 * The meta object literal for the '<em><b>Notifications</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EVENEMENT__NOTIFICATIONS = eINSTANCE.getEvenement_Notifications();

		/**
		 * The meta object literal for the '{@link eVMS.impl.InscriptionImpl <em>Inscription</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eVMS.impl.InscriptionImpl
		 * @see eVMS.impl.EVMSPackageImpl#getInscription()
		 * @generated
		 */
		EClass INSCRIPTION = eINSTANCE.getInscription();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSCRIPTION__ID = eINSTANCE.getInscription_Id();

		/**
		 * The meta object literal for the '<em><b>Date Inscription</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSCRIPTION__DATE_INSCRIPTION = eINSTANCE.getInscription_DateInscription();

		/**
		 * The meta object literal for the '<em><b>Statut</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSCRIPTION__STATUT = eINSTANCE.getInscription_Statut();

		/**
		 * The meta object literal for the '<em><b>Utilisateur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSCRIPTION__UTILISATEUR = eINSTANCE.getInscription_Utilisateur();

		/**
		 * The meta object literal for the '<em><b>Evenement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSCRIPTION__EVENEMENT = eINSTANCE.getInscription_Evenement();

		/**
		 * The meta object literal for the '{@link eVMS.impl.NotificationImpl <em>Notification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eVMS.impl.NotificationImpl
		 * @see eVMS.impl.EVMSPackageImpl#getNotification()
		 * @generated
		 */
		EClass NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__ID = eINSTANCE.getNotification_Id();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__MESSAGE = eINSTANCE.getNotification_Message();

		/**
		 * The meta object literal for the '<em><b>Date Envoi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTIFICATION__DATE_ENVOI = eINSTANCE.getNotification_DateEnvoi();

		/**
		 * The meta object literal for the '<em><b>Utilisateur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__UTILISATEUR = eINSTANCE.getNotification_Utilisateur();

		/**
		 * The meta object literal for the '<em><b>Evenement</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTIFICATION__EVENEMENT = eINSTANCE.getNotification_Evenement();

	}

} //EVMSPackage
