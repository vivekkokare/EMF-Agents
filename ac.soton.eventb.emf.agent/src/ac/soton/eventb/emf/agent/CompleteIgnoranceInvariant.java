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
package ac.soton.eventb.emf.agent;

import org.eclipse.emf.common.util.EList;

import org.eventb.emf.core.EventBNamedCommentedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Complete Ignorance Invariant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.agent.CompleteIgnoranceInvariant#getAgents <em>Agents</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.agent.CompleteIgnoranceInvariant#getCondition <em>Condition</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.agent.CompleteIgnoranceInvariant#getFact <em>Fact</em>}</li>
 *   <li>{@link ac.soton.eventb.emf.agent.CompleteIgnoranceInvariant#getVariables <em>Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.agent.AgentPackage#getCompleteIgnoranceInvariant()
 * @model
 * @generated
 */
public interface CompleteIgnoranceInvariant extends EventBNamedCommentedElement {
	/**
	 * Returns the value of the '<em><b>Agents</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agents</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agents</em>' attribute list.
	 * @see ac.soton.eventb.emf.agent.AgentPackage#getCompleteIgnoranceInvariant_Agents()
	 * @model
	 * @generated
	 */
	EList<String> getAgents();

	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see ac.soton.eventb.emf.agent.AgentPackage#getCompleteIgnoranceInvariant_Condition()
	 * @model
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.agent.CompleteIgnoranceInvariant#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Fact</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fact</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fact</em>' attribute.
	 * @see #setFact(String)
	 * @see ac.soton.eventb.emf.agent.AgentPackage#getCompleteIgnoranceInvariant_Fact()
	 * @model required="true"
	 * @generated
	 */
	String getFact();

	/**
	 * Sets the value of the '{@link ac.soton.eventb.emf.agent.CompleteIgnoranceInvariant#getFact <em>Fact</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fact</em>' attribute.
	 * @see #getFact()
	 * @generated
	 */
	void setFact(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' attribute list.
	 * @see ac.soton.eventb.emf.agent.AgentPackage#getCompleteIgnoranceInvariant_Variables()
	 * @model required="true"
	 * @generated
	 */
	EList<String> getVariables();

} // CompleteIgnoranceInvariant
