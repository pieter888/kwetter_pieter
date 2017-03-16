package Kwetter.backend;

import java.util.Calendar;
import java.util.List;

/**
 * Kweet
 *
 */
public class Kweet 
{
    public int kweetID;
    
    private String message;
    private User creator;
    private List<User> mentionedUsers;
    private List<String> hashtags;
    private Calendar postDateTime;
    
    public Kweet(User creator, String message)
    {
    	this.setMessage(message);
    	this.setCreator(creator);
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getCreator() {
		return creator;
	}

	public void setCreator(User creator) {
		this.creator = creator;
	}

	public List<User> getMentionedUsers() {
		return mentionedUsers;
	}

	public void setMentionedUsers(List<User> mentionedUsers) {
		this.mentionedUsers = mentionedUsers;
	}

	public List<String> getHashtags() {
		return hashtags;
	}

	public void setHashtags(List<String> hashtags) {
		this.hashtags = hashtags;
	}
	
	public Calendar getPostDateTime() {
		return postDateTime;
	}

	public void setPostDateTime(Calendar postDateTime) {
		this.postDateTime = postDateTime;
	}

}
