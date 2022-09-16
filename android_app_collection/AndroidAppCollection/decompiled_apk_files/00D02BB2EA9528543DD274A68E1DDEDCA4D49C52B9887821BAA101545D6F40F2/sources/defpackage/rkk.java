package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: rkk  reason: default package */
/* loaded from: classes7.dex */
public class rkk implements rjy {
    private static final rkj a;
    private static final rkj b;
    private static final rkj c;
    private static final rkj d;
    private static final dcdn<rkh, rkj> e;
    private final Activity f;
    private final dxio<ros> g;
    private final dxio<bvjj> h;
    private final dxio<cqat> i;
    @dzsi
    private final Runnable j;
    private rkf k;

    static {
        rki f = rkj.f();
        f.c(R.string.SET_HOME_NUDGE_PROMPT_TITLE);
        f.b(R.string.SET_HOME_NUDGE_PROMPT_DESCRIPTION);
        rkd rkdVar = (rkd) f;
        rkdVar.a = dtxl.ay;
        rkdVar.b = k(dtxl.az);
        rkdVar.c = cqrt.g(2131232714, ibm.p());
        rkj a2 = f.a();
        a = a2;
        rki f2 = rkj.f();
        f2.c(R.string.SET_WORK_NUDGE_PROMPT_TITLE);
        f2.b(R.string.SET_WORK_NUDGE_PROMPT_DESCRIPTION);
        rkd rkdVar2 = (rkd) f2;
        rkdVar2.a = dtxl.bo;
        rkdVar2.b = k(dtxl.bp);
        rkdVar2.c = cqrt.g(2131232988, ibm.p());
        rkj a3 = f2.a();
        b = a3;
        rki f3 = rkj.f();
        f3.c(R.string.SET_ROUTE_TO_WORK_NUDGE_PROMPT_TITLE);
        f3.b(R.string.SET_ROUTE_NUDGE_PROMPT_DESCRIPTION);
        rkd rkdVar3 = (rkd) f3;
        rkdVar3.a = dtxl.aM;
        rkdVar3.b = k(dtxl.aN);
        rkdVar3.c = cqrt.g(2131232673, ibm.p());
        rkj a4 = f3.a();
        c = a4;
        rki f4 = rkj.f();
        f4.c(R.string.SET_ROUTE_TO_HOME_NUDGE_PROMPT_TITLE);
        f4.b(R.string.SET_ROUTE_NUDGE_PROMPT_DESCRIPTION);
        rkd rkdVar4 = (rkd) f4;
        rkdVar4.a = dtxl.aK;
        rkdVar4.b = k(dtxl.aL);
        rkdVar4.c = cqrt.g(2131232673, ibm.p());
        rkj a5 = f4.a();
        d = a5;
        dcdg p = dcdn.p();
        p.f(rkh.SET_HOME, a2);
        p.f(rkh.SET_WORK, a3);
        p.f(rkh.ROUTE_TO_WORK, a4);
        p.f(rkh.ROUTE_TO_HOME, a5);
        rki f5 = rkj.f();
        f5.c(R.string.STALE_HOME_NUDGE_PROMPT_TITLE);
        f5.b(R.string.STALE_HOME_NUDGE_PROMPT_DESCRIPTION);
        rkd rkdVar5 = (rkd) f5;
        rkdVar5.c = cqrt.g(2131232714, ibm.p());
        rkdVar5.a = dtxl.aV;
        rkdVar5.b = k(dtxl.aW);
        rkj a6 = f5.a();
        rki f6 = rkj.f();
        f6.c(R.string.VAGUE_HOME_NUDGE_PROMPT_TITLE);
        f6.b(R.string.VAGUE_HOME_NUDGE_PROMPT_DESCRIPTION);
        rkd rkdVar6 = (rkd) f6;
        rkdVar6.c = cqrt.g(2131232714, ibm.p());
        rkdVar6.a = dtxl.bk;
        rkdVar6.b = k(dtxl.bl);
        rkj a7 = f6.a();
        rki f7 = rkj.f();
        f7.c(R.string.STALE_WORK_NUDGE_PROMPT_TITLE);
        f7.b(R.string.STALE_WORK_NUDGE_PROMPT_DESCRIPTION);
        rkd rkdVar7 = (rkd) f7;
        rkdVar7.c = cqrt.g(2131232988, ibm.p());
        rkdVar7.a = dtxl.aX;
        rkdVar7.b = k(dtxl.aY);
        rkj a8 = f7.a();
        rki f8 = rkj.f();
        f8.c(R.string.VAGUE_WORK_NUDGE_PROMPT_TITLE);
        f8.b(R.string.VAGUE_WORK_NUDGE_PROMPT_DESCRIPTION);
        rkd rkdVar8 = (rkd) f8;
        rkdVar8.c = cqrt.g(2131232988, ibm.p());
        rkdVar8.a = dtxl.bm;
        rkdVar8.b = k(dtxl.bn);
        rkj a9 = f8.a();
        p.f(rkh.STALE_HOME, a6);
        p.f(rkh.VAGUE_HOME, a7);
        p.f(rkh.STALE_WORK, a8);
        p.f(rkh.VAGUE_WORK, a9);
        e = p.b();
    }

