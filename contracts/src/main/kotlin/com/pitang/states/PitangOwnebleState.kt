package com.pitang.states

import com.pitang.contracts.PitangLinearContract
import com.pitang.contracts.PitangOwnerbleContract
import net.corda.core.contracts.*
import net.corda.core.identity.AbstractParty

// *********
// OwnableState
// *********
@BelongsToContract(PitangOwnerbleContract::class)
data class PitangOwnebleState(val data: String,
                              override val owner: AbstractParty) : OwnableState {

    override val participants = listOf(owner)

    override fun withNewOwner(newOwner: AbstractParty): CommandAndState {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
