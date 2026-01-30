list = []

a = int(input("Enter a number: "))
for i in range(a):
    method = input().split()
    if method[0] == "insert":
        list.insert((method[1]), (method[2]))
    elif method[0] == "print":
        print(list)
    elif method[0] == "remove":
        list.remove((method[1]))
    elif method[0] == "append":
        list.append((method[1]))
    elif method[0] == "sort":
        list.sort()
    elif method[0] == "pop":
        list.pop()
    elif method[0] == "reverse":
        list.reverse()
    else:
        pass       
