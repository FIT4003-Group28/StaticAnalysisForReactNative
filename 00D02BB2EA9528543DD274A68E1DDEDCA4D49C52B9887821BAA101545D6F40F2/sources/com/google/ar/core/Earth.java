package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
import java.util.Collection;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Earth extends TrackableBase {

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum FrameSelectionStatus {
        UNAVAILABLE(0),
        AVAILABLE(1),
        AVAILABLE_SEND_TO_CLOUD(2);
        
        final int nativeCode;

        FrameSelectionStatus(int i) {
            this.nativeCode = i;
        }

        static FrameSelectionStatus forNumber(int i) {
            FrameSelectionStatus[] values;
            for (FrameSelectionStatus frameSelectionStatus : values()) {
                if (frameSelectionStatus.nativeCode == i) {
                    return frameSelectionStatus;
                }
            }
            StringBuilder sb = new StringBuilder(67);
            sb.append("Unexpected value for native FrameSelectionStatus, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum LocalizationPerformanceMode {
        SESSION_STATE_DEFAULT(0),
        ACTIVE_AR(1),
        ACTIVE_NO_CAMERA(2),
        INACTIVE_PASSIVE(3);
        
        final int nativeCode;

        LocalizationPerformanceMode(int i) {
            this.nativeCode = i;
        }

        static LocalizationPerformanceMode forNumber(int i) {
            LocalizationPerformanceMode[] values;
            for (LocalizationPerformanceMode localizationPerformanceMode : values()) {
                if (localizationPerformanceMode.nativeCode == i) {
                    return localizationPerformanceMode;
                }
            }
            StringBuilder sb = new StringBuilder(74);
            sb.append("Unexpected value for native LocalizationPerformanceMode, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum RequestMode {
        USE_NATIVE_CODE(0),
        USE_CLIENT_CODE(1);
        
        final int nativeCode;

        RequestMode(int i) {
            this.nativeCode = i;
        }
    }

    public Earth(long j, Session session) {
        super(j, session);
    }

    private native long nativeCreateAnchor(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4);

    private native long nativeCreateAnchorOnTerrain(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4);

    private native long nativeCreateAnchorOnWgs84(long j, long j2, double d, double d2, double d3, float f, float f2, float f3, float f4);

    private native EarthPose nativeGetCameraPose(long j, long j2);

    private native int nativeGetFrameSelectionStatus(long j, long j2);

    private native long nativeGetLocalizationRequest(long j, long j2, long j3);

    private native int nativeGetTrackingState(long j, long j2);

    private native void nativeReleaseEarth(long j, long j2);

    private native void nativeSetLocalizationPerformance(long j, long j2, int i);

    private native void nativeSetNetworkClient(long j, long j2, EarthNetworkClientInterface earthNetworkClientInterface);

    private native void nativeSetRequestMode(long j, long j2, int i);

    @Deprecated
    public Anchor createAnchor(double d, double d2, double d3, float f, float f2, float f3, float f4) {
        return new Anchor(nativeCreateAnchor(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, f, f2, f3, f4), this.session);
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Anchor createAnchor(Pose pose) {
        return super.createAnchor(pose);
    }

    public Anchor createAnchorOnTerrain(double d, double d2, double d3, float f, float f2, float f3, float f4) {
        return new Anchor(nativeCreateAnchorOnTerrain(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, f, f2, f3, f4), this.session);
    }

    public Anchor createAnchorOnWgs84(double d, double d2, double d3, float f, float f2, float f3, float f4) {
        return new Anchor(nativeCreateAnchorOnWgs84(this.session.nativeWrapperHandle, this.nativeHandle, d, d2, d3, f, f2, f3, f4), this.session);
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.ar.core.TrackableBase
    protected void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseEarth(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public /* bridge */ /* synthetic */ Collection getAnchors() {
        return super.getAnchors();
    }

    public EarthPose getCameraEarthPose() {
        return nativeGetCameraPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public FrameSelectionStatus getFrameSelectionStatus() {
        return FrameSelectionStatus.forNumber(nativeGetFrameSelectionStatus(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public EarthLocalizationRequest getLocalizationRequest(CameraIntrinsics cameraIntrinsics) {
        Session session = this.session;
        return new EarthLocalizationRequest(session, nativeGetLocalizationRequest(session.nativeWrapperHandle, this.nativeHandle, cameraIntrinsics.nativeHandle));
    }

    @Override // com.google.ar.core.TrackableBase, com.google.ar.core.Trackable
    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    @Override // com.google.ar.core.TrackableBase
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public void setLocalizationPerformanceMode(LocalizationPerformanceMode localizationPerformanceMode) {
        nativeSetLocalizationPerformance(this.session.nativeWrapperHandle, this.nativeHandle, localizationPerformanceMode.nativeCode);
    }

    public void setNetworkClient(EarthNetworkClientInterface earthNetworkClientInterface) {
        nativeSetNetworkClient(this.session.nativeWrapperHandle, this.nativeHandle, earthNetworkClientInterface);
    }

    public void setRequestMode(RequestMode requestMode) {
        nativeSetRequestMode(this.session.nativeWrapperHandle, this.nativeHandle, requestMode.nativeCode);
    }
}
