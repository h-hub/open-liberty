/*******************************************************************************
 * Copyright (c) 2020 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package io.openliberty.microprofile.lra.internal;

public class LraRuntimeException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public LraRuntimeException(String message, Exception cause) {
        super(message, cause);
    }

}
