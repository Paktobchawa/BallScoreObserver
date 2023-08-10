/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ballscoreobserver;
import java.util.Scanner;
/**
 *
 * @author PAktobchawa
 */
public class DisplayResult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegUser1 o1 = new RegUser1();
        RegUser2 o2 = new RegUser2();
        RecordScore rec = new RecordScore();
        
        rec.register(o1);
        rec.register(o2);
        String enterKey = "";
        String score ;
        Boolean finish = false;
        
        while (!finish) {
            System.out.print("Enter score: ");
            score = sc.nextLine();
            if (!(score.equals(enterKey))) {
                rec.setNewScore(score);
            } else {
                finish = true;
            }
        }
    }
}
