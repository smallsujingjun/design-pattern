package com.su.learn.adapter;

public class AdapterPatternDemo {
	
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.play("mp3", "beyond the horizon.mp3");
		audioPlayer.play("mp4", "lone.mp4");
		audioPlayer.play("vlc", "far far away.vlc");
		audioPlayer.play("avi", "the day before yesterday.avi");
	}

}
