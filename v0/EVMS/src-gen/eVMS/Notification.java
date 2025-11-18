/**
 */
package eVMS;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eVMS.Notification#getId <em>Id</em>}</li>
 *   <li>{@link eVMS.Notification#getMessage <em>Message</em>}</li>
 *   <li>{@link eVMS.Notification#getDateEnvoi <em>Date Envoi</em>}</li>
 *   <li>{@link eVMS.Notification#getUtilisateur <em>Utilisateur</em>}</li>
 *   <li>{@link eVMS.Notification#getEvenement <em>Evenement</em>}</li>
 * </ul>
 *
 * @see eVMS.EVMSPackage#getNotification()
 * @model
 * @generated
 */
public interface Notification extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see eVMS.EVMSPackage#getNotification_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link eVMS.Notification#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' attribute.
	 * @see #setMessage(String)
	 * @see eVMS.EVMSPackage#getNotification_Message()
	 * @model
	 * @generated
	 */
	String getMessage();

	/**
	 * Sets the value of the '{@link eVMS.Notification#getMessage <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' attribute.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(String value);

	/**
	 * Returns the value of the '<em><b>Date Envoi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Envoi</em>' attribute.
	 * @see #setDateEnvoi(Date)
	 * @see eVMS.EVMSPackage#getNotification_DateEnvoi()
	 * @model
	 * @generated
	 */
	Date getDateEnvoi();

	/**
	 * Sets the value of the '{@link eVMS.Notification#getDateEnvoi <em>Date Envoi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Envoi</em>' attribute.
	 * @see #getDateEnvoi()
	 * @generated
	 */
	void setDateEnvoi(Date value);

	/**
	 * Returns the value of the '<em><b>Utilisateur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eVMS.Utilisateur#getNotificationsRecues <em>Notifications Recues</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilisateur</em>' reference.
	 * @see #setUtilisateur(Utilisateur)
	 * @see eVMS.EVMSPackage#getNotification_Utilisateur()
	 * @see eVMS.Utilisateur#getNotificationsRecues
	 * @model opposite="notificationsRecues" required="true"
	 * @generated
	 */
	Utilisateur getUtilisateur();

	/**
	 * Sets the value of the '{@link eVMS.Notification#getUtilisateur <em>Utilisateur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilisateur</em>' reference.
	 * @see #getUtilisateur()
	 * @generated
	 */
	void setUtilisateur(Utilisateur value);

	/**
	 * Returns the value of the '<em><b>Evenement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eVMS.Evenement#getNotifications <em>Notifications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evenement</em>' reference.
	 * @see #setEvenement(Evenement)
	 * @see eVMS.EVMSPackage#getNotification_Evenement()
	 * @see eVMS.Evenement#getNotifications
	 * @model opposite="notifications" required="true"
	 * @generated
	 */
	Evenement getEvenement();

	/**
	 * Sets the value of the '{@link eVMS.Notification#getEvenement <em>Evenement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evenement</em>' reference.
	 * @see #getEvenement()
	 * @generated
	 */
	void setEvenement(Evenement value);

} // Notification
