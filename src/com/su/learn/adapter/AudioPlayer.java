package com.su.learn.adapter;

public class AudioPlayer implements MediaPlayer {
	
	private MediaAdapter mediaAdapter;

	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub
		if("mp3".equalsIgnoreCase(audioType)){
			System.out.println("Playing mp3 file. fileName:" + fileName);
		}else if("mp4".equalsIgnoreCase(audioType) || "vlc".equalsIgnoreCase(audioType)){
			mediaAdapter = new MediaAdapter(audioType);
			mediaAdapter.play(audioType, fileName);
		}else {
			System.out.println("Invalid media." + audioType + "format not supported.");
		}

	}

}
