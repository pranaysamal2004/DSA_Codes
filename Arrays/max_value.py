def find_max(arr, n):
    max_val = arr[0]
    for i in range(1, n):
        if arr[i] > max_val:
            max_val = arr[i]
    return max_val

n = int(input("Enter the number of elements in the array: "))
arr = list(map(int, input("Enter the elements of the array: ").split()))

max_val = find_max(arr, n)
print("The maximum value in the array is:", max_val)
