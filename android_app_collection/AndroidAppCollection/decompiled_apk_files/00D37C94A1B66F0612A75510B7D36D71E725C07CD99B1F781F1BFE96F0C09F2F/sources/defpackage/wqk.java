package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import android.os.Bundle;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.google.android.libraries.youtube.ads.model.RemoteVideoAd;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_AD_MEDIA_CONTROLS_BAR_EXPANDABLE, b = apcd.SLOT_TYPE_FIXED_FOOTER, d = {xaf.class, xai.class, xao.class, xat.class, xbo.class, xby.class})
/* renamed from: wqk  reason: default package */
/* loaded from: classes4.dex */
public final class wqk implements wqg, wlk, xgo {
    public final ankt a;
    private final wqf b;
    private final Executor c;
    private final wzx d;
    private final xgp e;
    private final wll f;
    private final xdu g;
    private final xci h;
    private final RemoteVideoAd i;
    private final wzr j;
    private final PlayerResponseModel k;
    private final xdb l;
    private final xgt m;
    private boolean n;
    private aozt o;
    private final wmt p;
    private final adwd q;

    public wqk(wqf wqfVar, wzx wzxVar, xgp xgpVar, Executor executor, wll wllVar, wmt wmtVar, adwd adwdVar, xdu xduVar, xci xciVar) {
        wqfVar.getClass();
        this.b = wqfVar;
        wzxVar.getClass();
        this.d = wzxVar;
        xgpVar.getClass();
        this.e = xgpVar;
        executor.getClass();
        this.c = executor;
        wllVar.getClass();
        this.f = wllVar;
        wmtVar.getClass();
        this.p = wmtVar;
        adwdVar.getClass();
        this.q = adwdVar;
        this.g = xduVar;
        xciVar.getClass();
        this.h = xciVar;
        this.a = (ankt) xduVar.d(xby.class);
        this.i = (RemoteVideoAd) xduVar.d(xbo.class);
        this.j = (wzr) xduVar.d(xaf.class);
        this.k = (PlayerResponseModel) xduVar.d(xat.class);
        wzu wzuVar = (wzu) xduVar.d(xai.class);
        this.l = (xdb) xduVar.d(xao.class);
        this.m = xgu.a();
    }

    @Override // defpackage.wqg
    public final xci a() {
        throw null;
    }

    @Override // defpackage.wqg
    public final void b() {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void c(Bundle bundle) {
    }

    @Override // defpackage.xgo
    public final void d() {
        afw afwVar = new afw(1);
        afwVar.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this.e.a());
        Uri uri = this.i.q;
        if (uri != null) {
            aozt aoztVar = this.o;
            if (aoztVar == null || (aoztVar.b & 16) == 0) {
                this.p.c(aafr.f(uri), afwVar);
                return;
            }
            wmt wmtVar = this.p;
            apzg apzgVar = aoztVar.f;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            wmtVar.c(apzgVar, afwVar);
        }
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void e() {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void g(boolean z) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void i(xgb xgbVar) {
    }

    public final void j(ankt anktVar) {
        aozt aoztVar;
        arag aragVar;
        arag aragVar2;
        avhn avhnVar;
        if (this.n) {
            return;
        }
        try {
            WatchNextResponseModel watchNextResponseModel = (WatchNextResponseModel) anktVar.get();
            if (watchNextResponseModel == null) {
                return;
            }
            asgf asgfVar = watchNextResponseModel.a.f;
            if (asgfVar == null) {
                asgfVar = asgf.a;
            }
            if (asgfVar.b == 62960614) {
                asgf asgfVar2 = watchNextResponseModel.a.f;
                if (asgfVar2 == null) {
                    asgfVar2 = asgf.a;
                }
                if (asgfVar2.b == 62960614) {
                    aoztVar = (aozt) asgfVar2.c;
                } else {
                    aoztVar = aozt.a;
                }
            } else {
                aoztVar = null;
            }
            this.o = aoztVar;
            if (aoztVar == null) {
                return;
            }
            boolean z = true;
            if ((aoztVar.b & 1) != 0) {
                aragVar = aoztVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            Spanned b = ajgl.b(aragVar);
            aozt aoztVar2 = this.o;
            if ((aoztVar2.b & 4) != 0) {
                aragVar2 = aoztVar2.d;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            Spanned b2 = ajgl.b(aragVar2);
            aozt aoztVar3 = this.o;
            if ((aoztVar3.b & 64) != 0) {
                avhnVar = aoztVar3.g;
                if (avhnVar == null) {
                    avhnVar = avhn.a;
                }
            } else {
                avhnVar = null;
            }
            xgs xgsVar = new xgs(b, b2, avhnVar);
            boolean f = vyp.f(this.m, this.o, this.i.q, null);
            if ((this.o.b & 16384) == 0) {
                z = false;
            }
            adwd adwdVar = this.q;
            adwt adwtVar = (adwt) adwdVar.a.get();
            CharSequence charSequence = xgsVar.c;
            if (!TextUtils.equals(charSequence, adwtVar.i.f.b)) {
                adwe b3 = adwtVar.i.f.b();
                b3.b = charSequence;
                adwtVar.i(b3);
                adwtVar.b(3);
            }
            adwt adwtVar2 = (adwt) adwdVar.a.get();
            if (adwtVar2.b == f && adwtVar2.c == z) {
                return;
            }
            adwtVar2.b = f;
            adwtVar2.c = z;
            adwtVar2.b(0);
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void p() {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void q(int i, int i2) {
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
        if (vyp.e(this.m, this.k.c(), this.i.b, (int) j)) {
            this.q.a(1);
        }
    }

    @Override // defpackage.wqg
    public final void qH() {
        this.e.l(this);
        this.f.c(this);
    }

    @Override // defpackage.wqg
    public final void qI() {
        try {
            this.e.c(this);
        } catch (wlb e) {
            this.b.c(this.g, this.h, new wuo(e.getMessage()));
        }
        this.f.a(this);
        xgt xgtVar = this.m;
        wzx wzxVar = this.d;
        this.i.w();
        wzr wzrVar = this.j;
        PlayerResponseModel playerResponseModel = this.k;
        RemoteVideoAd remoteVideoAd = this.i;
        vyp.c(xgtVar, wzxVar, null, wzrVar, playerResponseModel, remoteVideoAd.r, this.l, remoteVideoAd.a, remoteVideoAd.b);
        adwd adwdVar = this.q;
        PlayerResponseModel playerResponseModel2 = this.i.r;
        if (playerResponseModel2 == null) {
            ((adwt) adwdVar.a.get()).d(null, null);
        } else {
            String A = playerResponseModel2.A();
            playerResponseModel2.b();
            ((adwt) adwdVar.a.get()).d(A, playerResponseModel2.b().e());
        }
        this.q.a(this.m.f().d);
        if (this.a.isDone()) {
            j(this.a);
        } else {
            this.a.qY(new Runnable() { // from class: wqj
                @Override // java.lang.Runnable
                public final void run() {
                    wqk wqkVar = wqk.this;
                    wqkVar.j(wqkVar.a);
                }
            }, this.c);
        }
        this.b.a(this.g, this.h);
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        this.n = true;
        this.e.l(this);
        this.f.c(this);
        this.q.a(3);
        ((adwt) this.q.a.get()).d(null, null);
        this.b.d(this.g, this.h, i);
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void r(DisplayMetrics displayMetrics, Rect rect, Rect rect2) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void t(boolean z) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void u(boolean z) {
    }
}
