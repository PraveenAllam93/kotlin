/*
 * Copyright 2010-2019 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license
 * that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.fir.expressions.impl

import com.intellij.psi.PsiElement
import org.jetbrains.kotlin.fir.FirSession
import org.jetbrains.kotlin.fir.FirTarget
import org.jetbrains.kotlin.fir.expressions.FirJump
import org.jetbrains.kotlin.fir.expressions.FirLoop
import org.jetbrains.kotlin.fir.types.FirTypeRef
import org.jetbrains.kotlin.fir.types.impl.FirImplicitNothingTypeRef

abstract class FirAbstractLoopJump(
    session: FirSession,
    psi: PsiElement?
) : FirAbstractExpression(session, psi), FirJump<FirLoop> {
    override lateinit var target: FirTarget<FirLoop>

    override var typeRef: FirTypeRef = FirImplicitNothingTypeRef(session, psi)
}