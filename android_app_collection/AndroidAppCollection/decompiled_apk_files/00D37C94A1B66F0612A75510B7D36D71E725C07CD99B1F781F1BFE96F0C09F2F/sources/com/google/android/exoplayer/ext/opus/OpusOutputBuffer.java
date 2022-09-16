package com.google.android.exoplayer.ext.opus;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OpusOutputBuffer extends pda {
    public ByteBuffer data;
    private final OpusDecoder owner;

    public OpusOutputBuffer(OpusDecoder opusDecoder) {
        this.owner = opusDecoder;
    }

    void init(int i) {
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = ByteBuffer.allocateDirect(i);
        }
        this.data.position(0);
        this.data.limit(i);
    }

    @Override // defpackage.pda
    public void release() {
        this.owner.e(this);
    }

    @Override // defpackage.pcy
    public void reset() {
        super.reset();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }
}
