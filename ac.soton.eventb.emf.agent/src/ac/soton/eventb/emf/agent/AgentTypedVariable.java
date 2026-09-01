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

import ac.soton.eventb.emf.core.extension.coreextension.TypedVariable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Typed Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ac.soton.eventb.emf.agent.AgentTypedVariable#getAgents <em>Agents</em>}</li>
 * </ul>
 * </p>
 *
 * @see ac.soton.eventb.emf.agent.AgentPackage#getAgentTypedVariable()
 * @model
 * @generated
 */
public interface AgentTypedVariable extends TypedVariable {
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
	 * @see ac.soton.eventb.emf.agent.AgentPackage#getAgentTypedVariable_Agents()
	 * @model
	 * @generated
	 */
	EList<String> getAgents();

} // AgentTypedVariable
