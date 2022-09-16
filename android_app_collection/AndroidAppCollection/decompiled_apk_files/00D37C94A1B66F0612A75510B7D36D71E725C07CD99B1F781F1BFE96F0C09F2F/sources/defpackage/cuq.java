package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cuq  reason: default package */
/* loaded from: classes3.dex */
final class cuq extends InputStream {
    private final ByteBuffer a;
    private int b = -1;

    public cuq(ByteBuffer byteBuffer) {
        this.a = byteBuffer;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.a.remaining();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.b = this.a.position();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (!this.a.hasRemaining()) {
            return -1;
        }
        return this.a.get() & 255;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        int i = this.b;
        if (i == -1) {
            throw new IOException("Cannot reset to unset mark position");
        }
        this.a.position(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (!this.a.hasRemaining()) {
            return -1L;
        }
        long min = Math.min(j, available());
        ByteBuffer byteBuffer = this.a;
        byteBuffer.position((int) (byteBuffer.position() + min));
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (!this.a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(i2, available());
        this.a.get(bArr, i, min);
        return min;
    }
}
