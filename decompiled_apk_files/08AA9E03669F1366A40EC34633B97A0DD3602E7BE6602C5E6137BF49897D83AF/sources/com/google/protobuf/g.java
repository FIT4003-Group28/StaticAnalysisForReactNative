package com.google.protobuf;

import com.google.android.gms.common.api.Api;
import com.google.protobuf.ac;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import org.spongycastle.asn1.eac.CertificateBody;
/* compiled from: CodedInputStream.java */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    int f4434a;

    /* renamed from: b  reason: collision with root package name */
    int f4435b;

    /* renamed from: c  reason: collision with root package name */
    int f4436c;

    public static long a(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int e(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int a();

    public abstract <T extends ac> T a(ai<T> aiVar, p pVar);

    public abstract void a(int i);

    public abstract void a(int i, ac.a aVar, p pVar);

    public abstract void a(ac.a aVar, p pVar);

    public abstract double b();

    public abstract boolean b(int i);

    public abstract float c();

    public abstract int c(int i);

    public abstract long d();

    public abstract void d(int i);

    public abstract long e();

    public abstract int f();

    public abstract long g();

    public abstract int h();

    public abstract boolean i();

    public abstract String j();

    public abstract String k();

    public abstract f l();

    public abstract int m();

    public abstract int n();

    public abstract int o();

    public abstract long p();

    public abstract int q();

    public abstract long r();

    public abstract int s();

    abstract long t();

    public abstract int u();

    public static g a(InputStream inputStream) {
        return a(inputStream, 4096);
    }

    static g a(InputStream inputStream, int i) {
        if (inputStream == null) {
            return a(t.f4754c);
        }
        return new b(inputStream, i);
    }

    public static g a(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    public static g a(byte[] bArr, int i, int i2) {
        return a(bArr, i, i2, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static g a(byte[] bArr, int i, int i2, boolean z) {
        a aVar = new a(bArr, i, i2, z);
        try {
            aVar.c(i2);
            return aVar;
        } catch (u e) {
            throw new IllegalArgumentException(e);
        }
    }

    private g() {
        this.f4435b = 100;
        this.f4436c = Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public static int a(int i, InputStream inputStream) {
        if ((i & 128) == 0) {
            return i;
        }
        int i2 = i & CertificateBody.profileType;
        int i3 = 7;
        while (i3 < 32) {
            int read = inputStream.read();
            if (read == -1) {
                throw u.c();
            }
            i2 |= (read & CertificateBody.profileType) << i3;
            if ((read & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        while (i3 < 64) {
            int read2 = inputStream.read();
            if (read2 == -1) {
                throw u.c();
            }
            if ((read2 & 128) == 0) {
                return i2;
            }
            i3 += 7;
        }
        throw u.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CodedInputStream.java */
    /* loaded from: classes.dex */
    public static final class a extends g {

        /* renamed from: d  reason: collision with root package name */
        private final byte[] f4437d;
        private final boolean e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private boolean k;
        private int l;

        private a(byte[] bArr, int i, int i2, boolean z) {
            super();
            this.l = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.f4437d = bArr;
            this.f = i2 + i;
            this.h = i;
            this.i = this.h;
            this.e = z;
        }

        @Override // com.google.protobuf.g
        public int a() {
            if (z()) {
                this.j = 0;
                return 0;
            }
            this.j = s();
            if (ay.b(this.j) == 0) {
                throw u.f();
            }
            return this.j;
        }

        @Override // com.google.protobuf.g
        public void a(int i) {
            if (this.j != i) {
                throw u.g();
            }
        }

        @Override // com.google.protobuf.g
        public boolean b(int i) {
            switch (ay.a(i)) {
                case 0:
                    C();
                    return true;
                case 1:
                    g(8);
                    return true;
                case 2:
                    g(s());
                    return true;
                case 3:
                    v();
                    a(ay.a(ay.b(i), 4));
                    return true;
                case 4:
                    return false;
                case 5:
                    g(4);
                    return true;
                default:
                    throw u.h();
            }
        }

        public void v() {
            int a2;
            do {
                a2 = a();
                if (a2 == 0) {
                    return;
                }
            } while (b(a2));
        }

        @Override // com.google.protobuf.g
        public double b() {
            return Double.longBitsToDouble(y());
        }

        @Override // com.google.protobuf.g
        public float c() {
            return Float.intBitsToFloat(x());
        }

        @Override // com.google.protobuf.g
        public long d() {
            return w();
        }

        @Override // com.google.protobuf.g
        public long e() {
            return w();
        }

        @Override // com.google.protobuf.g
        public int f() {
            return s();
        }

        @Override // com.google.protobuf.g
        public long g() {
            return y();
        }

        @Override // com.google.protobuf.g
        public int h() {
            return x();
        }

        @Override // com.google.protobuf.g
        public boolean i() {
            return w() != 0;
        }

        @Override // com.google.protobuf.g
        public String j() {
            int s = s();
            if (s > 0 && s <= this.f - this.h) {
                String str = new String(this.f4437d, this.h, s, t.f4752a);
                this.h += s;
                return str;
            } else if (s == 0) {
                return "";
            } else {
                if (s < 0) {
                    throw u.d();
                }
                throw u.c();
            }
        }

        @Override // com.google.protobuf.g
        public String k() {
            int s = s();
            if (s <= 0 || s > this.f - this.h) {
                if (s == 0) {
                    return "";
                }
                if (s <= 0) {
                    throw u.d();
                }
                throw u.c();
            } else if (!ax.a(this.f4437d, this.h, this.h + s)) {
                throw u.k();
            } else {
                int i = this.h;
                this.h += s;
                return new String(this.f4437d, i, s, t.f4752a);
            }
        }

        @Override // com.google.protobuf.g
        public void a(int i, ac.a aVar, p pVar) {
            if (this.f4434a >= this.f4435b) {
                throw u.i();
            }
            this.f4434a++;
            aVar.c(this, pVar);
            a(ay.a(i, 4));
            this.f4434a--;
        }

        @Override // com.google.protobuf.g
        public void a(ac.a aVar, p pVar) {
            int s = s();
            if (this.f4434a >= this.f4435b) {
                throw u.i();
            }
            int c2 = c(s);
            this.f4434a++;
            aVar.c(this, pVar);
            a(0);
            this.f4434a--;
            d(c2);
        }

        @Override // com.google.protobuf.g
        public <T extends ac> T a(ai<T> aiVar, p pVar) {
            int s = s();
            if (this.f4434a >= this.f4435b) {
                throw u.i();
            }
            int c2 = c(s);
            this.f4434a++;
            T d2 = aiVar.d(this, pVar);
            a(0);
            this.f4434a--;
            d(c2);
            return d2;
        }

        @Override // com.google.protobuf.g
        public f l() {
            f a2;
            int s = s();
            if (s <= 0 || s > this.f - this.h) {
                if (s == 0) {
                    return f.f4423a;
                }
                return f.b(f(s));
            }
            if (this.e && this.k) {
                a2 = f.b(this.f4437d, this.h, s);
            } else {
                a2 = f.a(this.f4437d, this.h, s);
            }
            this.h += s;
            return a2;
        }

        @Override // com.google.protobuf.g
        public int m() {
            return s();
        }

        @Override // com.google.protobuf.g
        public int n() {
            return s();
        }

        @Override // com.google.protobuf.g
        public int o() {
            return x();
        }

        @Override // com.google.protobuf.g
        public long p() {
            return y();
        }

        @Override // com.google.protobuf.g
        public int q() {
            return e(s());
        }

        @Override // com.google.protobuf.g
        public long r() {
            return a(w());
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
            if (r1[r2] < 0) goto L34;
         */
        @Override // com.google.protobuf.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int s() {
            /*
                r5 = this;
                int r0 = r5.h
                int r1 = r5.f
                if (r1 != r0) goto L7
                goto L6c
            L7:
                byte[] r1 = r5.f4437d
                int r2 = r0 + 1
                r0 = r1[r0]
                if (r0 < 0) goto L12
                r5.h = r2
                return r0
            L12:
                int r3 = r5.f
                int r3 = r3 - r2
                r4 = 9
                if (r3 >= r4) goto L1a
                goto L6c
            L1a:
                int r3 = r2 + 1
                r2 = r1[r2]
                int r2 = r2 << 7
                r0 = r0 ^ r2
                if (r0 >= 0) goto L26
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L72
            L26:
                int r2 = r3 + 1
                r3 = r1[r3]
                int r3 = r3 << 14
                r0 = r0 ^ r3
                if (r0 < 0) goto L33
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L31:
                r3 = r2
                goto L72
            L33:
                int r3 = r2 + 1
                r2 = r1[r2]
                int r2 = r2 << 21
                r0 = r0 ^ r2
                if (r0 >= 0) goto L41
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L72
            L41:
                int r2 = r3 + 1
                r3 = r1[r3]
                int r4 = r3 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r3 >= 0) goto L31
                int r3 = r2 + 1
                r2 = r1[r2]
                if (r2 >= 0) goto L72
                int r2 = r3 + 1
                r3 = r1[r3]
                if (r3 >= 0) goto L31
                int r3 = r2 + 1
                r2 = r1[r2]
                if (r2 >= 0) goto L72
                int r2 = r3 + 1
                r3 = r1[r3]
                if (r3 >= 0) goto L31
                int r3 = r2 + 1
                r1 = r1[r2]
                if (r1 >= 0) goto L72
            L6c:
                long r0 = r5.t()
                int r0 = (int) r0
                return r0
            L72:
                r5.h = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.g.a.s():int");
        }

        private void C() {
            if (this.f - this.h >= 10) {
                D();
            } else {
                E();
            }
        }

        private void D() {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.f4437d;
                int i2 = this.h;
                this.h = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw u.e();
        }

        private void E() {
            for (int i = 0; i < 10; i++) {
                if (B() >= 0) {
                    return;
                }
            }
            throw u.e();
        }

        public long w() {
            int i;
            long j;
            long j2;
            long j3;
            int i2 = this.h;
            if (this.f != i2) {
                byte[] bArr = this.f4437d;
                int i3 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.h = i3;
                    return b2;
                } else if (this.f - i3 >= 9) {
                    int i4 = i3 + 1;
                    int i5 = b2 ^ (bArr[i3] << 7);
                    if (i5 >= 0) {
                        int i6 = i4 + 1;
                        int i7 = i5 ^ (bArr[i4] << 14);
                        if (i7 >= 0) {
                            long j4 = i7 ^ 16256;
                            i = i6;
                            j = j4;
                        } else {
                            i4 = i6 + 1;
                            int i8 = i7 ^ (bArr[i6] << 21);
                            if (i8 < 0) {
                                j3 = i8 ^ (-2080896);
                            } else {
                                long j5 = i8;
                                i = i4 + 1;
                                long j6 = (bArr[i4] << 28) ^ j5;
                                if (j6 >= 0) {
                                    j = j6 ^ 266354560;
                                } else {
                                    int i9 = i + 1;
                                    long j7 = j6 ^ (bArr[i] << 35);
                                    if (j7 < 0) {
                                        j2 = (-34093383808L) ^ j7;
                                    } else {
                                        i = i9 + 1;
                                        long j8 = j7 ^ (bArr[i9] << 42);
                                        if (j8 >= 0) {
                                            j = j8 ^ 4363953127296L;
                                        } else {
                                            i9 = i + 1;
                                            long j9 = j8 ^ (bArr[i] << 49);
                                            if (j9 < 0) {
                                                j2 = (-558586000294016L) ^ j9;
                                            } else {
                                                i = i9 + 1;
                                                long j10 = (j9 ^ (bArr[i9] << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    i9 = i + 1;
                                                    if (bArr[i] >= 0) {
                                                        j = j10;
                                                        i = i9;
                                                    }
                                                } else {
                                                    j = j10;
                                                }
                                            }
                                        }
                                    }
                                    j = j2;
                                    i = i9;
                                }
                            }
                        }
                        this.h = i;
                        return j;
                    }
                    j3 = i5 ^ (-128);
                    j = j3;
                    i = i4;
                    this.h = i;
                    return j;
                }
            }
            return t();
        }

        @Override // com.google.protobuf.g
        long t() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte B = B();
                j |= (B & Byte.MAX_VALUE) << i;
                if ((B & 128) == 0) {
                    return j;
                }
            }
            throw u.e();
        }

        public int x() {
            int i = this.h;
            if (this.f - i < 4) {
                throw u.c();
            }
            byte[] bArr = this.f4437d;
            this.h = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long y() {
            int i = this.h;
            if (this.f - i < 8) {
                throw u.c();
            }
            byte[] bArr = this.f4437d;
            this.h = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // com.google.protobuf.g
        public int c(int i) {
            if (i < 0) {
                throw u.d();
            }
            int A = i + A();
            int i2 = this.l;
            if (A > i2) {
                throw u.c();
            }
            this.l = A;
            F();
            return i2;
        }

        private void F() {
            this.f += this.g;
            int i = this.f - this.i;
            if (i > this.l) {
                this.g = i - this.l;
                this.f -= this.g;
                return;
            }
            this.g = 0;
        }

        @Override // com.google.protobuf.g
        public void d(int i) {
            this.l = i;
            F();
        }

        @Override // com.google.protobuf.g
        public int u() {
            if (this.l == Integer.MAX_VALUE) {
                return -1;
            }
            return this.l - A();
        }

        public boolean z() {
            return this.h == this.f;
        }

        public int A() {
            return this.h - this.i;
        }

        public byte B() {
            if (this.h == this.f) {
                throw u.c();
            }
            byte[] bArr = this.f4437d;
            int i = this.h;
            this.h = i + 1;
            return bArr[i];
        }

        public byte[] f(int i) {
            if (i > 0 && i <= this.f - this.h) {
                int i2 = this.h;
                this.h += i;
                return Arrays.copyOfRange(this.f4437d, i2, this.h);
            } else if (i > 0) {
                throw u.c();
            } else {
                if (i == 0) {
                    return t.f4754c;
                }
                throw u.d();
            }
        }

        public void g(int i) {
            if (i >= 0 && i <= this.f - this.h) {
                this.h += i;
            } else if (i < 0) {
                throw u.d();
            } else {
                throw u.c();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: CodedInputStream.java */
    /* loaded from: classes.dex */
    public static final class b extends g {

        /* renamed from: d  reason: collision with root package name */
        private final InputStream f4438d;
        private final byte[] e;
        private int f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;
        private a l;

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: CodedInputStream.java */
        /* loaded from: classes.dex */
        public interface a {
            void a();
        }

        private b(InputStream inputStream, int i) {
            super();
            this.k = Api.BaseClientBuilder.API_PRIORITY_OTHER;
            this.l = null;
            t.a(inputStream, "input");
            this.f4438d = inputStream;
            this.e = new byte[i];
            this.f = 0;
            this.h = 0;
            this.j = 0;
        }

        @Override // com.google.protobuf.g
        public int a() {
            if (z()) {
                this.i = 0;
                return 0;
            }
            this.i = s();
            if (ay.b(this.i) == 0) {
                throw u.f();
            }
            return this.i;
        }

        @Override // com.google.protobuf.g
        public void a(int i) {
            if (this.i != i) {
                throw u.g();
            }
        }

        @Override // com.google.protobuf.g
        public boolean b(int i) {
            switch (ay.a(i)) {
                case 0:
                    B();
                    return true;
                case 1:
                    f(8);
                    return true;
                case 2:
                    f(s());
                    return true;
                case 3:
                    v();
                    a(ay.a(ay.b(i), 4));
                    return true;
                case 4:
                    return false;
                case 5:
                    f(4);
                    return true;
                default:
                    throw u.h();
            }
        }

        public void v() {
            int a2;
            do {
                a2 = a();
                if (a2 == 0) {
                    return;
                }
            } while (b(a2));
        }

        @Override // com.google.protobuf.g
        public double b() {
            return Double.longBitsToDouble(y());
        }

        @Override // com.google.protobuf.g
        public float c() {
            return Float.intBitsToFloat(x());
        }

        @Override // com.google.protobuf.g
        public long d() {
            return w();
        }

        @Override // com.google.protobuf.g
        public long e() {
            return w();
        }

        @Override // com.google.protobuf.g
        public int f() {
            return s();
        }

        @Override // com.google.protobuf.g
        public long g() {
            return y();
        }

        @Override // com.google.protobuf.g
        public int h() {
            return x();
        }

        @Override // com.google.protobuf.g
        public boolean i() {
            return w() != 0;
        }

        @Override // com.google.protobuf.g
        public String j() {
            int s = s();
            if (s > 0 && s <= this.f - this.h) {
                String str = new String(this.e, this.h, s, t.f4752a);
                this.h += s;
                return str;
            } else if (s == 0) {
                return "";
            } else {
                if (s <= this.f) {
                    g(s);
                    String str2 = new String(this.e, this.h, s, t.f4752a);
                    this.h += s;
                    return str2;
                }
                return new String(i(s), t.f4752a);
            }
        }

        @Override // com.google.protobuf.g
        public String k() {
            byte[] i;
            int s = s();
            int i2 = this.h;
            int i3 = 0;
            if (s <= this.f - i2 && s > 0) {
                i = this.e;
                this.h = i2 + s;
                i3 = i2;
            } else if (s == 0) {
                return "";
            } else {
                if (s <= this.f) {
                    g(s);
                    i = this.e;
                    this.h = s + 0;
                } else {
                    i = i(s);
                }
            }
            if (!ax.a(i, i3, i3 + s)) {
                throw u.k();
            }
            return new String(i, i3, s, t.f4752a);
        }

        @Override // com.google.protobuf.g
        public void a(int i, ac.a aVar, p pVar) {
            if (this.f4434a >= this.f4435b) {
                throw u.i();
            }
            this.f4434a++;
            aVar.c(this, pVar);
            a(ay.a(i, 4));
            this.f4434a--;
        }

        @Override // com.google.protobuf.g
        public void a(ac.a aVar, p pVar) {
            int s = s();
            if (this.f4434a >= this.f4435b) {
                throw u.i();
            }
            int c2 = c(s);
            this.f4434a++;
            aVar.c(this, pVar);
            a(0);
            this.f4434a--;
            d(c2);
        }

        @Override // com.google.protobuf.g
        public <T extends ac> T a(ai<T> aiVar, p pVar) {
            int s = s();
            if (this.f4434a >= this.f4435b) {
                throw u.i();
            }
            int c2 = c(s);
            this.f4434a++;
            T d2 = aiVar.d(this, pVar);
            a(0);
            this.f4434a--;
            d(c2);
            return d2;
        }

        @Override // com.google.protobuf.g
        public f l() {
            int s = s();
            if (s > this.f - this.h || s <= 0) {
                if (s == 0) {
                    return f.f4423a;
                }
                return f.b(i(s));
            }
            f a2 = f.a(this.e, this.h, s);
            this.h += s;
            return a2;
        }

        @Override // com.google.protobuf.g
        public int m() {
            return s();
        }

        @Override // com.google.protobuf.g
        public int n() {
            return s();
        }

        @Override // com.google.protobuf.g
        public int o() {
            return x();
        }

        @Override // com.google.protobuf.g
        public long p() {
            return y();
        }

        @Override // com.google.protobuf.g
        public int q() {
            return e(s());
        }

        @Override // com.google.protobuf.g
        public long r() {
            return a(w());
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x006a, code lost:
            if (r1[r2] < 0) goto L34;
         */
        @Override // com.google.protobuf.g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int s() {
            /*
                r5 = this;
                int r0 = r5.h
                int r1 = r5.f
                if (r1 != r0) goto L7
                goto L6c
            L7:
                byte[] r1 = r5.e
                int r2 = r0 + 1
                r0 = r1[r0]
                if (r0 < 0) goto L12
                r5.h = r2
                return r0
            L12:
                int r3 = r5.f
                int r3 = r3 - r2
                r4 = 9
                if (r3 >= r4) goto L1a
                goto L6c
            L1a:
                int r3 = r2 + 1
                r2 = r1[r2]
                int r2 = r2 << 7
                r0 = r0 ^ r2
                if (r0 >= 0) goto L26
                r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
                goto L72
            L26:
                int r2 = r3 + 1
                r3 = r1[r3]
                int r3 = r3 << 14
                r0 = r0 ^ r3
                if (r0 < 0) goto L33
                r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            L31:
                r3 = r2
                goto L72
            L33:
                int r3 = r2 + 1
                r2 = r1[r2]
                int r2 = r2 << 21
                r0 = r0 ^ r2
                if (r0 >= 0) goto L41
                r1 = -2080896(0xffffffffffe03f80, float:NaN)
                r0 = r0 ^ r1
                goto L72
            L41:
                int r2 = r3 + 1
                r3 = r1[r3]
                int r4 = r3 << 28
                r0 = r0 ^ r4
                r4 = 266354560(0xfe03f80, float:2.2112565E-29)
                r0 = r0 ^ r4
                if (r3 >= 0) goto L31
                int r3 = r2 + 1
                r2 = r1[r2]
                if (r2 >= 0) goto L72
                int r2 = r3 + 1
                r3 = r1[r3]
                if (r3 >= 0) goto L31
                int r3 = r2 + 1
                r2 = r1[r2]
                if (r2 >= 0) goto L72
                int r2 = r3 + 1
                r3 = r1[r3]
                if (r3 >= 0) goto L31
                int r3 = r2 + 1
                r1 = r1[r2]
                if (r1 >= 0) goto L72
            L6c:
                long r0 = r5.t()
                int r0 = (int) r0
                return r0
            L72:
                r5.h = r3
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.g.b.s():int");
        }

        private void B() {
            if (this.f - this.h >= 10) {
                C();
            } else {
                D();
            }
        }

        private void C() {
            for (int i = 0; i < 10; i++) {
                byte[] bArr = this.e;
                int i2 = this.h;
                this.h = i2 + 1;
                if (bArr[i2] >= 0) {
                    return;
                }
            }
            throw u.e();
        }

        private void D() {
            for (int i = 0; i < 10; i++) {
                if (A() >= 0) {
                    return;
                }
            }
            throw u.e();
        }

        public long w() {
            int i;
            long j;
            long j2;
            long j3;
            int i2 = this.h;
            if (this.f != i2) {
                byte[] bArr = this.e;
                int i3 = i2 + 1;
                byte b2 = bArr[i2];
                if (b2 >= 0) {
                    this.h = i3;
                    return b2;
                } else if (this.f - i3 >= 9) {
                    int i4 = i3 + 1;
                    int i5 = b2 ^ (bArr[i3] << 7);
                    if (i5 >= 0) {
                        int i6 = i4 + 1;
                        int i7 = i5 ^ (bArr[i4] << 14);
                        if (i7 >= 0) {
                            long j4 = i7 ^ 16256;
                            i = i6;
                            j = j4;
                        } else {
                            i4 = i6 + 1;
                            int i8 = i7 ^ (bArr[i6] << 21);
                            if (i8 < 0) {
                                j3 = i8 ^ (-2080896);
                            } else {
                                long j5 = i8;
                                i = i4 + 1;
                                long j6 = (bArr[i4] << 28) ^ j5;
                                if (j6 >= 0) {
                                    j = j6 ^ 266354560;
                                } else {
                                    int i9 = i + 1;
                                    long j7 = j6 ^ (bArr[i] << 35);
                                    if (j7 < 0) {
                                        j2 = (-34093383808L) ^ j7;
                                    } else {
                                        i = i9 + 1;
                                        long j8 = j7 ^ (bArr[i9] << 42);
                                        if (j8 >= 0) {
                                            j = j8 ^ 4363953127296L;
                                        } else {
                                            i9 = i + 1;
                                            long j9 = j8 ^ (bArr[i] << 49);
                                            if (j9 < 0) {
                                                j2 = (-558586000294016L) ^ j9;
                                            } else {
                                                i = i9 + 1;
                                                long j10 = (j9 ^ (bArr[i9] << 56)) ^ 71499008037633920L;
                                                if (j10 < 0) {
                                                    i9 = i + 1;
                                                    if (bArr[i] >= 0) {
                                                        j = j10;
                                                        i = i9;
                                                    }
                                                } else {
                                                    j = j10;
                                                }
                                            }
                                        }
                                    }
                                    j = j2;
                                    i = i9;
                                }
                            }
                        }
                        this.h = i;
                        return j;
                    }
                    j3 = i5 ^ (-128);
                    j = j3;
                    i = i4;
                    this.h = i;
                    return j;
                }
            }
            return t();
        }

        @Override // com.google.protobuf.g
        long t() {
            long j = 0;
            for (int i = 0; i < 64; i += 7) {
                byte A = A();
                j |= (A & Byte.MAX_VALUE) << i;
                if ((A & 128) == 0) {
                    return j;
                }
            }
            throw u.e();
        }

        public int x() {
            int i = this.h;
            if (this.f - i < 4) {
                g(4);
                i = this.h;
            }
            byte[] bArr = this.e;
            this.h = i + 4;
            return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        }

        public long y() {
            int i = this.h;
            if (this.f - i < 8) {
                g(8);
                i = this.h;
            }
            byte[] bArr = this.e;
            this.h = i + 8;
            return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
        }

        @Override // com.google.protobuf.g
        public int c(int i) {
            if (i < 0) {
                throw u.d();
            }
            int i2 = i + this.j + this.h;
            int i3 = this.k;
            if (i2 > i3) {
                throw u.c();
            }
            this.k = i2;
            E();
            return i3;
        }

        private void E() {
            this.f += this.g;
            int i = this.j + this.f;
            if (i > this.k) {
                this.g = i - this.k;
                this.f -= this.g;
                return;
            }
            this.g = 0;
        }

        @Override // com.google.protobuf.g
        public void d(int i) {
            this.k = i;
            E();
        }

        @Override // com.google.protobuf.g
        public int u() {
            if (this.k == Integer.MAX_VALUE) {
                return -1;
            }
            return this.k - (this.j + this.h);
        }

        public boolean z() {
            return this.h == this.f && !h(1);
        }

        private void g(int i) {
            if (!h(i)) {
                throw u.c();
            }
        }

        private boolean h(int i) {
            if (this.h + i <= this.f) {
                throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
            } else if (this.j + this.h + i > this.k) {
                return false;
            } else {
                if (this.l != null) {
                    this.l.a();
                }
                int i2 = this.h;
                if (i2 > 0) {
                    if (this.f > i2) {
                        System.arraycopy(this.e, i2, this.e, 0, this.f - i2);
                    }
                    this.j += i2;
                    this.f -= i2;
                    this.h = 0;
                }
                int read = this.f4438d.read(this.e, this.f, this.e.length - this.f);
                if (read == 0 || read < -1 || read > this.e.length) {
                    throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + read + "\nThe InputStream implementation is buggy.");
                } else if (read <= 0) {
                    return false;
                } else {
                    this.f += read;
                    if ((this.j + i) - this.f4436c > 0) {
                        throw u.j();
                    }
                    E();
                    if (this.f < i) {
                        return h(i);
                    }
                    return true;
                }
            }
        }

        public byte A() {
            if (this.h == this.f) {
                g(1);
            }
            byte[] bArr = this.e;
            int i = this.h;
            this.h = i + 1;
            return bArr[i];
        }

        private byte[] i(int i) {
            if (i == 0) {
                return t.f4754c;
            }
            if (i < 0) {
                throw u.d();
            }
            int i2 = this.j + this.h + i;
            if (i2 - this.f4436c > 0) {
                throw u.j();
            }
            if (i2 > this.k) {
                f((this.k - this.j) - this.h);
                throw u.c();
            }
            int i3 = this.h;
            int i4 = this.f - this.h;
            this.j += this.f;
            this.h = 0;
            this.f = 0;
            int i5 = i - i4;
            if (i5 < 4096 || i5 <= this.f4438d.available()) {
                byte[] bArr = new byte[i];
                System.arraycopy(this.e, i3, bArr, 0, i4);
                while (i4 < bArr.length) {
                    int read = this.f4438d.read(bArr, i4, i - i4);
                    if (read == -1) {
                        throw u.c();
                    }
                    this.j += read;
                    i4 += read;
                }
                return bArr;
            }
            ArrayList<byte[]> arrayList = new ArrayList();
            while (i5 > 0) {
                byte[] bArr2 = new byte[Math.min(i5, 4096)];
                int i6 = 0;
                while (i6 < bArr2.length) {
                    int read2 = this.f4438d.read(bArr2, i6, bArr2.length - i6);
                    if (read2 == -1) {
                        throw u.c();
                    }
                    this.j += read2;
                    i6 += read2;
                }
                i5 -= bArr2.length;
                arrayList.add(bArr2);
            }
            byte[] bArr3 = new byte[i];
            System.arraycopy(this.e, i3, bArr3, 0, i4);
            for (byte[] bArr4 : arrayList) {
                System.arraycopy(bArr4, 0, bArr3, i4, bArr4.length);
                i4 += bArr4.length;
            }
            return bArr3;
        }

        public void f(int i) {
            if (i <= this.f - this.h && i >= 0) {
                this.h += i;
            } else {
                j(i);
            }
        }

        private void j(int i) {
            if (i < 0) {
                throw u.d();
            }
            if (this.j + this.h + i > this.k) {
                f((this.k - this.j) - this.h);
                throw u.c();
            }
            int i2 = this.f - this.h;
            this.h = this.f;
            g(1);
            while (true) {
                int i3 = i - i2;
                if (i3 > this.f) {
                    i2 += this.f;
                    this.h = this.f;
                    g(1);
                } else {
                    this.h = i3;
                    return;
                }
            }
        }
    }
}
