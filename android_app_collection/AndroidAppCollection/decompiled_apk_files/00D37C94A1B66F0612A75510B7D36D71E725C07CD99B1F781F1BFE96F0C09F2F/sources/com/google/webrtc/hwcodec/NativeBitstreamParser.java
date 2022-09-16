package com.google.webrtc.hwcodec;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class NativeBitstreamParser implements axha {
    private boolean b = false;
    private final long a = nativeCreate();

    private static native void nativeFree(long j);

    private static native BitstreamParser$BitstreamInfo nativeParse(long j, ByteBuffer byteBuffer);

    @Override // defpackage.axha
    public final BitstreamParser$BitstreamInfo a(ByteBuffer byteBuffer) {
        if (this.b) {
            throw new IllegalStateException("Already disposed.");
        }
        return nativeParse(this.a, byteBuffer);
    }

    @Override // defpackage.axha
    public final void b() {
        if (this.b) {
            throw new IllegalStateException("Already disposed.");
        }
        nativeFree(this.a);
        this.b = true;
    }

    protected abstract long nativeCreate();
}
