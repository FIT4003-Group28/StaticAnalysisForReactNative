package defpackage;

import com.google.android.apps.gmm.reportaproblem.webview.ReportAProblemWebViewCallbacks;
/* compiled from: PG */
/* renamed from: bowo  reason: default package */
/* loaded from: classes3.dex */
public final class bowo implements aket {
    @dzsi
    public transient bvvw a = null;
    @dzsi
    public transient bovv b = null;
    private final bwrs<ilo> c;
    private final bvrt<dnqe> d;
    private final String e;
    private final ddho f;

    public bowo(bwrs<ilo> bwrsVar, String str, dnqe dnqeVar, ddho ddhoVar) {
        this.c = bwrsVar;
        this.e = str;
        this.d = bvrt.b(dnqeVar);
        this.f = ddhoVar;
    }

    @Override // defpackage.akeo
    public final void a(gga ggaVar, btlu btluVar) {
        ((bowq) btsq.b(bowq.class, ggaVar)).xw(this);
        ilo c = this.c.c();
        dbsk.s(c);
        dnqe e = this.d.e((dssr) dnqe.i.cu(7), dnqe.i);
        ReportAProblemWebViewCallbacks reportAProblemWebViewCallbacks = new ReportAProblemWebViewCallbacks(this.c, new bowv(c, e));
        bovv bovvVar = this.b;
        dbsk.s(bovvVar);
        String str = this.e;
        dnqb b = dnqb.b(e.b);
        if (b == null) {
            b = dnqb.UNKNOWN_ENTRY_POINT;
        }
        bvxu a = bovvVar.a(str, "aGmm.RAP.AddressLocation", b);
        bvvw bvvwVar = this.a;
        dbsk.s(bvvwVar);
        bvvwVar.p(a, reportAProblemWebViewCallbacks, this.f, 0);
    }

    @Override // defpackage.akeo
    public final void b(gga ggaVar, btlu btluVar) {
    }
}
