/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ballscoreobserver;

/**
 *
 * @author PAktobchawa
 */
public class RegUser2 implements Observer{
    @Override
    public void update(Source s) {
        System.out.println("(2)live result: " + ((RecordScore)s).getScore());
    }
}
