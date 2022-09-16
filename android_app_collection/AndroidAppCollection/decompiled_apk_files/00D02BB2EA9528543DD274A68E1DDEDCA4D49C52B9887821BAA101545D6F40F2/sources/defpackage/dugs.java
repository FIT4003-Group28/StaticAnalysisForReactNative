package defpackage;
/* compiled from: PG */
/* renamed from: dugs  reason: default package */
/* loaded from: classes6.dex */
final class dugs {
    private static final dbrz a = dbrz.e("");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static dcdn<String, dugr> a(CharSequence charSequence) {
        dcdg p = dcdn.p();
        int length = charSequence.length();
        int i = 0;
        while (i < length) {
            i += b(dchl.h(), charSequence, i, p);
        }
        return p.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int b(java.util.List<java.lang.CharSequence> r16, java.lang.CharSequence r17, int r18, defpackage.dcdg<java.lang.String, defpackage.dugr> r19) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            int r4 = r17.length()
            r5 = 0
            r6 = r2
            r7 = 0
        Lf:
            r8 = 58
            r9 = 38
            r10 = 33
            r11 = 63
            r12 = 44
            if (r6 >= r4) goto L2d
            char r7 = r1.charAt(r6)
            if (r7 == r9) goto L2d
            if (r7 == r11) goto L2d
            if (r7 == r10) goto L2d
            if (r7 == r8) goto L2d
            if (r7 != r12) goto L2a
            goto L2d
        L2a:
            int r6 = r6 + 1
            goto Lf
        L2d:
            java.lang.CharSequence r13 = r1.subSequence(r2, r6)
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>(r13)
            java.lang.StringBuilder r13 = r14.reverse()
            r0.add(r5, r13)
            if (r7 == r10) goto L47
            if (r7 == r11) goto L47
            if (r7 == r8) goto L47
            if (r7 != r12) goto L85
            r7 = 44
        L47:
            dbrz r8 = defpackage.dugs.a
            java.lang.String r8 = r8.g(r0)
            int r10 = r8.length()
            if (r10 <= 0) goto L85
            dugr[] r10 = defpackage.dugr.values()
            int r13 = r10.length
            r14 = 0
        L59:
            if (r14 >= r13) goto L6e
            r15 = r10[r14]
            char r5 = r15.c
            if (r5 == r7) goto L6a
            char r5 = r15.d
            if (r5 != r7) goto L66
            goto L6a
        L66:
            int r14 = r14 + 1
            r5 = 0
            goto L59
        L6a:
            r3.f(r8, r15)
            goto L85
        L6e:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r9)
            java.lang.String r2 = "No enum corresponding to given code: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L85:
            int r6 = r6 + 1
            if (r7 == r11) goto La0
            if (r7 == r12) goto La0
        L8b:
            if (r6 >= r4) goto La0
            int r5 = b(r0, r1, r6, r3)
            int r6 = r6 + r5
            char r5 = r1.charAt(r6)
            if (r5 == r11) goto L9e
            char r5 = r1.charAt(r6)
            if (r5 != r12) goto L8b
        L9e:
            int r6 = r6 + 1
        La0:
            r1 = 0
            r0.remove(r1)
            int r6 = r6 - r2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dugs.b(java.util.List, java.lang.CharSequence, int, dcdg):int");
    }
}
