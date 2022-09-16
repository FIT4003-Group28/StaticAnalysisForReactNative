package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class MagicalSurfacePoint extends TrackableBase {

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum OrientationMode {
        INITIALIZED_TO_IDENTITY(0),
        ESTIMATED_SURFACE_NORMAL(1);
        
        private final int nativeCode;

        OrientationMode(int i) {
            this.nativeCode = i;
        }

        static OrientationMode fromNumber(int i) {
            OrientationMode[] values;
            for (OrientationMode orientationMode : values()) {
                if (orientationMode.nativeCode == i) {
                    return orientationMode;
                }
            }
            StringBuilder sb = new StringBuilder(69);
            sb.append("Unexpected value for native Point Orientation Mode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    public MagicalSurfacePoint(long j, Session session) {
        super(j, session);
    }

    private native int nativeGetOrientationModePrivate(long j, long j2);

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public OrientationMode getOrientationMode() {
        return OrientationMode.fromNumber(nativeGetOrientationModePrivate(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ TrackingState getTrackingState() {
        return super.getTrackingState();
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }
}
