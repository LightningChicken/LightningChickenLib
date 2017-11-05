@file:Suppress("UNUSED")
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

/**
 * 指定した配列を全て1つの配列にまとめます。
 *
 * @param addArrays 追加する配列
 * @return 追加後の配列
 */
fun <T> Array<T>.addAll(vararg addArrays: BooleanArray): Array<T> {
    addArrays.forEach { ArraysUtility.addAll(this, it) }
    return this
}

//=================================================================================================
//---------------- remove

/**
 * 指定したインデックスの配列要素の消去
 *
 * @param index  消去するインデックス
 * @return 消去した配列
 */
fun ByteArray.remove(index: Int): ByteArray {
    return ArraysUtility.remove(this, index)
}

/**
 * 指定したインデックスの配列要素の消去
 *
 * @param index  消去するインデックス
 * @return 消去した配列
 */
fun ShortArray.remove(index: Int): ShortArray {
    return ArraysUtility.remove(this, index)
}

/**
 * 指定したインデックスの配列要素の消去
 *
 * @param index  消去するインデックス
 * @return 消去した配列
 */
fun IntArray.remove(index: Int): IntArray {
    return ArraysUtility.remove(this, index)
}

/**
 * 指定したインデックスの配列要素の消去
 *
 * @param index  消去するインデックス
 * @return 消去した配列
 */
fun LongArray.remove(index: Int): LongArray {
    return ArraysUtility.remove(this, index)
}

/**
 * 指定したインデックスの配列要素の消去
 *
 * @param index  消去するインデックス
 * @return 消去した配列
 */
fun FloatArray.remove(index: Int): FloatArray {
    return ArraysUtility.remove(this, index)
}

/**
 * 指定したインデックスの配列要素の消去
 *
 * @param index  消去するインデックス
 * @return 消去した配列
 */
fun DoubleArray.remove(index: Int): DoubleArray {
    return ArraysUtility.remove(this, index)
}

/**
 * 指定したインデックスの配列要素の消去
 *
 * @param index  消去するインデックス
 * @return 消去した配列
 */
fun BooleanArray.remove(index: Int): BooleanArray {
    return ArraysUtility.remove(this, index)
}

/**
 * 指定したインデックスの配列要素の消去
 *
 * @param index  消去するインデックス
 * @return 消去した配列
 */
fun <T> Array<T>.remove(index: Int): Array<T> {
    ArraysUtility.remove(this, index)
    return this
}

//=================================================================================================

/**
 * 配列の中から指定した番地から指定した数の要素を消去します。
 *
 * @param index  消去するインデックス
 * @param length 消去する数
 * @return 消去した配列
 */
fun ByteArray.remove(index: Int, length: Int): ByteArray {
    return ArraysUtility.remove(this, index, length)
}

/**
 * 配列の中から指定した番地から指定した数の要素を消去します。
 *
 * @param index  消去するインデックス
 * @param length 消去する数
 * @return 消去した配列
 */
fun ShortArray.remove(index: Int, length: Int): ShortArray {
    return ArraysUtility.remove(this, index, length)
}

/**
 * 配列の中から指定した番地から指定した数の要素を消去します。
 *
 * @param index  消去するインデックス
 * @param length 消去する数
 * @return 消去した配列
 */
fun IntArray.remove(index: Int, length: Int): IntArray {
    return ArraysUtility.remove(this, index, length)
}

/**
 * 配列の中から指定した番地から指定した数の要素を消去します。
 *
 * @param index  消去するインデックス
 * @param length 消去する数
 * @return 消去した配列
 */
fun FloatArray.remove(index: Int, length: Int): FloatArray {
    return ArraysUtility.remove(this, index, length)
}

/**
 * 配列の中から指定した番地から指定した数の要素を消去します。
 *
 * @param index  消去するインデックス
 * @param length 消去する数
 * @return 消去した配列
 */
