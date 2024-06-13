def min_seq_sum(Arr: list) -> float:
    if len(Arr) == 0:
        return 0
    min_sum: float = float("inf")
    memo: dict = {0 : Arr[0]}   #Increases Space -> can be changed into a float variable to just save the latest value (i-1).
    for index,value in enumerate(Arr):
        if index == 0:
            continue
        if (memo[index - 1] + value) < value:
            memo[index] = memo[index - 1] + value
            if memo[index] < min_sum:
                min_sum=memo[index]
        else:
            memo[index] = value
            if value < min_sum:
                min_sum = value
    return min_sum

Array = [20, -7, -3, 9, -4, 6, -9, 10]
Array2 = [-7, 3, 4, -2, -3, 1, -3]
print(min_seq_sum(Array))
print(min_seq_sum(Array2))