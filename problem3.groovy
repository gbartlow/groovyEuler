def isPrime(n) {
  (2..Math.sqrt(n)).every { n % it != 0  } || n == 2
}

def factors(n) {
  smallFactors = (1..Math.round(Math.sqrt(n))+1).findAll{n % it == 0}
  smallFactors += smallFactors.collect{sf -> n/sf}
  smallFactors.sort().unique()
  smallFactors.collect{x -> x as BigInteger }
}

def primeFactors(n) {
  factors(n).findAll{x -> isPrime(x)}
}

println primeFactors(600851475143L)[-1]
