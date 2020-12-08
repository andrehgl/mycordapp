package com.pitang.states

import com.pitang.contracts.PitangFungibleStateContract
import net.corda.core.contracts.Amount
import net.corda.core.contracts.BelongsToContract
import net.corda.core.contracts.FungibleState
import net.corda.core.identity.AbstractParty
import net.corda.finance.contracts.Commodity


// *********
// FungibleAsset<Currency>
// *********
@BelongsToContract(PitangFungibleStateContract::class)
data class PitangFungibleState(val data: String,
                               val party: AbstractParty,
                               override val amount: Amount<Commodity>) : FungibleState<Commodity> {

     // override val participants: List<AbstractParty>
     override val participants = listOf(party)
}
