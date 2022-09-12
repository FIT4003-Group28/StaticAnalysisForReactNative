package defpackage;

import java.io.File;
import java.util.regex.Pattern;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cmmm  reason: default package */
/* loaded from: classes5.dex */
public final class cmmm extends cmly {
    private static final Pattern g = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v1\\.exo$", 32);
    private static final Pattern h = Pattern.compile("^(.+)\\.(\\d+)\\.(\\d+)\\.v2\\.exo$", 32);
    private static final Pattern i = Pattern.compile("^(\\d+)\\.(\\d+)\\.(\\d+)\\.v3\\.exo$", 32);

    public cmmm(String str, long j, long j2, long j3, File file) {
        super(str, j, j2, j3, file);
    }

    public static File c(File file, int i2, long j, long j2) {
        StringBuilder sb = new StringBuilder(60);
        sb.append(i2);
        sb.append(".");
        sb.append(j);
        sb.append(".");
        sb.append(j2);
        sb.append(".v3.exo");
        return new File(file, sb.toString());
    }

    public static cmmm d(String str, long j, long j2) {
        return new cmmm(str, j, j2, -9223372036854775807L, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0074, code lost:
        if (r16.renameTo(r1) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.cmmm e(java.io.File r16, long r17, long r19, defpackage.cmmd r21) {
        /*
            r0 = r21
            java.lang.String r1 = r16.getName()
            java.lang.String r2 = ".v3.exo"
            boolean r2 = r1.endsWith(r2)
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 != 0) goto L81
            java.lang.String r1 = r16.getName()
            java.util.regex.Pattern r2 = defpackage.cmmm.h
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r7 = r2.matches()
            if (r7 == 0) goto L2e
            java.lang.String r1 = r2.group(r5)
            defpackage.cmmn.f(r1)
            java.lang.String r1 = defpackage.cmny.R(r1)
            goto L43
        L2e:
            java.util.regex.Pattern r2 = defpackage.cmmm.g
            java.util.regex.Matcher r2 = r2.matcher(r1)
            boolean r1 = r2.matches()
            if (r1 == 0) goto L42
            java.lang.String r1 = r2.group(r5)
            defpackage.cmmn.f(r1)
            goto L43
        L42:
            r1 = r6
        L43:
            if (r1 != 0) goto L47
        L45:
            r1 = r6
            goto L77
        L47:
            java.io.File r7 = r16.getParentFile()
            defpackage.cmmn.e(r7)
            cmma r1 = r0.b(r1)
            int r8 = r1.a
            java.lang.String r1 = r2.group(r4)
            defpackage.cmmn.f(r1)
            long r9 = java.lang.Long.parseLong(r1)
            java.lang.String r1 = r2.group(r3)
            defpackage.cmmn.f(r1)
            long r11 = java.lang.Long.parseLong(r1)
            java.io.File r1 = c(r7, r8, r9, r11)
            r2 = r16
            boolean r2 = r2.renameTo(r1)
            if (r2 != 0) goto L77
            goto L45
        L77:
            if (r1 != 0) goto L7a
            return r6
        L7a:
            java.lang.String r2 = r1.getName()
            r15 = r1
            r1 = r2
            goto L84
        L81:
            r2 = r16
            r15 = r2
        L84:
            java.util.regex.Pattern r2 = defpackage.cmmm.i
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 != 0) goto L91
            return r6
        L91:
            java.lang.String r2 = r1.group(r5)
            defpackage.cmmn.f(r2)
            int r2 = java.lang.Integer.parseInt(r2)
            android.util.SparseArray<java.lang.String> r0 = r0.b
            java.lang.Object r0 = r0.get(r2)
            r8 = r0
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto La8
            return r6
        La8:
            r9 = -1
            int r0 = (r17 > r9 ? 1 : (r17 == r9 ? 0 : -1))
            if (r0 != 0) goto Lb4
            long r9 = r15.length()
            r11 = r9
            goto Lb6
        Lb4:
            r11 = r17
        Lb6:
            r9 = 0
            int r0 = (r11 > r9 ? 1 : (r11 == r9 ? 0 : -1))
            if (r0 != 0) goto Lbd
            return r6
        Lbd:
            java.lang.String r0 = r1.group(r4)
            defpackage.cmmn.f(r0)
            long r9 = java.lang.Long.parseLong(r0)
            java.lang.String r0 = r1.group(r3)
            defpackage.cmmn.f(r0)
            long r13 = java.lang.Long.parseLong(r0)
            cmmm r0 = new cmmm
            r7 = r0
            r7.<init>(r8, r9, r11, r13, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmmm.e(java.io.File, long, long, cmmd):cmmm");
    }
}
