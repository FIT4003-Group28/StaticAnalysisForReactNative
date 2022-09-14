package defpackage;

import com.google.android.filament.R;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
/* compiled from: PG */
/* renamed from: dgxe  reason: default package */
/* loaded from: classes6.dex */
public class dgxe implements Closeable {
    private static final char[] c = ")]}'\n".toCharArray();
    private final Reader d;
    private long j;
    private int k;
    private String l;
    private int[] m;
    private String[] o;
    private int[] p;
    public boolean a = false;
    private final char[] e = new char[1024];
    private int f = 0;
    private int g = 0;
    private int h = 0;
    private int i = 0;
    public int b = 0;
    private int n = 1;

    public dgxe(Reader reader) {
        int[] iArr = new int[32];
        this.m = iArr;
        iArr[0] = 6;
        this.o = new String[32];
        this.p = new int[32];
        if (reader != null) {
            this.d = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private final char A() {
        int i;
        if (this.f != this.g || w(1)) {
            char[] cArr = this.e;
            int i2 = this.f;
            int i3 = i2 + 1;
            this.f = i3;
            char c2 = cArr[i2];
            if (c2 == '\n') {
                this.h++;
                this.i = i3;
            } else if (c2 != '\"' && c2 != '\'' && c2 != '/' && c2 != '\\') {
                if (c2 == 'b') {
                    return '\b';
                }
                if (c2 == 'f') {
                    return '\f';
                }
                if (c2 == 'n') {
                    return '\n';
                }
                if (c2 == 'r') {
                    return '\r';
                }
                if (c2 == 't') {
                    return '\t';
                }
                if (c2 == 'u') {
                    if (i3 + 4 <= this.g || w(4)) {
                        int i4 = this.f;
                        int i5 = i4 + 4;
                        char c3 = 0;
                        while (i4 < i5) {
                            char c4 = this.e[i4];
                            char c5 = (char) (c3 << 4);
                            if (c4 >= '0' && c4 <= '9') {
                                i = c4 - '0';
                            } else if (c4 >= 'a' && c4 <= 'f') {
                                i = c4 - 'W';
                            } else if (c4 < 'A' || c4 > 'F') {
                                throw new NumberFormatException("\\u" + new String(this.e, this.f, 4));
                            } else {
                                i = c4 - '7';
                            }
                            c3 = (char) (c5 + i);
                            i4++;
                        }
                        this.f += 4;
                        return c3;
                    }
                    throw B("Unterminated escape sequence");
                }
                throw B("Invalid escape sequence");
            }
            return c2;
        }
        throw B("Unterminated escape sequence");
    }

    private final IOException B(String str) {
        throw new dgxh(str + t());
    }

    private final boolean f(char c2) {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case R.styleable.AppCompatTheme_radioButtonStyle /* 91 */:
                        case R.styleable.AppCompatTheme_ratingBarStyleIndicator /* 93 */:
                            return false;
                        case R.styleable.AppCompatTheme_ratingBarStyle /* 92 */:
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        y();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005d, code lost:
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        r1 = r2 - r3;
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r1 + r1, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.f = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String o(char r10) {
        /*
            r9 = this;
            char[] r0 = r9.e
            r1 = 0
        L3:
            int r2 = r9.f
            int r3 = r9.g
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5d
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L29
            r9.f = r7
            int r7 = r7 - r3
            int r7 = r7 + (-1)
            if (r1 != 0) goto L21
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L21:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L29:
            r8 = 92
            if (r2 != r8) goto L50
            r9.f = r7
            int r7 = r7 - r3
            int r7 = r7 + (-1)
            if (r1 != 0) goto L41
            int r1 = r7 + 1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L41:
            r1.append(r0, r3, r7)
            char r2 = r9.A()
            r1.append(r2)
            int r2 = r9.f
            int r3 = r9.g
            goto L7
        L50:
            r5 = 10
            if (r2 != r5) goto L5b
            int r2 = r9.h
            int r2 = r2 + r6
            r9.h = r2
            r9.i = r7
        L5b:
            r2 = r7
            goto L9
        L5d:
            if (r1 != 0) goto L6c
            int r1 = r2 - r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = r1 + r1
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f = r2
            boolean r2 = r9.w(r6)
            if (r2 == 0) goto L7a
            goto L3
        L7a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.B(r10)
            goto L82
        L81:
            throw r10
        L82:
            goto L81
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgxe.o(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
        y();
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String r() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r5.f
            int r3 = r3 + r2
            int r4 = r5.g
            if (r3 >= r4) goto L4c
            char[] r4 = r5.e
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L58
            r4 = 10
            if (r3 == r4) goto L58
            r4 = 12
            if (r3 == r4) goto L58
            r4 = 13
            if (r3 == r4) goto L58
            r4 = 32
            if (r3 == r4) goto L58
            r4 = 35
            if (r3 == r4) goto L48
            r4 = 44
            if (r3 == r4) goto L58
            r4 = 47
            if (r3 == r4) goto L48
            r4 = 61
            if (r3 == r4) goto L48
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L58
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L58
            r4 = 58
            if (r3 == r4) goto L58
            r4 = 59
            if (r3 == r4) goto L48
            switch(r3) {
                case 91: goto L58;
                case 92: goto L48;
                case 93: goto L58;
                default: goto L45;
            }
        L45:
            int r2 = r2 + 1
            goto L3
        L48:
            r5.y()
            goto L58
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5a
            int r3 = r2 + 1
            boolean r3 = r5.w(r3)
            if (r3 != 0) goto L3
        L58:
            r0 = r2
            goto L7a
        L5a:
            if (r1 != 0) goto L67
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L67:
            char[] r3 = r5.e
            int r4 = r5.f
            r1.append(r3, r4, r2)
            int r3 = r5.f
            int r3 = r3 + r2
            r5.f = r3
            r2 = 1
            boolean r2 = r5.w(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r1 != 0) goto L86
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.e
            int r3 = r5.f
            r1.<init>(r2, r3, r0)
            goto L91
        L86:
            char[] r2 = r5.e
            int r3 = r5.f
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L91:
            int r2 = r5.f
            int r2 = r2 + r0
            r5.f = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgxe.r():java.lang.String");
    }

    private final void u(char c2) {
        char[] cArr = this.e;
        do {
            int i = this.f;
            int i2 = this.g;
            while (i < i2) {
                int i3 = i + 1;
                char c3 = cArr[i];
                if (c3 == c2) {
                    this.f = i3;
                    return;
                } else if (c3 == '\\') {
                    this.f = i3;
                    A();
                    i = this.f;
                    i2 = this.g;
                } else {
                    if (c3 == '\n') {
                        this.h++;
                        this.i = i3;
                    }
                    i = i3;
                }
            }
            this.f = i;
        } while (w(1));
        throw B("Unterminated string");
    }

    private final void v(int i) {
        int i2 = this.n;
        int[] iArr = this.m;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            String[] strArr = new String[i3];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.p, 0, iArr3, 0, this.n);
            System.arraycopy(this.o, 0, strArr, 0, this.n);
            this.m = iArr2;
            this.p = iArr3;
            this.o = strArr;
        }
        int[] iArr4 = this.m;
        int i4 = this.n;
        this.n = i4 + 1;
        iArr4[i4] = i;
    }

    private final boolean w(int i) {
        int i2;
        char[] cArr = this.e;
        int i3 = this.i;
        int i4 = this.f;
        this.i = i3 - i4;
        int i5 = this.g;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.g = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.g = 0;
        }
        this.f = 0;
        do {
            Reader reader = this.d;
            int i7 = this.g;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.g + read;
            this.g = i2;
            if (this.h == 0 && this.i == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f++;
                this.i = 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    private final int x(boolean z) {
        char[] cArr = this.e;
        int i = this.f;
        int i2 = this.g;
        while (true) {
            if (i == i2) {
                this.f = i;
                if (!w(1)) {
                    if (!z) {
                        return -1;
                    }
                    throw new EOFException("End of input" + t());
                }
                i = this.f;
                i2 = this.g;
            }
            int i3 = i + 1;
            char c2 = cArr[i];
            if (c2 == '\n') {
                this.h++;
                this.i = i3;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f = i3;
                    if (i3 == i2) {
                        this.f = i3 - 1;
                        boolean w = w(2);
                        this.f++;
                        if (!w) {
                            return 47;
                        }
                    }
                    y();
                    int i4 = this.f;
                    char c3 = cArr[i4];
                    if (c3 == '*') {
                        this.f = i4 + 1;
                        while (true) {
                            if (this.f + 2 <= this.g || w(2)) {
                                char[] cArr2 = this.e;
                                int i5 = this.f;
                                if (cArr2[i5] != '\n') {
                                    for (int i6 = 0; i6 < 2; i6++) {
                                        if (this.e[this.f + i6] == "*/".charAt(i6)) {
                                        }
                                    }
                                    i = 2 + this.f;
                                    i2 = this.g;
                                    break;
                                }
                                this.h++;
                                this.i = i5 + 1;
                                this.f++;
                            } else {
                                throw B("Unterminated comment");
                            }
                        }
                    } else if (c3 != '/') {
                        return 47;
                    } else {
                        this.f = i4 + 1;
                        z();
                        i = this.f;
                        i2 = this.g;
                    }
                } else if (c2 != '#') {
                    this.f = i3;
                    return c2;
                } else {
                    this.f = i3;
                    y();
                    z();
                    i = this.f;
                    i2 = this.g;
                }
            }
            i = i3;
        }
    }

    private final void y() {
        if (this.a) {
            return;
        }
        throw B("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void z() {
        char c2;
        do {
            if (this.f >= this.g && !w(1)) {
                return;
            }
            char[] cArr = this.e;
            int i = this.f;
            int i2 = i + 1;
            this.f = i2;
            c2 = cArr[i];
            if (c2 == '\n') {
                this.h++;
                this.i = i2;
                return;
            }
        } while (c2 != '\r');
    }

    public void a() {
        int i = this.b;
        if (i == 0) {
            i = s();
        }
        if (i == 3) {
            v(1);
            this.p[this.n - 1] = 0;
            this.b = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + ((Object) dgxf.a(q())) + t());
    }

    public void b() {
        int i = this.b;
        if (i == 0) {
            i = s();
        }
        if (i == 4) {
            int i2 = this.n - 1;
            this.n = i2;
            int[] iArr = this.p;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.b = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + ((Object) dgxf.a(q())) + t());
    }

    public void c() {
        int i = this.b;
        if (i == 0) {
            i = s();
        }
        if (i == 1) {
            v(3);
            this.b = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + ((Object) dgxf.a(q())) + t());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.b = 0;
        this.m[0] = 8;
        this.n = 1;
        this.d.close();
    }

    public void d() {
        int i = this.b;
        if (i == 0) {
            i = s();
        }
        if (i == 2) {
            int i2 = this.n - 1;
            this.n = i2;
            this.o[i2] = null;
            int[] iArr = this.p;
            int i3 = i2 - 1;
            iArr[i3] = iArr[i3] + 1;
            this.b = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + ((Object) dgxf.a(q())) + t());
    }

    public boolean e() {
        int i = this.b;
        if (i == 0) {
            i = s();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public String g() {
        String o;
        int i = this.b;
        if (i == 0) {
            i = s();
        }
        if (i == 14) {
            o = r();
        } else if (i == 12) {
            o = o('\'');
        } else if (i == 13) {
            o = o('\"');
        } else {
            throw new IllegalStateException("Expected a name but was " + ((Object) dgxf.a(q())) + t());
        }
        this.b = 0;
        this.o[this.n - 1] = o;
        return o;
    }

    public String h() {
        String str;
        int i = this.b;
        if (i == 0) {
            i = s();
        }
        if (i == 10) {
            str = r();
        } else if (i == 8) {
            str = o('\'');
        } else if (i == 9) {
            str = o('\"');
        } else if (i == 11) {
            str = this.l;
            this.l = null;
        } else if (i == 15) {
            str = Long.toString(this.j);
        } else if (i == 16) {
            str = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else {
            throw new IllegalStateException("Expected a string but was " + ((Object) dgxf.a(q())) + t());
        }
        this.b = 0;
        int[] iArr = this.p;
        int i2 = this.n - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    public boolean i() {
        int i = this.b;
        if (i == 0) {
            i = s();
        }
        if (i == 5) {
            this.b = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        } else if (i == 6) {
            this.b = 0;
            int[] iArr2 = this.p;
            int i3 = this.n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + ((Object) dgxf.a(q())) + t());
        }
    }

    public void j() {
        int i = this.b;
        if (i == 0) {
            i = s();
        }
        if (i == 7) {
            this.b = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + ((Object) dgxf.a(q())) + t());
    }

    public double k() {
        int i = this.b;
        if (i == 0) {
            i = s();
        }
        if (i == 15) {
            this.b = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j;
        }
        if (i == 16) {
            this.l = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else if (i == 8 || i == 9) {
            this.l = o(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.l = r();
        } else if (i != 11) {
            throw new IllegalStateException("Expected a double but was " + ((Object) dgxf.a(q())) + t());
        }
        this.b = 11;
        double parseDouble = Double.parseDouble(this.l);
        if (this.a || (!Double.isNaN(parseDouble) && !Double.isInfinite(parseDouble))) {
            this.l = null;
            this.b = 0;
            int[] iArr2 = this.p;
            int i3 = this.n - 1;
            iArr2[i3] = iArr2[i3] + 1;
            return parseDouble;
        }
        throw new dgxh("JSON forbids NaN and infinities: " + parseDouble + t());
    }

    public long l() {
        int i = this.b;
        if (i == 0) {
            i = s();
        }
        if (i == 15) {
            this.b = 0;
            int[] iArr = this.p;
            int i2 = this.n - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.j;
        }
        if (i == 16) {
            this.l = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.l = r();
            } else {
                this.l = o(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.l);
                this.b = 0;
                int[] iArr2 = this.p;
                int i3 = this.n - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected a long but was " + ((Object) dgxf.a(q())) + t());
        }
        this.b = 11;
        double parseDouble = Double.parseDouble(this.l);
        long j = (long) parseDouble;
        if (j == parseDouble) {
            this.l = null;
            this.b = 0;
            int[] iArr3 = this.p;
            int i4 = this.n - 1;
            iArr3[i4] = iArr3[i4] + 1;
            return j;
        }
        throw new NumberFormatException("Expected a long but was " + this.l + t());
    }

    public int m() {
        int i = this.b;
        if (i == 0) {
            i = s();
        }
        if (i == 15) {
            long j = this.j;
            int i2 = (int) j;
            if (j == i2) {
                this.b = 0;
                int[] iArr = this.p;
                int i3 = this.n - 1;
                iArr[i3] = iArr[i3] + 1;
                return i2;
            }
            throw new NumberFormatException("Expected an int but was " + this.j + t());
        }
        if (i == 16) {
            this.l = new String(this.e, this.f, this.k);
            this.f += this.k;
        } else if (i == 8 || i == 9 || i == 10) {
            if (i == 10) {
                this.l = r();
            } else {
                this.l = o(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.l);
                this.b = 0;
                int[] iArr2 = this.p;
                int i4 = this.n - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        } else {
            throw new IllegalStateException("Expected an int but was " + ((Object) dgxf.a(q())) + t());
        }
        this.b = 11;
        double parseDouble = Double.parseDouble(this.l);
        int i5 = (int) parseDouble;
        if (i5 == parseDouble) {
            this.l = null;
            this.b = 0;
            int[] iArr3 = this.p;
            int i6 = this.n - 1;
            iArr3[i6] = iArr3[i6] + 1;
            return i5;
        }
        throw new NumberFormatException("Expected an int but was " + this.l + t());
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x009d, code lost:
        y();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void n() {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgxe.n():void");
    }

    public String p() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.n;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.m[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.p[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.o[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public int q() {
        int i = this.b;
        if (i == 0) {
            i = s();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case 9:
            case 10:
            case 11:
                return 6;
            case 12:
            case 13:
            case 14:
                return 5;
            case 15:
            case 16:
                return 7;
            default:
                return 10;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:158:0x0208, code lost:
        if (f(r6) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x020c, code lost:
        if (r4 != 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x020e, code lost:
        if (r16 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0214, code lost:
        if (r13 != Long.MIN_VALUE) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0216, code lost:
        if (r17 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0218, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x021a, code lost:
        r8 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0220, code lost:
        if (r13 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0222, code lost:
        if (r8 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0225, code lost:
        if (r8 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0228, code lost:
        r13 = -r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0229, code lost:
        r20.j = r13;
        r20.f += r7;
        r20.b = 15;
        r6 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x0237, code lost:
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0238, code lost:
        if (r4 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x023b, code lost:
        if (r4 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x023e, code lost:
        if (r4 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0240, code lost:
        r20.k = r7;
        r20.b = 16;
        r6 = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x026b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0287 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s() {
        /*
            Method dump skipped, instructions count: 805
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dgxe.s():int");
    }

    public String t() {
        int i = this.h;
        int i2 = this.f;
        int i3 = this.i;
        return " at line " + (i + 1) + " column " + ((i2 - i3) + 1) + " path " + p();
    }

    public String toString() {
        return getClass().getSimpleName() + t();
    }
}
