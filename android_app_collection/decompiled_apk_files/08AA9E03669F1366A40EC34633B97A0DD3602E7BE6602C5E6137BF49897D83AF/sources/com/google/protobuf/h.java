package com.google.protobuf;

import com.google.protobuf.ax;
import java.io.IOException;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.spongycastle.asn1.eac.CertificateBody;
/* compiled from: CodedOutputStream.java */
/* loaded from: classes.dex */
public abstract class h extends e {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f4439a = Logger.getLogger(h.class.getName());

    /* renamed from: b  reason: collision with root package name */
    private static final boolean f4440b = aw.a();

    /* renamed from: c  reason: collision with root package name */
    private static final long f4441c = aw.c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i) {
        if (i > 4096) {
            return 4096;
        }
        return i;
    }

    public static int b(double d2) {
        return 8;
    }

    public static int b(float f) {
        return 4;
    }

    public static int b(boolean z) {
        return 1;
    }

    public static int g(long j) {
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

    public static int i(long j) {
        return 8;
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

    public static int j(long j) {
        return 8;
    }

    public static long k(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int l(int i) {
        return 4;
    }

    public static int m(int i) {
        return 4;
    }

    public static int p(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract void a();

    public abstract void a(byte b2);

    public abstract void a(int i, int i2);

    public abstract void a(int i, ac acVar);

    public abstract void a(int i, f fVar);

    public abstract void a(int i, String str);

    public abstract void a(int i, boolean z);

    public abstract void a(ac acVar);

    public abstract void a(f fVar);

    public abstract void a(String str);

    @Override // com.google.protobuf.e
    public abstract void a(byte[] bArr, int i, int i2);

    public abstract int b();

    public abstract void b(int i);

    public abstract void b(int i, int i2);

    public abstract void b(int i, long j);

    public abstract void b(int i, ac acVar);

    public abstract void b(int i, f fVar);

    public abstract void b(long j);

    public abstract void c(int i);

    public abstract void c(int i, int i2);

    public abstract void c(int i, long j);

    abstract void c(byte[] bArr, int i, int i2);

    public abstract void d(int i, int i2);

    public abstract void d(long j);

    public abstract void e(int i);

    public static h a(OutputStream outputStream, int i) {
        return new d(outputStream, i);
    }

    public static h a(byte[] bArr) {
        return b(bArr, 0, bArr.length);
    }

    public static h b(byte[] bArr, int i, int i2) {
        return new b(bArr, i, i2);
    }

    private h() {
    }

    public final void a(int i, long j) {
        b(i, j);
    }

    public final void a(int i, double d2) {
        c(i, Double.doubleToRawLongBits(d2));
    }

    public final void e(int i, int i2) {
        b(i, i2);
    }

    public final void d(int i) {
        c(p(i));
    }

    public final void f(int i) {
        e(i);
    }

    public final void a(long j) {
        b(j);
    }

    public final void c(long j) {
        b(k(j));
    }

    public final void e(long j) {
        d(j);
    }

    public final void a(float f) {
        e(Float.floatToRawIntBits(f));
    }

    public final void a(double d2) {
        d(Double.doubleToRawLongBits(d2));
    }

    public final void a(boolean z) {
        a(z ? (byte) 1 : (byte) 0);
    }

    public final void g(int i) {
        b(i);
    }

    public final void b(byte[] bArr) {
        c(bArr, 0, bArr.length);
    }

    public static int f(int i, int i2) {
        return h(i) + i(i2);
    }

    public static int g(int i, int i2) {
        return h(i) + j(i2);
    }

    public static int h(int i, int i2) {
        return h(i) + l(i2);
    }

    public static int d(int i, long j) {
        return h(i) + f(j);
    }

    public static int e(int i, long j) {
        return h(i) + g(j);
    }

    public static int f(int i, long j) {
        return h(i) + i(j);
    }

    public static int b(int i, double d2) {
        return h(i) + b(d2);
    }

    public static int b(int i, boolean z) {
        return h(i) + b(z);
    }

    public static int i(int i, int i2) {
        return h(i) + n(i2);
    }

    public static int b(int i, String str) {
        return h(i) + b(str);
    }

    public static int c(int i, f fVar) {
        return h(i) + b(fVar);
    }

    public static int a(int i, w wVar) {
        return h(i) + a(wVar);
    }

    public static int c(int i, ac acVar) {
        return h(i) + b(acVar);
    }

    public static int d(int i, ac acVar) {
        return (h(1) * 2) + g(2, i) + c(3, acVar);
    }

    public static int d(int i, f fVar) {
        return (h(1) * 2) + g(2, i) + c(3, fVar);
    }

    public static int b(int i, w wVar) {
        return (h(1) * 2) + g(2, i) + a(3, wVar);
    }

    public static int h(int i) {
        return j(ay.a(i, 0));
    }

    public static int i(int i) {
        if (i >= 0) {
            return j(i);
        }
        return 10;
    }

    public static int k(int i) {
        return j(p(i));
    }

    public static int f(long j) {
        return g(j);
    }

    public static int h(long j) {
        return g(k(j));
    }

    public static int n(int i) {
        return i(i);
    }

    public static int b(String str) {
        int length;
        try {
            length = ax.a(str);
        } catch (ax.c unused) {
            length = str.getBytes(t.f4752a).length;
        }
        return o(length);
    }

    public static int a(w wVar) {
        return o(wVar.b());
    }

    public static int b(f fVar) {
        return o(fVar.b());
    }

    public static int c(byte[] bArr) {
        return o(bArr.length);
    }

    public static int b(ac acVar) {
        return o(acVar.getSerializedSize());
    }

    static int o(int i) {
        return j(i) + i;
    }

    public final void c() {
        if (b() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* compiled from: CodedOutputStream.java */
    /* loaded from: classes.dex */
    public static class c extends IOException {
        c() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        c(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        c(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: " + str, th);
        }
    }

    final void a(String str, ax.c cVar) {
        f4439a.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) cVar);
        byte[] bytes = str.getBytes(t.f4752a);
        try {
            c(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (c e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new c(e2);
        }
    }

    @Deprecated
    public final void e(int i, ac acVar) {
        a(i, 3);
        c(acVar);
        a(i, 4);
    }

    @Deprecated
    public final void c(ac acVar) {
        acVar.writeTo(this);
    }

    @Deprecated
    public static int f(int i, ac acVar) {
        return (h(i) * 2) + d(acVar);
    }

    @Deprecated
    public static int d(ac acVar) {
        return acVar.getSerializedSize();
    }

    @Deprecated
    public final void q(int i) {
        c(i);
    }

    @Deprecated
    public static int r(int i) {
        return j(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CodedOutputStream.java */
    /* loaded from: classes.dex */
    public static class b extends h {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f4446a;

        /* renamed from: b  reason: collision with root package name */
        private final int f4447b;

        /* renamed from: c  reason: collision with root package name */
        private final int f4448c;

        /* renamed from: d  reason: collision with root package name */
        private int f4449d;

        @Override // com.google.protobuf.h
        public void a() {
        }

        b(byte[] bArr, int i, int i2) {
            super();
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.f4446a = bArr;
            this.f4447b = i;
            this.f4449d = i;
            this.f4448c = i3;
        }

        @Override // com.google.protobuf.h
        public final void a(int i, int i2) {
            c(ay.a(i, i2));
        }

        @Override // com.google.protobuf.h
        public final void b(int i, int i2) {
            a(i, 0);
            b(i2);
        }

        @Override // com.google.protobuf.h
        public final void c(int i, int i2) {
            a(i, 0);
            c(i2);
        }

        @Override // com.google.protobuf.h
        public final void d(int i, int i2) {
            a(i, 5);
            e(i2);
        }

        @Override // com.google.protobuf.h
        public final void b(int i, long j) {
            a(i, 0);
            b(j);
        }

        @Override // com.google.protobuf.h
        public final void c(int i, long j) {
            a(i, 1);
            d(j);
        }

        @Override // com.google.protobuf.h
        public final void a(int i, boolean z) {
            a(i, 0);
            a(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.h
        public final void a(int i, String str) {
            a(i, 2);
            a(str);
        }

        @Override // com.google.protobuf.h
        public final void a(int i, f fVar) {
            a(i, 2);
            a(fVar);
        }

        @Override // com.google.protobuf.h
        public final void a(f fVar) {
            c(fVar.b());
            fVar.a(this);
        }

        @Override // com.google.protobuf.h
        public final void c(byte[] bArr, int i, int i2) {
            c(i2);
            d(bArr, i, i2);
        }

        @Override // com.google.protobuf.h
        public final void a(int i, ac acVar) {
            a(i, 2);
            a(acVar);
        }

        @Override // com.google.protobuf.h
        public final void b(int i, ac acVar) {
            a(1, 3);
            c(2, i);
            a(3, acVar);
            a(1, 4);
        }

        @Override // com.google.protobuf.h
        public final void b(int i, f fVar) {
            a(1, 3);
            c(2, i);
            a(3, fVar);
            a(1, 4);
        }

        @Override // com.google.protobuf.h
        public final void a(ac acVar) {
            c(acVar.getSerializedSize());
            acVar.writeTo(this);
        }

        @Override // com.google.protobuf.h
        public final void a(byte b2) {
            try {
                byte[] bArr = this.f4446a;
                int i = this.f4449d;
                this.f4449d = i + 1;
                bArr[i] = b2;
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4449d), Integer.valueOf(this.f4448c), 1), e);
            }
        }

        @Override // com.google.protobuf.h
        public final void b(int i) {
            if (i >= 0) {
                c(i);
            } else {
                b(i);
            }
        }

        @Override // com.google.protobuf.h
        public final void c(int i) {
            if (h.f4440b && b() >= 10) {
                long j = h.f4441c + this.f4449d;
                while ((i & (-128)) != 0) {
                    aw.a(this.f4446a, j, (byte) ((i & CertificateBody.profileType) | 128));
                    this.f4449d++;
                    i >>>= 7;
                    j = 1 + j;
                }
                aw.a(this.f4446a, j, (byte) i);
                this.f4449d++;
                return;
            }
            while ((i & (-128)) != 0) {
                try {
                    byte[] bArr = this.f4446a;
                    int i2 = this.f4449d;
                    this.f4449d = i2 + 1;
                    bArr[i2] = (byte) ((i & CertificateBody.profileType) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4449d), Integer.valueOf(this.f4448c), 1), e);
                }
            }
            byte[] bArr2 = this.f4446a;
            int i3 = this.f4449d;
            this.f4449d = i3 + 1;
            bArr2[i3] = (byte) i;
        }

        @Override // com.google.protobuf.h
        public final void e(int i) {
            try {
                byte[] bArr = this.f4446a;
                int i2 = this.f4449d;
                this.f4449d = i2 + 1;
                bArr[i2] = (byte) (i & 255);
                byte[] bArr2 = this.f4446a;
                int i3 = this.f4449d;
                this.f4449d = i3 + 1;
                bArr2[i3] = (byte) ((i >> 8) & 255);
                byte[] bArr3 = this.f4446a;
                int i4 = this.f4449d;
                this.f4449d = i4 + 1;
                bArr3[i4] = (byte) ((i >> 16) & 255);
                byte[] bArr4 = this.f4446a;
                int i5 = this.f4449d;
                this.f4449d = i5 + 1;
                bArr4[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4449d), Integer.valueOf(this.f4448c), 1), e);
            }
        }

        @Override // com.google.protobuf.h
        public final void b(long j) {
            if (h.f4440b && b() >= 10) {
                long j2 = h.f4441c + this.f4449d;
                while ((j & (-128)) != 0) {
                    aw.a(this.f4446a, j2, (byte) ((((int) j) & CertificateBody.profileType) | 128));
                    this.f4449d++;
                    j >>>= 7;
                    j2 = 1 + j2;
                }
                aw.a(this.f4446a, j2, (byte) j);
                this.f4449d++;
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr = this.f4446a;
                    int i = this.f4449d;
                    this.f4449d = i + 1;
                    bArr[i] = (byte) ((((int) j) & CertificateBody.profileType) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4449d), Integer.valueOf(this.f4448c), 1), e);
                }
            }
            byte[] bArr2 = this.f4446a;
            int i2 = this.f4449d;
            this.f4449d = i2 + 1;
            bArr2[i2] = (byte) j;
        }

        @Override // com.google.protobuf.h
        public final void d(long j) {
            try {
                byte[] bArr = this.f4446a;
                int i = this.f4449d;
                this.f4449d = i + 1;
                bArr[i] = (byte) (((int) j) & 255);
                byte[] bArr2 = this.f4446a;
                int i2 = this.f4449d;
                this.f4449d = i2 + 1;
                bArr2[i2] = (byte) (((int) (j >> 8)) & 255);
                byte[] bArr3 = this.f4446a;
                int i3 = this.f4449d;
                this.f4449d = i3 + 1;
                bArr3[i3] = (byte) (((int) (j >> 16)) & 255);
                byte[] bArr4 = this.f4446a;
                int i4 = this.f4449d;
                this.f4449d = i4 + 1;
                bArr4[i4] = (byte) (((int) (j >> 24)) & 255);
                byte[] bArr5 = this.f4446a;
                int i5 = this.f4449d;
                this.f4449d = i5 + 1;
                bArr5[i5] = (byte) (((int) (j >> 32)) & 255);
                byte[] bArr6 = this.f4446a;
                int i6 = this.f4449d;
                this.f4449d = i6 + 1;
                bArr6[i6] = (byte) (((int) (j >> 40)) & 255);
                byte[] bArr7 = this.f4446a;
                int i7 = this.f4449d;
                this.f4449d = i7 + 1;
                bArr7[i7] = (byte) (((int) (j >> 48)) & 255);
                byte[] bArr8 = this.f4446a;
                int i8 = this.f4449d;
                this.f4449d = i8 + 1;
                bArr8[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4449d), Integer.valueOf(this.f4448c), 1), e);
            }
        }

        public final void d(byte[] bArr, int i, int i2) {
            try {
                System.arraycopy(bArr, i, this.f4446a, this.f4449d, i2);
                this.f4449d += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new c(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f4449d), Integer.valueOf(this.f4448c), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.protobuf.h, com.google.protobuf.e
        public final void a(byte[] bArr, int i, int i2) {
            d(bArr, i, i2);
        }

        @Override // com.google.protobuf.h
        public final void a(String str) {
            int i = this.f4449d;
            try {
                int j = j(str.length() * 3);
                int j2 = j(str.length());
                if (j2 == j) {
                    this.f4449d = i + j2;
                    int a2 = ax.a(str, this.f4446a, this.f4449d, b());
                    this.f4449d = i;
                    c((a2 - i) - j2);
                    this.f4449d = a2;
                } else {
                    c(ax.a(str));
                    this.f4449d = ax.a(str, this.f4446a, this.f4449d, b());
                }
            } catch (ax.c e) {
                this.f4449d = i;
                a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new c(e2);
            }
        }

        @Override // com.google.protobuf.h
        public final int b() {
            return this.f4448c - this.f4449d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CodedOutputStream.java */
    /* loaded from: classes.dex */
    public static abstract class a extends h {

        /* renamed from: a  reason: collision with root package name */
        final byte[] f4442a;

        /* renamed from: b  reason: collision with root package name */
        final int f4443b;

        /* renamed from: c  reason: collision with root package name */
        int f4444c;

        /* renamed from: d  reason: collision with root package name */
        int f4445d;

        a(int i) {
            super();
            if (i < 0) {
                throw new IllegalArgumentException("bufferSize must be >= 0");
            }
            this.f4442a = new byte[Math.max(i, 20)];
            this.f4443b = this.f4442a.length;
        }

        @Override // com.google.protobuf.h
        public final int b() {
            throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array or ByteBuffer.");
        }

        final void b(byte b2) {
            byte[] bArr = this.f4442a;
            int i = this.f4444c;
            this.f4444c = i + 1;
            bArr[i] = b2;
            this.f4445d++;
        }

        final void j(int i, int i2) {
            t(ay.a(i, i2));
        }

        final void s(int i) {
            if (i >= 0) {
                t(i);
            } else {
                l(i);
            }
        }

        final void t(int i) {
            if (h.f4440b) {
                long j = h.f4441c + this.f4444c;
                long j2 = j;
                while ((i & (-128)) != 0) {
                    aw.a(this.f4442a, j2, (byte) ((i & CertificateBody.profileType) | 128));
                    i >>>= 7;
                    j2 = 1 + j2;
                }
                aw.a(this.f4442a, j2, (byte) i);
                int i2 = (int) ((1 + j2) - j);
                this.f4444c += i2;
                this.f4445d += i2;
                return;
            }
            while ((i & (-128)) != 0) {
                byte[] bArr = this.f4442a;
                int i3 = this.f4444c;
                this.f4444c = i3 + 1;
                bArr[i3] = (byte) ((i & CertificateBody.profileType) | 128);
                this.f4445d++;
                i >>>= 7;
            }
            byte[] bArr2 = this.f4442a;
            int i4 = this.f4444c;
            this.f4444c = i4 + 1;
            bArr2[i4] = (byte) i;
            this.f4445d++;
        }

        final void l(long j) {
            if (h.f4440b) {
                long j2 = h.f4441c + this.f4444c;
                long j3 = j2;
                while ((j & (-128)) != 0) {
                    aw.a(this.f4442a, j3, (byte) ((((int) j) & CertificateBody.profileType) | 128));
                    j >>>= 7;
                    j3 = 1 + j3;
                }
                aw.a(this.f4442a, j3, (byte) j);
                int i = (int) ((1 + j3) - j2);
                this.f4444c += i;
                this.f4445d += i;
                return;
            }
            while ((j & (-128)) != 0) {
                byte[] bArr = this.f4442a;
                int i2 = this.f4444c;
                this.f4444c = i2 + 1;
                bArr[i2] = (byte) ((((int) j) & CertificateBody.profileType) | 128);
                this.f4445d++;
                j >>>= 7;
            }
            byte[] bArr2 = this.f4442a;
            int i3 = this.f4444c;
            this.f4444c = i3 + 1;
            bArr2[i3] = (byte) j;
            this.f4445d++;
        }

        final void u(int i) {
            byte[] bArr = this.f4442a;
            int i2 = this.f4444c;
            this.f4444c = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            byte[] bArr2 = this.f4442a;
            int i3 = this.f4444c;
            this.f4444c = i3 + 1;
            bArr2[i3] = (byte) ((i >> 8) & 255);
            byte[] bArr3 = this.f4442a;
            int i4 = this.f4444c;
            this.f4444c = i4 + 1;
            bArr3[i4] = (byte) ((i >> 16) & 255);
            byte[] bArr4 = this.f4442a;
            int i5 = this.f4444c;
            this.f4444c = i5 + 1;
            bArr4[i5] = (byte) ((i >> 24) & 255);
            this.f4445d += 4;
        }

        final void m(long j) {
            byte[] bArr = this.f4442a;
            int i = this.f4444c;
            this.f4444c = i + 1;
            bArr[i] = (byte) (j & 255);
            byte[] bArr2 = this.f4442a;
            int i2 = this.f4444c;
            this.f4444c = i2 + 1;
            bArr2[i2] = (byte) ((j >> 8) & 255);
            byte[] bArr3 = this.f4442a;
            int i3 = this.f4444c;
            this.f4444c = i3 + 1;
            bArr3[i3] = (byte) ((j >> 16) & 255);
            byte[] bArr4 = this.f4442a;
            int i4 = this.f4444c;
            this.f4444c = i4 + 1;
            bArr4[i4] = (byte) (255 & (j >> 24));
            byte[] bArr5 = this.f4442a;
            int i5 = this.f4444c;
            this.f4444c = i5 + 1;
            bArr5[i5] = (byte) (((int) (j >> 32)) & 255);
            byte[] bArr6 = this.f4442a;
            int i6 = this.f4444c;
            this.f4444c = i6 + 1;
            bArr6[i6] = (byte) (((int) (j >> 40)) & 255);
            byte[] bArr7 = this.f4442a;
            int i7 = this.f4444c;
            this.f4444c = i7 + 1;
            bArr7[i7] = (byte) (((int) (j >> 48)) & 255);
            byte[] bArr8 = this.f4442a;
            int i8 = this.f4444c;
            this.f4444c = i8 + 1;
            bArr8[i8] = (byte) (((int) (j >> 56)) & 255);
            this.f4445d += 8;
        }
    }

    /* compiled from: CodedOutputStream.java */
    /* loaded from: classes.dex */
    private static final class d extends a {
        private final OutputStream e;

        d(OutputStream outputStream, int i) {
            super(i);
            if (outputStream == null) {
                throw new NullPointerException("out");
            }
            this.e = outputStream;
        }

        @Override // com.google.protobuf.h
        public void a(int i, int i2) {
            c(ay.a(i, i2));
        }

        @Override // com.google.protobuf.h
        public void b(int i, int i2) {
            v(20);
            j(i, 0);
            s(i2);
        }

        @Override // com.google.protobuf.h
        public void c(int i, int i2) {
            v(20);
            j(i, 0);
            t(i2);
        }

        @Override // com.google.protobuf.h
        public void d(int i, int i2) {
            v(14);
            j(i, 5);
            u(i2);
        }

        @Override // com.google.protobuf.h
        public void b(int i, long j) {
            v(20);
            j(i, 0);
            l(j);
        }

        @Override // com.google.protobuf.h
        public void c(int i, long j) {
            v(18);
            j(i, 1);
            m(j);
        }

        @Override // com.google.protobuf.h
        public void a(int i, boolean z) {
            v(11);
            j(i, 0);
            b(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.protobuf.h
        public void a(int i, String str) {
            a(i, 2);
            a(str);
        }

        @Override // com.google.protobuf.h
        public void a(int i, f fVar) {
            a(i, 2);
            a(fVar);
        }

        @Override // com.google.protobuf.h
        public void a(f fVar) {
            c(fVar.b());
            fVar.a(this);
        }

        @Override // com.google.protobuf.h
        public void c(byte[] bArr, int i, int i2) {
            c(i2);
            d(bArr, i, i2);
        }

        @Override // com.google.protobuf.h
        public void a(int i, ac acVar) {
            a(i, 2);
            a(acVar);
        }

        @Override // com.google.protobuf.h
        public void b(int i, ac acVar) {
            a(1, 3);
            c(2, i);
            a(3, acVar);
            a(1, 4);
        }

        @Override // com.google.protobuf.h
        public void b(int i, f fVar) {
            a(1, 3);
            c(2, i);
            a(3, fVar);
            a(1, 4);
        }

        @Override // com.google.protobuf.h
        public void a(ac acVar) {
            c(acVar.getSerializedSize());
            acVar.writeTo(this);
        }

        @Override // com.google.protobuf.h
        public void a(byte b2) {
            if (this.f4444c == this.f4443b) {
                f();
            }
            b(b2);
        }

        @Override // com.google.protobuf.h
        public void b(int i) {
            if (i >= 0) {
                c(i);
            } else {
                b(i);
            }
        }

        @Override // com.google.protobuf.h
        public void c(int i) {
            v(10);
            t(i);
        }

        @Override // com.google.protobuf.h
        public void e(int i) {
            v(4);
            u(i);
        }

        @Override // com.google.protobuf.h
        public void b(long j) {
            v(10);
            l(j);
        }

        @Override // com.google.protobuf.h
        public void d(long j) {
            v(8);
            m(j);
        }

        @Override // com.google.protobuf.h
        public void a(String str) {
            int a2;
            try {
                int length = str.length() * 3;
                int j = j(length);
                int i = j + length;
                if (i > this.f4443b) {
                    byte[] bArr = new byte[length];
                    int a3 = ax.a(str, bArr, 0, length);
                    c(a3);
                    a(bArr, 0, a3);
                    return;
                }
                if (i > this.f4443b - this.f4444c) {
                    f();
                }
                int j2 = j(str.length());
                int i2 = this.f4444c;
                try {
                    if (j2 == j) {
                        this.f4444c = i2 + j2;
                        int a4 = ax.a(str, this.f4442a, this.f4444c, this.f4443b - this.f4444c);
                        this.f4444c = i2;
                        a2 = (a4 - i2) - j2;
                        t(a2);
                        this.f4444c = a4;
                    } else {
                        a2 = ax.a(str);
                        t(a2);
                        this.f4444c = ax.a(str, this.f4442a, this.f4444c, a2);
                    }
                    this.f4445d += a2;
                } catch (ax.c e) {
                    this.f4445d -= this.f4444c - i2;
                    this.f4444c = i2;
                    throw e;
                } catch (ArrayIndexOutOfBoundsException e2) {
                    throw new c(e2);
                }
            } catch (ax.c e3) {
                a(str, e3);
            }
        }

        @Override // com.google.protobuf.h
        public void a() {
            if (this.f4444c > 0) {
                f();
            }
        }

        public void d(byte[] bArr, int i, int i2) {
            if (this.f4443b - this.f4444c >= i2) {
                System.arraycopy(bArr, i, this.f4442a, this.f4444c, i2);
                this.f4444c += i2;
                this.f4445d += i2;
                return;
            }
            int i3 = this.f4443b - this.f4444c;
            System.arraycopy(bArr, i, this.f4442a, this.f4444c, i3);
            int i4 = i + i3;
            int i5 = i2 - i3;
            this.f4444c = this.f4443b;
            this.f4445d += i3;
            f();
            if (i5 <= this.f4443b) {
                System.arraycopy(bArr, i4, this.f4442a, 0, i5);
                this.f4444c = i5;
            } else {
                this.e.write(bArr, i4, i5);
            }
            this.f4445d += i5;
        }

        @Override // com.google.protobuf.h, com.google.protobuf.e
        public void a(byte[] bArr, int i, int i2) {
            d(bArr, i, i2);
        }

        private void v(int i) {
            if (this.f4443b - this.f4444c < i) {
                f();
            }
        }

        private void f() {
            this.e.write(this.f4442a, 0, this.f4444c);
            this.f4444c = 0;
        }
    }
}
