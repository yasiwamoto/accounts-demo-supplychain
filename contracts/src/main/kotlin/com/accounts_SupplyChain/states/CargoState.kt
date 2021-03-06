package com.accounts_SupplyChain.states

import com.accounts_SupplyChain.contracts.CargoStateContract
import net.corda.core.contracts.*
import net.corda.core.identity.AbstractParty
import net.corda.core.identity.AnonymousParty


@BelongsToContract(CargoStateContract::class)
class CargoState(

        val pickUpFrom: AnonymousParty,
        val DeliverTo: AnonymousParty,
        val cargo: String,
        val shipper:AbstractParty) : ContractState{
    override val participants: List<AbstractParty> get() = listOfNotNull(pickUpFrom,DeliverTo,shipper).map { it }
}