def isPrime(n) { 
  (2..Math.sqrt(n)).every { n % it != 0 } || n == 2 
} 

def primeList = []
def i = 1
while (primeList.size() <= 10000) {
  if (isPrime(i)){
    primeList += i
  }
  i++
}

print primeList[-1]
  
assert isPrime(1) == false
assert isPrime(3)
assert isPrime(4) == false
assert isPrime(5)
assert isPrime(6) == false
