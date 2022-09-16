package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
/* compiled from: PG */
/* renamed from: dcyq  reason: default package */
/* loaded from: classes.dex */
abstract class dcyq implements dczb {
    public dczb c(byte[] bArr) {
        g(bArr, bArr.length);
        return this;
    }

    @Override // defpackage.dczb
    public void f(ByteBuffer byteBuffer) {
        throw null;
    }

    @Override // defpackage.dczb
    public void g(byte[] bArr, int i) {
        throw null;
    }

    @Override // defpackage.dczb
    public void h(int i) {
        d((byte) i);
        d((byte) (i >>> 8));
        d((byte) (i >>> 16));
        d((byte) (i >> 24));
    }

    @Override // defpackage.dczb
    public void i(long j) {
        for (int i = 0; i < 64; i += 8) {
            d((byte) (j >>> i));
        }
    }

    @Override // defpackage.dczb
    public final dczb j(double d) {
        i(Double.doubleToRawLongBits(d));
        return this;
    }

    @Override // defpackage.dczb
    public dczb k(CharSequence charSequence, Charset charset) {
        return c(charSequence.toString().getBytes(charset));
    }
}
