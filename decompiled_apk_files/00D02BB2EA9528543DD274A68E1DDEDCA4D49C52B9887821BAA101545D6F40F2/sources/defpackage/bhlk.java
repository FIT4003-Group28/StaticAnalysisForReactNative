package defpackage;

import android.app.Application;
import android.view.View;
import android.view.animation.AlphaAnimation;
/* compiled from: PG */
/* renamed from: bhlk  reason: default package */
/* loaded from: classes3.dex */
public final class bhlk {
    public static final AlphaAnimation a;
    private static final AlphaAnimation j;
    public final bwqv b;
    public final btrm c;
    public final dxio<brba> d;
    public final cklq e;
    @dzsi
    cqkf<jad> f;
    @dzsi
    public bwrs<ilo> g;
    public boolean h = false;
    public final bwrr<ilo> i = new bhli(this);
    private final Application k;

    static {
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(irf.c);
        alphaAnimation.setDuration(400L);
        alphaAnimation.setStartOffset(1000L);
        a = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setInterpolator(irf.b);
        alphaAnimation2.setDuration(400L);
        j = alphaAnimation2;
    }

    public bhlk(Application application, bwqv bwqvVar, btrm btrmVar, dxio<brba> dxioVar, cklq cklqVar, cqkj cqkjVar) {
        this.f = null;
        this.k = application;
        this.b = bwqvVar;
        this.c = btrmVar;
        this.d = dxioVar;
        this.e = cklqVar;
        cqkf<jad> c = cqkjVar.c(new brhp(), null);
        this.f = c;
        c.e(new bhlj(this));
        this.f.c().setVisibility(8);
    }

    public static boolean d(@dzsi ilo iloVar) {
        return (iloVar == null || iloVar.at() == null || iloVar.bg()) ? false : true;
    }

    public final View a() {
        cqkf<jad> cqkfVar = this.f;
        if (cqkfVar != null) {
            return cqkfVar.c();
        }
        return new View(this.k);
    }

    public final void b(boolean z, boolean z2) {
        View a2 = a();
        int i = 0;
        if (z == (a2.getVisibility() == 0)) {
            return;
        }
        if (z2) {
            a2.startAnimation(z ? a : j);
        }
        if (true != z) {
            i = 8;
        }
        a2.setVisibility(i);
    }

    @dzsi
    public final ilo c() {
        return (ilo) bwrs.b(this.g);
    }
}
