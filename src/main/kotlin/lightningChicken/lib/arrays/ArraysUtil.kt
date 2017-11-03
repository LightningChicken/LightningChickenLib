package lightningChicken.lib.arrays

import raiti.RaitisAPI.arrays.ArraysUtility

fun IntArray.add(value: Int): IntArray {
    ArraysUtility.add(this, value)
    return this
}

fun<T> Array<T>.add(value: T): Array<T> {
    ArraysUtility.add(this, value)
    return this
}