package com.pitang.flows

import co.paralleluniverse.fibers.Suspendable
import net.corda.core.flows.*
import net.corda.core.utilities.ProgressTracker

// *********
// * Flows *
// *********
@InitiatingFlow
@StartableByRPC
class LinearStateConfidentialFlow : FlowLogic<Unit>() {
    override val progressTracker = ProgressTracker()

    @Suspendable
    override fun call() {
        // Initiator flow logic goes here.
    }

    // TODO Usar SwapIdentitiesFlow como usar o "confidential identities"
    //  https://github.com/roger3cev/whistleblower/tree/release-V1/src/main/kotlin/com/whistleblower
}

// TODO Responder