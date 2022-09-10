package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dyb  reason: default package */
/* loaded from: classes6.dex */
public final class dyb {
    private final dcha<dfmf, dfmg> A;
    private dcdc<dfmg> B;
    public boolean c;
    public boolean d;
    @dzsi
    public String e;
    @dzsi
    public String f;
    public boolean g;
    public boolean h;
    @dzsi
    public String i;
    @dzsi
    public String j;
    @dzsi
    public dxp k;
    public boolean l;
    @dzsi
    dad m;
    private final m n;
    private final Resources o;
    private final befw p;
    private final dag q;
    private final Executor r;
    @dzsi
    private dsza t;
    @dzsi
    private dpmf u;
    @dzsi
    private dfmh w;
    @dzsi
    private dxr x;
    private dxr z;
    public final z<dyf> a = new z<>();
    private final List<akqi> s = new ArrayList();
    public final HashMap<akqi, String> b = new HashMap<>();
    private final List<dfmh> v = new ArrayList();
    private dsza y = dsza.e;

    public dyb(Resources resources, final befw befwVar, dag dagVar, Executor executor, m mVar, final czt cztVar, final czh czhVar) {
        dxq m = dxr.m();
        ((dyg) m).a = akqi.a;
        this.z = m.a();
        this.A = dbyv.N();
        this.B = dcdc.e();
        this.n = mVar;
        this.o = resources;
        this.p = befwVar;
        this.q = dagVar;
        this.r = executor;
        k Nh = mVar.Nh();
        final aa aaVar = new aa(this) { // from class: dxs
            private final dyb a;

            {
                this.a = this;
            }

            @Override // defpackage.aa
            public final void m(Object obj) {
                dyb dybVar = this.a;
                dad dadVar = (dad) obj;
                if (dadVar == null) {
                    return;
                }
                dybVar.b(dadVar);
            }
        };
        Nh.a(new e(cztVar, czhVar, befwVar, aaVar) { // from class: com.google.android.apps.gmm.ar.venue.ArVenueRegionController$LifecycleObserverImpl
            private final czt a;
            private final czh b;
            private final befw c;
            private final aa<dad> d;
            @dzsi
            private czv e;

            {
                this.a = cztVar;
                this.b = czhVar;
                this.c = befwVar;
                this.d = aaVar;
            }

            @Override // defpackage.f
            public final void a(m mVar2) {
            }

            @Override // defpackage.f
            public final void b(m mVar2) {
                dbsk.l(this.e == null);
                czv a = this.a.a(this.b, czs.NONE);
                this.e = a;
                a.a().b(mVar2, this.d);
                this.c.a();
            }

            @Override // defpackage.f
            public final void c(m mVar2) {
            }

            @Override // defpackage.f
            public final void d(m mVar2) {
            }

            @Override // defpackage.f
            public final void e(m mVar2) {
                this.c.b();
                czv czvVar = this.e;
                dbsk.s(czvVar);
                czvVar.a().d(this.d);
                czvVar.c();
                this.e = null;
            }

            @Override // defpackage.f
            public final void f(m mVar2) {
            }
        });
    }

    private final void d(akqi akqiVar, bvqg<ilo> bvqgVar) {
        befu p = befv.p();
        ily ilyVar = new ily();
        ilyVar.j(akqiVar);
        p.j(bwrs.a(ilyVar.d()));
        this.p.f(new dya(bvqgVar), p.m());
    }

    private static boolean e(@dzsi akqi akqiVar, @dzsi akqi akqiVar2) {
        if (akqiVar == null && akqiVar2 == null) {
            return true;
        }
        return akqiVar != null && akqiVar.equals(akqiVar2);
    }

    /* JADX WARN: Removed duplicated region for block: B:166:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 1260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyb.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(defpackage.dad r15) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyb.b(dad):void");
    }

    public final void c(ilo iloVar) {
        if (this.t != null) {
            return;
        }
        if (iloVar.aj() == null) {
            this.t = null;
            return;
        }
        double d = iloVar.aj().a;
        double d2 = iloVar.aj().b;
        dpmf dpmfVar = iloVar.h().bq;
        if (dpmfVar == null) {
            dpmfVar = dpmf.b;
        }
        this.u = dpmfVar;
        dsyz bZ = dsza.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsza dszaVar = (dsza) bZ.b;
        int i = dszaVar.a | 1;
        dszaVar.a = i;
        dszaVar.b = d;
        dszaVar.a = i | 2;
        dszaVar.c = d2;
        this.t = bZ.bK();
        dcdc<altv> bA = iloVar.bA();
        int size = bA.size();
        for (int i2 = 0; i2 < size; i2++) {
            akqi b = akqi.b(bA.get(i2).a.o());
            this.s.add(b);
            d(b, new bvqg(this) { // from class: dxy
                private final dyb a;

                {
                    this.a = this;
                }

                @Override // defpackage.bvqg
                public final void NU(Object obj) {
                    dyb dybVar = this.a;
                    ilo iloVar2 = (ilo) obj;
                    dybVar.b.put(iloVar2.ai(), iloVar2.n());
                    dybVar.a();
                }
            });
        }
    }
}
