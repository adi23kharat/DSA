n = int(input("Enter your Number: "))
sum=0
# while n>0:
#   d = n%10
#   sum = sum+d
#   n = n//10

# print("Sum of Given number is : ",sum)

t = nf

while(n>0):
  sum = (sum*10) + n%10
  n = n//10

if(sum == t):
  print("Number is Palindrome")
else:
  print("Number is not Palindrome")
