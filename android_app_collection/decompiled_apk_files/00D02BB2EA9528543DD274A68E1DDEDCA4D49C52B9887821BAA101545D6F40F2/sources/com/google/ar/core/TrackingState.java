package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public enum TrackingState {
    TRACKING(0),
    PAUSED(1),
    STOPPED(2);
    
    final int nativeCode;

    TrackingState(int i) {
        this.nativeCode = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TrackingState forNumber(int i) {
        TrackingState[] values;
        for (TrackingState trackingState : values()) {
            if (trackingState.nativeCode == i) {
                return trackingState;
            }
        }
        StringBuilder sb = new StringBuilder(60);
        sb.append("Unexpected value for native TrackingState, value=");
        sb.append(i);
        throw new FatalException(sb.toString());
    }
}
