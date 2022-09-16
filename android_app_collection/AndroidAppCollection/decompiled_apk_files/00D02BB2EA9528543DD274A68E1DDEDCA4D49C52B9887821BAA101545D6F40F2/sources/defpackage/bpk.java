package defpackage;

import com.google.android.filament.R;
import java.io.EOFException;
/* compiled from: PG */
/* renamed from: bpk  reason: default package */
/* loaded from: classes3.dex */
final class bpk extends bpj {
    private static final eajc f = eajc.b("'\\");
    private static final eajc g = eajc.b("\"\\");
    private static final eajc h = eajc.b("{}[]:, \n\t\r\f/\\;#=");
    private static final eajc i = eajc.b("\n\r");
    private static final eajc j = eajc.b("*/");
    private final eajb k;
    private final eaiz l;
    private int m = 0;
    private long n;
    private int o;
    private String p;

    public bpk(eajb eajbVar) {
        this.k = eajbVar;
        this.l = ((eajt) eajbVar).a;
        b(6);
    }

    private final void A() {
        throw c("Use JsonReader.setLenient(true) to accept malformed JSON");
    }

    private final void B() {
        long D = this.k.D(i);
        eaiz eaizVar = this.l;
        eaizVar.A(D != -1 ? D + 1 : eaizVar.b);
    }

