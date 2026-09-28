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

import ac.soton.eventb.emf.agent.AgentPackage;
import ac.soton.eventb.emf.agent.CompleteIgnoranceInvariant;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eventb.emf.core.impl.EventBNamedCommentedElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Complete Ignorance Invariant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.agent.impl.CompleteIgnoranceInvariantImpl#getAgents <em>Agents</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.agent.impl.CompleteIgnoranceInvariantImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.agent.impl.CompleteIgnoranceInvariantImpl#getFact <em>Fact</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.agent.impl.CompleteIgnoranceInvariantImpl#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompleteIgnoranceInvariantImpl extends EventBNamedCommentedElementImpl implements CompleteIgnoranceInvariant {
	/**
	 * The cached value of the '{@link #getAgents() <em>Agents</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgents()
	 * @generated
	 * @ordered
	 */
	protected EList<String> agents;

	/**
	 * The default value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected String condition = CONDITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getFact() <em>Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFact()
	 * @generated
	 * @ordered
	 */
	protected static final String FACT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFact() <em>Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFact()
	 * @generated
	 * @ordered
	 */
	protected String fact = FACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVariables() <em>Variables</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariables()
	 * @generated
	 * @ordered
	 */
	protected EList<String> variables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompleteIgnoranceInvariantImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AgentPackage.Literals.COMPLETE_IGNORANCE_INVARIANT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAgents() {
		if (agents == null) {
			agents = new EDataTypeUniqueEList<String>(String.class, this, AgentPackage.COMPLETE_IGNORANCE_INVARIANT__AGENTS);
		}
		return agents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(String newCondition) {
		String oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.COMPLETE_IGNORANCE_INVARIANT__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFact() {
		return fact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFact(String newFact) {
		String oldFact = fact;
		fact = newFact;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AgentPackage.COMPLETE_IGNORANCE_INVARIANT__FACT, oldFact, fact));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getVariables() {
		if (variables == null) {
			variables = new EDataTypeUniqueEList<String>(String.class, this, AgentPackage.COMPLETE_IGNORANCE_INVARIANT__VARIABLES);
		}
		return variables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__AGENTS:
				return getAgents();
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__CONDITION:
				return getCondition();
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__FACT:
				return getFact();
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__VARIABLES:
				return getVariables();
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
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__AGENTS:
				getAgents().clear();
				getAgents().addAll((Collection<? extends String>)newValue);
				return;
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__CONDITION:
				setCondition((String)newValue);
				return;
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__FACT:
				setFact((String)newValue);
				return;
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__VARIABLES:
				getVariables().clear();
				getVariables().addAll((Collection<? extends String>)newValue);
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
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__AGENTS:
				getAgents().clear();
				return;
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__CONDITION:
				setCondition(CONDITION_EDEFAULT);
				return;
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__FACT:
				setFact(FACT_EDEFAULT);
				return;
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__VARIABLES:
				getVariables().clear();
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
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__AGENTS:
				return agents != null && !agents.isEmpty();
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__CONDITION:
				return CONDITION_EDEFAULT == null ? condition != null : !CONDITION_EDEFAULT.equals(condition);
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__FACT:
				return FACT_EDEFAULT == null ? fact != null : !FACT_EDEFAULT.equals(fact);
			case AgentPackage.COMPLETE_IGNORANCE_INVARIANT__VARIABLES:
				return variables != null && !variables.isEmpty();
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
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (agents: ");
		result.append(agents);
		result.append(", condition: ");
		result.append(condition);
		result.append(", fact: ");
		result.append(fact);
		result.append(", variables: ");
		result.append(variables);
		result.append(')');
		return result.toString();
	}

} //CompleteIgnoranceInvariantImpl
