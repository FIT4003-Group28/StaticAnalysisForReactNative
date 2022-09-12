package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: daup  reason: default package */
/* loaded from: classes5.dex */
public final class daup extends FilterInputStream {
    private final dauo a;

    public daup(InputStream inputStream, Logger logger, Level level) {
        super(inputStream);
        this.a = new dauo(logger, level);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = super.read();
        this.a.write(read);
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = super.read(bArr, i, i2);
        if (read > 0) {
            this.a.write(bArr, i, read);
        }
        return read;
    }
}
