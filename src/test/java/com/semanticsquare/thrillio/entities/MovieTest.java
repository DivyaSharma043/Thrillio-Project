/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.semanticsquare.thrillio.entities;

import com.semanticsqaure.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.constants.MovieGenre;
import org.junit.Test;
import static org.junit.Assert.*;

public class MovieTest {
    
    @Test
    public void testIsKidFriendlyEligible()
    {
    
        //Test 1 : movie genre is thriller --false
        Movie movie = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane","",1941,new String[] {"Orson Welles","Joseph Cotten"},new String[] {"Orson Welles"},MovieGenre.THRILLERS,8.5);
        
        boolean isKidFriendlyEligible = movie.isKidFriendlyEligible();
        
        assertFalse("For movie genre is thriller - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
                
        //Test 2 : movie genre is horror --false
        movie = BookmarkManager.getInstance().createMovie(3000,"Citizen Kane","",1941,new String[] {"Orson Welles","Joseph Cotten"},new String[] {"Orson Welles"},MovieGenre.HORROR,8.5);
        
        isKidFriendlyEligible = movie.isKidFriendlyEligible();
        
        assertFalse("For movie genre is horror - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
    }
    
    
    
}
