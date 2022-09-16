package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aabc  reason: default package */
/* loaded from: classes2.dex */
public final class aabc extends ges {
    @dzsi
    private cqkf<jbk> aA;
    @dzsi
    private cqkf<aadc> aB;
    public bwqv ad;
    public aadb ae;
    public aacd af;
    public cqkj ag;
    public aacz ah;
    public aaas ai;
    public aaeb aj;
    public aaco ak;
    public List<aaco> al;
    public aadw am;
    @dzsi
    public aaaw an;
    @dzsi
    public aadz ao;
    @dzsi
    public aadt ap;
    @dzsi
    public aada aq;
    @dzsi
    public aaar ar;
    @dzsi
    public aacw as;
    @dzsi
    public aabi at;
    @dzsi
    aadd au;
    @dzsi
    public aacc av;
    private aaam ax;
    private aacn ay;
    @dzsi
    private aaaz az;
    public aaax b;
    public aaea c;
    public aadu d;
    public aacx e;
    public aabj f;
    public aade g;
    private static final dcqe aw = dcqe.c("aabc");
    public static final String a = aabc.class.getSimpleName();

    @Override // defpackage.ges, defpackage.fd
    public final void Qe() {
        aacz aaczVar = this.ah;
        aada aadaVar = this.aq;
        dbsk.s(aadaVar);
        aaczVar.b = aaczVar.a(aadaVar);
        this.aq = null;
        cqkf<aadc> cqkfVar = this.aB;
        if (cqkfVar != null) {
            cqkfVar.e(null);
            this.aB = null;
        }
        cqkf<jbk> cqkfVar2 = this.aA;
        if (cqkfVar2 != null) {
            cqkfVar2.e(null);
            this.aA = null;
        }
        super.Qe();
    }

    @Override // defpackage.ges, defpackage.gfw
    public final void Qn(@dzsi Object obj) {
        if (obj == null) {
            return;
        }
        if (obj instanceof bsjn) {
            bsjn bsjnVar = (bsjn) obj;
            aadd aaddVar = this.au;
            dbsk.s(aaddVar);
            aaddVar.g(bsjnVar.a());
            aadw aadwVar = this.am;
            dbsk.s(aadwVar);
            aadwVar.b(bsjnVar.a(), bsjnVar.c());
        } else if (obj instanceof bshk) {
            aaaz aaazVar = this.az;
            dbsk.s(aaazVar);
            dbsk.s(aaazVar.i().am);
            aabc i = aaazVar.i();
            bsjm a2 = aadw.a(aaazVar.i().ak);
            Bundle bundle = new Bundle();
            bundle.putSerializable("refinements_model", a2);
            aaec aaecVar = new aaec();
            aaecVar.B(bundle);
            i.aZ(aaecVar);
        } else {
            bvoo.h("onFragmentResult called with unsupported type of result.", new Object[0]);
        }
    }

