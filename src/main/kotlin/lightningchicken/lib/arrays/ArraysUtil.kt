package lightningchicken.lib.arrays

import raiti.RaitisAPI.arrays.ArraysUtility

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
