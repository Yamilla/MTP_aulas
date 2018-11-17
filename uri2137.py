n = int(input()) #número de codigos a serem inseridos
entrada = 0
list = []
while(entrada != -1):

    for i in range(n):
        cod = input()
        list.append(cod)

        if len(list) == n:
            list.sort()

            for i in range (len(list)):
                print("{}".format(list[i]))
    entrada = input()

'''
3
1233
0015
0100
7
0752
1110
0001
6322
8000
6321
0000
'''