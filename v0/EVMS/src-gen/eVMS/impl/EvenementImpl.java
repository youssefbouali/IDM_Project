/**
 */
package eVMS.impl;

import eVMS.EVMSPackage;
import eVMS.Evenement;
import eVMS.Inscription;
import eVMS.Lieu;
import eVMS.Notification;
import eVMS.Utilisateur;

import java.util.Collection;
import java.util.Date;

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
 * An implementation of the model object '<em><b>Evenement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eVMS.impl.EvenementImpl#getId <em>Id</em>}</li>
 *   <li>{@link eVMS.impl.EvenementImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link eVMS.impl.EvenementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link eVMS.impl.EvenementImpl#getDateDebut <em>Date Debut</em>}</li>
 *   <li>{@link eVMS.impl.EvenementImpl#getDateFin <em>Date Fin</em>}</li>
 *   <li>{@link eVMS.impl.EvenementImpl#getLieu <em>Lieu</em>}</li>
 *   <li>{@link eVMS.impl.EvenementImpl#getCreateur <em>Createur</em>}</li>
 *   <li>{@link eVMS.impl.EvenementImpl#getInscriptions <em>Inscriptions</em>}</li>
 *   <li>{@link eVMS.impl.EvenementImpl#getNotifications <em>Notifications</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvenementImpl extends MinimalEObjectImpl.Container implements Evenement {
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
	 * The default value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected static final String TITRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected String titre = TITRE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_DEBUT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateDebut() <em>Date Debut</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateDebut()
	 * @generated
	 * @ordered
	 */
	protected Date dateDebut = DATE_DEBUT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_FIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateFin() <em>Date Fin</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateFin()
	 * @generated
	 * @ordered
	 */
	protected Date dateFin = DATE_FIN_EDEFAULT;

	/**
	 * The cached value of the '{@link #getLieu() <em>Lieu</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieu()
	 * @generated
	 * @ordered
	 */
	protected Lieu lieu;

	/**
	 * The cached value of the '{@link #getCreateur() <em>Createur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateur()
	 * @generated
	 * @ordered
	 */
	protected Utilisateur createur;

	/**
	 * The cached value of the '{@link #getInscriptions() <em>Inscriptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInscriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<Inscription> inscriptions;

	/**
	 * The cached value of the '{@link #getNotifications() <em>Notifications</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotifications()
	 * @generated
	 * @ordered
	 */
	protected EList<Notification> notifications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvenementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EVMSPackage.Literals.EVENEMENT;
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
					EVMSPackage.EVENEMENT__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitre() {
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitre(String newTitre) {
		String oldTitre = titre;
		titre = newTitre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.EVENEMENT__TITRE, oldTitre, titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.EVENEMENT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateDebut() {
		return dateDebut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateDebut(Date newDateDebut) {
		Date oldDateDebut = dateDebut;
		dateDebut = newDateDebut;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.EVENEMENT__DATE_DEBUT, oldDateDebut, dateDebut));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDateFin() {
		return dateFin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDateFin(Date newDateFin) {
		Date oldDateFin = dateFin;
		dateFin = newDateFin;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.EVENEMENT__DATE_FIN, oldDateFin, dateFin));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Lieu getLieu() {
		if (lieu != null && lieu.eIsProxy()) {
			InternalEObject oldLieu = (InternalEObject) lieu;
			lieu = (Lieu) eResolveProxy(oldLieu);
			if (lieu != oldLieu) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.RESOLVE,
							EVMSPackage.EVENEMENT__LIEU, oldLieu, lieu));
			}
		}
		return lieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lieu basicGetLieu() {
		return lieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLieu(Lieu newLieu, NotificationChain msgs) {
		Lieu oldLieu = lieu;
		lieu = newLieu;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.EVENEMENT__LIEU, oldLieu, newLieu);
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
	public void setLieu(Lieu newLieu) {
		if (newLieu != lieu) {
			NotificationChain msgs = null;
			if (lieu != null)
				msgs = ((InternalEObject) lieu).eInverseRemove(this, EVMSPackage.LIEU__EVENEMENTS, Lieu.class, msgs);
			if (newLieu != null)
				msgs = ((InternalEObject) newLieu).eInverseAdd(this, EVMSPackage.LIEU__EVENEMENTS, Lieu.class, msgs);
			msgs = basicSetLieu(newLieu, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.EVENEMENT__LIEU, newLieu, newLieu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Utilisateur getCreateur() {
		if (createur != null && createur.eIsProxy()) {
			InternalEObject oldCreateur = (InternalEObject) createur;
			createur = (Utilisateur) eResolveProxy(oldCreateur);
			if (createur != oldCreateur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.RESOLVE,
							EVMSPackage.EVENEMENT__CREATEUR, oldCreateur, createur));
			}
		}
		return createur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utilisateur basicGetCreateur() {
		return createur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateur(Utilisateur newCreateur, NotificationChain msgs) {
		Utilisateur oldCreateur = createur;
		createur = newCreateur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.EVENEMENT__CREATEUR, oldCreateur, newCreateur);
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
	public void setCreateur(Utilisateur newCreateur) {
		if (newCreateur != createur) {
			NotificationChain msgs = null;
			if (createur != null)
				msgs = ((InternalEObject) createur).eInverseRemove(this, EVMSPackage.UTILISATEUR__EVENEMENTS_CREES,
						Utilisateur.class, msgs);
			if (newCreateur != null)
				msgs = ((InternalEObject) newCreateur).eInverseAdd(this, EVMSPackage.UTILISATEUR__EVENEMENTS_CREES,
						Utilisateur.class, msgs);
			msgs = basicSetCreateur(newCreateur, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.EVENEMENT__CREATEUR, newCreateur, newCreateur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Inscription> getInscriptions() {
		if (inscriptions == null) {
			inscriptions = new EObjectWithInverseResolvingEList<Inscription>(Inscription.class, this,
					EVMSPackage.EVENEMENT__INSCRIPTIONS, EVMSPackage.INSCRIPTION__EVENEMENT);
		}
		return inscriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Notification> getNotifications() {
		if (notifications == null) {
			notifications = new EObjectWithInverseResolvingEList<Notification>(Notification.class, this,
					EVMSPackage.EVENEMENT__NOTIFICATIONS, EVMSPackage.NOTIFICATION__EVENEMENT);
		}
		return notifications;
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
		case EVMSPackage.EVENEMENT__LIEU:
			if (lieu != null)
				msgs = ((InternalEObject) lieu).eInverseRemove(this, EVMSPackage.LIEU__EVENEMENTS, Lieu.class, msgs);
			return basicSetLieu((Lieu) otherEnd, msgs);
		case EVMSPackage.EVENEMENT__CREATEUR:
			if (createur != null)
				msgs = ((InternalEObject) createur).eInverseRemove(this, EVMSPackage.UTILISATEUR__EVENEMENTS_CREES,
						Utilisateur.class, msgs);
			return basicSetCreateur((Utilisateur) otherEnd, msgs);
		case EVMSPackage.EVENEMENT__INSCRIPTIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInscriptions()).basicAdd(otherEnd, msgs);
		case EVMSPackage.EVENEMENT__NOTIFICATIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNotifications()).basicAdd(otherEnd, msgs);
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
		case EVMSPackage.EVENEMENT__LIEU:
			return basicSetLieu(null, msgs);
		case EVMSPackage.EVENEMENT__CREATEUR:
			return basicSetCreateur(null, msgs);
		case EVMSPackage.EVENEMENT__INSCRIPTIONS:
			return ((InternalEList<?>) getInscriptions()).basicRemove(otherEnd, msgs);
		case EVMSPackage.EVENEMENT__NOTIFICATIONS:
			return ((InternalEList<?>) getNotifications()).basicRemove(otherEnd, msgs);
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
		case EVMSPackage.EVENEMENT__ID:
			return getId();
		case EVMSPackage.EVENEMENT__TITRE:
			return getTitre();
		case EVMSPackage.EVENEMENT__DESCRIPTION:
			return getDescription();
		case EVMSPackage.EVENEMENT__DATE_DEBUT:
			return getDateDebut();
		case EVMSPackage.EVENEMENT__DATE_FIN:
			return getDateFin();
		case EVMSPackage.EVENEMENT__LIEU:
			if (resolve)
				return getLieu();
			return basicGetLieu();
		case EVMSPackage.EVENEMENT__CREATEUR:
			if (resolve)
				return getCreateur();
			return basicGetCreateur();
		case EVMSPackage.EVENEMENT__INSCRIPTIONS:
			return getInscriptions();
		case EVMSPackage.EVENEMENT__NOTIFICATIONS:
			return getNotifications();
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
		case EVMSPackage.EVENEMENT__ID:
			setId((Integer) newValue);
			return;
		case EVMSPackage.EVENEMENT__TITRE:
			setTitre((String) newValue);
			return;
		case EVMSPackage.EVENEMENT__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case EVMSPackage.EVENEMENT__DATE_DEBUT:
			setDateDebut((Date) newValue);
			return;
		case EVMSPackage.EVENEMENT__DATE_FIN:
			setDateFin((Date) newValue);
			return;
		case EVMSPackage.EVENEMENT__LIEU:
			setLieu((Lieu) newValue);
			return;
		case EVMSPackage.EVENEMENT__CREATEUR:
			setCreateur((Utilisateur) newValue);
			return;
		case EVMSPackage.EVENEMENT__INSCRIPTIONS:
			getInscriptions().clear();
			getInscriptions().addAll((Collection<? extends Inscription>) newValue);
			return;
		case EVMSPackage.EVENEMENT__NOTIFICATIONS:
			getNotifications().clear();
			getNotifications().addAll((Collection<? extends Notification>) newValue);
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
		case EVMSPackage.EVENEMENT__ID:
			setId(ID_EDEFAULT);
			return;
		case EVMSPackage.EVENEMENT__TITRE:
			setTitre(TITRE_EDEFAULT);
			return;
		case EVMSPackage.EVENEMENT__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case EVMSPackage.EVENEMENT__DATE_DEBUT:
			setDateDebut(DATE_DEBUT_EDEFAULT);
			return;
		case EVMSPackage.EVENEMENT__DATE_FIN:
			setDateFin(DATE_FIN_EDEFAULT);
			return;
		case EVMSPackage.EVENEMENT__LIEU:
			setLieu((Lieu) null);
			return;
		case EVMSPackage.EVENEMENT__CREATEUR:
			setCreateur((Utilisateur) null);
			return;
		case EVMSPackage.EVENEMENT__INSCRIPTIONS:
			getInscriptions().clear();
			return;
		case EVMSPackage.EVENEMENT__NOTIFICATIONS:
			getNotifications().clear();
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
		case EVMSPackage.EVENEMENT__ID:
			return id != ID_EDEFAULT;
		case EVMSPackage.EVENEMENT__TITRE:
			return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
		case EVMSPackage.EVENEMENT__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case EVMSPackage.EVENEMENT__DATE_DEBUT:
			return DATE_DEBUT_EDEFAULT == null ? dateDebut != null : !DATE_DEBUT_EDEFAULT.equals(dateDebut);
		case EVMSPackage.EVENEMENT__DATE_FIN:
			return DATE_FIN_EDEFAULT == null ? dateFin != null : !DATE_FIN_EDEFAULT.equals(dateFin);
		case EVMSPackage.EVENEMENT__LIEU:
			return lieu != null;
		case EVMSPackage.EVENEMENT__CREATEUR:
			return createur != null;
		case EVMSPackage.EVENEMENT__INSCRIPTIONS:
			return inscriptions != null && !inscriptions.isEmpty();
		case EVMSPackage.EVENEMENT__NOTIFICATIONS:
			return notifications != null && !notifications.isEmpty();
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
		result.append(", titre: ");
		result.append(titre);
		result.append(", description: ");
		result.append(description);
		result.append(", dateDebut: ");
		result.append(dateDebut);
		result.append(", dateFin: ");
		result.append(dateFin);
		result.append(')');
		return result.toString();
	}

} //EvenementImpl
