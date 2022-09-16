package defpackage;

import java.io.InputStream;
import java.nio.ByteBuffer;
import org.chromium.net.UrlRequest;
/* compiled from: PG */
/* renamed from: ysn  reason: default package */
/* loaded from: classes4.dex */
public final class ysn extends InputStream {
    public volatile ByteBuffer a;
    private final UrlRequest b;
    private final ysb c;

    public ysn(UrlRequest urlRequest, ysb ysbVar) {
        this.b = urlRequest;
        this.c = ysbVar;
    }

    private final void a() {
        ysb ysbVar = this.c;
        if (ysbVar.d) {
            ysbVar.a();
            return;
        }
        if (this.a == null) {
            this.a = ByteBuffer.allocateDirect(32768);
            this.a.flip();
        }
        if (this.a.hasRemaining()) {
            return;
        }
        this.a.clear();
        ysb ysbVar2 = this.c;
        UrlRequest urlRequest = this.b;
        urlRequest.read(this.a);
        ysbVar2.a.b(urlRequest);
        ysbVar2.a();
        if (this.a == null) {
            return;
        }
        this.a.flip();
    }

    @Override // java.io.InputStream
    public final int available() {
        if (this.a != null) {
            return this.a.remaining();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ysb ysbVar = this.c;
        if (ysbVar.d) {
            ysbVar.a();
            return;
        }
        UrlRequest urlRequest = this.b;
        ysbVar.e = true;
        urlRequest.cancel();
        ysbVar.a.b(urlRequest);
        ysbVar.a();
    }

    @Override // java.io.InputStream
    public final int read() {
        a();
        if (this.a == null || !this.a.hasRemaining()) {
            return -1;
        }
        return this.a.get() & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            int length = bArr.length;
            StringBuilder sb = new StringBuilder(91);
            sb.append("Tried to read ");
            sb.append(i2);
            sb.append(" bytes starting at ");
            sb.append(i);
            sb.append(" from a buffer of length ");
            sb.append(length);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        a();
        if (this.a == null || !this.a.hasRemaining()) {
            return -1;
        }
        int min = Math.min(this.a.remaining(), i2);
        this.a.get(bArr, i, min);
        return min;
    }
}
