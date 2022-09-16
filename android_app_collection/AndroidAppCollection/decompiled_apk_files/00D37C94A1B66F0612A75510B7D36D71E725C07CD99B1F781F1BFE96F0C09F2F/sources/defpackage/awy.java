package defpackage;

import java.io.ByteArrayOutputStream;
/* compiled from: PG */
/* renamed from: awy  reason: default package */
/* loaded from: classes2.dex */
public final class awy implements axd {
    public ByteArrayOutputStream a;

    @Override // defpackage.axd
    public final void a() {
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        int i = pxi.a;
        byteArrayOutputStream.close();
    }

    @Override // defpackage.axd
    public final void b(asy asyVar) {
        long j = asyVar.h;
        if (j == -1) {
            this.a = new ByteArrayOutputStream();
            return;
        }
        ptx.c(j <= 2147483647L);
        this.a = new ByteArrayOutputStream((int) asyVar.h);
    }

    @Override // defpackage.axd
    public final void c(byte[] bArr, int i, int i2) {
        ByteArrayOutputStream byteArrayOutputStream = this.a;
        int i3 = pxi.a;
        byteArrayOutputStream.write(bArr, i, i2);
    }
}
