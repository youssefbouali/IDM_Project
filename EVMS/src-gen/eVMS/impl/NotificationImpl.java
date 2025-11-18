/**
 */
package eVMS.impl;

import eVMS.EVMSPackage;
import eVMS.Evenement;
import eVMS.Notification;
import eVMS.Utilisateur;

import java.util.Date;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eVMS.impl.NotificationImpl#getId <em>Id</em>}</li>
 *   <li>{@link eVMS.impl.NotificationImpl#getMessage <em>Message</em>}</li>
 *   <li>{@link eVMS.impl.NotificationImpl#getDateEnvoi <em>Date Envoi</em>}</li>
 *   <li>{@link eVMS.impl.NotificationImpl#getUtilisateur <em>Utilisateur</em>}</li>
 *   <li>{@link eVMS.impl.NotificationImpl#getEvenement <em>Evenement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NotificationImpl extends MinimalEObjectImpl.Container implements Notification {
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
	 * The default value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected String message = MESSAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateEnvoi() <em>Date Envoi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEnvoi()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_ENVOI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateEnvoi() <em>Date Envoi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEnvoi()
	 * @generated
	 * @ordered
	 */
	protected Date dateEnvoi = DATE_ENVOI_EDEFAULT;

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
	protected NotificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EVMSPackage.Literals.NOTIFICATION;
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
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.NOTIFICATION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMessage() {
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMessage(String newMessage) {
		String oldMessage = message;
		message = newMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.NOTIFICATION__MESSAGE, oldMessage, message));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateEnvoi() {
		return dateEnvoi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateEnvoi(Date newDateEnvoi) {
		Date oldDateEnvoi = dateEnvoi;
		dateEnvoi = newDateEnvoi;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.NOTIFICATION__DATE_ENVOI, oldDateEnvoi, dateEnvoi));
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
					eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.RESOLVE,
							EVMSPackage.NOTIFICATION__UTILISATEUR, oldUtilisateur, utilisateur));
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
			ENotificationImpl notification = new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.NOTIFICATION__UTILISATEUR, oldUtilisateur, newUtilisateur);
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
				msgs = ((InternalEObject) utilisateur).eInverseRemove(this,
						EVMSPackage.UTILISATEUR__NOTIFICATIONS_RECUES, Utilisateur.class, msgs);
			if (newUtilisateur != null)
				msgs = ((InternalEObject) newUtilisateur).eInverseAdd(this,
						EVMSPackage.UTILISATEUR__NOTIFICATIONS_RECUES, Utilisateur.class, msgs);
			msgs = basicSetUtilisateur(newUtilisateur, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.NOTIFICATION__UTILISATEUR, newUtilisateur, newUtilisateur));
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
					eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.RESOLVE,
							EVMSPackage.NOTIFICATION__EVENEMENT, oldEvenement, evenement));
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
			ENotificationImpl notification = new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.NOTIFICATION__EVENEMENT, oldEvenement, newEvenement);
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
				msgs = ((InternalEObject) evenement).eInverseRemove(this, EVMSPackage.EVENEMENT__NOTIFICATIONS,
						Evenement.class, msgs);
			if (newEvenement != null)
				msgs = ((InternalEObject) newEvenement).eInverseAdd(this, EVMSPackage.EVENEMENT__NOTIFICATIONS,
						Evenement.class, msgs);
			msgs = basicSetEvenement(newEvenement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.NOTIFICATION__EVENEMENT, newEvenement, newEvenement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case EVMSPackage.NOTIFICATION__UTILISATEUR:
			if (utilisateur != null)
				msgs = ((InternalEObject) utilisateur).eInverseRemove(this,
						EVMSPackage.UTILISATEUR__NOTIFICATIONS_RECUES, Utilisateur.class, msgs);
			return basicSetUtilisateur((Utilisateur) otherEnd, msgs);
		case EVMSPackage.NOTIFICATION__EVENEMENT:
			if (evenement != null)
				msgs = ((InternalEObject) evenement).eInverseRemove(this, EVMSPackage.EVENEMENT__NOTIFICATIONS,
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
		case EVMSPackage.NOTIFICATION__UTILISATEUR:
			return basicSetUtilisateur(null, msgs);
		case EVMSPackage.NOTIFICATION__EVENEMENT:
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
		case EVMSPackage.NOTIFICATION__ID:
			return getId();
		case EVMSPackage.NOTIFICATION__MESSAGE:
			return getMessage();
		case EVMSPackage.NOTIFICATION__DATE_ENVOI:
			return getDateEnvoi();
		case EVMSPackage.NOTIFICATION__UTILISATEUR:
			if (resolve)
				return getUtilisateur();
			return basicGetUtilisateur();
		case EVMSPackage.NOTIFICATION__EVENEMENT:
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
		case EVMSPackage.NOTIFICATION__ID:
			setId((Integer) newValue);
			return;
		case EVMSPackage.NOTIFICATION__MESSAGE:
			setMessage((String) newValue);
			return;
		case EVMSPackage.NOTIFICATION__DATE_ENVOI:
			setDateEnvoi((Date) newValue);
			return;
		case EVMSPackage.NOTIFICATION__UTILISATEUR:
			setUtilisateur((Utilisateur) newValue);
			return;
		case EVMSPackage.NOTIFICATION__EVENEMENT:
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
		case EVMSPackage.NOTIFICATION__ID:
			setId(ID_EDEFAULT);
			return;
		case EVMSPackage.NOTIFICATION__MESSAGE:
			setMessage(MESSAGE_EDEFAULT);
			return;
		case EVMSPackage.NOTIFICATION__DATE_ENVOI:
			setDateEnvoi(DATE_ENVOI_EDEFAULT);
			return;
		case EVMSPackage.NOTIFICATION__UTILISATEUR:
			setUtilisateur((Utilisateur) null);
			return;
		case EVMSPackage.NOTIFICATION__EVENEMENT:
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
		case EVMSPackage.NOTIFICATION__ID:
			return id != ID_EDEFAULT;
		case EVMSPackage.NOTIFICATION__MESSAGE:
			return MESSAGE_EDEFAULT == null ? message != null : !MESSAGE_EDEFAULT.equals(message);
		case EVMSPackage.NOTIFICATION__DATE_ENVOI:
			return DATE_ENVOI_EDEFAULT == null ? dateEnvoi != null : !DATE_ENVOI_EDEFAULT.equals(dateEnvoi);
		case EVMSPackage.NOTIFICATION__UTILISATEUR:
			return utilisateur != null;
		case EVMSPackage.NOTIFICATION__EVENEMENT:
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
		result.append(", message: ");
		result.append(message);
		result.append(", dateEnvoi: ");
		result.append(dateEnvoi);
		result.append(')');
		return result.toString();
	}

} //NotificationImpl
