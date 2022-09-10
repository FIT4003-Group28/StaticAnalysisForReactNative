package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: blys  reason: default package */
/* loaded from: classes3.dex */
final class blys implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ blyt b;

    public blys(blyt blytVar, View view) {
        this.b = blytVar;
        this.a = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        blyt blytVar = this.b;
        blytVar.c.m = null;
        if (blytVar.a) {
            View view = this.a;
            View d = cqkx.d(view, bltv.a);
            View d2 = cqkx.d(view, bltv.b);
            View d3 = cqkx.d(view, bltv.c);
            View d4 = cqkx.d(view, bltv.e);
            View d5 = cqkx.d(view, bltv.f);
            View d6 = cqkx.d(view, bltv.d);
            View d7 = cqkx.d(view, blsw.a);
            View d8 = cqkx.d(view, blsw.b);
            View d9 = cqkx.d(view, blsw.c);
            View d10 = cqkx.d(view, bltv.i);
            if (d != null) {
                blyv.aB(d, 500L, 500L, irf.a).start();
            }
            if (d2 != null) {
                blyv.aB(d2, 500L, 500L, irf.a).start();
            }
            if (d3 != null) {
                blyv.aB(d3, 500L, 500L, irf.a).scaleY(1.0f).start();
            }
            if (d4 != null) {
                blyv.aB(d4, 533L, 333L, irf.a).scaleX(1.0f).scaleY(1.0f).start();
            }
            if (d5 != null) {
                blyv.aB(d5, 599L, 366L, irf.a).scaleX(1.0f).scaleY(1.0f).start();
            }
            if (d6 != null) {
                blyv.aB(d6, 665L, 399L, irf.b).alpha(1.0f).start();
            }
            if (d7 != null) {
                blyv.aB(d7, 665L, 333L, irf.b).alpha(1.0f).start();
            }
            if (d8 != null) {
                blyv.aB(d8, 731L, 366L, irf.b).alpha(1.0f).start();
            }
            if (d9 != null) {
                blyv.aB(d9, 797L, 399L, irf.b).alpha(1.0f).start();
            }
            if (d10 == null) {
                return;
            }
            d10.setClickable(false);
            blyv.aB(d10, 797L, 350L, irf.a).alpha(1.0f).withEndAction(new blyu(d10)).start();
        }
    }
}
