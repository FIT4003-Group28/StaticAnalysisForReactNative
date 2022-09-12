package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: dast  reason: default package */
/* loaded from: classes5.dex */
final class dast extends FilterInputStream {
    final /* synthetic */ dasu a;
    private long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dast(dasu dasuVar, InputStream inputStream) {
        super(inputStream);
        this.a = dasuVar;
        this.b = 0L;
    }

    private final void a() {
        String headerField = this.a.a.getHeaderField("Content-Length");
        long parseLong = headerField == null ? -1L : Long.parseLong(headerField);
        if (parseLong == -1) {
            return;
        }
        long j = this.b;
        if (j == 0 || j >= parseLong) {
            return;
        }
        StringBuilder sb = new StringBuilder(102);
        sb.append("Connection closed prematurely: bytesRead = ");
        sb.append(j);
        sb.append(", Content-Length = ");
        sb.append(parseLong);
        throw new IOException(sb.toString());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = this.in.read();
        if (read == -1) {
            a();
        } else {
            this.b++;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = this.in.skip(j);
        this.b += skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read == -1) {
            a();
        } else {
            this.b += read;
        }
        return read;
    }
}
