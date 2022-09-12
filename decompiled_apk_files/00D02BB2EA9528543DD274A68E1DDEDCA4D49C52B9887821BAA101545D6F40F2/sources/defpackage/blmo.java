package defpackage;

import android.app.Activity;
import java.util.List;
/* compiled from: PG */
/* renamed from: blmo  reason: default package */
/* loaded from: classes3.dex */
public class blmo implements jay {
    public final gga a;
    public final dxio<bkpi> b;
    public final cpv c;
    public final cjqq d;
    public final cjqy e;
    public final cebr f;
    public final cdjd g;
    public final dbsg<jbe> h;
    public final bwrs<ilo> i;
    @dzsi
    private final String j;
    private final boolean k;
    private final boolean l;
    private int m;

    public blmo(cdjd cdjdVar, boolean z, @dzsi String str, dbsg<jbe> dbsgVar, bwrs<ilo> bwrsVar, gga ggaVar, dxio<bkpi> dxioVar, cpv cpvVar, cjqq cjqqVar, cjqy cjqyVar, cebr cebrVar) {
        this.a = ggaVar;
        this.b = dxioVar;
        this.g = cdjdVar;
        this.j = str;
        this.h = dbsgVar;
        this.c = cpvVar;
        this.d = cjqqVar;
        this.e = cjqyVar;
        this.f = cebrVar;
        this.i = bwrsVar;
        boolean z2 = true;
        this.k = !((String) cdjdVar.b().d().h(blmk.a).c("")).isEmpty();
        this.l = (!cdjdVar.d().a() || cdjdVar.d().b().a().a().isEmpty() || ((String) cdjdVar.d().b().c().h(blml.a).c("")).isEmpty()) ? false : z2;
    }

    private static jho d(Activity activity, int i, @dzsi cjtd cjtdVar, @dzsi String str) {
        jhm jhmVar = new jhm();
        jhmVar.l = i;
        jhmVar.a = activity.getString(i);
        if (cjtdVar != null) {
            jhmVar.f = cjtdVar;
        }
        if (str != null) {
            jhmVar.b = str;
        }
        return jhmVar.c();
    }

    @Override // defpackage.jay
    public List a() {
        return dcdc.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c9  */
    @Override // defpackage.jay
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.jht b() {
        /*
            r8 = this;
            jhu r0 = defpackage.jhv.h()
            cdjd r1 = r8.g
            cdjb r1 = r1.a()
            dbsg r1 = r1.b()
            boolean r2 = r1.a()
            if (r2 == 0) goto L66
            java.lang.String r2 = r8.j
            boolean r2 = defpackage.dbsj.d(r2)
            if (r2 != 0) goto L66
            java.lang.Object r1 = r1.b()
            cdis r1 = (defpackage.cdis) r1
            dbsg r1 = r1.a()
            java.lang.String r2 = ""
            java.lang.Object r1 = r1.c(r2)
            java.lang.String r1 = (java.lang.String) r1
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L66
            int r2 = r8.m
            r3 = 1
            r4 = 0
            r5 = 2
            if (r2 <= 0) goto L54
            gga r6 = r8.a
            r7 = 3
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r7[r4] = r2
            java.lang.String r2 = r8.j
            r7[r3] = r2
            r7[r5] = r1
            r1 = 2131951777(0x7f1300a1, float:1.9539978E38)
            java.lang.String r1 = r6.getString(r1, r7)
            goto L6f
        L54:
            gga r2 = r8.a
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r6 = r8.j
            r5[r4] = r6
            r5[r3] = r1
            r1 = 2131951776(0x7f1300a0, float:1.9539976E38)
            java.lang.String r1 = r2.getString(r1, r5)
            goto L6f
        L66:
            gga r1 = r8.a
            r2 = 2131951775(0x7f13009f, float:1.9539974E38)
            java.lang.String r1 = r1.getString(r2)
        L6f:
            r2 = r0
            jhi r2 = (defpackage.jhi) r2
            r2.e = r1
            r1 = 2131231566(0x7f08034e, float:1.8079217E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2.c = r1
            blmm r1 = new blmm
            r1.<init>(r8)
            r2.a = r1
            java.util.ArrayList r1 = defpackage.dchl.a()
            dbsg<jbe> r3 = r8.h
            boolean r3 = r3.a()
            if (r3 == 0) goto Lb4
            gga r3 = r8.a
            r4 = 2131957590(0x7f131756, float:1.9551768E38)
            dbsg<jbe> r5 = r8.h
            java.lang.Object r5 = r5.b()
            jbe r5 = (defpackage.jbe) r5
            cjtd r5 = r5.d()
            dbsg<jbe> r6 = r8.h
            java.lang.Object r6 = r6.b()
            jbe r6 = (defpackage.jbe) r6
            java.lang.String r6 = r6.e()
            jho r3 = d(r3, r4, r5, r6)
            r1.add(r3)
        Lb4:
            boolean r3 = r8.k
            r4 = 0
            if (r3 == 0) goto Lc5
            gga r3 = r8.a
            r5 = 2131956913(0x7f1314b1, float:1.9550395E38)
            jho r3 = d(r3, r5, r4, r4)
            r1.add(r3)
        Lc5:
            boolean r3 = r8.l
            if (r3 == 0) goto Ld5
            gga r3 = r8.a
            r5 = 2131956946(0x7f1314d2, float:1.9550462E38)
            jho r3 = d(r3, r5, r4, r4)
            r1.add(r3)
        Ld5:
            r0.e(r1)
            blmn r1 = new blmn
            r1.<init>(r8)
            r2.b = r1
            jhv r0 = r0.b()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.blmo.b():jht");
    }

    @Override // defpackage.jay
    public void c(int i) {
        this.m = i;
    }
}
