package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: wzz  reason: default package */
/* loaded from: classes4.dex */
public final class wzz {
    public static aphd a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            apgz apgzVar = (apgz) it.next();
            if (apgzVar != null && apgzVar.b == 49483894) {
                return (aphd) apgzVar.c;
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0040, code lost:
        if (r0 == 0) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0063, code lost:
        if (r2 == 0) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.wwl b(android.content.Context r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, defpackage.wwi r20, defpackage.snc r21, defpackage.afvn r22, defpackage.aacz r23) {
        /*
            r0 = 0
            if (r23 == 0) goto L12
            apej r1 = r23.a()
            apej r2 = defpackage.apej.a
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L10
            goto L12
        L10:
            r3 = r1
            goto L13
        L12:
            r3 = r0
        L13:
            r0 = 0
            r1 = 1
            if (r3 == 0) goto L1e
            int r2 = r3.b
            r2 = r2 & r1
            if (r2 == 0) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            if (r3 == 0) goto L28
            boolean r4 = r3.e
            if (r4 == 0) goto L26
            goto L28
        L26:
            r4 = 0
            goto L29
        L28:
            r4 = 1
        L29:
            if (r3 == 0) goto L31
            boolean r5 = r3.f
            if (r5 == 0) goto L31
            r5 = 1
            goto L32
        L31:
            r5 = 0
        L32:
            if (r3 == 0) goto L42
            apek r0 = r3.j
            if (r0 != 0) goto L3a
            apek r0 = defpackage.apek.a
        L3a:
            int r0 = r0.b
            int r0 = defpackage.apfb.c(r0)
            if (r0 != 0) goto L43
        L42:
            r0 = 1
        L43:
            if (r21 != 0) goto L55
            r6 = r0
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            wwo r0 = d(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        L55:
            if (r2 == 0) goto L65
            apei r2 = r3.c
            if (r2 != 0) goto L5d
            apei r2 = defpackage.apei.a
        L5d:
            int r2 = r2.b
            int r2 = defpackage.apfb.d(r2)
            if (r2 != 0) goto L66
        L65:
            r2 = 1
        L66:
            int r2 = r2 + (-1)
            if (r2 == r1) goto L99
            r1 = 2
            if (r2 == r1) goto L83
            long r6 = defpackage.wwk.a
            r8 = r0
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r20
            r14 = r21
            r15 = r22
            wwr r0 = e(r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        L83:
            long r6 = r3.d
            r8 = r0
            r9 = r16
            r10 = r17
            r11 = r18
            r12 = r19
            r13 = r20
            r14 = r21
            r15 = r22
            wwr r0 = e(r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        L99:
            r6 = r0
            r7 = r16
            r8 = r17
            r9 = r18
            r10 = r19
            r11 = r20
            wwo r0 = d(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wzz.b(android.content.Context, java.lang.String, java.lang.String, java.lang.String, wwi, snc, afvn, aacz):wwl");
    }

    public static void c(war warVar, int i) {
        warVar.r(i, null, null);
    }

    private static final wwo d(apej apejVar, boolean z, boolean z2, int i, Context context, String str, String str2, String str3, wwi wwiVar) {
        return new wwo(context, str, apejVar, str2, str3, wwiVar, z, z2, i);
    }

    private static final wwr e(apej apejVar, boolean z, boolean z2, long j, int i, Context context, String str, String str2, String str3, wwi wwiVar, snc sncVar, afvn afvnVar) {
        return new wwr(context, str, apejVar, str2, str3, wwiVar, sncVar, j, afvnVar, z, z2, i);
    }
}
