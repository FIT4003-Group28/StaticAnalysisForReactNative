package com.google.android.exoplayer2.decoder;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SimpleOutputBuffer extends pmz {
    public ByteBuffer data;
    private final pmy owner;

    public SimpleOutputBuffer(pmy pmyVar) {
        this.owner = pmyVar;
    }

    @Override // defpackage.pmo
    public void clear() {
        super.clear();
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    public ByteBuffer init(long j, int i) {
        this.timeUs = j;
        ByteBuffer byteBuffer = this.data;
        if (byteBuffer == null || byteBuffer.capacity() < i) {
            this.data = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        }
        this.data.position(0);
        this.data.limit(i);
        return this.data;
    }

    @Override // defpackage.pmz
    public void release() {
        this.owner.a(this);
    }
}
