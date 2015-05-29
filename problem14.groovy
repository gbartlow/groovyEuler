//def example = [13, 40, 20, 10, 5, 16, 8, 4, 2, 1]
def collatz(i, memo){ 
  //println "Collatz ${i}"
  def chain = [i]
  while (memo[chain[-1]] == null){
    chain += ((chain[-1] % 2 == 0) ? chain[-1] / 2 : 3*chain[-1] + 1) as BigInteger
    //println "${i}: ${chain}"
    assert chain[-1] > 0
  }
  def seqLength = chain.size()
  chain.eachWithIndex{ n, index -> 
                       //println "n = ${n}, i = ${index}"
                       memo[n] = (seqLength - 1 - index) + memo[ chain[-1] ]
                     }
}
def lengthMap = [(1 as BigInteger):1]

1.upto(1000000){
  collatz(it, lengthMap)
}

//println lengthMap.size()
def maxLength = lengthMap.values().max()
println lengthMap.find{ it.value == maxLength }



