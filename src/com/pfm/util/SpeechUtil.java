package com.pfm.util;

import com.xiuye.speech.tts.TTSHelper;

public class SpeechUtil {

	private static Object lock;

	private static void startNewThreads(Runnable runnable) {
		Thread t = new Thread(runnable);
		t.start();
	}

	public static void speakOnce(final String msg) {
		Runnable run = new Runnable() {
			@Override
			public void run() {
				synchronized (SpeechUtil.class) {
					TTSHelper.speakOnce(msg);
				}
			}
		};
		startNewThreads(run);
	}

	public static void readFile(final String fileName) {
		Runnable run = new Runnable() {
			@Override
			public void run() {
				synchronized (SpeechUtil.class) {
					TTSHelper.readFile(fileName);
				}
			}
		};
		startNewThreads(run);

	}

	public static void readOnceFile(final String fileName) {
		Runnable run = new Runnable() {
			@Override
			public void run() {
				synchronized (SpeechUtil.class) {
					TTSHelper.readOnceFile(fileName);
				}
			}
		};
		startNewThreads(run);

	}

	public static void readOnceString(final String str) {
		Runnable run = new Runnable() {
			@Override
			public void run() {
				synchronized (SpeechUtil.class) {
					TTSHelper.readOnceString(str);
				}
			}
		};
		startNewThreads(run);
	}

	public static void readString(final String str) {
		Runnable run = new Runnable() {
			@Override
			public void run() {
				synchronized (SpeechUtil.class) {
					TTSHelper.readString(str);
				}
			}
		};
		startNewThreads(run);
	}

	public static void speak(final String msg) {
		Runnable run = new Runnable() {
			@Override
			public void run() {
				synchronized (SpeechUtil.class) {
					TTSHelper.speak(msg);
				}
			}
		};
		startNewThreads(run);
	}

	public static void setVoice(int voice){
		TTSHelper.setVoice(voice);
	}
	public static void setSpeed(int speed){
		TTSHelper.setSpeed(speed);
	}
	public static void setVolume(int volume){
		TTSHelper.setSpeed(volume);
	}
	public static void release(){
		TTSHelper.release();
	}


}
