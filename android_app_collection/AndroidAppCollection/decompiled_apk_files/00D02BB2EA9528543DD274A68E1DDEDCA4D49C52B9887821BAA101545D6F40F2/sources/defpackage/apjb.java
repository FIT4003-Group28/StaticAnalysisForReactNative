package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: apjb  reason: default package */
/* loaded from: classes2.dex */
public class apjb extends acoi implements apht {
    public final aovg a;
    private final aphq b;
    private final aphq c;
    private final aphu d;
    private final acnw e;

    public apjb(apii apiiVar, apip apipVar, apjg apjgVar, aovg aovgVar, bwrs<aoyg> bwrsVar, bwrs<aoyg> bwrsVar2, bwrs<aoyg> bwrsVar3, dcdn<aoxp, bwrs<aoyg>> dcdnVar, aoyk aoykVar) {
        apja apjaVar = new apja(this);
        this.e = apjaVar;
        this.a = aovgVar;
        apid a = apjgVar.a.a();
        apjg.a(a, 1);
        apiy a2 = apjgVar.b.a();
        apjg.a(a2, 2);
        aphy a3 = apjgVar.c.a();
        apjg.a(a3, 3);
        aphj a4 = apjgVar.d.a();
        apjg.a(a4, 4);
        apjg.a(bwrsVar, 5);
        apjg.a(dcdnVar, 6);
        this.d = new apjf(a, a2, a3, a4, bwrsVar, dcdnVar);
        aoyg c = bwrsVar2.c();
        dbsk.s(c);
        this.b = apiiVar.a(bwrsVar, c.d(), cjtd.a(dtyi.ac), aoykVar);
        Resources a5 = apipVar.a.a();
        apip.a(a5, 1);
        apis a6 = apipVar.b.a();
        apip.a(a6, 2);
        cjqy a7 = apipVar.c.a();
        apip.a(a7, 3);
        aphj a8 = apipVar.d.a();
        apip.a(a8, 4);
        apip.a(bwrsVar, 5);
        apip.a(bwrsVar2, 6);
        apip.a(bwrsVar3, 7);
        apip.a(aoykVar, 8);
        this.c = new apio(a5, a6, a7, a8, bwrsVar, bwrsVar2, bwrsVar3, aoykVar);
        Y(apjaVar);
    }

    @Override // defpackage.apht
    @dzsi
    public aphq a() {
        if (((aovt) this.a).aQ == aowo.CITIES) {
            return this.b;
        }
        return null;
    }

    @Override // defpackage.apht
    @dzsi
    public aphq c() {
        if (((aovt) this.a).aQ == aowo.COUNTRIES) {
            return this.c;
        }
        return null;
    }

    @Override // defpackage.apht
    @dzsi
    public aphu d() {
        if (((aovt) this.a).aQ == aowo.RECENT) {
            return this.d;
        }
        return null;
    }
}
