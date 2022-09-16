package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class Camera {
    private static final String TAG = "ARCore-Camera";
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum EarthLocalizationState {
        NOT_LOCALIZED(0),
        LOCALIZED(1),
        UNAVAILABLE(2);
        
        final int nativeCode;

        EarthLocalizationState(int i) {
            this.nativeCode = i;
        }

        static EarthLocalizationState forNumber(int i) {
            EarthLocalizationState[] values;
            for (EarthLocalizationState earthLocalizationState : values()) {
                if (earthLocalizationState.nativeCode == i) {
                    return earthLocalizationState;
                }
            }
            StringBuilder sb = new StringBuilder(71);
            sb.append("Unexpected value for native ArEarthLocalizationState, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    protected Camera() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    public Camera(Session session, Frame frame) {
        this.session = session;
        this.nativeHandle = nativeAcquireCamera(session.nativeWrapperHandle, frame.nativeHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    private static native long nativeAcquireCamera(long j, long j2);

    private native long nativeCreateCameraIntrinsics(long j);

    private native Pose nativeDisplayOrientedPose(long j, long j2);

    private static native int nativeGetEarthLocalizationState(long j, long j2);

    private native void nativeGetImageIntrinsics(long j, long j2, long j3);

    private native Pose nativeGetPose(long j, long j2);

    private native void nativeGetProjectionMatrix(long j, long j2, float[] fArr, int i, float f, float f2);

    private native void nativeGetTextureIntrinsics(long j, long j2, long j3);

    private native int nativeGetTrackingFailureReason(long j, long j2);

    private native int nativeGetTrackingState(long j, long j2);

    private native void nativeGetViewMatrix(long j, long j2, float[] fArr, int i);

    private static native void nativeReleaseCamera(long j, long j2);

    public boolean equals(Object obj) {
        return (obj instanceof Camera) && ((Camera) obj).nativeHandle == this.nativeHandle;
    }

    protected void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeReleaseCamera(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public Pose getDisplayOrientedPose() {
        return nativeDisplayOrientedPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public EarthLocalizationState getEarthLocalizationState() {
        return EarthLocalizationState.forNumber(nativeGetEarthLocalizationState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public CameraIntrinsics getImageIntrinsics() {
        CameraIntrinsics cameraIntrinsics = new CameraIntrinsics(nativeCreateCameraIntrinsics(this.session.nativeWrapperHandle), this.session);
        nativeGetImageIntrinsics(this.session.nativeWrapperHandle, this.nativeHandle, cameraIntrinsics.nativeHandle);
        return cameraIntrinsics;
    }

    public Pose getPose() {
        return nativeGetPose(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public void getProjectionMatrix(float[] fArr, int i, float f, float f2) {
        nativeGetProjectionMatrix(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i, f, f2);
    }

    public CameraIntrinsics getTextureIntrinsics() {
        CameraIntrinsics cameraIntrinsics = new CameraIntrinsics(nativeCreateCameraIntrinsics(this.session.nativeWrapperHandle), this.session);
        nativeGetTextureIntrinsics(this.session.nativeWrapperHandle, this.nativeHandle, cameraIntrinsics.nativeHandle);
        return cameraIntrinsics;
    }

    public TrackingFailureReason getTrackingFailureReason() {
        return TrackingFailureReason.forNumber(nativeGetTrackingFailureReason(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public TrackingState getTrackingState() {
        return TrackingState.forNumber(nativeGetTrackingState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public void getViewMatrix(float[] fArr, int i) {
        nativeGetViewMatrix(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i);
    }

    public int hashCode() {
        return Long.valueOf(this.nativeHandle).hashCode();
    }
}
