package com.pfm.test;

import com.xiuye.speech.tts.TTSHelper;

public class TTSTest {

	public static void main(String[] args) {

		//TTSHelper.speakOnce("Hello world!");
		Thread t = new Thread(){
			@Override
			public void run() {
				TTSHelper.speakOnce("12345678");
			}
		};
		t.start();
		t = new Thread(){
			@Override
			public void run() {
				TTSHelper.speakOnce("12345678");
			}
		};
		t.start();
	}

}
