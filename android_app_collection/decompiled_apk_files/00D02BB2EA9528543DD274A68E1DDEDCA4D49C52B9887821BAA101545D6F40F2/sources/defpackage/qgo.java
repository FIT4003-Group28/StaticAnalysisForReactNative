package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: qgo  reason: default package */
/* loaded from: classes7.dex */
public final class qgo implements qgm {
    private final Application c;
    private final akto d;
    private final qhc e;
    private final qgf f;
    private final qgc g;
    private final qgl h;
    @dzsi
    private qgg j;
    @dzsi
    private qgg k;
    @dzsi
    private qge l;
    @dzsi
    private qge m;
    private boolean n;
    private final List<aktd> i = new ArrayList();
    public List<qhq> a = dcdc.e();
    public List<qhq> b = dcdc.e();

    public qgo(Application application, akto aktoVar, qhc qhcVar, qgl qglVar, qgf qgfVar, qgc qgcVar) {
        this.c = application;
        this.d = aktoVar;
        this.e = qhcVar;
        this.f = qgfVar;
        this.h = qglVar;
        this.g = qgcVar;
    }

    private final void f() {
        for (aktd aktdVar : this.i) {
            aktdVar.j();
        }
        qgg qggVar = this.j;
        if (qggVar != null) {
            qggVar.b();
            this.j = null;
        }
        qgg qggVar2 = this.k;
        if (qggVar2 != null) {
            qggVar2.b();
            this.k = null;
        }
        qge qgeVar = this.l;
        if (qgeVar != null) {
            qgeVar.b();
            this.l = null;
        }
        qge qgeVar2 = this.m;
        if (qgeVar2 != null) {
            qgeVar2.b();
            this.m = null;
        }
        this.i.clear();
        this.n = false;
        this.a = dcdc.e();
        this.b = dcdc.e();
    }

    private final void g(qhq qhqVar, List<qhq> list, qhq qhqVar2, List<qhq> list2) {
        dbsk.l(!this.n);
        this.a = list;
        this.b = list2;
        this.n = true;
        akuh a = this.d.e().a(dmqc.LEGEND_STYLE_BIKESHARING_PICK_UP_STATION_ICON);
        akuh a2 = this.d.e().a(dmqc.LEGEND_STYLE_BIKESHARING_DROP_OFF_STATION_ICON);
        for (qhq qhqVar3 : list) {
            this.i.add(h(a, vwm.PICK_UP, qhqVar3, qhqVar2));
        }
        for (qhq qhqVar4 : list2) {
            this.i.add(h(a2, vwm.DROP_OFF, qhqVar, qhqVar4));
        }
        int c = qhqVar.c();
        int intValue = qhqVar2.d().b().intValue();
        qgf qgfVar = this.f;
        akqq a3 = qhqVar.a();
        String quantityString = this.c.getResources().getQuantityString(R.plurals.BIKESHARING_BIKES_AVAILABLE_ON_MAP, c, Integer.valueOf(c));
        akvz aE = qgfVar.a.aj().aE();
        qgg qggVar = new qgg(qgfVar.a.aj().ak(), qgfVar.a.aj().aC(), quantityString, a3, aE.a(dmqc.LEGEND_STYLE_BIKESHARING_CALLOUT), aE.a(dmqc.LEGEND_STYLE_BIKESHARING_TEXT), aE.a(dmqc.LEGEND_STYLE_BIKESHARING_PICK_UP_STATION_CALLOUT_ICON));
        this.j = qggVar;
        qggVar.a();
        qge a4 = this.g.a(qhqVar.a());
        this.l = a4;
        a4.a();
        if (qhqVar2.d().a()) {
            qgf qgfVar2 = this.f;
            akqq a5 = qhqVar2.a();
            String quantityString2 = this.c.getResources().getQuantityString(R.plurals.BIKESHARING_DOCKS_AVAILABLE_ON_MAP, intValue, Integer.valueOf(intValue));
            akvz aE2 = qgfVar2.a.aj().aE();
            qgg qggVar2 = new qgg(qgfVar2.a.aj().ak(), qgfVar2.a.aj().aC(), quantityString2, a5, aE2.a(dmqc.LEGEND_STYLE_BIKESHARING_CALLOUT), aE2.a(dmqc.LEGEND_STYLE_BIKESHARING_TEXT), aE2.a(dmqc.LEGEND_STYLE_BIKESHARING_DROP_OFF_STATION_CALLOUT_ICON));
            this.k = qggVar2;
            qggVar2.a();
            qge a6 = this.g.a(qhqVar2.a());
            this.m = a6;
            a6.a();
        }
    }

