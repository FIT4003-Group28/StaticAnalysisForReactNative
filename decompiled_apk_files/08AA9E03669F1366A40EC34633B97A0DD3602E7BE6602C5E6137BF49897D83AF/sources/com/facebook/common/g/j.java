package com.facebook.common.g;

import com.facebook.common.d.m;
import java.io.IOException;
import java.io.OutputStream;
/* compiled from: PooledByteBufferOutputStream.java */
/* loaded from: classes.dex */
public abstract class j extends OutputStream {
    public abstract g a();

    public abstract int b();

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            super.close();
        } catch (IOException e) {
            m.b(e);
        }
    }
}
