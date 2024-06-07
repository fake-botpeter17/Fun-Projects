from django.shortcuts import render

# Create your views here.

def home(request):
    result=None
    if request.method=='POST':
        num1=int(request.POST.get('num1'))
        num2=int(request.POST.get('num2'))
        operation=request.POST.get('operation')
        if operation=='add':
            result=num1+num2
        elif operation=='subtract':
            result==num1-num2
    return render(request,'home.html',{'result':result})
