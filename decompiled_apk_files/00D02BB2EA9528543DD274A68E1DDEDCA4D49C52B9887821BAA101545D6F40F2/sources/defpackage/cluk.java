package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cluk  reason: default package */
/* loaded from: classes5.dex */
public final class cluk implements cmkd {
    public final long b;
    public long c;
    public int e;
    public int f;
    private final cmkd g;
    public byte[] d = new byte[ImageMetadata.CONTROL_AE_ANTIBANDING_MODE];
    public final byte[] a = new byte[4096];

    public cluk(cmkd cmkdVar, long j, long j2) {
        this.g = cmkdVar;
        this.c = j;
        this.b = j2;
    }

    private final int o(byte[] bArr, int i, int i2) {
        int i3 = this.f;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.d, 0, bArr, i, min);
        p(min);
        return min;
    }

    private final void p(int i) {
        int i2 = this.f - i;
        this.f = i2;
        this.e = 0;
        byte[] bArr = this.d;
        byte[] bArr2 = i2 < bArr.length + (-524288) ? new byte[ImageMetadata.CONTROL_AE_ANTIBANDING_MODE + i2] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.d = bArr2;
    }

    @Override // defpackage.cmkd
    public final int a(byte[] bArr, int i, int i2) {
        int o = o(bArr, i, i2);
        if (o == 0) {
            o = m(bArr, i, i2, 0, true);
        }
        n(o);
        return o;
    }

    public final boolean b(byte[] bArr, int i, int i2, boolean z) {
        int o = o(bArr, i, i2);
        while (o < i2 && o != -1) {
            o = m(bArr, i, i2, o, z);
        }
        n(o);
        return o != -1;
    }

    public final void c(byte[] bArr, int i, int i2) {
        b(bArr, i, i2, false);
    }

    public final void d(int i) {
        int l = l(i);
        while (l < i && l != -1) {
            l = m(this.a, -l, Math.min(i, l + 4096), l, false);
        }
        n(l);
    }

    public final boolean e(byte[] bArr, int i, int i2, boolean z) {
        if (!g(i2, z)) {
            return false;
        }
        System.arraycopy(this.d, this.e - i2, bArr, i, i2);
        return true;
    }

    public final void f(byte[] bArr, int i, int i2) {
        e(bArr, i, i2, false);
    }

    public final boolean g(int i, boolean z) {
        k(i);
        int i2 = this.f - this.e;
        while (i2 < i) {
            i2 = m(this.d, this.e, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f = this.e + i2;
        }
        this.e += i;
        return true;
    }

    public final void h(int i) {
        g(i, false);
    }

    public final void i() {
        this.e = 0;
    }

    public final long j() {
        return this.c + this.e;
    }

    public final void k(int i) {
        int i2 = this.e + i;
        int length = this.d.length;
        if (i2 > length) {
            this.d = Arrays.copyOf(this.d, cmny.B(length + length, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE + i2, i2 + ImageMetadata.LENS_APERTURE));
        }
    }

    public final int l(int i) {
        int min = Math.min(this.f, i);
        p(min);
        return min;
    }

    public final int m(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int a = this.g.a(bArr, i + i3, i2 - i3);
        if (a != -1) {
            return i3 + a;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new EOFException();
    }

    public final void n(int i) {
        if (i != -1) {
            this.c += i;
        }
    }
}
