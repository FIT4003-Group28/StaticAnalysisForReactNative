package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dauq  reason: default package */
/* loaded from: classes5.dex */
public final class dauq extends FilterOutputStream {
    public final dauo a;

    public dauq(OutputStream outputStream, Logger logger, Level level) {
        super(outputStream);
        this.a = new dauo(logger, level);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        this.out.write(i);
        this.a.write(i);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.a.write(bArr, i, i2);
    }
}
