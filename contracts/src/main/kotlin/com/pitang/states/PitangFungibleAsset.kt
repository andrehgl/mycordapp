package com.pitang.states

import com.pitang.contracts.PitangFungibleAssetContract
import net.corda.core.contracts.Amount
import net.corda.core.contracts.BelongsToContract
import net.corda.core.contracts.FungibleAsset
import net.corda.core.contracts.Issued
import net.corda.core.identity.AbstractParty
import net.corda.finance.contracts.asset.Cash
import java.security.PublicKey

// *********
// FungibleAsset<Cash>
// *********
@BelongsToContract(PitangFungibleAssetContract::class)
data class PitangFungibleAsset(val data: String,
                               val otherParty: AbstractParty,
                               override val amount: Amount<Issued<Cash>>,
                               override val owner: AbstractParty
) : FungibleAsset<Cash> {

    override val participants = listOf(owner, otherParty)

    override val exitKeys: Collection<PublicKey>
        get() = TODO("not implemented") //To change initializer of created properties use File | Settings | File Templates.


    override fun withNewOwner(newOwner: net.corda.core.identity.AbstractParty): net.corda.core.contracts.CommandAndState {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun withNewOwnerAndAmount(newAmount: Amount<Issued<Cash>>, newOwner: AbstractParty): FungibleAsset<Cash> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
