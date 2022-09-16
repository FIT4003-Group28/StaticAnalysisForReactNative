package defpackage;

import java.net.ProtocolException;
import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bahd  reason: default package */
/* loaded from: classes2.dex */
public final class bahd extends bahi {
    public final bahk a;
    public final long b;
    public final ByteBuffer c;
    private final UploadDataProvider f = new bahc(this);
    private long g;

    public bahd(long j, bahk bahkVar) {
        if (j >= 0) {
            this.b = j;
            this.c = ByteBuffer.allocate((int) Math.min(j, 16384L));
            this.a = bahkVar;
            this.g = 0L;
            return;
        }
        throw new IllegalArgumentException("Content length must be larger than 0 for non-chunked upload.");
    }

    private final void f(int i) {
        if (this.g + i <= this.b) {
            return;
        }
        throw new ProtocolException("expected " + (this.b - this.g) + " bytes but received " + i);
    }

    private final void g() {
        if (!this.c.hasRemaining()) {
            h();
        }
    }

    private final void h() {
        e();
        this.c.flip();
        this.a.a();
        d();
    }

    private final void i() {
        if (this.g == this.b) {
            h();
        }
    }

    @Override // defpackage.bahi
    public final UploadDataProvider a() {
        return this.f;
    }

    @Override // defpackage.bahi
    public final void b() {
        if (this.g >= this.b) {
            return;
        }
        throw new ProtocolException("Content received is less than Content-Length.");
    }

    @Override // defpackage.bahi
    public final void c() {
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        e();
        f(1);
        g();
        this.c.put((byte) i);
        this.g++;
        i();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        e();
        if (bArr.length - i < i2 || i < 0 || i2 < 0) {
            throw new IndexOutOfBoundsException();
        }
        f(i2);
        int i3 = i2;
        while (i3 > 0) {
            g();
            int min = Math.min(i3, this.c.remaining());
            this.c.put(bArr, (i + i2) - i3, min);
            i3 -= min;
        }
        this.g += i2;
        i();
    }
}
