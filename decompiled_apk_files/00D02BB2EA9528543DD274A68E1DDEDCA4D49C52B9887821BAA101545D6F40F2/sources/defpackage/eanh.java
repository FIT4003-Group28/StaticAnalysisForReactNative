package defpackage;

import java.io.IOException;
import java.io.Reader;
/* compiled from: PG */
/* renamed from: eanh  reason: default package */
/* loaded from: classes6.dex */
public final class eanh extends eand {
    protected Reader A;
    protected char[] B;
    protected final eanv C;
    protected boolean D;

    public eanh(eanm eanmVar, int i, Reader reader, eanv eanvVar) {
        super(eanmVar, i);
        this.D = false;
        this.A = reader;
        if (eanmVar.g != null) {
            throw new IllegalStateException("Trying to call allocTokenBuffer() second time");
        }
        eanmVar.g = eanmVar.d.c(eaoc.TOKEN_BUFFER);
        this.B = eanmVar.g;
        this.C = eanvVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.String S(int r5, int r6, int r7) {
        /*
            r4 = this;
            eaoj r0 = r4.n
            char[] r1 = r4.B
            int r2 = r4.e
            int r2 = r2 - r5
            r0.a(r1, r5, r2)
            eaoj r5 = r4.n
            char[] r5 = r5.i()
            eaoj r0 = r4.n
            int r0 = r0.i
        L14:
            int r1 = r4.e
            int r2 = r4.f
            if (r1 < r2) goto L3a
            boolean r1 = r4.o()
            if (r1 != 0) goto L3a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ": was expecting closing '"
            r1.append(r2)
            char r2 = (char) r7
            r1.append(r2)
            java.lang.String r2 = "' for name"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r4.D(r1)
        L3a:
            char[] r1 = r4.B
            int r2 = r4.e
            int r3 = r2 + 1
            r4.e = r3
            char r1 = r1[r2]
            r2 = 92
            if (r1 > r2) goto L73
            if (r1 != r2) goto L4f
            char r2 = r4.P()
            goto L74
        L4f:
            if (r1 > r7) goto L73
            if (r1 != r7) goto L6a
            eaoj r5 = r4.n
            r5.i = r0
            char[] r7 = r5.f()
            int r0 = r5.e()
            int r5 = r5.d()
            eanv r1 = r4.C
            java.lang.String r5 = r1.c(r7, r0, r5, r6)
            return r5
        L6a:
            r2 = 32
            if (r1 >= r2) goto L73
            java.lang.String r2 = "name"
            r4.G(r1, r2)
        L73:
            r2 = r1
        L74:
            int r6 = r6 * 31
            int r6 = r6 + r1
            int r1 = r0 + 1
            r5[r0] = r2
            int r0 = r5.length
            if (r1 < r0) goto L86
            eaoj r5 = r4.n
            char[] r5 = r5.k()
            r0 = 0
            goto L14
        L86:
            r0 = r1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanh.S(int, int, int):java.lang.String");
    }

    private final int T() {
        while (true) {
            if (this.e < this.f || o()) {
                char[] cArr = this.B;
                int i = this.e;
                this.e = i + 1;
                char c = cArr[i];
                if (c > ' ') {
                    if (c != '/') {
                        return c;
                    }
                    U();
                } else if (c != ' ') {
                    if (c == '\n') {
                        O();
                    } else if (c == '\r') {
                        N();
                    } else if (c != '\t') {
                        F(c);
                    }
                }
            } else {
                throw l("Unexpected end-of-input within/between " + this.l.c() + " entries");
            }
        }
    }

    private final void U() {
        if (!a(eamv.ALLOW_COMMENTS)) {
            C(47, "maybe a (non-standard) comment? (not recognized as one since Feature 'ALLOW_COMMENTS' not enabled for parser)");
        }
        if (this.e >= this.f && !o()) {
            D(" in a comment");
        }
        char[] cArr = this.B;
        int i = this.e;
        this.e = i + 1;
        char c = cArr[i];
        if (c != '/') {
            if (c == '*') {
                while (true) {
                    if (this.e >= this.f && !o()) {
                        break;
                    }
                    char[] cArr2 = this.B;
                    int i2 = this.e;
                    int i3 = i2 + 1;
                    this.e = i3;
                    char c2 = cArr2[i2];
                    if (c2 <= '*') {
                        if (c2 == '*') {
                            if (i3 >= this.f && !o()) {
                                break;
                            }
                            char[] cArr3 = this.B;
                            int i4 = this.e;
                            if (cArr3[i4] == '/') {
                                this.e = i4 + 1;
                                return;
                            }
                        } else if (c2 < ' ') {
                            if (c2 == '\n') {
                                O();
                            } else if (c2 == '\r') {
                                N();
                            } else if (c2 != '\t') {
                                F(c2);
                            }
                        }
                    }
                }
                D(" in a comment");
                return;
            }
            C(c, "was expecting either '*' or '/' for a comment");
            return;
        }
        while (true) {
            if (this.e >= this.f && !o()) {
                return;
            }
            char[] cArr4 = this.B;
            int i5 = this.e;
            this.e = i5 + 1;
            char c3 = cArr4[i5];
            if (c3 < ' ') {
                if (c3 == '\n') {
                    O();
                    return;
                } else if (c3 == '\r') {
                    N();
                    return;
                } else if (c3 != '\t') {
                    F(c3);
                }
            }
        }
    }

    protected final char L(String str) {
        if (this.e >= this.f && !o()) {
            D(str);
        }
        char[] cArr = this.B;
        int i = this.e;
        this.e = i + 1;
        return cArr[i];
    }

    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    protected final defpackage.eamz M(
    /*  JADX ERROR: JadxRuntimeException in pass: InitCodeVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [int, char], vars: [r10v0 ??, r10v1 ??, r10v5 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:57)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:45)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r10v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:227)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:222)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:167)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:366)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:306)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:272)
        	at java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
        	at java.util.ArrayList.forEach(ArrayList.java:1259)
        	at java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.util.stream.Sink$ChainedReference.end(Sink.java:258)
        */

    protected final void N() {
        if (this.e < this.f || o()) {
            char[] cArr = this.B;
            int i = this.e;
            if (cArr[i] == '\n') {
                this.e = i + 1;
            }
        }
        this.h++;
        this.i = this.e;
    }

    protected final void O() {
        this.h++;
        this.i = this.e;
    }

    protected final char P() {
        if (this.e >= this.f && !o()) {
            D(" in character escape sequence");
        }
        char[] cArr = this.B;
        int i = this.e;
        this.e = i + 1;
        char c = cArr[i];
        if (c == '\"' || c == '/' || c == '\\') {
            return c;
        }
        if (c == 'b') {
            return '\b';
        }
        if (c == 'f') {
            return '\f';
        }
        if (c == 'n') {
            return '\n';
        }
        if (c == 'r') {
            return '\r';
        }
        if (c == 't') {
            return '\t';
        }
        if (c != 'u') {
            J(c);
            return c;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < 4; i3++) {
            if (this.e >= this.f && !o()) {
                D(" in character escape sequence");
            }
            char[] cArr2 = this.B;
            int i4 = this.e;
            this.e = i4 + 1;
            char c2 = cArr2[i4];
            int a = eaoe.a(c2);
            if (a < 0) {
                C(c2, "expected a hex-digit for character escape sequence");
            }
            i2 = (i2 << 4) | a;
        }
        return (char) i2;
    }

    protected final void Q(String str, int i) {
        int i2;
        char c;
        int length = str.length();
        do {
            if (this.e >= this.f && !o()) {
                E();
            }
            if (this.B[this.e] != str.charAt(i)) {
                R(str.substring(0, i));
            }
            i2 = this.e + 1;
            this.e = i2;
            i++;
        } while (i < length);
        if ((i2 < this.f || o()) && (c = this.B[this.e]) >= '0' && c != ']' && c != '}' && Character.isJavaIdentifierPart(c)) {
            this.e++;
            R(str.substring(0, i));
        }
    }

    protected final void R(String str) {
        StringBuilder sb = new StringBuilder(str);
        while (true) {
            if (this.e >= this.f && !o()) {
                break;
            }
            char c = this.B[this.e];
            if (!Character.isJavaIdentifierPart(c)) {
                break;
            }
            this.e++;
            sb.append(c);
        }
        throw l("Unrecognized token '" + sb.toString() + "': was expecting ");
    }

    /* JADX WARN: Removed duplicated region for block: B:279:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0489  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:329:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x053c  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:350:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x059b  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x05a4  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:366:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:372:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x05df A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:388:0x0611  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:436:0x023c A[SYNTHETIC] */
    @Override // defpackage.eane, defpackage.eamw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.eamz b() {
        /*
            Method dump skipped, instructions count: 1654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eanh.b():eamz");
    }

    @Override // defpackage.eand, defpackage.eamw, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        eanv eanvVar;
        super.close();
        eanv eanvVar2 = this.C;
        if (eanvVar2.j && (eanvVar = eanvVar2.b) != null) {
            eanvVar.b(eanvVar2);
            eanvVar2.j = false;
        }
    }

    @Override // defpackage.eane, defpackage.eamw
    public final String e() {
        eamz eamzVar = this.b;
        if (eamzVar != eamz.VALUE_STRING) {
            if (eamzVar == null) {
                return null;
            }
            int ordinal = eamzVar.ordinal();
            if (ordinal == 5) {
                return this.l.f;
            }
            return (ordinal == 7 || ordinal == 8 || ordinal == 9) ? this.n.g() : eamzVar.n;
        }
        if (this.D) {
            this.D = false;
            int i = this.e;
            int i2 = this.f;
            if (i < i2) {
                int[] iArr = eaoe.b;
                int length = iArr.length;
                while (true) {
                    char[] cArr = this.B;
                    char c = cArr[i];
                    if (c >= 256 || iArr[c] == 0) {
                        i++;
                        if (i >= i2) {
                            break;
                        }
                    } else if (c == '\"') {
                        eaoj eaojVar = this.n;
                        int i3 = this.e;
                        eaojVar.a(cArr, i3, i - i3);
                        this.e = i + 1;
                    }
                }
            }
            eaoj eaojVar2 = this.n;
            char[] cArr2 = this.B;
            int i4 = this.e;
            int i5 = i - i4;
            eaojVar2.c = null;
            eaojVar2.d = -1;
            eaojVar2.e = 0;
            eaojVar2.j = null;
            eaojVar2.k = null;
            if (eaojVar2.f) {
                eaojVar2.c();
            } else if (eaojVar2.h == null) {
                eaojVar2.h = eaojVar2.b(i5);
            }
            eaojVar2.g = 0;
            eaojVar2.i = 0;
            if (eaojVar2.d >= 0) {
                eaojVar2.m(i5);
            }
            eaojVar2.j = null;
            eaojVar2.k = null;
            char[] cArr3 = eaojVar2.h;
            int length2 = cArr3.length;
            int i6 = eaojVar2.i;
            int i7 = length2 - i6;
            if (i7 >= i5) {
                System.arraycopy(cArr2, i4, cArr3, i6, i5);
                eaojVar2.i += i5;
            } else {
                if (i7 > 0) {
                    System.arraycopy(cArr2, i4, cArr3, i6, i7);
                    i4 += i7;
                    i5 -= i7;
                }
                eaojVar2.n(i5);
                System.arraycopy(cArr2, i4, eaojVar2.h, 0, i5);
                eaojVar2.i = i5;
            }
            this.e = i;
            char[] i8 = this.n.i();
            int i9 = this.n.i;
            while (true) {
                if (this.e >= this.f && !o()) {
                    D(": was expecting closing quote for a string value");
                }
                char[] cArr4 = this.B;
                int i10 = this.e;
                this.e = i10 + 1;
                char c2 = cArr4[i10];
                if (c2 <= '\\') {
                    if (c2 == '\\') {
                        c2 = P();
                    } else if (c2 <= '\"') {
                        if (c2 == '\"') {
                            break;
                        } else if (c2 < ' ') {
                            G(c2, "string value");
                        }
                    }
                }
                if (i9 >= i8.length) {
                    i8 = this.n.k();
                    i9 = 0;
                }
                i8[i9] = c2;
                i9++;
            }
            this.n.i = i9;
        }
        return this.n.g();
    }

    @Override // defpackage.eand
    protected final boolean o() {
        long j = this.g;
        int i = this.f;
        this.g = j + i;
        this.i -= i;
        Reader reader = this.A;
        if (reader != null) {
            char[] cArr = this.B;
            int read = reader.read(cArr, 0, cArr.length);
            if (read > 0) {
                this.e = 0;
                this.f = read;
                return true;
            }
            p();
            if (read == 0) {
                throw new IOException("Reader returned 0 characters when trying to read " + this.f);
            }
        }
        return false;
    }

    @Override // defpackage.eand
    protected final void p() {
        if (this.A != null) {
            if (this.c.c || a(eamv.AUTO_CLOSE_SOURCE)) {
                this.A.close();
            }
            this.A = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.eand
    public final void q() {
        super.q();
        char[] cArr = this.B;
        if (cArr != null) {
            this.B = null;
            eanm eanmVar = this.c;
            if (cArr == eanmVar.g) {
                eanmVar.g = null;
                eanmVar.d.e(eaoc.TOKEN_BUFFER, cArr);
                return;
            }
            throw new IllegalArgumentException("Trying to release buffer not owned by the context");
        }
    }
}
