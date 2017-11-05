package lightningchicken.lib.arrays

import raitichan.raitisapi.arrays.ArraysUtility

//=================================================================================================
//---------------- addAll
/**
 * 指定した配列を全て1つの配列にまとめます。
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun ByteArray.addAll(vararg addArrays: ByteArray): ByteArray {
    addArrays.forEach { ArraysUtility.addAll(this, it) }
    return this
}

/**
 * 指定した配列を全て1つの配列にまとめます。
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun ShortArray.addAll(vararg addArrays: ShortArray): ShortArray {
    addArrays.forEach { ArraysUtility.addAll(this, it) }
    return this
}

/**
 * 指定した配列を全て1つの配列にまとめます。
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun IntArray.addAll(vararg addArrays: IntArray): IntArray {
    addArrays.forEach { ArraysUtility.addAll(this, it) }
    return this
}

/**
 * 指定した配列を全て1つの配列にまとめます。
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun LongArray.addAll(vararg addArrays: LongArray): LongArray {
    addArrays.forEach { ArraysUtility.addAll(this, it) }
    return this
}

/**
 * 指定した配列を全て1つの配列にまとめます。
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun FloatArray.addAll(vararg addArrays: FloatArray): FloatArray {
    addArrays.forEach { ArraysUtility.addAll(this, it) }
    return this
}

/**
 * 指定した配列を全て1つの配列にまとめます。
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun DoubleArray.addAll(vararg addArrays: DoubleArray): DoubleArray {
    addArrays.forEach { ArraysUtility.addAll(this, it) }
    return this
}

/**
 * 指定した配列を全て1つの配列にまとめます。
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun BooleanArray.addAll(vararg addArrays: BooleanArray): BooleanArray {
    addArrays.forEach { ArraysUtility.addAll(this, it) }
    return this
}

//=================================================================================================
//---------------- remove

/**
 * 指定したインデックスの配列要素の消去
 * 戻り値を配列に再び格納してください。
 *
 * @param index  消去するインデックス
 * @return 消去した配列
 */
fun ByteArray.remove(index: Int): ByteArray {
    return ArraysUtility.remove(this, index)
}

/**
 * 指定したインデックスの配列要素の消去
 * 戻り値を配列に再び格納してください。
 *
 * @param index  消去するインデックス
 * @return 消去した配列
 */
fun ShortArray.remove(index: Int): ShortArray {
    return ArraysUtility.remove(this, index)
}

/**
 * 指定したインデックスの配列要素の消去
 * 戻り値を配列に再び格納してください。
 *
 * @param index  消去するインデックス
 * @return 消去した配列
 */
fun IntArray.remove(index: Int): IntArray {
    return ArraysUtility.remove(this, index)
}

/**
 * 指定したインデックスの配列要素の消去
 * 戻り値を配列に再び格納してください。
 *
 * @param index  消去するインデックス
 * @return 消去した配列
 */
fun LongArray.remove(index: Int): LongArray {
    return ArraysUtility.remove(this, index)
}

/**
 * 指定したインデックスの配列要素の消去
 * 戻り値を配列に再び格納してください。
 *
 * @param index  消去するインデックス
 * @return 消去した配列
 */
fun FloatArray.remove(index: Int): FloatArray {
    return ArraysUtility.remove(this, index)
}

/**
 * 指定したインデックスの配列要素の消去
 * 戻り値を配列に再び格納してください。
 *
 * @param index  消去するインデックス
 * @return 消去した配列
 */
fun DoubleArray.remove(index: Int): DoubleArray {
    return ArraysUtility.remove(this, index)
}

/**
 * 指定したインデックスの配列要素の消去
 * 戻り値を配列に再び格納してください。
 *
 * @param index  消去するインデックス
 * @return 消去した配列
 */
fun BooleanArray.remove(index: Int): BooleanArray {
    return ArraysUtility.remove(this, index)
}
