package h;

import java.io.Closeable;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f10132d = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* renamed from: b  reason: collision with root package name */
    r f10133b;

    /* renamed from: c  reason: collision with root package name */
    long f10134c;

    /* loaded from: classes.dex */
    class a extends OutputStream {
        a() {
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return c.this + ".outputStream()";
        }

        @Override // java.io.OutputStream
        public void write(int i) {
            c.this.mo339writeByte((int) ((byte) i));
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) {
            c.this.mo338write(bArr, i, i2);
        }
    }

    /* loaded from: classes.dex */
    class b extends InputStream {
        b() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.f10134c, 2147483647L);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.f10134c > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) {
            return c.this.a(bArr, i, i2);
        }

        public String toString() {
            return c.this + ".inputStream()";
        }
    }

    /* renamed from: h.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0204c implements Closeable {

        /* renamed from: b  reason: collision with root package name */
        public c f10137b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f10138c;

        /* renamed from: d  reason: collision with root package name */
        private r f10139d;

        /* renamed from: f  reason: collision with root package name */
        public byte[] f10141f;

        /* renamed from: e  reason: collision with root package name */
        public long f10140e = -1;

        /* renamed from: g  reason: collision with root package name */
        public int f10142g = -1;

        /* renamed from: h  reason: collision with root package name */
        public int f10143h = -1;

        public final int a() {
            long j = this.f10140e;
            if (j != this.f10137b.f10134c) {
                return a(j == -1 ? 0L : j + (this.f10143h - this.f10142g));
            }
            throw new IllegalStateException();
        }

        public final int a(long j) {
            r rVar;
            int i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if (i >= 0) {
                c cVar = this.f10137b;
                long j2 = cVar.f10134c;
                if (j <= j2) {
                    if (i == 0 || j == j2) {
                        this.f10139d = null;
                        this.f10140e = j;
                        this.f10141f = null;
                        this.f10142g = -1;
                        this.f10143h = -1;
                        return -1;
                    }
                    long j3 = 0;
                    r rVar2 = cVar.f10133b;
                    r rVar3 = this.f10139d;
                    if (rVar3 != null) {
                        long j4 = this.f10140e - (this.f10142g - rVar3.f10191b);
                        if (j4 > j) {
                            j2 = j4;
                            rVar3 = rVar2;
                            rVar2 = rVar3;
                        } else {
                            j3 = j4;
                        }
                    } else {
                        rVar3 = rVar2;
                    }
                    if (j2 - j > j - j3) {
                        while (true) {
                            int i2 = rVar3.f10192c;
                            int i3 = rVar3.f10191b;
                            if (j < (i2 - i3) + j3) {
                                break;
                            }
                            j3 += i2 - i3;
                            rVar3 = rVar3.f10195f;
                        }
                    } else {
                        rVar3 = rVar2;
                        j3 = j2;
                        while (j3 > j) {
                            rVar3 = rVar3.f10196g;
                            j3 -= rVar3.f10192c - rVar3.f10191b;
                        }
                    }
                    if (!this.f10138c || !rVar3.f10193d) {
                        rVar = rVar3;
                    } else {
                        rVar = rVar3.d();
                        c cVar2 = this.f10137b;
                        if (cVar2.f10133b == rVar3) {
                            cVar2.f10133b = rVar;
                        }
                        rVar3.a(rVar);
                        rVar.f10196g.b();
                    }
                    this.f10139d = rVar;
                    this.f10140e = j;
                    this.f10141f = rVar.f10190a;
                    this.f10142g = rVar.f10191b + ((int) (j - j3));
                    this.f10143h = rVar.f10192c;
                    return this.f10143h - this.f10142g;
                }
            }
            throw new ArrayIndexOutOfBoundsException(String.format("offset=%s > size=%s", Long.valueOf(j), Long.valueOf(this.f10137b.f10134c)));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f10137b != null) {
                this.f10137b = null;
                this.f10139d = null;
                this.f10140e = -1L;
                this.f10141f = null;
                this.f10142g = -1;
                this.f10143h = -1;
                return;
            }
            throw new IllegalStateException("not attached to a buffer");
        }
    }

    private boolean a(r rVar, int i, f fVar, int i2, int i3) {
        int i4 = rVar.f10192c;
        byte[] bArr = rVar.f10190a;
        while (i2 < i3) {
            if (i == i4) {
                rVar = rVar.f10195f;
                byte[] bArr2 = rVar.f10190a;
                bArr = bArr2;
                i = rVar.f10191b;
                i4 = rVar.f10192c;
            }
            if (bArr[i] != fVar.a(i2)) {
                return false;
            }
            i++;
            i2++;
        }
        return true;
    }

    public final byte a(long j) {
        int i;
        x.a(this.f10134c, j, 1L);
        long j2 = this.f10134c;
        if (j2 - j <= j) {
            long j3 = j - j2;
            r rVar = this.f10133b;
            do {
                rVar = rVar.f10196g;
                int i2 = rVar.f10192c;
                i = rVar.f10191b;
                j3 += i2 - i;
            } while (j3 < 0);
            return rVar.f10190a[i + ((int) j3)];
        }
        r rVar2 = this.f10133b;
        while (true) {
            int i3 = rVar2.f10192c;
            int i4 = rVar2.f10191b;
            long j4 = i3 - i4;
            if (j < j4) {
                return rVar2.f10190a[i4 + ((int) j)];
            }
            j -= j4;
            rVar2 = rVar2.f10195f;
        }
    }

    @Override // h.e
    public int a(m mVar) {
        int a2 = a(mVar, false);
        if (a2 == -1) {
            return -1;
        }
        try {
            skip(mVar.f10165b[a2].g());
            return a2;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0058, code lost:
        if (r19 == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005a, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
        return r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(h.m r18, boolean r19) {
        /*
            r17 = this;
            r0 = r18
            r1 = r17
            h.r r2 = r1.f10133b
            r3 = -2
            if (r2 != 0) goto L13
            if (r19 == 0) goto Lc
            return r3
        Lc:
            h.f r2 = h.f.f10145f
            int r0 = r0.indexOf(r2)
            return r0
        L13:
            byte[] r4 = r2.f10190a
            int r5 = r2.f10191b
            int r6 = r2.f10192c
            int[] r0 = r0.f10166c
            r7 = 0
            r8 = -1
            r9 = r5
            r11 = r6
            r10 = -1
            r5 = r2
            r6 = r4
            r4 = 0
        L23:
            int r12 = r4 + 1
            r4 = r0[r4]
            int r13 = r12 + 1
            r12 = r0[r12]
            if (r12 == r8) goto L2e
            r10 = r12
        L2e:
            if (r5 != 0) goto L31
            goto L58
        L31:
            r12 = 0
            if (r4 >= 0) goto L6c
            int r4 = r4 * (-1)
            int r14 = r13 + r4
        L38:
            int r4 = r9 + 1
            r9 = r6[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r15 = r13 + 1
            r13 = r0[r13]
            if (r9 == r13) goto L45
            return r10
        L45:
            if (r15 != r14) goto L49
            r9 = 1
            goto L4a
        L49:
            r9 = 0
        L4a:
            if (r4 != r11) goto L64
            h.r r4 = r5.f10195f
            int r5 = r4.f10191b
            byte[] r6 = r4.f10190a
            int r11 = r4.f10192c
            if (r4 != r2) goto L5f
            if (r9 != 0) goto L5c
        L58:
            if (r19 == 0) goto L5b
            return r3
        L5b:
            return r10
        L5c:
            r4 = r5
            r5 = r12
            goto L64
        L5f:
            r16 = r5
            r5 = r4
            r4 = r16
        L64:
            if (r9 == 0) goto L69
            r9 = r0[r15]
            goto L91
        L69:
            r9 = r4
            r13 = r15
            goto L38
        L6c:
            int r14 = r9 + 1
            r9 = r6[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r15 = r13 + r4
        L74:
            if (r13 != r15) goto L77
            return r10
        L77:
            r3 = r0[r13]
            if (r9 != r3) goto L99
            int r13 = r13 + r4
            r9 = r0[r13]
            if (r14 != r11) goto L90
            h.r r3 = r5.f10195f
            int r4 = r3.f10191b
            byte[] r5 = r3.f10190a
            int r6 = r3.f10192c
            r11 = r6
            r6 = r5
            if (r3 != r2) goto L8e
            r5 = r12
            goto L91
        L8e:
            r5 = r3
            goto L91
        L90:
            r4 = r14
        L91:
            if (r9 < 0) goto L94
            return r9
        L94:
            int r3 = -r9
            r9 = r4
            r4 = r3
            r3 = -2
            goto L23
        L99:
            int r13 = r13 + 1
            r3 = -2
            goto L74
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.a(h.m, boolean):int");
    }

    public int a(byte[] bArr, int i, int i2) {
        x.a(bArr.length, i, i2);
        r rVar = this.f10133b;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(i2, rVar.f10192c - rVar.f10191b);
        System.arraycopy(rVar.f10190a, rVar.f10191b, bArr, i, min);
        rVar.f10191b += min;
        this.f10134c -= min;
        if (rVar.f10191b == rVar.f10192c) {
            this.f10133b = rVar.b();
            s.a(rVar);
        }
        return min;
    }

    @Override // h.e
    public long a(byte b2) {
        return a(b2, 0L, Long.MAX_VALUE);
    }

    public long a(byte b2, long j, long j2) {
        r rVar;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f10134c), Long.valueOf(j), Long.valueOf(j2)));
        }
        long j4 = this.f10134c;
        if (j2 <= j4) {
            j4 = j2;
        }
        if (j == j4 || (rVar = this.f10133b) == null) {
            return -1L;
        }
        long j5 = this.f10134c;
        if (j5 - j >= j) {
            while (true) {
                j5 = j3;
                j3 = (rVar.f10192c - rVar.f10191b) + j5;
                if (j3 >= j) {
                    break;
                }
                rVar = rVar.f10195f;
            }
        } else {
            while (j5 > j) {
                rVar = rVar.f10196g;
                j5 -= rVar.f10192c - rVar.f10191b;
            }
        }
        long j6 = j;
        while (j5 < j4) {
            byte[] bArr = rVar.f10190a;
            int min = (int) Math.min(rVar.f10192c, (rVar.f10191b + j4) - j5);
            for (int i = (int) ((rVar.f10191b + j6) - j5); i < min; i++) {
                if (bArr[i] == b2) {
                    return (i - rVar.f10191b) + j5;
                }
            }
            j6 = (rVar.f10192c - rVar.f10191b) + j5;
            rVar = rVar.f10195f;
            j5 = j6;
        }
        return -1L;
    }

    public long a(f fVar, long j) {
        byte[] bArr;
        r rVar;
        if (fVar.g() != 0) {
            long j2 = 0;
            if (j < 0) {
                throw new IllegalArgumentException("fromIndex < 0");
            }
            r rVar2 = this.f10133b;
            long j3 = -1;
            if (rVar2 == null) {
                return -1L;
            }
            long j4 = this.f10134c;
            if (j4 - j >= j) {
                while (true) {
                    j4 = j2;
                    j2 = (rVar2.f10192c - rVar2.f10191b) + j4;
                    if (j2 >= j) {
                        break;
                    }
                    rVar2 = rVar2.f10195f;
                }
            } else {
                while (j4 > j) {
                    rVar2 = rVar2.f10196g;
                    j4 -= rVar2.f10192c - rVar2.f10191b;
                }
            }
            byte a2 = fVar.a(0);
            int g2 = fVar.g();
            long j5 = 1 + (this.f10134c - g2);
            long j6 = j;
            r rVar3 = rVar2;
            long j7 = j4;
            while (j7 < j5) {
                byte[] bArr2 = rVar3.f10190a;
                int min = (int) Math.min(rVar3.f10192c, (rVar3.f10191b + j5) - j7);
                int i = (int) ((rVar3.f10191b + j6) - j7);
                while (i < min) {
                    if (bArr2[i] == a2) {
                        bArr = bArr2;
                        rVar = rVar3;
                        if (a(rVar3, i + 1, fVar, 1, g2)) {
                            return (i - rVar.f10191b) + j7;
                        }
                    } else {
                        bArr = bArr2;
                        rVar = rVar3;
                    }
                    i++;
                    rVar3 = rVar;
                    bArr2 = bArr;
                }
                r rVar4 = rVar3;
                j6 = (rVar4.f10192c - rVar4.f10191b) + j7;
                rVar3 = rVar4.f10195f;
                j3 = -1;
                j7 = j6;
            }
            return j3;
        }
        throw new IllegalArgumentException("bytes is empty");
    }

    @Override // h.d
    public long a(v vVar) {
        if (vVar != null) {
            long j = 0;
            while (true) {
                long read = vVar.read(this, 8192L);
                if (read == -1) {
                    return j;
                }
                j += read;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public final C0204c a(C0204c c0204c) {
        if (c0204c.f10137b == null) {
            c0204c.f10137b = this;
            c0204c.f10138c = true;
            return c0204c;
        }
        throw new IllegalStateException("already attached to a buffer");
    }

    public final c a(c cVar, long j, long j2) {
        if (cVar != null) {
            x.a(this.f10134c, j, j2);
            if (j2 == 0) {
                return this;
            }
            cVar.f10134c += j2;
            r rVar = this.f10133b;
            while (true) {
                int i = rVar.f10192c;
                int i2 = rVar.f10191b;
                if (j < i - i2) {
                    break;
                }
                j -= i - i2;
                rVar = rVar.f10195f;
            }
            while (j2 > 0) {
                r c2 = rVar.c();
                c2.f10191b = (int) (c2.f10191b + j);
                c2.f10192c = Math.min(c2.f10191b + ((int) j2), c2.f10192c);
                r rVar2 = cVar.f10133b;
                if (rVar2 == null) {
                    c2.f10196g = c2;
                    c2.f10195f = c2;
                    cVar.f10133b = c2;
                } else {
                    rVar2.f10196g.a(c2);
                }
                j2 -= c2.f10192c - c2.f10191b;
                rVar = rVar.f10195f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    @Override // h.d
    /* renamed from: a */
    public c mo330a(f fVar) {
        if (fVar != null) {
            fVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    @Override // h.d
    /* renamed from: a */
    public c mo331a(String str) {
        mo332a(str, 0, str.length());
        return this;
    }

    @Override // h.d
    /* renamed from: a */
    public c mo332a(String str, int i, int i2) {
        int i3;
        if (str != null) {
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
                        r b2 = b(1);
                        byte[] bArr = b2.f10190a;
                        int i4 = b2.f10192c - i;
                        int min = Math.min(i2, 8192 - i4);
                        int i5 = i + 1;
                        bArr[i + i4] = (byte) charAt;
                        while (i5 < min) {
                            char charAt2 = str.charAt(i5);
                            if (charAt2 >= 128) {
                                break;
                            }
                            bArr[i5 + i4] = (byte) charAt2;
                            i5++;
                        }
                        int i6 = b2.f10192c;
                        int i7 = (i4 + i5) - i6;
                        b2.f10192c = i6 + i7;
                        this.f10134c += i7;
                        i = i5;
                    } else {
                        if (charAt < 2048) {
                            i3 = (charAt >> 6) | 192;
                        } else if (charAt < 55296 || charAt > 57343) {
                            mo339writeByte((charAt >> '\f') | 224);
                            i3 = ((charAt >> 6) & 63) | 128;
                        } else {
                            int i8 = i + 1;
                            char charAt3 = i8 < i2 ? str.charAt(i8) : (char) 0;
                            if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                                mo339writeByte(63);
                                i = i8;
                            } else {
                                int i9 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                                mo339writeByte((i9 >> 18) | 240);
                                mo339writeByte(((i9 >> 12) & 63) | 128);
                                mo339writeByte(((i9 >> 6) & 63) | 128);
                                mo339writeByte((i9 & 63) | 128);
                                i += 2;
                            }
                        }
                        mo339writeByte(i3);
                        mo339writeByte((charAt & '?') | 128);
                        i++;
                    }
                }
                return this;
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    public c a(String str, int i, int i2, Charset charset) {
        if (str != null) {
            if (i < 0) {
                throw new IllegalAccessError("beginIndex < 0: " + i);
            } else if (i2 < i) {
                throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
            } else if (i2 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
            } else if (charset == null) {
                throw new IllegalArgumentException("charset == null");
            } else {
                if (charset.equals(x.f10201a)) {
                    mo332a(str, i, i2);
                    return this;
                }
                byte[] bytes = str.substring(i, i2).getBytes(charset);
                mo338write(bytes, 0, bytes.length);
                return this;
            }
        }
        throw new IllegalArgumentException("string == null");
    }

    public c a(String str, Charset charset) {
        a(str, 0, str.length(), charset);
        return this;
    }

    @Override // h.d
    /* renamed from: a  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ d mo330a(f fVar) {
        mo330a(fVar);
        return this;
    }

    @Override // h.d
    /* renamed from: a  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ d mo331a(String str) {
        mo331a(str);
        return this;
    }

    @Override // h.d
    /* renamed from: a  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ d mo332a(String str, int i, int i2) {
        mo332a(str, i, i2);
        return this;
    }

    public final f a(int i) {
        return i == 0 ? f.f10145f : new t(this, i);
    }

    public String a(long j, Charset charset) {
        x.a(this.f10134c, 0L, j);
        if (charset != null) {
            if (j > 2147483647L) {
                throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
            } else if (j == 0) {
                return "";
            } else {
                r rVar = this.f10133b;
                int i = rVar.f10191b;
                if (i + j > rVar.f10192c) {
                    return new String(g(j), charset);
                }
                String str = new String(rVar.f10190a, i, (int) j, charset);
                rVar.f10191b = (int) (rVar.f10191b + j);
                this.f10134c -= j;
                if (rVar.f10191b == rVar.f10192c) {
                    this.f10133b = rVar.b();
                    s.a(rVar);
                }
                return str;
            }
        }
        throw new IllegalArgumentException("charset == null");
    }

    @Override // h.e
    public String a(Charset charset) {
        try {
            return a(this.f10134c, charset);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void a() {
        try {
            skip(this.f10134c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // h.e
    public void a(c cVar, long j) {
        long j2 = this.f10134c;
        if (j2 >= j) {
            cVar.write(this, j);
        } else {
            cVar.write(this, j2);
            throw new EOFException();
        }
    }

    @Override // h.e
    public boolean a(long j, f fVar) {
        return a(j, fVar, 0, fVar.g());
    }

    public boolean a(long j, f fVar, int i, int i2) {
        if (j < 0 || i < 0 || i2 < 0 || this.f10134c - j < i2 || fVar.g() - i < i2) {
            return false;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            if (a(i3 + j) != fVar.a(i + i3)) {
                return false;
            }
        }
        return true;
    }

    public final long b() {
        long j = this.f10134c;
        if (j == 0) {
            return 0L;
        }
        r rVar = this.f10133b.f10196g;
        int i = rVar.f10192c;
        return (i >= 8192 || !rVar.f10194e) ? j : j - (i - rVar.f10191b);
    }

    @Override // h.e
    public long b(f fVar) {
        return a(fVar, 0L);
    }

    public long b(f fVar, long j) {
        int i;
        long j2 = 0;
        if (j >= 0) {
            r rVar = this.f10133b;
            if (rVar == null) {
                return -1L;
            }
            long j3 = this.f10134c;
            if (j3 - j >= j) {
                while (true) {
                    j3 = j2;
                    j2 = (rVar.f10192c - rVar.f10191b) + j3;
                    if (j2 >= j) {
                        break;
                    }
                    rVar = rVar.f10195f;
                }
            } else {
                while (j3 > j) {
                    rVar = rVar.f10196g;
                    j3 -= rVar.f10192c - rVar.f10191b;
                }
            }
            if (fVar.g() == 2) {
                byte a2 = fVar.a(0);
                byte a3 = fVar.a(1);
                while (j3 < this.f10134c) {
                    byte[] bArr = rVar.f10190a;
                    i = (int) ((rVar.f10191b + j) - j3);
                    int i2 = rVar.f10192c;
                    while (i < i2) {
                        byte b2 = bArr[i];
                        if (b2 != a2 && b2 != a3) {
                            i++;
                        }
                        return (i - rVar.f10191b) + j3;
                    }
                    j = (rVar.f10192c - rVar.f10191b) + j3;
                    rVar = rVar.f10195f;
                    j3 = j;
                }
                return -1L;
            }
            byte[] c2 = fVar.c();
            while (j3 < this.f10134c) {
                byte[] bArr2 = rVar.f10190a;
                i = (int) ((rVar.f10191b + j) - j3);
                int i3 = rVar.f10192c;
                while (i < i3) {
                    byte b3 = bArr2[i];
                    for (byte b4 : c2) {
                        if (b3 == b4) {
                            return (i - rVar.f10191b) + j3;
                        }
                    }
                    i++;
                }
                j = (rVar.f10192c - rVar.f10191b) + j3;
                rVar = rVar.f10195f;
                j3 = j;
            }
            return -1L;
        }
        throw new IllegalArgumentException("fromIndex < 0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public r b(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        r rVar = this.f10133b;
        if (rVar == null) {
            this.f10133b = s.a();
            r rVar2 = this.f10133b;
            rVar2.f10196g = rVar2;
            rVar2.f10195f = rVar2;
            return rVar2;
        }
        r rVar3 = rVar.f10196g;
        if (rVar3.f10192c + i <= 8192 && rVar3.f10194e) {
            return rVar3;
        }
        r a2 = s.a();
        rVar3.a(a2);
        return a2;
    }

    public String b(long j) {
        return a(j, x.f10201a);
    }

    @Override // h.e
    public long c(f fVar) {
        return b(fVar, 0L);
    }

    public c c(int i) {
        int i2;
        int i3;
        if (i >= 128) {
            if (i < 2048) {
                i3 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i >= 55296 && i <= 57343) {
                        mo339writeByte(63);
                        return this;
                    }
                    i2 = (i >> 12) | 224;
                } else if (i > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i));
                } else {
                    mo339writeByte((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                }
                mo339writeByte(i2);
                i3 = ((i >> 6) & 63) | 128;
            }
            mo339writeByte(i3);
            i = (i & 63) | 128;
        }
        mo339writeByte(i);
        return this;
    }

    @Override // h.d
    /* renamed from: c */
    public c mo333c(long j) {
        if (j == 0) {
            mo339writeByte(48);
            return this;
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        r b2 = b(numberOfTrailingZeros);
        byte[] bArr = b2.f10190a;
        int i = b2.f10192c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = f10132d[(int) (15 & j)];
            j >>>= 4;
        }
        b2.f10192c += numberOfTrailingZeros;
        this.f10134c += numberOfTrailingZeros;
        return this;
    }

    @Override // h.d
    /* renamed from: c  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ d mo333c(long j) {
        mo333c(j);
        return this;
    }

    public f c() {
        return new f(o());
    }

    /* renamed from: clone */
    public c m334clone() {
        c cVar = new c();
        if (this.f10134c == 0) {
            return cVar;
        }
        cVar.f10133b = this.f10133b.c();
        r rVar = cVar.f10133b;
        rVar.f10196g = rVar;
        rVar.f10195f = rVar;
        r rVar2 = this.f10133b;
        while (true) {
            rVar2 = rVar2.f10195f;
            if (rVar2 == this.f10133b) {
                cVar.f10134c = this.f10134c;
                return cVar;
            }
            cVar.f10133b.f10196g.a(rVar2.c());
        }
    }

    @Override // h.v, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // h.d
    /* renamed from: d */
    public c mo335d(long j) {
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i == 0) {
            mo339writeByte(48);
            return this;
        }
        boolean z = false;
        int i2 = 1;
        if (i < 0) {
            j = -j;
            if (j < 0) {
                mo331a("-9223372036854775808");
                return this;
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
        r b2 = b(i2);
        byte[] bArr = b2.f10190a;
        int i3 = b2.f10192c + i2;
        while (j != 0) {
            i3--;
            bArr[i3] = f10132d[(int) (j % 10)];
            j /= 10;
        }
        if (z) {
            bArr[i3 - 1] = 45;
        }
        b2.f10192c += i2;
        this.f10134c += i2;
        return this;
    }

    @Override // h.d
    /* renamed from: d  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ d mo335d(long j) {
        mo335d(j);
        return this;
    }

    public String d() {
        try {
            return a(this.f10134c, x.f10201a);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    public final long e() {
        return this.f10134c;
    }

    @Override // h.e
    public f e(long j) {
        return new f(g(j));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j = this.f10134c;
        if (j != cVar.f10134c) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        r rVar = this.f10133b;
        r rVar2 = cVar.f10133b;
        int i = rVar.f10191b;
        int i2 = rVar2.f10191b;
        while (j2 < this.f10134c) {
            long min = Math.min(rVar.f10192c - i, rVar2.f10192c - i2);
            int i3 = i2;
            int i4 = i;
            int i5 = 0;
            while (i5 < min) {
                int i6 = i4 + 1;
                int i7 = i3 + 1;
                if (rVar.f10190a[i4] != rVar2.f10190a[i3]) {
                    return false;
                }
                i5++;
                i4 = i6;
                i3 = i7;
            }
            if (i4 == rVar.f10192c) {
                rVar = rVar.f10195f;
                i = rVar.f10191b;
            } else {
                i = i4;
            }
            if (i3 == rVar2.f10192c) {
                rVar2 = rVar2.f10195f;
                i2 = rVar2.f10191b;
            } else {
                i2 = i3;
            }
            j2 += min;
        }
        return true;
    }

    public final f f() {
        long j = this.f10134c;
        if (j <= 2147483647L) {
            return a((int) j);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f10134c);
    }

    @Override // h.e
    public boolean f(long j) {
        return this.f10134c >= j;
    }

    @Override // h.d, h.u, java.io.Flushable
    public void flush() {
    }

    @Override // h.e
    public byte[] g(long j) {
        x.a(this.f10134c, 0L, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[(int) j];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j);
    }

    @Override // h.e
    public String h(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: " + j);
        }
        long j2 = Long.MAX_VALUE;
        if (j != Long.MAX_VALUE) {
            j2 = j + 1;
        }
        long a2 = a((byte) 10, 0L, j2);
        if (a2 != -1) {
            return j(a2);
        }
        if (j2 < e() && a(j2 - 1) == 13 && a(j2) == 10) {
            return j(j2);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, e()));
        throw new EOFException("\\n not found: limit=" + Math.min(e(), j) + " content=" + cVar.c().b() + (char) 8230);
    }

    public int hashCode() {
        r rVar = this.f10133b;
        if (rVar == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = rVar.f10192c;
            for (int i3 = rVar.f10191b; i3 < i2; i3++) {
                i = (i * 31) + rVar.f10190a[i3];
            }
            rVar = rVar.f10195f;
        } while (rVar != this.f10133b);
        return i;
    }

    @Override // h.e
    public void i(long j) {
        if (this.f10134c >= j) {
            return;
        }
        throw new EOFException();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // h.e, h.d
    public c j() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String j(long j) {
        String b2;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (a(j3) == 13) {
                b2 = b(j3);
                j2 = 2;
                skip(j2);
                return b2;
            }
        }
        b2 = b(j);
        skip(j2);
        return b2;
    }

    public c k(long j) {
        r b2 = b(8);
        byte[] bArr = b2.f10190a;
        int i = b2.f10192c;
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
        b2.f10192c = i8 + 1;
        this.f10134c += 8;
        return this;
    }

    @Override // h.d
    public d k() {
        return this;
    }

    @Override // h.d
    /* renamed from: l */
    public c mo336l() {
        return this;
    }

    @Override // h.d
    /* renamed from: l  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ d mo336l() {
        mo336l();
        return this;
    }

    @Override // h.d
    public OutputStream m() {
        return new a();
    }

    @Override // h.e
    public String n() {
        return h(Long.MAX_VALUE);
    }

    @Override // h.e
    public byte[] o() {
        try {
            return g(this.f10134c);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // h.e
    public int p() {
        return x.a(readInt());
    }

    @Override // h.e
    public c q() {
        return this;
    }

    @Override // h.e
    public boolean r() {
        return this.f10134c == 0;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) {
        r rVar = this.f10133b;
        if (rVar == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), rVar.f10192c - rVar.f10191b);
        byteBuffer.put(rVar.f10190a, rVar.f10191b, min);
        rVar.f10191b += min;
        this.f10134c -= min;
        if (rVar.f10191b == rVar.f10192c) {
            this.f10133b = rVar.b();
            s.a(rVar);
        }
        return min;
    }

    @Override // h.v
    public long read(c cVar, long j) {
        if (cVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            long j2 = this.f10134c;
            if (j2 == 0) {
                return -1L;
            }
            if (j > j2) {
                j = j2;
            }
            cVar.write(this, j);
            return j;
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // h.e
    public byte readByte() {
        long j = this.f10134c;
        if (j != 0) {
            r rVar = this.f10133b;
            int i = rVar.f10191b;
            int i2 = rVar.f10192c;
            int i3 = i + 1;
            byte b2 = rVar.f10190a[i];
            this.f10134c = j - 1;
            if (i3 == i2) {
                this.f10133b = rVar.b();
                s.a(rVar);
            } else {
                rVar.f10191b = i3;
            }
            return b2;
        }
        throw new IllegalStateException("size == 0");
    }

    @Override // h.e
    public void readFully(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a2 = a(bArr, i, bArr.length - i);
            if (a2 == -1) {
                throw new EOFException();
            }
            i += a2;
        }
    }

    @Override // h.e
    public int readInt() {
        long j = this.f10134c;
        if (j < 4) {
            throw new IllegalStateException("size < 4: " + this.f10134c);
        }
        r rVar = this.f10133b;
        int i = rVar.f10191b;
        int i2 = rVar.f10192c;
        if (i2 - i < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = rVar.f10190a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        int i8 = i6 + 1;
        int i9 = i7 | (bArr[i6] & 255);
        this.f10134c = j - 4;
        if (i8 == i2) {
            this.f10133b = rVar.b();
            s.a(rVar);
        } else {
            rVar.f10191b = i8;
        }
        return i9;
    }

    @Override // h.e
    public long readLong() {
        long j = this.f10134c;
        if (j < 8) {
            throw new IllegalStateException("size < 8: " + this.f10134c);
        }
        r rVar = this.f10133b;
        int i = rVar.f10191b;
        int i2 = rVar.f10192c;
        if (i2 - i < 8) {
            return ((readInt() & 4294967295L) << 32) | (4294967295L & readInt());
        }
        byte[] bArr = rVar.f10190a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        long j2 = (bArr[i3] & 255) << 48;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        int i9 = i8 + 1;
        int i10 = i9 + 1;
        long j3 = j2 | ((bArr[i] & 255) << 56) | ((bArr[i4] & 255) << 40) | ((bArr[i5] & 255) << 32) | ((bArr[i6] & 255) << 24) | ((bArr[i7] & 255) << 16) | ((bArr[i8] & 255) << 8) | (bArr[i9] & 255);
        this.f10134c = j - 8;
        if (i10 == i2) {
            this.f10133b = rVar.b();
            s.a(rVar);
        } else {
            rVar.f10191b = i10;
        }
        return j3;
    }

    @Override // h.e
    public short readShort() {
        long j = this.f10134c;
        if (j < 2) {
            throw new IllegalStateException("size < 2: " + this.f10134c);
        }
        r rVar = this.f10133b;
        int i = rVar.f10191b;
        int i2 = rVar.f10192c;
        if (i2 - i < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = rVar.f10190a;
        int i3 = i + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
        this.f10134c = j - 2;
        if (i4 == i2) {
            this.f10133b = rVar.b();
            s.a(rVar);
        } else {
            rVar.f10191b = i4;
        }
        return (short) i5;
    }

    @Override // h.e
    public short s() {
        return x.a(readShort());
    }

    @Override // h.e
    public void skip(long j) {
        r rVar;
        while (j > 0) {
            if (this.f10133b == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j, rVar.f10192c - rVar.f10191b);
            long j2 = min;
            this.f10134c -= j2;
            j -= j2;
            r rVar2 = this.f10133b;
            rVar2.f10191b += min;
            if (rVar2.f10191b == rVar2.f10192c) {
                this.f10133b = rVar2.b();
                s.a(rVar2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00aa A[EDGE_INSN: B:45:0x00aa->B:38:0x00aa ?: BREAK  , SYNTHETIC] */
    @Override // h.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long t() {
        /*
            r17 = this;
            r0 = r17
            long r1 = r0.f10134c
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 == 0) goto Lb5
            r5 = -7
            r7 = 0
            r8 = r5
            r5 = 0
            r6 = 0
        L10:
            h.r r10 = r0.f10133b
            byte[] r11 = r10.f10190a
            int r12 = r10.f10191b
            int r13 = r10.f10192c
        L18:
            if (r12 >= r13) goto L96
            r15 = r11[r12]
            r14 = 48
            if (r15 < r14) goto L68
            r1 = 57
            if (r15 > r1) goto L68
            int r14 = r14 - r15
            r1 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            int r16 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r16 < 0) goto L3d
            if (r16 != 0) goto L36
            long r1 = (long) r14
            int r16 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r16 >= 0) goto L36
            goto L3d
        L36:
            r1 = 10
            long r3 = r3 * r1
            long r1 = (long) r14
            long r3 = r3 + r1
            goto L72
        L3d:
            h.c r1 = new h.c
            r1.<init>()
            r1.mo335d(r3)
            r1.mo339writeByte(r15)
            if (r5 != 0) goto L4d
            r1.readByte()
        L4d:
            java.lang.NumberFormatException r2 = new java.lang.NumberFormatException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Number too large: "
            r3.append(r4)
            java.lang.String r1 = r1.d()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L68:
            r1 = 45
            if (r15 != r1) goto L77
            if (r7 != 0) goto L77
            r1 = 1
            long r8 = r8 - r1
            r5 = 1
        L72:
            int r12 = r12 + 1
            int r7 = r7 + 1
            goto L18
        L77:
            if (r7 == 0) goto L7b
            r6 = 1
            goto L96
        L7b:
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
        L96:
            if (r12 != r13) goto La2
            h.r r1 = r10.b()
            r0.f10133b = r1
            h.s.a(r10)
            goto La4
        La2:
            r10.f10191b = r12
        La4:
            if (r6 != 0) goto Laa
            h.r r1 = r0.f10133b
            if (r1 != 0) goto L10
        Laa:
            long r1 = r0.f10134c
            long r6 = (long) r7
            long r1 = r1 - r6
            r0.f10134c = r1
            if (r5 == 0) goto Lb3
            goto Lb4
        Lb3:
            long r3 = -r3
        Lb4:
            return r3
        Lb5:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "size == 0"
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.t():long");
    }

    @Override // h.v
    public w timeout() {
        return w.NONE;
    }

    public String toString() {
        return f().toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3 A[EDGE_INSN: B:42:0x00a3->B:38:0x00a3 ?: BREAK  , SYNTHETIC] */
    @Override // h.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public long u() {
        /*
            r15 = this;
            long r0 = r15.f10134c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto Laa
            r0 = 0
            r4 = r2
            r1 = 0
        Lb:
            h.r r6 = r15.f10133b
            byte[] r7 = r6.f10190a
            int r8 = r6.f10191b
            int r9 = r6.f10192c
        L13:
            if (r8 >= r9) goto L8f
            r10 = r7[r8]
            r11 = 48
            if (r10 < r11) goto L22
            r11 = 57
            if (r10 > r11) goto L22
            int r11 = r10 + (-48)
            goto L3a
        L22:
            r11 = 97
            if (r10 < r11) goto L2f
            r11 = 102(0x66, float:1.43E-43)
            if (r10 > r11) goto L2f
            int r11 = r10 + (-97)
        L2c:
            int r11 = r11 + 10
            goto L3a
        L2f:
            r11 = 65
            if (r10 < r11) goto L70
            r11 = 70
            if (r10 > r11) goto L70
            int r11 = r10 + (-65)
            goto L2c
        L3a:
            r12 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r12 = r12 & r4
            int r14 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r14 != 0) goto L4a
            r10 = 4
            long r4 = r4 << r10
            long r10 = (long) r11
            long r4 = r4 | r10
            int r8 = r8 + 1
            int r1 = r1 + 1
            goto L13
        L4a:
            h.c r0 = new h.c
            r0.<init>()
            r0.mo333c(r4)
            r0.mo339writeByte(r10)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Number too large: "
            r2.append(r3)
            java.lang.String r0 = r0.d()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L70:
            if (r1 == 0) goto L74
            r0 = 1
            goto L8f
        L74:
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
        L8f:
            if (r8 != r9) goto L9b
            h.r r7 = r6.b()
            r15.f10133b = r7
            h.s.a(r6)
            goto L9d
        L9b:
            r6.f10191b = r8
        L9d:
            if (r0 != 0) goto La3
            h.r r6 = r15.f10133b
            if (r6 != 0) goto Lb
        La3:
            long r2 = r15.f10134c
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f10134c = r2
            return r4
        Laa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "size == 0"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.c.u():long");
    }

    @Override // h.e
    public InputStream v() {
        return new b();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                r b2 = b(1);
                int min = Math.min(i, 8192 - b2.f10192c);
                byteBuffer.get(b2.f10190a, b2.f10192c, min);
                i -= min;
                b2.f10192c += min;
            }
            this.f10134c += remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // h.d
    /* renamed from: write */
    public c mo337write(byte[] bArr) {
        if (bArr != null) {
            mo338write(bArr, 0, bArr.length);
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // h.d
    /* renamed from: write */
    public c mo338write(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = i2;
            x.a(bArr.length, i, j);
            int i3 = i2 + i;
            while (i < i3) {
                r b2 = b(1);
                int min = Math.min(i3 - i, 8192 - b2.f10192c);
                System.arraycopy(bArr, i, b2.f10190a, b2.f10192c, min);
                i += min;
                b2.f10192c += min;
            }
            this.f10134c += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // h.d
    /* renamed from: write  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ d mo337write(byte[] bArr) {
        mo337write(bArr);
        return this;
    }

    @Override // h.d
    /* renamed from: write  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ d mo338write(byte[] bArr, int i, int i2) {
        mo338write(bArr, i, i2);
        return this;
    }

    @Override // h.u
    public void write(c cVar, long j) {
        if (cVar != null) {
            if (cVar == this) {
                throw new IllegalArgumentException("source == this");
            }
            x.a(cVar.f10134c, 0L, j);
            while (j > 0) {
                r rVar = cVar.f10133b;
                if (j < rVar.f10192c - rVar.f10191b) {
                    r rVar2 = this.f10133b;
                    r rVar3 = rVar2 != null ? rVar2.f10196g : null;
                    if (rVar3 != null && rVar3.f10194e) {
                        if ((rVar3.f10192c + j) - (rVar3.f10193d ? 0 : rVar3.f10191b) <= 8192) {
                            cVar.f10133b.a(rVar3, (int) j);
                            cVar.f10134c -= j;
                            this.f10134c += j;
                            return;
                        }
                    }
                    cVar.f10133b = cVar.f10133b.a((int) j);
                }
                r rVar4 = cVar.f10133b;
                long j2 = rVar4.f10192c - rVar4.f10191b;
                cVar.f10133b = rVar4.b();
                r rVar5 = this.f10133b;
                if (rVar5 == null) {
                    this.f10133b = rVar4;
                    r rVar6 = this.f10133b;
                    rVar6.f10196g = rVar6;
                    rVar6.f10195f = rVar6;
                } else {
                    rVar5.f10196g.a(rVar4);
                    rVar4.a();
                }
                cVar.f10134c -= j2;
                this.f10134c += j2;
                j -= j2;
            }
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // h.d
    /* renamed from: writeByte */
    public c mo339writeByte(int i) {
        r b2 = b(1);
        byte[] bArr = b2.f10190a;
        int i2 = b2.f10192c;
        b2.f10192c = i2 + 1;
        bArr[i2] = (byte) i;
        this.f10134c++;
        return this;
    }

    @Override // h.d
    /* renamed from: writeByte  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ d mo339writeByte(int i) {
        mo339writeByte(i);
        return this;
    }

    @Override // h.d
    /* renamed from: writeInt */
    public c mo340writeInt(int i) {
        r b2 = b(4);
        byte[] bArr = b2.f10190a;
        int i2 = b2.f10192c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        int i4 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        int i5 = i4 + 1;
        bArr[i4] = (byte) ((i >>> 8) & 255);
        bArr[i5] = (byte) (i & 255);
        b2.f10192c = i5 + 1;
        this.f10134c += 4;
        return this;
    }

    @Override // h.d
    /* renamed from: writeInt  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ d mo340writeInt(int i) {
        mo340writeInt(i);
        return this;
    }

    @Override // h.d
    /* renamed from: writeShort */
    public c mo341writeShort(int i) {
        r b2 = b(2);
        byte[] bArr = b2.f10190a;
        int i2 = b2.f10192c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        bArr[i3] = (byte) (i & 255);
        b2.f10192c = i3 + 1;
        this.f10134c += 2;
        return this;
    }

    @Override // h.d
    /* renamed from: writeShort  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ d mo341writeShort(int i) {
        mo341writeShort(i);
        return this;
    }
}
