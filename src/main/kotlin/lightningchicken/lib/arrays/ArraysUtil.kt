package lightningchicken.lib.arrays

import raitichan.raitisapi.arrays.ArraysUtility

//=================================================================================================
//---------------- addAll
/**
 * 指定した配列を全て1つの配列にまとめます。<br>
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun ByteArray.addAll(vararg addArrays: ByteArray): ByteArray {
    addArrays.forEach { ArraysUtility.addAll(this, it) }
    return this
}

/**
 * 指定した配列を全て1つの配列にまとめます。<br>
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun ShortArray.addAll(vararg addArrays: ShortArray): ShortArray {
    addArrays.forEach { ArraysUtility.addAll(this, it) }
    return this
}

/**
 * 指定した配列を全て1つの配列にまとめます。<br>
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun IntArray.addAll(vararg addArrays: IntArray): IntArray {
    addArrays.forEach { ArraysUtility.addAll(this, it) }
    return this
}

/**
 * 指定した配列を全て1つの配列にまとめます。<br>
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun LongArray.addAll(vararg addArrays: LongArray): LongArray {
    addArrays.forEach { ArraysUtility.addAll(this, it) }
    return this
}

/**
 * 指定した配列を全て1つの配列にまとめます。<br>
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun FloatArray.addAll(vararg addArrays: FloatArray): FloatArray {
    addArrays.forEach { ArraysUtility.addAll(this, it) }
    return this
}

/**
 * 指定した配列を全て1つの配列にまとめます。<br>
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun DoubleArray.addAll(vararg addArrays: DoubleArray): DoubleArray {
    addArrays.forEach { ArraysUtility.addAll(this, it) }
    return this
}

/**
 * 指定した配列を全て1つの配列にまとめます。<br>
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun BooleanArray.addAll(vararg addArrays: BooleanArray): BooleanArray {
    addArrays.forEach { ArraysUtility.addAll(this, it) }
    return this
}
