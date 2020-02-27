a=dict()
f=('cse','ece','cse','sec','cse')
for i in f:
    if i not in a:
        a[i]=1
    else:
        a[i]=a[i]+1
        print(a)
 
