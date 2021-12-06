/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.finalproject;

import java.sql.Time;

/**
 *
 * @author caleb
 */
public class Players extends Teams{
    
    int monday[];
    int tuesday[];
    int wednesday[];
    int thursday[];
    int friday[];
    int saturday[];
    
    
    public Players()
    {
        
    }
    
    public Players(int a[])
    {
        monday[0] = 0;
    }
    
    public void setMonday(int a[])
    {
        System.arraycopy(a, 0, monday, 0, 12);
    }
    
    public int[] getMonday()
    {
        return monday;
    }
    
    public void setTuesday(int a[])
    {
        System.arraycopy(a, 12, tuesday, 0, 12);
    }
    
    public int[] getTuesday()
    {
        return tuesday;
    }
    
    public void setWednesday(int a[])
    {
        System.arraycopy(a, 24, wednesday, 0, 12);
    }
    
    public int[] getWednesday()
    {
        return wednesday;
    }
    
    public void setThursday(int a[])
    {
        System.arraycopy(a, 36, thursday, 0, 12);
    }
    
    public int[] getThursday()
    {
        return thursday;
    }
    
    public void setFriday(int a[])
    {
        System.arraycopy(a, 48, friday, 0, 12);
    }
    
    public int[] getFriday()
    {
        return friday;
    }
    
    public void setSaturday(int a[])
    {
        System.arraycopy(a, 60, saturday, 0, 12);
    }
    
    public int[] getSaturday()
    {
        return saturday;
    }
    
}
