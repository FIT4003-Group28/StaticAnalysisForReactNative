package c;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* compiled from: Buffer.java */
/* loaded from: classes.dex */
public final class c implements d, e, Cloneable {

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f1281c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: a  reason: collision with root package name */
    p f1282a;

    /* renamed from: b  reason: collision with root package name */
    long f1283b;

    @Override // c.d, c.e
    public c b() {
        return this;
    }

    @Override // c.d
    /* renamed from: c */
    public c w() {
        return this;
    }

    @Override // c.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // c.d
    public d d() {
        return this;
    }

    @Override // c.d, c.s, java.io.Flushable
    public void flush() {
    }

    public long a() {
        return this.f1283b;
    }

    @Override // c.e
    public boolean e() {
        return this.f1283b == 0;
    }

    @Override // c.e
    public void a(long j) {
        if (this.f1283b < j) {
            throw new EOFException();
        }
    }

    @Override // c.e
    public boolean b(long j) {
        return this.f1283b >= j;
    }

    @Override // c.e
    public InputStream f() {
        return new InputStream() { // from class: c.c.1
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (c.this.f1283b > 0) {
                    return c.this.h() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i, int i2) {
                return c.this.a(bArr, i, i2);
            }

            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(c.this.f1283b, 2147483647L);
            }

            public String toString() {
                return c.this + ".inputStream()";
            }
        };
    }

    public c a(c cVar, long j, long j2) {
        if (cVar == null) {
            throw new IllegalArgumentException("out == null");
        }
        v.a(this.f1283b, j, j2);
        if (j2 == 0) {
            return this;
        }
        cVar.f1283b += j2;
        p pVar = this.f1282a;
        while (j >= pVar.f1321c - pVar.f1320b) {
            j -= pVar.f1321c - pVar.f1320b;
            pVar = pVar.f;
        }
        while (j2 > 0) {
            p pVar2 = new p(pVar);
            pVar2.f1320b = (int) (pVar2.f1320b + j);
            pVar2.f1321c = Math.min(pVar2.f1320b + ((int) j2), pVar2.f1321c);
            if (cVar.f1282a == null) {
                pVar2.g = pVar2;
                pVar2.f = pVar2;
                cVar.f1282a = pVar2;
            } else {
                cVar.f1282a.g.a(pVar2);
            }
            j2 -= pVar2.f1321c - pVar2.f1320b;
            pVar = pVar.f;
            j = 0;
        }
        return this;
    }

    public long g() {
        long j = this.f1283b;
        if (j == 0) {
            return 0L;
        }
        p pVar = this.f1282a.g;
        return (pVar.f1321c >= 8192 || !pVar.e) ? j : j - (pVar.f1321c - pVar.f1320b);
    }

    @Override // c.e
    public byte h() {
        if (this.f1283b == 0) {
            throw new IllegalStateException("size == 0");
        }
        p pVar = this.f1282a;
        int i = pVar.f1320b;
        int i2 = pVar.f1321c;
        int i3 = i + 1;
        byte b2 = pVar.f1319a[i];
        this.f1283b--;
        if (i3 == i2) {
            this.f1282a = pVar.a();
            q.a(pVar);
        } else {
            pVar.f1320b = i3;
        }
        return b2;
    }

    public byte c(long j) {
        v.a(this.f1283b, j, 1L);
        p pVar = this.f1282a;
        while (true) {
            long j2 = pVar.f1321c - pVar.f1320b;
            if (j >= j2) {
                j -= j2;
                pVar = pVar.f;
            } else {
                return pVar.f1319a[pVar.f1320b + ((int) j)];
            }
        }
    }

    @Override // c.e
    public short i() {
        if (this.f1283b < 2) {
            throw new IllegalStateException("size < 2: " + this.f1283b);
        }
        p pVar = this.f1282a;
        int i = pVar.f1320b;
        int i2 = pVar.f1321c;
        if (i2 - i < 2) {
            return (short) (((h() & 255) << 8) | (h() & 255));
        }
        byte[] bArr = pVar.f1319a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f1283b -= 2;
        if (i4 == i2) {
            this.f1282a = pVar.a();
            q.a(pVar);
        } else {
            pVar.f1320b = i4;
        }
        return (short) i5;
    }

    @Override // c.e
    public int j() {
        if (this.f1283b < 4) {
            throw new IllegalStateException("size < 4: " + this.f1283b);
        }
        p pVar = this.f1282a;
        int i = pVar.f1320b;
        int i2 = pVar.f1321c;
        if (i2 - i < 4) {
            return ((h() & 255) << 24) | ((h() & 255) << 16) | ((h() & 255) << 8) | (h() & 255);
        }
        byte[] bArr = pVar.f1319a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.f1283b -= 4;
        if (i8 == i2) {
            this.f1282a = pVar.a();
            q.a(pVar);
        } else {
            pVar.f1320b = i8;
        }
        return i9;
    }

    @Override // c.e
    public long k() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if (this.f1283b < 8) {
            throw new IllegalStateException("size < 8: " + this.f1283b);
        }
        p pVar = this.f1282a;
        int i8 = pVar.f1320b;
        int i9 = pVar.f1321c;
        if (i9 - i8 < 8) {
            return ((j() & 4294967295L) << 32) | (4294967295L & j());
        }
        byte[] bArr = pVar.f1319a;
        int i10 = i8 + 1 + 1 + 1 + 1 + 1 + 1 + 1 + 1;
        long j = (bArr[i7] & 255) | ((bArr[i8] & 255) << 56) | ((bArr[i] & 255) << 48) | ((bArr[i2] & 255) << 40) | ((bArr[i3] & 255) << 32) | ((bArr[i4] & 255) << 24) | ((bArr[i5] & 255) << 16) | ((bArr[i6] & 255) << 8);
        this.f1283b -= 8;
        if (i10 == i9) {
            this.f1282a = pVar.a();
            q.a(pVar);
        } else {
            pVar.f1320b = i10;
        }
        return j;
    }

    @Override // c.e
    public short l() {
        return v.a(i());
    }

    @Override // c.e
    public int m() {
        return v.a(j());
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b3 A[EDGE_INSN: B:46:0x00b3->B:40:0x00b3 ?: BREAK  , SYNTHETIC] */
    @Override // c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long n() {
        /*
            r18 = this;
            r0 = r18
            long r1 = r0.f1283b
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L12
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        L12:
            r5 = -7
            r7 = 0
            r8 = r5
            r5 = 0
            r6 = 0
        L18:
            c.p r10 = r0.f1282a
            byte[] r11 = r10.f1319a
            int r12 = r10.f1320b
            int r13 = r10.f1321c
        L20:
            if (r12 >= r13) goto L9f
            r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L72
            r1 = 57
            if (r15 > r1) goto L72
            int r14 = r14 - r15
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L45
            if (r16 != 0) goto L3e
            long r1 = (long) r14
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 >= 0) goto L3e
            goto L45
        L3e:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r14
            long r3 = r3 + r1
            goto L7c
        L45:
            c.c r1 = new c.c
            r1.<init>()
            c.c r1 = r1.n(r3)
            c.c r1 = r1.i(r15)
            if (r5 != 0) goto L57
            r1.h()
        L57:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.q()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L72:
            r1 = 45
            if (r15 != r1) goto L81
            if (r7 != 0) goto L81
            r1 = 1
            long r8 = r8 - r1
            r5 = 1
        L7c:
            int r12 = r12 + 1
            int r7 = r7 + 1
            goto L20
        L81:
            if (r7 != 0) goto L9e
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected leading [0-9] or '-' character but was 0x"
            r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r15)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L9e:
            r6 = 1
        L9f:
            if (r12 != r13) goto Lab
            c.p r1 = r10.a()
            r0.f1282a = r1
            c.q.a(r10)
            goto Lad
        Lab:
            r10.f1320b = r12
        Lad:
            if (r6 != 0) goto Lb3
            c.p r1 = r0.f1282a
            if (r1 != 0) goto L18
        Lb3:
            long r1 = r0.f1283b
            long r6 = (long) r7
            long r1 = r1 - r6
            r0.f1283b = r1
            if (r5 == 0) goto Lbc
            goto Lbd
        Lbc:
            long r3 = -r3
        Lbd:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.n():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ad A[EDGE_INSN: B:42:0x00ad->B:39:0x00ad ?: BREAK  , SYNTHETIC] */
    @Override // c.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long o() {
        /*
            r14 = this;
            long r0 = r14.f1283b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L10
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        L10:
            r0 = 0
            r4 = r2
            r1 = 0
        L13:
            c.p r6 = r14.f1282a
            byte[] r7 = r6.f1319a
            int r8 = r6.f1320b
            int r9 = r6.f1321c
        L1b:
            if (r8 >= r9) goto L99
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L2a
            r11 = 57
            if (r10 > r11) goto L2a
            int r11 = r10 + (-48)
            goto L43
        L2a:
            r11 = 97
            if (r10 < r11) goto L37
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L37
            int r11 = r10 + (-97)
            int r11 = r11 + 10
            goto L43
        L37:
            r11 = 65
            if (r10 < r11) goto L7b
            r11 = 70
            if (r10 > r11) goto L7b
            int r11 = r10 + (-65)
            int r11 = r11 + 10
        L43:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L72
            c.c r0 = new c.c
            r0.<init>()
            c.c r0 = r0.m(r4)
            c.c r0 = r0.i(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.q()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L72:
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r0 = r0 + 1
            goto L1b
        L7b:
            if (r0 != 0) goto L98
            java.lang.NumberFormatException r0 = new java.lang.NumberFormatException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            r1.append(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r10)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L98:
            r1 = 1
        L99:
            if (r8 != r9) goto La5
            c.p r7 = r6.a()
            r14.f1282a = r7
            c.q.a(r6)
            goto La7
        La5:
            r6.f1320b = r8
        La7:
            if (r1 != 0) goto Lad
            c.p r6 = r14.f1282a
            if (r6 != 0) goto L13
        Lad:
            long r1 = r14.f1283b
            long r6 = (long) r0
            long r1 = r1 - r6
            r14.f1283b = r1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.o():long");
    }

    public f p() {
        return new f(s());
    }

    @Override // c.e
    public f d(long j) {
        return new f(h(j));
    }

    @Override // c.e
    public void a(c cVar, long j) {
        if (this.f1283b < j) {
            cVar.write(this, this.f1283b);
            throw new EOFException();
        } else {
            cVar.write(this, j);
        }
    }

    public String q() {
        try {
            return a(this.f1283b, v.f1325a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public String e(long j) {
        return a(j, v.f1325a);
    }

    @Override // c.e
    public String a(Charset charset) {
        try {
            return a(this.f1283b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public String a(long j, Charset charset) {
        v.a(this.f1283b, 0L, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        } else if (j == 0) {
            return "";
        } else {
            p pVar = this.f1282a;
            if (pVar.f1320b + j > pVar.f1321c) {
                return new String(h(j), charset);
            }
            String str = new String(pVar.f1319a, pVar.f1320b, (int) j, charset);
            pVar.f1320b = (int) (pVar.f1320b + j);
            this.f1283b -= j;
            if (pVar.f1320b == pVar.f1321c) {
                this.f1282a = pVar.a();
                q.a(pVar);
            }
            return str;
        }
    }

    @Override // c.e
    public String r() {
        return f(Long.MAX_VALUE);
    }

    public String f(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j + 1;
        }
        long a2 = a((byte) 10, 0L, j2);
        if (a2 != -1) {
            return g(a2);
        }
        if (j2 < a() && c(j2 - 1) == 13 && c(j2) == 10) {
            return g(j2);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, a()));
        throw new EOFException("\\n not found: limit=" + Math.min(a(), j) + " content=" + cVar.p().f() + (char) 8230);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String g(long j) {
        if (j > 0) {
            long j2 = j - 1;
            if (c(j2) == 13) {
                String e = e(j2);
                i(2L);
                return e;
            }
        }
        String e2 = e(j);
        i(1L);
        return e2;
    }

    @Override // c.e
    public byte[] s() {
        try {
            return h(this.f1283b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // c.e
    public byte[] h(long j) {
        v.a(this.f1283b, 0L, j);
        if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
        }
        byte[] bArr = new byte[(int) j];
        a(bArr);
        return bArr;
    }

    @Override // c.e
    public void a(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a2 = a(bArr, i, bArr.length - i);
            if (a2 == -1) {
                throw new EOFException();
            }
            i += a2;
        }
    }

    @Override // c.e
    public int a(byte[] bArr, int i, int i2) {
        v.a(bArr.length, i, i2);
        p pVar = this.f1282a;
        if (pVar == null) {
            return -1;
        }
        int min = Math.min(i2, pVar.f1321c - pVar.f1320b);
        System.arraycopy(pVar.f1319a, pVar.f1320b, bArr, i, min);
        pVar.f1320b += min;
        this.f1283b -= min;
        if (pVar.f1320b == pVar.f1321c) {
            this.f1282a = pVar.a();
            q.a(pVar);
        }
        return min;
    }

    public void t() {
        try {
            i(this.f1283b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    @Override // c.e
    public void i(long j) {
        while (j > 0) {
            if (this.f1282a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, this.f1282a.f1321c - this.f1282a.f1320b);
            long j2 = min;
            this.f1283b -= j2;
            j -= j2;
            this.f1282a.f1320b += min;
            if (this.f1282a.f1320b == this.f1282a.f1321c) {
                p pVar = this.f1282a;
                this.f1282a = pVar.a();
                q.a(pVar);
            }
        }
    }

    @Override // c.d
    /* renamed from: a */
    public c b(f fVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("byteString == null");
        }
        fVar.a(this);
        return this;
    }

    @Override // c.d
    /* renamed from: a */
    public c b(String str) {
        return a(str, 0, str.length());
    }

    public c a(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt < 128) {
                    p e = e(1);
                    byte[] bArr = e.f1319a;
                    int i3 = e.f1321c - i;
                    int min = Math.min(i2, 8192 - i3);
                    int i4 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (i4 < min) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 >= 128) {
                            break;
                        }
                        bArr[i4 + i3] = (byte) charAt2;
                        i4++;
                    }
                    int i5 = (i3 + i4) - e.f1321c;
                    e.f1321c += i5;
                    this.f1283b += i5;
                    i = i4;
                } else if (charAt < 2048) {
                    i((charAt >> 6) | 192);
                    i((charAt & '?') | 128);
                    i++;
                } else if (charAt < 55296 || charAt > 57343) {
                    i((charAt >> '\f') | 224);
                    i(((charAt >> 6) & 63) | 128);
                    i((charAt & '?') | 128);
                    i++;
                } else {
                    int i6 = i + 1;
                    char charAt3 = i6 < i2 ? str.charAt(i6) : (char) 0;
                    if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        i(63);
                        i = i6;
                    } else {
                        int i7 = (((charAt & 10239) << 10) | (9215 & charAt3)) + PKIFailureInfo.notAuthorized;
                        i((i7 >> 18) | 240);
                        i(((i7 >> 12) & 63) | 128);
                        i(((i7 >> 6) & 63) | 128);
                        i((i7 & 63) | 128);
                        i += 2;
                    }
                }
            }
            return this;
        }
    }

    public c a(int i) {
        if (i < 128) {
            i(i);
        } else if (i < 2048) {
            i((i >> 6) | 192);
            i((i & 63) | 128);
        } else if (i < 65536) {
            if (i >= 55296 && i <= 57343) {
                i(63);
            } else {
                i((i >> 12) | 224);
                i(((i >> 6) & 63) | 128);
                i((i & 63) | 128);
            }
        } else if (i <= 1114111) {
            i((i >> 18) | 240);
            i(((i >> 12) & 63) | 128);
            i(((i >> 6) & 63) | 128);
            i((i & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
        }
        return this;
    }

    public c a(String str, Charset charset) {
        return a(str, 0, str.length(), charset);
    }

    public c a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i);
        } else if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        } else if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else {
            if (charset.equals(v.f1325a)) {
                return a(str, i, i2);
            }
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return c(bytes, 0, bytes.length);
        }
    }

    @Override // c.d
    /* renamed from: b */
    public c c(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        return c(bArr, 0, bArr.length);
    }

    @Override // c.d
    /* renamed from: b */
    public c c(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = i2;
        v.a(bArr.length, i, j);
        int i3 = i2 + i;
        while (i < i3) {
            p e = e(1);
            int min = Math.min(i3 - i, 8192 - e.f1321c);
            System.arraycopy(bArr, i, e.f1319a, e.f1321c, min);
            i += min;
            e.f1321c += min;
        }
        this.f1283b += j;
        return this;
    }

    @Override // c.d
    public long a(t tVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j = 0;
        while (true) {
            long read = tVar.read(this, 8192L);
            if (read == -1) {
                return j;
            }
            j += read;
        }
    }

    @Override // c.d
    /* renamed from: b */
    public c i(int i) {
        p e = e(1);
        byte[] bArr = e.f1319a;
        int i2 = e.f1321c;
        e.f1321c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f1283b++;
        return this;
    }

    @Override // c.d
    /* renamed from: c */
    public c h(int i) {
        p e = e(2);
        byte[] bArr = e.f1319a;
        int i2 = e.f1321c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        e.f1321c = i3 + 1;
        this.f1283b += 2;
        return this;
    }

    @Override // c.d
    /* renamed from: d */
    public c g(int i) {
        p e = e(4);
        byte[] bArr = e.f1319a;
        int i2 = e.f1321c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        e.f1321c = i5 + 1;
        this.f1283b += 4;
        return this;
    }

    @Override // c.d
    /* renamed from: j */
    public c o(long j) {
        p e = e(8);
        byte[] bArr = e.f1319a;
        int i = e.f1321c;
        int i2 = i + 1;
        bArr[i] = (byte) ((j >>> 56) & 255);
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((j >>> 48) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((j >>> 40) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((j >>> 32) & 255);
        int i6 = i5 + 1;
        bArr[i5] = (byte) ((j >>> 24) & 255);
        int i7 = i6 + 1;
        bArr[i6] = (byte) ((j >>> 16) & 255);
        int i8 = i7 + 1;
        bArr[i7] = (byte) ((j >>> 8) & 255);
        bArr[i8] = (byte) (j & 255);
        e.f1321c = i8 + 1;
        this.f1283b += 8;
        return this;
    }

    @Override // c.d
    /* renamed from: k */
    public c n(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            return i(48);
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                return b("-9223372036854775808");
            }
            z = true;
        }
        if (j >= 100000000) {
            i2 = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i2 = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i2 = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i2 = 2;
        }
        if (z) {
            i2++;
        }
        p e = e(i2);
        byte[] bArr = e.f1319a;
        int i3 = e.f1321c + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = f1281c[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        e.f1321c += i2;
        this.f1283b += i2;
        return this;
    }

    @Override // c.d
    /* renamed from: l */
    public c m(long j) {
        if (j == 0) {
            return i(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        p e = e(numberOfTrailingZeros);
        byte[] bArr = e.f1319a;
        int i = e.f1321c;
        for (int i2 = (e.f1321c + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f1281c[(int) (15 & j)];
            j >>>= 4;
        }
        e.f1321c += numberOfTrailingZeros;
        this.f1283b += numberOfTrailingZeros;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public p e(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        if (this.f1282a == null) {
            this.f1282a = q.a();
            p pVar = this.f1282a;
            p pVar2 = this.f1282a;
            p pVar3 = this.f1282a;
            pVar2.g = pVar3;
            pVar.f = pVar3;
            return pVar3;
        }
        p pVar4 = this.f1282a.g;
        return (pVar4.f1321c + i > 8192 || !pVar4.e) ? pVar4.a(q.a()) : pVar4;
    }

    @Override // c.s
    public void write(c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        v.a(cVar.f1283b, 0L, j);
        while (j > 0) {
            if (j < cVar.f1282a.f1321c - cVar.f1282a.f1320b) {
                p pVar = this.f1282a != null ? this.f1282a.g : null;
                if (pVar != null && pVar.e) {
                    if ((pVar.f1321c + j) - (pVar.f1322d ? 0 : pVar.f1320b) <= 8192) {
                        cVar.f1282a.a(pVar, (int) j);
                        cVar.f1283b -= j;
                        this.f1283b += j;
                        return;
                    }
                }
                cVar.f1282a = cVar.f1282a.a((int) j);
            }
            p pVar2 = cVar.f1282a;
            long j2 = pVar2.f1321c - pVar2.f1320b;
            cVar.f1282a = pVar2.a();
            if (this.f1282a == null) {
                this.f1282a = pVar2;
                p pVar3 = this.f1282a;
                p pVar4 = this.f1282a;
                p pVar5 = this.f1282a;
                pVar4.g = pVar5;
                pVar3.f = pVar5;
            } else {
                this.f1282a.g.a(pVar2).b();
            }
            cVar.f1283b -= j2;
            this.f1283b += j2;
            j -= j2;
        }
    }

    @Override // c.t
    public long read(c cVar, long j) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j);
        } else if (this.f1283b == 0) {
            return -1L;
        } else {
            if (j > this.f1283b) {
                j = this.f1283b;
            }
            cVar.write(this, j);
            return j;
        }
    }

    @Override // c.e
    public long a(byte b2) {
        return a(b2, 0L, Long.MAX_VALUE);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long a(byte r11, long r12, long r14) {
        /*
            r10 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 < 0) goto L7a
            int r2 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r2 >= 0) goto Lc
            goto L7a
        Lc:
            long r2 = r10.f1283b
            int r2 = (r14 > r2 ? 1 : (r14 == r2 ? 0 : -1))
            if (r2 <= 0) goto L14
            long r14 = r10.f1283b
        L14:
            int r2 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            r3 = -1
            if (r2 != 0) goto L1b
            return r3
        L1b:
            c.p r2 = r10.f1282a
            if (r2 != 0) goto L20
            return r3
        L20:
            long r5 = r10.f1283b
            long r5 = r5 - r12
            int r5 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r5 >= 0) goto L37
            long r0 = r10.f1283b
        L29:
            int r5 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r5 <= 0) goto L46
            c.p r2 = r2.g
            int r5 = r2.f1321c
            int r6 = r2.f1320b
            int r5 = r5 - r6
            long r5 = (long) r5
            long r0 = r0 - r5
            goto L29
        L37:
            int r5 = r2.f1321c
            int r6 = r2.f1320b
            int r5 = r5 - r6
            long r5 = (long) r5
            long r5 = r5 + r0
            int r7 = (r5 > r12 ? 1 : (r5 == r12 ? 0 : -1))
            if (r7 >= 0) goto L46
            c.p r2 = r2.f
            r0 = r5
            goto L37
        L46:
            int r5 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r5 >= 0) goto L79
            byte[] r5 = r2.f1319a
            int r6 = r2.f1321c
            long r6 = (long) r6
            int r8 = r2.f1320b
            long r8 = (long) r8
            long r8 = r8 + r14
            long r8 = r8 - r0
            long r6 = java.lang.Math.min(r6, r8)
            int r6 = (int) r6
            int r7 = r2.f1320b
            long r7 = (long) r7
            long r7 = r7 + r12
            long r7 = r7 - r0
            int r12 = (int) r7
        L5f:
            if (r12 >= r6) goto L6e
            r13 = r5[r12]
            if (r13 != r11) goto L6b
            int r11 = r2.f1320b
            int r12 = r12 - r11
            long r11 = (long) r12
            long r11 = r11 + r0
            return r11
        L6b:
            int r12 = r12 + 1
            goto L5f
        L6e:
            int r12 = r2.f1321c
            int r13 = r2.f1320b
            int r12 = r12 - r13
            long r12 = (long) r12
            long r12 = r12 + r0
            c.p r2 = r2.f
            r0 = r12
            goto L46
        L79:
            return r3
        L7a:
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "size=%s fromIndex=%s toIndex=%s"
            r1 = 3
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            long r3 = r10.f1283b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r1[r2] = r3
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r13 = 1
            r1[r13] = r12
            r12 = 2
            java.lang.Long r13 = java.lang.Long.valueOf(r14)
            r1[r12] = r13
            java.lang.String r12 = java.lang.String.format(r0, r1)
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: c.c.a(byte, long, long):long");
    }

    @Override // c.e
    public boolean a(long j, f fVar) {
        return a(j, fVar, 0, fVar.h());
    }

    public boolean a(long j, f fVar, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f1283b - j < i2 || fVar.h() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (c(i3 + j) != fVar.a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    @Override // c.s
    public u timeout() {
        return u.NONE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f1283b != cVar.f1283b) {
            return false;
        }
        long j = 0;
        if (this.f1283b == 0) {
            return true;
        }
        p pVar = this.f1282a;
        p pVar2 = cVar.f1282a;
        int i = pVar.f1320b;
        int i2 = pVar2.f1320b;
        while (j < this.f1283b) {
            long min = Math.min(pVar.f1321c - i, pVar2.f1321c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (i5 < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (pVar.f1319a[i4] != pVar2.f1319a[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == pVar.f1321c) {
                pVar = pVar.f;
                i = pVar.f1320b;
            } else {
                i = i4;
            }
            if (i3 == pVar2.f1321c) {
                pVar2 = pVar2.f;
                i2 = pVar2.f1320b;
            } else {
                i2 = i3;
            }
            j += min;
        }
        return true;
    }

    public int hashCode() {
        p pVar = this.f1282a;
        if (pVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = pVar.f1321c;
            for (int i3 = pVar.f1320b; i3 < i2; i3++) {
                i = (i * 31) + pVar.f1319a[i3];
            }
            pVar = pVar.f;
        } while (pVar != this.f1282a);
        return i;
    }

    public String toString() {
        return v().toString();
    }

    /* renamed from: u */
    public c clone() {
        c cVar = new c();
        if (this.f1283b == 0) {
            return cVar;
        }
        cVar.f1282a = new p(this.f1282a);
        p pVar = cVar.f1282a;
        p pVar2 = cVar.f1282a;
        p pVar3 = cVar.f1282a;
        pVar2.g = pVar3;
        pVar.f = pVar3;
        p pVar4 = this.f1282a;
        while (true) {
            pVar4 = pVar4.f;
            if (pVar4 != this.f1282a) {
                cVar.f1282a.g.a(new p(pVar4));
            } else {
                cVar.f1283b = this.f1283b;
                return cVar;
            }
        }
    }

    public f v() {
        if (this.f1283b > 2147483647L) {
            throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f1283b);
        }
        return f((int) this.f1283b);
    }

    public f f(int i) {
        if (i == 0) {
            return f.f1286b;
        }
        return new r(this, i);
    }
}
