/**
 */
package eVMS;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Evenement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eVMS.Evenement#getId <em>Id</em>}</li>
 *   <li>{@link eVMS.Evenement#getTitre <em>Titre</em>}</li>
 *   <li>{@link eVMS.Evenement#getDescription <em>Description</em>}</li>
 *   <li>{@link eVMS.Evenement#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link eVMS.Evenement#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link eVMS.Evenement#getLieu <em>Lieu</em>}</li>
 *   <li>{@link eVMS.Evenement#getCreateur <em>Createur</em>}</li>
 *   <li>{@link eVMS.Evenement#getInscriptions <em>Inscriptions</em>}</li>
 *   <li>{@link eVMS.Evenement#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @see eVMS.EVMSPackage#getEvenement()
 * @model
 * @generated
 */
public interface Evenement extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see eVMS.EVMSPackage#getEvenement_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link eVMS.Evenement#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(int value);

	/**
	 * Returns the value of the '<em><b>Titre</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Titre</em>' attribute.
	 * @see #setTitre(String)
	 * @see eVMS.EVMSPackage#getEvenement_Titre()
	 * @model
	 * @generated
	 */
	String getTitre();

	/**
	 * Sets the value of the '{@link eVMS.Evenement#getTitre <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Titre</em>' attribute.
	 * @see #getTitre()
	 * @generated
	 */
	void setTitre(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see eVMS.EVMSPackage#getEvenement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link eVMS.Evenement#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Date Debut</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Debut</em>' attribute.
	 * @see #setDateDebut(Date)
	 * @see eVMS.EVMSPackage#getEvenement_DateDebut()
	 * @model
	 * @generated
	 */
	Date getDateDebut();

	/**
	 * Sets the value of the '{@link eVMS.Evenement#getDateDebut <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Debut</em>' attribute.
	 * @see #getDateDebut()
	 * @generated
	 */
	void setDateDebut(Date value);

	/**
	 * Returns the value of the '<em><b>Date Fin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Fin</em>' attribute.
	 * @see #setDateFin(Date)
	 * @see eVMS.EVMSPackage#getEvenement_DateFin()
	 * @model
	 * @generated
	 */
	Date getDateFin();

	/**
	 * Sets the value of the '{@link eVMS.Evenement#getDateFin <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Fin</em>' attribute.
	 * @see #getDateFin()
	 * @generated
	 */
	void setDateFin(Date value);

	/**
	 * Returns the value of the '<em><b>Lieu</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eVMS.Lieu#getEvenements <em>Evenements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lieu</em>' reference.
	 * @see #setLieu(Lieu)
	 * @see eVMS.EVMSPackage#getEvenement_Lieu()
	 * @see eVMS.Lieu#getEvenements
	 * @model opposite="evenements" required="true"
	 * @generated
	 */
	Lieu getLieu();

	/**
	 * Sets the value of the '{@link eVMS.Evenement#getLieu <em>Lieu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lieu</em>' reference.
	 * @see #getLieu()
	 * @generated
	 */
	void setLieu(Lieu value);

	/**
	 * Returns the value of the '<em><b>Createur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link eVMS.Utilisateur#getEvenementsCrees <em>Evenements Crees</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Createur</em>' reference.
	 * @see #setCreateur(Utilisateur)
	 * @see eVMS.EVMSPackage#getEvenement_Createur()
	 * @see eVMS.Utilisateur#getEvenementsCrees
	 * @model opposite="evenementsCrees" required="true"
	 * @generated
	 */
	Utilisateur getCreateur();

	/**
	 * Sets the value of the '{@link eVMS.Evenement#getCreateur <em>Createur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Createur</em>' reference.
	 * @see #getCreateur()
	 * @generated
	 */
	void setCreateur(Utilisateur value);

	/**
	 * Returns the value of the '<em><b>Inscriptions</b></em>' reference list.
	 * The list contents are of type {@link eVMS.Inscription}.
	 * It is bidirectional and its opposite is '{@link eVMS.Inscription#getEvenement <em>Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inscriptions</em>' reference list.
	 * @see eVMS.EVMSPackage#getEvenement_Inscriptions()
	 * @see eVMS.Inscription#getEvenement
	 * @model opposite="evenement"
	 * @generated
	 */
	EList<Inscription> getInscriptions();

	/**
	 * Returns the value of the '<em><b>Notifications</b></em>' reference list.
	 * The list contents are of type {@link eVMS.Notification}.
	 * It is bidirectional and its opposite is '{@link eVMS.Notification#getEvenement <em>Evenement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notifications</em>' reference list.
	 * @see eVMS.EVMSPackage#getEvenement_Notifications()
	 * @see eVMS.Notification#getEvenement
	 * @model opposite="evenement"
	 * @generated
	 */
	EList<Notification> getNotifications();

} // Evenement
