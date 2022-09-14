package defpackage;

import com.google.ar.core.ImageMetadata;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;
/* compiled from: PG */
/* renamed from: eani  reason: default package */
/* loaded from: classes6.dex */
public final class eani extends eanc {
    protected final eanm g;
    protected final OutputStream h;
    protected final int[] i;
    protected int j;
    protected byte[] k;
    protected int l;
    protected final int m;
    protected final int n;
    protected char[] o;
    protected final int p;
    static final byte[] e = eaoe.c();
    private static final byte[] q = {110, 117, 108, 108};
    private static final byte[] r = {116, 114, 117, 101};
    private static final byte[] s = {102, 97, 108, 115, 101};
    protected static final int[] f = eaoe.g;

    public eani(eanm eanmVar, int i, OutputStream outputStream) {
        super(i);
        this.i = f;
        this.l = 0;
        this.g = eanmVar;
        this.h = outputStream;
        byte[] a = eanmVar.a();
        this.k = a;
        int length = a.length;
        this.m = length;
        this.n = length >> 3;
        char[] b = eanmVar.b();
        this.o = b;
        this.p = b.length;
        if (t(eamr.ESCAPE_NON_ASCII)) {
            this.j = 127;
        }
    }

    private final void A(char[] cArr, int i, int i2) {
        char c;
        int i3 = i2 + i;
        int i4 = this.l;
        byte[] bArr = this.k;
        int[] iArr = this.i;
        while (i < i3 && (c = cArr[i]) <= 127 && iArr[c] == 0) {
            bArr[i4] = (byte) c;
            i++;
            i4++;
        }
        this.l = i4;
        if (i < i3) {
            if (this.j != 0) {
                if (i4 + ((i3 - i) * 6) > this.m) {
                    x();
                }
                int i5 = this.l;
                byte[] bArr2 = this.k;
                int[] iArr2 = this.i;
                while (i < i3) {
                    int i6 = i + 1;
                    char c2 = cArr[i];
                    if (c2 <= 127) {
                        int i7 = iArr2[c2];
                        if (i7 == 0) {
                            bArr2[i5] = (byte) c2;
                            i = i6;
                            i5++;
                        } else if (i7 > 0) {
                            int i8 = i5 + 1;
                            bArr2[i5] = 92;
                            i5 = i8 + 1;
                            bArr2[i8] = (byte) i7;
                        } else {
                            i5 = C(c2, i5);
                        }
                    } else {
                        i5 = C(c2, i5);
                    }
                    i = i6;
                }
                this.l = i5;
                return;
            }
            if (i4 + ((i3 - i) * 6) > this.m) {
                x();
            }
            int i9 = this.l;
            byte[] bArr3 = this.k;
            int[] iArr3 = this.i;
            while (i < i3) {
                int i10 = i + 1;
                char c3 = cArr[i];
                if (c3 <= 127) {
                    int i11 = iArr3[c3];
                    if (i11 == 0) {
                        bArr3[i9] = (byte) c3;
                        i = i10;
                        i9++;
                    } else if (i11 > 0) {
                        int i12 = i9 + 1;
                        bArr3[i9] = 92;
                        i9 = i12 + 1;
                        bArr3[i12] = (byte) i11;
                    } else {
                        i9 = C(c3, i9);
                    }
                } else if (c3 <= 2047) {
                    int i13 = i9 + 1;
                    bArr3[i9] = (byte) ((c3 >> 6) | 192);
                    i9 = i13 + 1;
                    bArr3[i13] = (byte) ((c3 & '?') | 128);
                } else {
                    byte[] bArr4 = this.k;
                    if (c3 < 55296 || c3 > 57343) {
                        int i14 = i9 + 1;
                        bArr4[i9] = (byte) ((c3 >> '\f') | 224);
                        int i15 = i14 + 1;
                        bArr4[i14] = (byte) (((c3 >> 6) & 63) | 128);
                        bArr4[i15] = (byte) ((c3 & '?') | 128);
                        i9 = i15 + 1;
                    } else {
                        int i16 = i9 + 1;
                        bArr4[i9] = 92;
                        int i17 = i16 + 1;
                        bArr4[i16] = 117;
                        int i18 = i17 + 1;
                        byte[] bArr5 = e;
                        bArr4[i17] = bArr5[13];
                        int i19 = i18 + 1;
                        bArr4[i18] = bArr5[(c3 >> '\b') & 15];
                        int i20 = i19 + 1;
                        bArr4[i19] = bArr5[(c3 >> 4) & 15];
                        i9 = i20 + 1;
                        bArr4[i20] = bArr5[c3 & 15];
                    }
                }
                i = i10;
            }
            this.l = i9;
        }
    }

