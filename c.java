#include <stdio.h>
#include <math.h>
#include <limits.h>

#define DIGITS_TO_REMOVE 3 

int recurse(int* foo, int begin, int end, int previous, int max){
    int o;
    int m=begin;
    for (o=begin;o<=end;++o){
        if(foo[m]>foo[o]){
            m=o;}}
    return previous * pow(10,max-end+1)+(max>end?recurse(foo,m+1,end+1,foo[m],max):foo[m]);}
int main(void){
    int foo[(const int)ceil(log10(INT_MAX))];
    int bar = 24635;
    int size =ceil(log10(bar));
    int o;
    int m=size-DIGITS_TO_REMOVE;
    for (o=1;bar>0;bar/=10,++o){
        foo[size - o] = bar % 10;
        if (o>=DIGITS_TO_REMOVE && foo[size-o]<=foo[m]){
            m=size-o;}}
    printf("%d",recurse(foo,m+1,DIGITS_TO_REMOVE+1,foo[m],size-1));
    return 0;
}