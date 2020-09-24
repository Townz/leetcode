package easy

import java.util.Arrays

class JewelsAndStones {
    fun numJewelsInStones(J: String, S: String): Int {
        val jewels = J.toSet()
       return S.filter {jewels.contains(it) }.length
    }
}