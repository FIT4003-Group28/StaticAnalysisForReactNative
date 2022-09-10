package defpackage;

import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
/* compiled from: PG */
/* renamed from: eank  reason: default package */
/* loaded from: classes6.dex */
public final class eank extends eanc {
    protected static final char[] e = eaoe.b();
    protected static final int[] f = eaoe.g;
    protected final eanm g;
    protected final Writer h;
    protected final int[] i;
    protected int j;
    protected char[] k;
    protected int l;
    protected int m;
    protected final int n;
    protected char[] o;

    public eank(eanm eanmVar, int i, Writer writer) {
        super(i);
        this.i = f;
        this.l = 0;
        this.m = 0;
        this.g = eanmVar;
        this.h = writer;
        char[] b = eanmVar.b();
        this.k = b;
        this.n = b.length;
        if (t(eamr.ESCAPE_NON_ASCII)) {
            this.j = 127;
        }
    }

    private final void A() {
        if (this.m + 4 >= this.n) {
            x();
        }
        int i = this.m;
        char[] cArr = this.k;
        cArr[i] = 'n';
        int i2 = i + 1;
        cArr[i2] = 'u';
        int i3 = i2 + 1;
        cArr[i3] = 'l';
        int i4 = i3 + 1;
        cArr[i4] = 'l';
        this.m = i4 + 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    private final void B(char c, int i) {
        int i2;
        char c2;
        if (i >= 0) {
            int i3 = this.m;
            if (i3 >= 2) {
                int i4 = i3 - 2;
                this.l = i4;
                char[] cArr = this.k;
                cArr[i4] = '\\';
                cArr[i4 + 1] = (char) i;
                return;
            }
            char[] cArr2 = this.o;
            if (cArr2 == null) {
                cArr2 = D();
            }
            this.l = this.m;
            cArr2[1] = (char) i;
            this.h.write(cArr2, 0, 2);
        } else if (i == -2) {
            throw null;
        } else {
            int i5 = this.m;
            if (i5 >= 6) {
                char[] cArr3 = this.k;
                int i6 = i5 - 6;
                this.l = i6;
                cArr3[i6] = '\\';
                int i7 = i6 + 1;
                cArr3[i7] = 'u';
                if (c > 255) {
                    int i8 = c >> '\b';
                    int i9 = i7 + 1;
                    char[] cArr4 = e;
                    cArr3[i9] = cArr4[i8 >> 4];
                    i2 = i9 + 1;
                    cArr3[i2] = cArr4[i8 & 15];
                    c2 = c & 255;
                } else {
                    int i10 = i7 + 1;
                    cArr3[i10] = '0';
                    i2 = i10 + 1;
                    cArr3[i2] = '0';
                    c2 = c;
                }
                int i11 = i2 + 1;
                char[] cArr5 = e;
                cArr3[i11] = cArr5[c2 >> 4];
                cArr3[i11 + 1] = cArr5[c2 & 15];
                return;
            }
            char[] cArr6 = this.o;
            if (cArr6 == null) {
                cArr6 = D();
            }
            this.l = this.m;
            if (c > 255) {
                int i12 = c >> '\b';
                int i13 = c & 255;
                char[] cArr7 = e;
                cArr6[10] = cArr7[i12 >> 4];
                cArr6[11] = cArr7[i12 & 15];
                cArr6[12] = cArr7[i13 >> 4];
                cArr6[13] = cArr7[i13 & 15];
                this.h.write(cArr6, 8, 6);
                return;
            }
            char[] cArr8 = e;
            cArr6[6] = cArr8[c >> 4];
            cArr6[7] = cArr8[c & 15];
            this.h.write(cArr6, 2, 6);
        }
    }

    private final char[] D() {
        char[] cArr = {'\\', 0, '\\', 'u', '0', '0', 0, 0, '\\', 'u'};
        this.o = cArr;
        return cArr;
    }

    private final void y(Object obj) {
        if (this.m >= this.n) {
            x();
        }
        char[] cArr = this.k;
        int i = this.m;
        this.m = i + 1;
        cArr[i] = '\"';
        g(obj.toString());
        if (this.m >= this.n) {
            x();
        }
        char[] cArr2 = this.k;
        int i2 = this.m;
        this.m = i2 + 1;
        cArr2[i2] = '\"';
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x010d, code lost:
        r4 = r18.l;
        r3 = r3 - r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0110, code lost:
        if (r3 <= 0) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0112, code lost:
        r18.h.write(r2, r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0117, code lost:
        r2 = r18.k;
        r3 = r18.m;
        r18.m = r3 + 1;
        r2 = r2[r3];
        B(r2, r0[r2]);
     */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void z(java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eank.z(java.lang.String):void");
    }

    @Override // defpackage.eanc, defpackage.eams
    public final void a() {
        w("start an array");
        this.d = this.d.f();
        if (this.a != null) {
            eaoh.i(this);
            return;
        }
        if (this.m >= this.n) {
            x();
        }
        char[] cArr = this.k;
        int i = this.m;
        this.m = i + 1;
        cArr[i] = '[';
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
            if (this.m >= this.n) {
                x();
            }
            char[] cArr = this.k;
            int i = this.m;
            this.m = i + 1;
            cArr[i] = ']';
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
        if (this.m >= this.n) {
            x();
        }
        char[] cArr = this.k;
        int i = this.m;
        this.m = i + 1;
        cArr[i] = '{';
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
        if (this.g.c || t(eamr.AUTO_CLOSE_TARGET)) {
            this.h.close();
        } else if (t(eamr.FLUSH_PASSED_TO_STREAM)) {
            this.h.flush();
        }
        char[] cArr = this.k;
        if (cArr != null) {
            this.k = null;
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
        if (this.m >= this.n) {
            x();
        }
        char[] cArr = this.k;
        int i = this.m;
        this.m = i + 1;
        cArr[i] = '}';
    }

    @Override // defpackage.eams
    public final void e(String str) {
        int h = this.d.h(str);
        if (h == 4) {
            v("Can not write a field name, expecting a value");
        }
        eaoh eaohVar = this.a;
        if (eaohVar == null) {
            if (this.m + 1 >= this.n) {
                x();
            }
            if (h == 1) {
                char[] cArr = this.k;
                int i = this.m;
                this.m = i + 1;
                cArr[i] = ',';
            }
            if (!t(eamr.QUOTE_FIELD_NAMES)) {
                z(str);
                return;
            }
            char[] cArr2 = this.k;
            int i2 = this.m;
            this.m = i2 + 1;
            cArr2[i2] = '\"';
            z(str);
            if (this.m >= this.n) {
                x();
            }
            char[] cArr3 = this.k;
            int i3 = this.m;
            this.m = i3 + 1;
            cArr3[i3] = '\"';
            return;
        }
        if (h == 1) {
            eaohVar.c(this);
        } else {
            eaohVar.b(this);
        }
        if (t(eamr.QUOTE_FIELD_NAMES)) {
            if (this.m >= this.n) {
                x();
            }
            char[] cArr4 = this.k;
            int i4 = this.m;
            this.m = i4 + 1;
            cArr4[i4] = '\"';
            z(str);
            if (this.m >= this.n) {
                x();
            }
            char[] cArr5 = this.k;
            int i5 = this.m;
            this.m = i5 + 1;
            cArr5[i5] = '\"';
            return;
        }
        z(str);
    }

    @Override // defpackage.eams
    public final void f(String str) {
        w("write text value");
        if (str == null) {
            A();
            return;
        }
        if (this.m >= this.n) {
            x();
        }
        char[] cArr = this.k;
        int i = this.m;
        this.m = i + 1;
        cArr[i] = '\"';
        z(str);
        if (this.m >= this.n) {
            x();
        }
        char[] cArr2 = this.k;
        int i2 = this.m;
        this.m = i2 + 1;
        cArr2[i2] = '\"';
    }

    @Override // defpackage.eams
    public final void g(String str) {
        int length = str.length();
        int i = this.n - this.m;
        if (i == 0) {
            x();
            i = this.n - this.m;
        }
        if (i < length) {
            int i2 = this.n;
            int i3 = this.m;
            int i4 = i2 - i3;
            str.getChars(0, i4, this.k, i3);
            this.m += i4;
            x();
            int length2 = str.length() - i4;
            while (true) {
                int i5 = this.n;
                if (length2 > i5) {
                    int i6 = i4 + i5;
                    str.getChars(i4, i6, this.k, 0);
                    this.l = 0;
                    this.m = i5;
                    x();
                    length2 -= i5;
                    i4 = i6;
                } else {
                    str.getChars(i4, i4 + length2, this.k, 0);
                    this.l = 0;
                    this.m = length2;
                    return;
                }
            }
        } else {
            str.getChars(0, length, this.k, this.m);
            this.m += length;
        }
    }

    @Override // defpackage.eams
    public final void h(char c) {
        if (this.m >= this.n) {
            x();
        }
        char[] cArr = this.k;
        int i = this.m;
        this.m = i + 1;
        cArr[i] = c;
    }

    @Override // defpackage.eams
    public final void i(int i) {
        w("write number");
        if (this.c) {
            if (this.m + 13 >= this.n) {
                x();
            }
            char[] cArr = this.k;
            int i2 = this.m;
            int i3 = i2 + 1;
            this.m = i3;
            cArr[i2] = '\"';
            int a = eanp.a(i, cArr, i3);
            char[] cArr2 = this.k;
            this.m = a + 1;
            cArr2[a] = '\"';
            return;
        }
        if (this.m + 11 >= this.n) {
            x();
        }
        this.m = eanp.a(i, this.k, this.m);
    }

    @Override // defpackage.eams
    public final void j(long j) {
        w("write number");
        if (this.c) {
            if (this.m + 23 >= this.n) {
                x();
            }
            char[] cArr = this.k;
            int i = this.m;
            int i2 = i + 1;
            this.m = i2;
            cArr[i] = '\"';
            int c = eanp.c(j, cArr, i2);
            char[] cArr2 = this.k;
            this.m = c + 1;
            cArr2[c] = '\"';
            return;
        }
        if (this.m + 21 >= this.n) {
            x();
        }
        this.m = eanp.c(j, this.k, this.m);
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
        int i;
        w("write boolean value");
        if (this.m + 5 >= this.n) {
            x();
        }
        int i2 = this.m;
        char[] cArr = this.k;
        if (z) {
            cArr[i2] = 't';
            int i3 = i2 + 1;
            cArr[i3] = 'r';
            int i4 = i3 + 1;
            cArr[i4] = 'u';
            i = i4 + 1;
            cArr[i] = 'e';
        } else {
            cArr[i2] = 'f';
            int i5 = i2 + 1;
            cArr[i5] = 'a';
            int i6 = i5 + 1;
            cArr[i6] = 'l';
            int i7 = i6 + 1;
            cArr[i7] = 's';
            i = i7 + 1;
            cArr[i] = 'e';
        }
        this.m = i + 1;
    }

    @Override // defpackage.eams
    public final void p() {
        w("write null value");
        A();
    }

    @Override // defpackage.eams
    public final void q() {
        x();
        if (t(eamr.FLUSH_PASSED_TO_STREAM)) {
            this.h.flush();
        }
    }

    @Override // defpackage.eams
    public final void s(char[] cArr, int i) {
        if (i < 32) {
            if (i > this.n - this.m) {
                x();
            }
            System.arraycopy(cArr, 0, this.k, this.m, i);
            this.m += i;
            return;
        }
        x();
        this.h.write(cArr, 0, i);
    }

    protected final void w(String str) {
        char c;
        int i = this.d.i();
        if (i == 5) {
            v("Can not " + str + ", expecting field name");
        }
        eaoh eaohVar = this.a;
        if (eaohVar == null) {
            if (i == 1) {
                c = ',';
            } else if (i == 2) {
                c = ':';
            } else if (i != 3) {
                return;
            } else {
                c = ' ';
            }
            if (this.m >= this.n) {
                x();
            }
            char[] cArr = this.k;
            int i2 = this.m;
            cArr[i2] = c;
            this.m = i2 + 1;
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
        int i = this.m;
        int i2 = this.l;
        int i3 = i - i2;
        if (i3 > 0) {
            this.l = 0;
            this.m = 0;
            this.h.write(this.k, i2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v9 */
    private final int C(char[] cArr, int i, int i2, char c, int i3) {
        int i4;
        char c2;
        if (i3 >= 0) {
            if (i <= 1 || i >= i2) {
                char[] cArr2 = this.o;
                if (cArr2 == null) {
                    cArr2 = D();
                }
                cArr2[1] = (char) i3;
                this.h.write(cArr2, 0, 2);
                return i;
            }
            int i5 = i - 2;
            cArr[i5] = '\\';
            cArr[i5 + 1] = (char) i3;
            return i5;
        } else if (i3 == -2) {
            throw null;
        } else {
            if (i > 5 && i < i2) {
                int i6 = i - 6;
                int i7 = i6 + 1;
                cArr[i6] = '\\';
                int i8 = i7 + 1;
                cArr[i7] = 'u';
                if (c > 255) {
                    int i9 = c >> '\b';
                    int i10 = i8 + 1;
                    char[] cArr3 = e;
                    cArr[i8] = cArr3[i9 >> 4];
                    i4 = i10 + 1;
                    cArr[i10] = cArr3[i9 & 15];
                    c2 = c & 255;
                } else {
                    int i11 = i8 + 1;
                    cArr[i8] = '0';
                    i4 = i11 + 1;
                    cArr[i11] = '0';
                    c2 = c;
                }
                int i12 = i4 + 1;
                char[] cArr4 = e;
                cArr[i4] = cArr4[c2 >> 4];
                cArr[i12] = cArr4[c2 & 15];
                return i12 - 5;
            }
            char[] cArr5 = this.o;
            if (cArr5 == null) {
                cArr5 = D();
            }
            this.l = this.m;
            if (c > 255) {
                int i13 = c >> '\b';
                int i14 = c & 255;
                char[] cArr6 = e;
                cArr5[10] = cArr6[i13 >> 4];
                cArr5[11] = cArr6[i13 & 15];
                cArr5[12] = cArr6[i14 >> 4];
                cArr5[13] = cArr6[i14 & 15];
                this.h.write(cArr5, 8, 6);
                return i;
            }
            char[] cArr7 = e;
            cArr5[6] = cArr7[c >> 4];
            cArr5[7] = cArr7[c & 15];
            this.h.write(cArr5, 2, 6);
            return i;
        }
    }
}
