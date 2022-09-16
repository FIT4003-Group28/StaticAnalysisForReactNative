package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: cje  reason: default package */
/* loaded from: classes4.dex */
public final class cje extends InputStream {
    public static final Queue<cje> a = cjp.h(0);
    public InputStream b;
    public IOException c;

    public final void a() {
        this.c = null;
        this.b = null;
        Queue<cje> queue = a;
        synchronized (queue) {
            queue.offer(this);
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.b.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.b.close();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.b.mark(i);
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.b.read();
        } catch (IOException e) {
            this.c = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.b.reset();
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        try {
            return this.b.skip(j);
        } catch (IOException e) {
            this.c = e;
            return 0L;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.b.read(bArr);
        } catch (IOException e) {
            this.c = e;
            return -1;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.b.read(bArr, i, i2);
        } catch (IOException e) {
            this.c = e;
            return -1;
        }
    }
}
