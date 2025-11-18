/**
 */
package eVMS.impl;

import eVMS.EVMSPackage;
import eVMS.Evenement;
import eVMS.Inscription;
import eVMS.Utilisateur;

import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Inscription</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eVMS.impl.InscriptionImpl#getId <em>Id</em>}</li>
 *   <li>{@link eVMS.impl.InscriptionImpl#getDateInscription <em>Date Inscription</em>}</li>
 *   <li>{@link eVMS.impl.InscriptionImpl#getStatut <em>Statut</em>}</li>
 *   <li>{@link eVMS.impl.InscriptionImpl#getUtilisateur <em>Utilisateur</em>}</li>
 *   <li>{@link eVMS.impl.InscriptionImpl#getEvenement <em>Evenement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InscriptionImpl extends MinimalEObjectImpl.Container implements Inscription {
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
	 * The default value of the '{@link #getDateInscription() <em>Date Inscription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateInscription()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_INSCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateInscription() <em>Date Inscription</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateInscription()
	 * @generated
	 * @ordered
	 */
	protected Date dateInscription = DATE_INSCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatut() <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatut()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatut() <em>Statut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatut()
	 * @generated
	 * @ordered
	 */
	protected String statut = STATUT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUtilisateur() <em>Utilisateur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilisateur()
	 * @generated
	 * @ordered
	 */
	protected Utilisateur utilisateur;

	/**
	 * The cached value of the '{@link #getEvenement() <em>Evenement</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvenement()
	 * @generated
	 * @ordered
	 */
	protected Evenement evenement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InscriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EVMSPackage.Literals.INSCRIPTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, EVMSPackage.INSCRIPTION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateInscription() {
		return dateInscription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateInscription(Date newDateInscription) {
		Date oldDateInscription = dateInscription;
		dateInscription = newDateInscription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EVMSPackage.INSCRIPTION__DATE_INSCRIPTION,
					oldDateInscription, dateInscription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStatut() {
		return statut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStatut(String newStatut) {
		String oldStatut = statut;
		statut = newStatut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EVMSPackage.INSCRIPTION__STATUT, oldStatut, statut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Utilisateur getUtilisateur() {
		if (utilisateur != null && utilisateur.eIsProxy()) {
			InternalEObject oldUtilisateur = (InternalEObject) utilisateur;
			utilisateur = (Utilisateur) eResolveProxy(oldUtilisateur);
			if (utilisateur != oldUtilisateur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EVMSPackage.INSCRIPTION__UTILISATEUR,
							oldUtilisateur, utilisateur));
			}
		}
		return utilisateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utilisateur basicGetUtilisateur() {
		return utilisateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUtilisateur(Utilisateur newUtilisateur, NotificationChain msgs) {
		Utilisateur oldUtilisateur = utilisateur;
		utilisateur = newUtilisateur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EVMSPackage.INSCRIPTION__UTILISATEUR, oldUtilisateur, newUtilisateur);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUtilisateur(Utilisateur newUtilisateur) {
		if (newUtilisateur != utilisateur) {
			NotificationChain msgs = null;
			if (utilisateur != null)
				msgs = ((InternalEObject) utilisateur).eInverseRemove(this, EVMSPackage.UTILISATEUR__INSCRIPTIONS,
						Utilisateur.class, msgs);
			if (newUtilisateur != null)
				msgs = ((InternalEObject) newUtilisateur).eInverseAdd(this, EVMSPackage.UTILISATEUR__INSCRIPTIONS,
						Utilisateur.class, msgs);
			msgs = basicSetUtilisateur(newUtilisateur, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EVMSPackage.INSCRIPTION__UTILISATEUR, newUtilisateur,
					newUtilisateur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Evenement getEvenement() {
		if (evenement != null && evenement.eIsProxy()) {
			InternalEObject oldEvenement = (InternalEObject) evenement;
			evenement = (Evenement) eResolveProxy(oldEvenement);
			if (evenement != oldEvenement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EVMSPackage.INSCRIPTION__EVENEMENT,
							oldEvenement, evenement));
			}
		}
		return evenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Evenement basicGetEvenement() {
		return evenement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvenement(Evenement newEvenement, NotificationChain msgs) {
		Evenement oldEvenement = evenement;
		evenement = newEvenement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					EVMSPackage.INSCRIPTION__EVENEMENT, oldEvenement, newEvenement);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEvenement(Evenement newEvenement) {
		if (newEvenement != evenement) {
			NotificationChain msgs = null;
			if (evenement != null)
				msgs = ((InternalEObject) evenement).eInverseRemove(this, EVMSPackage.EVENEMENT__INSCRIPTIONS,
						Evenement.class, msgs);
			if (newEvenement != null)
				msgs = ((InternalEObject) newEvenement).eInverseAdd(this, EVMSPackage.EVENEMENT__INSCRIPTIONS,
						Evenement.class, msgs);
			msgs = basicSetEvenement(newEvenement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EVMSPackage.INSCRIPTION__EVENEMENT, newEvenement,
					newEvenement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EVMSPackage.INSCRIPTION__UTILISATEUR:
			if (utilisateur != null)
				msgs = ((InternalEObject) utilisateur).eInverseRemove(this, EVMSPackage.UTILISATEUR__INSCRIPTIONS,
						Utilisateur.class, msgs);
			return basicSetUtilisateur((Utilisateur) otherEnd, msgs);
		case EVMSPackage.INSCRIPTION__EVENEMENT:
			if (evenement != null)
				msgs = ((InternalEObject) evenement).eInverseRemove(this, EVMSPackage.EVENEMENT__INSCRIPTIONS,
						Evenement.class, msgs);
			return basicSetEvenement((Evenement) otherEnd, msgs);
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
		case EVMSPackage.INSCRIPTION__UTILISATEUR:
			return basicSetUtilisateur(null, msgs);
		case EVMSPackage.INSCRIPTION__EVENEMENT:
			return basicSetEvenement(null, msgs);
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
		case EVMSPackage.INSCRIPTION__ID:
			return getId();
		case EVMSPackage.INSCRIPTION__DATE_INSCRIPTION:
			return getDateInscription();
		case EVMSPackage.INSCRIPTION__STATUT:
			return getStatut();
		case EVMSPackage.INSCRIPTION__UTILISATEUR:
			if (resolve)
				return getUtilisateur();
			return basicGetUtilisateur();
		case EVMSPackage.INSCRIPTION__EVENEMENT:
			if (resolve)
				return getEvenement();
			return basicGetEvenement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case EVMSPackage.INSCRIPTION__ID:
			setId((Integer) newValue);
			return;
		case EVMSPackage.INSCRIPTION__DATE_INSCRIPTION:
			setDateInscription((Date) newValue);
			return;
		case EVMSPackage.INSCRIPTION__STATUT:
			setStatut((String) newValue);
			return;
		case EVMSPackage.INSCRIPTION__UTILISATEUR:
			setUtilisateur((Utilisateur) newValue);
			return;
		case EVMSPackage.INSCRIPTION__EVENEMENT:
			setEvenement((Evenement) newValue);
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
		case EVMSPackage.INSCRIPTION__ID:
			setId(ID_EDEFAULT);
			return;
		case EVMSPackage.INSCRIPTION__DATE_INSCRIPTION:
			setDateInscription(DATE_INSCRIPTION_EDEFAULT);
			return;
		case EVMSPackage.INSCRIPTION__STATUT:
			setStatut(STATUT_EDEFAULT);
			return;
		case EVMSPackage.INSCRIPTION__UTILISATEUR:
			setUtilisateur((Utilisateur) null);
			return;
		case EVMSPackage.INSCRIPTION__EVENEMENT:
			setEvenement((Evenement) null);
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
		case EVMSPackage.INSCRIPTION__ID:
			return id != ID_EDEFAULT;
		case EVMSPackage.INSCRIPTION__DATE_INSCRIPTION:
			return DATE_INSCRIPTION_EDEFAULT == null ? dateInscription != null
					: !DATE_INSCRIPTION_EDEFAULT.equals(dateInscription);
		case EVMSPackage.INSCRIPTION__STATUT:
			return STATUT_EDEFAULT == null ? statut != null : !STATUT_EDEFAULT.equals(statut);
		case EVMSPackage.INSCRIPTION__UTILISATEUR:
			return utilisateur != null;
		case EVMSPackage.INSCRIPTION__EVENEMENT:
			return evenement != null;
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
		result.append(", dateInscription: ");
		result.append(dateInscription);
		result.append(", statut: ");
		result.append(statut);
		result.append(')');
		return result.toString();
	}

} //InscriptionImpl
