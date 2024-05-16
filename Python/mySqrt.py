from os import system
from sys import float_repr_style
from time import sleep
class Solution(object):
    def mySqrt(self,Number,Precision=3,tolerance=.001):
        """
        :type x: int
        :rtype: int
        """
        #x_next=0.5(x+N/X)  -> HERON'S FORMULA
        x_current=Number 
        while True:
            x_next=0.5*(x_current+(Number/x_current))
            if abs((x_next-x_current)) < tolerance:
                return round(x_next,Precision)
            x_current=x_next
s=Solution()
def function_caller():
    n, p, t = [float(x) if x else None for x in input("Enter the number to find square root, precision, and tolerance:\nEnter three values separated by commas: \t").split(',')]
    print(s.mySqrt(int(n), p, t))
    
    
import unittest

class TestSolution(unittest.TestCase):
    def setUp(self):
        self.s = Solution()

    def test_basic(self):
        self.assertAlmostEqual(self.s.mySqrt(4, 3, 0.001), 2.0)

    def test_higher_precision(self):
        self.assertAlmostEqual(self.s.mySqrt(10, 5, 0.001), 3.16228, places=4)

    def test_different_tolerance(self):
        self.assertAlmostEqual(self.s.mySqrt(16, 2, 0.1), 4.0)

    def test_large_number(self):
        self.assertAlmostEqual(self.s.mySqrt(123456, 4, 0.001), 351.3631, places=4)

    def test_negative_number(self):
        self.assertIsNone(self.s.mySqrt(-9, 3, 0.001))

    def test_zero_precision(self):
        self.assertAlmostEqual(self.s.mySqrt(25, 0, 0.001), 5.0)

    def test_large_tolerance(self):
        self.assertAlmostEqual(self.s.mySqrt(100, 4, 10), 10.0)


if __name__ == '__main__':
    unittest.main()