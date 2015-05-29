def start = 2 as BigInteger
def digits = (start ** 1000).toString().toList()
digits = digits.collect{it as Integer}
digits.sum()