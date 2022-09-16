package defpackage;

import com.google.android.apps.gmm.reportaproblem.webview.ReportAProblemWebViewCallbacks;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bowl  reason: default package */
/* loaded from: classes3.dex */
public final class bowl implements aket {
    public transient bvvw a;
    public transient bovv b;
    public transient btvo c;
    @dzsi
    private final Integer d;
    private final boolean e;
    private final bwrs<ilo> f;
    private final bvrt<dnqe> g;

    public bowl(@dzsi Integer num, boolean z, bwrs<ilo> bwrsVar, dnqe dnqeVar, bvvw bvvwVar, bovv bovvVar, btvo btvoVar) {
        this.d = num;
        this.e = z;
        this.f = bwrsVar;
        this.g = bvrt.b(dnqeVar);
        this.a = bvvwVar;
        this.b = bovvVar;
        this.c = btvoVar;
    }

    private final void c(gga ggaVar, bowv bowvVar) {
        bwqv rD = ((bwqz) btsr.a(bwqz.class)).rD();
        bowk bowkVar = new bowk(bowvVar, this.f);
        bosj bosjVar = bowvVar.w;
        dwyd dwydVar = dwyd.REPORT_A_PROBLEM;
        Integer num = this.d;
        ilo iloVar = (ilo) bwrs.b(this.f);
        dbsk.s(iloVar);
        ggaVar.D(boqv.g(rD, bosjVar, bowkVar, dwydVar, num, iloVar.ai(), this.e));
    }

    @Override // defpackage.akeo
    public final void a(gga ggaVar, btlu btluVar) {
        ((bovw) btsq.b(bovw.class, ggaVar)).xt(this);
        dbsk.s(this.a);
        dbsk.s(this.b);
        dbsk.s(this.c);
        ilo iloVar = (ilo) bwrs.b(this.f);
        dbsk.s(iloVar);
        bowv bowvVar = new bowv(iloVar, this.g.e((dssr) dnqe.i.cu(7), dnqe.i));
        if (this.e || !this.c.getUgcParameters().C() || iloVar.cy() == null) {
            c(ggaVar, bowvVar);
            return;
        }
        dobr cy = iloVar.cy();
        dbsk.s(cy);
        String str = null;
        for (dobk dobkVar : cy.f) {
            int a = dobj.a(dobkVar.c);
            if (a != 0 && a == 3) {
                str = dobkVar.a == 2 ? (String) dobkVar.b : "";
            }
        }
        if (dbsj.d(str)) {
            c(ggaVar, bowvVar);
            return;
        }
        bvvr e = bvvs.e();
        bovv bovvVar = this.b;
        dnqb b = dnqb.b(bowvVar.i().b);
        if (b == null) {
            b = dnqb.UNKNOWN_ENTRY_POINT;
        }
        e.b(bovvVar.b(str, "aGmm.RAP.Hours", b, ggaVar.getString(R.string.PLACE_SUGGEST_AN_EDIT)));
        bvvn bvvnVar = (bvvn) e;
        bvvnVar.b = new ReportAProblemWebViewCallbacks(this.f, bowvVar);
        bvvnVar.a = bovh.class;
        this.a.r(e.a(), dtya.bI);
    }

    @Override // defpackage.akeo
    public final void b(gga ggaVar, btlu btluVar) {
    }
}