    private final void B() {
        if (this.l + 4 >= this.m) {
            x();
        }
        System.arraycopy(q, 0, this.k, this.l, 4);
        this.l += 4;
    }

    private final int C(int i, int i2) {
        int i3;
        byte[] bArr = this.k;
        int i4 = i2 + 1;
        bArr[i2] = 92;
        int i5 = i4 + 1;
        bArr[i4] = 117;
        if (i > 255) {
            int i6 = i >> 8;
            int i7 = i5 + 1;
            byte[] bArr2 = e;
            bArr[i5] = bArr2[i6 >> 4];
            i3 = i7 + 1;
            bArr[i7] = bArr2[i6 & 15];
            i &= 255;
        } else {
            int i8 = i5 + 1;
            bArr[i5] = 48;
            i3 = i8 + 1;
            bArr[i8] = 48;
        }
        int i9 = i3 + 1;
        byte[] bArr3 = e;
        bArr[i3] = bArr3[i >> 4];
        bArr[i9] = bArr3[i & 15];
        return i9 + 1;
    }

    private final void E(char[] cArr, int i) {
        int i2 = 0;
        do {
            int min = Math.min(this.n, i);
            if (this.l + min > this.m) {
                x();
            }
            A(cArr, i2, min);
            i2 += min;
            i -= min;
        } while (i > 0);
    }

    private final void y(Object obj) {
        if (this.l >= this.m) {
            x();
        }
        byte[] bArr = this.k;
        int i = this.l;
        this.l = i + 1;
        bArr[i] = 34;
        g(obj.toString());
        if (this.l >= this.m) {
            x();
        }
        byte[] bArr2 = this.k;
        int i2 = this.l;
        this.l = i2 + 1;
        bArr2[i2] = 34;
    }

    private final void z(String str) {
        int length = str.length();
        char[] cArr = this.o;
        int i = 0;
        while (length > 0) {
            int min = Math.min(this.n, length);
            int i2 = i + min;
            str.getChars(i, i2, cArr, 0);
            if (this.l + min > this.m) {
                x();
            }
            A(cArr, 0, min);
            length -= min;
            i = i2;
        }
    }

    @Override // defpackage.eanc, defpackage.eams
    public final void a() {
        w("start an array");
        this.d = this.d.f();
        if (this.a != null) {
            eaoh.i(this);
            return;
        }
        if (this.l >= this.m) {
            x();
        }
        byte[] bArr = this.k;
        int i = this.l;
        this.l = i + 1;
        bArr[i] = 91;
    }

    @Override // defpackage.eanc, defpackage.eams
    public final void b() {
        if (!this.d.a()) {
            v("Current context not an ARRAY but " + this.d.c());
        }
        eaoh eaohVar = this.a;
        if (eaohVar != null) {
            eaohVar.g(this, this.d.d());
        } else {
            if (this.l >= this.m) {
                x();
            }
            byte[] bArr = this.k;
            int i = this.l;
            this.l = i + 1;
            bArr[i] = 93;
        }
        this.d = this.d.c;
    }

