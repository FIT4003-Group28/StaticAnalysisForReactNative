package com.google.android.apps.gmm.car.api;
/* compiled from: PG */
@btsb
@ckol(a = "car-ignition-state")
/* loaded from: classes.dex */
public final class CarIgnitionStateEvent {
    private final jzm ignitionState;

    public CarIgnitionStateEvent(@ckoo(a = "id") int i) {
        jzm jzmVar;
        jzm[] values = jzm.values();
        int length = values.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                jzmVar = jzm.IGNITION_STATE_INVALID;
                break;
            }
            jzmVar = values[i2];
            if (jzmVar.h == i) {
                break;
            }
            i2++;
        }
        this.ignitionState = jzmVar;
    }

    public CarIgnitionStateEvent(jzm jzmVar) {
        this.ignitionState = jzmVar;
    }

    public jzm getIgnitionState() {
        return this.ignitionState;
    }

    @ckom(a = "id")
    public int getIgnitionStateId() {
        return this.ignitionState.h;
    }

    public String toString() {
        dbsb b = dbsc.b(this);
        b.b("ignitionState", this.ignitionState);
        return b.toString();
    }
}
