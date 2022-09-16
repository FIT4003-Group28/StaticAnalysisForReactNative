package org.webrtc;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class LibvpxVp9Decoder extends bapi {
    static native long nativeCreateDecoder();

    public static native boolean nativeIsSupported();

    @Override // org.webrtc.VideoDecoder
    public final long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
