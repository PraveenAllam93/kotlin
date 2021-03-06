/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.checkers.diagnostics

data class PositionalTextDiagnostic(val diagnostic: TextDiagnostic, val start: Int, val end: Int)
