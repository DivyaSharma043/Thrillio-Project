package com.semanticsquare.thrillio;

import com.semanticsqaure.thrillio.managers.BookmarkManager;
import com.semanticsqaure.thrillio.managers.UserManager;
import com.semanticsquare.thrillio.entities.Bookmark;
import com.semanticsquare.thrillio.entities.User;

public class Launch {
    private static User[] users;
    private static Bookmark[][] bookmarks;
    
    private static void loadData()
    {
        System.out.println("\n1. Loading Data... ");
        DataStore.loadData();
        
        users = UserManager.getInstance().getUsers();
        bookmarks = BookmarkManager.getInstance().getBookmarks();
       
    }
    
    private static void start() {
        //System.out.println("\n3. Bookmarking ....");
        for (User user : users)
        {
            View.browse(user, bookmarks);
        }
         }
    public static void main(String[] args)
    {
        loadData();
        start();
    }

}
