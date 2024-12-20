#include <stdio.h>

int powRecusivo(int a, int b){
    if(b == 0){
        return 1;
    } else {
        return a * powRecusivo(a, b-1);
    }
}

int main(){
    int a = 5;
    int b = 3;
    printf("returno total: %d\n", powRecusivo(a , b));
}