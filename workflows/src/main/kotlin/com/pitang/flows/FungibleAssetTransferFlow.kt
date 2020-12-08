package com.pitang.flows

import co.paralleluniverse.fibers.Suspendable
import net.corda.core.flows.*
import net.corda.core.utilities.ProgressTracker

// *********
// * Flows *
// *********
@InitiatingFlow
@StartableByRPC
class FungibleAssetTransferFlow : FlowLogic<Unit>() {
    override val progressTracker = ProgressTracker()

    @Suspendable
    override fun call() {
        // initiator flow logic goes here.
    }
}

@InitiatedBy(FungibleAssetTransferFlow::class)
class FungibleAssetTransferFlowResponder(val counterPartySession: FlowSession) : FlowLogic<Unit>() {

    @Suspendable
    override fun call() {
        TODO("Not yet implemented")
    }
}