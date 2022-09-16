package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bcby  reason: default package */
/* loaded from: classes3.dex */
public class bcby implements bcbv, bbup {
    @dzsi
    protected final ilo a;
    protected final dcdn<dspd, bbuq> c;
    protected final cjtd d;
    protected final boolean e;
    protected final int f;
    protected final bcli g;
    protected final bcku h;
    protected final bckr i;
    protected final Activity j;
    protected final buti k;
    protected final bcmm l;
    protected final deig<dcdc<dweu>> m = deig.d();
    protected dcdc<dweu> n;
    protected dcdc<bclt> o;

    public bcby(@dzsi ilo iloVar, dcdn<dspd, bbuq> dcdnVar, cjtd cjtdVar, boolean z, int i, bcli bcliVar, bcku bckuVar, bckr bckrVar, Activity activity, buti butiVar, bcmm bcmmVar, bhhf bhhfVar, afxw afxwVar) {
        this.a = iloVar;
        this.d = cjtdVar;
        this.e = z;
        this.f = i;
        this.g = bcliVar;
        this.h = bckuVar;
        this.i = bckrVar;
        this.j = activity;
        this.k = butiVar;
        this.l = bcmmVar;
        dcdg p = dcdn.p();
        bbuq bbuqVar = dcdnVar.get(b);
        if (bbuqVar == null) {
            boolean a = bhhfVar.a(iloVar);
            cknk cknkVar = cknk.ENABLED;
            boolean o = bhhfVar.o();
            dcdc<drbz> a2 = afxwVar.a();
            cknm.a(cknkVar, 7);
            cknm.a(a2, 10);
            bbuqVar = new cknl(iloVar, a, z, i, cknkVar, o, a2);
        }
        p.f(b, bbuqVar);
        dcpd<dspd> it = dcdnVar.keySet().iterator();
        while (it.hasNext()) {
            dspd next = it.next();
            if (!next.equals(bcbv.b)) {
                bbuq bbuqVar2 = dcdnVar.get(next);
                dbsk.s(bbuqVar2);
                p.f(next, bbuqVar2);
            }
        }
        this.c = p.b();
    }

    @Override // defpackage.bcbv
    public final dehn<dcdc<dweu>> a() {
        cknl cknlVar = (cknl) this.c.get(bcbv.b);
        dbuh.d(cknlVar);
        cknlVar.r(this);
        cknlVar.h(this.k);
        return this.m;
    }

    @Override // defpackage.bbup
    public final void c() {
    }

    @Override // defpackage.bcbv
    public final dcdc<bclt> d() {
        dcdc<bclt> dcdcVar = this.o;
        return dcdcVar == null ? dcdc.e() : dcdcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final dcdc<dweu> e(dcdc<dweu> dcdcVar) {
        if (dcdcVar.isEmpty() || (dcdcVar.size() == 1 && dcdcVar.get(0).j)) {
            ilo iloVar = this.a;
            dwfl dwflVar = null;
            if (iloVar != null) {
                if (iloVar.bF().a.size() > 0) {
                    dwflVar = iloVar.bF().a.get(0);
                } else {
                    List<dwfl> aE = iloVar.aE();
                    if (aE.isEmpty() || (aE.get(0).a & 128) == 0) {
                        if ((iloVar.bJ().a & 128) != 0) {
                            dwflVar = iloVar.bJ();
                        }
                    } else {
                        dwflVar = aE.get(0);
                    }
                }
            }
            dwel bZ = dweo.d.bZ();
            if (dwflVar != null) {
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dweo dweoVar = (dweo) bZ.b;
                dwflVar.getClass();
                dweoVar.b = dwflVar;
                dweoVar.a |= 1;
            }
            dccx F = dcdc.F();
            dwek bZ2 = dweu.m.bZ();
            dspd dspdVar = bcbv.b;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dweu dweuVar = (dweu) bZ2.b;
            dspdVar.getClass();
            dweuVar.a = 1 | dweuVar.a;
            dweuVar.d = dspdVar;
            dweo bK = bZ.bK();
            bK.getClass();
            dweuVar.c = bK;
            dweuVar.b = 5;
            String string = this.j.getString(R.string.GALLERY_OVERVIEW_TITLE);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dweu dweuVar2 = (dweu) bZ2.b;
            string.getClass();
            dweuVar2.a |= 8;
            dweuVar2.g = string;
            String string2 = this.j.getString(R.string.GALLERY_COLLECTIONS_DEFAULT_GALLERY_TITLE);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dweu dweuVar3 = (dweu) bZ2.b;
            string2.getClass();
            dweuVar3.a |= 16;
            dweuVar3.h = string2;
            F.g(bZ2.bK());
            F.i(dcdcVar);
            return F.f();
        }
        return dcdcVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f() {
        dccx F = dcdc.F();
        if (this.a != null && this.n != null) {
            for (int i = 0; i < this.n.size(); i++) {
                F.g(this.l.a(this.g, this.h, this.i, this.n.get(i), this.a));
            }
            this.o = F.f();
            return;
        }
        this.o = F.f();
    }

    @Override // defpackage.bbup
    public void j() {
        cknl cknlVar = (cknl) this.c.get(bcbv.b);
        dbuh.d(cknlVar);
        dcdc<dweu> r = dcdc.r(cknlVar.z());
        this.n = r;
        this.n = e(r);
        cknlVar.s(this);
        f();
        this.m.j(this.n);
    }

    @Override // defpackage.bbup
    public final void k(dbsg<bttq> dbsgVar) {
        this.m.cancel(false);
    }
}
