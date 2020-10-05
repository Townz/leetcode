package easy

/*
Complexity = O(n)
Explanation:
 */
class DefangingAnIpAddress {
    fun defangIPaddr(address: String): String {
        var defangedIpAddr = ""
        for(i in address.indices) {
            if(address[i] == '.') {
                defangedIpAddr += "[.]"
            } else {
                defangedIpAddr += address[i]
            }
        }

        return defangedIpAddr
    }

    fun defangIPaddr2(address: String): String {
        return address.replace(".", "[.]")
    }
}

/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.
A defanged IP address replaces every period "." with "[.]".

Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

 */