package com.google.android.apps.gmm.location.rawlocationevents;
/* compiled from: PG */
@btsb
@ckor
@ckol(a = "satellite-status", b = ckok.HIGH)
/* loaded from: classes.dex */
public class SatelliteStatusEvent {
    private final boolean mightBeDeadReckoned;
    private final int numUsedInFix;

    public SatelliteStatusEvent(@ckoo(a = "numUsedInFix") int i, @ckoo(a = "maybeDR", b = "false") boolean z) {
        this.numUsedInFix = i;
        this.mightBeDeadReckoned = z;
    }

    public boolean equals(@dzsi Object obj) {
        return (obj instanceof SatelliteStatusEvent) && this.numUsedInFix == ((SatelliteStatusEvent) obj).numUsedInFix;
    }

    @ckom(a = "maybeDR")
    public boolean getMightBeDeadReckoned() {
        return this.mightBeDeadReckoned;
    }

    @ckom(a = "numUsedInFix")
    public int getNumUsedInFix() {
        return this.numUsedInFix;
    }

    public int hashCode() {
        return this.numUsedInFix;
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.f("numUsedInFix", this.numUsedInFix);
        b.h("maybeDR", this.mightBeDeadReckoned);
        return b.toString();
    }
}
