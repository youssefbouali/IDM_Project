/**
 */
package eVMS.impl;

import eVMS.EVMSPackage;
import eVMS.Evenement;
import eVMS.Lieu;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Lieu</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eVMS.impl.LieuImpl#getId <em>Id</em>}</li>
 *   <li>{@link eVMS.impl.LieuImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link eVMS.impl.LieuImpl#getAdresse <em>Adresse</em>}</li>
 *   <li>{@link eVMS.impl.LieuImpl#getCapacite <em>Capacite</em>}</li>
 *   <li>{@link eVMS.impl.LieuImpl#getEvenements <em>Evenements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LieuImpl extends MinimalEObjectImpl.Container implements Lieu {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected static final String ADRESSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdresse() <em>Adresse</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdresse()
	 * @generated
	 * @ordered
	 */
	protected String adresse = ADRESSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapacite() <em>Capacite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacite()
	 * @generated
	 * @ordered
	 */
	protected static final int CAPACITE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCapacite() <em>Capacite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacite()
	 * @generated
	 * @ordered
	 */
	protected int capacite = CAPACITE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEvenements() <em>Evenements</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvenements()
	 * @generated
	 * @ordered
	 */
	protected EList<Evenement> evenements;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LieuImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EVMSPackage.Literals.LIEU;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EVMSPackage.LIEU__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EVMSPackage.LIEU__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getAdresse() {
		return adresse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdresse(String newAdresse) {
		String oldAdresse = adresse;
		adresse = newAdresse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EVMSPackage.LIEU__ADRESSE, oldAdresse, adresse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getCapacite() {
		return capacite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCapacite(int newCapacite) {
		int oldCapacite = capacite;
		capacite = newCapacite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EVMSPackage.LIEU__CAPACITE, oldCapacite, capacite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Evenement> getEvenements() {
		if (evenements == null) {
			evenements = new EObjectWithInverseResolvingEList<Evenement>(Evenement.class, this,
					EVMSPackage.LIEU__EVENEMENTS, EVMSPackage.EVENEMENT__LIEU);
		}
		return evenements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EVMSPackage.LIEU__EVENEMENTS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEvenements()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EVMSPackage.LIEU__EVENEMENTS:
			return ((InternalEList<?>) getEvenements()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case EVMSPackage.LIEU__ID:
			return getId();
		case EVMSPackage.LIEU__NOM:
			return getNom();
		case EVMSPackage.LIEU__ADRESSE:
			return getAdresse();
		case EVMSPackage.LIEU__CAPACITE:
			return getCapacite();
		case EVMSPackage.LIEU__EVENEMENTS:
			return getEvenements();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EVMSPackage.LIEU__ID:
			setId((Integer) newValue);
			return;
		case EVMSPackage.LIEU__NOM:
			setNom((String) newValue);
			return;
		case EVMSPackage.LIEU__ADRESSE:
			setAdresse((String) newValue);
			return;
		case EVMSPackage.LIEU__CAPACITE:
			setCapacite((Integer) newValue);
			return;
		case EVMSPackage.LIEU__EVENEMENTS:
			getEvenements().clear();
			getEvenements().addAll((Collection<? extends Evenement>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case EVMSPackage.LIEU__ID:
			setId(ID_EDEFAULT);
			return;
		case EVMSPackage.LIEU__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case EVMSPackage.LIEU__ADRESSE:
			setAdresse(ADRESSE_EDEFAULT);
			return;
		case EVMSPackage.LIEU__CAPACITE:
			setCapacite(CAPACITE_EDEFAULT);
			return;
		case EVMSPackage.LIEU__EVENEMENTS:
			getEvenements().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case EVMSPackage.LIEU__ID:
			return id != ID_EDEFAULT;
		case EVMSPackage.LIEU__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case EVMSPackage.LIEU__ADRESSE:
			return ADRESSE_EDEFAULT == null ? adresse != null : !ADRESSE_EDEFAULT.equals(adresse);
		case EVMSPackage.LIEU__CAPACITE:
			return capacite != CAPACITE_EDEFAULT;
		case EVMSPackage.LIEU__EVENEMENTS:
			return evenements != null && !evenements.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", nom: ");
		result.append(nom);
		result.append(", adresse: ");
		result.append(adresse);
		result.append(", capacite: ");
		result.append(capacite);
		result.append(')');
		return result.toString();
	}

} //LieuImpl
