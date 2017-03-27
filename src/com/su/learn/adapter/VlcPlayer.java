package com.su.learn.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		//do nothing

	}

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing vlc file. fileName" + fileName);
	}

}
