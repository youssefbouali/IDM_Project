/**
 */
package eVMS;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lieu</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eVMS.Lieu#getId <em>Id</em>}</li>
 *   <li>{@link eVMS.Lieu#getNom <em>Nom</em>}</li>
 *   <li>{@link eVMS.Lieu#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link eVMS.Lieu#getCapacite <em>Capacite</em>}</li>
 *   <li>{@link eVMS.Lieu#getEvenements <em>Evenements</em>}</li>
 * </ul>
 *
 * @see eVMS.EVMSPackage#getLieu()
 * @model
 * @generated
 */
public interface Lieu extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(int)
	 * @see eVMS.EVMSPackage#getLieu_Id()
	 * @model
	 * @generated
	 */
	int getId();

	/**
	 * Sets the value of the '{@link eVMS.Lieu#getId <em>Id</em>}' attribute.
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
	 * @see eVMS.EVMSPackage#getLieu_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link eVMS.Lieu#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Adresse</em>' attribute.
	 * @see #setAdresse(String)
	 * @see eVMS.EVMSPackage#getLieu_Adresse()
	 * @model
	 * @generated
	 */
	String getAdresse();

	/**
	 * Sets the value of the '{@link eVMS.Lieu#getAdresse <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adresse</em>' attribute.
	 * @see #getAdresse()
	 * @generated
	 */
	void setAdresse(String value);

	/**
	 * Returns the value of the '<em><b>Capacite</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacite</em>' attribute.
	 * @see #setCapacite(int)
	 * @see eVMS.EVMSPackage#getLieu_Capacite()
	 * @model
	 * @generated
	 */
	int getCapacite();

	/**
	 * Sets the value of the '{@link eVMS.Lieu#getCapacite <em>Capacite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacite</em>' attribute.
	 * @see #getCapacite()
	 * @generated
	 */
	void setCapacite(int value);

	/**
	 * Returns the value of the '<em><b>Evenements</b></em>' reference list.
	 * The list contents are of type {@link eVMS.Evenement}.
	 * It is bidirectional and its opposite is '{@link eVMS.Evenement#getLieu <em>Lieu</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evenements</em>' reference list.
	 * @see eVMS.EVMSPackage#getLieu_Evenements()
	 * @see eVMS.Evenement#getLieu
	 * @model opposite="lieu"
	 * @generated
	 */
	EList<Evenement> getEvenements();

} // Lieu
