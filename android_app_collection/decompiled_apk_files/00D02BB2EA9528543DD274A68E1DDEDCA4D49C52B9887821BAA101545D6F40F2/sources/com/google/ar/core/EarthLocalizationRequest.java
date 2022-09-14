package com.google.ar.core;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class EarthLocalizationRequest {
    private long nativeHandle;
    private final long nativeSymbolTableHandle;
    private final Session session;

    public EarthLocalizationRequest(Session session, long j) {
        this.session = session;
        this.nativeHandle = j;
        this.nativeSymbolTableHandle = session.nativeSymbolTableHandle;
    }

    private void maybeDestroy() {
        long j = this.nativeHandle;
        if (j != 0) {
            nativeDestroy(this.nativeSymbolTableHandle, j);
            this.nativeHandle = 0L;
        }
    }

    private native ByteBuffer nativeAsBytes(long j, long j2);

    private native void nativeDestroy(long j, long j2);

    private native void nativeSetResponse(long j, long j2, ByteBuffer byteBuffer, int i);

    public ByteBuffer asBytes() {
        return Session.directByteBufferOrDefault(nativeAsBytes(this.session.nativeWrapperHandle, this.nativeHandle));
    }

    protected void finalize() {
        maybeDestroy();
        super.finalize();
    }

    public void setResponse(ByteBuffer byteBuffer, int i) {
        long j = this.nativeHandle;
        if (j == 0) {
            return;
        }
        nativeSetResponse(this.session.nativeWrapperHandle, j, byteBuffer, i);
        maybeDestroy();
    }
}