    @Override // defpackage.eanc, defpackage.eams
    public final void c() {
        w("start an object");
        this.d = this.d.g();
        eaoh eaohVar = this.a;
        if (eaohVar != null) {
            eaohVar.a(this);
            return;
        }
        if (this.l >= this.m) {
            x();
        }
        byte[] bArr = this.k;
        int i = this.l;
        this.l = i + 1;
        bArr[i] = 123;
    }

    @Override // defpackage.eanc, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.k != null && t(eamr.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                eang eangVar = this.d;
                if (eangVar.a()) {
                    b();
                } else if (!eangVar.b()) {
                    break;
                } else {
                    d();
                }
            }
        }
        x();
        if (this.h != null) {
            if (this.g.c || t(eamr.AUTO_CLOSE_TARGET)) {
                this.h.close();
            } else if (t(eamr.FLUSH_PASSED_TO_STREAM)) {
                this.h.flush();
            }
        }
        byte[] bArr = this.k;
        if (bArr != null) {
            this.k = null;
            this.g.d(bArr);
        }
        char[] cArr = this.o;
        if (cArr != null) {
            this.o = null;
            this.g.e(cArr);
        }
    }

    @Override // defpackage.eanc, defpackage.eams
    public final void d() {
        if (!this.d.b()) {
            v("Current context not an object but " + this.d.c());
        }
        this.d = this.d.c;
        eaoh eaohVar = this.a;
        if (eaohVar != null) {
            eaohVar.d(this, this.d.d());
            return;
        }
        if (this.l >= this.m) {
            x();
        }
        byte[] bArr = this.k;
        int i = this.l;
        this.l = i + 1;
        bArr[i] = 125;
    }

    @Override // defpackage.eams
    public final void e(String str) {
        int h = this.d.h(str);
        if (h == 4) {
            v("Can not write a field name, expecting a value");
        }
        eaoh eaohVar = this.a;
        if (eaohVar != null) {
            if (h == 1) {
                eaohVar.c(this);
            } else {
                eaohVar.b(this);
            }
            if (t(eamr.QUOTE_FIELD_NAMES)) {
                if (this.l >= this.m) {
                    x();
                }
                byte[] bArr = this.k;
                int i = this.l;
                this.l = i + 1;
                bArr[i] = 34;
                int length = str.length();
                if (length <= this.p) {
                    str.getChars(0, length, this.o, 0);
                    if (length <= this.n) {
                        if (this.l + length > this.m) {
                            x();
                        }
                        A(this.o, 0, length);
                    } else {
                        E(this.o, length);
                    }
                } else {
                    z(str);
                }
                if (this.l >= this.m) {
                    x();
                }
                byte[] bArr2 = this.k;
                int i2 = this.l;
                this.l = i2 + 1;
                bArr2[i2] = 34;
                return;
            }
            z(str);
            return;
        }
        if (h == 1) {
            if (this.l >= this.m) {
                x();
            }
            byte[] bArr3 = this.k;
            int i3 = this.l;
            this.l = i3 + 1;
            bArr3[i3] = 44;
        }
        if (!t(eamr.QUOTE_FIELD_NAMES)) {
            z(str);
            return;
        }
        if (this.l >= this.m) {
            x();
        }
        byte[] bArr4 = this.k;
        int i4 = this.l;
        this.l = i4 + 1;
        bArr4[i4] = 34;
        int length2 = str.length();
        if (length2 <= this.p) {
            str.getChars(0, length2, this.o, 0);
            if (length2 <= this.n) {
                if (this.l + length2 > this.m) {
                    x();
                }
                A(this.o, 0, length2);
            } else {
                E(this.o, length2);
            }
        } else {
            z(str);
        }
        if (this.l >= this.m) {
            x();
        }
        byte[] bArr5 = this.k;
        int i5 = this.l;
        this.l = i5 + 1;
        bArr5[i5] = 34;
    }

    @Override // defpackage.eams
    public final void f(String str) {
        w("write text value");
        if (str == null) {
            B();
            return;
        }
        int length = str.length();
        if (length > this.p) {
            if (this.l >= this.m) {
                x();
            }
            byte[] bArr = this.k;
            int i = this.l;
            this.l = i + 1;
            bArr[i] = 34;
            z(str);
            if (this.l >= this.m) {
                x();
            }
            byte[] bArr2 = this.k;
            int i2 = this.l;
            this.l = i2 + 1;
            bArr2[i2] = 34;
            return;
        }
        str.getChars(0, length, this.o, 0);
        if (length > this.n) {
            if (this.l >= this.m) {
                x();
            }
            byte[] bArr3 = this.k;
            int i3 = this.l;
            this.l = i3 + 1;
            bArr3[i3] = 34;
            E(this.o, length);
            if (this.l >= this.m) {
                x();
            }
            byte[] bArr4 = this.k;
            int i4 = this.l;
            this.l = i4 + 1;
            bArr4[i4] = 34;
            return;
        }
        if (this.l + length >= this.m) {
            x();
        }
        byte[] bArr5 = this.k;
        int i5 = this.l;
        this.l = i5 + 1;
        bArr5[i5] = 34;
        A(this.o, 0, length);
        if (this.l >= this.m) {
            x();
        }
        byte[] bArr6 = this.k;
        int i6 = this.l;
        this.l = i6 + 1;
        bArr6[i6] = 34;
    }

    @Override // defpackage.eams
    public final void g(String str) {
        int length = str.length();
        int i = 0;
        while (length > 0) {
            char[] cArr = this.o;
            int length2 = cArr.length;
            if (length < length2) {
                length2 = length;
            }
            int i2 = i + length2;
            str.getChars(i, i2, cArr, 0);
            s(cArr, length2);
            length -= length2;
            i = i2;
        }
    }

    @Override // defpackage.eams
    public final void h(char c) {
        if (this.l + 3 >= this.m) {
            x();
        }
        byte[] bArr = this.k;
        int i = this.l;
        this.l = i + 1;
        bArr[i] = (byte) c;
    }

    @Override // defpackage.eams
    public final void i(int i) {
        w("write number");
        if (this.l + 11 >= this.m) {
            x();
        }
        if (this.c) {
            if (this.l + 13 >= this.m) {
                x();
            }
            byte[] bArr = this.k;
            int i2 = this.l;
            int i3 = i2 + 1;
            this.l = i3;
            bArr[i2] = 34;
            int b = eanp.b(i, bArr, i3);
            byte[] bArr2 = this.k;
            this.l = b + 1;
            bArr2[b] = 34;
            return;
        }
        this.l = eanp.b(i, this.k, this.l);
    }

    @Override // defpackage.eams
    public final void j(long j) {
        w("write number");
        if (this.c) {
            if (this.l + 23 >= this.m) {
                x();
            }
            byte[] bArr = this.k;
            int i = this.l;
            int i2 = i + 1;
            this.l = i2;
            bArr[i] = 34;
            int d = eanp.d(j, bArr, i2);
            byte[] bArr2 = this.k;
            this.l = d + 1;
            bArr2[d] = 34;
            return;
        }
        if (this.l + 21 >= this.m) {
            x();
        }
        this.l = eanp.d(j, this.k, this.l);
    }

    @Override // defpackage.eams
    public final void k(BigInteger bigInteger) {
        w("write number");
        if (this.c) {
            y(bigInteger);
        } else {
            g(bigInteger.toString());
        }
    }

    @Override // defpackage.eams
    public final void l(double d) {
        if (!this.c && ((!Double.isNaN(d) && !Double.isInfinite(d)) || !t(eamr.QUOTE_NON_NUMERIC_NUMBERS))) {
            w("write number");
            g(String.valueOf(d));
            return;
        }
        f(String.valueOf(d));
    }

    @Override // defpackage.eams
    public final void m(float f2) {
        if (!this.c && ((!Float.isNaN(f2) && !Float.isInfinite(f2)) || !t(eamr.QUOTE_NON_NUMERIC_NUMBERS))) {
            w("write number");
            g(String.valueOf(f2));
            return;
        }
        f(String.valueOf(f2));
    }

    @Override // defpackage.eams
    public final void n(BigDecimal bigDecimal) {
        w("write number");
        if (this.c) {
            y(bigDecimal);
        } else {
            g(bigDecimal.toString());
        }
    }

    @Override // defpackage.eams
    public final void o(boolean z) {
        w("write boolean value");
        if (this.l + 5 >= this.m) {
            x();
        }
        byte[] bArr = z ? r : s;
        int length = bArr.length;
        System.arraycopy(bArr, 0, this.k, this.l, length);
        this.l += length;
    }

    @Override // defpackage.eams
    public final void p() {
        w("write null value");
        B();
    }

    @Override // defpackage.eams
    public final void q() {
        x();
        if (this.h == null || !t(eamr.FLUSH_PASSED_TO_STREAM)) {
            return;
        }
        this.h.flush();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if ((r9.l + 3) < r9.m) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        x();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        r1 = r5 + 1;
        r5 = r10[r5];
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r5 >= 2048) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002a, code lost:
        r6 = r9.l;
        r7 = r6 + 1;
        r9.l = r7;
        r0[r6] = (byte) ((r5 >> 6) | 192);
        r9.l = r7 + 1;
        r0[r7] = (byte) ((r5 & '?') | 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        D(r5, r10, r1, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        r5 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0067, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
        if (r0 >= 2048) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
        r1 = r9.k;
        r2 = r9.l;
        r6 = r2 + 1;
        r9.l = r6;
        r1[r2] = (byte) ((r0 >> 6) | 192);
        r9.l = r6 + 1;
        r1[r6] = (byte) ((r0 & '?') | 128);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0085, code lost:
        D(r0, r10, r5, r11);
     */
    @Override // defpackage.eams
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void s(char[] r10, int r11) {
        /*
            r9 = this;
            int r0 = r11 + r11
            int r0 = r0 + r11
            int r1 = r9.l
            int r2 = r9.m
            int r1 = r1 + r0
            r3 = 2048(0x800, float:2.87E-42)
            r4 = 128(0x80, float:1.794E-43)
            r5 = 0
            if (r1 <= r2) goto L5f
            if (r2 >= r0) goto L5c
            byte[] r0 = r9.k
        L13:
            if (r5 >= r11) goto L5b
        L15:
            char r1 = r10[r5]
            if (r1 < r4) goto L47
            int r1 = r9.l
            int r1 = r1 + 3
            int r6 = r9.m
            if (r1 < r6) goto L24
            r9.x()
        L24:
            int r1 = r5 + 1
            char r5 = r10[r5]
            if (r5 >= r3) goto L42
            int r6 = r9.l
            int r7 = r6 + 1
            r9.l = r7
            int r8 = r5 >> 6
            r8 = r8 | 192(0xc0, float:2.69E-43)
            byte r8 = (byte) r8
            r0[r6] = r8
            int r6 = r7 + 1
            r9.l = r6
            r5 = r5 & 63
            r5 = r5 | r4
            byte r5 = (byte) r5
            r0[r7] = r5
            goto L45
        L42:
            r9.D(r5, r10, r1, r11)
        L45:
            r5 = r1
            goto L13
        L47:
            int r6 = r9.l
            if (r6 < r2) goto L4e
            r9.x()
        L4e:
            int r6 = r9.l
            int r7 = r6 + 1
            r9.l = r7
            byte r1 = (byte) r1
            r0[r6] = r1
            int r5 = r5 + 1
            if (r5 < r11) goto L15
        L5b:
            return
        L5c:
            r9.x()
        L5f:
            if (r5 >= r11) goto L98
        L61:
            char r0 = r10[r5]
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L89
            int r5 = r5 + 1
            if (r0 >= r3) goto L85
            byte[] r1 = r9.k
            int r2 = r9.l
            int r6 = r2 + 1
            r9.l = r6
            int r7 = r0 >> 6
            r7 = r7 | 192(0xc0, float:2.69E-43)
            byte r7 = (byte) r7
            r1[r2] = r7
            int r2 = r6 + 1
            r9.l = r2
            r0 = r0 & 63
            r0 = r0 | r4
            byte r0 = (byte) r0
            r1[r6] = r0
            goto L5f
        L85:
            r9.D(r0, r10, r5, r11)
            goto L5f
        L89:
            byte[] r1 = r9.k
            int r2 = r9.l
            int r6 = r2 + 1
            r9.l = r6
            byte r0 = (byte) r0
            r1[r2] = r0
            int r5 = r5 + 1
            if (r5 < r11) goto L61
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eani.s(char[], int):void");
    }

    protected final void w(String str) {
        byte b;
        int i = this.d.i();
        if (i == 5) {
            v("Can not " + str + ", expecting field name");
        }
        eaoh eaohVar = this.a;
        if (eaohVar == null) {
            if (i == 1) {
                b = 44;
            } else if (i == 2) {
                b = 58;
            } else if (i != 3) {
                return;
            } else {
                b = 32;
            }
            if (this.l >= this.m) {
                x();
            }
            byte[] bArr = this.k;
            int i2 = this.l;
            bArr[i2] = b;
            this.l = i2 + 1;
        } else if (i == 0) {
            if (this.d.a()) {
                this.a.e(this);
            } else if (!this.d.b()) {
            } else {
                this.a.b(this);
            }
        } else if (i == 1) {
            eaohVar.f(this);
        } else if (i == 2) {
            eaoh.j(this);
        } else if (i == 3) {
            eaoh.h(this);
        } else {
            u();
        }
    }

    protected final void x() {
        int i = this.l;
        if (i > 0) {
            this.l = 0;
            this.h.write(this.k, 0, i);
        }
    }

    private final void D(int i, char[] cArr, int i2, int i3) {
        if (i < 55296 || i > 57343) {
            byte[] bArr = this.k;
            int i4 = this.l;
            int i5 = i4 + 1;
            this.l = i5;
            bArr[i4] = (byte) ((i >> 12) | 224);
            int i6 = i5 + 1;
            this.l = i6;
            bArr[i5] = (byte) (((i >> 6) & 63) | 128);
            this.l = i6 + 1;
            bArr[i6] = (byte) ((i & 63) | 128);
            return;
        }
        if (i2 >= i3) {
            v("Split surrogate on writeRaw() input (last character)");
        }
        char c = cArr[i2];
        if (c < 56320 || c > 57343) {
            v("Incomplete surrogate pair: first char 0x" + Integer.toHexString(i) + ", second 0x" + Integer.toHexString(c));
        }
        int i7 = ((i - 55296) << 10) + ImageMetadata.CONTROL_AE_ANTIBANDING_MODE + (c - 56320);
        if (this.l + 4 > this.m) {
            x();
        }
        byte[] bArr2 = this.k;
        int i8 = this.l;
        int i9 = i8 + 1;
        this.l = i9;
        bArr2[i8] = (byte) ((i7 >> 18) | 240);
        int i10 = i9 + 1;
        this.l = i10;
        bArr2[i9] = (byte) (((i7 >> 12) & 63) | 128);
        int i11 = i10 + 1;
        this.l = i11;
        bArr2[i10] = (byte) (((i7 >> 6) & 63) | 128);
        this.l = i11 + 1;
        bArr2[i11] = (byte) ((i7 & 63) | 128);
    }
}
