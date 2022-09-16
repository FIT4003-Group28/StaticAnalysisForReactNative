package defpackage;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: aoem  reason: default package */
/* loaded from: classes.dex */
public final class aoem implements Closeable {
    public long d;
    public int e;
    public String f;
    public String[] h;
    public int[] i;
    private final Reader j;
    private int[] n;
    public final char[] a = new char[1024];
    public int b = 0;
    private int k = 0;
    private int l = 0;
    private int m = 0;
    public int c = 0;
    public int g = 1;

    public aoem(Reader reader) {
        int[] iArr = new int[32];
        this.n = iArr;
        iArr[0] = 6;
        this.h = new String[32];
        this.i = new int[32];
        this.j = reader;
    }

    private final int i(boolean z) {
        char[] cArr = this.a;
        int i = this.b;
        int i2 = this.k;
        while (true) {
            if (i == i2) {
                this.b = i;
                if (!m(1)) {
                    if (!z) {
                        return -1;
                    }
                    String valueOf = String.valueOf(c());
                    throw new EOFException(valueOf.length() != 0 ? "End of input".concat(valueOf) : new String("End of input"));
                }
                i = this.b;
                i2 = this.k;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.l++;
                this.m = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.b = i3;
                    if (i3 == i2) {
                        this.b = i3 - 1;
                        boolean m = m(2);
                        this.b++;
                        if (!m) {
                            return 47;
                        }
                    }
                    k();
                    int i4 = this.b;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.b = i4 + 1;
                        while (true) {
                            if (this.b + 2 <= this.k || m(2)) {
                                char[] cArr2 = this.a;
                                int i5 = this.b;
                                if (cArr2[i5] != '\n') {
                                    for (int i6 = 0; i6 < 2; i6++) {
                                        if (this.a[this.b + i6] == "*/".charAt(i6)) {
                                        }
                                    }
                                    i = 2 + this.b;
                                    i2 = this.k;
                                    break;
                                }
                                this.l++;
                                this.m = i5 + 1;
                                this.b++;
                            } else {
                                throw j("Unterminated comment");
                            }
                        }
                    } else if (c2 != '/') {
                        return 47;
                    } else {
                        this.b = i4 + 1;
                        l();
                        i = this.b;
                        i2 = this.k;
                    }
                } else if (c != '#') {
                    this.b = i3;
                    return c;
                } else {
                    this.b = i3;
                    k();
                    l();
                    i = this.b;
                    i2 = this.k;
                }
            }
            i = i3;
        }
    }

    private final IOException j(String str) {
        String valueOf = String.valueOf(c());
        throw new aoen(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
    }

    private final void k() {
        throw j("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void l() {
        char c;
        do {
            if (this.b >= this.k && !m(1)) {
                return;
            }
            char[] cArr = this.a;
            int i = this.b;
            int i2 = i + 1;
            this.b = i2;
            c = cArr[i];
            if (c == '\n') {
                this.l++;
                this.m = i2;
                return;
            }
        } while (c != '\r');
    }

    private final boolean m(int i) {
        int i2;
        char[] cArr = this.a;
        int i3 = this.m;
        int i4 = this.b;
        this.m = i3 - i4;
        int i5 = this.k;
        if (i5 != i4) {
            int i6 = i5 - i4;
            this.k = i6;
            System.arraycopy(cArr, i4, cArr, 0, i6);
        } else {
            this.k = 0;
        }
        this.b = 0;
        do {
            Reader reader = this.j;
            int i7 = this.k;
            int read = reader.read(cArr, i7, 1024 - i7);
            if (read == -1) {
                return false;
            }
            i2 = this.k + read;
            this.k = i2;
            if (this.l == 0 && this.m == 0 && i2 > 0 && cArr[0] == 65279) {
                this.b++;
                this.m = 1;
                i++;
                continue;
            }
        } while (i2 < i);
        return true;
    }

    private final boolean n(char c) {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        k();
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:144:0x01cb, code lost:
        if (n(r6) != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01cf, code lost:
        if (r4 != 2) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d1, code lost:
        if (r16 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01d7, code lost:
        if (r13 != Long.MIN_VALUE) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x01d9, code lost:
        if (r17 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01db, code lost:
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01dd, code lost:
        r8 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01e3, code lost:
        if (r13 != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x01e5, code lost:
        if (r8 != false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01e8, code lost:
        if (r8 == false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x01eb, code lost:
        r13 = -r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x01ec, code lost:
        r20.d = r13;
        r20.b += r7;
        r20.c = 15;
        r6 = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x01fa, code lost:
        r4 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x01fb, code lost:
        if (r4 == 2) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x01fe, code lost:
        if (r4 == 4) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0201, code lost:
        if (r4 != 7) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0203, code lost:
        r20.e = r7;
        r20.c = 16;
        r6 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x014b, code lost:
        r6 = 0;
     */
    /* JADX WARN: Removed duplicated region for block: B:193:0x024b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0134  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() {
        /*
            Method dump skipped, instructions count: 745
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoem.a():int");
    }

    public final String b() {
        StringBuilder sb = new StringBuilder();
        sb.append('$');
        int i = this.g;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.n[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[');
                sb.append(this.i[i2]);
                sb.append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                String str = this.h[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    public final String c() {
        int i = this.l;
        int i2 = this.b;
        int i3 = this.m;
        String b = b();
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 45);
        sb.append(" at line ");
        sb.append(i + 1);
        sb.append(" column ");
        sb.append((i2 - i3) + 1);
        sb.append(" path ");
        sb.append(b);
        return sb.toString();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c = 0;
        this.n[0] = 8;
        this.g = 1;
        this.j.close();
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x00d3, code lost:
        r0 = new java.lang.String(r5, r10.b, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e2, code lost:
        if (r0.length() == 0) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e4, code lost:
        r0 = "\\u".concat(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00e9, code lost:
        r0 = new java.lang.String("\\u");
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00f1, code lost:
        throw new java.lang.NumberFormatException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0128, code lost:
        if (r1 != null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x012a, code lost:
        r1 = r2 - r3;
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r1 + r1, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0137, code lost:
        r1.append(r0, r3, r2 - r3);
        r10.b = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String d(char r11) {
        /*
            Method dump skipped, instructions count: 335
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoem.d(char):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0048, code lost:
        k();
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String e() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = 0
        L3:
            int r3 = r5.b
            int r3 = r3 + r2
            int r4 = r5.k
            if (r3 >= r4) goto L4c
            char[] r4 = r5.a
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
            r5.k()
            goto L58
        L4c:
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 >= r3) goto L5a
            int r3 = r2 + 1
            boolean r3 = r5.m(r3)
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
            char[] r3 = r5.a
            int r4 = r5.b
            r1.append(r3, r4, r2)
            int r3 = r5.b
            int r3 = r3 + r2
            r5.b = r3
            r2 = 1
            boolean r2 = r5.m(r2)
            if (r2 != 0) goto L2
        L7a:
            if (r1 != 0) goto L86
            java.lang.String r1 = new java.lang.String
            char[] r2 = r5.a
            int r3 = r5.b
            r1.<init>(r2, r3, r0)
            goto L91
        L86:
            char[] r2 = r5.a
            int r3 = r5.b
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L91:
            int r2 = r5.b
            int r2 = r2 + r0
            r5.b = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aoem.e():java.lang.String");
    }

    public final void f(int i) {
        int i2 = this.g;
        int[] iArr = this.n;
        if (i2 == iArr.length) {
            int i3 = i2 + i2;
            this.n = Arrays.copyOf(iArr, i3);
            this.i = Arrays.copyOf(this.i, i3);
            this.h = (String[]) Arrays.copyOf(this.h, i3);
        }
        int[] iArr2 = this.n;
        int i4 = this.g;
        this.g = i4 + 1;
        iArr2[i4] = i;
    }

    public final boolean g() {
        int i = this.c;
        if (i == 0) {
            i = a();
        }
        return (i == 2 || i == 4) ? false : true;
    }

    public final int h() {
        int i = this.c;
        if (i == 0) {
            i = a();
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

    public final String toString() {
        String valueOf = String.valueOf(getClass().getSimpleName());
        String valueOf2 = String.valueOf(c());
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
