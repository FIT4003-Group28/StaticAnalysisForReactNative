package defpackage;

import android.view.View;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: egj  reason: default package */
/* loaded from: classes.dex */
public final class egj {
    public final egu a;
    private boolean b = false;

    public egj(ggc ggcVar) {
        this.a = new egu(ggcVar);
    }

    public final void A(@dzsi egf egfVar) {
        this.a.s = egfVar;
    }

    public final void B(boolean z) {
        this.a.i = z;
    }

    public final void C(@dzsi dbty<Integer> dbtyVar) {
        this.a.L = dbtyVar;
    }

    public final void D(int i) {
        this.a.G = i;
    }

    public final void E(dbty<Integer> dbtyVar) {
        this.a.H = dbtyVar;
    }

    public final void F(@dzsi View view) {
        egu eguVar = this.a;
        eguVar.K = view;
        eguVar.aF = 1;
    }

    public final void G(@dzsi View view, @dzsi int i) {
        egu eguVar = this.a;
        eguVar.K = view;
        eguVar.aF = i;
    }

    public final void H(@dzsi acyu acyuVar) {
        this.a.B = acyuVar;
    }

    public final void I(int i) {
        this.a.al = i;
    }

    public final void J(@dzsi egq egqVar) {
        this.a.am = egqVar;
    }

    public final void K(jjn jjnVar) {
        this.a.h = jjnVar;
    }

    public final void L(int i) {
        this.a.aE = i;
    }

    public final void M(@dzsi View view) {
        this.a.E = view;
    }

    public final void N(int i) {
        this.a.V = i;
    }

    public final void O(jjn jjnVar) {
        this.a.f = jjnVar;
    }

    public final void P(@dzsi cqiw<jar> cqiwVar) {
        this.a.ah = cqiwVar;
    }

    public final void Q(@dzsi jar jarVar) {
        this.a.ag = jarVar;
    }

    public final void R(@dzsi View view) {
        this.a.g = view;
    }

    public final void S(brav bravVar) {
        this.a.as = bravVar;
    }

    public final void T(jkc jkcVar) {
        this.a.k = jkcVar;
    }

