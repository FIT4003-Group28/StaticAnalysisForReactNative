package defpackage;

import java.io.OutputStream;
import java.util.List;
/* compiled from: PG */
/* renamed from: vix  reason: default package */
/* loaded from: classes4.dex */
public final class vix extends vkb {
    private final List a;

    public vix(OutputStream outputStream, List list) {
        super(outputStream);
        this.a = list;
        vwl.d(true, "Output was null", new Object[0]);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        for (vkp vkpVar : this.a) {
            try {
                vkpVar.close();
            } catch (Throwable unused) {
            }
        }
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        this.out.write(i);
        for (vkp vkpVar : this.a) {
            vkpVar.a(1);
        }
    }

    @Override // defpackage.vkb, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) {
        this.out.write(bArr);
        for (vkp vkpVar : this.a) {
            vkpVar.a(bArr.length);
        }
    }

    @Override // defpackage.vkb, java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        for (vkp vkpVar : this.a) {
            vkpVar.a(i2);
        }
    }
}
