package com.example.app_nghe_nhac;

public class Music {
    private String singerAndSongwriter;
    private int img;
    private String lyrics;
    private String likes;
    private String time;
    private String category;


    public Music(String singerAndSongwriter, int img, String lyrics, String likes, String time, String category) {
        this.singerAndSongwriter = singerAndSongwriter;
        this.img = img;
        this.lyrics = lyrics;
        this.likes = likes;
        this.time = time;
        this.category = category;
    }

    public Music(String singerAndSongwriter, int img, String lyrics, String likes, String time) {
        this.singerAndSongwriter = singerAndSongwriter;
        this.img = img;
        this.lyrics = lyrics;
        this.likes = likes;
        this.time = time;
    }

    public Music() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getSingerAndSongwriter() {
        return singerAndSongwriter;
    }

    public void setSingerAndSongwriter(String singerAndSongwriter) {
        this.singerAndSongwriter = singerAndSongwriter;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getLyrics() {
        return lyrics;
    }

    public void setLyrics(String lyrics) {
        this.lyrics = lyrics;
    }

    public String getLikes() {
        return likes;
    }

    public void setLikes(String likes) {
        this.likes = likes;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
