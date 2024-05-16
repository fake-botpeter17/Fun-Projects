class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next=next

def addTwoNumbers(l1 :ListNode, l2 :ListNode) -> ListNode:
    added=ListNode((l1.val+l2.val)%10)
    carry_over=(l1.val+l2.val)//10
    current_node=added
    while (l1.next and l2.next):
        l1=l1.next
        l2=l2.next
        current_node.next=ListNode((l1.val+l2.val+carry_over)%10)
        carry_over=(l1.val+l2.val+carry_over)//10
        current_node=current_node.next

    while l1.next:
        l1=l1.next
        current_node.next=ListNode((l1.val+carry_over)%10)
        carry_over=(l1.val+carry_over)//10
        current_node=current_node.next
        
    while l2.next:
        l2=l2.next
        current_node.next=ListNode((l2.val+carry_over)%10)
        carry_over=(l2.val+carry_over)//10
        current_node=current_node.next
    
    if carry_over!=0:
        current_node.next=ListNode(carry_over)
    
    return added
 
# 345
List_=ListNode(5)
List_.next=ListNode(4)
List_=List_.next
List_.next=ListNode(3)

#155
List__=ListNode(5)
List__.next=ListNode(5)
List__.next.next=ListNode(1)

# 4011

add=addTwoNumbers(List_,List__)

while add.next:
    print(add.val,end="")
    add=add.next