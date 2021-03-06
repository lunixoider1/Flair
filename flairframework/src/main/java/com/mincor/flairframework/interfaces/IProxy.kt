package com.mincor.flairframework.interfaces

/**
 * Created by a.minkin on 21.11.2017.
 */
interface IProxy<out T> : INotifier {

    val data:T
    /**
     * Called by the Model when the Proxy is registered.
     */
    fun onRegister()

    /**
     * Called by the Model when the Proxy is removed.
     */
    fun onRemove()
}