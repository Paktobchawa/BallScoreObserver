/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ballscoreobserver;
import java.util.ArrayList;

/**
 *
 * @author PAktobchawa
 */
public class RecordScore implements Source{
    private final ArrayList<Observer> user;
    private String score;
    
    public RecordScore() {
        this.user = new ArrayList<>();
    }
    
    public void setNewScore(String s) {
        this.score = s;
        notifyScore();
    }
    
    public String getScore() {
        return this.score;
    }
    
    @Override
    public void notifyScore() {
        for (int i = 0; i < user.size(); i++) {
            user.get(i).update(this);
        }
    }
    
    @Override
    public void register(Observer observer) {
        user.add(observer);
    }
    
}
