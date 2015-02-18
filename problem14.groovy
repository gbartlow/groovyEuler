//def example = [13, 40, 20, 10, 5, 16, 8, 4, 2, 1]
def collatz(i, memo){ 
  def chain = [i]
  while (memo[ chain[-1] ] == -1){
    def next = (chain[-1] % 2 == 0) ? chain[-1] / 2 : 3*chain[-1] + 1
    chain.add(next)
    println "${i}: chain is now " + chain
    println "With memo values: " + memo[1..i]
  }
  chain.eachWithIndex{ n, index -> memo[n] = chain.size()-1 - index + memo[ chain[-1] ]}
}
def memoChain = [-1] * 100
memoChain[1] = 1
1.upto(10){ println "Calling collatz on ${it}"
println memoChain
collatz(it, memoChain) }

memoChain




