package defpackage;

import java.io.ByteArrayOutputStream;
/* compiled from: PG */
/* renamed from: aemb  reason: default package */
/* loaded from: classes.dex */
public final class aemb extends ByteArrayOutputStream {
    public aemb() {
        super(102400);
    }

    public final void a(int i, int i2, byte[] bArr, int i3) {
        System.arraycopy(this.buf, i, bArr, i3, i2);
    }
}
