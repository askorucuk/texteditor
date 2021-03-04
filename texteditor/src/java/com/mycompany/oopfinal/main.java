/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.oopfinal;

import Commands.Button;
import Commands.LoadAction;
import Commands.SaveAction;
import Commands.SaveAsAction;
import Commands.SearchAction;
import Commands.UndoAction;
import editor.Frame;
import editor.Pane;

/**
 *
 * @author muham
 */
public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        
        
       
        Pane pane=new Pane();
        
        Frame frame=
                new Frame.Builder().
                        Search(new Button("search",new SearchAction(pane))).
                        Undo(new Button("undo",new UndoAction(pane))).
                        Save(new Button("save",new SaveAction(pane))).
                        SaveAs(new Button("save as",new SaveAsAction(pane))).
                        Load(new Button("load",new LoadAction(pane))).
                        build(pane);//builder design
        
        frame.openWindow();
        
        /**JMenuBar bar=new JMenuBar();
        bar.add(searchBut);
        bar.add(undoBut);
        bar.add(savebut);
        bar.add(saveAsbut);
        bar.add(loadbut);
        
        f.setJMenuBar(bar);
        
        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(555, 555);
        f.setVisible(true);**/
    }
}
