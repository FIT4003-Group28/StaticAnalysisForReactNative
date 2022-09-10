package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: cdog  reason: default package */
/* loaded from: classes4.dex */
public final class cdog extends a {
    public static final /* synthetic */ int i = 0;
    private static final eapy j = eapy.a(earp.W());
    public final z<ilo> d;
    public final z<eapy> e;
    final v<eapy> f;
    public final v<Boolean> g;
    public final v<String> h;

    public cdog(final Application application, ad adVar) {
        super(application);
        z<ilo> zVar = new z<>();
        this.d = zVar;
        this.g = am.a(zVar, cdob.a);
        z<eapy> b = adVar.b("pickedVisitDate", j);
        this.e = b;
        final x xVar = new x();
        xVar.m(am.a(zVar, cdoc.a), new aa(xVar) { // from class: cdod
            private final x a;

            {
                this.a = xVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.g((eapy) obj);
            }
        });
        xVar.m(b, new aa(xVar) { // from class: cdoe
            private final x a;

            {
                this.a = xVar;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                this.a.g((eapy) obj);
            }
        });
        this.f = xVar;
        this.h = am.a(xVar, new ahp(application) { // from class: cdof
            private final Application a;

            {
                this.a = application;
            }

            @Override // defpackage.ahp
            public final Object a(Object obj) {
                Application application2 = this.a;
                int i2 = cdog.i;
                return bqsq.b(application2.getResources(), (eapy) obj);
            }
        });
    }

    public static Boolean d(ilo iloVar) {
        return Boolean.valueOf(iloVar.bo().j);
    }

    public static eapy e(ilo iloVar) {
        return bqsq.d(iloVar.bq(), iloVar.bs(), j);
    }

    public final dbsg<dmce> c() {
        Boolean h = this.g.h();
        dbsk.s(h);
        if (!h.booleanValue()) {
            return dbpy.a;
        }
        eapy h2 = this.f.h();
        dbsk.s(h2);
        dmcd bZ = dmce.d.bZ();
        drft bZ2 = drfu.c.bZ();
        dpoi bZ3 = dpoj.e.bZ();
        int l = h2.l();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dpoj dpojVar = (dpoj) bZ3.b;
        dpojVar.a |= 1;
        dpojVar.b = l;
        int m = h2.m();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dpoj dpojVar2 = (dpoj) bZ3.b;
        dpojVar2.a |= 2;
        dpojVar2.c = m;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        drfu drfuVar = (drfu) bZ2.b;
        dpoj bK = bZ3.bK();
        bK.getClass();
        drfuVar.b = bK;
        drfuVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmce dmceVar = (dmce) bZ.b;
        drfu bK2 = bZ2.bK();
        bK2.getClass();
        dmceVar.b = bK2;
        dmceVar.a |= 1;
        return dbsg.i(bZ.bK());
    }
}
