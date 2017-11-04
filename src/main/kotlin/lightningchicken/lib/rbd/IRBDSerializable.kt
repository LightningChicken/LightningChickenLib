package lightningchicken.lib.rbd

import raitichan.raitisapi.DataOperation.RBD.RBD

/**
 * RBDに変換可能であることを表すインターフェースです。
 * このインターフェースが実装されているクラスは、全てRBDとの相互変換が可能である必要があります。
 * @author toliner
 * @param T このインターフェースを継承しているクラスの型
 */
interface IRBDSerializable<out T> {

    /**
     * オブジェクトをRBDに変換します。
     * @return RBDに変換されたオブジェクトのデータ
     */
    fun serialize(): RBD

    /**
     * RBDをオブジェクトに変換します。
     * @param data 対象となるRBD
     * @return 変換後のこのオブジェクト
     */
    fun deserialize(data: RBD): T
}
