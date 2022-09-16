package defpackage;
/* compiled from: PG */
/* renamed from: caxi  reason: default package */
/* loaded from: classes4.dex */
public final class caxi extends dzvy implements dzut<dztc> {
    final /* synthetic */ azfj a;

    public caxi(azfj azfjVar) {
        this.a = azfjVar;
    }

    @Override // defpackage.dzut
    public final /* bridge */ /* synthetic */ dztc a() {
        azfj azfjVar = this.a;
        azgh azghVar = azfjVar.a;
        deig deigVar = azfjVar.b;
        baad baadVar = azfjVar.c;
        axwn axwnVar = azfjVar.d;
        Runnable c = axwnVar.c();
        if (c != null) {
            c.run();
        }
        axzi a = azghVar.h.a();
        int e = axwnVar.e();
        if (!baadVar.x() && baadVar.D()) {
            cjst d = cjsu.d();
            d.d(ddda.eW);
            cjry e2 = cjrz.e();
            e2.b(ddcu.ad);
            ddzf bZ = ddzg.t.bZ();
            ddzh a2 = axzi.a(baadVar);
            ddzm bZ2 = ddzo.c.bZ();
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            ddzo ddzoVar = (ddzo) bZ2.b;
            int i = e - 1;
            if (e == 0) {
                throw null;
            }
            ddzoVar.b = i;
            ddzoVar.a |= 1;
            if (a2.c) {
                a2.bF();
                a2.c = false;
            }
            ddzp ddzpVar = (ddzp) a2.b;
            ddzo bK = bZ2.bK();
            ddzp ddzpVar2 = ddzp.i;
            bK.getClass();
            ddzpVar.g = bK;
            ddzpVar.a |= 32;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ddzg ddzgVar = (ddzg) bZ.b;
            ddzp bK2 = a2.bK();
            bK2.getClass();
            ddzgVar.h = bK2;
            ddzgVar.a |= 268435456;
            ((cjrn) e2).a = bZ.bK();
            d.f(e2.a());
            a.b.l(d.e());
        }
        deigVar.p(azghVar.f.a().l(baadVar, baac.PUBLISHED));
        return dztc.a;
    }
}
