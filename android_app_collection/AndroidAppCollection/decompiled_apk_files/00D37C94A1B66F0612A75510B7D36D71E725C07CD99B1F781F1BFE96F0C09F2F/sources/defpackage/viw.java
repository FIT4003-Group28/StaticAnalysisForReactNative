package defpackage;

import java.io.InputStream;
import java.util.List;
/* compiled from: PG */
/* renamed from: viw  reason: default package */
/* loaded from: classes4.dex */
public final class viw extends vka {
    private final List a;

    public viw(InputStream inputStream, List list) {
        super(inputStream);
        this.a = list;
        vwl.d(true, "Input was null", new Object[0]);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (vko vkoVar : this.a) {
            try {
                vkoVar.close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = this.in.read();
        if (read != -1) {
            for (vko vkoVar : this.a) {
                vkoVar.a();
            }
        }
        return read;
    }

    @Override // defpackage.vka, java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.in.read(bArr);
        if (read != -1) {
            for (vko vkoVar : this.a) {
                vkoVar.a();
            }
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.in.read(bArr, i, i2);
        if (read != -1) {
            for (vko vkoVar : this.a) {
                vkoVar.a();
            }
        }
        return read;
    }
}
