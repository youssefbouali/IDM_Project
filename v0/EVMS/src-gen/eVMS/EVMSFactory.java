/**
 */
package eVMS;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see eVMS.EVMSPackage
 * @generated
 */
public interface EVMSFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	EVMSFactory eINSTANCE = eVMS.impl.EVMSFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Utilisateur</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Utilisateur</em>'.
	 * @generated
	 */
	Utilisateur createUtilisateur();

	/**
	 * Returns a new object of class '<em>Lieu</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Lieu</em>'.
	 * @generated
	 */
	Lieu createLieu();

	/**
	 * Returns a new object of class '<em>Evenement</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Evenement</em>'.
	 * @generated
	 */
	Evenement createEvenement();

	/**
	 * Returns a new object of class '<em>Inscription</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Inscription</em>'.
	 * @generated
	 */
	Inscription createInscription();

	/**
	 * Returns a new object of class '<em>Notification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Notification</em>'.
	 * @generated
	 */
	Notification createNotification();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	EVMSPackage getEVMSPackage();

} //EVMSFactory
