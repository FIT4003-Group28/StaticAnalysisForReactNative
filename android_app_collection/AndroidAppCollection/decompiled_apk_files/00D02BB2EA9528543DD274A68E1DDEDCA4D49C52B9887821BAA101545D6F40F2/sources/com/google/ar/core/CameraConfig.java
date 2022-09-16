package com.google.ar.core;

import android.util.Range;
import android.util.Size;
import com.google.ar.core.exceptions.FatalException;
import java.util.EnumSet;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class CameraConfig {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum DepthSensorUsage {
        REQUIRE_AND_USE(1),
        DO_NOT_USE(2);
        
        final int nativeCode;

        DepthSensorUsage(int i) {
            this.nativeCode = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static EnumSet<DepthSensorUsage> forBitFlags(int i) {
            DepthSensorUsage[] values;
            EnumSet<DepthSensorUsage> noneOf = EnumSet.noneOf(DepthSensorUsage.class);
            for (DepthSensorUsage depthSensorUsage : values()) {
                if ((depthSensorUsage.nativeCode & i) != 0) {
                    noneOf.add(depthSensorUsage);
                }
            }
            return noneOf;
        }

        static DepthSensorUsage forNumber(int i) {
            DepthSensorUsage[] values;
            for (DepthSensorUsage depthSensorUsage : values()) {
                if (depthSensorUsage.nativeCode == i) {
                    return depthSensorUsage;
                }
            }
            StringBuilder sb = new StringBuilder(63);
            sb.append("Unexpected value for native DepthSensorUsage, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum FacingDirection {
        BACK(0),
        FRONT(1);
        
        final int nativeCode;

        FacingDirection(int i) {
            this.nativeCode = i;
        }

        static FacingDirection forNumber(int i) {
            FacingDirection[] values;
            for (FacingDirection facingDirection : values()) {
                if (facingDirection.nativeCode == i) {
                    return facingDirection;
                }
            }
            StringBuilder sb = new StringBuilder(62);
            sb.append("Unexpected value for native FacingDirection, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum TargetFps {
        TARGET_FPS_30(1),
        TARGET_FPS_60(2);
        
        final int nativeCode;

        TargetFps(int i) {
            this.nativeCode = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public static EnumSet<TargetFps> forBitFlags(int i) {
            TargetFps[] values;
            EnumSet<TargetFps> noneOf = EnumSet.noneOf(TargetFps.class);
            for (TargetFps targetFps : values()) {
                if ((targetFps.nativeCode & i) != 0) {
                    noneOf.add(targetFps);
                }
            }
            return noneOf;
        }
    }

    protected CameraConfig() {
        this.session = null;
        this.nativeHandle = 0L;
        this.nativeSymbolTableHandle = 0L;
    }

    public CameraConfig(Session session, long j) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    private static native void nativeDestroyCameraConfig(long j, long j2);

    private native String nativeGetCameraId(long j, long j2);

    private native int nativeGetDepthSensorUsage(long j, long j2);

    private native int nativeGetFacingDirection(long j, long j2);

    private native void nativeGetFpsRange(long j, long j2, int[] iArr);

    private native void nativeGetImageDimensions(long j, long j2, int[] iArr);

    private native void nativeGetTextureDimensions(long j, long j2, int[] iArr);

    protected void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyCameraConfig(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0L;
        }
        super.finalize();
    }

    public String getCameraId() {
        return nativeGetCameraId(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public DepthSensorUsage getDepthSensorUsage() {
        return DepthSensorUsage.forNumber(nativeGetDepthSensorUsage(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public FacingDirection getFacingDirection() {
        return FacingDirection.forNumber(nativeGetFacingDirection(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public Range<Integer> getFpsRange() {
        int[] iArr = new int[2];
        nativeGetFpsRange(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Range<>(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
    }

    public Size getImageSize() {
        int[] iArr = new int[2];
        nativeGetImageDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Size(iArr[0], iArr[1]);
    }

    public Size getTextureSize() {
        int[] iArr = new int[2];
        nativeGetTextureDimensions(this.session.nativeWrapperHandle, this.nativeHandle, iArr);
        return new Size(iArr[0], iArr[1]);
    }
}
