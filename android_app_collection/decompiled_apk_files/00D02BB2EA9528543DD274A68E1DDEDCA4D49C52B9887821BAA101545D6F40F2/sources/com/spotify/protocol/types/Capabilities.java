package com.spotify.protocol.types;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Capabilities implements Item {
    @dgto(a = "can_play_on_demand")
    public final boolean canPlayOnDemand;

    private Capabilities() {
        this(false);
    }

    public Capabilities(boolean z) {
        this.canPlayOnDemand = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.canPlayOnDemand == ((Capabilities) obj).canPlayOnDemand;
    }

    public int hashCode() {
        return this.canPlayOnDemand ? 1 : 0;
    }

    public String toString() {
        boolean z = this.canPlayOnDemand;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Capabilities{canPlayOnDemand=");
        sb.append(z);
        sb.append('}');
        return sb.toString();
    }
}
