package defpackage;

import java.util.Locale;
/* compiled from: PG */
/* renamed from: alj  reason: default package */
/* loaded from: classes.dex */
public final class alj {
    static final alk a;
    static final alj b;
    static final alj c;
    private static final String d;
    private static final String e;
    private final boolean f;
    private final alk g;

    static {
        alk alkVar = alq.c;
        a = alkVar;
        d = Character.toString((char) 8206);
        e = Character.toString((char) 8207);
        b = new alj(false, alkVar);
        c = new alj(true, alkVar);
    }

    public alj(boolean z, alk alkVar) {
        this.f = z;
        this.g = alkVar;
    }

    public static alj a() {
        boolean z = true;
        if (alr.a(Locale.getDefault()) != 1) {
            z = false;
        }
        return z ? c : b;
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
        switch(r0.a()) {
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
    private static int c(java.lang.CharSequence r9) {
        /*
            ali r0 = new ali
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
            byte r6 = defpackage.ali.b(r6)
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
            byte r4 = r0.a()
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alj.c(java.lang.CharSequence):int");
    }

    private static int d(CharSequence charSequence) {
        ali aliVar = new ali(charSequence);
        aliVar.c = aliVar.b;
        int i = 0;
        int i2 = 0;
        while (aliVar.c > 0) {
            byte a2 = aliVar.a();
            if (a2 != 0) {
                if (a2 == 1 || a2 == 2) {
                    if (i == 0) {
                        return 1;
                    }
                    if (i2 == 0) {
                        i2 = i;
                    }
                } else if (a2 != 9) {
                    switch (a2) {
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

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String b(java.lang.String r9) {
        /*
            r8 = this;
            alk r0 = r8.g
            if (r9 != 0) goto L7
            r9 = 0
            goto L9b
        L7:
            int r1 = r9.length()
            boolean r0 = r0.a(r9, r1)
            android.text.SpannableStringBuilder r1 = new android.text.SpannableStringBuilder
            r1.<init>()
            if (r0 == 0) goto L19
            alk r2 = defpackage.alq.b
            goto L1b
        L19:
            alk r2 = defpackage.alq.a
        L1b:
            int r3 = r9.length()
            boolean r2 = r2.a(r9, r3)
            boolean r3 = r8.f
            r4 = 0
            r5 = -1
            java.lang.String r6 = ""
            r7 = 1
            if (r3 != 0) goto L3a
            if (r2 != 0) goto L37
            int r2 = c(r9)
            if (r2 != r7) goto L35
            goto L37
        L35:
            r2 = 0
            goto L3a
        L37:
            java.lang.String r2 = defpackage.alj.d
            goto L4a
        L3a:
            boolean r3 = r8.f
            if (r3 == 0) goto L49
            if (r2 == 0) goto L46
            int r2 = c(r9)
            if (r2 != r5) goto L49
        L46:
            java.lang.String r2 = defpackage.alj.e
            goto L4a
        L49:
            r2 = r6
        L4a:
            r1.append(r2)
            boolean r2 = r8.f
            if (r0 == r2) goto L64
            if (r7 == r0) goto L56
            r2 = 8234(0x202a, float:1.1538E-41)
            goto L58
        L56:
            r2 = 8235(0x202b, float:1.154E-41)
        L58:
            r1.append(r2)
            r1.append(r9)
            r2 = 8236(0x202c, float:1.1541E-41)
            r1.append(r2)
            goto L67
        L64:
            r1.append(r9)
        L67:
            if (r0 == 0) goto L6c
            alk r0 = defpackage.alq.b
            goto L6e
        L6c:
            alk r0 = defpackage.alq.a
        L6e:
            int r2 = r9.length()
            boolean r0 = r0.a(r9, r2)
            boolean r2 = r8.f
            if (r2 != 0) goto L85
            if (r0 != 0) goto L82
            int r0 = d(r9)
            if (r0 != r7) goto L86
        L82:
            java.lang.String r6 = defpackage.alj.d
            goto L94
        L85:
            r4 = r0
        L86:
            boolean r0 = r8.f
            if (r0 == 0) goto L94
            if (r4 == 0) goto L92
            int r9 = d(r9)
            if (r9 != r5) goto L94
        L92:
            java.lang.String r6 = defpackage.alj.e
        L94:
            r1.append(r6)
            java.lang.String r9 = r1.toString()
        L9b:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alj.b(java.lang.String):java.lang.String");
    }
}
