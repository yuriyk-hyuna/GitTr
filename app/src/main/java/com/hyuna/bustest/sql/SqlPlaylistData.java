package com.hyuna.bustest.sql;


public class SqlPlaylistData {
    private SqlPlaylistData() {

    }

    private SqlPlaylistData(int playlistId
            , String author
            , String commposition
            , String duration
            , String href) {

        this.playlistId = playlistId;
        this.author = author;
        this.composition = commposition;
        this.duration = duration;
        this.href = href;
    }


    private int playlistId;
    private String author;
    private String composition;
    private String duration;
    private String href;


    public int getPlaylistId() {
        return playlistId;
    }

    public String getAuthor() {
        return author;
    }

    public String getComposition() {
        return composition;
    }

    public String getDuration() {
        return duration;
    }

    public String getHref() {
        return href;
    }

    public static Builder init() {
        return new Builder();
    }

    public static class Builder {

        private int playlistId;
        private String author;
        private String commposition;
        private String duration;
        private String href;

        private Builder() {

        }

        public Builder setPlaylistId(int playlistId) {
            this.playlistId = playlistId;

            return Builder.this;
        }

        public Builder setCommposition(String commposition) {
            this.commposition = commposition;
            return Builder.this;
        }

        public Builder setAuthor(String author) {
            this.author = author;
            return Builder.this;
        }

        public Builder setDuration(String duration) {
            this.duration = duration;
            return Builder.this;
        }

        public Builder setHref(String href) {
            this.href = href;
            return Builder.this;
        }

        public SqlPlaylistData build() {
            return new SqlPlaylistData(playlistId
                    , author, commposition
                    , duration
                    , href);
        }
    }
}
