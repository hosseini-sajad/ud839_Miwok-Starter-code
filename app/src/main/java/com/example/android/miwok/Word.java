package com.example.android.miwok;

public class Word {
    private String english;
    private String miwok;
    private int idImage = No_IMAGE_PROVIDED;
    private static final int No_IMAGE_PROVIDED = -1;
    private int audioId;

    public int getAudioId() {
        return audioId;
    }

    public void setAudioId(int audioId) {
        this.audioId = audioId;
    }

    public int getIdImage() {
        return idImage;
    }

    public String getEnglish() {
        return english;
    }

    public String getMiwok() {
        return miwok;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public void setMiwok(String miwok) {
        this.miwok = miwok;
    }

    public void setIdImage(int idImage) {
        this.idImage = idImage;
    }


    public Word(String english, String miwok, int idImage, int audioId) {
        setEnglish(english);
        setMiwok(miwok);
        setIdImage(idImage);
        setAudioId(audioId);
    }

    public Word(String english, String miwok, int audioId) {
        setEnglish(english);
        setMiwok(miwok);
        setAudioId(audioId);
    }

    public boolean hasImage() {
        return idImage != No_IMAGE_PROVIDED;
    }

}
