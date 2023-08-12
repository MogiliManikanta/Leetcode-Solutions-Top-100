// // class Solution {
// //     public int reverse(int x) {
// //         long finalNum = 0;
// //         while(x!=0){
// //             int lastDig = x%10;
// //             finalNum += lastDig;
// //             finalNum = finalNum*10;
// //             x= x/10;
// //         }
// //         finalNum = finalNum/10;
// //         if(finalNum > Integer.MAX_VALUE || finalNum<Integer.MIN_VALUE){
// //             return 0;
// //         }
// //         if(x<0){
// //             return (int)(-1*finalNum);
// //         }
// //         return (int)finalNum;
// //     }
// // }


class Solution {
    public int reverse(int x) {
        long res = 0;
        while (x != 0) {
            int temp = x%10;
            res = res*10+temp;
            x=x/10;
        }
        return (int)res == res ? (int)res : 0;
    }
}