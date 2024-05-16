def countingSort(arr):
    max_element = max(arr)
    count = [0] * (max_element + 1)
    sorted_arr = [0] * len(arr)

    # Count occurrences of each element
    for num in arr:
        count[num] += 1

    # Calculate cumulative sum
    for i in range(1, len(count)):
        count[i] += count[i - 1]

    # Place elements in sorted order
    for num in reversed(arr):
        sorted_arr[count[num] - 1] = num
        count[num] -= 1

    return sorted_arr


v=[3,9,8,32,544,60]

print(countingSort(v))