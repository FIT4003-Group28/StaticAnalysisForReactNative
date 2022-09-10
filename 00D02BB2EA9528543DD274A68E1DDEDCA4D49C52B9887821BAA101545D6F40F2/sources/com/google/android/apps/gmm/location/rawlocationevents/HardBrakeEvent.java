package com.google.android.apps.gmm.location.rawlocationevents;

import android.util.Base64;
/* compiled from: PG */
@ckor
@ckol(a = "hard-brake", b = ckok.HIGH)
/* loaded from: classes.dex */
public class HardBrakeEvent {
    private ddtk accelerationEvent;
    private final long timestampMillis;

    public HardBrakeEvent(long j, ddtk ddtkVar) {
        this.timestampMillis = j;
        this.accelerationEvent = ddtkVar;
    }

    public HardBrakeEvent(@ckoo(a = "timeMs", d = true) long j, @ckoo(a = "encoded") String str) {
        try {
            this.accelerationEvent = (ddtk) ((dssr) ddtk.f.cu(7)).i(ddae.e.j(str), dsqa.b());
        } catch (Exception unused) {
            this.accelerationEvent = ddtk.f;
        }
        this.timestampMillis = j;
    }

    public ddtk getAccelerationEvent() {
        return this.accelerationEvent;
    }

    @ckom(a = "encoded")
    public String getEncoded() {
        return Base64.encodeToString(this.accelerationEvent.bS(), 11);
    }

    @ckom(a = "timeMs")
    public long getTimestampMillis() {
        return this.timestampMillis;
    }
}
