#include <bits/stdc++.h>
#define pb push_back
#define For(i,a,b) for(int i=(a); i<(b); i++)
using namespace std;
int main(){
    int t;
    // file was meant to be source compiled
    cin >> t;
    if(t>100 || t<1) return 0;
    string c ="EQUINOX";
    while(t--){
        int S = 0,A = 0;
        int n;
        long int a,b;
        cin >> n >> a >> b;
        if(n>100 || n<1) return 0;
        if(a>1000000000 || a<1) return 0;
        if(b>1000000000 || b<1) return 0;
        while(n--){
            string s;
            cin >> s;
            int flag = 0;
            if(s.length() > 100 || s.length() < 1) return 0;
            for(int i=0; i<7; i++)
                if(s[0] == c[i]) flag = 1;
                cout << flag;
            if(flag) S += a;
            else A += b;
        }
        if(S > A) cout << "SARTHAK" << "\n";
        else if(S == A) cout << "DRAW" <<"\n";
        else cout << "ANURADHA" << "\n";
    }
    return 0;
}
