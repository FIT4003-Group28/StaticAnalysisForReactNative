package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, b = apcd.SLOT_TYPE_IN_PLAYER, d = {xbh.class, xat.class, xai.class, xaf.class, xao.class, xby.class})
/* renamed from: wqe  reason: default package */
/* loaded from: classes4.dex */
public final class wqe implements wqg, wlk, wlv, xgo {
    private boolean A;
    private final wne B;
    private final wmt C;
    private final wmv D;
    public final ankt a;
    private final wqf d;
    private final aadd e;
    private final wll f;
    private final xgp g;
    private final wlw h;
    private final wkn i;
    private final wzx j;
    private final wxc k;
    private final wlh l;
    private final yni m;
    private final Executor n;
    private final aiji o;
    private final xdu p;
    private final xci q;
    private final MediaAd r;
    private final PlayerResponseModel s;
    private final wzu t;
    private final wzr u;
    private final xdb v;
    private boolean z;
    private int w = -1;
    private int x = -1;
    final xgt b = xgu.a();
    xgr c = xgr.a;
    private aozt y = null;

    public wqe(wqf wqfVar, aadd aaddVar, wkn wknVar, wzx wzxVar, wxc wxcVar, wmv wmvVar, wlh wlhVar, yni yniVar, Executor executor, aiji aijiVar, wmt wmtVar, xgp xgpVar, wlw wlwVar, wll wllVar, wne wneVar, xdu xduVar, xci xciVar) {
        this.d = wqfVar;
        this.e = aaddVar;
        this.k = wxcVar;
        this.f = wllVar;
        this.B = wneVar;
        this.C = wmtVar;
        this.g = xgpVar;
        this.h = wlwVar;
        this.i = wknVar;
        this.j = wzxVar;
        this.D = wmvVar;
        this.l = wlhVar;
        this.m = yniVar;
        this.n = executor;
        this.o = aijiVar;
        this.p = xduVar;
        this.q = xciVar;
        this.a = (ankt) xduVar.d(xby.class);
        this.r = (MediaAd) xduVar.d(xbh.class);
        this.s = (PlayerResponseModel) xduVar.d(xat.class);
        this.t = (wzu) xduVar.d(xai.class);
        this.u = (wzr) xduVar.d(xaf.class);
        this.v = (xdb) xduVar.d(xao.class);
    }

    private final void l() {
        if (wpt.h(this.c)) {
            this.D.a(new acte(this.c.d));
            this.c = wpt.f(this.c);
        }
    }

    @Override // defpackage.wqg
    public final xci a() {
        throw null;
    }

    @Override // defpackage.wqg
    public final void b() {
        apdq a = xrz.a(this.e);
        if ((a == null || !a.g) && TextUtils.isEmpty(this.r.n())) {
            this.d.c(this.p, this.q, new wuo("Got a non-yt hosted layout"));
        }
    }

    @Override // defpackage.xgo
    public final void c(Bundle bundle) {
        aozt aoztVar;
        xfk a = this.g.a();
        if (a == null) {
            return;
        }
        apzg E = this.r.E();
        if (E == null && (aoztVar = this.y) != null && (E = aoztVar.i) == null) {
            E = apzg.a;
        }
        if (E == null) {
            return;
        }
        afw afwVar = new afw(2);
        if (bundle != null) {
            afwVar.put("com.google.android.libraries.youtube.innertube.bundle", bundle);
        }
        afwVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", a);
        this.C.c(E, afwVar);
    }

