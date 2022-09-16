package defpackage;

import java.io.FilterOutputStream;
import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: czjd  reason: default package */
/* loaded from: classes5.dex */
public class czjd extends FilterOutputStream {
    public czjd(OutputStream outputStream) {
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
