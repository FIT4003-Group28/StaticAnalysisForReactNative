package defpackage;

import android.net.Uri;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: agqf  reason: default package */
/* loaded from: classes.dex */
public final class agqf {
    public final String a;
    public final String b;
    public final agqa c;
    public final Uri d;
    public final aalc e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final Date j;
    public final arag k;
    public final atrp l;
    public final String m;
    public final arhs n;

    public agqf(agqf agqfVar, int i) {
        this(agqfVar.a, agqfVar.b, agqfVar.c, agqfVar.d, agqfVar.e, i, agqfVar.h, agqfVar.i, agqfVar.j, agqfVar.l, agqfVar.m, agqfVar.n);
    }

    public static agqf b(int i, String str, String str2, arhs arhsVar) {
        return new agqf("PPSV", str, null, null, new aalc(avhn.a), i, false, false, new Date(Long.MAX_VALUE), null, str2, arhsVar);
    }

    public static agqf c(atrp atrpVar, boolean z, int i, aalc aalcVar, agqa agqaVar) {
        arag aragVar;
        String str = atrpVar.c;
        String str2 = atrpVar.g;
        Uri parse = atrpVar.h.isEmpty() ? null : Uri.parse(atrpVar.h);
        int i2 = (int) atrpVar.m;
        boolean z2 = atrpVar.k;
        Date date = new Date(TimeUnit.SECONDS.toMillis(atrpVar.i));
        if ((atrpVar.b & 256) != 0) {
            arag aragVar2 = atrpVar.l;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
            aragVar = aragVar2;
        } else {
            aragVar = null;
        }
        return new agqf(str, str2, agqaVar, parse, aalcVar, i, i2, z, z2, date, aragVar, atrpVar, null, null);
    }

    public final Uri a() {
        if (!this.e.a.isEmpty()) {
            return this.e.c(480).a();
        }
        return null;
    }

    public agqf(String str, String str2, agqa agqaVar, Uri uri, aalc aalcVar, int i, int i2, boolean z, boolean z2, Date date, arag aragVar, atrp atrpVar, String str3, arhs arhsVar) {
        arag aragVar2;
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = agqaVar;
        this.d = uri;
        this.e = aalcVar;
        this.f = i;
        this.h = z;
        this.i = z2;
        this.j = date;
        this.l = atrpVar;
        this.m = str3;
        this.n = arhsVar;
        if (aragVar != null) {
            this.k = aragVar;
        } else {
            if (atrpVar == null || (atrpVar.b & 256) == 0) {
                aragVar2 = null;
            } else {
                aragVar2 = atrpVar.l;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            }
            this.k = aragVar2;
        }
        this.g = i2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public agqf(java.lang.String r16, java.lang.String r17, defpackage.agqa r18, android.net.Uri r19, defpackage.aalc r20, int r21, boolean r22, boolean r23, java.util.Date r24, defpackage.atrp r25, java.lang.String r26, defpackage.arhs r27) {
        /*
            r15 = this;
            r12 = r25
            if (r12 == 0) goto Lf
            int r0 = r12.b
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto Lf
            long r0 = r12.m
            int r1 = (int) r0
            r7 = r1
            goto L11
        Lf:
            r7 = r21
        L11:
            r0 = 0
            if (r12 == 0) goto L20
            int r1 = r12.b
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L20
            arag r0 = r12.l
            if (r0 != 0) goto L20
            arag r0 = defpackage.arag.a
        L20:
            r11 = r0
            r0 = r15
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r20
            r6 = r21
            r8 = r22
            r9 = r23
            r10 = r24
            r12 = r25
            r13 = r26
            r14 = r27
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agqf.<init>(java.lang.String, java.lang.String, agqa, android.net.Uri, aalc, int, boolean, boolean, java.util.Date, atrp, java.lang.String, arhs):void");
    }
}
