package defpackage;
/* compiled from: PG */
/* renamed from: dcuh  reason: default package */
/* loaded from: classes.dex */
public abstract class dcuh extends dcuf {
    private static final String a;

    /* JADX WARN: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r0.matches("\\n|\\r(?:\\n)?") == false) goto L4;
     */
    static {
        /*
            java.lang.String r0 = "line.separator"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> Le
            java.lang.String r1 = "\\n|\\r(?:\\n)?"
            boolean r1 = r0.matches(r1)     // Catch: java.lang.SecurityException -> Le
            if (r1 != 0) goto L10
        Le:
            java.lang.String r0 = "\n"
        L10:
            defpackage.dcuh.a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcuh.<clinit>():void");
    }

    static int d(String str, int i) {
        while (i < str.length()) {
            int i2 = i + 1;
            if (str.charAt(i) != '%') {
                i = i2;
            } else if (i2 >= str.length()) {
                throw dcug.c("trailing unquoted '%' character", str, i2 - 1);
            } else {
                char charAt = str.charAt(i2);
                if (charAt != '%' && charAt != 'n') {
                    return i2 - 1;
                }
                i = i2 + 1;
            }
        }
        return -1;
    }

    public abstract int a(dcue<?> dcueVar, int i, String str, int i2, int i3, int i4);

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a4, code lost:
        r4 = d(r7, a(r14, r12, r7, r4, r5, r6));
        r0 = r11;
        r1 = r12;
     */
    @Override // defpackage.dcuf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final <T> void b(defpackage.dcue<T> r14) {
        /*
            r13 = this;
            java.lang.String r7 = r14.d()
            r8 = 0
            int r0 = d(r7, r8)
            r9 = -1
            r4 = r0
            r0 = 0
            r1 = -1
        Ld:
            if (r4 < 0) goto Lc1
            int r2 = r4 + 1
            r3 = r2
            r5 = 0
        L13:
            int r6 = r7.length()
            java.lang.String r10 = "unterminated parameter"
            if (r3 >= r6) goto Lbc
            int r6 = r3 + 1
            char r3 = r7.charAt(r3)
            int r11 = r3 + (-48)
            char r11 = (char) r11
            r12 = 10
            if (r11 >= r12) goto L39
            int r5 = r5 * 10
            int r5 = r5 + r11
            r3 = 1000000(0xf4240, float:1.401298E-39)
            if (r5 >= r3) goto L32
            r3 = r6
            goto L13
        L32:
            java.lang.String r14 = "index too large"
            dcug r14 = defpackage.dcug.a(r14, r7, r4, r6)
            throw r14
        L39:
            r11 = 36
            if (r3 != r11) goto L6c
            int r1 = r6 + (-1)
            int r1 = r1 - r2
            if (r1 == 0) goto L65
            char r1 = r7.charAt(r2)
            r2 = 48
            if (r1 == r2) goto L5e
            int r5 = r5 + (-1)
            int r1 = r7.length()
            if (r6 == r1) goto L59
            int r1 = r6 + 1
            r11 = r0
            r12 = r5
            r5 = r6
            r6 = r1
            goto L90
        L59:
            dcug r14 = defpackage.dcug.c(r10, r7, r4)
            throw r14
        L5e:
            java.lang.String r14 = "index has leading zero"
            dcug r14 = defpackage.dcug.a(r14, r7, r4, r6)
            throw r14
        L65:
            java.lang.String r14 = "missing index"
            dcug r14 = defpackage.dcug.a(r14, r7, r4, r6)
            throw r14
        L6c:
            r5 = 60
            if (r3 != r5) goto L8b
            if (r1 == r9) goto L84
            int r2 = r7.length()
            if (r6 == r2) goto L7f
            int r2 = r6 + 1
            r11 = r0
            r12 = r1
            r5 = r6
            r6 = r2
            goto L90
        L7f:
            dcug r14 = defpackage.dcug.c(r10, r7, r4)
            throw r14
        L84:
            java.lang.String r14 = "invalid relative parameter"
            dcug r14 = defpackage.dcug.a(r14, r7, r4, r6)
            throw r14
        L8b:
            int r1 = r0 + 1
            r12 = r0
            r11 = r1
            r5 = r2
        L90:
            int r6 = r6 + r9
        L91:
            int r0 = r7.length()
            if (r6 >= r0) goto Lb7
            char r0 = r7.charAt(r6)
            r0 = r0 & (-33)
            int r0 = r0 + (-65)
            char r0 = (char) r0
            r1 = 26
            if (r0 >= r1) goto Lb4
            r0 = r13
            r1 = r14
            r2 = r12
            r3 = r7
            int r0 = r0.a(r1, r2, r3, r4, r5, r6)
            int r4 = d(r7, r0)
            r0 = r11
            r1 = r12
            goto Ld
        Lb4:
            int r6 = r6 + 1
            goto L91
        Lb7:
            dcug r14 = defpackage.dcug.c(r10, r7, r4)
            throw r14
        Lbc:
            dcug r14 = defpackage.dcug.c(r10, r7, r4)
            throw r14
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dcuh.b(dcue):void");
    }

    @Override // defpackage.dcuf
    public final void c(StringBuilder sb, String str, int i, int i2) {
        int i3 = i;
        while (i < i2) {
            int i4 = i + 1;
            if (str.charAt(i) == '%') {
                if (i4 == i2) {
                    break;
                }
                char charAt = str.charAt(i4);
                if (charAt == '%') {
                    sb.append((CharSequence) str, i3, i4);
                } else if (charAt == 'n') {
                    sb.append((CharSequence) str, i3, i4 - 1);
                    sb.append(a);
                }
                i3 = i4 + 1;
                i = i3;
            }
            i = i4;
        }
        if (i3 < i2) {
            sb.append((CharSequence) str, i3, i2);
        }
    }
}
