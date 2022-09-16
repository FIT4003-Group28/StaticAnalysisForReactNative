package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_COMPOSITE_PLAYER_BYTES, b = apcd.SLOT_TYPE_PLAYER_BYTES, c = {xbe.class, xbp.class}, d = {xat.class, xbw.class, xas.class})
/* renamed from: wqv  reason: default package */
/* loaded from: classes4.dex */
public final class wqv implements wqg, wqz, wlk {
    public final List a;
    public int b;
    public final wnf c;
    private final wqf d;
    private final wkt e;
    private final wll f;
    private final wlh g;
    private final xdu h;
    private final xci i;
    private final InstreamAdBreak j;
    private final List k;
    private final PlayerResponseModel l;
    private final String m;
    private final Executor n;
    private final wqu o;
    private final xcb p;
    private final wvk q;

    public wqv(wqf wqfVar, wkt wktVar, wll wllVar, wvk wvkVar, wlh wlhVar, wnf wnfVar, xdu xduVar, xci xciVar, PlayerResponseModel playerResponseModel, Executor executor) {
        xeg xegVar;
        this.d = wqfVar;
        this.e = wktVar;
        this.f = wllVar;
        this.q = wvkVar;
        this.g = wlhVar;
        this.c = wnfVar;
        this.h = xduVar;
        this.i = xciVar;
        this.j = (InstreamAdBreak) xciVar.e(xbe.class);
        List list = (List) xciVar.e(xbp.class);
        this.k = list;
        this.l = playerResponseModel;
        this.m = (String) xduVar.d(xas.class);
        this.n = executor;
        this.a = new ArrayList(list.size());
        wqu wquVar = null;
        if (!list.isEmpty()) {
            int i = 0;
            if (((xci) list.get(0)).f(xbh.class)) {
                MediaAd mediaAd = (MediaAd) ((xci) list.get(0)).e(xbh.class);
                amuk amukVar = xduVar.d;
                int i2 = ((amxx) amukVar).c;
                while (true) {
                    if (i >= i2) {
                        xegVar = null;
                        break;
                    }
                    xek xekVar = (xek) amukVar.get(i);
                    i++;
                    if (xekVar instanceof xcz) {
                        long j = ((xcz) xekVar).d.a;
                        xegVar = new xeg((-15000) + j, j);
                        break;
                    }
                }
                if (xegVar != null) {
                    wquVar = new wqu(this, mediaAd, xegVar);
                }
            }
        }
        this.o = wquVar;
        this.b = -1;
        this.p = xcb.a(this.m, (PlayerResponseModel) xduVar.d(xat.class));
    }

    private final boolean l() {
        int i = this.b;
        return i >= 0 && i < this.k.size();
    }

    @Override // defpackage.wqg
    public final xci a() {
        throw null;
    }

    @Override // defpackage.wqg
    public final void b() {
        for (wra wraVar : this.a) {
            wraVar.b();
        }
        for (xci xciVar : this.k) {
            this.e.f(this.p, this.h, xciVar);
        }
        if (this.o != null) {
            this.f.a(this);
        }
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.wqz
    public final void i(wuo wuoVar) {
        this.d.c(this.h, this.i, wuoVar);
    }

    @Override // defpackage.wqz
    public final void j(xci xciVar) {
        if (l()) {
            if (!TextUtils.equals(xciVar.a, ((xci) this.k.get(this.b)).a)) {
                this.d.c(this.h, this.i, new wuo("Exited subLayout when a different subLayout was anticipated to be playing"));
                return;
            } else {
                k();
                return;
            }
        }
        this.d.c(this.h, this.i, new wuo("Exited subLayout when currIndex not valid"));
    }

    public final void k() {
        this.b++;
        if (!l()) {
            this.q.b(this.i, 0);
            return;
        }
        wra wraVar = (wra) this.a.get(this.b);
        if (this.b == 0) {
            this.d.a(this.h, this.i);
            this.g.g(this.j);
        }
        wraVar.qI();
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
    public final void qG(String str, long j, long j2, long j3, boolean z) {
        float f;
        PlayerResponseModel playerResponseModel;
        if (this.o != null && TextUtils.equals(str, this.m)) {
            wqu wquVar = this.o;
            if (wquVar.d.b != -1 || wquVar.c || !wquVar.b.a(j)) {
                return;
            }
            wquVar.c = true;
            wnf wnfVar = wquVar.d.c;
            MediaAd mediaAd = wquVar.a;
            if (mediaAd.g() == null) {
                f = 0.0f;
            } else {
                aubr aubrVar = mediaAd.g().c().c.F;
                if (aubrVar == null) {
                    aubrVar = aubr.a;
                }
                f = aubrVar.b;
            }
            if (mediaAd.g() != null) {
                playerResponseModel = mediaAd.g();
            } else if (mediaAd.e() == null || mediaAd.f() == null) {
                playerResponseModel = null;
            } else {
                PlayerConfigModel playerConfigModel = mediaAd.k;
                playerResponseModel = new PlayerResponseModel(mediaAd.e(), mediaAd.f(), mediaAd.k);
            }
            if (playerResponseModel == null || f <= 0.0f || ((Boolean) wnfVar.b.getAndSet(true)).booleanValue()) {
                return;
            }
            ((aego) wnfVar.a.get()).a(playerResponseModel, 0L, f * 1000.0f, wnfVar);
        }
    }

    @Override // defpackage.wqg
    public final void qH() {
        for (xci xciVar : this.k) {
            this.e.u(xciVar);
        }
        this.f.c(this);
    }

    @Override // defpackage.wqg
    public final void qI() {
        if (this.j.b() == xdb.POST_ROLL) {
            this.n.execute(new Runnable() { // from class: wqt
                @Override // java.lang.Runnable
                public final void run() {
                    wqv wqvVar = wqv.this;
                    if (wqvVar.b != -2) {
                        wqvVar.k();
                    }
                }
            });
        } else {
            k();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0037  */
    @Override // defpackage.wqg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qJ(int r4) {
        /*
            r3 = this;
            boolean r0 = r3.l()
            if (r0 == 0) goto L11
            java.util.List r0 = r3.a
            int r1 = r3.b
            java.lang.Object r0 = r0.get(r1)
            wra r0 = (defpackage.wra) r0
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto L17
            r0.qJ(r4)
        L17:
            wll r0 = r3.f
            r0.c(r3)
            r0 = -2
            r3.b = r0
            r0 = 2
            if (r4 == 0) goto L28
            r1 = 4
            if (r4 == r1) goto L28
            if (r4 != r0) goto L2d
            r4 = 2
        L28:
            wlh r1 = r3.g
            r1.f()
        L2d:
            com.google.android.libraries.youtube.ads.model.InstreamAdBreak r1 = r3.j
            xdb r1 = r1.b()
            xdb r2 = defpackage.xdb.PRE_ROLL
            if (r1 != r2) goto L49
            r1 = 3
            if (r4 == 0) goto L3f
            if (r4 == r0) goto L3f
            if (r4 != r1) goto L49
            r4 = 3
        L3f:
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r0 = r3.l
            com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel$MutableContext r0 = r0.d
            r1 = 1
            java.lang.String r2 = "PREROLL_SHOWN"
            r0.a(r2, r1)
        L49:
            wqf r0 = r3.d
            xdu r1 = r3.h
            xci r2 = r3.i
            r0.d(r1, r2, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqv.qJ(int):void");
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }
}
