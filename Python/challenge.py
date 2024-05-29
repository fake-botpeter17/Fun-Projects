for i  in range(100):
    n=i%8#34
    j=n#4
    if n>3:
        j=8-n
    if j==4:
        print(" "*4, end="")
    for _ in range(j%4):
        print(" ", end="")#3
    print("I hate you 🤢 {}%".format(i+1))