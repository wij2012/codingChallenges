array = [29, 42, 501]
result = "result"
#print("printing")
for i in array: 
    while i > 0:
        if(i % 10 != 7):
            i = (i - i % 10) / 10
            #print("while, if")
        
        else:
            result = "Boom!"
            print("while, else " + str(i))
            break
    
print("printing")

if(result == "Boom!"):
    print(result)
else:
    print("there is no 7 in the array")