package com.su.learn.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub
		System.out.println("Playing Mp4 file. fileName:" + fileName);

	}

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub
		//do nothing
	}

}
