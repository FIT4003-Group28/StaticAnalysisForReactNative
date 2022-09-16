package com.spotify.protocol.types;

import com.google.android.filament.R;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PlayerRestrictions implements Item {
    public static final PlayerRestrictions DEFAULT = new PlayerRestrictions();
    @dgto(a = "can_repeat_context")
    public final boolean canRepeatContext;
    @dgto(a = "can_repeat_track")
    public final boolean canRepeatTrack;
    @dgto(a = "can_seek")
    public final boolean canSeek;
    @dgto(a = "can_skip_next")
    public final boolean canSkipNext;
    @dgto(a = "can_skip_prev")
    public final boolean canSkipPrev;
    @dgto(a = "can_toggle_shuffle")
    public final boolean canToggleShuffle;

    private PlayerRestrictions() {
        this(false, false, false, false, false, false);
    }

    public PlayerRestrictions(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.canSkipNext = z;
        this.canSkipPrev = z2;
        this.canRepeatTrack = z3;
        this.canRepeatContext = z4;
        this.canToggleShuffle = z5;
        this.canSeek = z6;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PlayerRestrictions playerRestrictions = (PlayerRestrictions) obj;
            if (this.canSkipNext == playerRestrictions.canSkipNext && this.canSkipPrev == playerRestrictions.canSkipPrev && this.canRepeatTrack == playerRestrictions.canRepeatTrack && this.canRepeatContext == playerRestrictions.canRepeatContext && this.canToggleShuffle == playerRestrictions.canToggleShuffle) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((this.canSkipNext ? 1 : 0) * 31) + (this.canSkipPrev ? 1 : 0)) * 31) + (this.canRepeatTrack ? 1 : 0)) * 31) + (this.canRepeatContext ? 1 : 0)) * 31) + (this.canToggleShuffle ? 1 : 0);
    }

    public String toString() {
        boolean z = this.canSkipNext;
        boolean z2 = this.canSkipPrev;
        boolean z3 = this.canRepeatTrack;
        boolean z4 = this.canRepeatContext;
        boolean z5 = this.canToggleShuffle;
        StringBuilder sb = new StringBuilder((int) R.styleable.AppCompatTheme_windowNoTitle);
        sb.append("PlayerRestrictions{canSkipNext=");
        sb.append(z);
        sb.append(", canSkipPrev=");
        sb.append(z2);
        sb.append(", canRepeatTrack=");
        sb.append(z3);
        sb.append(", canRepeatContext=");
        sb.append(z4);
        sb.append(", canToggleShuffle=");
        sb.append(z5);
        sb.append('}');
        return sb.toString();
    }
}
