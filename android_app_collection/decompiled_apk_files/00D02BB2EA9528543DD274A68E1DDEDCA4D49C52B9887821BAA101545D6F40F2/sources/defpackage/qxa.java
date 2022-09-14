package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: qxa  reason: default package */
/* loaded from: classes7.dex */
public final class qxa {
    private static final dcdc<aktc> d = dcdc.e();
    private static final dcdc<dmlo> e = dcdc.i(dmlo.BOTTOM_LEFT, dmlo.BOTTOM_RIGHT, dmlo.TOP_LEFT, dmlo.TOP_RIGHT);
    public final qxd a;
    public final ros b;
    public dcdc<aktc> c;
    private final Application f;
    private final amrl g;
    private final akox h;

    public qxa(Application application, akox akoxVar, qxd qxdVar, ros rosVar) {
        amsd amsdVar = new amsd();
        amsdVar.c(new amrq());
        amsdVar.d(10, new amrm());
        amsdVar.e(1, new amrp());
        this.g = new qxb(amsdVar.a());
        this.c = dcdc.e();
        this.f = application;
        this.h = akoxVar;
        this.a = qxdVar;
        this.b = rosVar;
    }

    private final dmpd c(qxc qxcVar) {
        dmpc dmpcVar = (dmpc) dmpd.h.bZ();
        int a = this.a.a(qxcVar);
        if (dmpcVar.c) {
            dmpcVar.bF();
            dmpcVar.c = false;
        }
        dmpd dmpdVar = (dmpd) dmpcVar.b;
        dmpdVar.a |= 2;
        dmpdVar.c = a;
        return (dmpd) dmpcVar.bK();
    }

    private final amrg d() {
        return this.h.aj().ak();
    }

    private final akty e() {
        return this.h.aj().aC();
    }

    public final void a() {
        dcdc<aktc> dcdcVar = this.c;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            aktc aktcVar = dcdcVar.get(i);
            d().a(aktcVar);
            e().e(aktcVar);
        }
        this.c = d;
    }

    @dzsi
    public final aktc b(@dzsi azva azvaVar) {
        akqq akqqVar;
        String string;
        if (azvaVar == null) {
            return null;
        }
        dndr dndrVar = azvaVar.a;
        if ((dndrVar != dndr.INFERRED_HOME && dndrVar != dndr.INFERRED_WORK) || (akqqVar = azvaVar.e) == null) {
            return null;
        }
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        if (dndrVar == dndr.INFERRED_HOME) {
            dmpeVar.c(c(qxc.HOME_ICON));
            string = this.f.getResources().getString(R.string.HOME_LOCATION);
        } else {
            dmpeVar.c(c(qxc.WORK_ICON));
            string = this.f.getResources().getString(R.string.WORK_LOCATION);
        }
        dmpc dmpcVar = (dmpc) dmpd.h.bZ();
        if (dmpcVar.c) {
            dmpcVar.bF();
            dmpcVar.c = false;
        }
        dmpd dmpdVar = (dmpd) dmpcVar.b;
        dmpdVar.a |= 1;
        dmpdVar.b = " ";
        int a = this.a.a(qxc.SPACER);
        if (dmpcVar.c) {
            dmpcVar.bF();
            dmpcVar.c = false;
        }
        dmpd dmpdVar2 = (dmpd) dmpcVar.b;
        dmpdVar2.a |= 2;
        dmpdVar2.c = a;
        dmpeVar.b(dmpcVar);
        dmpc dmpcVar2 = (dmpc) dmpd.h.bZ();
        if (dmpcVar2.c) {
            dmpcVar2.bF();
            dmpcVar2.c = false;
        }
        dmpd dmpdVar3 = (dmpd) dmpcVar2.b;
        string.getClass();
        dmpdVar3.a |= 1;
        dmpdVar3.b = string;
        int a2 = this.a.a(qxc.TEXT);
        if (dmpcVar2.c) {
            dmpcVar2.bF();
            dmpcVar2.c = false;
        }
        dmpd dmpdVar4 = (dmpd) dmpcVar2.b;
        dmpdVar4.a |= 2;
        dmpdVar4.c = a2;
        dmpeVar.b(dmpcVar2);
        dmpc dmpcVar3 = (dmpc) dmpd.h.bZ();
        if (dmpcVar3.c) {
            dmpcVar3.bF();
            dmpcVar3.c = false;
        }
        dmpd dmpdVar5 = (dmpd) dmpcVar3.b;
        dmpdVar5.a |= 1;
        dmpdVar5.b = "  ";
        int a3 = this.a.a(qxc.SPACER);
        if (dmpcVar3.c) {
            dmpcVar3.bF();
            dmpcVar3.c = false;
        }
        dmpd dmpdVar6 = (dmpd) dmpcVar3.b;
        dmpdVar6.a |= 2;
        dmpdVar6.c = a3;
        dmpeVar.b(dmpcVar3);
        dmpeVar.c(c(qxc.EDIT_ICON));
        dmls a4 = akxh.a(akra.f(akqqVar));
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        int a5 = this.a.a(qxc.BACKGROUND);
        if (dmpeVar.c) {
            dmpeVar.bF();
            dmpeVar.c = false;
        }
        dmph dmphVar = (dmph) dmpeVar.b;
        dmphVar.a |= 1;
        dmphVar.c = a5;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmph dmphVar2 = (dmph) dmpeVar.bK();
        dmphVar2.getClass();
        dmpnVar.b = dmphVar2;
        dmpnVar.a |= 1;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        int i = dmpnVar2.a | 64;
        dmpnVar2.a = i;
        dmpnVar2.h = 32767;
        dmpnVar2.a = i | 32;
        dmpnVar2.g = 3;
        dsqv<dmpn, akuj> dsqvVar = akvj.b;
        akui bZ = akuj.e.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        akuj akujVar = (akuj) bZ.b;
        akujVar.a |= 4;
        akujVar.d = true;
        dmpkVar.k(dsqvVar, bZ.bK());
        dmlp bZ2 = dmlq.e.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ2.b;
        a4.getClass();
        dmlqVar.b = a4;
        dmlqVar.a |= 1;
        dcdc<dmlo> dcdcVar = e;
        dmlo dmloVar = dcdcVar.get(0);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmlq dmlqVar2 = (dmlq) bZ2.b;
        dmlqVar2.c = dmloVar.j;
        dmlqVar2.a |= 2;
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar3 = (dmpn) dmpkVar.b;
        dmlq bK = bZ2.bK();
        bK.getClass();
        dmpnVar3.d = bK;
        dmpnVar3.a |= 4;
        aktc d2 = e().d((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
        d2.Pt(new qwz(this, dndrVar));
        d().b(d2, this.g, amsb.IMPLICIT_DESTINATION, 0, dcdcVar);
        return d2;
    }
}
