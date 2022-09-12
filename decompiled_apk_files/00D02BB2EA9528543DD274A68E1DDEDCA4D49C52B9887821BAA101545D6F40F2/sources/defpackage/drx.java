package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: drx  reason: default package */
/* loaded from: classes6.dex */
public final class drx {
    public final gga a;
    public final akox b;
    public final arbu c;
    public final btrm d;
    public final dnl e;
    public final czz f;
    public final FrameLayout g;
    public final FrameLayout h;
    public final dsr i;
    public final cpv j;
    public final cqkf<asuu> k;
    public final drw l;
    @dzsi
    public dzak m;
    @dzsi
    public alad n;
    @dzsi
    public amwd o;
    @dzsi
    public View p;
    @dzsi
    public dql q;
    private final ahjq r;
    private final gll s;
    private final btvo t;
    private final int u;

    public drx(gga ggaVar, btrm btrmVar, akox akoxVar, ahjq ahjqVar, araj arajVar, gll gllVar, cqkj cqkjVar, btvo btvoVar, dss dssVar, cpv cpvVar, czz czzVar) {
        dnl dnlVar = new dnl(ggaVar);
        this.l = new drw(this);
        this.q = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.a = ggaVar;
        this.d = btrmVar;
        this.e = dnlVar;
        this.b = akoxVar;
        this.r = ahjqVar;
        this.s = gllVar;
        this.t = btvoVar;
        akox a = dssVar.a.a();
        dss.a(a, 1);
        ahjq a2 = dssVar.b.a();
        dss.a(a2, 2);
        Executor a3 = dssVar.c.a();
        dss.a(a3, 3);
        btrm a4 = dssVar.d.a();
        dss.a(a4, 4);
        Resources a5 = dssVar.e.a();
        dss.a(a5, 5);
        this.i = new dsr(a, a2, a3, a4, a5);
        this.j = cpvVar;
        this.f = czzVar;
        this.c = arajVar.m();
        FrameLayout frameLayout = new FrameLayout(ggaVar);
        this.h = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(ggaVar);
        this.g = frameLayout2;
        this.u = ggaVar.getResources().getDimensionPixelSize(R.dimen.map_walking_circle_padding);
        frameLayout.addView(frameLayout2);
        czzVar.w(frameLayout);
        this.k = cqkjVar.c(new asra(), null);
    }

    public final void a(boolean z) {
        GmmLocation a = this.r.a();
        if (a != null) {
            dknv dknvVar = this.t.getAugmentedRealityParameters().a;
            if (dknvVar == null) {
                dknvVar = dknv.v;
            }
            dkgv dkgvVar = dknvVar.q;
            if (dkgvVar == null) {
                dkgvVar = dkgv.d;
            }
            akqq B = a.B();
            Point i = this.s.i();
            akqs k = akqo.k(B, 168.0d);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            int min = Math.min(i.x, i.y);
            int i2 = this.u;
            int i3 = min - (i2 + i2);
            this.a.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            double l = akqo.l(k, i3, i3, displayMetrics.density);
            float f = dkgvVar.a;
            alaf a2 = alai.a();
            a2.f = alah.LOCATION_AND_BEARING;
            a2.b = (float) l;
            a2.c = f;
            int height = this.f.a().getHeight();
            int l2 = this.f.l();
            a2.e = new alae(0.0f, (-((this.f.a().getHeight() - this.f.l()) - this.h.getHeight())) / (height - l2));
            this.c.j(a2.a(), !z);
        }
    }
}
