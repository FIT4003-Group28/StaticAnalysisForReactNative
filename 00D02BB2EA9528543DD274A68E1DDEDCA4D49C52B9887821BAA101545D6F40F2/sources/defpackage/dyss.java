package defpackage;

import java.io.OutputStream;
/* compiled from: PG */
/* renamed from: dyss  reason: default package */
/* loaded from: classes6.dex */
final class dyss extends OutputStream {
    final /* synthetic */ dysu a;

    public dyss(dysu dysuVar) {
        this.a = dysuVar;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        this.a.g(bArr, i, i2);
    }
}
