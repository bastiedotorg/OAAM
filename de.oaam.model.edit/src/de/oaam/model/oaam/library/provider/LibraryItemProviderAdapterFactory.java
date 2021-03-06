/**
 */
package de.oaam.model.oaam.library.provider;

import de.oaam.model.oaam.library.util.LibraryAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LibraryItemProviderAdapterFactory extends LibraryAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LibraryItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.ResourceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeItemProvider resourceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.ResourceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceTypeAdapter() {
		if (resourceTypeItemProvider == null) {
			resourceTypeItemProvider = new ResourceTypeItemProvider(this);
		}

		return resourceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.Resource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceItemProvider resourceItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceAdapter() {
		if (resourceItemProvider == null) {
			resourceItemProvider = new ResourceItemProvider(this);
		}

		return resourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.ResourceAlternatives} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceAlternativesItemProvider resourceAlternativesItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.ResourceAlternatives}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceAlternativesAdapter() {
		if (resourceAlternativesItemProvider == null) {
			resourceAlternativesItemProvider = new ResourceAlternativesItemProvider(this);
		}

		return resourceAlternativesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.ResourceBundle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceBundleItemProvider resourceBundleItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.ResourceBundle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceBundleAdapter() {
		if (resourceBundleItemProvider == null) {
			resourceBundleItemProvider = new ResourceBundleItemProvider(this);
		}

		return resourceBundleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.TaskType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskTypeItemProvider taskTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.TaskType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskTypeAdapter() {
		if (taskTypeItemProvider == null) {
			taskTypeItemProvider = new TaskTypeItemProvider(this);
		}

		return taskTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.SignalType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignalTypeItemProvider signalTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.SignalType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSignalTypeAdapter() {
		if (signalTypeItemProvider == null) {
			signalTypeItemProvider = new SignalTypeItemProvider(this);
		}

		return signalTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.DeviceType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceTypeItemProvider deviceTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.DeviceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceTypeAdapter() {
		if (deviceTypeItemProvider == null) {
			deviceTypeItemProvider = new DeviceTypeItemProvider(this);
		}

		return deviceTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.ConnectionType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionTypeItemProvider connectionTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.ConnectionType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConnectionTypeAdapter() {
		if (connectionTypeItemProvider == null) {
			connectionTypeItemProvider = new ConnectionTypeItemProvider(this);
		}

		return connectionTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.LocationType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationTypeItemProvider locationTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.LocationType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLocationTypeAdapter() {
		if (locationTypeItemProvider == null) {
			locationTypeItemProvider = new LocationTypeItemProvider(this);
		}

		return locationTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.DuctType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DuctTypeItemProvider ductTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.DuctType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDuctTypeAdapter() {
		if (ductTypeItemProvider == null) {
			ductTypeItemProvider = new DuctTypeItemProvider(this);
		}

		return ductTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.WireType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WireTypeItemProvider wireTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.WireType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createWireTypeAdapter() {
		if (wireTypeItemProvider == null) {
			wireTypeItemProvider = new WireTypeItemProvider(this);
		}

		return wireTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.IoType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoTypeItemProvider ioTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.IoType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIoTypeAdapter() {
		if (ioTypeItemProvider == null) {
			ioTypeItemProvider = new IoTypeItemProvider(this);
		}

		return ioTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.InputDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputDeclarationItemProvider inputDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.InputDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInputDeclarationAdapter() {
		if (inputDeclarationItemProvider == null) {
			inputDeclarationItemProvider = new InputDeclarationItemProvider(this);
		}

		return inputDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.OutputDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OutputDeclarationItemProvider outputDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.OutputDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOutputDeclarationAdapter() {
		if (outputDeclarationItemProvider == null) {
			outputDeclarationItemProvider = new OutputDeclarationItemProvider(this);
		}

		return outputDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.IoDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoDeclarationItemProvider ioDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.IoDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIoDeclarationAdapter() {
		if (ioDeclarationItemProvider == null) {
			ioDeclarationItemProvider = new IoDeclarationItemProvider(this);
		}

		return ioDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.DuctOpeningDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DuctOpeningDeclarationItemProvider ductOpeningDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.DuctOpeningDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDuctOpeningDeclarationAdapter() {
		if (ductOpeningDeclarationItemProvider == null) {
			ductOpeningDeclarationItemProvider = new DuctOpeningDeclarationItemProvider(this);
		}

		return ductOpeningDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.ResourceGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceGroupItemProvider resourceGroupItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.ResourceGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceGroupAdapter() {
		if (resourceGroupItemProvider == null) {
			resourceGroupItemProvider = new ResourceGroupItemProvider(this);
		}

		return resourceGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.DeviceTypeSymmetry} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceTypeSymmetryItemProvider deviceTypeSymmetryItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.DeviceTypeSymmetry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceTypeSymmetryAdapter() {
		if (deviceTypeSymmetryItemProvider == null) {
			deviceTypeSymmetryItemProvider = new DeviceTypeSymmetryItemProvider(this);
		}

		return deviceTypeSymmetryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.IoGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IoGroupItemProvider ioGroupItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.IoGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createIoGroupAdapter() {
		if (ioGroupItemProvider == null) {
			ioGroupItemProvider = new IoGroupItemProvider(this);
		}

		return ioGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.AttributeDefinition} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefinitionItemProvider attributeDefinitionItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.AttributeDefinition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createAttributeDefinitionAdapter() {
		if (attributeDefinitionItemProvider == null) {
			attributeDefinitionItemProvider = new AttributeDefinitionItemProvider(this);
		}

		return attributeDefinitionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.FaultPropagation} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FaultPropagationItemProvider faultPropagationItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.FaultPropagation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFaultPropagationAdapter() {
		if (faultPropagationItemProvider == null) {
			faultPropagationItemProvider = new FaultPropagationItemProvider(this);
		}

		return faultPropagationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.TaskInputState} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskInputStateItemProvider taskInputStateItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.TaskInputState}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskInputStateAdapter() {
		if (taskInputStateItemProvider == null) {
			taskInputStateItemProvider = new TaskInputStateItemProvider(this);
		}

		return taskInputStateItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.PowerSource} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PowerSourceItemProvider powerSourceItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.PowerSource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createPowerSourceAdapter() {
		if (powerSourceItemProvider == null) {
			powerSourceItemProvider = new PowerSourceItemProvider(this);
		}

		return powerSourceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.ResourceLink} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceLinkItemProvider resourceLinkItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.ResourceLink}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceLinkAdapter() {
		if (resourceLinkItemProvider == null) {
			resourceLinkItemProvider = new ResourceLinkItemProvider(this);
		}

		return resourceLinkItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.ResourceTypeModifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeModifierItemProvider resourceTypeModifierItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.ResourceTypeModifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceTypeModifierAdapter() {
		if (resourceTypeModifierItemProvider == null) {
			resourceTypeModifierItemProvider = new ResourceTypeModifierItemProvider(this);
		}

		return resourceTypeModifierItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.ResourceTypeModifierLevel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeModifierLevelItemProvider resourceTypeModifierLevelItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.ResourceTypeModifierLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceTypeModifierLevelAdapter() {
		if (resourceTypeModifierLevelItemProvider == null) {
			resourceTypeModifierLevelItemProvider = new ResourceTypeModifierLevelItemProvider(this);
		}

		return resourceTypeModifierLevelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.ResourceTypeModifierReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeModifierReferenceItemProvider resourceTypeModifierReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.ResourceTypeModifierReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceTypeModifierReferenceAdapter() {
		if (resourceTypeModifierReferenceItemProvider == null) {
			resourceTypeModifierReferenceItemProvider = new ResourceTypeModifierReferenceItemProvider(this);
		}

		return resourceTypeModifierReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.TaskTypeDissimilarity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskTypeDissimilarityItemProvider taskTypeDissimilarityItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.TaskTypeDissimilarity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskTypeDissimilarityAdapter() {
		if (taskTypeDissimilarityItemProvider == null) {
			taskTypeDissimilarityItemProvider = new TaskTypeDissimilarityItemProvider(this);
		}

		return taskTypeDissimilarityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.DeviceTypeDissimilarity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeviceTypeDissimilarityItemProvider deviceTypeDissimilarityItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.DeviceTypeDissimilarity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createDeviceTypeDissimilarityAdapter() {
		if (deviceTypeDissimilarityItemProvider == null) {
			deviceTypeDissimilarityItemProvider = new DeviceTypeDissimilarityItemProvider(this);
		}

		return deviceTypeDissimilarityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.ResourceTypeDissimilarity} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceTypeDissimilarityItemProvider resourceTypeDissimilarityItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.ResourceTypeDissimilarity}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createResourceTypeDissimilarityAdapter() {
		if (resourceTypeDissimilarityItemProvider == null) {
			resourceTypeDissimilarityItemProvider = new ResourceTypeDissimilarityItemProvider(this);
		}

		return resourceTypeDissimilarityItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.TaskOutputTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskOutputTriggerItemProvider taskOutputTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.TaskOutputTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskOutputTriggerAdapter() {
		if (taskOutputTriggerItemProvider == null) {
			taskOutputTriggerItemProvider = new TaskOutputTriggerItemProvider(this);
		}

		return taskOutputTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.TaskInputTrigger} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskInputTriggerItemProvider taskInputTriggerItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.TaskInputTrigger}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskInputTriggerAdapter() {
		if (taskInputTriggerItemProvider == null) {
			taskInputTriggerItemProvider = new TaskInputTriggerItemProvider(this);
		}

		return taskInputTriggerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.TaskStateDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskStateDeclarationItemProvider taskStateDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.TaskStateDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskStateDeclarationAdapter() {
		if (taskStateDeclarationItemProvider == null) {
			taskStateDeclarationItemProvider = new TaskStateDeclarationItemProvider(this);
		}

		return taskStateDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.TaskParameterDeclaration} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskParameterDeclarationItemProvider taskParameterDeclarationItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.TaskParameterDeclaration}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTaskParameterDeclarationAdapter() {
		if (taskParameterDeclarationItemProvider == null) {
			taskParameterDeclarationItemProvider = new TaskParameterDeclarationItemProvider(this);
		}

		return taskParameterDeclarationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.BusType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BusTypeItemProvider busTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.BusType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createBusTypeAdapter() {
		if (busTypeItemProvider == null) {
			busTypeItemProvider = new BusTypeItemProvider(this);
		}

		return busTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.MessageType} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageTypeItemProvider messageTypeItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.MessageType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageTypeAdapter() {
		if (messageTypeItemProvider == null) {
			messageTypeItemProvider = new MessageTypeItemProvider(this);
		}

		return messageTypeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.Library} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryItemProvider libraryItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.Library}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLibraryAdapter() {
		if (libraryItemProvider == null) {
			libraryItemProvider = new LibraryItemProvider(this);
		}

		return libraryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.oaam.model.oaam.library.Sublibrary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SublibraryItemProvider sublibraryItemProvider;

	/**
	 * This creates an adapter for a {@link de.oaam.model.oaam.library.Sublibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createSublibraryAdapter() {
		if (sublibraryItemProvider == null) {
			sublibraryItemProvider = new SublibraryItemProvider(this);
		}

		return sublibraryItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (resourceTypeItemProvider != null) resourceTypeItemProvider.dispose();
		if (resourceItemProvider != null) resourceItemProvider.dispose();
		if (resourceAlternativesItemProvider != null) resourceAlternativesItemProvider.dispose();
		if (resourceBundleItemProvider != null) resourceBundleItemProvider.dispose();
		if (taskTypeItemProvider != null) taskTypeItemProvider.dispose();
		if (signalTypeItemProvider != null) signalTypeItemProvider.dispose();
		if (deviceTypeItemProvider != null) deviceTypeItemProvider.dispose();
		if (connectionTypeItemProvider != null) connectionTypeItemProvider.dispose();
		if (locationTypeItemProvider != null) locationTypeItemProvider.dispose();
		if (ductTypeItemProvider != null) ductTypeItemProvider.dispose();
		if (wireTypeItemProvider != null) wireTypeItemProvider.dispose();
		if (ioTypeItemProvider != null) ioTypeItemProvider.dispose();
		if (inputDeclarationItemProvider != null) inputDeclarationItemProvider.dispose();
		if (outputDeclarationItemProvider != null) outputDeclarationItemProvider.dispose();
		if (ioDeclarationItemProvider != null) ioDeclarationItemProvider.dispose();
		if (ductOpeningDeclarationItemProvider != null) ductOpeningDeclarationItemProvider.dispose();
		if (resourceGroupItemProvider != null) resourceGroupItemProvider.dispose();
		if (deviceTypeSymmetryItemProvider != null) deviceTypeSymmetryItemProvider.dispose();
		if (ioGroupItemProvider != null) ioGroupItemProvider.dispose();
		if (attributeDefinitionItemProvider != null) attributeDefinitionItemProvider.dispose();
		if (faultPropagationItemProvider != null) faultPropagationItemProvider.dispose();
		if (taskInputStateItemProvider != null) taskInputStateItemProvider.dispose();
		if (powerSourceItemProvider != null) powerSourceItemProvider.dispose();
		if (resourceLinkItemProvider != null) resourceLinkItemProvider.dispose();
		if (resourceTypeModifierItemProvider != null) resourceTypeModifierItemProvider.dispose();
		if (resourceTypeModifierLevelItemProvider != null) resourceTypeModifierLevelItemProvider.dispose();
		if (resourceTypeModifierReferenceItemProvider != null) resourceTypeModifierReferenceItemProvider.dispose();
		if (taskTypeDissimilarityItemProvider != null) taskTypeDissimilarityItemProvider.dispose();
		if (deviceTypeDissimilarityItemProvider != null) deviceTypeDissimilarityItemProvider.dispose();
		if (resourceTypeDissimilarityItemProvider != null) resourceTypeDissimilarityItemProvider.dispose();
		if (taskOutputTriggerItemProvider != null) taskOutputTriggerItemProvider.dispose();
		if (taskInputTriggerItemProvider != null) taskInputTriggerItemProvider.dispose();
		if (taskStateDeclarationItemProvider != null) taskStateDeclarationItemProvider.dispose();
		if (taskParameterDeclarationItemProvider != null) taskParameterDeclarationItemProvider.dispose();
		if (busTypeItemProvider != null) busTypeItemProvider.dispose();
		if (messageTypeItemProvider != null) messageTypeItemProvider.dispose();
		if (libraryItemProvider != null) libraryItemProvider.dispose();
		if (sublibraryItemProvider != null) sublibraryItemProvider.dispose();
	}

}
