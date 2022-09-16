package c.e.a.b.d.g;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public abstract class j4 extends s3 {

    /* renamed from: b  reason: collision with root package name */
    private static final Logger f4229b = Logger.getLogger(j4.class.getName());

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f4230c = a8.a();

    /* renamed from: a  reason: collision with root package name */
    l4 f4231a;

    /* loaded from: classes.dex */
    static class a extends j4 {

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f4232d;

        /* renamed from: e  reason: collision with root package name */
        private final int f4233e;

        /* renamed from: f  reason: collision with root package name */
        private int f4234f;

        a(byte[] bArr, int i, int i2) {
            super();
            if (bArr != null) {
                int i3 = i2 + 0;
                if ((i2 | 0 | (bArr.length - i3)) < 0) {
                    throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i2)));
                }
                this.f4232d = bArr;
                this.f4234f = 0;
                this.f4233e = i3;
                return;
            }
            throw new NullPointerException("buffer");
        }

        private final void b(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f4232d, this.f4234f, i2);
                this.f4234f += i2;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4234f), Integer.valueOf(this.f4233e), Integer.valueOf(i2)), e2);
            }
        }

        @Override // c.e.a.b.d.g.j4
        public final int a() {
            return this.f4233e - this.f4234f;
        }

        @Override // c.e.a.b.d.g.j4
        public final void a(byte b2) {
            try {
                byte[] bArr = this.f4232d;
                int i = this.f4234f;
                this.f4234f = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4234f), Integer.valueOf(this.f4233e), 1), e2);
            }
        }

        @Override // c.e.a.b.d.g.j4
        public final void a(int i) {
            if (i >= 0) {
                b(i);
            } else {
                a(i);
            }
        }

        @Override // c.e.a.b.d.g.j4
        public final void a(int i, int i2) {
            b((i << 3) | i2);
        }

        @Override // c.e.a.b.d.g.j4
        public final void a(int i, long j) {
            a(i, 0);
            a(j);
        }

        @Override // c.e.a.b.d.g.j4
        public final void a(int i, k6 k6Var) {
            a(1, 3);
            c(2, i);
            a(3, 2);
            a(k6Var);
            a(1, 4);
        }

        @Override // c.e.a.b.d.g.j4
        final void a(int i, k6 k6Var, b7 b7Var) {
            a(i, 2);
            m3 m3Var = (m3) k6Var;
            int g2 = m3Var.g();
            if (g2 == -1) {
                g2 = b7Var.d(m3Var);
                m3Var.a(g2);
            }
            b(g2);
            b7Var.a((b7) k6Var, (o8) this.f4231a);
        }

        @Override // c.e.a.b.d.g.j4
        public final void a(int i, v3 v3Var) {
            a(i, 2);
            b(v3Var);
        }

        @Override // c.e.a.b.d.g.j4
        public final void a(int i, String str) {
            a(i, 2);
            b(str);
        }

        @Override // c.e.a.b.d.g.j4
        public final void a(int i, boolean z) {
            a(i, 0);
            a(z ? (byte) 1 : (byte) 0);
        }

        @Override // c.e.a.b.d.g.j4
        public final void a(long j) {
            if (j4.f4230c && a() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.f4232d;
                    int i = this.f4234f;
                    this.f4234f = i + 1;
                    a8.a(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.f4232d;
                int i2 = this.f4234f;
                this.f4234f = i2 + 1;
                a8.a(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.f4232d;
                    int i3 = this.f4234f;
                    this.f4234f = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4234f), Integer.valueOf(this.f4233e), 1), e2);
                }
            }
            byte[] bArr4 = this.f4232d;
            int i4 = this.f4234f;
            this.f4234f = i4 + 1;
            bArr4[i4] = (byte) j;
        }

        public final void a(k6 k6Var) {
            b(k6Var.b());
            k6Var.a(this);
        }

        @Override // c.e.a.b.d.g.s3
        public final void a(byte[] bArr, int i, int i2) {
            b(bArr, i, i2);
        }

        @Override // c.e.a.b.d.g.j4
        public final void b(int i) {
            if (!j4.f4230c || o3.a() || a() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.f4232d;
                        int i2 = this.f4234f;
                        this.f4234f = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e2) {
                        throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4234f), Integer.valueOf(this.f4233e), 1), e2);
                    }
                }
                byte[] bArr2 = this.f4232d;
                int i3 = this.f4234f;
                this.f4234f = i3 + 1;
                bArr2[i3] = (byte) i;
            } else if ((i & (-128)) == 0) {
                byte[] bArr3 = this.f4232d;
                int i4 = this.f4234f;
                this.f4234f = i4 + 1;
                a8.a(bArr3, i4, (byte) i);
            } else {
                byte[] bArr4 = this.f4232d;
                int i5 = this.f4234f;
                this.f4234f = i5 + 1;
                a8.a(bArr4, i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & (-128)) == 0) {
                    byte[] bArr5 = this.f4232d;
                    int i7 = this.f4234f;
                    this.f4234f = i7 + 1;
                    a8.a(bArr5, i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.f4232d;
                int i8 = this.f4234f;
                this.f4234f = i8 + 1;
                a8.a(bArr6, i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & (-128)) == 0) {
                    byte[] bArr7 = this.f4232d;
                    int i10 = this.f4234f;
                    this.f4234f = i10 + 1;
                    a8.a(bArr7, i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.f4232d;
                int i11 = this.f4234f;
                this.f4234f = i11 + 1;
                a8.a(bArr8, i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & (-128)) == 0) {
                    byte[] bArr9 = this.f4232d;
                    int i13 = this.f4234f;
                    this.f4234f = i13 + 1;
                    a8.a(bArr9, i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.f4232d;
                int i14 = this.f4234f;
                this.f4234f = i14 + 1;
                a8.a(bArr10, i14, (byte) (i12 | 128));
                byte[] bArr11 = this.f4232d;
                int i15 = this.f4234f;
                this.f4234f = i15 + 1;
                a8.a(bArr11, i15, (byte) (i12 >>> 7));
            }
        }

        @Override // c.e.a.b.d.g.j4
        public final void b(int i, int i2) {
            a(i, 0);
            a(i2);
        }

        @Override // c.e.a.b.d.g.j4
        public final void b(int i, v3 v3Var) {
            a(1, 3);
            c(2, i);
            a(3, v3Var);
            a(1, 4);
        }

        public final void b(v3 v3Var) {
            b(v3Var.f());
            v3Var.a(this);
        }

        public final void b(String str) {
            int i = this.f4234f;
            try {
                int g2 = j4.g(str.length() * 3);
                int g3 = j4.g(str.length());
                if (g3 != g2) {
                    b(c8.a(str));
                    this.f4234f = c8.a(str, this.f4232d, this.f4234f, a());
                    return;
                }
                this.f4234f = i + g3;
                int a2 = c8.a(str, this.f4232d, this.f4234f, a());
                this.f4234f = i;
                b((a2 - i) - g3);
                this.f4234f = a2;
            } catch (g8 e2) {
                this.f4234f = i;
                a(str, e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new b(e3);
            }
        }

        @Override // c.e.a.b.d.g.j4
        public final void c(int i, int i2) {
            a(i, 0);
            b(i2);
        }

        @Override // c.e.a.b.d.g.j4
        public final void c(int i, long j) {
            a(i, 1);
            c(j);
        }

        @Override // c.e.a.b.d.g.j4
        public final void c(long j) {
            try {
                byte[] bArr = this.f4232d;
                int i = this.f4234f;
                this.f4234f = i + 1;
                bArr[i] = (byte) j;
                byte[] bArr2 = this.f4232d;
                int i2 = this.f4234f;
                this.f4234f = i2 + 1;
                bArr2[i2] = (byte) (j >> 8);
                byte[] bArr3 = this.f4232d;
                int i3 = this.f4234f;
                this.f4234f = i3 + 1;
                bArr3[i3] = (byte) (j >> 16);
                byte[] bArr4 = this.f4232d;
                int i4 = this.f4234f;
                this.f4234f = i4 + 1;
                bArr4[i4] = (byte) (j >> 24);
                byte[] bArr5 = this.f4232d;
                int i5 = this.f4234f;
                this.f4234f = i5 + 1;
                bArr5[i5] = (byte) (j >> 32);
                byte[] bArr6 = this.f4232d;
                int i6 = this.f4234f;
                this.f4234f = i6 + 1;
                bArr6[i6] = (byte) (j >> 40);
                byte[] bArr7 = this.f4232d;
                int i7 = this.f4234f;
                this.f4234f = i7 + 1;
                bArr7[i7] = (byte) (j >> 48);
                byte[] bArr8 = this.f4232d;
                int i8 = this.f4234f;
                this.f4234f = i8 + 1;
                bArr8[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4234f), Integer.valueOf(this.f4233e), 1), e2);
            }
        }

        @Override // c.e.a.b.d.g.j4
        public final void d(int i) {
            try {
                byte[] bArr = this.f4232d;
                int i2 = this.f4234f;
                this.f4234f = i2 + 1;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.f4232d;
                int i3 = this.f4234f;
                this.f4234f = i3 + 1;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.f4232d;
                int i4 = this.f4234f;
                this.f4234f = i4 + 1;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.f4232d;
                int i5 = this.f4234f;
                this.f4234f = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e2) {
                throw new b(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4234f), Integer.valueOf(this.f4233e), 1), e2);
            }
        }

        @Override // c.e.a.b.d.g.j4
        public final void e(int i, int i2) {
            a(i, 5);
            d(i2);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends IOException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        b(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: c.e.a.b.d.g.j4.b.<init>(java.lang.String, java.lang.Throwable):void");
        }

        b(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }
    }

    private j4() {
    }

    public static int a(int i, t5 t5Var) {
        int e2 = e(i);
        int a2 = t5Var.a();
        return e2 + g(a2) + a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(k6 k6Var, b7 b7Var) {
        m3 m3Var = (m3) k6Var;
        int g2 = m3Var.g();
        if (g2 == -1) {
            g2 = b7Var.d(m3Var);
            m3Var.a(g2);
        }
        return g(g2) + g2;
    }

    public static int a(t5 t5Var) {
        int a2 = t5Var.a();
        return g(a2) + a2;
    }

    public static int a(v3 v3Var) {
        int f2 = v3Var.f();
        return g(f2) + f2;
    }

    public static int a(String str) {
        int length;
        try {
            length = c8.a(str);
        } catch (g8 unused) {
            length = str.getBytes(e5.f4123a).length;
        }
        return g(length) + length;
    }

    public static j4 a(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
    }

    public static int b(double d2) {
        return 8;
    }

    public static int b(float f2) {
        return 4;
    }

    public static int b(int i, double d2) {
        return e(i) + 8;
    }

    public static int b(int i, float f2) {
        return e(i) + 4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int b(int i, k6 k6Var, b7 b7Var) {
        return e(i) + a(k6Var, b7Var);
    }

    public static int b(int i, String str) {
        return e(i) + a(str);
    }

    public static int b(int i, boolean z) {
        return e(i) + 1;
    }

    public static int b(boolean z) {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Deprecated
    public static int c(int i, k6 k6Var, b7 b7Var) {
        int e2 = e(i) << 1;
        m3 m3Var = (m3) k6Var;
        int g2 = m3Var.g();
        if (g2 == -1) {
            g2 = b7Var.d(m3Var);
            m3Var.a(g2);
        }
        return e2 + g2;
    }

    public static int c(int i, v3 v3Var) {
        int e2 = e(i);
        int f2 = v3Var.f();
        return e2 + g(f2) + f2;
    }

    public static int d(int i, long j) {
        return e(i) + e(j);
    }

    public static int d(int i, v3 v3Var) {
        return (e(1) << 1) + g(2, i) + c(3, v3Var);
    }

    public static int d(long j) {
        return e(j);
    }

    public static int e(int i) {
        return g(i << 3);
    }

    public static int e(int i, long j) {
        return e(i) + e(j);
    }

    public static int e(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int f(int i) {
        if (i >= 0) {
            return g(i);
        }
        return 10;
    }

    public static int f(int i, int i2) {
        return e(i) + f(i2);
    }

    public static int f(int i, long j) {
        return e(i) + e(i(j));
    }

    public static int f(long j) {
        return e(i(j));
    }

    public static int g(int i) {
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

    public static int g(int i, int i2) {
        return e(i) + g(i2);
    }

    public static int g(int i, long j) {
        return e(i) + 8;
    }

    public static int g(long j) {
        return 8;
    }

    public static int h(int i) {
        return g(l(i));
    }

    public static int h(int i, int i2) {
        return e(i) + g(l(i2));
    }

    public static int h(int i, long j) {
        return e(i) + 8;
    }

    public static int h(long j) {
        return 8;
    }

    public static int i(int i) {
        return 4;
    }

    public static int i(int i, int i2) {
        return e(i) + 4;
    }

    private static long i(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int j(int i) {
        return 4;
    }

    public static int j(int i, int i2) {
        return e(i) + 4;
    }

    public static int k(int i) {
        return f(i);
    }

    public static int k(int i, int i2) {
        return e(i) + f(i2);
    }

    private static int l(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract int a();

    public abstract void a(byte b2);

    public final void a(double d2) {
        c(Double.doubleToRawLongBits(d2));
    }

    public final void a(float f2) {
        d(Float.floatToRawIntBits(f2));
    }

    public abstract void a(int i);

    public final void a(int i, double d2) {
        c(i, Double.doubleToRawLongBits(d2));
    }

    public final void a(int i, float f2) {
        e(i, Float.floatToRawIntBits(f2));
    }

    public abstract void a(int i, int i2);

    public abstract void a(int i, long j);

    public abstract void a(int i, k6 k6Var);

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void a(int i, k6 k6Var, b7 b7Var);

    public abstract void a(int i, v3 v3Var);

    public abstract void a(int i, String str);

    public abstract void a(int i, boolean z);

    public abstract void a(long j);

    final void a(String str, g8 g8Var) {
        f4229b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) g8Var);
        byte[] bytes = str.getBytes(e5.f4123a);
        try {
            b(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (b e2) {
            throw e2;
        } catch (IndexOutOfBoundsException e3) {
            throw new b(e3);
        }
    }

    public final void a(boolean z) {
        a(z ? (byte) 1 : (byte) 0);
    }

    public final void b() {
        if (a() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    public abstract void b(int i);

    public abstract void b(int i, int i2);

    public final void b(int i, long j) {
        a(i, i(j));
    }

    public abstract void b(int i, v3 v3Var);

    public final void b(long j) {
        a(i(j));
    }

    public final void c(int i) {
        b(l(i));
    }

    public abstract void c(int i, int i2);

    public abstract void c(int i, long j);

    public abstract void c(long j);

    public abstract void d(int i);

    public final void d(int i, int i2) {
        c(i, l(i2));
    }

    public abstract void e(int i, int i2);
}