    @Override // defpackage.fd
    @dzsi
    public final View ag(LayoutInflater layoutInflater, @dzsi ViewGroup viewGroup, @dzsi Bundle bundle) {
        cqkf<jbk> c = this.ag.c(new aabd(), null);
        this.aA = c;
        aabi aabiVar = this.at;
        dbsk.s(aabiVar);
        c.e(aabiVar);
        cqkf<aadc> c2 = this.ag.c(new aabp(), null);
        this.aB = c2;
        aadd aaddVar = this.au;
        dbsk.s(aaddVar);
        c2.e(aaddVar);
        aadb aadbVar = this.ae;
        aaaz aaazVar = this.az;
        dbsk.s(aaazVar);
        aaar aaarVar = this.ar;
        dbsk.s(aaarVar);
        aacw aacwVar = this.as;
        dbsk.s(aacwVar);
        cqkf<jbk> cqkfVar = this.aA;
        dbsk.s(cqkfVar);
        View c3 = cqkfVar.c();
        cqkf<aadc> cqkfVar2 = this.aB;
        dbsk.s(cqkfVar2);
        View c4 = cqkfVar2.c();
        aadz aadzVar = this.ao;
        dbsk.s(aadzVar);
        View a2 = aadzVar.b.a();
        Activity activity = (Activity) ((dxjd) aadbVar.a).a;
        aadb.a(activity, 1);
        efg a3 = aadbVar.b.a();
        aadb.a(a3, 2);
        aadb.a(aaazVar, 3);
        aadb.a(aaarVar, 4);
        aadb.a(aacwVar, 5);
        aadb.a(c3, 6);
        aadb.a(c4, 7);
        aadb.a(a2, 8);
        aada aadaVar = new aada(activity, a3, aaazVar, aaarVar, aacwVar, c3, c4, a2);
        this.aq = aadaVar;
        aacz aaczVar = this.ah;
        if (aaczVar.b == null && bundle != null) {
            aaczVar.b = bundle.getBundle(aacz.a);
        }
        Bundle bundle2 = aaczVar.b;
        if (bundle2 != null) {
            aadaVar.f = new int[]{1, 2}[bundle2.getInt("UiMode")];
            aadaVar.e = bundle2.getBoolean("ShowListOnResponse");
            aaczVar.b(aadaVar).C(bundle2.getParcelable("SliderListState"));
        }
        return null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void am() {
        this.az = null;
        this.an = null;
        this.ao = null;
        this.ar = null;
        this.ap = null;
        this.as = null;
        this.at = null;
        this.au = null;
        this.av = null;
        super.am();
    }

    @Override // defpackage.ges, defpackage.gfo
    public final boolean e() {
        if (!this.aD) {
            return false;
        }
        aada aadaVar = this.aq;
        dbsk.s(aadaVar);
        aadaVar.c();
        int i = true != aadaVar.e ? 1 : 2;
        int i2 = aadaVar.f;
        if (i2 == i) {
            aaar aaarVar = aadaVar.b;
            akyc a2 = aaarVar.b.a();
            a2.b = 0;
            aaarVar.c(a2);
            gga ggaVar = this.aE;
            dbsk.s(ggaVar);
            ggaVar.g().e();
        } else {
            int i3 = i2 - 1;
            if (i2 == 0) {
                throw null;
            }
            if (i3 == 0) {
                aadaVar.a(this);
            } else if (i3 == 1) {
                aadaVar.b.b();
                aadaVar.b(this);
            }
        }
        return true;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        aabb aabbVar;
        aabx aabxVar;
        aads aadsVar;
        super.l(bundle);
        Bundle bundle2 = (Bundle) dbsc.a(bundle, this.o);
        try {
            aabbVar = (aabb) this.ad.d(aabb.class, bundle2, a);
        } catch (IOException unused) {
            aabbVar = null;
        }
        dbsk.s(aabbVar);
        this.ax = aabbVar.a.e((dssr) aaam.d.cu(7), aaam.d);
        aacn c = aabbVar.b.c();
        dbsk.s(c);
        this.ay = c;
        aaco c2 = aabbVar.c.c();
        dbsk.s(c2);
        this.ak = c2;
        this.al = new ArrayList(aabbVar.d.size());
        dcdc<bwrs<aaco>> dcdcVar = aabbVar.d;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            List<aaco> list = this.al;
            aaco c3 = dcdcVar.get(i).c();
            dbsk.s(c3);
            list.add(c3);
        }
        aaaz aaazVar = new aaaz();
        this.az = aaazVar;
        aaax aaaxVar = this.b;
        aacu a2 = aaaxVar.a.a();
        aaax.a(a2, 1);
        aaci a3 = aaaxVar.b.a();
        aaax.a(a3, 2);
        aaax.a(aaazVar, 3);
        this.an = new aaaw(a2, a3, aaazVar);
        aaea aaeaVar = this.c;
        aaaz aaazVar2 = this.az;
        aacn aacnVar = this.ay;
        brbh a4 = aaeaVar.a.a();
        aaea.a(a4, 1);
        akox a5 = aaeaVar.b.a();
        aaea.a(a5, 2);
        cjqy a6 = aaeaVar.c.a();
        aaea.a(a6, 3);
        gll a7 = aaeaVar.d.a();
        aaea.a(a7, 4);
        aaea.a(aaazVar2, 5);
        aaea.a(aacnVar, 6);
        this.ao = new aadz(a4, a5, a6, a7, aaazVar2, aacnVar);
        aadu aaduVar = this.d;
        aaaz aaazVar3 = this.az;
        aacn aacnVar2 = this.ay;
        bwqv a8 = aaduVar.a.a();
        aadu.a(a8, 1);
        aaci a9 = aaduVar.b.a();
        aadu.a(a9, 2);
        aadu.a(aaazVar3, 3);
        aadu.a(aacnVar2, 4);
        this.ap = new aadt(a8, a9, aaazVar3, aacnVar2);
        this.am = new aadw(this.az, this.ay);
        aaas aaasVar = this.ai;
        aadz aadzVar = this.ao;
        dbsk.s(aadzVar);
        akpm a10 = aaasVar.a.a();
        aaas.a(a10, 1);
        akzh a11 = aaasVar.b.a();
        aaas.a(a11, 2);
        aaas.a(aadzVar, 3);
        this.ar = new aaar(a10, a11, aadzVar);
        aacx aacxVar = this.e;
        aaaz aaazVar4 = this.az;
        dbsk.s(aaazVar4);
        aafv a12 = aacxVar.a.a();
        aacx.a(a12, 1);
        gga a13 = aacxVar.b.a();
        aacx.a(a13, 2);
        aacx.a(aacxVar.c.a(), 3);
        aadj a14 = aacxVar.d.a();
        aacx.a(a14, 4);
        aacx.a(aaazVar4, 5);
        aacw aacwVar = new aacw(a12, a13, a14, aaazVar4);
        this.as = aacwVar;
        aacwVar.I(this.ax.b);
        aabj aabjVar = this.f;
        btpf c4 = btpf.c(J());
        aaaz aaazVar5 = this.az;
        dbsk.s(aaazVar5);
        String str = this.ax.b;
        Activity activity = (Activity) ((dxjd) aabjVar.a).a;
        aabj.a(activity, 1);
        aabj.a(aabjVar.b.a(), 2);
        aabj.a(c4, 3);
        aabj.a(aaazVar5, 4);
        aabj.a(str, 5);
        this.at = new aabi(activity, c4, aaazVar5, str);
        aade aadeVar = this.g;
        aadt aadtVar = this.ap;
        dbsk.s(aadtVar);
        aacw aacwVar2 = this.as;
        dbsk.s(aacwVar2);
        aaaz aaazVar6 = this.az;
        dbsk.s(aaazVar6);
        cqhn a15 = aadeVar.a.a();
        aade.a(a15, 1);
        aabz a16 = aadeVar.b.a();
        aade.a(a16, 2);
        brze a17 = aadeVar.c.a();
        aade.a(a17, 3);
        aadk a18 = aadeVar.d.a();
        aade.a(a18, 4);
        aade.a(aadtVar, 5);
        aade.a(aacwVar2, 6);
        aade.a(aaazVar6, 7);
        this.au = new aadd(a15, a16, a17, a18, aadtVar, aacwVar2, aaazVar6);
        aacd aacdVar = this.af;
        aacw aacwVar3 = this.as;
        dbsk.s(aacwVar3);
        dxio a19 = ((dxjh) aacdVar.a).a();
        aacd.a(a19, 1);
        alay a20 = aacdVar.b.a();
        aacd.a(a20, 2);
        akkz a21 = aacdVar.c.a();
        aacd.a(a21, 3);
        dxio a22 = ((dxjh) aacdVar.d).a();
        aacd.a(a22, 4);
        dxio a23 = ((dxjh) aacdVar.e).a();
        aacd.a(a23, 5);
        aacd.a(aacwVar3, 6);
        aacc aaccVar = new aacc(a19, a20, a21, a22, a23, aacwVar3);
        this.av = aaccVar;
        dbsk.s(aaccVar);
        aaccVar.a(this.ak);
        aacc aaccVar2 = this.av;
        dbsk.s(aaccVar2);
        for (aaco aacoVar : this.al) {
            aaccVar2.a(aacoVar);
        }
        aacw aacwVar4 = this.as;
        dbsk.s(aacwVar4);
        aacwVar4.ag(this.ay);
        aabi aabiVar = this.at;
        dbsk.s(aabiVar);
        aabiVar.c(this.ak);
        aadd aaddVar = this.au;
        dbsk.s(aaddVar);
        aaddVar.f(this.ak);
        aadd aaddVar2 = this.au;
        dbsk.s(aaddVar2);
        aaby aabyVar = aaddVar2.a;
        try {
            aabxVar = (aabx) aabyVar.c.d(aabx.class, bundle2, aaby.b);
        } catch (IOException unused2) {
            aabxVar = null;
        }
        if (aabxVar != null) {
            aabyVar.j();
            dcdc<aabw> dcdcVar2 = aabxVar.a;
            int size2 = dcdcVar2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                aabw aabwVar = dcdcVar2.get(i2);
                ArrayList arrayList = new ArrayList(aabwVar.a.size());
                dcdc<bvrt<dhxz>> dcdcVar3 = aabwVar.a;
                int size3 = dcdcVar3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    arrayList.add(dcdcVar3.get(i3).e((dssr) dhxz.c.cu(7), dhxz.c));
                }
                aabyVar.l(arrayList, dbpy.a);
            }
        }
        aadt aadtVar2 = this.ap;
        dbsk.s(aadtVar2);
        try {
            aadsVar = (aads) aadtVar2.b.d(aads.class, bundle2, aadt.a);
        } catch (IOException unused3) {
            aadsVar = null;
        }
        if (aadsVar == null) {
            return;
        }
        aadtVar2.f = aadsVar.a;
    }

    @Override // defpackage.fd, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        aabi aabiVar = this.at;
        if (aabiVar != null) {
            aabiVar.b = btpf.d(configuration);
        }
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxo.bA;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        aaaz aaazVar = this.az;
        dbsk.s(aaazVar);
        aaazVar.a = this;
        if (!this.ak.a()) {
            aaazVar.b(this.ay);
        }
        aadz aadzVar = this.ao;
        dbsk.s(aadzVar);
        aadzVar.b.b();
        aacw aacwVar = this.as;
        dbsk.s(aacwVar);
        aacwVar.ah();
        aacc aaccVar = this.av;
        dbsk.s(aaccVar);
        aaccVar.a.a().aj().aC().i(aaccVar.i);
        aaccVar.c.a().e(false);
        for (alax alaxVar : aaccVar.f) {
            alaxVar.a();
        }
        aada aadaVar = this.aq;
        dbsk.s(aadaVar);
        int i = aadaVar.f;
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                aadaVar.b(this);
                return;
            } else if (i2 != 1) {
                return;
            } else {
                aadaVar.a(this);
                return;
            }
        }
        throw null;
    }

    @Override // defpackage.ges, defpackage.fd
    public final void t(Bundle bundle) {
        super.t(bundle);
        this.ad.c(bundle, a, new aabb(this.ax, this.ay, this.ak, this.al));
        aadd aaddVar = this.au;
        dbsk.s(aaddVar);
        aaby aabyVar = aaddVar.a;
        aabyVar.c.c(bundle, aaby.b, new aabx(aabyVar));
        aadt aadtVar = this.ap;
        dbsk.s(aadtVar);
        aadtVar.b.c(bundle, aadt.a, new aads(aadtVar));
        aacz aaczVar = this.ah;
        aada aadaVar = this.aq;
        if (aadaVar != null) {
            aaczVar.b = aaczVar.a(aadaVar);
        }
        bundle.putBundle(aacz.a, aaczVar.b);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void u() {
        aaaz aaazVar = this.az;
        dbsk.s(aaazVar);
        aaazVar.a = null;
        aadt aadtVar = this.ap;
        dbsk.s(aadtVar);
        aadtVar.c.b();
        aacw aacwVar = this.as;
        dbsk.s(aacwVar);
        aacwVar.ai();
        aadz aadzVar = this.ao;
        dbsk.s(aadzVar);
        aadzVar.b.c();
        aaaw aaawVar = this.an;
        dbsk.s(aaawVar);
        aaawVar.b.b();
        aacc aaccVar = this.av;
        dbsk.s(aaccVar);
        aaccVar.a.a().aj().aC().j(aaccVar.i);
        aaccVar.c.a().e(true);
        for (alax alaxVar : aaccVar.f) {
            alaxVar.b();
        }
        super.u();
    }
}
