package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alge  reason: default package */
/* loaded from: classes2.dex */
public final class alge implements amrl {
    private final float[] a;
    private final amkz b;
    private final amsa c;
    private final boolean d;
    private final amri e;
    private final algb f;
    private final dbsg<vtu> g;

    public alge(boolean z, algb algbVar, List<akrk> list, alfx alfxVar, dbsg<vtu> dbsgVar) {
        this.a = new float[8];
        this.b = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
        this.c = new amsa();
        this.d = z;
        this.f = algbVar;
        this.g = dbsgVar;
        amrr amrrVar = new amrr(algbVar.c, list, 10.0f, 0.3f);
        amsd amsdVar = new amsd();
        amsdVar.c(new amrz());
        amsdVar.c(new amry());
        amsdVar.c(new amrq());
        amsdVar.c(new amrm());
        amsdVar.c(alfxVar);
        amsdVar.b(0, new amrx(), 0.5f);
        amsdVar.b(85, amrrVar, 0.99f);
        amsdVar.e(10, new amrp());
        amsdVar.e(5, new amro());
        this.e = amsdVar.a();
    }

    public static alge b(algb algbVar, List<akrk> list, alfx alfxVar, dbsg<vtu> dbsgVar) {
        return new alge(false, algbVar, list, alfxVar, dbsgVar);
    }

    private final boolean c(akzh akzhVar) {
        Float f = this.f.d;
        return f != null && f.floatValue() - akzhVar.p().k >= 2.0f;
    }

    private final boolean d(amrk amrkVar, aktc aktcVar, akra akraVar, dmlo dmloVar, amrj amrjVar) {
        if (!akyx.o(amrkVar.e, akraVar, this.a)) {
            return false;
        }
        amkz amkzVar = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
        amsa amsaVar = this.c;
        akzh akzhVar = amrkVar.e;
        alne alneVar = amrkVar.h;
        if (!amsaVar.c(akzhVar, aktcVar, akraVar, dmloVar, amkzVar)) {
            return false;
        }
        amrkVar.f.a(amrkVar.a, amkzVar);
        if (this.d) {
            amrh amrhVar = amrkVar.f;
            amrhVar.c.add(this.f.c);
        }
        amrjVar.a(akraVar);
        amrjVar.b = dmloVar;
        this.f.d = Float.valueOf(amrkVar.e.p().k);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (d(r19, r18, r4, r5, r20) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0039, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0087, code lost:
        if (d(r19, r18, r4, r5, r20) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00ce, code lost:
        if (d(r19, r18, r5, r6, r20) != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e9, code lost:
        if (d(r19, r18, r5, r6, r20) != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    @Override // defpackage.amrl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(defpackage.aktc r18, defpackage.amrk r19, defpackage.amrj r20) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alge.a(aktc, amrk, amrj):boolean");
    }

    public alge(algb algbVar, List<akrk> list, alfx alfxVar, dbsg<vtu> dbsgVar) {
        this.a = new float[8];
        this.b = new amkz(0.0f, 0.0f, 0.0f, 0.0f);
        this.c = new amsa();
        this.d = true;
        this.f = algbVar;
        this.g = dbsgVar;
        amrr amrrVar = new amrr(algbVar.c, list, 10.0f, 0.3f);
        amsd amsdVar = new amsd();
        amsdVar.c(new amrz());
        amsdVar.c(new amry());
        amsdVar.c(new amrq());
        amsdVar.c(new amrm());
        amsdVar.c(alfxVar);
        amsdVar.b(0, new amrx(), 0.5f);
        amsdVar.b(40, amrrVar, 0.9f);
        amsdVar.e(50, new amrp());
        amsdVar.e(10, new amro());
        this.e = amsdVar.a();
    }
}
