/*374. Guess Number Higher or Lower

        We are playing the Guess Game. The game is as follows:

        I pick a number from 1 to n. You have to guess which number I picked.

        Every time you guess wrong, I will tell you whether the number I picked is higher or lower than your guess.

        You call a pre-defined API int guess(int num), which returns three possible results:

        -1: Your guess is higher than the number I picked (i.e. num > pick).
        1: Your guess is lower than the number I picked (i.e. num < pick).
        0: your guess is equal to the number I picked (i.e. num == pick).
        Return the number that I picked.*/
//https://leetcode.com/problems/guess-number-higher-or-lower/description/


//solution
/*
package _06_searching.easy;

public class _02_guessNum_HigherLower {
    public static void main(String[] args) {

    }

    */
/**
     * Forward declaration of guess API.
     * @param  num   your guess
     * @return 	     -1 if num is higher than the picked number
     *			      1 if num is lower than the picked number
     *               otherwise return 0
     * int guess(int num);
     *//*


    public class Solution extends GuessGame {
        public int guessNumber(int n) {
            int start  = 1;
            int end = n;
            int mid ;
            while(start <= end){
                mid = start + (end - start) / 2;
                if(guess(mid) == 0){
                    return mid;
                }else if(guess(mid) == 1){
                    start = mid + 1;
                }else if(guess(mid) == -1){
                    end = mid - 1;
                }
            }
            return end;
        }
    }
}
*/
