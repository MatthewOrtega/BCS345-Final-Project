/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject;

/**
 *
 * @author caleb
 */
public class Teams {
    
    String Game;
    String Coach;
    String Players[];
    
    public Teams()
    {
        
    }
    
    public Teams(String a[])
    {
        Game = a[0];
        Coach = a[1];
        
    }
    
    public void setGame(String a[])
    {
     Game = a[0];   
    }
    
    public String getGame()
    {
        return Game;
    }
    
    public void setCoach(String a[])
    {
        Coach = a[1];
    }
    
    public String getCoach()
    {
        return Coach;
    }
    
    public void setPlayer(String a[])
    {
       
        for (int i = 2; i<10; i++)
        {
            Players[i-2] = a[i];
        }
    }
    
    public String[] getPlayer()
    {
        return Players;
        
    }
    
    
            
    
}
