package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
/* compiled from: PG */
/* renamed from: eaia  reason: default package */
/* loaded from: classes6.dex */
final class eaia extends OutputStream {
    final /* synthetic */ long a;
    final /* synthetic */ eaja b;
    final /* synthetic */ eaib c;
    private long d;

    public eaia(eaib eaibVar, long j, eaja eajaVar) {
        this.c = eaibVar;
        this.a = j;
        this.b = eajaVar;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() {
        if (this.c.e) {
            return;
        }
        this.b.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.e = true;
        long j = this.a;
        if (j == -1 || this.d >= j) {
            this.b.close();
            return;
        }
        throw new ProtocolException("expected " + this.a + " bytes but received " + this.d);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        if (!this.c.e) {
            long j = this.a;
            if (j == -1 || this.d + i2 <= j) {
                this.d += i2;
                try {
                    this.b.L(bArr, i, i2);
                    return;
                } catch (InterruptedIOException e) {
                    throw new SocketTimeoutException(e.getMessage());
                }
            }
            throw new ProtocolException("expected " + this.a + " bytes but received " + this.d + i2);
        }
        throw new IOException("closed");
    }
}
