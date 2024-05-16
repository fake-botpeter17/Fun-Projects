from random import randint as r
from time import sleep
valid=False
while valid!=True:
    try:
        n=int(input("Entert the number of die to roll:"))
        if n<0 or n>3:
            raise Exception
        valid=True
    except:
        print("Enter a valid number")
while True:
    input("Press Enter to roll the dice.")
    results=[]
    for _ in range(n):
        results.append(r(1,6))
    print("Rolling Dice......")
    sleep(.5)
    for _ in range(len(results)):
        if _==0:
            print("{}".format(results[0]),end="")
        else:
            print(", {}".format(results[_]),end="")
    print("\nTotal: {}".format(sum(results)))