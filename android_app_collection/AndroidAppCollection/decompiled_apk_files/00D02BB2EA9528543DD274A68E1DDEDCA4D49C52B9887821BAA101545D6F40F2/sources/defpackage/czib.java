package defpackage;

import java.io.OutputStream;
import java.util.List;
/* compiled from: PG */
/* renamed from: czib  reason: default package */
/* loaded from: classes5.dex */
public final class czib extends czjd {
    private final List<czjo> a;

    public czib(OutputStream outputStream, List<czjo> list) {
        super(outputStream);
        this.a = list;
        czjf.a(outputStream != null, "Output was null", new Object[0]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (czjo czjoVar : this.a) {
            try {
                czjoVar.close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        this.out.write(i);
        for (czjo czjoVar : this.a) {
            czjoVar.a();
        }
    }

    @Override // defpackage.czjd, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.out.write(bArr);
        for (czjo czjoVar : this.a) {
            int length = bArr.length;
            czjoVar.a();
        }
    }

    @Override // defpackage.czjd, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        for (czjo czjoVar : this.a) {
            czjoVar.a();
        }
    }
}
