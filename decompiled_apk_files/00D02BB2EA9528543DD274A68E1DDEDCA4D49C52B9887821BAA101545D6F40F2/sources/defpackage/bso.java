package defpackage;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: bso  reason: default package */
/* loaded from: classes4.dex */
public final class bso {
    public ByteBuffer b;
    public bsn c;
    public final byte[] a = new byte[256];
    public int d = 0;

    public final int[] a(int i) {
        int[] iArr;
        byte[] bArr = new byte[i * 3];
        try {
            this.b.get(bArr);
            iArr = new int[256];
            int i2 = 0;
            int i3 = 0;
            while (i2 < i) {
                int i4 = i3 + 1;
                try {
                    int i5 = i4 + 1;
                    int i6 = i5 + 1;
                    int i7 = i2 + 1;
                    iArr[i2] = ((bArr[i3] & 255) << 16) | (-16777216) | ((bArr[i4] & 255) << 8) | (bArr[i5] & 255);
                    i3 = i6;
                    i2 = i7;
                } catch (BufferUnderflowException unused) {
                    this.c.b = 1;
                    return iArr;
                }
            }
        } catch (BufferUnderflowException unused2) {
            iArr = null;
        }
        return iArr;
    }

    public final void b() {
        int d;
        do {
            d = d();
            this.b.position(Math.min(this.b.position() + d, this.b.limit()));
        } while (d > 0);
    }

    public final void c() {
        int d = d();
        this.d = d;
        if (d > 0) {
            int i = 0;
            while (true) {
                try {
                    int i2 = this.d;
                    if (i >= i2) {
                        return;
                    }
                    int i3 = i2 - i;
                    this.b.get(this.a, i, i3);
                    i += i3;
                } catch (Exception unused) {
                    this.c.b = 1;
                    return;
                }
            }
        }
    }

    public final int d() {
        try {
            return this.b.get() & 255;
        } catch (Exception unused) {
            this.c.b = 1;
            return 0;
        }
    }

    public final int e() {
        return this.b.getShort();
    }

    public final boolean f() {
        return this.c.b != 0;
    }
}
