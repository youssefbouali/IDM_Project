/**
 */
package eVMS.impl;

import eVMS.EVMSPackage;
import eVMS.Evenement;
import eVMS.Inscription;
import eVMS.Notification;
import eVMS.Utilisateur;

import java.util.Collection;

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
 * An implementation of the model object '<em><b>Utilisateur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eVMS.impl.UtilisateurImpl#getId <em>Id</em>}</li>
 *   <li>{@link eVMS.impl.UtilisateurImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link eVMS.impl.UtilisateurImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link eVMS.impl.UtilisateurImpl#getMotDePasse <em>Mot De Passe</em>}</li>
 *   <li>{@link eVMS.impl.UtilisateurImpl#getRole <em>Role</em>}</li>
 *   <li>{@link eVMS.impl.UtilisateurImpl#getInscriptions <em>Inscriptions</em>}</li>
 *   <li>{@link eVMS.impl.UtilisateurImpl#getNotificationsRecues <em>Notifications Recues</em>}</li>
 *   <li>{@link eVMS.impl.UtilisateurImpl#getEvenementsCrees <em>Evenements Crees</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UtilisateurImpl extends MinimalEObjectImpl.Container implements Utilisateur {
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
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMotDePasse() <em>Mot De Passe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotDePasse()
	 * @generated
	 * @ordered
	 */
	protected static final String MOT_DE_PASSE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMotDePasse() <em>Mot De Passe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMotDePasse()
	 * @generated
	 * @ordered
	 */
	protected String motDePasse = MOT_DE_PASSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected String role = ROLE_EDEFAULT;

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
	 * The cached value of the '{@link #getNotificationsRecues() <em>Notifications Recues</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotificationsRecues()
	 * @generated
	 * @ordered
	 */
	protected EList<Notification> notificationsRecues;

	/**
	 * The cached value of the '{@link #getEvenementsCrees() <em>Evenements Crees</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvenementsCrees()
	 * @generated
	 * @ordered
	 */
	protected EList<Evenement> evenementsCrees;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UtilisateurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EVMSPackage.Literals.UTILISATEUR;
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
					EVMSPackage.UTILISATEUR__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.UTILISATEUR__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.UTILISATEUR__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMotDePasse(String newMotDePasse) {
		String oldMotDePasse = motDePasse;
		motDePasse = newMotDePasse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.UTILISATEUR__MOT_DE_PASSE, oldMotDePasse, motDePasse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRole() {
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRole(String newRole) {
		String oldRole = role;
		role = newRole;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, org.eclipse.emf.common.notify.Notification.SET,
					EVMSPackage.UTILISATEUR__ROLE, oldRole, role));
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
					EVMSPackage.UTILISATEUR__INSCRIPTIONS, EVMSPackage.INSCRIPTION__UTILISATEUR);
		}
		return inscriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Notification> getNotificationsRecues() {
		if (notificationsRecues == null) {
			notificationsRecues = new EObjectWithInverseResolvingEList<Notification>(Notification.class, this,
					EVMSPackage.UTILISATEUR__NOTIFICATIONS_RECUES, EVMSPackage.NOTIFICATION__UTILISATEUR);
		}
		return notificationsRecues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Evenement> getEvenementsCrees() {
		if (evenementsCrees == null) {
			evenementsCrees = new EObjectWithInverseResolvingEList<Evenement>(Evenement.class, this,
					EVMSPackage.UTILISATEUR__EVENEMENTS_CREES, EVMSPackage.EVENEMENT__CREATEUR);
		}
		return evenementsCrees;
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
		case EVMSPackage.UTILISATEUR__INSCRIPTIONS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getInscriptions()).basicAdd(otherEnd, msgs);
		case EVMSPackage.UTILISATEUR__NOTIFICATIONS_RECUES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getNotificationsRecues()).basicAdd(otherEnd,
					msgs);
		case EVMSPackage.UTILISATEUR__EVENEMENTS_CREES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getEvenementsCrees()).basicAdd(otherEnd, msgs);
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
		case EVMSPackage.UTILISATEUR__INSCRIPTIONS:
			return ((InternalEList<?>) getInscriptions()).basicRemove(otherEnd, msgs);
		case EVMSPackage.UTILISATEUR__NOTIFICATIONS_RECUES:
			return ((InternalEList<?>) getNotificationsRecues()).basicRemove(otherEnd, msgs);
		case EVMSPackage.UTILISATEUR__EVENEMENTS_CREES:
			return ((InternalEList<?>) getEvenementsCrees()).basicRemove(otherEnd, msgs);
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
		case EVMSPackage.UTILISATEUR__ID:
			return getId();
		case EVMSPackage.UTILISATEUR__NOM:
			return getNom();
		case EVMSPackage.UTILISATEUR__EMAIL:
			return getEmail();
		case EVMSPackage.UTILISATEUR__MOT_DE_PASSE:
			return getMotDePasse();
		case EVMSPackage.UTILISATEUR__ROLE:
			return getRole();
		case EVMSPackage.UTILISATEUR__INSCRIPTIONS:
			return getInscriptions();
		case EVMSPackage.UTILISATEUR__NOTIFICATIONS_RECUES:
			return getNotificationsRecues();
		case EVMSPackage.UTILISATEUR__EVENEMENTS_CREES:
			return getEvenementsCrees();
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
		case EVMSPackage.UTILISATEUR__ID:
			setId((Integer) newValue);
			return;
		case EVMSPackage.UTILISATEUR__NOM:
			setNom((String) newValue);
			return;
		case EVMSPackage.UTILISATEUR__EMAIL:
			setEmail((String) newValue);
			return;
		case EVMSPackage.UTILISATEUR__MOT_DE_PASSE:
			setMotDePasse((String) newValue);
			return;
		case EVMSPackage.UTILISATEUR__ROLE:
			setRole((String) newValue);
			return;
		case EVMSPackage.UTILISATEUR__INSCRIPTIONS:
			getInscriptions().clear();
			getInscriptions().addAll((Collection<? extends Inscription>) newValue);
			return;
		case EVMSPackage.UTILISATEUR__NOTIFICATIONS_RECUES:
			getNotificationsRecues().clear();
			getNotificationsRecues().addAll((Collection<? extends Notification>) newValue);
			return;
		case EVMSPackage.UTILISATEUR__EVENEMENTS_CREES:
			getEvenementsCrees().clear();
			getEvenementsCrees().addAll((Collection<? extends Evenement>) newValue);
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
		case EVMSPackage.UTILISATEUR__ID:
			setId(ID_EDEFAULT);
			return;
		case EVMSPackage.UTILISATEUR__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case EVMSPackage.UTILISATEUR__EMAIL:
			setEmail(EMAIL_EDEFAULT);
			return;
		case EVMSPackage.UTILISATEUR__MOT_DE_PASSE:
			setMotDePasse(MOT_DE_PASSE_EDEFAULT);
			return;
		case EVMSPackage.UTILISATEUR__ROLE:
			setRole(ROLE_EDEFAULT);
			return;
		case EVMSPackage.UTILISATEUR__INSCRIPTIONS:
			getInscriptions().clear();
			return;
		case EVMSPackage.UTILISATEUR__NOTIFICATIONS_RECUES:
			getNotificationsRecues().clear();
			return;
		case EVMSPackage.UTILISATEUR__EVENEMENTS_CREES:
			getEvenementsCrees().clear();
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
		case EVMSPackage.UTILISATEUR__ID:
			return id != ID_EDEFAULT;
		case EVMSPackage.UTILISATEUR__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case EVMSPackage.UTILISATEUR__EMAIL:
			return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
		case EVMSPackage.UTILISATEUR__MOT_DE_PASSE:
			return MOT_DE_PASSE_EDEFAULT == null ? motDePasse != null : !MOT_DE_PASSE_EDEFAULT.equals(motDePasse);
		case EVMSPackage.UTILISATEUR__ROLE:
			return ROLE_EDEFAULT == null ? role != null : !ROLE_EDEFAULT.equals(role);
		case EVMSPackage.UTILISATEUR__INSCRIPTIONS:
			return inscriptions != null && !inscriptions.isEmpty();
		case EVMSPackage.UTILISATEUR__NOTIFICATIONS_RECUES:
			return notificationsRecues != null && !notificationsRecues.isEmpty();
		case EVMSPackage.UTILISATEUR__EVENEMENTS_CREES:
			return evenementsCrees != null && !evenementsCrees.isEmpty();
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
		result.append(", email: ");
		result.append(email);
		result.append(", motDePasse: ");
		result.append(motDePasse);
		result.append(", role: ");
		result.append(role);
		result.append(')');
		return result.toString();
	}

} //UtilisateurImpl
