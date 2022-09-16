package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: vkb  reason: default package */
/* loaded from: classes4.dex */
public class vkb extends FilterOutputStream {
    public vkb(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr) {
        this.out.write(bArr);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
    }
}
