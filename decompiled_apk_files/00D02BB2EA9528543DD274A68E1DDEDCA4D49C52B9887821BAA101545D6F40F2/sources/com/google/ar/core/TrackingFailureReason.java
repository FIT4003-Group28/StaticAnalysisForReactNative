package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public enum TrackingFailureReason {
    NONE(0),
    BAD_STATE(1),
    INSUFFICIENT_LIGHT(2),
    EXCESSIVE_MOTION(3),
    INSUFFICIENT_FEATURES(4),
    CAMERA_UNAVAILABLE(5);
    
    final int nativeCode;

    TrackingFailureReason(int i) {
        this.nativeCode = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static TrackingFailureReason forNumber(int i) {
        TrackingFailureReason[] values;
        for (TrackingFailureReason trackingFailureReason : values()) {
            if (trackingFailureReason.nativeCode == i) {
                return trackingFailureReason;
            }
        }
        StringBuilder sb = new StringBuilder(68);
        sb.append("Unexpected value for native TrackingFailureReason, value=");
        sb.append(i);
        throw new FatalException(sb.toString());
    }
}
