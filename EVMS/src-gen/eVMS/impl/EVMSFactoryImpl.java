/**
 */
package eVMS.impl;

import eVMS.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EVMSFactoryImpl extends EFactoryImpl implements EVMSFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EVMSFactory init() {
		try {
			EVMSFactory theEVMSFactory = (EVMSFactory) EPackage.Registry.INSTANCE.getEFactory(EVMSPackage.eNS_URI);
			if (theEVMSFactory != null) {
				return theEVMSFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new EVMSFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EVMSFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case EVMSPackage.UTILISATEUR:
			return createUtilisateur();
		case EVMSPackage.LIEU:
			return createLieu();
		case EVMSPackage.EVENEMENT:
			return createEvenement();
		case EVMSPackage.INSCRIPTION:
			return createInscription();
		case EVMSPackage.NOTIFICATION:
			return createNotification();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Utilisateur createUtilisateur() {
		UtilisateurImpl utilisateur = new UtilisateurImpl();
		return utilisateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lieu createLieu() {
		LieuImpl lieu = new LieuImpl();
		return lieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evenement createEvenement() {
		EvenementImpl evenement = new EvenementImpl();
		return evenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Inscription createInscription() {
		InscriptionImpl inscription = new InscriptionImpl();
		return inscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Notification createNotification() {
		NotificationImpl notification = new NotificationImpl();
		return notification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EVMSPackage getEVMSPackage() {
		return (EVMSPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static EVMSPackage getPackage() {
		return EVMSPackage.eINSTANCE;
	}

} //EVMSFactoryImpl
