#include <cstring>
#include <assert.h>

void reverse(char *str) {
    if (str) {
        size_t len = strlen(str);
        char tmp;
        for (int i = 0; i < len / 2; i++) {
            tmp = str[i];
            str[i] = str[len - i - 1];
            str[len - i - 1] = tmp;
        }
    }
}

int main() {
    char mystr[] = "Hey C++";
    reverse(mystr);
    assert(strcmp(mystr, "++C yeH") == 0); 
    return 0;
}