    private final char C() {
        int i2;
        if (!this.k.e(1L)) {
            throw c("Unterminated escape sequence");
        }
        byte h2 = this.l.h();
        if (h2 == 10 || h2 == 34 || h2 == 39 || h2 == 47 || h2 == 92) {
            return (char) h2;
        }
        if (h2 == 98) {
            return '\b';
        }
        if (h2 == 102) {
            return '\f';
        }
        if (h2 == 110) {
            return '\n';
        }
        if (h2 == 114) {
            return '\r';
        }
        if (h2 == 116) {
            return '\t';
        }
        if (h2 == 117) {
            if (this.k.e(4L)) {
                char c = 0;
                for (int i3 = 0; i3 < 4; i3++) {
                    byte i4 = this.l.i(i3);
                    char c2 = (char) (c << 4);
                    if (i4 >= 48 && i4 <= 57) {
                        i2 = i4 - 48;
                    } else if (i4 >= 97 && i4 <= 102) {
                        i2 = i4 - 87;
                    } else if (i4 < 65 || i4 > 70) {
                        String q = this.l.q(4L);
                        throw c(q.length() != 0 ? "\\u".concat(q) : new String("\\u"));
                    } else {
                        i2 = i4 - 55;
                    }
                    c = (char) (c2 + i2);
                }
                this.l.A(4L);
                return c;
            }
            String valueOf = String.valueOf(q());
            throw new EOFException(valueOf.length() != 0 ? "Unterminated escape sequence at path ".concat(valueOf) : new String("Unterminated escape sequence at path "));
        }
        StringBuilder sb = new StringBuilder(27);
        sb.append("Invalid escape sequence: \\");
        sb.append((char) h2);
        throw c(sb.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01bd, code lost:
        if (t(r11) == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x01c1, code lost:
        if (r2 != 2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01c3, code lost:
        if (r7 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01c9, code lost:
        if (r5 != Long.MIN_VALUE) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x01cb, code lost:
        if (r9 == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x01cd, code lost:
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x01cf, code lost:
        r3 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x01d4, code lost:
        if (r5 != 0) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x01d6, code lost:
        if (r3 != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x01d9, code lost:
        if (r3 == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x01dc, code lost:
        r5 = -r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x01dd, code lost:
        r16.n = r5;
        r16.l.A(r4);
        r16.m = 16;
        r3 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x01ec, code lost:
        r2 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x01ed, code lost:
        if (r2 == 2) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x01f0, code lost:
        if (r2 == 4) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01f2, code lost:
        if (r2 != 7) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x01f4, code lost:
        r16.o = r4;
        r16.m = 17;
        r3 = 17;
     */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0223 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0241 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0135  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int s() {
        /*
            Method dump skipped, instructions count: 772
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpk.s():int");
    }

    private final boolean t(int i2) {
        if (i2 == 9 || i2 == 10 || i2 == 12 || i2 == 13 || i2 == 32) {
            return false;
        }
        if (i2 != 35) {
            if (i2 == 44) {
                return false;
            }
            if (i2 != 47 && i2 != 61) {
                if (i2 == 123 || i2 == 125 || i2 == 58) {
                    return false;
                }
                if (i2 != 59) {
                    switch (i2) {
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
        A();
        return false;
    }

    private final int u(String str, bph bphVar) {
        int length = bphVar.a.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(bphVar.a[i2])) {
                this.m = 0;
                this.d[this.b - 1] = str;
                return i2;
            }
        }
        return -1;
    }

    private final String v(eajc eajcVar) {
        StringBuilder sb = null;
        while (true) {
            long D = this.k.D(eajcVar);
            if (D != -1) {
                if (this.l.i(D) != 92) {
                    if (sb == null) {
                        String q = this.l.q(D);
                        this.l.h();
                        return q;
                    }
                    sb.append(this.l.q(D));
                    this.l.h();
                    return sb.toString();
                }
                if (sb == null) {
                    sb = new StringBuilder();
                }
                sb.append(this.l.q(D));
                this.l.h();
                sb.append(C());
            } else {
                throw c("Unterminated string");
            }
        }
    }

    private final String w() {
        long D = this.k.D(h);
        return D != -1 ? this.l.q(D) : this.l.p();
    }

    private final void x(eajc eajcVar) {
        while (true) {
            long D = this.k.D(eajcVar);
            if (D != -1) {
                if (this.l.i(D) == 92) {
                    this.l.A(D + 1);
                    C();
                } else {
                    this.l.A(D + 1);
                    return;
                }
            } else {
                throw c("Unterminated string");
            }
        }
    }

    private final void y() {
        long D = this.k.D(h);
        eaiz eaizVar = this.l;
        if (D == -1) {
            D = eaizVar.b;
        }
        eaizVar.A(D);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0028, code lost:
        r25.l.A(r3 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
        if (r2 != 47) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r25.k.e(2) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003e, code lost:
        return 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
        A();
        r4 = 1;
        r2 = r25.l.i(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
        if (r2 == 42) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004e, code lost:
        if (r2 == 47) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
        return 47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005f, code lost:
        r25.l.h();
        r25.l.h();
        r2 = r25.k;
        r3 = defpackage.bpk.j;
        r2 = (defpackage.eajt) r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0071, code lost:
        if (r2.c != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0073, code lost:
        r6 = 0;
        r8 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0076, code lost:
        r10 = r2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x007c, code lost:
        if (r3.h() == 0) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0080, code lost:
        if (r8 < r6) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0082, code lost:
        r11 = r10.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0084, code lost:
        if (r11 != null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0086, code lost:
        r19 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        r20 = r8;
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0090, code lost:
        r14 = r10.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0096, code lost:
        if ((r14 - r8) >= r8) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x009a, code lost:
        if (r14 <= r8) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009c, code lost:
        r11 = r11.g;
        r14 = r14 - (r11.c - r11.b);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00a8, code lost:
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00aa, code lost:
        r6 = (r11.c - r11.b) + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b3, code lost:
        if (r6 >= r8) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b5, code lost:
        r11 = r11.f;
        r14 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
        r6 = r3.g(r1);
        r7 = r3.h();
        r19 = r2;
        r1 = (r10.b - r7) + r4;
        r12 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00cb, code lost:
        if (r14 >= r1) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00cd, code lost:
        r10 = r11.a;
        r20 = r8;
        r5 = (int) java.lang.Math.min(r11.c, (r11.b + r1) - r14);
        r4 = (int) ((r11.b + r12) - r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
        if (r4 >= r5) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00e8, code lost:
        if (r10[r4] != r6) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ea, code lost:
        r8 = r4 + 1;
        r9 = r11.c;
        r12 = r11.a;
        r13 = 1;
        r22 = r1;
        r1 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f4, code lost:
        if (r13 >= r7) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f6, code lost:
        if (r8 != r9) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f8, code lost:
        r1 = r1.f;
        r2 = r1.a;
        r8 = r1.b;
        r9 = r1.c;
        r12 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0101, code lost:
        r24 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0109, code lost:
        if (r12[r8] == r3.g(r13)) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x010c, code lost:
        r8 = r8 + 1;
        r13 = r13 + 1;
        r1 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0113, code lost:
        r1 = (r4 - r11.b) + r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011a, code lost:
        r22 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011c, code lost:
        r4 = r4 + 1;
        r1 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
        r12 = r14 + (r11.c - r11.b);
        r11 = r11.f;
        r14 = r12;
        r8 = r20;
        r1 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0137, code lost:
        if (r1 == (-1)) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013a, code lost:
        r2 = r19;
        r1 = r2.a;
        r6 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x014a, code lost:
        if (r2.b.Te(r1, 8192) != (-1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x014c, code lost:
        r1 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014d, code lost:
        r3 = r25.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0151, code lost:
        if (r1 == (-1)) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0153, code lost:
        r6 = defpackage.bpk.j.h() + r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x015c, code lost:
        r6 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015e, code lost:
        r3.A(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0163, code lost:
        if (r1 == (-1)) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016d, code lost:
        throw c("Unterminated comment");
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016e, code lost:
        r4 = 1;
        r8 = java.lang.Math.max(r20, (r6 - r3.h()) + 1);
        r1 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0189, code lost:
        throw new java.lang.IllegalArgumentException("fromIndex < 0");
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0191, code lost:
        throw new java.lang.IllegalArgumentException("bytes is empty");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0199, code lost:
        throw new java.lang.IllegalStateException("closed");
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x019c, code lost:
        if (r2 != 35) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x019e, code lost:
        A();
        B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01a6, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int z(boolean r26) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpk.z(boolean):int");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m = 0;
        this.c[0] = 8;
        this.b = 1;
        this.l.z();
        this.k.close();
    }

    @Override // defpackage.bpj
    public final void d() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 3) {
            b(1);
            this.e[this.b - 1] = 0;
            this.m = 0;
            return;
        }
        String a = bpi.a(r());
        String q = q();
        StringBuilder sb = new StringBuilder(a.length() + 38 + String.valueOf(q).length());
        sb.append("Expected BEGIN_ARRAY but was ");
        sb.append(a);
        sb.append(" at path ");
        sb.append(q);
        throw new bpf(sb.toString());
    }

    @Override // defpackage.bpj
    public final void e() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 4) {
            int i3 = this.b - 1;
            this.b = i3;
            int[] iArr = this.e;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.m = 0;
            return;
        }
        String a = bpi.a(r());
        String q = q();
        StringBuilder sb = new StringBuilder(a.length() + 36 + String.valueOf(q).length());
        sb.append("Expected END_ARRAY but was ");
        sb.append(a);
        sb.append(" at path ");
        sb.append(q);
        throw new bpf(sb.toString());
    }

    @Override // defpackage.bpj
    public final void f() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 1) {
            b(3);
            this.m = 0;
            return;
        }
        String a = bpi.a(r());
        String q = q();
        StringBuilder sb = new StringBuilder(a.length() + 39 + String.valueOf(q).length());
        sb.append("Expected BEGIN_OBJECT but was ");
        sb.append(a);
        sb.append(" at path ");
        sb.append(q);
        throw new bpf(sb.toString());
    }

    @Override // defpackage.bpj
    public final void g() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 2) {
            int i3 = this.b - 1;
            this.b = i3;
            this.d[i3] = null;
            int[] iArr = this.e;
            int i4 = i3 - 1;
            iArr[i4] = iArr[i4] + 1;
            this.m = 0;
            return;
        }
        String a = bpi.a(r());
        String q = q();
        StringBuilder sb = new StringBuilder(a.length() + 37 + String.valueOf(q).length());
        sb.append("Expected END_OBJECT but was ");
        sb.append(a);
        sb.append(" at path ");
        sb.append(q);
        throw new bpf(sb.toString());
    }

    @Override // defpackage.bpj
    public final boolean h() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        return (i2 == 2 || i2 == 4 || i2 == 18) ? false : true;
    }

    @Override // defpackage.bpj
    public final String i() {
        String str;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 14) {
            str = w();
        } else if (i2 == 13) {
            str = v(g);
        } else if (i2 == 12) {
            str = v(f);
        } else if (i2 != 15) {
            String a = bpi.a(r());
            String q = q();
            StringBuilder sb = new StringBuilder(a.length() + 33 + String.valueOf(q).length());
            sb.append("Expected a name but was ");
            sb.append(a);
            sb.append(" at path ");
            sb.append(q);
            throw new bpf(sb.toString());
        } else {
            str = this.p;
        }
        this.m = 0;
        this.d[this.b - 1] = str;
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b8 A[EDGE_INSN: B:81:0x00b8->B:58:0x00b8 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.bpj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int j(defpackage.bph r21) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bpk.j(bph):int");
    }

    @Override // defpackage.bpj
    public final void k() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 14) {
            y();
        } else if (i2 == 13) {
            x(g);
        } else if (i2 == 12) {
            x(f);
        } else if (i2 != 15) {
            String a = bpi.a(r());
            String q = q();
            StringBuilder sb = new StringBuilder(a.length() + 33 + String.valueOf(q).length());
            sb.append("Expected a name but was ");
            sb.append(a);
            sb.append(" at path ");
            sb.append(q);
            throw new bpf(sb.toString());
        }
        this.m = 0;
        this.d[this.b - 1] = "null";
    }

    @Override // defpackage.bpj
    public final String l() {
        String q;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 10) {
            q = w();
        } else if (i2 == 9) {
            q = v(g);
        } else if (i2 == 8) {
            q = v(f);
        } else if (i2 == 11) {
            q = this.p;
            this.p = null;
        } else if (i2 == 16) {
            q = Long.toString(this.n);
        } else if (i2 == 17) {
            q = this.l.q(this.o);
        } else {
            String a = bpi.a(r());
            String q2 = q();
            StringBuilder sb = new StringBuilder(a.length() + 35 + String.valueOf(q2).length());
            sb.append("Expected a string but was ");
            sb.append(a);
            sb.append(" at path ");
            sb.append(q2);
            throw new bpf(sb.toString());
        }
        this.m = 0;
        int[] iArr = this.e;
        int i3 = this.b - 1;
        iArr[i3] = iArr[i3] + 1;
        return q;
    }

    @Override // defpackage.bpj
    public final boolean m() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 5) {
            this.m = 0;
            int[] iArr = this.e;
            int i3 = this.b - 1;
            iArr[i3] = iArr[i3] + 1;
            return true;
        } else if (i2 == 6) {
            this.m = 0;
            int[] iArr2 = this.e;
            int i4 = this.b - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return false;
        } else {
            String a = bpi.a(r());
            String q = q();
            StringBuilder sb = new StringBuilder(a.length() + 36 + String.valueOf(q).length());
            sb.append("Expected a boolean but was ");
            sb.append(a);
            sb.append(" at path ");
            sb.append(q);
            throw new bpf(sb.toString());
        }
    }

    @Override // defpackage.bpj
    public final double n() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 16) {
            this.m = 0;
            int[] iArr = this.e;
            int i3 = this.b - 1;
            iArr[i3] = iArr[i3] + 1;
            return this.n;
        }
        if (i2 == 17) {
            this.p = this.l.q(this.o);
        } else if (i2 == 9) {
            this.p = v(g);
        } else if (i2 == 8) {
            this.p = v(f);
        } else if (i2 == 10) {
            this.p = w();
        } else if (i2 != 11) {
            String a = bpi.a(r());
            String q = q();
            StringBuilder sb = new StringBuilder(a.length() + 35 + String.valueOf(q).length());
            sb.append("Expected a double but was ");
            sb.append(a);
            sb.append(" at path ");
            sb.append(q);
            throw new bpf(sb.toString());
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            if (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble)) {
                String q2 = q();
                StringBuilder sb2 = new StringBuilder(String.valueOf(q2).length() + 66);
                sb2.append("JSON forbids NaN and infinities: ");
                sb2.append(parseDouble);
                sb2.append(" at path ");
                sb2.append(q2);
                throw new bpg(sb2.toString());
            }
            this.p = null;
            this.m = 0;
            int[] iArr2 = this.e;
            int i4 = this.b - 1;
            iArr2[i4] = iArr2[i4] + 1;
            return parseDouble;
        } catch (NumberFormatException unused) {
            String str = this.p;
            String q3 = q();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 35 + String.valueOf(q3).length());
            sb3.append("Expected a double but was ");
            sb3.append(str);
            sb3.append(" at path ");
            sb3.append(q3);
            throw new bpf(sb3.toString());
        }
    }

    @Override // defpackage.bpj
    public final int o() {
        String v;
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        if (i2 == 16) {
            long j2 = this.n;
            int i3 = (int) j2;
            if (j2 == i3) {
                this.m = 0;
                int[] iArr = this.e;
                int i4 = this.b - 1;
                iArr[i4] = iArr[i4] + 1;
                return i3;
            }
            String q = q();
            StringBuilder sb = new StringBuilder(String.valueOf(q).length() + 53);
            sb.append("Expected an int but was ");
            sb.append(j2);
            sb.append(" at path ");
            sb.append(q);
            throw new bpf(sb.toString());
        }
        if (i2 == 17) {
            this.p = this.l.q(this.o);
        } else {
            if (i2 == 9) {
                v = v(g);
            } else if (i2 == 8) {
                v = v(f);
            } else if (i2 != 11) {
                String a = bpi.a(r());
                String q2 = q();
                StringBuilder sb2 = new StringBuilder(a.length() + 33 + String.valueOf(q2).length());
                sb2.append("Expected an int but was ");
                sb2.append(a);
                sb2.append(" at path ");
                sb2.append(q2);
                throw new bpf(sb2.toString());
            }
            this.p = v;
            try {
                int parseInt = Integer.parseInt(v);
                this.m = 0;
                int[] iArr2 = this.e;
                int i5 = this.b - 1;
                iArr2[i5] = iArr2[i5] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.m = 11;
        try {
            double parseDouble = Double.parseDouble(this.p);
            int i6 = (int) parseDouble;
            if (i6 == parseDouble) {
                this.p = null;
                this.m = 0;
                int[] iArr3 = this.e;
                int i7 = this.b - 1;
                iArr3[i7] = iArr3[i7] + 1;
                return i6;
            }
            String str = this.p;
            String q3 = q();
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 33 + String.valueOf(q3).length());
            sb3.append("Expected an int but was ");
            sb3.append(str);
            sb3.append(" at path ");
            sb3.append(q3);
            throw new bpf(sb3.toString());
        } catch (NumberFormatException unused2) {
            String str2 = this.p;
            String q4 = q();
            StringBuilder sb4 = new StringBuilder(String.valueOf(str2).length() + 33 + String.valueOf(q4).length());
            sb4.append("Expected an int but was ");
            sb4.append(str2);
            sb4.append(" at path ");
            sb4.append(q4);
            throw new bpf(sb4.toString());
        }
    }

    @Override // defpackage.bpj
    public final void p() {
        int i2 = 0;
        do {
            int i3 = this.m;
            if (i3 == 0) {
                i3 = s();
            }
            if (i3 == 3) {
                b(1);
            } else if (i3 != 1) {
                if (i3 == 4) {
                    i2--;
                    if (i2 >= 0) {
                        this.b--;
                    } else {
                        String a = bpi.a(r());
                        String q = q();
                        StringBuilder sb = new StringBuilder(a.length() + 34 + String.valueOf(q).length());
                        sb.append("Expected a value but was ");
                        sb.append(a);
                        sb.append(" at path ");
                        sb.append(q);
                        throw new bpf(sb.toString());
                    }
                } else if (i3 == 2) {
                    i2--;
                    if (i2 >= 0) {
                        this.b--;
                    } else {
                        String a2 = bpi.a(r());
                        String q2 = q();
                        StringBuilder sb2 = new StringBuilder(a2.length() + 34 + String.valueOf(q2).length());
                        sb2.append("Expected a value but was ");
                        sb2.append(a2);
                        sb2.append(" at path ");
                        sb2.append(q2);
                        throw new bpf(sb2.toString());
                    }
                } else if (i3 == 14 || i3 == 10) {
                    y();
                } else if (i3 == 9 || i3 == 13) {
                    x(g);
                } else if (i3 == 8 || i3 == 12) {
                    x(f);
                } else if (i3 == 17) {
                    this.l.A(this.o);
                } else if (i3 == 18) {
                    String a3 = bpi.a(r());
                    String q3 = q();
                    StringBuilder sb3 = new StringBuilder(a3.length() + 34 + String.valueOf(q3).length());
                    sb3.append("Expected a value but was ");
                    sb3.append(a3);
                    sb3.append(" at path ");
                    sb3.append(q3);
                    throw new bpf(sb3.toString());
                }
                this.m = 0;
            } else {
                b(3);
            }
            i2++;
            this.m = 0;
        } while (i2 != 0);
        int[] iArr = this.e;
        int i4 = this.b - 1;
        iArr[i4] = iArr[i4] + 1;
        this.d[i4] = "null";
    }

    @Override // defpackage.bpj
    public final int r() {
        int i2 = this.m;
        if (i2 == 0) {
            i2 = s();
        }
        switch (i2) {
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
            case 15:
                return 5;
            case 16:
            case 17:
                return 7;
            default:
                return 10;
        }
    }

    public final String toString() {
        String valueOf = String.valueOf(this.k);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("JsonReader(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
