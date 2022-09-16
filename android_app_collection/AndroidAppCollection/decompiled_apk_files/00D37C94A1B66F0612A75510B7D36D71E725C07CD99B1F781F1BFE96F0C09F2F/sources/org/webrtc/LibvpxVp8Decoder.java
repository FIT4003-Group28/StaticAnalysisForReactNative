package org.webrtc;
/* compiled from: PG */
/* loaded from: classes4.dex */
public class LibvpxVp8Decoder extends bapi {
    static native long nativeCreateDecoder();

    @Override // org.webrtc.VideoDecoder
    public final long createNativeVideoDecoder() {
        return nativeCreateDecoder();
    }
}
