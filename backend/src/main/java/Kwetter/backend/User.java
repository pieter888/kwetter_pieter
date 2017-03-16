package Kwetter.backend;

import java.util.List;

/**
 * User
 *
 */
public class User 
{
    public int userID;
    
    private String infoName;
    private String infoLocation;
    private String infoWeb;
    private String infoBio;
    private List<User> followers;
    private List<User> following;
    private List<Kweet> kweets; 
    
    public User()
    {
    	
    }

	public String getInfoName() {
		return infoName;
	}

	public void setInfoName(String infoName) {
		this.infoName = infoName;
	}

	public String getInfoLocation() {
		return infoLocation;
	}

	public void setInfoLocation(String infoLocation) {
		this.infoLocation = infoLocation;
	}

	public String getInfoWeb() {
		return infoWeb;
	}

	public void setInfoWeb(String infoWeb) {
		this.infoWeb = infoWeb;
	}

	public List<User> getFollowers() {
		return followers;
	}

	public void setFollowers(List<User> followers) {
		this.followers = followers;
	}

	public String getInfoBio() {
		return infoBio;
	}

	public void setInfoBio(String infoBio) {
		this.infoBio = infoBio;
	}

	public List<User> getFollowing() {
		return following;
	}

	public void setFollowing(List<User> following) {
		this.following = following;
	}

	public List<Kweet> getKweets() {
		return kweets;
	}

	public void setKweets(List<Kweet> kweets) {
		this.kweets = kweets;
	}
}
