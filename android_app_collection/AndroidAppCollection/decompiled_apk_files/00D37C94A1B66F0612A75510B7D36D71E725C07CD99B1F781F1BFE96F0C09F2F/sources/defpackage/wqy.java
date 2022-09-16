package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.AdIntro;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.LocalVideoAd;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.PriorityQueue;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_MEDIA, b = apcd.SLOT_TYPE_PLAYER_BYTES, c = {xbh.class, xbe.class, xaf.class}, d = {xas.class, xat.class})
/* renamed from: wqy  reason: default package */
/* loaded from: classes4.dex */
public final class wqy implements wra, wlq, wlk {
    public final wqz a;
    public final xci b;
    public final boolean c;
    wnd d;
    private final wkt e;
    private final aadd f;
    private final wll g;
    private final wlh h;
    private final wld i;
    private final yni j;
    private final xdu k;
    private final String l;
    private final InstreamAdBreak m;
    private final MediaAd n;
    private final wxs o;
    private boolean p;
    private boolean q;
    private aijs r;
    private final xcb s;
    private final PriorityQueue t;
    private final wmt u;
    private final wnp v;

    public wqy(wkt wktVar, wqz wqzVar, aadd aaddVar, wnp wnpVar, wll wllVar, wmt wmtVar, wlh wlhVar, wld wldVar, wzu wzuVar, yni yniVar, xdu xduVar, xci xciVar, boolean z, wnd wndVar) {
        PriorityQueue priorityQueue;
        this.e = wktVar;
        this.a = wqzVar;
        this.f = aaddVar;
        this.v = wnpVar;
        this.g = wllVar;
        this.u = wmtVar;
        this.h = wlhVar;
        this.i = wldVar;
        this.j = yniVar;
        this.k = xduVar;
        this.b = xciVar;
        String str = (String) xduVar.d(xas.class);
        this.l = str;
        InstreamAdBreak instreamAdBreak = (InstreamAdBreak) xciVar.e(xbe.class);
        this.m = instreamAdBreak;
        MediaAd mediaAd = (MediaAd) xciVar.e(xbh.class);
        this.n = mediaAd;
        this.c = z;
        this.d = wndVar;
        PlayerResponseModel playerResponseModel = (PlayerResponseModel) xduVar.d(xat.class);
        this.o = mediaAd instanceof AdIntro ? null : new wxs(yniVar, mediaAd, instreamAdBreak.b(), playerResponseModel, wzuVar, (wzr) xciVar.e(xaf.class));
        String str2 = mediaAd.l;
        this.s = new xcb(xcb.c(str, playerResponseModel, false), new wzw(true == TextUtils.isEmpty(str2) ? "" : str2));
        if (!xrz.m(aaddVar) || mediaAd.s() == null) {
            priorityQueue = new PriorityQueue();
        } else {
            priorityQueue = new PriorityQueue();
            for (apbf apbfVar : mediaAd.s().h) {
                xdl a = xdl.a(apbfVar, mediaAd.c() * 1000);
                if (a != null) {
                    priorityQueue.add(a);
                }
            }
        }
        this.t = priorityQueue;
    }

    private final boolean j(int i) {
        return i == 0 && (this.n instanceof LocalVideoAd) && !this.c;
    }

    @Override // defpackage.wqg
    public final xci a() {
        return this.b;
    }

    @Override // defpackage.wqg
    public final void b() {
        if (xrz.d(this.f)) {
            try {
                final PlayerResponseModel g = this.n.g();
                if (g != null) {
                    final wnd wndVar = this.d;
                    final String str = this.n.l;
                    final long a = this.m.a();
                    final ajfq e = ((ajbf) this.k.d(xbw.class)).e();
                    if (e == null) {
                        throw new wlb("Null playback timeline for Ad queue");
                    }
                    wndVar.a.execute(new Runnable() { // from class: wnc
                        @Override // java.lang.Runnable
                        public final void run() {
                            wnd wndVar2 = wnd.this;
                            ajfq ajfqVar = e;
                            String str2 = str;
                            PlayerResponseModel playerResponseModel = g;
                            long j = a;
                            ajfqVar.e(str2);
                            ajfqVar.C(j, j, null, ajfqVar.m(playerResponseModel, str2, 1));
                            wndVar2.b.execute(new wqq(ajfqVar, 1));
                        }
                    });
                    return;
                }
                throw new IllegalStateException("Null Ad PlayerResponse when attempting to queue");
            } catch (wlb e2) {
                wwf.a(this.k, e2.toString());
            }
        }
    }

