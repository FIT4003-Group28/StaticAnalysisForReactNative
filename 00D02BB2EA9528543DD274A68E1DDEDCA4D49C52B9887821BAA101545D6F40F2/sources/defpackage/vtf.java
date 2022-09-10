package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: vtf  reason: default package */
/* loaded from: classes7.dex */
public final class vtf {
    @dzsi
    private aktc a;
    @dzsi
    private amvh b;
    @dzsi
    private akvo<aktd> c;
    private final vte d;
    private final akoq e;
    private final Resources f;
    private final vtd g = new vtd();

    public vtf(akoq akoqVar, Resources resources) {
        this.e = akoqVar;
        this.f = resources;
        this.d = new vte(resources, akoqVar.aE());
    }

    private final boolean e() {
        this.b = null;
        this.c = null;
        aktc aktcVar = this.a;
        if (aktcVar == null) {
            return false;
        }
        this.e.ak().a(aktcVar);
        this.e.aC().e(aktcVar);
        this.a = null;
        return true;
    }

    public final synchronized void a(amvh amvhVar, akvo<aktd> akvoVar, boolean z) {
        dmpm dmpmVar;
        if (amvhVar.equals(this.b)) {
            return;
        }
        e();
        dmpk dmpkVar = (dmpk) dmpn.r.bZ();
        dmpe dmpeVar = (dmpe) dmph.f.bZ();
        vte vteVar = this.d;
        int a = (z ? vteVar.d : vteVar.c).a();
        if (dmpeVar.c) {
            dmpeVar.bF();
            dmpeVar.c = false;
        }
        dmph dmphVar = (dmph) dmpeVar.b;
        dmphVar.a |= 1;
        dmphVar.c = a;
        dmpc dmpcVar = (dmpc) dmpd.h.bZ();
        int a2 = this.d.e.a();
        if (dmpcVar.c) {
            dmpcVar.bF();
            dmpcVar.c = false;
        }
        dmpd dmpdVar = (dmpd) dmpcVar.b;
        dmpdVar.a |= 2;
        dmpdVar.c = a2;
        dmpd dmpdVar2 = (dmpd) dmpcVar.bK();
        dmpc dmpcVar2 = (dmpc) dmpd.h.bZ();
        if (dmpcVar2.c) {
            dmpcVar2.bF();
            dmpcVar2.c = false;
        }
        dmpd dmpdVar3 = (dmpd) dmpcVar2.b;
        dmpdVar3.a |= 1;
        dmpdVar3.b = "  ";
        int a3 = this.d.i.a();
        if (dmpcVar2.c) {
            dmpcVar2.bF();
            dmpcVar2.c = false;
        }
        dmpd dmpdVar4 = (dmpd) dmpcVar2.b;
        dmpdVar4.a |= 2;
        dmpdVar4.c = a3;
        dmpd dmpdVar5 = (dmpd) dmpcVar2.bK();
        if (bvox.c(this.f)) {
            dmpeVar.c(dmpdVar5);
            dmpeVar.c(dmpdVar2);
        } else {
            dmpeVar.c(dmpdVar2);
            dmpeVar.c(dmpdVar5);
        }
        dmph dmphVar2 = (dmph) dmpeVar.bK();
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar = (dmpn) dmpkVar.b;
        dmphVar2.getClass();
        dmpnVar.b = dmphVar2;
        dmpnVar.a |= 1;
        dmpe dmpeVar2 = (dmpe) dmph.f.bZ();
        int i = bvox.c(this.f) ? 3 : 2;
        if (dmpeVar2.c) {
            dmpeVar2.bF();
            dmpeVar2.c = false;
        }
        dmph dmphVar3 = (dmph) dmpeVar2.b;
        dmphVar3.e = i;
        dmphVar3.a |= 4;
        dmpc dmpcVar3 = (dmpc) dmpd.h.bZ();
        String p = amvhVar.p();
        if (dmpcVar3.c) {
            dmpcVar3.bF();
            dmpcVar3.c = false;
        }
        dmpd dmpdVar6 = (dmpd) dmpcVar3.b;
        p.getClass();
        dmpdVar6.a |= 1;
        dmpdVar6.b = p;
        vte vteVar2 = this.d;
        int a4 = (z ? vteVar2.g : vteVar2.f).a();
        if (dmpcVar3.c) {
            dmpcVar3.bF();
            dmpcVar3.c = false;
        }
        dmpd dmpdVar7 = (dmpd) dmpcVar3.b;
        dmpdVar7.a |= 2;
        dmpdVar7.c = a4;
        dmpeVar2.b(dmpcVar3);
        dmpc dmpcVar4 = (dmpc) dmpd.h.bZ();
        if (dmpcVar4.c) {
            dmpcVar4.bF();
            dmpcVar4.c = false;
        }
        dmpd dmpdVar8 = (dmpd) dmpcVar4.b;
        dmpdVar8.a |= 16;
        dmpdVar8.f = true;
        String upperCase = this.f.getString(R.string.REMOVE).toUpperCase(Locale.getDefault());
        if (dmpcVar4.c) {
            dmpcVar4.bF();
            dmpcVar4.c = false;
        }
        dmpd dmpdVar9 = (dmpd) dmpcVar4.b;
        upperCase.getClass();
        dmpdVar9.a |= 1;
        dmpdVar9.b = upperCase;
        int a5 = this.d.h.a();
        if (dmpcVar4.c) {
            dmpcVar4.bF();
            dmpcVar4.c = false;
        }
        dmpd dmpdVar10 = (dmpd) dmpcVar4.b;
        dmpdVar10.a |= 2;
        dmpdVar10.c = a5;
        dmpeVar2.b(dmpcVar4);
        dmph dmphVar4 = (dmph) dmpeVar2.bK();
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar2 = (dmpn) dmpkVar.b;
        dmphVar4.getClass();
        dmpnVar2.c = dmphVar4;
        dmpnVar2.a |= 2;
        if (bvox.c(this.f)) {
            dmpmVar = dmpm.CENTER_RIGHT_TO_CENTER_LEFT;
        } else {
            dmpmVar = dmpm.CENTER_LEFT_TO_CENTER_RIGHT;
        }
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar3 = (dmpn) dmpkVar.b;
        dmpnVar3.f = dmpmVar.q;
        dmpnVar3.a |= 16;
        dmlp bZ = dmlq.e.bZ();
        akqq akqqVar = amvhVar.e;
        dbsk.s(akqqVar);
        dmls a6 = akxh.a(akra.f(akqqVar));
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar = (dmlq) bZ.b;
        a6.getClass();
        dmlqVar.b = a6;
        dmlqVar.a |= 1;
        dmlo dmloVar = vte.a.get(0);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmlq dmlqVar2 = (dmlq) bZ.b;
        dmlqVar2.c = dmloVar.j;
        dmlqVar2.a |= 2;
        dmlq bK = bZ.bK();
        if (dmpkVar.c) {
            dmpkVar.bF();
            dmpkVar.c = false;
        }
        dmpn dmpnVar4 = (dmpn) dmpkVar.b;
        bK.getClass();
        dmpnVar4.d = bK;
        dmpnVar4.a |= 4;
        aktc d = this.e.aC().d((dmpn) dmpkVar.bK(), dmti.WORLD_ENCODING_LAT_LNG_E7);
        d.Pt(akvoVar);
        this.b = amvhVar;
        this.c = akvoVar;
        this.a = d;
        amrg ak = this.e.ak();
        aktc aktcVar = this.a;
        dbsk.s(aktcVar);
        ak.b(aktcVar, this.g, amsb.REMOVE_WAYPOINT, 0, vte.a);
    }

    public final synchronized boolean b() {
        return e();
    }

    public final synchronized void c(boolean z) {
        amvh amvhVar = this.b;
        akvo<aktd> akvoVar = this.c;
        e();
        if (amvhVar == null || akvoVar == null) {
            return;
        }
        a(amvhVar, akvoVar, z);
    }

    public final synchronized void d() {
        e();
        vte vteVar = this.d;
        vteVar.b.j(vteVar.e);
        vteVar.b.j(vteVar.f);
        vteVar.b.j(vteVar.g);
        vteVar.b.j(vteVar.h);
        vteVar.b.j(vteVar.i);
        vteVar.b.j(vteVar.c);
        vteVar.b.j(vteVar.d);
    }
}
