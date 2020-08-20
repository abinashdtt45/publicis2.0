def capitals(word):
    letters = [c for c in word]
    final_ans=[]
    for i,val in enumerate(letters):
        if(val.isupper()):
            final_ans.append(i)
    return final_ans