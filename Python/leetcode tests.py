class ListNode:
    def __init__(self, val=0, next = None) -> None:
        self.val=val
        self.next=next
def deleteDuplicates( head) -> ListNode:
        result = ListNode(head.val)
        temp=result
        seen=[]
        while True:
            if head.val not in seen:
                temp.next=ListNode(head.val)
                seen.append(head.val)
                temp=temp.next
            if head.val==None:
                 break
            head=head.next
        return result

l=ListNode(1)
a=l
a.next=ListNode(1)
a=a.next
a.next=ListNode(3)
'''while l.next:
     print(l.val)
     l=l.next

print(l.val)'''

result=deleteDuplicates(l)
while result.next:
     print(result.val)
     result=result.next

print(result.val)