package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: alp  reason: default package */
/* loaded from: classes2.dex */
public final class alp {
    static final alu a;
    static final alp b;
    static final alp c;
    private static final String e;
    private static final String f;
    public final alu d;
    private final boolean g;
    private final int h = 2;

    static {
        alu aluVar = ama.c;
        a = aluVar;
        e = Character.toString((char) 8206);
        f = Character.toString((char) 8207);
        b = new alp(false, 2, aluVar);
        c = new alp(true, 2, aluVar);
    }

    public alp(boolean z, int i, alu aluVar) {
        this.g = z;
        this.d = aluVar;
    }

    public static alp a() {
        boolean d = d(Locale.getDefault());
        alu aluVar = a;
        if (aluVar == aluVar) {
            return d ? c : b;
        }
        return new alp(d, 2, aluVar);
    }

    static boolean d(Locale locale) {
        return amb.a(locale) == 1;
    }

    private static int f(CharSequence charSequence) {
        alo aloVar = new alo(charSequence);
        aloVar.c = aloVar.b;
        int i = 0;
        int i2 = 0;
        while (aloVar.c > 0) {
            byte b2 = aloVar.b();
            if (b2 != 0) {
                if (b2 == 1 || b2 == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                        i2 = i;
                    }
                } else if (b2 != 9) {
                    switch (b2) {
                        case 14:
                        case 15:
                            if (i2 == i) {
                                return -1;
                            }
                            i--;
                            break;
                        case 16:
                        case 17:
                            if (i2 == i) {
                                return 1;
                            }
                            i--;
                            break;
                        case 18:
                            i++;
                            break;
                        default:
                            if (i2 != 0) {
                                break;
                            } else {
                                i2 = i;
                                break;
                            }
                    }
                } else {
                    continue;
                }
            } else if (i == 0) {
                return -1;
            } else {
                if (i2 == 0) {
                    i2 = i;
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0067, code lost:
        if (r3 != 0) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (r4 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
        if (r0.c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0076, code lost:
        switch(r0.b()) {
            case 14: goto L59;
            case 15: goto L59;
            case 16: goto L54;
            case 17: goto L54;
            case 18: goto L50;
            default: goto L62;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007a, code lost:
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007d, code lost:
        if (r3 != r5) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007f, code lost:
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0081, code lost:
        if (r3 != r5) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0085, code lost:
        r5 = r5 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:?, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int g(java.lang.CharSequence r9) {
        /*
            alo r0 = new alo
            r0.<init>(r9)
            r9 = 0
            r0.c = r9
            r1 = -1
            r2 = 1
            r3 = 0
            r4 = 0
            r5 = 0
        Ld:
            int r6 = r0.c
            int r7 = r0.b
            if (r6 >= r7) goto L67
            if (r3 != 0) goto L67
            java.lang.CharSequence r7 = r0.a
            char r6 = r7.charAt(r6)
            r0.d = r6
            boolean r6 = java.lang.Character.isHighSurrogate(r6)
            if (r6 == 0) goto L39
            java.lang.CharSequence r6 = r0.a
            int r7 = r0.c
            int r6 = java.lang.Character.codePointAt(r6, r7)
            int r7 = r0.c
            int r8 = java.lang.Character.charCount(r6)
            int r7 = r7 + r8
            r0.c = r7
            byte r6 = java.lang.Character.getDirectionality(r6)
            goto L44
        L39:
            int r6 = r0.c
            int r6 = r6 + r2
            r0.c = r6
            char r6 = r0.d
            byte r6 = defpackage.alo.a(r6)
        L44:
            if (r6 == 0) goto L62
            if (r6 == r2) goto L5f
            r7 = 2
            if (r6 == r7) goto L5f
            r7 = 9
            if (r6 == r7) goto Ld
            switch(r6) {
                case 14: goto L5b;
                case 15: goto L5b;
                case 16: goto L57;
                case 17: goto L57;
                case 18: goto L53;
                default: goto L52;
            }
        L52:
            goto L65
        L53:
            int r5 = r5 + (-1)
            r4 = 0
            goto Ld
        L57:
            int r5 = r5 + 1
            r4 = 1
            goto Ld
        L5b:
            int r5 = r5 + 1
            r4 = -1
            goto Ld
        L5f:
            if (r5 != 0) goto L65
            goto L7f
        L62:
            if (r5 != 0) goto L65
            goto L83
        L65:
            r3 = r5
            goto Ld
        L67:
            if (r3 != 0) goto L6a
            goto L88
        L6a:
            if (r4 == 0) goto L6e
            r9 = r4
            goto L88
        L6e:
            int r4 = r0.c
            if (r4 <= 0) goto L88
            byte r4 = r0.b()
            switch(r4) {
                case 14: goto L81;
                case 15: goto L81;
                case 16: goto L7d;
                case 17: goto L7d;
                case 18: goto L7a;
                default: goto L79;
            }
        L79:
            goto L6e
        L7a:
            int r5 = r5 + 1
            goto L6e
        L7d:
            if (r3 != r5) goto L85
        L7f:
            r9 = 1
            goto L88
        L81:
            if (r3 != r5) goto L85
        L83:
            r9 = -1
            goto L88
        L85:
            int r5 = r5 + (-1)
            goto L6e
        L88:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alp.g(java.lang.CharSequence):int");
    }

    public final String b(String str) {
        alu aluVar = this.d;
        if (str == null) {
            return null;
        }
        return e(str, aluVar).toString();
    }

    public final CharSequence c(CharSequence charSequence) {
        return e(charSequence, this.d);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.CharSequence e(java.lang.CharSequence r8, defpackage.alu r9) {
        /*
            r7 = this;
            if (r8 != 0) goto L4
            r8 = 0
            return r8
        L4:
            int r0 = r8.length()
            boolean r9 = r9.a(r8, r0)
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>()
            if (r9 == 0) goto L16
            alu r1 = defpackage.ama.b
            goto L18
        L16:
            alu r1 = defpackage.ama.a
        L18:
            int r2 = r8.length()
            boolean r1 = r1.a(r8, r2)
            boolean r2 = r7.g
            r3 = 0
            r4 = -1
            java.lang.String r5 = ""
            r6 = 1
            if (r2 != 0) goto L37
            if (r1 != 0) goto L34
            int r1 = g(r8)
            if (r1 != r6) goto L32
            goto L34
        L32:
            r1 = 0
            goto L37
        L34:
            java.lang.String r1 = defpackage.alp.e
            goto L47
        L37:
            boolean r2 = r7.g
            if (r2 == 0) goto L46
            if (r1 == 0) goto L43
            int r1 = g(r8)
            if (r1 != r4) goto L46
        L43:
            java.lang.String r1 = defpackage.alp.f
            goto L47
        L46:
            r1 = r5
        L47:
            r0.append(r1)
            boolean r1 = r7.g
            if (r9 == r1) goto L61
            if (r6 == r9) goto L53
            r1 = 8234(0x202a, float:1.1538E-41)
            goto L55
        L53:
            r1 = 8235(0x202b, float:1.154E-41)
        L55:
            r0.append(r1)
            r0.append(r8)
            r1 = 8236(0x202c, float:1.1541E-41)
            r0.append(r1)
            goto L64
        L61:
            r0.append(r8)
        L64:
            if (r9 == 0) goto L69
            alu r9 = defpackage.ama.b
            goto L6b
        L69:
            alu r9 = defpackage.ama.a
        L6b:
            int r1 = r8.length()
            boolean r9 = r9.a(r8, r1)
            boolean r1 = r7.g
            if (r1 != 0) goto L82
            if (r9 != 0) goto L7f
            int r9 = f(r8)
            if (r9 != r6) goto L83
        L7f:
            java.lang.String r5 = defpackage.alp.e
            goto L91
        L82:
            r3 = r9
        L83:
            boolean r9 = r7.g
            if (r9 == 0) goto L91
            if (r3 == 0) goto L8f
            int r8 = f(r8)
            if (r8 != r4) goto L91
        L8f:
            java.lang.String r5 = defpackage.alp.f
        L91:
            r0.append(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alp.e(java.lang.CharSequence, alu):java.lang.CharSequence");
    }
}
