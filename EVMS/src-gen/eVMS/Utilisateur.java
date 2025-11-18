/**
 */
package eVMS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utilisateur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eVMS.Utilisateur#getId <em>Id</em>}</li>
 *   <li>{@link eVMS.Utilisateur#getNom <em>Nom</em>}</li>
 *   <li>{@link eVMS.Utilisateur#getEmail <em>Email</em>}</li>
 *   <li>{@link eVMS.Utilisateur#getMotDePasse <em>Mot De Passe</em>}</li>
 *   <li>{@link eVMS.Utilisateur#getRole <em>Role</em>}</li>
 *   <li>{@link eVMS.Utilisateur#getInscriptions <em>Inscriptions</em>}</li>
 *   <li>{@link eVMS.Utilisateur#getNotificationsRecues <em>Notifications Recues</em>}</li>
 *   <li>{@link eVMS.Utilisateur#getEvenementsCrees <em>Evenements Crees</em>}</li>
 * </ul>
 *
 * @see eVMS.EVMSPackage#getUtilisateur()
 * @model
 * @generated
 */
public interface Utilisateur extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see eVMS.EVMSPackage#getUtilisateur_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link eVMS.Utilisateur#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see eVMS.EVMSPackage#getUtilisateur_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link eVMS.Utilisateur#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Email</em>' attribute.
	 * @see #setEmail(String)
	 * @see eVMS.EVMSPackage#getUtilisateur_Email()
	 * @model
	 * @generated
	 */
	String getEmail();

	/**
	 * Sets the value of the '{@link eVMS.Utilisateur#getEmail <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Email</em>' attribute.
	 * @see #getEmail()
	 * @generated
	 */
	void setEmail(String value);

	/**
	 * Returns the value of the '<em><b>Mot De Passe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mot De Passe</em>' attribute.
	 * @see #setMotDePasse(String)
	 * @see eVMS.EVMSPackage#getUtilisateur_MotDePasse()
	 * @model
	 * @generated
	 */
	String getMotDePasse();

	/**
	 * Sets the value of the '{@link eVMS.Utilisateur#getMotDePasse <em>Mot De Passe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mot De Passe</em>' attribute.
	 * @see #getMotDePasse()
	 * @generated
	 */
	void setMotDePasse(String value);

	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see #setRole(String)
	 * @see eVMS.EVMSPackage#getUtilisateur_Role()
	 * @model
	 * @generated
	 */
	String getRole();

	/**
	 * Sets the value of the '{@link eVMS.Utilisateur#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see #getRole()
	 * @generated
	 */
	void setRole(String value);

	/**
	 * Returns the value of the '<em><b>Inscriptions</b></em>' reference list.
	 * The list contents are of type {@link eVMS.Inscription}.
	 * It is bidirectional and its opposite is '{@link eVMS.Inscription#getUtilisateur <em>Utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inscriptions</em>' reference list.
	 * @see eVMS.EVMSPackage#getUtilisateur_Inscriptions()
	 * @see eVMS.Inscription#getUtilisateur
	 * @model opposite="utilisateur"
	 * @generated
	 */
	EList<Inscription> getInscriptions();

	/**
	 * Returns the value of the '<em><b>Notifications Recues</b></em>' reference list.
	 * The list contents are of type {@link eVMS.Notification}.
	 * It is bidirectional and its opposite is '{@link eVMS.Notification#getUtilisateur <em>Utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifications Recues</em>' reference list.
	 * @see eVMS.EVMSPackage#getUtilisateur_NotificationsRecues()
	 * @see eVMS.Notification#getUtilisateur
	 * @model opposite="utilisateur"
	 * @generated
	 */
	EList<Notification> getNotificationsRecues();

	/**
	 * Returns the value of the '<em><b>Evenements Crees</b></em>' reference list.
	 * The list contents are of type {@link eVMS.Evenement}.
	 * It is bidirectional and its opposite is '{@link eVMS.Evenement#getCreateur <em>Createur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evenements Crees</em>' reference list.
	 * @see eVMS.EVMSPackage#getUtilisateur_EvenementsCrees()
	 * @see eVMS.Evenement#getCreateur
	 * @model opposite="createur"
	 * @generated
	 */
	EList<Evenement> getEvenementsCrees();

} // Utilisateur
