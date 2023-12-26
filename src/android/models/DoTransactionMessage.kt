package io.thinker.cmposintegration.models

class DoTransactionMessage(
    val transactionType : String,
    val amount : Double,
    val currency : String,
    val orderReference: String,
    val refundStan: String? = null,
    val refundDate: String? = null) {

}
