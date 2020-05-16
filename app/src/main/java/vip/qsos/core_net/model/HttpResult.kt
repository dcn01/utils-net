package vip.qsos.core_net.model

import vip.qsos.core_net.lib.callback.IBaseResult

data class HttpResult<T>(
    override val code: Int,
    override val msg: String,
    override val data: T?
) : IBaseResult<T> {
    override val ok: Boolean
        get() = code == 200
}