fun DoubleArray.remove(index: Int, length: Int): DoubleArray {
    return ArraysUtility.remove(this, index, length)
}

/**
 * 配列の中から指定した番地から指定した数の要素を消去します。
 *
 * @param index  消去するインデックス
 * @param length 消去する数
 * @return 消去した配列
 */
fun BooleanArray.remove(index: Int, length: Int): BooleanArray {
    return ArraysUtility.remove(this, index, length)
}

/**
 * 配列の中から指定した番地から指定した数の要素を消去します。
 *
 * @param index  消去するインデックス
 * @param length 消去する数
 * @return 消去した配列
 */
fun <T> Array<T>.remove(index: Int, length: Int): Array<T> {
    ArraysUtility.remove(this, index, length)
    return this
}


//=================================================================================================

/**
 * 配列の中から、Rangeに含まれる番地の要素を削除します。
 *
 * @param range 消去するindexのRange
 */
fun ByteArray.remove(range: IntRange): ByteArray {
    val iterator = range.step(range.step - 1).iterator()
    while (iterator.hasNext()) {
        ArraysUtility.remove(this, iterator.nextInt())
    }
    return this
}

/**
 * 配列の中から、Rangeに含まれる番地の要素を削除します。
 *
 * @param range 消去するindexのRange
 */
fun ShortArray.remove(range: IntRange): ShortArray {
    val iterator = range.step(range.step - 1).iterator()
    while (iterator.hasNext()) {
        ArraysUtility.remove(this, iterator.nextInt())
    }
    return this
}

/**
 * 配列の中から、Rangeに含まれる番地の要素を削除します。
 *
 * @param range 消去するindexのRange
 */
fun IntArray.remove(range: IntRange): IntArray {
    val iterator = range.step(range.step - 1).iterator()
    while (iterator.hasNext()) {
        ArraysUtility.remove(this, iterator.nextInt())
    }
    return this
}

/**
 * 配列の中から、Rangeに含まれる番地の要素を削除します。
 *
 * @param range 消去するindexのRange
 */
fun FloatArray.remove(range: IntRange): FloatArray {
    val iterator = range.step(range.step - 1).iterator()
    while (iterator.hasNext()) {
        ArraysUtility.remove(this, iterator.nextInt())
    }
    return this
}

/**
 * 配列の中から、Rangeに含まれる番地の要素を削除します。
 *
 * @param range 消去するindexのRange
 */
fun DoubleArray.remove(range: IntRange): DoubleArray {
    val iterator = range.step(range.step - 1).iterator()
    while (iterator.hasNext()) {
        ArraysUtility.remove(this, iterator.nextInt())
    }
    return this
}

/**
 * 配列の中から、Rangeに含まれる番地の要素を削除します。
 *
 * @param range 消去するindexのRange
 */
fun BooleanArray.remove(range: IntRange): BooleanArray {
    val iterator = range.step(range.step - 1).iterator()
    while (iterator.hasNext()) {
        ArraysUtility.remove(this, iterator.nextInt())
    }
    return this
}

/**
 * 配列の中から、Rangeに含まれる番地の要素を削除します。
 *
 * @param range 消去するindexのRange
 */
fun <T> Array<T>.remove(range: IntRange): Array<T> {
    val iterator = range.step(range.step - 1).iterator()
    while (iterator.hasNext()) {
        ArraysUtility.remove(this, iterator.nextInt())
    }
    return this
}

//=================================================================================================
//---------------- print

/**
 * 配列の要素をすべて標準出力に出力します。
 */
fun ByteArray.print() {
    ArraysUtility.arraysPrint(this)
}

/**
 * 配列の要素をすべて標準出力に出力します。
 */
fun IntArray.print() {
    ArraysUtility.arraysPrint(this)
}

/**
 * 配列の要素をすべて標準出力に出力します。
 */
fun Array<*>.print() {
    ArraysUtility.arraysPrint(this)
}
