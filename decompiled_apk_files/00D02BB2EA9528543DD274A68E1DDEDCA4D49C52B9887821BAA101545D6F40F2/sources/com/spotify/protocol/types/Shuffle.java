package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Shuffle implements Item {
    @dgto(a = "shuffle")
    public final boolean shuffle;

    private Shuffle() {
        this(false);
    }

    public Shuffle(boolean z) {
        this.shuffle = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.shuffle == ((Shuffle) obj).shuffle;
    }

    public int hashCode() {
        return this.shuffle ? 1 : 0;
    }

    public String toString() {
        boolean z = this.shuffle;
        StringBuilder sb = new StringBuilder(22);
        sb.append("Shuffle{shuffle=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }
}