    @Override // defpackage.wlk
    public final void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
        if (this.p && aikaVar.h() && TextUtils.equals(this.n.l, str2)) {
            wxs wxsVar = this.o;
            if (wxsVar != null) {
                wxsVar.b(aikaVar, str);
            }
            if (this.q || aikaVar != aika.INTERSTITIAL_PLAYING) {
                return;
            }
            this.q = true;
            if (xrz.m(this.f) && this.n.s() != null) {
                this.u.a(this.n.s().b, null);
            }
            this.e.b(this.s, this.k, this.b);
        }
    }

    @Override // defpackage.wlk
    public final void h(int i, String str) {
        if (this.p && xrz.m(this.f) && TextUtils.equals(str, this.n.l) && i == 4 && this.n.s() != null) {
            this.u.a(this.n.s().g, null);
        }
    }

    @Override // defpackage.wlq
    public final void i() {
        qJ(0);
        this.a.j(this.b);
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qD(afkn afknVar) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qE(String str) {
    }

    @Override // defpackage.wlk
    public final void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
        if (!this.p) {
            return;
        }
        if (this.r != aijs.FULLSCREEN && aijsVar == aijs.FULLSCREEN && xrz.m(this.f) && this.n.s() != null) {
            this.u.a(this.n.s().j, null);
        }
        this.r = aijsVar;
    }

    @Override // defpackage.wlk
    public final void qG(String str, long j, long j2, long j3, boolean z) {
        if (!xrz.m(this.f) || !this.p || !TextUtils.equals(str, this.n.l)) {
            return;
        }
        while (!this.t.isEmpty() && j >= ((xdl) this.t.peek()).a) {
            this.u.c(((xdl) this.t.poll()).b, null);
        }
    }

    @Override // defpackage.wqg
    public final void qH() {
    }

    @Override // defpackage.wqg
    public final void qI() {
        this.p = true;
        if (!xrz.m(this.f)) {
            this.h.d(this.l, this.m, this.n);
        }
        this.j.d(new wyb());
        this.g.a(this);
        if (!xrz.d(this.f) || this.v.a != null) {
            try {
                wnp wnpVar = this.v;
                PlayerResponseModel g = this.n.g();
                String str = this.n.l;
                ajey ajeyVar = wnpVar.a;
                if (ajeyVar == null) {
                    throw new wlb("Null interrupt when trying to play interstitial video");
                }
                wnn wnnVar = new wnn(this);
                ajeyVar.b();
                ajeyVar.c = wnnVar;
                ajeyVar.b.a.b(g, str);
                ajeyVar.a = true;
            } catch (wlb e) {
                this.a.i(new wuo(e.getMessage()));
            }
        }
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        wzq wzqVar;
        this.p = false;
        this.q = false;
        this.g.c(this);
        if ((this.n instanceof LocalVideoAd) && i != 4 && i != 1) {
            if (i == 0) {
                wzqVar = wzq.VIDEO_ENDED;
            } else if (i == 1) {
                wzqVar = wzq.VIDEO_ERROR;
            } else if (i != 2) {
                wzqVar = wzq.USER_MUTED;
            } else {
                wzqVar = wzq.USER_SKIPPED;
            }
            this.h.i(wzqVar);
            this.j.d(new wxo(this.n, wzqVar));
        }
        if (j(i)) {
            this.h.l();
        }
        if (xrz.m(this.f) && this.n.s() != null) {
            ArrayList arrayList = new ArrayList();
            if (i == 0) {
                while (!this.t.isEmpty()) {
                    arrayList.add(((xdl) this.t.poll()).b);
                }
                if (j(i)) {
                    arrayList.addAll(this.n.s().p);
                }
            } else if (i == 1) {
                arrayList.addAll(this.n.s().c);
            } else if (i == 2) {
                arrayList.addAll(this.n.s().f);
            } else if (i == 4) {
                arrayList.addAll(this.n.s().o);
            }
            if (!arrayList.isEmpty()) {
                this.u.a(arrayList, null);
            }
        }
        if (i != 4 && i != 1) {
            this.i.a(this.n);
        }
        this.h.a();
        wxs wxsVar = this.o;
        if (wxsVar != null) {
            wxsVar.a();
        }
        this.e.e(this.s, this.k, this.b, i);
    }

    @Override // defpackage.wlk
    public final void qK(String str, int i) {
        if (!xrz.d(this.f) || !this.p || i == 1) {
            return;
        }
        i();
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }
}
