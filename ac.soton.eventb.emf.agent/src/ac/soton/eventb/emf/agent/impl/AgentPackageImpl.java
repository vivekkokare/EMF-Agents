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
package ac.soton.eventb.emf.agent.impl;

import ac.soton.eventb.emf.agent.Agent;
import ac.soton.eventb.emf.agent.AgentFactory;
import ac.soton.eventb.emf.agent.AgentPackage;
import ac.soton.eventb.emf.agent.AgentTypedVariable;
import ac.soton.eventb.emf.agent.CompleteIgnoranceInvariant;

import ac.soton.eventb.emf.core.extension.coreextension.CoreextensionPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eventb.emf.core.CorePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AgentPackageImpl extends EPackageImpl implements AgentPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentTypedVariableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass completeIgnoranceInvariantEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see ac.soton.eventb.emf.agent.AgentPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AgentPackageImpl() {
		super(eNS_URI, AgentFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link AgentPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AgentPackage init() {
		if (isInited) return (AgentPackage)EPackage.Registry.INSTANCE.getEPackage(AgentPackage.eNS_URI);

		// Obtain or create and register package
		AgentPackageImpl theAgentPackage = (AgentPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AgentPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AgentPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		CoreextensionPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theAgentPackage.createPackageContents();

		// Initialize created meta-data
		theAgentPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAgentPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AgentPackage.eNS_URI, theAgentPackage);
		return theAgentPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgentTypedVariable() {
		return agentTypedVariableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgentTypedVariable_Agents() {
		return (EAttribute)agentTypedVariableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompleteIgnoranceInvariant() {
		return completeIgnoranceInvariantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompleteIgnoranceInvariant_Agents() {
		return (EAttribute)completeIgnoranceInvariantEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompleteIgnoranceInvariant_Condition() {
		return (EAttribute)completeIgnoranceInvariantEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompleteIgnoranceInvariant_Fact() {
		return (EAttribute)completeIgnoranceInvariantEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompleteIgnoranceInvariant_Variables() {
		return (EAttribute)completeIgnoranceInvariantEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentFactory getAgentFactory() {
		return (AgentFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		agentEClass = createEClass(AGENT);

		agentTypedVariableEClass = createEClass(AGENT_TYPED_VARIABLE);
		createEAttribute(agentTypedVariableEClass, AGENT_TYPED_VARIABLE__AGENTS);

		completeIgnoranceInvariantEClass = createEClass(COMPLETE_IGNORANCE_INVARIANT);
		createEAttribute(completeIgnoranceInvariantEClass, COMPLETE_IGNORANCE_INVARIANT__AGENTS);
		createEAttribute(completeIgnoranceInvariantEClass, COMPLETE_IGNORANCE_INVARIANT__CONDITION);
		createEAttribute(completeIgnoranceInvariantEClass, COMPLETE_IGNORANCE_INVARIANT__FACT);
		createEAttribute(completeIgnoranceInvariantEClass, COMPLETE_IGNORANCE_INVARIANT__VARIABLES);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		CoreextensionPackage theCoreextensionPackage = (CoreextensionPackage)EPackage.Registry.INSTANCE.getEPackage(CoreextensionPackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		agentEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());
		agentEClass.getESuperTypes().add(theCorePackage.getAbstractExtension());
		agentTypedVariableEClass.getESuperTypes().add(theCoreextensionPackage.getTypedVariable());
		completeIgnoranceInvariantEClass.getESuperTypes().add(theCorePackage.getEventBNamedCommentedElement());

		// Initialize classes and features; add operations and parameters
		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(agentTypedVariableEClass, AgentTypedVariable.class, "AgentTypedVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgentTypedVariable_Agents(), theEcorePackage.getEString(), "agents", null, 0, -1, AgentTypedVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(completeIgnoranceInvariantEClass, CompleteIgnoranceInvariant.class, "CompleteIgnoranceInvariant", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompleteIgnoranceInvariant_Agents(), theEcorePackage.getEString(), "agents", null, 0, -1, CompleteIgnoranceInvariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompleteIgnoranceInvariant_Condition(), theEcorePackage.getEString(), "condition", null, 0, 1, CompleteIgnoranceInvariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompleteIgnoranceInvariant_Fact(), theEcorePackage.getEString(), "fact", null, 1, 1, CompleteIgnoranceInvariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCompleteIgnoranceInvariant_Variables(), theEcorePackage.getEString(), "variables", null, 1, -1, CompleteIgnoranceInvariant.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AgentPackageImpl
