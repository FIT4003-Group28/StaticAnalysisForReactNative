package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.io.PrintWriter;
/* compiled from: PG */
/* renamed from: laf  reason: default package */
/* loaded from: classes7.dex */
public final class laf implements btph {
    public final kdg a;
    public final auax b;
    public final kxu c;
    @dzsi
    public final Runnable d;
    public final cqkf<lcy> e;
    public final lcy f;
    public final View g;
    public final View h;
    public final View i;
    @dzsi
    public ViewGroup j;
    public final kdf k = new lae(this);
    private final kyv l;

    public laf(cqkj cqkjVar, kdg kdgVar, kyv kyvVar, auax auaxVar, nqu nquVar, cqhn cqhnVar, kxu kxuVar, ksi ksiVar, boolean z) {
        Runnable runnable;
        this.a = kdgVar;
        this.l = kyvVar;
        this.b = auaxVar;
        dbsk.s(kxuVar);
        this.c = kxuVar;
        cqkf<lcy> e = cqkjVar.e(new lcf(nquVar));
        this.e = e;
        View c = e.c();
        this.g = c;
        this.h = c.findViewById(lbn.g);
        this.i = c.findViewById(lbn.s);
        ldj ldjVar = new ldj(cqkjVar.d, auaxVar.y, cqhnVar);
        this.f = ldjVar;
        if (z) {
            View findViewById = e.c().findViewById(lcf.a);
            dbsk.s(findViewById);
            final lct lctVar = new lct(ksiVar, ldjVar, kxuVar, findViewById, cqrp.d(10.0d).e(cqkjVar.d));
            runnable = new Runnable(lctVar) { // from class: lcr
                private final lct a;

                {
                    this.a = lctVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dclu g;
                    lct lctVar2 = this.a;
                    boolean b = bvox.b(lctVar2.d.getContext());
                    Rect[] c2 = lctVar2.b.c();
                    float x = b ? lctVar2.d.getX() + lctVar2.d.getWidth() : lctVar2.d.getX();
                    dcdc t = dcdc.t(c2);
                    lcq lcqVar = new lcq(b, x);
                    dcln dclnVar = dcln.a;
                    if (!b) {
                        g = dcmw.a.g(lco.a);
                    } else {
                        g = dclnVar.g(lcn.a);
                    }
                    Rect rect = (Rect) dcft.r(dcdc.w(g.h(dcmw.a.g(lcp.a)), dcft.i(t, lcqVar)), null);
                    if (rect != null) {
                        Rect n = lctVar2.b.n();
                        int i = n.bottom;
                        int i2 = n.top;
                        int i3 = rect.bottom;
                        lctVar2.a.a((((i - i2) - i3) - lctVar2.c.b(kxt.a)) + lctVar2.e);
                        return;
                    }
                    lctVar2.a.a(lctVar2.e);
                }
            };
        } else {
            runnable = null;
        }
        this.d = runnable;
    }

    private final void d(View view, boolean z) {
        view.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setInterpolator(this.l.a).setListener(new kyt(view));
        if (!z) {
            long duration = view.animate().getDuration();
            view.animate().setDuration(0L);
            view.animate().start();
            view.animate().setDuration(duration);
        }
    }

    private final void e(View view, boolean z) {
        view.animate().alpha(0.0f).scaleX(0.0f).scaleY(0.0f).setInterpolator(this.l.b).setListener(new kyu(view));
        if (!z) {
            long duration = view.animate().getDuration();
            view.animate().setDuration(0L);
            view.animate().start();
            view.animate().setDuration(duration);
        }
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    public final void a(boolean z) {
        if (this.a.a == kde.VISIBLE) {
            d(this.h, z);
            this.b.a(true);
            return;
        }
        e(this.h, z);
        this.b.a(false);
    }

    public final void b(boolean z) {
        if (this.a.a == kde.VISIBLE) {
            d(this.i, z);
        } else {
            e(this.i, z);
        }
    }
}
