/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.semanticsquare.thrillio.entities;

import com.semanticsqaure.thrillio.managers.BookmarkManager;
import com.semanticsquare.thrillio.constants.BookGenre;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hp
 */
public class BookTest {
    
   @Test
    public void testIsKidFriendlyEligible()
    {
    
        //Test 1 : book genre is philosophy --false
        Book book = BookmarkManager.getInstance().createBook(4000,"Walden",1854,"Wilder Publications", new String[] {"Henry David Thoreau"}, BookGenre.PHILOSOPHY, 8.9);
        
        boolean isKidFriendlyEligible = book.isKidFriendlyEligible();
        
        assertFalse("For book genre is philosophy - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
                
        //Test 2 : book genre is Self help --false
        book = BookmarkManager.getInstance().createBook(4000,"Walden",1854,"Wilder Publications", new String[] {"Henry David Thoreau"}, BookGenre.SELF_HELP, 8.9);
        
        isKidFriendlyEligible = book.isKidFriendlyEligible();
        
        assertFalse("For book genre is self help - isKidFriendlyEligible() must return false", isKidFriendlyEligible);
    }
    
}
