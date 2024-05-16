from pickle import dump
from barcode import Code39

n=Code39("Hello")


print(type(n))

print(n.build)
d=n.render()
h=n.build
f=open("Hello.svg", "wb")
dump(d,f)
g=open("Hello1.svg","wb")
dump(h,g)
f.close()
g.close()