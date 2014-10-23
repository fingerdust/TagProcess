/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tagprocess;

/**
 *
 * @author mark
 */
class MyTime {
   int hour, min, sec;

   MyTime(int hour, int min, int sec) {
      this.hour = hour;
      this.min = min;
      this.sec = sec;
   }

   public String toString() {
       return String.format("%02d:%02d:%02d", hour, min, sec);
   }
}
