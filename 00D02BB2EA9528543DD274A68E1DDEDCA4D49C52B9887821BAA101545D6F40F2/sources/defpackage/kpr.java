package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: kpr  reason: default package */
/* loaded from: classes7.dex */
public final class kpr extends afke {
    private static final dcdc<duqi> a = dcdc.k(duqi.SEARCH, duqi.DIRECTIONS_DEFAULT, duqi.DIRECTIONS_NAVIGATION, duqi.DIRECTIONS_TRIP_DETAILS, duqi.PLACE_DETAILS_BASIC, duqi.PLACE_DETAILS_FULL);
    private final Application b;
    private final bvjj c;
    private final anhk d;
    private final btvo e;
    private final dxio<bvsf> f;
    private final akox g;
    private final dxio<aehr> h;
    private final dxio<aeht> i;
    private final vxo j;

    public kpr(Application application, bvjj bvjjVar, anhk anhkVar, btvo btvoVar, dxio dxioVar, akox akoxVar, dxio dxioVar2, dxio dxioVar3, vxo vxoVar, bunm bunmVar) {
        super(bunmVar, a);
        dbsk.s(application);
        this.b = application;
        dbsk.s(bvjjVar);
        this.c = bvjjVar;
        dbsk.s(anhkVar);
        this.d = anhkVar;
        dbsk.s(btvoVar);
        this.e = btvoVar;
        this.f = dxioVar;
        dbsk.s(akoxVar);
        this.g = akoxVar;
        this.h = dxioVar2;
        dbsk.s(dxioVar3);
        this.i = dxioVar3;
        dbsk.s(vxoVar);
        this.j = vxoVar;
    }

    @Override // defpackage.afke
    protected final void a(duqm duqmVar) {
        dwim bZ = dwir.R.bZ();
        dhjx aa = this.g.aa();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwir dwirVar = (dwir) bZ.b;
        aa.getClass();
        dwirVar.d = aa;
        dwirVar.a |= 2;
        dwir bK = bZ.bK();
        if (duqmVar.c) {
            duqmVar.bF();
            duqmVar.c = false;
        }
        duqn duqnVar = (duqn) duqmVar.b;
        dsrg<Integer, duqi> dsrgVar = duqn.d;
        bK.getClass();
        duqnVar.f = bK;
        duqnVar.a |= 2;
        dwao c = new vxa(this.e, this.f, btsp.c(this.c), btsp.c(this.j), null, null, null, dbpy.a, dbpy.a, dbpy.a, dbpy.a, dbpy.a, null).c(dqvj.DRIVE, 3, vul.NAVIGATION_ONLY);
        vum vumVar = new vum();
        vumVar.g = bvsl.a(this.c);
        vumVar.p = true;
        vumVar.a = c;
        vumVar.e = this.g.aa();
        vumVar.o = cjsb.c(ddda.c);
        dwaw a2 = vnw.a(vumVar.a(), null, null, null, null);
        if (duqmVar.c) {
            duqmVar.bF();
            duqmVar.c = false;
        }
        duqn duqnVar2 = (duqn) duqmVar.b;
        a2.getClass();
        duqnVar2.g = a2;
        duqnVar2.a |= 4;
        Application application = this.b;
        akox akoxVar = this.g;
        dvzj dvzjVar = (dvzj) bgej.b(application, akoxVar, akoxVar.aa(), this.d.a(), false, this.e, this.h.a(), this.i.a(), false, null, null, null).bK();
        if (duqmVar.c) {
            duqmVar.bF();
            duqmVar.c = false;
        }
        duqn duqnVar3 = (duqn) duqmVar.b;
        dvzjVar.getClass();
        duqnVar3.h = dvzjVar;
        duqnVar3.a |= 8;
    }
}
