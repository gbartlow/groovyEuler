sum = 0
1.upto(999){ number ->
  if (number % 3 == 0 || number % 5 == 0) {
    sum += number
  }
}
print sum