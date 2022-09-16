package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: inp  reason: default package */
/* loaded from: classes6.dex */
public final class inp implements ioa {
    public final akox a;
    public final cjqy b;
    public final ink c;
    public final ddho d;
    private int f = Integer.MIN_VALUE;
    private final dbty<aktg> h = dbud.a(new inl(this));
    private final dbty<aktg> i = dbud.a(new inm(this));
    private final ino j;
    private dcdc<ilo> k;
    private dcdn<Integer, aktc> l;
    private dcdc<Integer> m;
    private static final dcqe g = dcqe.c("inp");
    static final dcdc<dmlo> e = dcdc.i(dmlo.BOTTOM_RIGHT, dmlo.BOTTOM_LEFT, dmlo.TOP_RIGHT, dmlo.TOP_LEFT);

    public inp(akox akoxVar, cjqy cjqyVar, ink inkVar, ddho ddhoVar) {
        amsd amsdVar = new amsd();
        amsdVar.c(new amrq());
        amsdVar.d(10, new amrm());
        amsdVar.d(10, new amrx());
        amsdVar.e(1, new amrp());
        this.j = new ino(amsdVar.a());
        this.k = dcdc.e();
        this.l = dcmn.a;
        this.m = dcdc.e();
        this.a = akoxVar;
        this.b = cjqyVar;
        this.c = inkVar;
        this.d = ddhoVar;
    }

    private final void e() {
        if (!this.m.isEmpty()) {
            bvoo.h("No callouts should be added to map: %s", this.m);
        }
        dcpd<aktc> it = this.l.values().iterator();
        while (it.hasNext()) {
            this.a.aj().aF().d().e(it.next());
        }
        this.l = dcmn.a;
        this.k = dcdc.e();
    }

    private final void f(dcdc<Integer> dcdcVar) {
        dcdc<Integer> dcdcVar2 = this.m;
        for (Integer num : g(dcdcVar2, dcdcVar)) {
            aktc aktcVar = this.l.get(Integer.valueOf(num.intValue()));
            if (aktcVar != null) {
                this.a.aj().ak().a(aktcVar);
            }
        }
        for (Integer num2 : g(dcdcVar, dcdcVar2)) {
            aktc aktcVar2 = this.l.get(Integer.valueOf(num2.intValue()));
            if (aktcVar2 != null) {
                amrg ak = this.a.aj().ak();
                ino inoVar = this.j;
                amsb amsbVar = amsb.PLACEMARK;
                int i = this.f;
                this.f = i + 1;
                ak.b(aktcVar2, inoVar, amsbVar, i, e);
            }
        }
        this.m = dcdcVar;
    }

    private static List<Integer> g(dcdc<Integer> dcdcVar, dcdc<Integer> dcdcVar2) {
        ArrayList arrayList = new ArrayList(dcdcVar);
        arrayList.removeAll(dcdcVar2);
        return arrayList;
    }

    @Override // defpackage.ioa
    public final void a() {
    }

    @Override // defpackage.ioa
    public final void b() {
    }

    @Override // defpackage.ioa
    public final void c() {
        bvrj.UI_THREAD.c();
        f(dcdc.e());
        e();
    }

    @Override // defpackage.ioa
    public final void d(inx inxVar, dcdc<ilo> dcdcVar, boolean z) {
        aktc aktcVar;
        bvrj.UI_THREAD.c();
        if (ilo.cs(this.k, dcdcVar)) {
            f(((inh) inxVar).b);
            return;
        }
        f(dcdc.e());
        e();
        if (!this.m.isEmpty()) {
            bvoo.h("No callouts should be added to map: %s", this.m);
        }
        if (!this.l.isEmpty() && !this.k.isEmpty()) {
            bvoo.h("No callouts should be live: [placemarkToCallout=%s, placemarks=%s]", this.l, dcdcVar);
        }
        dcdg dcdgVar = new dcdg();
        for (int i = 0; i < dcdcVar.size(); i++) {
            ilo iloVar = dcdcVar.get(i);
            akto aF = this.a.aj().aF();
            akqq aj = iloVar.aj();
            if (aj == null) {
                aktcVar = null;
            } else {
                dmls a = akxh.a(akra.f(aj));
                dmpk dmpkVar = (dmpk) dmpn.r.bZ();
                dmpe dmpeVar = (dmpe) dmph.f.bZ();
                dmpc dmpcVar = (dmpc) dmpd.h.bZ();
                String q = iloVar.q();
                if (dmpcVar.c) {
                    dmpcVar.bF();
                    dmpcVar.c = false;
                }
                dmpd dmpdVar = (dmpd) dmpcVar.b;
                q.getClass();
                dmpdVar.a |= 1;
                dmpdVar.b = q;
                int a2 = this.h.a().a();
                if (dmpcVar.c) {
                    dmpcVar.bF();
                    dmpcVar.c = false;
                }
                dmpd dmpdVar2 = (dmpd) dmpcVar.b;
                dmpdVar2.a |= 2;
                dmpdVar2.c = a2;
                dmpeVar.b(dmpcVar);
                int a3 = this.i.a().a();
                if (dmpeVar.c) {
                    dmpeVar.bF();
                    dmpeVar.c = false;
                }
                dmph dmphVar = (dmph) dmpeVar.b;
                dmphVar.a |= 1;
                dmphVar.c = a3;
                if (dmpkVar.c) {
                    dmpkVar.bF();
                    dmpkVar.c = false;
                }
                dmpn dmpnVar = (dmpn) dmpkVar.b;
                dmph dmphVar2 = (dmph) dmpeVar.bK();
                dmphVar2.getClass();
                dmpnVar.b = dmphVar2;
                dmpnVar.a |= 1;
                dmlp bZ = dmlq.e.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dmlq dmlqVar = (dmlq) bZ.b;
                a.getClass();
                dmlqVar.b = a;
                dmlqVar.a |= 1;
                dmlo dmloVar = e.get(0);
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
                dmpn dmpnVar2 = (dmpn) dmpkVar.b;
                dmlq bK = bZ.bK();
                bK.getClass();
                dmpnVar2.d = bK;
                dmpnVar2.a |= 4;
                dsqv<dmpn, akuj> dsqvVar = akvj.b;
                akui bZ2 = akuj.e.bZ();
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                akuj akujVar = (akuj) bZ2.b;
                int i2 = akujVar.a | 1;
                akujVar.a = i2;
                akujVar.b = 50.0f;
                akujVar.a = i2 | 4;
                akujVar.d = true;
                dmpkVar.k(dsqvVar, bZ2.bK());
                aktc d = aF.d().d((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
                d.Pt(new inn(this, iloVar));
                aktcVar = d;
            }
            if (aktcVar != null) {
                dcdgVar.f(Integer.valueOf(i), aktcVar);
            }
        }
        this.l = dcdgVar.b();
        this.k = dcdcVar;
        f(((inh) inxVar).b);
    }
}
