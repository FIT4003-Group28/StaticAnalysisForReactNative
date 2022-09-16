package org.webrtc;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class LibvpxVp9Encoder extends bapj {
    static native long nativeCreateEncoder();

    static native boolean nativeIsSupported();

    @Override // org.webrtc.VideoEncoder
    public final long createNativeVideoEncoder() {
        return nativeCreateEncoder();
    }

    @Override // org.webrtc.VideoEncoder
    public final boolean isHardwareEncoder() {
        return false;
    }
}
