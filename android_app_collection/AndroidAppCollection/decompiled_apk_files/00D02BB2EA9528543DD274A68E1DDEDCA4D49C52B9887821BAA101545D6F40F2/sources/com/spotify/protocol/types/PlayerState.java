package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PlayerState implements Item {
    @dgto(a = "is_paused")
    public final boolean isPaused;
    @dgto(a = "playback_options")
    public final PlayerOptions playbackOptions;
    @dgto(a = "playback_position")
    public final long playbackPosition;
    @dgto(a = "playback_restrictions")
    public final PlayerRestrictions playbackRestrictions;
    @dgto(a = "playback_speed")
    public final float playbackSpeed;
    @dgto(a = "track")
    public final Track track;

    private PlayerState() {
        this(null, false, 0.0f, 0L, null, null);
    }

    public PlayerState(Track track, boolean z, float f, long j, PlayerOptions playerOptions, PlayerRestrictions playerRestrictions) {
        this.track = track;
        this.isPaused = z;
        this.playbackSpeed = f;
        this.playbackPosition = j;
        this.playbackOptions = playerOptions == null ? PlayerOptions.DEFAULT : playerOptions;
        this.playbackRestrictions = playerRestrictions == null ? PlayerRestrictions.DEFAULT : playerRestrictions;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PlayerState playerState = (PlayerState) obj;
        if (this.isPaused != playerState.isPaused || Float.compare(playerState.playbackSpeed, this.playbackSpeed) != 0 || this.playbackPosition != playerState.playbackPosition) {
            return false;
        }
        Track track = this.track;
        if (track == null ? playerState.track != null : !track.equals(playerState.track)) {
            return false;
        }
        PlayerOptions playerOptions = this.playbackOptions;
        if (playerOptions == null ? playerState.playbackOptions != null : !playerOptions.equals(playerState.playbackOptions)) {
            return false;
        }
        PlayerRestrictions playerRestrictions = this.playbackRestrictions;
        if (playerRestrictions != null) {
            return playerRestrictions.equals(playerState.playbackRestrictions);
        }
        return playerState.playbackRestrictions == null;
    }

    public int hashCode() {
        Track track = this.track;
        int i = 0;
        int hashCode = (((track != null ? track.hashCode() : 0) * 31) + (this.isPaused ? 1 : 0)) * 31;
        float f = this.playbackSpeed;
        int floatToIntBits = f != 0.0f ? Float.floatToIntBits(f) : 0;
        long j = this.playbackPosition;
        int i2 = (((hashCode + floatToIntBits) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        PlayerOptions playerOptions = this.playbackOptions;
        int hashCode2 = (i2 + (playerOptions != null ? playerOptions.hashCode() : 0)) * 31;
        PlayerRestrictions playerRestrictions = this.playbackRestrictions;
        if (playerRestrictions != null) {
            i = playerRestrictions.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        String valueOf = String.valueOf(this.track);
        boolean z = this.isPaused;
        float f = this.playbackSpeed;
        long j = this.playbackPosition;
        String valueOf2 = String.valueOf(this.playbackOptions);
        String valueOf3 = String.valueOf(this.playbackRestrictions);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 146 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("PlayerState{track=");
        sb.append(valueOf);
        sb.append(", isPaused=");
        sb.append(z);
        sb.append(", playbackSpeed=");
        sb.append(f);
        sb.append(", playbackPosition=");
        sb.append(j);
        sb.append(", playbackOptions=");
        sb.append(valueOf2);
        sb.append(", playbackRestrictions=");
        sb.append(valueOf3);
        sb.append('}');
        return sb.toString();
    }
}
