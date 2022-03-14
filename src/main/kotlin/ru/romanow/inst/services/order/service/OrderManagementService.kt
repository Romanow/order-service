package ru.romanow.inst.services.order.service

import ru.romanow.inst.services.order.model.CreateOrderRequest
import ru.romanow.inst.services.order.model.CreateOrderResponse
import ru.romanow.inst.services.order.model.OrderWarrantyRequest
import ru.romanow.inst.services.order.model.OrderWarrantyResponse
import java.util.*

interface OrderManagementService {
    fun makeOrder(userUid: UUID, request: CreateOrderRequest): CreateOrderResponse
    fun refundOrder(orderUid: UUID)
    fun useWarranty(orderUid: UUID, request: OrderWarrantyRequest): OrderWarrantyResponse
}
