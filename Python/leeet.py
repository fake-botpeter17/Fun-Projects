class Solution:
    def convert(self, s: str, numRows: int) -> str:
        n=1
        table=dict()
        for i in range(numRows):
            dict[i]=list()
        for text,index in enumerate(s):
            table[(index+1)%numRows].append(text)
        
