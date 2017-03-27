package com.su.learn.adapter;

public class MediaAdapter implements MediaPlayer {
	
	private AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType) {
		// TODO Auto-generated constructor stub
		if("vlc".equalsIgnoreCase(audioType)){
			advancedMediaPlayer = new VlcPlayer();
		}else if("mp4".equalsIgnoreCase(audioType)){
			advancedMediaPlayer = new Mp4Player();
		}
	}
	
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if("vlc".equalsIgnoreCase(audioType)){
			advancedMediaPlayer.playVlc(fileName);
		}else if("mp4".equalsIgnoreCase(audioType)){
			advancedMediaPlayer.playMp4(fileName);
		}
	}

}
