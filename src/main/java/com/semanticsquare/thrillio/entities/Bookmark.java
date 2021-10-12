package com.semanticsquare.thrillio.entities;

import com.semanticsquare.thrillio.constants.KidFriendlyStatus;

public abstract class Bookmark {
    
    private long id;
    private String title;
    private String profileUrl;
    private String kidFriendlyStatus = KidFriendlyStatus.UNKNOWN;
    private User kidFreindlyMarkedBy;
    private User sharedBy;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }   
    
    public abstract boolean isKidFriendlyEligible(); 

    /**
     * @return the kidFriendlyStatus
     */
    public String getKidFriendlyStatus() {
        return kidFriendlyStatus;
    }

    /**
     * @param kidFriendlyStatus the kidFriendlyStatus to set
     */
    public void setKidFriendlyStatus(String kidFriendlyStatus) {
        this.kidFriendlyStatus = kidFriendlyStatus;
    }

    /**
     * @return the kidFreindlyMarkedBy
     */
    public User getKidFreindlyMarkedBy() {
        return kidFreindlyMarkedBy;
    }

    /**
     * @param kidFreindlyMarkedBy the kidFreindlyMarkedBy to set
     */
    public void setKidFreindlyMarkedBy(User kidFreindlyMarkedBy) {
        this.kidFreindlyMarkedBy = kidFreindlyMarkedBy;
    }

    /**
     * @return the sharedBy
     */
    public User getSharedBy() {
        return sharedBy;
    }

    /**
     * @param sharedBy the sharedBy to set
     */
    public void setSharedBy(User sharedBy) {
        this.sharedBy = sharedBy;
    }
}
