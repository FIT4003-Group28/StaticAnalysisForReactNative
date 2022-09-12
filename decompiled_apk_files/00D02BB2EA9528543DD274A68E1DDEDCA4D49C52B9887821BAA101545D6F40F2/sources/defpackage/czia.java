package defpackage;

import java.io.InputStream;
import java.util.List;
/* compiled from: PG */
/* renamed from: czia  reason: default package */
/* loaded from: classes5.dex */
public final class czia extends czjc {
    private final List<czjn> a;

    public czia(InputStream inputStream, List<czjn> list) {
        super(inputStream);
        this.a = list;
        czjf.a(inputStream != null, "Input was null", new Object[0]);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (czjn czjnVar : this.a) {
            try {
                czjnVar.close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            for (czjn czjnVar : this.a) {
                czjnVar.a();
            }
        }
        return read;
    }

    @Override // defpackage.czjc, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.in.read(bArr);
        if (read != -1) {
            for (czjn czjnVar : this.a) {
                czjnVar.a();
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            for (czjn czjnVar : this.a) {
                czjnVar.a();
            }
        }
        return read;
    }
}
