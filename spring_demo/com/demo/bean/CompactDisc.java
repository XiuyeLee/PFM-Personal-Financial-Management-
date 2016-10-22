package com.demo.bean;

import java.util.List;

public abstract class CompactDisc {

	private String title;
	private String artlist;



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getArtlist() {
		return artlist;
	}



	public void setArtlist(String artlist) {
		this.artlist = artlist;
	}
	private List<String> tracks;



	public List<String> getTracks() {
		return tracks;
	}



	public void setTracks(List<String> tracks) {

		this.tracks = tracks;
	}



	public abstract void playTrack(int number);

}
