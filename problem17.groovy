def onesPlace =      ["", "one", "two", "three", "four", "five", "six", 
                      "seven", "eight", "nine"]
def lessThanTwenty = ["ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                      "sixteen", "seventeen", "eighteen", "nineteen"]
def tens =           ["", "", "twenty", "thirty", "fourty", "fifty", "sixty", 
                      "seventy", "eighty", "ninety"]

def numToWord(i){
  def toReturn = ""
  assert i =< 1000 && i > 0
  if (i == 1000) "one thousand"
  if (i / 100 > 1){ 
    //needs the onesPlace word, follewed by " hundreed and "
    toReturn += numToWord( (i/100) as Integer ) + " hundred and "
  }
  i = i % 100
  //we have already added the hundreds place if neccessary, 
  // so just look at the last two digits
  if (i / 10 < 2){
    //special case: we are dealing with the teens and such
    