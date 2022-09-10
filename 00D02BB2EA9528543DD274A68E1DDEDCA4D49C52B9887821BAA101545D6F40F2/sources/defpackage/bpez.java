package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.apps.gmm.base.mod.components.appbar.ModAppBar;
import com.google.android.apps.maps.R;
import java.io.Serializable;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: bpez  reason: default package */
/* loaded from: classes3.dex */
public final class bpez extends hxf {
    @dzsi
    private bput ad;
    private cqkf<bpwj> ae;
    private bpfb af;
    public cqkj b;
    public efg c;
    public bwqv d;
    public eeu e;
    public bpuu f;
    public bowv g;

    public static bpez aR(bowv bowvVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("MODEL_KEY", bowvVar);
        bpez bpezVar = new bpez();
        bpezVar.B(bundle);
        bpezVar.aJ();
        return bpezVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ges
    public final void Oo(View view) {
        dbsg<ModAppBar> w = w();
        if (w.a()) {
            view = w.b();
        }
        super.Oo(view);
    }

    @Override // defpackage.hxf
    protected final jib g() {
        jhz e = jib.g(J(), Rp(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_TITLE)).e();
        e.o = cjtd.a(dtya.az);
        e.x = true;
        return e.b();
    }

    @Override // defpackage.hxf
    protected final View i(LayoutInflater layoutInflater, @dzsi Bundle bundle) {
        cqkf<bpwj> c = this.b.c(new bpoy(), null);
        this.ae = c;
        return c.c();
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(@dzsi Bundle bundle) {
        super.l(bundle);
        Serializable serializable = this.o.getSerializable("MODEL_KEY");
        dbsk.s(serializable);
        this.g = (bowv) serializable;
        final gga ggaVar = this.aE;
        dbsk.s(ggaVar);
        bput a = this.f.a(this.g.a.ai());
        this.ad = a;
        dbsk.s(a);
        a.b();
        bpuj bZ = bpuk.c.bZ();
        bZ.a(dchl.k(this.g.a(), bpeh.a));
        bpuk bK = bZ.bK();
        dccx F = dcdc.F();
        F.g(new bpfa(J().getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_NAME_TITLE), J().getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_NAME_DESCRIPTION), dtya.aE, new bpey(this.ad, bK, new bpew(this, ggaVar) { // from class: bpem
            private final bpez a;
            private final gga b;

            {
                this.a = this;
                this.b = ggaVar;
            }

            @Override // defpackage.bpew
            public final void a(bpuk bpukVar) {
                bpez bpezVar = this.a;
                gga ggaVar2 = this.b;
                dnpw c = bowv.j(bpezVar.g.i(), dnpv.ROUTE_PICKER_DIALOG_RESULT).c(dnpw.d);
                dcdc<bvrt<dodb>> dcdcVar = bpezVar.g.d().a;
                ArrayList arrayList = new ArrayList();
                bvrt.g(dcdcVar, arrayList, (dssr) dodb.d.cu(7), dodb.d);
                if (arrayList.size() <= 1 || c.c.equals("Yes")) {
                    boxi d = bpezVar.g.d();
                    int i = d.b;
                    ggaVar2.D(bpfw.aT(bptw.j(dbsg.j(i >= 0 ? (dodb) bvrt.f(d.a.get(i), (dssr) dodb.d.cu(7), dodb.d) : null).h(bpel.a), bpukVar.a, bpvi.c(bpukVar), bpezVar.g.b()), bwrs.a(bvrt.b(bpukVar)), bpezVar.d, bpezVar.g.i()));
                    return;
                }
                ggaVar2.D(bphi.aT(bwrs.a(bvrt.b(bpukVar)), bpezVar.d, bpezVar.g.i()));
            }
        })));
        F.g(new bpfa(J().getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_CLOSED_TITLE), J().getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_CLOSED_DESCRIPTION), dtya.aA, new bpey(this.ad, bK, new bpew(this, ggaVar) { // from class: bpen
            private final bpez a;
            private final gga b;

            {
                this.a = this;
                this.b = ggaVar;
            }

            @Override // defpackage.bpew
            public final void a(bpuk bpukVar) {
                bpez bpezVar = this.a;
                this.b.D(bpdc.g(new boxb(bpukVar, bpezVar.g.i(), bpezVar.g.c(), null)));
            }
        })));
        F.g(new bpfa(J().getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_DIRECTIONALITY_TITLE), J().getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_DIRECTIONALITY_DESCRIPTION), dtya.aB, new bpey(this.ad, bK, new bpew(this, ggaVar) { // from class: bpeo
            private final bpez a;
            private final gga b;

            {
                this.a = this;
                this.b = ggaVar;
            }

            @Override // defpackage.bpew
            public final void a(bpuk bpukVar) {
                bpez bpezVar = this.a;
                this.b.D(bpfk.aT(bwrs.a(bvrt.b(bpukVar)), dbsg.j(bpezVar.g.c()).h(bpek.a), bpezVar.d, bpezVar.g.i()));
            }
        })));
        dodc dodcVar = this.g.a.cd().e;
        if (dodcVar == null) {
            dodcVar = dodc.i;
        }
        if (dodcVar.d) {
            F.g(new bpfa(J().getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_PRIVATE_TITLE), J().getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_PRIVATE_DESCRIPTION), dtya.aH, new bpey(this.ad, bK, new bpew(this, ggaVar) { // from class: bpep
                private final bpez a;
                private final gga b;

                {
                    this.a = this;
                    this.b = ggaVar;
                }

                @Override // defpackage.bpew
                public final void a(bpuk bpukVar) {
                    bpez bpezVar = this.a;
                    this.b.D(bphv.aT(bwrs.a(bvrt.b(bpukVar)), dbsg.j(bpezVar.g.c()).h(bpej.a), bpezVar.d, bphu.PRIVATE, bpezVar.g.i()));
                }
            })));
        }
        F.g(new bpfa(J().getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_DOES_NOT_EXIST_TITLE), J().getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_DOES_NOT_EXIST_DESCRIPTION), dtya.aC, new bpey(this.ad, bK, new bpew(this, ggaVar) { // from class: bpeq
            private final bpez a;
            private final gga b;

            {
                this.a = this;
                this.b = ggaVar;
            }

            @Override // defpackage.bpew
            public final void a(bpuk bpukVar) {
                bpez bpezVar = this.a;
                this.b.D(bphv.aT(bwrs.a(bvrt.b(bpukVar)), dbsg.j(bpezVar.g.c()).h(bpei.a), bpezVar.d, bphu.DOES_NOT_EXIST, bpezVar.g.i()));
            }
        })));
        F.g(new bpfa(J().getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_DRAWN_INCORRECTLY_TITLE), J().getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_DRAWN_INCORRECTLY_DESCRIPTION), dtya.aD, new bpey(this.ad, bK, new bpew(this, ggaVar) { // from class: bper
            private final bpez a;
            private final gga b;

            {
                this.a = this;
                this.b = ggaVar;
            }

            @Override // defpackage.bpew
            public final void a(bpuk bpukVar) {
                bpez bpezVar = this.a;
                this.b.D(bphv.aT(bwrs.a(bvrt.b(bpukVar)), dbsg.j(bpezVar.g.c()).h(bpeu.a), bpezVar.d, bphu.DRAWN_INCORRECTLY, bpezVar.g.i()));
            }
        })));
        F.g(new bpfa(J().getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_OTHER_TITLE), J().getString(R.string.RAP_ROAD_ATTRIBUTE_SELECTION_OTHER_DESCRIPTION), dtya.aF, new bpey(this.ad, bK, new bpew(this, ggaVar) { // from class: bpes
            private final bpez a;
            private final gga b;

            {
                this.a = this;
                this.b = ggaVar;
            }

            @Override // defpackage.bpew
            public final void a(bpuk bpukVar) {
                bpez bpezVar = this.a;
                gga ggaVar2 = this.b;
                bwrs a2 = bwrs.a(bvrt.b(bpukVar));
                dbsg h = dbsg.j(bpezVar.g.c()).h(bpet.a);
                bwqv bwqvVar = bpezVar.d;
                dnqe i = bpezVar.g.i();
                bpha bphaVar = new bpha();
                Bundle w = bpha.w(bwqvVar, a2, i);
                bvrs.k(w, "NOTE_PROTO_KEY", new bokk("", false).b().bK());
                akqi akqiVar = akqi.a;
                if (h.a()) {
                    dpsn dpsnVar = ((drkz) h.b()).b;
                    if (dpsnVar == null) {
                        dpsnVar = dpsn.d;
                    }
                    akqiVar = akqi.j(dpsnVar);
                }
                bvrs.k(w, "SELECT_ROUTE_FEATURE_ID_PROTO_KEY", akqiVar.i());
                bphaVar.B(w);
                ggaVar2.D(bphaVar);
            }
        })));
        this.af = new bpfb(F.f());
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtya.aG;
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void s() {
        super.s();
        this.ae.e(this.af);
        View view = this.P;
        if (view != null && this.e.h()) {
            egj egjVar = new egj(this);
            egjVar.ag(null);
            egjVar.w(view);
            egjVar.x(egr.a);
            egjVar.e(this);
            this.c.a(egjVar.a());
        }
    }

    @Override // defpackage.hxf, defpackage.ges, defpackage.fd
    public final void u() {
        this.ae.e(null);
        bput bputVar = this.ad;
        dbsk.s(bputVar);
        bputVar.c();
        super.u();
    }
}
