package defpackage;

import android.widget.Toast;
import com.google.android.apps.gmm.reportaproblem.webview.ReportAProblemWebViewCallbacks;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bowc  reason: default package */
/* loaded from: classes3.dex */
public final class bowc implements aket {
    public static final dcqe a = dcqe.c("bowc");
    public final bowv b;
    public final bwrs<ilo> c;
    public transient bvvw d;
    public transient btvo e;
    public transient bwqv f;
    public transient ckcw g;
    public transient cqkj h;
    public transient gdc i;
    public transient bovv j;
    public transient boxa k;
    @dzsi
    private final bomu l;
    @dzsi
    private final String m;

    public bowc(bowv bowvVar, bwrs<ilo> bwrsVar, @dzsi bomu bomuVar, @dzsi String str) {
        this.b = bowvVar;
        this.c = bwrsVar;
        this.l = bomuVar;
        this.m = str;
    }

    public static bowc c(bowv bowvVar, bwrs<ilo> bwrsVar, @dzsi bomu bomuVar, @dzsi String str) {
        return new bowc(bowvVar, bwrsVar, bomuVar, str);
    }

    @Override // defpackage.akeo
    public final void a(final gga ggaVar, btlu btluVar) {
        List<dobq> list;
        String string;
        dbsg dbsgVar;
        int a2;
        ((bowd) btsq.b(bowd.class, ggaVar)).xv(this);
        if (this.m != null) {
            bvvr e = bvvs.e();
            bovv bovvVar = this.j;
            String str = this.m;
            dnqb b = dnqb.b(this.b.i().b);
            if (b == null) {
                b = dnqb.UNKNOWN_ENTRY_POINT;
            }
            e.b(bovvVar.b(str, "aGmm.RAP.NoPrefetch", b, ggaVar.getString(R.string.PLACE_SUGGEST_AN_EDIT)));
            bvvn bvvnVar = (bvvn) e;
            bvvnVar.b = new ReportAProblemWebViewCallbacks(this.c, this.b);
            bvvnVar.a = bovh.class;
            this.d.r(e.a(), dtya.bI);
            return;
        }
        ilo c = this.c.c();
        dbsk.s(c);
        if (c.cy() == null) {
            list = dcdc.e();
        } else {
            dobr cy = c.cy();
            dbsk.s(cy);
            list = cy.e;
        }
        if (c.ce() != doay.TYPE_ESTABLISHMENT || this.l != null || ((c.an() && !this.e.getUgcParameters().ab()) || list.size() <= 1)) {
            ilo c2 = this.c.c();
            dbsk.s(c2);
            if (c2.ce() == doay.TYPE_ROAD) {
                ggaVar.D(bpez.aR(this.b));
                return;
            } else {
                ggaVar.D(bpbw.g(this.b, this.c, this.f, this.l));
                return;
            }
        }
        ReportAProblemWebViewCallbacks reportAProblemWebViewCallbacks = new ReportAProblemWebViewCallbacks(this.c, this.b);
        ilo c3 = this.c.c();
        dbsk.s(c3);
        decs n = c3.ai().n();
        cqkf e2 = this.h.e(new boke());
        if (c3.bf().r) {
            string = ggaVar.getString(R.string.PLACE_SUGGEST_AN_EDIT_MERCHANT_LABEL);
        } else {
            string = ggaVar.getString(R.string.PLACE_SUGGEST_AN_EDIT);
        }
        e2.e(new bonx(string, c3.n(), true));
        gcz a3 = this.i.a();
        a3.i = cjtd.a(dtya.at);
        a3.c();
        cjta b2 = cjtd.b();
        b2.g = n;
        b2.d = dtya.T;
        a3.e(R.string.RAP_DIALOG_CANCEL_BUTTON, b2.a(), bovz.a);
        final gde a4 = a3.a();
        ((qy) a4).a.x = e2.c();
        ArrayList arrayList = new ArrayList();
        for (final dobq dobqVar : list) {
            int i = dobqVar.a;
            if (i == 1) {
                bvvr e3 = bvvs.e();
                bovv bovvVar2 = this.j;
                String str2 = dobqVar.a == 1 ? (String) dobqVar.b : "";
                dnqb b3 = dnqb.b(this.b.i().b);
                if (b3 == null) {
                    b3 = dnqb.UNKNOWN_ENTRY_POINT;
                }
                e3.b(bovvVar2.b(str2, "aGmm.RAP.NoPrefetch", b3, ggaVar.getString(R.string.PLACE_SUGGEST_AN_EDIT)));
                bvvn bvvnVar2 = (bvvn) e3;
                bvvnVar2.b = reportAProblemWebViewCallbacks;
                bvvnVar2.a = bovh.class;
                final bvxh m = this.d.m(e3.a(), true);
                Runnable runnable = new Runnable(this, a4, m, ggaVar) { // from class: bowb
                    private final bowc a;
                    private final qy b;
                    private final bvxh c;
                    private final gga d;

                    {
                        this.a = this;
                        this.b = a4;
                        this.c = m;
                        this.d = ggaVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        bowc bowcVar = this.a;
                        qy qyVar = this.b;
                        bvxh bvxhVar = this.c;
                        gga ggaVar2 = this.d;
                        qyVar.dismiss();
                        ((ckhe) bowcVar.g.a(ckjw.H)).a();
                        if (bvxhVar != null) {
                            bowcVar.d.q(bvxhVar, dtya.bI);
                            return;
                        }
                        bvoo.h("WebView failed to inflate.", new Object[0]);
                        Toast.makeText(ggaVar2, (int) R.string.UNKNOWN_ERROR, 0).show();
                    }
                };
                cjta b4 = cjtd.b();
                b4.g = n;
                b4.d = dtya.U;
                arrayList.add(new bony(dobqVar.c, dobqVar.d, dobqVar.e, runnable, b4.a()));
            } else {
                if (i != 2 || (a2 = dobp.a(((Integer) dobqVar.b).intValue())) == 0 || a2 != 2) {
                    dbsk.s(this.c.c());
                    if (dobqVar.a == 2) {
                        Integer num = (Integer) dobqVar.b;
                    }
                    dbsgVar = dbpy.a;
                } else {
                    Runnable runnable2 = new Runnable(this, a4, dobqVar, ggaVar) { // from class: bowa
                        private final bowc a;
                        private final qy b;
                        private final dobq c;
                        private final gga d;

                        {
                            this.a = this;
                            this.b = a4;
                            this.c = dobqVar;
                            this.d = ggaVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            int i2;
                            bowc bowcVar = this.a;
                            qy qyVar = this.b;
                            dobq dobqVar2 = this.c;
                            gga ggaVar2 = this.d;
                            qyVar.dismiss();
                            if (dobqVar2.a != 2 || (i2 = dobp.a(((Integer) dobqVar2.b).intValue())) == 0) {
                                i2 = 1;
                            }
                            int i3 = i2 - 1;
                            if (i3 == 1) {
                                ggaVar2.D(bpbw.g(bowcVar.b, bowcVar.c, bowcVar.f, null));
                            } else if (i3 != 2) {
                            } else {
                                bowcVar.k.s(bowcVar.c, bowcVar.b.i());
                            }
                        }
                    };
                    cjta b5 = cjtd.b();
                    b5.g = n;
                    b5.d = dtya.U;
                    dbsgVar = dbsg.i(new bony(dobqVar.c, dobqVar.d, dobqVar.e, runnable2, b5.a()));
                }
                if (dbsgVar.a()) {
                    arrayList.add((boqe) dbsgVar.b());
                }
            }
        }
        cqkf d = this.h.d(new boao(), null, false);
        d.e(new bonz(arrayList, false));
        a4.c(d.c());
        a4.show();
    }

    @Override // defpackage.akeo
    public final void b(gga ggaVar, btlu btluVar) {
    }
}
