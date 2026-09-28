/**
 * Copyright (c) 2026 University of Southampton.
 * 
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     University of Southampton - initial API and implementation
 *
 * $Id$
 */
package ac.soton.eventb.emf.agent.provider;


import ac.soton.eventb.emf.agent.AgentFactory;
import ac.soton.eventb.emf.agent.AgentPackage;
import ac.soton.eventb.emf.agent.CompleteIgnoranceInvariant;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.eventb.emf.core.CorePackage;

import org.eventb.emf.core.provider.EventBCommentedElementItemProvider;

/**
 * This is the item provider adapter for a {@link ac.soton.eventb.emf.agent.CompleteIgnoranceInvariant} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CompleteIgnoranceInvariantItemProvider
	extends EventBCommentedElementItemProvider
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompleteIgnoranceInvariantItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addAgentsPropertyDescriptor(object);
			addConditionPropertyDescriptor(object);
			addFactPropertyDescriptor(object);
			addVariablesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Agents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAgentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompleteIgnoranceInvariant_agents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompleteIgnoranceInvariant_agents_feature", "_UI_CompleteIgnoranceInvariant_type"),
				 AgentPackage.Literals.COMPLETE_IGNORANCE_INVARIANT__AGENTS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Condition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConditionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompleteIgnoranceInvariant_condition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompleteIgnoranceInvariant_condition_feature", "_UI_CompleteIgnoranceInvariant_type"),
				 AgentPackage.Literals.COMPLETE_IGNORANCE_INVARIANT__CONDITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fact feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFactPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompleteIgnoranceInvariant_fact_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompleteIgnoranceInvariant_fact_feature", "_UI_CompleteIgnoranceInvariant_type"),
				 AgentPackage.Literals.COMPLETE_IGNORANCE_INVARIANT__FACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Variables feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addVariablesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_CompleteIgnoranceInvariant_variables_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_CompleteIgnoranceInvariant_variables_feature", "_UI_CompleteIgnoranceInvariant_type"),
				 AgentPackage.Literals.COMPLETE_IGNORANCE_INVARIANT__VARIABLES,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns CompleteIgnoranceInvariant.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CompleteIgnoranceInvariant"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((CompleteIgnoranceInvariant)object).getReference();
		return label == null || label.length() == 0 ?
			getString("_UI_CompleteIgnoranceInvariant_type") :
			getString("_UI_CompleteIgnoranceInvariant_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(CompleteIgnoranceInvariant.class)) {
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__AGENTS:
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__CONDITION:
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__FACT:
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__VARIABLES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);
		
			
		if (object instanceof EObject && 
			AgentPackage.Literals.AGENT.getEAnnotation("org.eventb.emf.core.extendedMetaClasses") == null  || 
			AgentPackage.Literals.AGENT.getEAnnotation("org.eventb.emf.core.extendedMetaClasses").getReferences().contains(((EObject)object).eClass()))
		
			newChildDescriptors.add
				(createChildParameter
					(CorePackage.Literals.EVENT_BELEMENT__EXTENSIONS,
				 	AgentFactory.eINSTANCE.createAgent()));
	}

}
