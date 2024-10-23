Leetcode problem-> 45
Group Anagrams
Link-> https://leetcode.com/problems/group-anagrams/description/

Approach 1 -> Using the sort function of the strings

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
      val len = strs.size  
      val mapData = hashMapOf<String, ArrayList<String>>()

      for(i in 0 until len) {
        val sortedStr = sortedStr(strs[i])
        if(mapData.containsKey(sortedStr)) {
            mapData[sortedStr]?.add(strs[i])
        } else
        {
            val list = mapData.getOrDefault(sortedStr, arrayListOf())
            list.add(strs[i])
            mapData[sortedStr(strs[i])] = list
        }
      }
      return mapData.values.toList()
    }

    fun sortedStr(str : String) : String {
        val charArr = str.toCharArray()
        charArr.sort()
        return charArr.joinToString("")
    }
}

T.C -> O(N * K*Log(K))
S.C. -> O(N*K)

Approach 2 -> Using frequency Array and generating the key to be added as a part of hashMap in key, instead to of sorted it and storing every time.

  class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
      val len = strs.size  
      val mapData = hashMapOf<String, ArrayList<String>>()

      for(i in 0 until len) {
        val count = IntArray(26) { 0 }

        for(s in strs[i].toCharArray()) {
           count[s-'a']++
        }

        val key = getKey(count)
        if(!mapData.containsKey(key)) mapData.put(key, arrayListOf())
         mapData.get(key)?.add(strs[i])
      }
      return mapData.values.toList()
    }

    fun getKey(count : IntArray): String {
     val s = StringBuilder()
     count.forEach {
        s.append(it)
        s.append("#")
     }
     return s.toString()
    }
}

  T.C -> O(N*K + N*A) A= 26
  S.C -> o(N*K + N*A) A= 26




  
