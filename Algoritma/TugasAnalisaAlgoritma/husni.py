def bubble_sort(arr):
    n = len(arr)
    for i in range(n):
        for j in range(n-1):
            if arr[j] > arr[i]:
                arr[j], arr[i] = arr[i], arr[j]
    return arr

def merge_sort(arr):
    if len(arr) <= 1:
        return arr
    
    mid = len(arr) // 2
    left = arr[:mid]
    right = arr[mid:]

    left = merge_sort(left)
    right = merge_sort(right)

    return merge(left, right)

def quick_sort(arr):
    if len(arr) <= 1:
        return arr
    else:
        pivot = arr[0]
        less = [x for x in arr[1:] if x <= pivot]
        greater = [x for x in arr[1:] if x > pivot]
        return quick_sort(less) + [pivot] + quick_sort(greater)

def merge(left, right):
    result = []
    i = 0
    j = 0

    while i < len(left) and j < len(right):
        if left[i] <= right[j]:
            result.append(left[i])
            i += 1
        else:
            result.append(right[j])
            j += 1

    while i < len(left):
        result.append(left[i])
        i += 1

    while j < len(right):
        result.append(right[j])
        j += 1

    return result

def data():
    arr = input('Masukan data (pisahkan dengan koma): ')
    arr = arr.split(',')
    arr = [int(i) for i in arr]
    return arr

def main():
    while True:
        print('''
======== Menu ========
1. Bubble Sort
2. Quick Sort
3. Merge Sort
4. Keluar
======================
        ''')
        user = input("Pilih metode sort: ")
        try:
            user = int(user)
            if user == 4:
                run = False
                break
            else:
                run = True

            while run:
                match user:
                    case 1:
                        print(bubble_sort(data()))
                        break
                    case 2:
                        print(quick_sort(data()))
                        break
                    case 3:
                        print(merge_sort(data()))
                        break
                    case _:
                        print('Menu tidak tersedia')
        except:
            print('''
========== Peringatan ==========
Hanya boleh menginputkan angka
================================
        ''')
main()