    private final aktd h(akuh akuhVar, vwm vwmVar, qhq qhqVar, qhq qhqVar2) {
        akqq a;
        if (vwmVar == vwm.PICK_UP) {
            a = qhqVar.a();
        } else {
            a = qhqVar2.a();
        }
        akto aktoVar = this.d;
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        dmpeVar.b(akuhVar.e());
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmph dmphVar = (dmph) dmpeVar.bK();
        dmphVar.getClass();
        dmpnVar.b = dmphVar;
        dmpnVar.a |= 1;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        dmpnVar2.a |= 32;
        dmpnVar2.g = 1;
        dmlp bZ = dmlq.e.bZ();
        dmls a2 = akxh.a(akra.f(a));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        a2.getClass();
        dmlqVar.b = a2;
        dmlqVar.a |= 1;
        dmlo dmloVar = dmlo.CENTER;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar2 = (dmlq) bZ.b;
        dmlqVar2.c = dmloVar.j;
        dmlqVar2.a |= 2;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar3 = (dmpn) dmpkVar.b;
        dmlq bK = bZ.bK();
        bK.getClass();
        dmpnVar3.d = bK;
        dmpnVar3.a |= 4;
        dsqv<dmpn, akus> dsqvVar = akvj.a;
        akuq bZ2 = akus.o.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        akus.d((akus) bZ2.b);
        dmpkVar.k(dsqvVar, bZ2.bK());
        dsqv<dmpn, dmlm> dsqvVar2 = dmnl.G;
        dmll bZ3 = dmlm.g.bZ();
        int i = ((dtxi) dtxn.w).a;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmlm dmlmVar = (dmlm) bZ3.b;
        dmlmVar.a |= 8;
        dmlmVar.e = i;
        dmpkVar.k(dsqvVar2, bZ3.bK());
        dsqv<dmpn, dnbc> dsqvVar3 = dmnl.F;
        dnbb bZ4 = dnbc.c.bZ();
        dnox bZ5 = dnpo.t.bZ();
        bZ5.b(dnow.GENERIC_INTERACTIVE);
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dnbc dnbcVar = (dnbc) bZ4.b;
        dnpo bK2 = bZ5.bK();
        bK2.getClass();
        dnbcVar.b = bK2;
        dnbcVar.a |= 1;
        dmpkVar.k(dsqvVar3, bZ4.bK());
        int a3 = akuhVar.a();
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar4 = (dmpn) dmpkVar.b;
        dmpnVar4.a |= 2048;
        dmpnVar4.k = a3;
        akti a4 = aktoVar.a((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
        a4.Pt(this.h.a(vwmVar, qhqVar, qhqVar2, new qgn(this, vwmVar)));
        return a4;
    }

    @Override // defpackage.qgm
    public final void a(qhq qhqVar, List<qhq> list, qhq qhqVar2, List<qhq> list2) {
        g(qhqVar, list, qhqVar2, list2);
    }

    @Override // defpackage.qgm
    public final void b() {
        dbsk.l(this.n);
        f();
        this.e.a();
    }

    @Override // defpackage.qgm
    public final void c(qhq qhqVar, List<qhq> list, qhq qhqVar2, List<qhq> list2) {
        dbsk.l(this.n);
        f();
        this.a = list;
        this.b = list2;
        g(qhqVar, list, qhqVar2, list2);
    }

    @Override // defpackage.qgm
    public final boolean d() {
        return this.n;
    }

    @Override // defpackage.qgm
    public final boolean e(List<qhq> list, List<qhq> list2) {
        return this.n && list.equals(this.a) && list2.equals(this.b);
    }
}
