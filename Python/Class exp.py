from typing import Any

class Stack:
    def __init__(self, *args :Any) -> None:
        self.Stack :list = []
        if args is not None:
            for element in args:
                self.push(element)
    def push(self, element :Any, *args) -> None:
        self.Stack.append(element)
        if args is not None:
            for data in args:
                self.Stack.append(data)
    def pop(self) -> Any:
        return self.Stack.pop()
    def __len__(self) -> int:
        return len(self.Stack)
    def showStack(self) -> list:
        return self.Stack
    def __repr__(self) -> str:
        return "Not Allowed"
    def __eq__(self, value) -> bool:
        if len(self.Stack)!=len(value):
            return False
        value=value.showStack()
        for i in range(len(self.Stack)):
            if self.Stack[i]!=value[i]:
                return False
        return True
A=Stack(23,432)
print(len(A))
A.push(34,65,69)
A.pop()
print(A)
B=Stack(23,432,342)
print(A.showStack())
print(A.pop())
print(A.showStack())
print(A==B)