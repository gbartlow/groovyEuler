def bTripples(int b){
  def toReturn = []
  
  for (a in 1..b){
    def c = Math.sqrt(a*a + b*b)
    if (Math.round(c) * Math.round(c) == c*c){ 
      toReturn.add([a, b, c as Integer])
    }
  }
  return toReturn
}

for (b in 4..500){
  //println "Pythoagorean tripples with middle #: ${b}"
  def trips = bTripples(b)
  def tripWithSum = trips.findAll{tripple -> tripple[0] + tripple[1] + tripple[2] == 1000}
  if ( tripWithSum.size()> 0){
    println tripWithSum
    println "product: " + tripWithSum[0][0] * tripWithSum[0][1] * tripWithSum[0][2]
  }
}