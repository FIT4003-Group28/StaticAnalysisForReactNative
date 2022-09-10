package com.google.ar.core;

import com.google.ar.core.exceptions.FatalException;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class LightEstimate {
    long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public enum State {
        NOT_VALID(0),
        VALID(1);
        
        final int nativeCode;

        State(int i) {
            this.nativeCode = i;
        }

        static State forNumber(int i) {
            State[] values;
            for (State state : values()) {
                if (state.nativeCode == i) {
                    return state;
                }
            }
            StringBuilder sb = new StringBuilder(66);
            sb.append("Unexpected value for native LightEstimate.State, value=");
            sb.append(i);
            throw new FatalException(sb.toString());
        }
    }

    protected LightEstimate() {
        this.nativeHandle = 0L;
        this.session = null;
        this.nativeSymbolTableHandle = 0L;
    }

    public LightEstimate(Session session) {
        this.nativeHandle = 0L;
        this.session = session;
        this.nativeHandle = nativeCreateLightEstimate(session.nativeWrapperHandle);
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    private ArImage[] convertNativeArImageCubemapToArray(long[] jArr) {
        ArImage[] arImageArr = new ArImage[jArr.length];
        for (int i = 0; i < jArr.length; i++) {
            arImageArr[i] = new ArImage(this.session, jArr[i]);
        }
        return arImageArr;
    }

    private native long[] nativeAcquireEnvironmentalHdrCubeMap(long j, long j2);

    private static native long nativeCreateLightEstimate(long j);

    private static native void nativeDestroyLightEstimate(long j, long j2);

    private native void nativeGetColorCorrection(long j, long j2, float[] fArr, int i);

    private native void nativeGetEnvironmentalHdrAmbientSphericalHarmonics(long j, long j2, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightDirection(long j, long j2, float[] fArr);

    private native void nativeGetEnvironmentalHdrMainLightIntensity(long j, long j2, float[] fArr);

    private native float nativeGetPixelIntensity(long j, long j2);

    private native int nativeGetState(long j, long j2);

    private native long nativeGetTimestamp(long j, long j2);

    public ArImage[] acquireEnvironmentalHdrCubeMap() {
        return convertNativeArImageCubemapToArray(nativeAcquireEnvironmentalHdrCubeMap(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    protected void finalize() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroyLightEstimate(this.nativeSymbolTableHandle, j);
        }
        super.finalize();
    }

    public void getColorCorrection(float[] fArr, int i) {
        nativeGetColorCorrection(this.session.nativeWrapperHandle, this.nativeHandle, fArr, i);
    }

    public float[] getEnvironmentalHdrAmbientSphericalHarmonics() {
        float[] fArr = new float[27];
        nativeGetEnvironmentalHdrAmbientSphericalHarmonics(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float[] getEnvironmentalHdrMainLightDirection() {
        float[] fArr = new float[3];
        nativeGetEnvironmentalHdrMainLightDirection(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float[] getEnvironmentalHdrMainLightIntensity() {
        float[] fArr = new float[3];
        nativeGetEnvironmentalHdrMainLightIntensity(this.session.nativeWrapperHandle, this.nativeHandle, fArr);
        return fArr;
    }

    public float getPixelIntensity() {
        return nativeGetPixelIntensity(this.session.nativeWrapperHandle, this.nativeHandle);
    }

    public State getState() {
        return State.forNumber(nativeGetState(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    public long getTimestamp() {
        return nativeGetTimestamp(this.session.nativeWrapperHandle, this.nativeHandle);
    }
}
