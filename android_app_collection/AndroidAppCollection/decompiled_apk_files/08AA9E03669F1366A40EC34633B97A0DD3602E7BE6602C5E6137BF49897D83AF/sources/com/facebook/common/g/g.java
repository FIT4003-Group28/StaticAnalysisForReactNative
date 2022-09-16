package com.facebook.common.g;

import java.io.Closeable;
/* compiled from: PooledByteBuffer.java */
/* loaded from: classes.dex */
public interface g extends Closeable {
    byte a(int i);

    int a();

    void a(int i, byte[] bArr, int i2, int i3);

    boolean b();

    /* compiled from: PooledByteBuffer.java */
    /* loaded from: classes.dex */
    public static class a extends RuntimeException {
        public a() {
            super("Invalid bytebuf. Already closed");
        }
    }
}
