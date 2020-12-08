package com.pitang.states

import com.pitang.contracts.PitangLinearContract
import net.corda.core.contracts.BelongsToContract
import net.corda.core.contracts.LinearState
import net.corda.core.contracts.UniqueIdentifier
import net.corda.core.identity.AbstractParty

// *********
// LinearState
// *********
@BelongsToContract(PitangLinearContract::class)
data class PitangLinearState(val data: String,
                             val party1: AbstractParty,
                             val party2: AbstractParty,
                             override val linearId: UniqueIdentifier) : LinearState {

    override val participants = listOf(party1, party2)

}
