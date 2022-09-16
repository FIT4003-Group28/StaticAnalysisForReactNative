package com.google.firebase.crashlytics.c.n;

import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
/* loaded from: classes.dex */
public final class c implements Flushable {

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f9064b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9065c;

    /* renamed from: d  reason: collision with root package name */
    private int f9066d = 0;

    /* renamed from: e  reason: collision with root package name */
    private final OutputStream f9067e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends IOException {
        a() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private c(OutputStream outputStream, byte[] bArr) {
        this.f9067e = outputStream;
        this.f9064b = bArr;
        this.f9065c = bArr.length;
    }

    public static c a(OutputStream outputStream) {
        return a(outputStream, 4096);
    }

    public static c a(OutputStream outputStream, int i) {
        return new c(outputStream, new byte[i]);
    }

    private void a() {
        OutputStream outputStream = this.f9067e;
        if (outputStream != null) {
            outputStream.write(this.f9064b, 0, this.f9066d);
            this.f9066d = 0;
            return;
        }
        throw new a();
    }

    public static int b(float f2) {
        return 4;
    }

    public static int b(int i, float f2) {
        return l(i) + b(f2);
    }

    public static int b(int i, long j) {
        return l(i) + f(j);
    }

    public static int b(int i, com.google.firebase.crashlytics.c.n.a aVar) {
        return l(i) + c(aVar);
    }

    public static int b(int i, boolean z) {
        return l(i) + b(z);
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int c(com.google.firebase.crashlytics.c.n.a aVar) {
        return j(aVar.b()) + aVar.b();
    }

    public static int e(int i, int i2) {
        return l(i) + h(i2);
    }

    public static int e(long j) {
        if (((-128) & j) == 0) {
            return 1;
        }
        if (((-16384) & j) == 0) {
            return 2;
        }
        if (((-2097152) & j) == 0) {
            return 3;
        }
        if (((-268435456) & j) == 0) {
            return 4;
        }
        if (((-34359738368L) & j) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j) == 0) {
            return 8;
        }
        return (j & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int f(int i, int i2) {
        return l(i) + k(i2);
    }

    public static int f(long j) {
        return e(j);
    }

    public static int g(int i, int i2) {
        return l(i) + m(i2);
    }

    public static int h(int i) {
        return i(i);
    }

    public static int i(int i) {
        if (i >= 0) {
            return j(i);
        }
        return 10;
    }

    public static int j(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    public static int k(int i) {
        return j(n(i));
    }

    public static int l(int i) {
        return j(e.a(i, 0));
    }

    public static int m(int i) {
        return j(i);
    }

    public static int n(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public void a(byte b2) {
        if (this.f9066d == this.f9065c) {
            a();
        }
        byte[] bArr = this.f9064b;
        int i = this.f9066d;
        this.f9066d = i + 1;
        bArr[i] = b2;
    }

    public void a(float f2) {
        d(Float.floatToRawIntBits(f2));
    }

    public void a(int i) {
        b(i);
    }

    public void a(int i, float f2) {
        c(i, 5);
        a(f2);
    }

    public void a(int i, int i2) {
        c(i, 0);
        a(i2);
    }

    public void a(int i, long j) {
        c(i, 0);
        b(j);
    }

    public void a(int i, com.google.firebase.crashlytics.c.n.a aVar) {
        c(i, 2);
        a(aVar);
    }

    public void a(int i, boolean z) {
        c(i, 0);
        a(z);
    }

    public void a(long j) {
        while (((-128) & j) != 0) {
            c((((int) j) & 127) | 128);
            j >>>= 7;
        }
        c((int) j);
    }

    public void a(com.google.firebase.crashlytics.c.n.a aVar) {
        e(aVar.b());
        b(aVar);
    }

    public void a(com.google.firebase.crashlytics.c.n.a aVar, int i, int i2) {
        int i3 = this.f9065c;
        int i4 = this.f9066d;
        if (i3 - i4 >= i2) {
            aVar.a(this.f9064b, i, i4, i2);
            this.f9066d += i2;
            return;
        }
        int i5 = i3 - i4;
        aVar.a(this.f9064b, i, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f9066d = this.f9065c;
        a();
        if (i7 <= this.f9065c) {
            aVar.a(this.f9064b, i6, 0, i7);
            this.f9066d = i7;
            return;
        }
        InputStream a2 = aVar.a();
        long j = i6;
        if (j != a2.skip(j)) {
            throw new IllegalStateException("Skip failed.");
        }
        while (i7 > 0) {
            int min = Math.min(i7, this.f9065c);
            int read = a2.read(this.f9064b, 0, min);
            if (read != min) {
                throw new IllegalStateException("Read failed.");
            }
            this.f9067e.write(this.f9064b, 0, read);
            i7 -= read;
        }
    }

    public void a(boolean z) {
        c(z ? 1 : 0);
    }

    public void a(byte[] bArr) {
        a(bArr, 0, bArr.length);
    }

    public void a(byte[] bArr, int i, int i2) {
        int i3 = this.f9065c;
        int i4 = this.f9066d;
        if (i3 - i4 >= i2) {
            System.arraycopy(bArr, i, this.f9064b, i4, i2);
            this.f9066d += i2;
            return;
        }
        int i5 = i3 - i4;
        System.arraycopy(bArr, i, this.f9064b, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.f9066d = this.f9065c;
        a();
        if (i7 > this.f9065c) {
            this.f9067e.write(bArr, i6, i7);
            return;
        }
        System.arraycopy(bArr, i6, this.f9064b, 0, i7);
        this.f9066d = i7;
    }

    public void b(int i) {
        if (i >= 0) {
            e(i);
        } else {
            a(i);
        }
    }

    public void b(int i, int i2) {
        c(i, 0);
        f(i2);
    }

    public void b(long j) {
        a(j);
    }

    public void b(com.google.firebase.crashlytics.c.n.a aVar) {
        a(aVar, 0, aVar.b());
    }

    public void c(int i) {
        a((byte) i);
    }

    public void c(int i, int i2) {
        e(e.a(i, i2));
    }

    public void d(int i) {
        c(i & 255);
        c((i >> 8) & 255);
        c((i >> 16) & 255);
        c((i >> 24) & 255);
    }

    public void d(int i, int i2) {
        c(i, 0);
        g(i2);
    }

    public void e(int i) {
        while ((i & (-128)) != 0) {
            c((i & 127) | 128);
            i >>>= 7;
        }
        c(i);
    }

    public void f(int i) {
        e(n(i));
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f9067e != null) {
            a();
        }
    }

    public void g(int i) {
        e(i);
    }
}
