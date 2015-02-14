def isPalindrome(n){
  n as String == (n as String).reverse()
}

def threeDigitNum = (100..999).toList()
//def twoByTwo = []
//twoByTwo += twoDigitNum.collect{ item -> item * }
//print twoByTwo

//println twoDigitProduct.sort()

combos = [threeDigitNum, threeDigitNum].combinations()
combos = combos.collect{ x -> x[0] * x[1] }.sort().reverse().unique()
combos = combos.findAll{x -> isPalindrome(x)}
print combos

assert isPalindrome(12321)
assert isPalindrome(1221)
assert isPalindrome(12345) == false