    public rkk(Activity activity, rkg rkgVar, dxio<ros> dxioVar, dxio<bvjj> dxioVar2, dxio<cqat> dxioVar3, @dzsi Runnable runnable, qvb qvbVar) {
        this.f = activity;
        this.g = dxioVar;
        this.h = dxioVar2;
        this.i = dxioVar3;
        this.j = runnable;
        this.k = rkgVar.a(qvbVar);
    }

    @dzsi
    public static ddho i(@dzsi rkh rkhVar) {
        if (rkhVar == null) {
            return null;
        }
        rkj rkjVar = e.get(rkhVar);
        dbsk.s(rkjVar);
        return rkjVar.c();
    }

    private final void j(bvjk bvjkVar) {
        this.h.a().Z(bvjkVar, this.i.a().b());
    }

    @dzsi
    private static cjtd k(@dzsi ddho ddhoVar) {
        if (ddhoVar == null) {
            return null;
        }
        return cjtd.a(ddhoVar);
    }

    private final void l(ror rorVar) {
        boolean z = true;
        if (rorVar != ror.HOME && rorVar != ror.WORK) {
            z = false;
        }
        dbsk.b(z, "Only home/work edit page is allowed from stale/vague home/work nudge bar.");
        this.g.a().s(dcdc.f(rorVar), false, false);
    }

    @Override // defpackage.rjy
    @dzsi
    public cjtd a() {
        return k(i(((rkc) this.k).a));
    }

    @Override // defpackage.rjy
    public cqkl b() {
        rkh rkhVar = ((rkc) this.k).a;
        if (rkhVar != null) {
            switch (rkhVar.ordinal()) {
                case 0:
                    this.g.a().n(ror.HOME);
                    break;
                case 1:
                    this.g.a().n(ror.WORK);
                    break;
                case 2:
                case 3:
                    l(ror.HOME);
                    j(bvjk.ih);
                    break;
                case 4:
                case 5:
                    l(ror.WORK);
                    j(bvjk.ih);
                    break;
                case 6:
                    this.g.a().o(dndr.WORK);
                    break;
                case 7:
                    this.g.a().o(dndr.HOME);
                    break;
            }
        }
        return cqkl.a;
    }

    @Override // defpackage.rjy
    public cqkl c() {
        rkh rkhVar = ((rkc) this.k).a;
        if (rkhVar != null) {
            switch (rkhVar.ordinal()) {
                case 0:
                case 1:
                    j(bvjk.ig);
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    j(bvjk.ii);
                    break;
                case 6:
                case 7:
                    j(bvjk.ij);
                    break;
            }
        }
        this.k = rkf.d(null, 3);
        this.j.run();
        return cqkl.a;
    }

    @Override // defpackage.rjy
    @dzsi
    public cqtd d() {
        rkh rkhVar = ((rkc) this.k).a;
        if (rkhVar == null) {
            return null;
        }
        rkj rkjVar = e.get(rkhVar);
        dbsk.s(rkjVar);
        return rkjVar.e();
    }

    @Override // defpackage.rjy
    @dzsi
    public String e() {
        rkh rkhVar = ((rkc) this.k).a;
        if (rkhVar == null) {
            return null;
        }
        Activity activity = this.f;
        rkj rkjVar = e.get(rkhVar);
        dbsk.s(rkjVar);
        return activity.getString(rkjVar.a());
    }

    @Override // defpackage.rjy
    @dzsi
    public String f() {
        rkh rkhVar = ((rkc) this.k).a;
        if (rkhVar == null) {
            return null;
        }
        Activity activity = this.f;
        rkj rkjVar = e.get(rkhVar);
        dbsk.s(rkjVar);
        return activity.getString(rkjVar.b());
    }

    @Override // defpackage.rjy
    @dzsi
    public cjtd g() {
        rkh rkhVar = ((rkc) this.k).a;
        if (rkhVar == null) {
            return null;
        }
        rkj rkjVar = e.get(rkhVar);
        dbsk.s(rkjVar);
        return rkjVar.d();
    }

    public boolean h() {
        return !this.k.c();
    }
}
