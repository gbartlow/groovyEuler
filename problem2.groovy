current = 1
next    = 1
max = 4000000
sum = 0
while (current < max) {
  //print current + ' '
  newCurrent = next
  next = next + current
  current = newCurrent
  if (current % 2 == 0) sum += current
}
print sum