    public final void U() {
        this.a.e = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <V extends izs> void V(cqiw<V> cqiwVar, V v) {
        egu eguVar = this.a;
        eguVar.b = cqiwVar;
        eguVar.c = v;
    }

    public final void W(@dzsi izs izsVar) {
        this.a.c = izsVar;
    }

    public final void X(@dzsi View view) {
        this.a.Y = view;
    }

    public final void Y(boolean z) {
        this.a.aa = z;
    }

    public final void Z() {
        this.a.ay = true;
    }

    public final egu a() {
        if (!this.b) {
            egu eguVar = this.a;
            boolean z = false;
            dbsk.m(eguVar.w || eguVar.p != null, "Slider view must be set unless there is a custom slider.");
            dbsk.m(eguVar.z, "Full screen view must be set.");
            dbsk.m(eguVar.K != null || !eguVar.aa || eguVar.L == null, "Can't set header height supplier without setting a header or showing the compass.");
            dbsk.m(eguVar.H == null || eguVar.G == 0, "Can't set both a header shadow height supplier and an explicit shadow height");
            dbsk.m(eguVar.aa || eguVar.ae != null, "Must specify a compass size if compass is to be shown.");
            dbsk.m(eguVar.P != null || eguVar.Q == null, "Can't set footer height supplier without setting a footer.");
            if (eguVar.y != null) {
                dbsk.m(eguVar.n == null, "Can't display the slider and full screen view at the same time.");
                dbsk.m(eguVar.B == null, "Can't display a full screen view and a home bottom sheet at the same time.");
                dbsk.m(eguVar.C == null, "Can't display a full screen view and a side panel at the same time.");
                if (!eguVar.A) {
                    dbsk.m(eguVar.aa, "Can't show compass on an opaque full screen view.");
                    dbsk.m(eguVar.ac == null, "Can't set compass position on an opaque full screen view.");
                }
            }
            if (eguVar.n != null) {
                dbsk.m(eguVar.B == null, "Can't display a slider and a home bottom sheet at the same time.");
                dbsk.m(eguVar.C == null, "Can't display a slider and a side panel at the same time.");
            }
            dbsk.m(eguVar.B == null || eguVar.C == null, "Can't display a home bottom sheet and a side panel at the same time.");
            dbsk.m(eguVar.y == null || !eguVar.ap, "Can't show crosshairs on a full screen view.");
            dbsk.m(eguVar.ag == null || eguVar.T == null, "Can't show the footer fab and an onMap fab at the same time");
            if (eguVar.ah != null) {
                dbsk.m(eguVar.ag != null, "Can't show floating action button layout with a null floating action button view model");
            }
            dbsk.m((eguVar.n == null && eguVar.y == null) || eguVar.T == null, "Can't show a footer fab if the slider or a full screen view are being displayed");
            dbsk.m(eguVar.p == null || eguVar.n == null, "Can't set slider view on a custom slider.");
            dbsk.m(eguVar.p == null || eguVar.t == null, "Can't set header height callable on a custom slider.");
            dbsk.m(eguVar.p == null || eguVar.u == null, "Can't set hidden height callable on a custom slider.");
            dbsk.m(eguVar.p == null || eguVar.v == null, "Can't set expanded height callable on a custom slider.");
            int i = eguVar.aF;
            if (i == 0 || i != 7 || eguVar.y != null) {
                z = true;
            }
            dbsk.m(z, "Can't display header over omnibox in non full screen view until animations are added");
            egu eguVar2 = this.a;
            this.b = true;
            return eguVar2;
        }
        throw new IllegalStateException();
    }

    public final void aa() {
        this.a.ap = true;
    }

    public final void ab(@dzsi cqss cqssVar) {
        this.a.aq = cqssVar;
    }

    public final void ac() {
        this.a.x = 1;
    }

    public final void ad(boolean z) {
        this.a.Z = z;
    }

    public final void ae(@dzsi glg glgVar, @dzsi int i) {
        egu eguVar = this.a;
        eguVar.C = glgVar;
        eguVar.aD = i;
    }

    public final void af(boolean z) {
        this.a.at = z;
    }

    public final void ag(@dzsi View view) {
        egu eguVar = this.a;
        eguVar.n = view;
        eguVar.w = true;
    }

    public final void ah(@dzsi cqjg cqjgVar) {
        this.a.r = cqjgVar;
    }

    public final void ai(jjn jjnVar) {
        this.a.j = jjnVar;
    }

    public final void aj(egn egnVar) {
        this.a.m = egnVar;
    }

    public final void ak(jkc jkcVar, jkc jkcVar2) {
        egu eguVar = this.a;
        eguVar.k = jkcVar;
        eguVar.l = jkcVar2;
    }

    public final void al(final int i) {
        this.a.u = new Callable(i) { // from class: egh
            private final int a;

            {
                this.a = i;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Integer.valueOf(this.a);
            }
        };
    }

    public final void am(Callable<Integer> callable) {
        this.a.u = callable;
    }

    public final void an() {
        this.a.ax = true;
    }

    public final void ao(boolean z) {
        this.a.aw = z;
    }

    public final void ap(int i) {
        this.a.aB = i;
    }

    public final void aq(cjmu cjmuVar) {
        this.a.J = cjmuVar;
    }

    public final void ar(boolean z) {
        this.a.d = z;
    }

    public final void as(@dzsi bxaz bxazVar) {
        this.a.ai = bxazVar;
    }

    public final void at(@dzsi View view) {
        l(view, false);
    }

    public final void au() {
        this.a.aA = true;
    }

    public final void av(@dzsi View view) {
        v(view, true, null);
    }

    public final void aw(@dzsi View view, boolean z) {
        v(view, z, null);
    }

    public final void ax(@dzsi glg glgVar) {
        ae(glgVar, 1);
    }

    public final void ay(@dzsi final View view, final int i) {
        this.a.t = new Callable(view, i) { // from class: egg
            private final View a;
            private final int b;

            {
                this.a = view;
                this.b = i;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                View view2 = this.a;
                View findViewById = view2 == null ? null : view2.findViewById(this.b);
                return Integer.valueOf(findViewById == null ? 0 : findViewById.getHeight());
            }
        };
        ag(view);
    }

    public final void az(@dzsi View view, Callable<Integer> callable) {
        this.a.t = callable;
        ag(view);
    }

    public final void b(View view) {
        this.a.ad.add(view);
    }

    public final void c(@dzsi View view) {
        this.a.ad.clear();
        if (view != null) {
            this.a.ad.add(view);
        }
    }

    public final void d(boolean z) {
        egu eguVar = this.a;
        int i = 1;
        if (true == z) {
            i = 2;
        }
        eguVar.ab = i;
    }

    public final void e(ecs ecsVar) {
        this.a.ao = ecsVar;
    }

    public final void f(boolean z) {
        this.a.D = z;
    }

    public final void g(@dzsi jar jarVar) {
        this.a.aj = jarVar;
    }

    public final void h() {
        this.a.az = true;
    }

    public final void i(@dzsi View view) {
        this.a.av = view;
    }

    public final void j(boolean z) {
        this.a.I = z;
    }

    public final void k(boolean z) {
        egu eguVar = this.a;
        int i = 1;
        if (true == z) {
            i = 2;
        }
        eguVar.U = i;
    }

    public final void l(@dzsi View view, boolean z) {
        egu eguVar = this.a;
        eguVar.W = view;
        eguVar.X = z;
    }

    public final void m(egk egkVar) {
        this.a.ac = egkVar;
    }

    public final void n(@dzsi View view) {
        egk egkVar = new egk();
        egkVar.a(view);
        this.a.ac = egkVar;
    }

    public final void o(cjxf cjxfVar) {
        this.a.ae = cjxfVar;
    }

    public final void p() {
        this.a.af = true;
    }

    public final void q(egl eglVar) {
        this.a.O = eglVar;
    }

    public final void r(@dzsi View view) {
        egu eguVar = this.a;
        eguVar.N = view;
        eguVar.O = null;
    }

    public final void s(@dzsi jke jkeVar) {
        this.a.p = jkeVar;
    }

    public final void t(jkh jkhVar) {
        this.a.o = jkhVar;
    }

    public final void u(int i) {
        this.a.aH = i;
    }

    public final void v(@dzsi View view, boolean z, @dzsi jar jarVar) {
        boolean z2 = true;
        if (view == null && jarVar != null) {
            z2 = false;
        }
        dbsk.a(z2);
        egu eguVar = this.a;
        eguVar.P = view;
        eguVar.R = z;
        eguVar.T = jarVar;
    }

    public final void w(@dzsi View view) {
        egu eguVar = this.a;
        eguVar.y = view;
        eguVar.z = true;
        if (view != null) {
            eguVar.aa = true;
        }
    }

    public final void x(egr egrVar) {
        this.a.F = egrVar;
    }

    public final void y(boolean z) {
        this.a.A = z;
    }

    public final void z(aliw aliwVar) {
        this.a.au = aliwVar;
    }
}
