package com.spotify.protocol.types;

import com.google.android.filament.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PlaybackSpeed implements Item {
    @dgto(a = "playback_speed")
    public final int playbackSpeed;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum PodcastPlaybackSpeed {
        PLAYBACK_SPEED_50(50),
        PLAYBACK_SPEED_80(80),
        PLAYBACK_SPEED_100(100),
        PLAYBACK_SPEED_120(R.styleable.AppCompatTheme_windowFixedHeightMajor),
        PLAYBACK_SPEED_150(150),
        PLAYBACK_SPEED_200(200),
        PLAYBACK_SPEED_300(cpnx.a);
        
        private final int mValue;

        PodcastPlaybackSpeed(int i) {
            this.mValue = i;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    protected PlaybackSpeed() {
        this(0);
    }

    public PlaybackSpeed(int i) {
        this.playbackSpeed = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.playbackSpeed == ((PlaybackSpeed) obj).playbackSpeed;
    }

    public int hashCode() {
        return this.playbackSpeed;
    }

    public String toString() {
        int i = this.playbackSpeed;
        StringBuilder sb = new StringBuilder(40);
        sb.append("PlaybackSpeed{playbackSpeed=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
