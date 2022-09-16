package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, b = apcd.SLOT_TYPE_PLAYER_BYTES, c = {xbe.class, xbp.class, xbw.class}, d = {xaw.class, xbw.class, xat.class, xas.class, xae.class})
/* renamed from: wqr  reason: default package */
/* loaded from: classes4.dex */
public final class wqr implements wqg, wqz, wlk {
    public final Executor b;
    public final xdu c;
    public final List e;
    public final long f;
    public final aadd g;
    public ajfp[] h;
    private final wll i;
    private final wlh j;
    private final yni k;
    private final Executor l;
    private final xci m;
    private final wqf n;
    private final wkt o;
    private final xcb p;
    private wra q;
    private boolean r;
    public final AtomicReference a = new AtomicReference();
    public final List d = new ArrayList();

    public wqr(wll wllVar, wlh wlhVar, yni yniVar, Executor executor, Executor executor2, xdu xduVar, xci xciVar, wqf wqfVar, wkt wktVar, aeso aesoVar, aadd aaddVar) {
        this.i = wllVar;
        this.j = wlhVar;
        this.k = yniVar;
        this.l = executor;
        this.b = executor2;
        this.c = xduVar;
        this.m = xciVar;
        this.n = wqfVar;
        this.o = wktVar;
        this.p = xcb.a((String) xduVar.d(xas.class), (PlayerResponseModel) xduVar.d(xat.class));
        this.g = aaddVar;
        for (xci xciVar2 : (List) xciVar.e(xbp.class)) {
            this.d.add((MediaAd) xciVar2.e(xbh.class));
        }
        this.e = new ArrayList(this.d.size());
        long j = 0;
        for (MediaAd mediaAd : this.d) {
            j += TimeUnit.SECONDS.toMillis(mediaAd.c());
        }
        this.f = j;
        this.a.set(new xeg(aesoVar.a(), aesoVar.a() + aesoVar.d));
    }

    private final void k() {
        this.l.execute(new Runnable() { // from class: wqp
            @Override // java.lang.Runnable
            public final void run() {
                wqr wqrVar = wqr.this;
                xeg xegVar = (xeg) wqrVar.a.getAndSet(null);
                if (xegVar != null) {
                    ajfq e = ((ajbf) wqrVar.c.d(xbw.class)).e();
                    if (e == null) {
                        wwf.a(wqrVar.c, "Null playback timeline for DAI update");
                        return;
                    }
                    if (wqrVar.h == null) {
                        wqrVar.h = new ajfp[wqrVar.d.size()];
                        for (int i = 0; i < wqrVar.d.size(); i++) {
                            MediaAd mediaAd = (MediaAd) wqrVar.d.get(i);
                            wqrVar.h[i] = e.m(xda.a(mediaAd), mediaAd.l, 1);
                        }
                    }
                    try {
                        for (ajfp ajfpVar : wqrVar.h) {
                            e.e(ajfpVar.e);
                        }
                        long j = (xegVar.b - xegVar.a) - wqrVar.f;
                        apdq a = xrz.a(wqrVar.g);
                        if (a != null && a.k && j > 0) {
                            long j2 = xegVar.a;
                            e.C(j2, wqrVar.f + j2, ((aeso) wqrVar.c.d(xaw.class)).a, wqrVar.h);
                            return;
                        }
                        e.C(xegVar.a, xegVar.b, ((aeso) wqrVar.c.d(xaw.class)).a, wqrVar.h);
                        if (j >= 0) {
                            return;
                        }
                        long j3 = -j;
                        int size = wqrVar.d.size();
                        while (true) {
                            size--;
                            if (j3 <= 0 || size < 0) {
                                break;
                            }
                            MediaAd mediaAd2 = (MediaAd) wqrVar.d.get(size);
                            long millis = TimeUnit.SECONDS.toMillis(mediaAd2.c());
                            if (j3 >= millis) {
                                ajfp d = e.d(mediaAd2.l);
                                if (d == null || !d.d()) {
                                    e.e(mediaAd2.l);
                                } else {
                                    d.c(0L);
                                }
                            } else {
                                ajfp ajfpVar2 = wqrVar.h[size];
                                if (ajfpVar2 != null) {
                                    ajfpVar2.c(millis - j3);
                                }
                            }
                            j3 -= millis;
                        }
                    } finally {
                        wqrVar.b.execute(new wqq(e));
                    }
                }
            }
        });
    }

    @Override // defpackage.wqg
    public final xci a() {
        throw null;
    }

    @Override // defpackage.wqg
    public final void b() {
        k();
        for (xci xciVar : (List) this.m.e(xbp.class)) {
            this.o.f(this.p, this.c, xciVar);
        }
        this.i.a(this);
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wqz
    public final void i(wuo wuoVar) {
    }

    @Override // defpackage.wqz
    public final void j(xci xciVar) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qD(afkn afknVar) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qE(String str) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qG(String str, long j, long j2, long j3, boolean z) {
    }

    @Override // defpackage.wqg
    public final void qH() {
        for (xci xciVar : (List) this.m.e(xbp.class)) {
            this.o.u(xciVar);
        }
        this.i.c(this);
    }

    @Override // defpackage.wqg
    public final void qI() {
        this.r = true;
        this.j.c((InstreamAdBreak) this.m.e(xbe.class), (PlayerAd) ((wra) arey.s(this.e)).a().e(xbh.class));
        this.n.a(this.c, this.m);
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        this.r = false;
        this.j.e();
        this.n.d(this.c, this.m, i);
    }

    @Override // defpackage.wlk
    public final void qK(String str, int i) {
        if (i != 1) {
            if (this.q == null) {
                return;
            }
            this.k.d(new wyg("ad", "video"));
            this.q.qJ(0);
            this.q = null;
            return;
        }
        for (wra wraVar : this.e) {
            if (TextUtils.equals(((MediaAd) wraVar.a().e(xbh.class)).l, str)) {
                if (!this.r) {
                    wwf.b(this.c, this.m, "Trying to active SubLayoutRenderingAdapter without primary started");
                    return;
                }
                wra wraVar2 = this.q;
                if (wraVar2 != wraVar) {
                    this.k.d(new wyg(wraVar2 != null ? "ad" : "video", "ad"));
                    wra wraVar3 = this.q;
                    if (wraVar3 != null) {
                        wraVar3.qJ(0);
                    }
                    this.q = wraVar;
                    wraVar.qI();
                } else {
                    wwf.b(this.c, this.m, "SubLayoutRenderingAdapter has already been activated");
                    return;
                }
            }
        }
    }

    @Override // defpackage.wlk
    public final void qM(ahgc ahgcVar) {
        aeso a = ahgcVar.a();
        if (!TextUtils.equals(a.a, ((aeso) this.c.d(xaw.class)).a)) {
            return;
        }
        this.a.set(new xeg(a.a(), a.a() + a.d));
        k();
    }
}