    @Override // defpackage.xgo
    public final void d() {
        aozt aoztVar;
        afw afwVar = new afw(1);
        afwVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.g.a());
        if (this.r.r() != null || this.r.v() != null) {
            this.l.h();
            if (this.i.j) {
                this.m.d(new wxn());
            }
            apdq a = xrz.a(this.e);
            if (a != null && a.l && (aoztVar = this.y) != null && (aoztVar.b & 8) != 0) {
                arag aragVar = aoztVar.e;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
                if (aragVar.c.size() > 0) {
                    arag aragVar2 = this.y.e;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                    if ((((arai) aragVar2.c.get(0)).b & 512) != 0) {
                        wmt wmtVar = this.C;
                        arag aragVar3 = this.y.e;
                        if (aragVar3 == null) {
                            aragVar3 = arag.a;
                        }
                        apzg apzgVar = ((arai) aragVar3.c.get(0)).m;
                        if (apzgVar == null) {
                            apzgVar = apzg.a;
                        }
                        wmtVar.c(apzgVar, afwVar);
                    }
                }
            }
            aozt aoztVar2 = this.y;
            if (aoztVar2 == null || (aoztVar2.b & 16) == 0) {
                if (this.r.v() != null) {
                    this.C.c(this.r.v(), afwVar);
                } else {
                    this.C.c(aafr.f(this.r.r()), afwVar);
                }
            } else {
                wmt wmtVar2 = this.C;
                apzg apzgVar2 = aoztVar2.f;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                wmtVar2.c(apzgVar2, afwVar);
            }
        }
        if (!xrz.m(this.e) || this.r.s() == null) {
            return;
        }
        this.C.a(this.r.s().i, null);
    }

    @Override // defpackage.xgo
    public final void e() {
        if (this.r.g() == null) {
            wwf.b(this.p, this.q, "AdOverflowMenuClicked but MediaAd had no PlayerResponseModel.");
            return;
        }
        xfk a = this.g.a();
        aozs p = this.r.g().p();
        if (a == null || (p.b & 1) == 0) {
            return;
        }
        afw afwVar = new afw(1);
        afwVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", a);
        wmt wmtVar = this.C;
        apzg apzgVar = p.c;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        wmtVar.c(apzgVar, afwVar);
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r8 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
        if (r8 != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (r8 != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
        r1 = 3;
     */
    @Override // defpackage.xgo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(boolean r8) {
        /*
            r7 = this;
            xgt r0 = r7.b
            xhc r0 = r0.d()
            apnr r0 = r0.f
            if (r0 != 0) goto L14
            xdu r8 = r7.p
            xci r0 = r7.q
            java.lang.String r1 = "BrandInteraction tapped but no renderer available"
            defpackage.wwf.b(r8, r0, r1)
            return
        L14:
            int r1 = r0.c
            r2 = 20
            if (r1 != r2) goto L2f
            yni r1 = r7.m
            java.lang.Object r0 = r0.d
            aunb r0 = (defpackage.aunb) r0
            aopg r2 = com.google.protos.youtube.api.innertube.NotificationActionRendererOuterClass.notificationActionRenderer
            java.lang.Object r0 = r0.qm(r2)
            atoo r0 = (defpackage.atoo) r0
            aabj r0 = defpackage.aabj.a(r0)
            r1.d(r0)
        L2f:
            xgt r0 = r7.b
            xhc r1 = r0.d()
            xhb r2 = r1.a()
            r3 = 0
            r2.e(r3)
            int r1 = r1.g
            int r3 = r1 + (-1)
            if (r1 == 0) goto L6e
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L54
            if (r3 == r6) goto L50
            if (r3 == r5) goto L4d
            goto L59
        L4d:
            if (r8 == 0) goto L52
            goto L56
        L50:
            if (r8 == 0) goto L58
        L52:
            r1 = 1
            goto L59
        L54:
            if (r8 == 0) goto L58
        L56:
            r1 = 2
            goto L59
        L58:
            r1 = 3
        L59:
            r2.b(r1)
            xhc r8 = r2.a()
            r0.g = r8
            xgp r8 = r7.g
            xgt r0 = r7.b
            xgu r0 = r0.a()
            r8.p(r0)
            return
        L6e:
            r8 = 0
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wqe.g(boolean):void");
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.xgo
    public final void i(xgb xgbVar) {
        if (xgbVar != xgb.HIDE) {
            if (xgbVar != xgb.SKIP) {
                return;
            }
            this.z = false;
            this.t.e();
            return;
        }
        this.z = true;
        this.B.a.a();
        ajah ajahVar = this.B.a.q.a;
        if (ajahVar == null) {
            return;
        }
        ajahVar.A();
    }

    public final void j(ankt anktVar) {
        if (!this.A) {
            try {
                WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) anktVar.get();
                if (watchNextResponseModel == null) {
                    return;
                }
                asgf asgfVar = watchNextResponseModel.a.f;
                if (asgfVar == null) {
                    asgfVar = asgf.a;
                }
                aozt aoztVar = null;
                aozt aoztVar2 = asgfVar.b == 62960614 ? (aozt) asgfVar.c : null;
                if (aoztVar2 != null || this.r.v() != null || this.r.r() != null || this.r.E() != null) {
                    aoztVar = aoztVar2 == null ? aozt.a : aoztVar2;
                }
                this.y = aoztVar;
                if (aoztVar != null) {
                    if (vyp.f(this.b, aoztVar, this.r.r(), this.r.v())) {
                        this.g.p(this.b.a());
                    }
                    if (this.r.E() != null || (this.y.b & 16384) != 0) {
                        xgt xgtVar = this.b;
                        xgv a = xgtVar.b().a();
                        a.c(true);
                        xgtVar.c = a.a();
                    }
                }
                if (this.r.g() == null) {
                    wwf.b(this.p, this.q, "Expected MediaAd PlayerResponseModel not to be null.");
                    return;
                }
                if (this.r.g().p() != null && (this.r.g().p().b & 1) != 0) {
                    this.b.m(true);
                }
                this.g.g(this.y);
                this.g.p(this.b.a());
            } catch (Exception e) {
                wwf.b(this.p, this.q, e.toString());
            }
        }
    }

    @Override // defpackage.xgo
    public final void k() {
        xgt xgtVar = this.b;
        xgx a = xgtVar.c().a();
        a.b(false);
        xgtVar.f = a.a();
        xgt xgtVar2 = this.b;
        xhb a2 = xgtVar2.d().a();
        a2.c(false);
        xgtVar2.g = a2.a();
        this.g.p(this.b.a());
    }

    @Override // defpackage.xgo
    public final void p() {
        wzu wzuVar;
        if (this.b.f().d != 1 || (wzuVar = this.t) == null) {
            xdu xduVar = this.p;
            xci xciVar = this.q;
            int i = this.b.f().d;
            StringBuilder sb = new StringBuilder(65);
            sb.append("Skip ad was clicked but unable to process. skipState: ");
            sb.append(i);
            wwf.b(xduVar, xciVar, sb.toString());
            return;
        }
        wzuVar.d(this.w, this.x);
    }

    @Override // defpackage.xgo
    public final void q(int i, int i2) {
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qD(afkn afknVar) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qE(String str) {
    }

    @Override // defpackage.wlk
    public final void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        xgt xgtVar = this.b;
        boolean z5 = xgtVar.f().k;
        boolean z6 = true;
        boolean z7 = aijsVar2 == aijs.FULLSCREEN;
        if (z5 == z7) {
            z3 = false;
        } else {
            xhh a = xgtVar.f().a();
            a.h(z7);
            xgtVar.a = a.a();
            z3 = true;
        }
        xgt xgtVar2 = this.b;
        boolean z8 = xgtVar2.d().e;
        boolean z9 = aijsVar2 == aijs.FULLSCREEN;
        if (z8 == z9) {
            z4 = false;
        } else {
            xhb a2 = xgtVar2.d().a();
            a2.f(z9);
            xgtVar2.g = a2.a();
            z4 = true;
        }
        xgt xgtVar3 = this.b;
        boolean z10 = xgtVar3.c().c;
        boolean z11 = aijsVar2 == aijs.FULLSCREEN;
        if (z10 == z11) {
            z6 = false;
        } else {
            xgx a3 = xgtVar3.c().a();
            a3.e(z11);
            xgtVar3.f = a3.a();
        }
        if (z3 || z4 || z6) {
            this.g.p(this.b.a());
        }
        xgr c = wpt.c(this.c, aijsVar);
        this.c = c;
        if (c.j) {
            this.h.r(c.k, c.g);
            l();
        }
    }

    @Override // defpackage.wlk
    public final void qG(String str, long j, long j2, long j3, boolean z) {
        int i = (int) j;
        int i2 = (int) j3;
        xgt xgtVar = this.b;
        xgtVar.i(i);
        xgtVar.h((int) j2);
        xgtVar.j(i2);
        xgt xgtVar2 = this.b;
        xgv a = xgtVar2.b().a();
        a.d(i2 - i);
        xgtVar2.c = a.a();
        if (vyp.e(this.b, this.s.c(), this.r.c(), i)) {
            this.l.m();
            this.g.h(new wxp(1, this.t));
        }
        this.g.p(this.b.a());
        xgr a2 = wpt.a(this.c, j);
        this.c = a2;
        if (a2.j) {
            this.h.r(a2.k, a2.g);
            l();
        }
    }

    @Override // defpackage.wqg
    public final void qH() {
        this.g.l(this);
        this.f.c(this);
    }

    @Override // defpackage.wqg
    public final void qI() {
        aoob aoobVar;
        try {
            this.g.c(this);
            if (xrz.e(this.e)) {
                this.h.o(this);
            }
            this.f.a(this);
            vyp.c(this.b, this.j, this.r.w(), this.u, this.s, this.r.g(), this.v, this.r.aa(), this.r.c());
            xgt xgtVar = this.b;
            aijs g = this.o.g();
            apoj u = this.r.u();
            PlayerResponseModel g2 = this.r.g();
            if (u != null) {
                xgx b = xgy.b();
                b.f(u);
                b.d(true);
                if (g2 != null) {
                    asaj asajVar = g2.a;
                    b.b(wzz.a(asajVar.o) != null);
                    b.c((asajVar.b & 536870912) != 0);
                }
                b.e(g == aijs.FULLSCREEN);
                xgtVar.f = b.a();
            }
            xgt xgtVar2 = this.b;
            aijs g3 = this.o.g();
            apnr t = this.r.t();
            PlayerResponseModel g4 = this.r.g();
            boolean z = t != null;
            xhb b2 = xhc.b();
            if (z) {
                b2.h(t);
            }
            if (g4 != null) {
                asaj asajVar2 = g4.a;
                b2.c(wzz.a(asajVar2.o) != null);
                b2.d((asajVar2.b & 536870912) != 0);
            }
            b2.f(g3 == aijs.FULLSCREEN);
            b2.e(z);
            b2.g(!z);
            xgtVar2.g = b2.a();
            xgt xgtVar3 = this.b;
            wzr wzrVar = this.u;
            xgv b3 = xgw.b();
            b3.b(wzrVar);
            xgtVar3.c = b3.a();
            wpu.a(this.b);
            xgt xgtVar4 = this.b;
            MediaAd mediaAd = this.r;
            if (mediaAd instanceof LocalVideoAd) {
                LocalVideoAd localVideoAd = (LocalVideoAd) mediaAd;
                aoobVar = localVideoAd.k() != null ? localVideoAd.k().i : aoob.b;
            } else {
                aoobVar = aoob.b;
            }
            xgtVar4.n(aoobVar);
            if (this.q.i.h()) {
                xgt xgtVar5 = this.b;
                aopa createBuilder = asjj.a.createBuilder();
                createBuilder.copyOnWrite();
                asjj asjjVar = (asjj) createBuilder.instance;
                asjjVar.t = (asit) this.q.i.c();
                asjjVar.c |= 1024;
                xgtVar5.l((asjj) createBuilder.mo39build());
            }
            this.g.h(new wxp(this.b.f().d, this.t));
            this.g.p(this.b.a());
            if (xrz.e(this.e) && (this.r.g().a.b & 536870912) != 0) {
                aijs g5 = this.o.g();
                ario arioVar = this.r.g().a.D;
                if (arioVar == null) {
                    arioVar = ario.a;
                }
                xgr d = wpt.d(g5, arioVar);
                this.c = d;
                if (d.b.h()) {
                    this.h.p((aoqu) this.c.b.c());
                    this.h.q(false);
                }
            }
            if (this.a.isDone()) {
                j(this.a);
            } else {
                this.a.qY(new Runnable() { // from class: wqd
                    @Override // java.lang.Runnable
                    public final void run() {
                        wqe wqeVar = wqe.this;
                        wqeVar.j(wqeVar.a);
                    }
                }, this.n);
            }
            this.d.a(this.p, this.q);
        } catch (wlb e) {
            this.d.c(this.p, this.q, new wuo(e.getMessage()));
        }
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        this.A = true;
        wpt.g(this.c, this.k);
        if (this.z) {
            this.m.d(new xfh(1));
        }
        this.g.h(new wxp(3, wzu.d));
        this.b.k();
        this.g.p(this.b.a());
        this.h.g();
        this.g.l(this);
        this.f.c(this);
        this.d.d(this.p, this.q, i);
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlv
    public final void qL(Object obj, List list) {
        if (this.k.d(obj)) {
            if (!xrz.j(this.e)) {
                return;
            }
            wwf.a(this.p, "CTA Exp: click is blocked by debounce.");
            return;
        }
        this.c = wpt.b(this.c, obj);
        this.C.a(list, actk.h(obj, false));
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }

    @Override // defpackage.xgo
    public final void r(DisplayMetrics displayMetrics, Rect rect, Rect rect2) {
        if (rect2 != null) {
            this.l.n(zew.n(displayMetrics, rect2.left - rect.left), zew.n(displayMetrics, rect2.top - rect.top), zew.n(displayMetrics, rect2.width()), zew.n(displayMetrics, rect2.height()));
        }
    }

    @Override // defpackage.xgo
    public final void t(boolean z) {
        xgt xgtVar = this.b;
        if (z == xgtVar.e().a) {
            return;
        }
        xhe e = xgtVar.e();
        xhd a = xhe.a();
        a.c(e.a);
        a.b(e.b);
        a.d(e.c);
        a.c(z);
        xgtVar.d = a.a();
        this.g.p(this.b.a());
    }

    @Override // defpackage.xgo
    public final void u(boolean z) {
        if (vyp.d(this.b, z)) {
            this.g.p(this.b.a());
        }
    }
}
