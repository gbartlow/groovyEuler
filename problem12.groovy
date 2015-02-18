def factors(n) {
  smallFactors = (1..Math.round(Math.sqrt(n))+1).findAll{n % it == 0}
  smallFactors += smallFactors.collect{sf -> n/sf}
  smallFactors.unique()
  smallFactors.collect{x -> x as BigInteger }
}

def triangle(i){
  (i * (i + 1) / 2) as BigInteger
}

def i = 1
while (factors(triangle(i)).size() < 500){
  i++
  println "${triangle(i)} has ${factors(triangle(i)).size()} factors"
}

triangle(i)