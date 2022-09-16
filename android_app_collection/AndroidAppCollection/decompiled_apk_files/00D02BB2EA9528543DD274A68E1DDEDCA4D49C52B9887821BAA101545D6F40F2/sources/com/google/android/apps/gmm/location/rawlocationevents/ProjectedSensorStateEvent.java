package com.google.android.apps.gmm.location.rawlocationevents;

import android.util.Base64;
/* compiled from: PG */
@ckor
@ckol(a = "projected-sensor-state", b = ckok.MEDIUM)
/* loaded from: classes.dex */
public class ProjectedSensorStateEvent {
    private ddwh projectedSensorState;

    public ProjectedSensorStateEvent(ddwh ddwhVar) {
        this.projectedSensorState = ddwhVar;
    }

    public ProjectedSensorStateEvent(@ckoo(a = "encoded") String str) {
        try {
            this.projectedSensorState = (ddwh) ((dssr) ddwh.f.cu(7)).i(ddae.e.j(str), dsqa.b());
        } catch (Exception unused) {
            this.projectedSensorState = ddwh.f;
        }
    }

    @ckom(a = "encoded")
    public String getEncoded() {
        return Base64.encodeToString(this.projectedSensorState.bS(), 11);
    }

    public ddwh getProjectedSensorState() {
        return this.projectedSensorState;
    }
}
