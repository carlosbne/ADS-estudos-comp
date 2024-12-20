#include <stdio.h>

int recurRestoDiv(n, d){
    if(n == 0 || d == 1){
        return 0; 
    } else if(n < d){
        return n;
    } else {
        return recurRestoDiv((n - d), d);
    }

}

int main(){
    int x = 17;
    int y = 3;

    printf("resultado %d", recurRestoDiv(x, y));
}