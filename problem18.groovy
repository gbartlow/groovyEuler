def triangle = []

def fileName = "problem18.text"
new File(fileName).eachLine { line ->
  triangle.add(line.trim().split().collect{ it as Integer } )
}

rows = triangle.size
rowsLeft = rows

while (triangle.size > 1){
  def lastRow = triangle.pop().collect{ it as Integer }
  println "Popping: " + lastRow 

  rowsLeft--
  def toAdd = []
  1.upto(rowsLeft) {toAdd.add(Math.max(lastRow[it], lastRow[it - 1]))}
  println "Adding to next row: " + toAdd
  
  println "Next Row: " + triangle[rowsLeft-1]

  0.upto(rowsLeft-1) { triangle[rowsLeft-1][it] += toAdd[it] } 

  println triangle[rowsLeft-1]
  assert lastRow.size == rowsLeft + 1
  
}



