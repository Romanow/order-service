package ru.romanow.inst.services.order.model

data class OrderWarrantyResponse(
    var warrantyDate: String,
    val decision: String
)