package lightningchicken.lib.arrays

import raitichan.raitisapi.arrays.ArraysUtility

//=================================================================================================
//---------------- add
/**
 * 配列の一番最後に要素を追加します。
 *
 * @param value 配列に追加したい値
 * @return 追加後の配列
 */
fun ByteArray.add(value: Byte): ByteArray {
    return ArraysUtility.add(this, value)
}

/**
 * 配列の一番最後に要素を追加します。
 *
 * @param value 配列に追加したい値
 * @return 追加後の配列
 */
fun ShortArray.add(value: Short): ShortArray {
    return ArraysUtility.add(this, value)
}

/**
 * 配列の一番最後に要素を追加します。
 *
 * @param value 配列に追加したい値
 * @return 追加後の配列
 */
fun IntArray.add(value: Int): IntArray {
    return ArraysUtility.add(this, value)
}

/**
 * 配列の一番最後に要素を追加します。
 *
 * @param value 配列に追加したい値
 * @return 追加後の配列
 */
fun LongArray.add(value: Long): LongArray {
    return ArraysUtility.add(this, value)
}

/**
 * 配列の一番最後に要素を追加します。
 *
 * @param value 配列に追加したい値
 * @return 追加後の配列
 */
fun FloatArray.add(value: Float): FloatArray {
    return ArraysUtility.add(this, value)
}

/**
 * 配列の一番最後に要素を追加します。
 *
 * @param value 配列に追加したい値
 * @return 追加後の配列
 */
fun DoubleArray.add(value: Double): DoubleArray {
    return ArraysUtility.add(this, value)
}

/**
 * 配列の一番最後に要素を追加します。
 *
 * @param value 配列に追加したい値
 * @return 追加後の配列
 */
fun BooleanArray.add(value: Boolean): BooleanArray {
    return ArraysUtility.add(this, value)
}

/**
 * 配列の一番最後に要素を追加します。
 *
 * @param value 配列に追加したい値
 * @return 追加後の配列
 */
fun<T> Array<T>.add(value: T): Array<T> {
    ArraysUtility.add(this, value)
    return this
}

//=================================================================================================
//---------------- addAll

/**
 * 配列の一番最後に複数の要素を追加します。
 *
 * @param addArray 配列に追加したい値。可変長引数。
 * @return 追加後の配列
 */
fun ByteArray.addAll(vararg addArray: Byte): ByteArray {
    return ArraysUtility.addAll(this, *addArray)
}

/**
 * 配列の一番最後に複数の要素を追加します。
 *
 * @param addArray 配列に追加したい値。可変長引数。
 * @return 追加後の配列
 */
fun ShortArray.addAll(vararg addArray: Short): ShortArray {
    return ArraysUtility.addAll(this, *addArray)
}

/**
 * 配列の一番最後に複数の要素を追加します。
 *
 * @param addArray 配列に追加したい値。可変長引数。
 * @return 追加後の配列
 */
fun IntArray.addAll(vararg addArray: Int): IntArray {
    return ArraysUtility.addAll(this, *addArray)
}

/**
 * 配列の一番最後に複数の要素を追加します。
 *
 * @param addArray 配列に追加したい値。可変長引数。
 * @return 追加後の配列
 */
fun LongArray.addAll(vararg addArray: Long): LongArray {
    return ArraysUtility.addAll(this, *addArray)
}

/**
 * 配列の一番最後に複数の要素を追加します。
 *
 * @param addArray 配列に追加したい値。可変長引数。
 * @return 追加後の配列
 */
fun FloatArray.addAll(vararg addArray: Float): FloatArray {
    return ArraysUtility.addAll(this, *addArray)
}

/**
 * 配列の一番最後に複数の要素を追加します。
 *
 * @param addArray 配列に追加したい値。可変長引数。
 * @return 追加後の配列
 */
fun DoubleArray.addAll(vararg addArray: Double): DoubleArray {
    return ArraysUtility.addAll(this, *addArray)
}

/**
 * 配列の一番最後に複数の要素を追加します。
 *
 * @param addArray 配列に追加したい値。可変長引数。
 * @return 追加後の配列
 */
fun BooleanArray.addAll(vararg addArray: Boolean): BooleanArray {
    return ArraysUtility.addAll(this, *addArray)
}

//=================================================================================================
/**
 * 指定した配列を全て1つの配列にまとめます。<br>
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun ByteArray.addAll(vararg addArrays: ByteArray): ByteArray {
    return ArraysUtility.addAll(this, *addArrays)
}

/**
 * 指定した配列を全て1つの配列にまとめます。<br>
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun ShortArray.addAll(vararg addArrays: ShortArray): ShortArray {
    return ArraysUtility.addAll(this, *addArrays)
}

/**
 * 指定した配列を全て1つの配列にまとめます。<br>
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun IntArray.addAll(vararg addArrays: IntArray): IntArray {
    return ArraysUtility.addAll(this, *addArrays)
}

/**
 * 指定した配列を全て1つの配列にまとめます。<br>
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun LongArray.addAll(vararg addArrays: LongArray): LongArray {
    return ArraysUtility.addAll(this, *addArrays)
}

/**
 * 指定した配列を全て1つの配列にまとめます。<br>
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun FloatArray.addAll(vararg addArrays: FloatArray): FloatArray {
    return ArraysUtility.addAll(this, *addArrays)
}

/**
 * 指定した配列を全て1つの配列にまとめます。<br>
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun DoubleArray.addAll(vararg addArrays: DoubleArray): DoubleArray {
    return ArraysUtility.addAll(this, *addArrays)
}

/**
 * 指定した配列を全て1つの配列にまとめます。<br>
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun BooleanArray.addAll(vararg addArrays: BooleanArray): BooleanArray {
    return ArraysUtility.addAll(this, *addArrays)
}
