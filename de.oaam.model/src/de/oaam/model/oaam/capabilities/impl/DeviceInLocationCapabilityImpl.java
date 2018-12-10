/**
 */
package de.oaam.model.oaam.capabilities.impl;

import de.oaam.model.oaam.capabilities.CapabilitiesPackage;
import de.oaam.model.oaam.capabilities.DeviceInLocationCapability;

import de.oaam.model.oaam.common.AttributeA;
import de.oaam.model.oaam.common.CommonPackage;
import de.oaam.model.oaam.common.OaamBaseElementA;

import de.oaam.model.oaam.library.DeviceType;
import de.oaam.model.oaam.library.LocationType;

import de.oaam.model.oaam.scenario.ModeDependentElementA;
import de.oaam.model.oaam.scenario.OperationModeReference;
import de.oaam.model.oaam.scenario.ScenarioPackage;
import de.oaam.model.oaam.scenario.Variant;
import de.oaam.model.oaam.scenario.VariantDependentElementA;

import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Device In Location Capability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl#getId <em>Id</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl#getName <em>Name</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl#getModified <em>Modified</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl#getModifier <em>Modifier</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl#getTraceLink <em>Trace Link</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl#getVariants <em>Variants</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl#getOperationModes <em>Operation Modes</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl#getDeviceType <em>Device Type</em>}</li>
 *   <li>{@link de.oaam.model.oaam.capabilities.impl.DeviceInLocationCapabilityImpl#getLocationType <em>Location Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeviceInLocationCapabilityImpl extends CapabilityAImpl implements DeviceInLocationCapability {
	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyle()
	 * @generated
	 * @ordered
	 */
	protected String style = STYLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeA> attributes;

	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected static final Date MODIFIED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModified() <em>Modified</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModified()
	 * @generated
	 * @ordered
	 */
	protected Date modified = MODIFIED_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected static final String MODIFIER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModifier() <em>Modifier</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifier()
	 * @generated
	 * @ordered
	 */
	protected String modifier = MODIFIER_EDEFAULT;

	/**
	 * The default value of the '{@link #getTraceLink() <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLink()
	 * @generated
	 * @ordered
	 */
	protected static final String TRACE_LINK_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getTraceLink() <em>Trace Link</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTraceLink()
	 * @generated
	 * @ordered
	 */
	protected String traceLink = TRACE_LINK_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariants() <em>Variants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariants()
	 * @generated
	 * @ordered
	 */
	protected EList<Variant> variants;

	/**
	 * The cached value of the '{@link #getOperationModes() <em>Operation Modes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperationModes()
	 * @generated
	 * @ordered
	 */
	protected EList<OperationModeReference> operationModes;

	/**
	 * The cached value of the '{@link #getDeviceType() <em>Device Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeviceType()
	 * @generated
	 * @ordered
	 */
	protected DeviceType deviceType;

	/**
	 * The cached value of the '{@link #getLocationType() <em>Location Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocationType()
	 * @generated
	 * @ordered
	 */
	protected LocationType locationType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceInLocationCapabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CapabilitiesPackage.Literals.DEVICE_IN_LOCATION_CAPABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyle() {
		return style;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyle(String newStyle) {
		String oldStyle = style;
		style = newStyle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__STYLE, oldStyle, style));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeA> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<AttributeA>(AttributeA.class, this, CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getModified() {
		return modified;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModified(Date newModified) {
		Date oldModified = modified;
		modified = newModified;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__MODIFIED, oldModified, modified));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModifier() {
		return modifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifier(String newModifier) {
		String oldModifier = modifier;
		modifier = newModifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__MODIFIER, oldModifier, modifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTraceLink() {
		return traceLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTraceLink(String newTraceLink) {
		String oldTraceLink = traceLink;
		traceLink = newTraceLink;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__TRACE_LINK, oldTraceLink, traceLink));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Variant> getVariants() {
		if (variants == null) {
			variants = new EObjectResolvingEList<Variant>(Variant.class, this, CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__VARIANTS);
		}
		return variants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OperationModeReference> getOperationModes() {
		if (operationModes == null) {
			operationModes = new EObjectContainmentEList<OperationModeReference>(OperationModeReference.class, this, CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__OPERATION_MODES);
		}
		return operationModes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType getDeviceType() {
		if (deviceType != null && deviceType.eIsProxy()) {
			InternalEObject oldDeviceType = (InternalEObject)deviceType;
			deviceType = (DeviceType)eResolveProxy(oldDeviceType);
			if (deviceType != oldDeviceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__DEVICE_TYPE, oldDeviceType, deviceType));
			}
		}
		return deviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeviceType basicGetDeviceType() {
		return deviceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeviceType(DeviceType newDeviceType) {
		DeviceType oldDeviceType = deviceType;
		deviceType = newDeviceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__DEVICE_TYPE, oldDeviceType, deviceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType getLocationType() {
		if (locationType != null && locationType.eIsProxy()) {
			InternalEObject oldLocationType = (InternalEObject)locationType;
			locationType = (LocationType)eResolveProxy(oldLocationType);
			if (locationType != oldLocationType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__LOCATION_TYPE, oldLocationType, locationType));
			}
		}
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocationType basicGetLocationType() {
		return locationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocationType(LocationType newLocationType) {
		LocationType oldLocationType = locationType;
		locationType = newLocationType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__LOCATION_TYPE, oldLocationType, locationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__OPERATION_MODES:
				return ((InternalEList<?>)getOperationModes()).basicRemove(otherEnd, msgs);
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
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__ID:
				return getId();
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__NAME:
				return getName();
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__STYLE:
				return getStyle();
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__ATTRIBUTES:
				return getAttributes();
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__DOCUMENTATION:
				return getDocumentation();
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__MODIFIED:
				return getModified();
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__MODIFIER:
				return getModifier();
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__TRACE_LINK:
				return getTraceLink();
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__VARIANTS:
				return getVariants();
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__OPERATION_MODES:
				return getOperationModes();
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__DEVICE_TYPE:
				if (resolve) return getDeviceType();
				return basicGetDeviceType();
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__LOCATION_TYPE:
				if (resolve) return getLocationType();
				return basicGetLocationType();
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
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__ID:
				setId((String)newValue);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__NAME:
				setName((String)newValue);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__STYLE:
				setStyle((String)newValue);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends AttributeA>)newValue);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__MODIFIED:
				setModified((Date)newValue);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__MODIFIER:
				setModifier((String)newValue);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__TRACE_LINK:
				setTraceLink((String)newValue);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__VARIANTS:
				getVariants().clear();
				getVariants().addAll((Collection<? extends Variant>)newValue);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__OPERATION_MODES:
				getOperationModes().clear();
				getOperationModes().addAll((Collection<? extends OperationModeReference>)newValue);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__DEVICE_TYPE:
				setDeviceType((DeviceType)newValue);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__LOCATION_TYPE:
				setLocationType((LocationType)newValue);
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
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__ID:
				setId(ID_EDEFAULT);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__STYLE:
				setStyle(STYLE_EDEFAULT);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__ATTRIBUTES:
				getAttributes().clear();
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__MODIFIED:
				setModified(MODIFIED_EDEFAULT);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__MODIFIER:
				setModifier(MODIFIER_EDEFAULT);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__TRACE_LINK:
				setTraceLink(TRACE_LINK_EDEFAULT);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__VARIANTS:
				getVariants().clear();
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__OPERATION_MODES:
				getOperationModes().clear();
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__DEVICE_TYPE:
				setDeviceType((DeviceType)null);
				return;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__LOCATION_TYPE:
				setLocationType((LocationType)null);
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
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__STYLE:
				return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__MODIFIED:
				return MODIFIED_EDEFAULT == null ? modified != null : !MODIFIED_EDEFAULT.equals(modified);
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__MODIFIER:
				return MODIFIER_EDEFAULT == null ? modifier != null : !MODIFIER_EDEFAULT.equals(modifier);
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__TRACE_LINK:
				return TRACE_LINK_EDEFAULT == null ? traceLink != null : !TRACE_LINK_EDEFAULT.equals(traceLink);
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__VARIANTS:
				return variants != null && !variants.isEmpty();
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__OPERATION_MODES:
				return operationModes != null && !operationModes.isEmpty();
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__DEVICE_TYPE:
				return deviceType != null;
			case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__LOCATION_TYPE:
				return locationType != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == OaamBaseElementA.class) {
			switch (derivedFeatureID) {
				case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__ID: return CommonPackage.OAAM_BASE_ELEMENT_A__ID;
				case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__NAME: return CommonPackage.OAAM_BASE_ELEMENT_A__NAME;
				case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__STYLE: return CommonPackage.OAAM_BASE_ELEMENT_A__STYLE;
				case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__ATTRIBUTES: return CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES;
				case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__DOCUMENTATION: return CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION;
				case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__MODIFIED: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED;
				case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__MODIFIER: return CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER;
				case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__TRACE_LINK: return CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (derivedFeatureID) {
				case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__VARIANTS: return ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (derivedFeatureID) {
				case CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__OPERATION_MODES: return ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == OaamBaseElementA.class) {
			switch (baseFeatureID) {
				case CommonPackage.OAAM_BASE_ELEMENT_A__ID: return CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__ID;
				case CommonPackage.OAAM_BASE_ELEMENT_A__NAME: return CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__NAME;
				case CommonPackage.OAAM_BASE_ELEMENT_A__STYLE: return CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__STYLE;
				case CommonPackage.OAAM_BASE_ELEMENT_A__ATTRIBUTES: return CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__ATTRIBUTES;
				case CommonPackage.OAAM_BASE_ELEMENT_A__DOCUMENTATION: return CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__DOCUMENTATION;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIED: return CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__MODIFIED;
				case CommonPackage.OAAM_BASE_ELEMENT_A__MODIFIER: return CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__MODIFIER;
				case CommonPackage.OAAM_BASE_ELEMENT_A__TRACE_LINK: return CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__TRACE_LINK;
				default: return -1;
			}
		}
		if (baseClass == VariantDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.VARIANT_DEPENDENT_ELEMENT_A__VARIANTS: return CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__VARIANTS;
				default: return -1;
			}
		}
		if (baseClass == ModeDependentElementA.class) {
			switch (baseFeatureID) {
				case ScenarioPackage.MODE_DEPENDENT_ELEMENT_A__OPERATION_MODES: return CapabilitiesPackage.DEVICE_IN_LOCATION_CAPABILITY__OPERATION_MODES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (id: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", style: ");
		result.append(style);
		result.append(", documentation: ");
		result.append(documentation);
		result.append(", modified: ");
		result.append(modified);
		result.append(", modifier: ");
		result.append(modifier);
		result.append(", traceLink: ");
		result.append(traceLink);
		result.append(')');
		return result.toString();
	}

} //DeviceInLocationCapabilityImpl
