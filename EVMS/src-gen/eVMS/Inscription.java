/**
 */
package eVMS;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Inscription</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eVMS.Inscription#getId <em>Id</em>}</li>
 *   <li>{@link eVMS.Inscription#getDateInscription <em>Date Inscription</em>}</li>
 *   <li>{@link eVMS.Inscription#getStatut <em>Statut</em>}</li>
 *   <li>{@link eVMS.Inscription#getUtilisateur <em>Utilisateur</em>}</li>
 *   <li>{@link eVMS.Inscription#getEvenement <em>Evenement</em>}</li>
 * </ul>
 *
 * @see eVMS.EVMSPackage#getInscription()
 * @model
 * @generated
 */
public interface Inscription extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see eVMS.EVMSPackage#getInscription_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link eVMS.Inscription#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Date Inscription</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Inscription</em>' attribute.
	 * @see #setDateInscription(Date)
	 * @see eVMS.EVMSPackage#getInscription_DateInscription()
	 * @model
	 * @generated
	 */
	Date getDateInscription();

	/**
	 * Sets the value of the '{@link eVMS.Inscription#getDateInscription <em>Date Inscription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Inscription</em>' attribute.
	 * @see #getDateInscription()
	 * @generated
	 */
	void setDateInscription(Date value);

	/**
	 * Returns the value of the '<em><b>Statut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statut</em>' attribute.
	 * @see #setStatut(String)
	 * @see eVMS.EVMSPackage#getInscription_Statut()
	 * @model
	 * @generated
	 */
	String getStatut();

	/**
	 * Sets the value of the '{@link eVMS.Inscription#getStatut <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statut</em>' attribute.
	 * @see #getStatut()
	 * @generated
	 */
	void setStatut(String value);

	/**
	 * Returns the value of the '<em><b>Utilisateur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eVMS.Utilisateur#getInscriptions <em>Inscriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilisateur</em>' reference.
	 * @see #setUtilisateur(Utilisateur)
	 * @see eVMS.EVMSPackage#getInscription_Utilisateur()
	 * @see eVMS.Utilisateur#getInscriptions
	 * @model opposite="inscriptions" required="true"
	 * @generated
	 */
	Utilisateur getUtilisateur();

	/**
	 * Sets the value of the '{@link eVMS.Inscription#getUtilisateur <em>Utilisateur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilisateur</em>' reference.
	 * @see #getUtilisateur()
	 * @generated
	 */
	void setUtilisateur(Utilisateur value);

	/**
	 * Returns the value of the '<em><b>Evenement</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eVMS.Evenement#getInscriptions <em>Inscriptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evenement</em>' reference.
	 * @see #setEvenement(Evenement)
	 * @see eVMS.EVMSPackage#getInscription_Evenement()
	 * @see eVMS.Evenement#getInscriptions
	 * @model opposite="inscriptions" required="true"
	 * @generated
	 */
	Evenement getEvenement();

	/**
	 * Sets the value of the '{@link eVMS.Inscription#getEvenement <em>Evenement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evenement</em>' reference.
	 * @see #getEvenement()
	 * @generated
	 */
	void setEvenement(Evenement value);

} // Inscription
