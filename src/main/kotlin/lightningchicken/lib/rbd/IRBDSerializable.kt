package lightningchicken.lib.rbd

import raiti.RaitisAPI.DataOperation.RBD.RBD

interface IRBDSerializable<out T> {

    fun serialize(): RBD

    fun deserialize(data: RBD): T
}