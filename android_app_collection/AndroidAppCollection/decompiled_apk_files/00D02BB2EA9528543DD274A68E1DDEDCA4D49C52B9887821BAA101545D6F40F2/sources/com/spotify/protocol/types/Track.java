package com.spotify.protocol.types;

import com.google.android.filament.R;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Track implements Item {
    @dgto(a = "album")
    public final Album album;
    @dgto(a = "artist")
    public final Artist artist;
    @dgto(a = "artists")
    public final List<Artist> artists;
    @dgto(a = "duration_ms")
    public final long duration;
    @dgto(a = "image_id")
    public final ImageUri imageUri;
    @dgto(a = "is_episode")
    public final boolean isEpisode;
    @dgto(a = "is_podcast")
    public final boolean isPodcast;
    @dgto(a = "name")
    public final String name;
    @dgto(a = "uri")
    public final String uri;

    private Track() {
        this(null, null, null, 0L, null, null, null, false, false);
    }

    public Track(Artist artist, List<Artist> list, Album album, long j, String str, String str2, ImageUri imageUri, boolean z, boolean z2) {
        this.artist = artist;
        this.artists = list;
        this.album = album;
        this.duration = j;
        this.name = str;
        this.uri = str2;
        this.imageUri = imageUri;
        this.isEpisode = z;
        this.isPodcast = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Track track = (Track) obj;
            if (this.duration != track.duration) {
                return false;
            }
            Artist artist = this.artist;
            if (artist == null ? track.artist != null : !artist.equals(track.artist)) {
                return false;
            }
            List<Artist> list = this.artists;
            if (list == null ? track.artists != null : !list.equals(track.artists)) {
                return false;
            }
            Album album = this.album;
            if (album == null ? track.album != null : !album.equals(track.album)) {
                return false;
            }
            String str = this.name;
            if (str == null ? track.name != null : !str.equals(track.name)) {
                return false;
            }
            String str2 = this.uri;
            if (str2 == null ? track.uri != null : !str2.equals(track.uri)) {
                return false;
            }
            ImageUri imageUri = this.imageUri;
            if (imageUri == null ? track.imageUri != null : imageUri.equals(track.imageUri)) {
                return false;
            }
            if (this.isEpisode == track.isEpisode && this.isPodcast == track.isPodcast) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        Artist artist = this.artist;
        int i = 0;
        int hashCode = (artist != null ? artist.hashCode() : 0) * 31;
        List<Artist> list = this.artists;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Album album = this.album;
        int hashCode3 = album != null ? album.hashCode() : 0;
        long j = this.duration;
        int i2 = (((hashCode2 + hashCode3) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        String str = this.name;
        int hashCode4 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.uri;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ImageUri imageUri = this.imageUri;
        if (imageUri != null) {
            i = imageUri.hashCode();
        }
        return ((((hashCode5 + i) * 31) + (this.isEpisode ? 1 : 0)) * 31) + (this.isPodcast ? 1 : 0);
    }

    public String toString() {
        String valueOf = String.valueOf(this.artist);
        String valueOf2 = String.valueOf(this.artists);
        String valueOf3 = String.valueOf(this.album);
        long j = this.duration;
        String str = this.name;
        String str2 = this.uri;
        String valueOf4 = String.valueOf(this.imageUri);
        boolean z = this.isEpisode;
        boolean z2 = this.isPodcast;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        int length3 = String.valueOf(valueOf3).length();
        int length4 = String.valueOf(str).length();
        int length5 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + R.styleable.AppCompatTheme_windowNoTitle + length2 + length3 + length4 + length5 + String.valueOf(valueOf4).length());
        sb.append("Track{artist=");
        sb.append(valueOf);
        sb.append(", artists=");
        sb.append(valueOf2);
        sb.append(", album=");
        sb.append(valueOf3);
        sb.append(", duration=");
        sb.append(j);
        sb.append(", name='");
        sb.append(str);
        sb.append('\'');
        sb.append(", uri='");
        sb.append(str2);
        sb.append('\'');
        sb.append(", imageId='");
        sb.append(valueOf4);
        sb.append('\'');
        sb.append(", isEpisode=");
        sb.append(z);
        sb.append(", isPodcast=");
        sb.append(z2);
        sb.append('}');
        return sb.toString();
    }
}
