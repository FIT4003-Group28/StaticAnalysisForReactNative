package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PlayerOptions implements Item {
    public static final PlayerOptions DEFAULT = new PlayerOptions();
    @dgto(a = "shuffle")
    public final boolean isShuffling;
    @dgto(a = "repeat")
    public final int repeatMode;

    private PlayerOptions() {
        this(false, 0);
    }

    public PlayerOptions(boolean z, int i) {
        this.isShuffling = z;
        this.repeatMode = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            PlayerOptions playerOptions = (PlayerOptions) obj;
            if (this.isShuffling == playerOptions.isShuffling && this.repeatMode == playerOptions.repeatMode) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.isShuffling ? 1 : 0) * 31) + this.repeatMode;
    }

    public String toString() {
        boolean z = this.isShuffling;
        int i = this.repeatMode;
        StringBuilder sb = new StringBuilder(56);
        sb.append("PlayerOptions{isShuffling=");
        sb.append(z);
        sb.append(", repeatMode=");
        sb.append(i);
        sb.append('}');
        return sb.toString();
    }
}
