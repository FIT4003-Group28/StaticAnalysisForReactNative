package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atwo  reason: default package */
/* loaded from: classes2.dex */
public class atwo extends atss<crrf> {
    private final dpjl a;

    public atwo(crrf crrfVar, btrm btrmVar, cref crefVar, Context context, atcu atcuVar, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, atsr atsrVar, boolean z, btvo btvoVar) {
        super(crrfVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, 6000L);
        int a;
        int a2;
        dpjl dpjlVar = crrfVar.a;
        this.a = dpjlVar;
        cqtd b = b();
        if ((btvoVar.getDirectionsExperimentsParameters().h || (a2 = dpjk.a(crrfVar.a.d)) == 0 || a2 != 5) && ((a = dpjk.a(crrfVar.a.d)) == 0 || a != 8)) {
            int a3 = dpjk.a(crrfVar.a.d);
            if (a3 != 0 && a3 == 9) {
                b = e();
            }
        } else {
            b = d();
        }
        H(b);
        this.p = (dpjlVar.a & 32) != 0 ? dpjlVar.f : dpjlVar.e;
        a(dpjlVar, atcuVar);
        if (dpjlVar.g) {
            this.q = context.getString(R.string.ESTIMATED_TIME_OF_ARRIVAL, bvtb.k(context, crrfVar.c, crrfVar.d));
        }
        cjta b2 = cjtd.b();
        b2.b = dpjlVar.b;
        b2.g(dpjlVar.c);
        int a4 = dpjk.a(crrfVar.a.d);
        if (a4 == 0 || a4 != 5) {
            b2.d = dtxw.dj;
        } else {
            b2.d = dtxw.f18do;
        }
        this.v = b2.a();
    }

    public static cqtd d() {
        return nqu.aJ(2131232724, nql.ad);
    }

    public static cqtd e() {
        return iva.e(iup.f(R.raw.ic_checkpoint, nqo.x, nqo.x), iup.f(R.raw.ic_checkpoint_dark, nqo.x, nqo.x));
    }

    @Override // defpackage.atss, defpackage.atxz
    public atxx U() {
        return atxx.WAYPOINT_ALERT;
    }

    public cqtd b() {
        return nqu.aJ(2131232894, nql.ad);
    }

    @Override // defpackage.atss
    protected final crfj u() {
        return crfj.d(crfi.OTHER, this.a.e);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.atss
    public final void v() {
        cjqp g = this.l.g();
        cjta b = cjtd.b();
        dpjl dpjlVar = this.a;
        b.b = dpjlVar.b;
        b.g(dpjlVar.c);
        b.d = dtxw.dn;
        g.d(b.a());
    }

    public void a(dpjl dpjlVar, final atcu atcuVar) {
        int a = dpjk.a(dpjlVar.d);
        if (a == 0) {
            a = 1;
        }
        if (a - 1 != 4) {
            atsm R = R(false);
            R.f = atxv.EXIT;
            R.c = cqrt.l(R.string.NAV_BOTTOM_SHEET_EXIT_LABEL);
            R.g = new atsn(atcuVar) { // from class: atwn
                private final atcu a;

                {
                    this.a = atcuVar;
                }

                @Override // defpackage.atsn
                public final void a(boolean z) {
                    atcu atcuVar2 = this.a;
                    atcuVar2.k();
                    atcuVar2.Qa();
                }
            };
            R.h = cjtd.a(dtxw.dm);
            L(R.a());
        } else {
            if ((dpjlVar.a & 32) != 0) {
                this.q = dpjlVar.e;
                this.r = true;
            }
            atsm R2 = R(false);
            R2.f = atxv.EDIT;
            R2.c = cqrt.l(R.string.NAV_BOTTOM_SHEET_EDIT_LABEL);
            R2.g = new atsn(atcuVar) { // from class: atwm
                private final atcu a;

                {
                    this.a = atcuVar;
                }

                @Override // defpackage.atsn
                public final void a(boolean z) {
                    atcu atcuVar2 = this.a;
                    atcuVar2.k();
                    atcuVar2.Qa();
                }
            };
            R2.h = cjtd.a(dtxw.dl);
            L(R2.a());
        }
        atsm R3 = R(true);
        R3.f = atxv.NAVIGATE;
        R3.c = cqrt.l(R.string.CONTINUE_NAVIGATION_BUTTON_TEXT);
        R3.h = cjtd.a(dtxw.dk);
        L(R3.a());
    }
}
