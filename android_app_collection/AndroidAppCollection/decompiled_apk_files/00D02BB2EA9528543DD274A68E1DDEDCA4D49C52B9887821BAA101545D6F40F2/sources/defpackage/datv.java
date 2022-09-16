package defpackage;

import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: datv  reason: default package */
/* loaded from: classes5.dex */
final class datv extends OutputStream {
    long a;

    @Override // java.io.OutputStream
    public final void write(int i) {
        this.a++;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a += i2;
    }
}
