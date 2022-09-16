package defpackage;

import android.text.Spanned;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.innertube.model.WatchNextResponseModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_AD_MEDIA_CONTROLS_BAR, b = apcd.SLOT_TYPE_LOCKSCREEN, d = {xaf.class, xai.class, xao.class, xat.class, xbh.class, xby.class})
/* renamed from: wqo  reason: default package */
/* loaded from: classes4.dex */
public final class wqo implements wqg, wlk {
    public final ankt a;
    private final wqf b;
    private final Executor c;
    private final wzx d;
    private final wll e;
    private final wly f;
    private final xdu g;
    private final xci h;
    private final MediaAd i;
    private final wzr j;
    private final PlayerResponseModel k;
    private final wzu l;
    private final xdb m;
    private final xgt n;
    private boolean o;

    public wqo(wqf wqfVar, Executor executor, wzx wzxVar, wll wllVar, wly wlyVar, xdu xduVar, xci xciVar) {
        wqfVar.getClass();
        this.b = wqfVar;
        executor.getClass();
        this.c = executor;
        wzxVar.getClass();
        this.d = wzxVar;
        wllVar.getClass();
        this.e = wllVar;
        wlyVar.getClass();
        this.f = wlyVar;
        this.g = xduVar;
        xciVar.getClass();
        this.h = xciVar;
        this.i = (MediaAd) xduVar.d(xbh.class);
        this.j = (wzr) xduVar.d(xaf.class);
        this.k = (PlayerResponseModel) xduVar.d(xat.class);
        this.l = (wzu) xduVar.d(xai.class);
        this.m = (xdb) xduVar.d(xao.class);
        this.a = (ankt) xduVar.d(xby.class);
        this.n = xgu.a();
    }

    @Override // defpackage.wqg
    public final xci a() {
        throw null;
    }

    @Override // defpackage.wqg
    public final void b() {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void f(aika aikaVar, PlayerResponseModel playerResponseModel, ajbf ajbfVar, String str, String str2) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void h(int i, String str) {
    }

    public final void i(ankt anktVar) {
        aozt aoztVar;
        arag aragVar;
        arag aragVar2;
        if (this.o) {
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
            avhn avhnVar = null;
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
            if (aoztVar == null) {
                return;
            }
            if ((aoztVar.b & 1) != 0) {
                aragVar = aoztVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            Spanned b = ajgl.b(aragVar);
            if ((aoztVar.b & 4) != 0) {
                aragVar2 = aoztVar.d;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            Spanned b2 = ajgl.b(aragVar2);
            if ((aoztVar.b & 64) != 0 && (avhnVar = aoztVar.g) == null) {
                avhnVar = avhn.a;
            }
            this.f.a(new xgs(b, b2, avhnVar));
        } catch (InterruptedException | ExecutionException unused) {
        }
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
        if (vyp.e(this.n, this.k.c(), this.i.c(), (int) j)) {
            this.f.b(this.l, 1);
        }
    }

    @Override // defpackage.wqg
    public final void qH() {
        this.e.c(this);
    }

    @Override // defpackage.wqg
    public final void qI() {
        this.e.a(this);
        vyp.c(this.n, this.d, this.i.w(), this.j, this.k, this.i.g(), this.m, this.i.aa(), this.i.c());
        this.f.d(this.i.g());
        this.f.b(this.l, this.n.f().d);
        if (this.a.isDone()) {
            i(this.a);
        } else {
            this.a.qY(new Runnable() { // from class: wqn
                @Override // java.lang.Runnable
                public final void run() {
                    wqo wqoVar = wqo.this;
                    wqoVar.i(wqoVar.a);
                }
            }, this.c);
        }
        this.b.a(this.g, this.h);
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        this.o = true;
        this.e.c(this);
        this.f.b(wzu.d, 3);
        this.f.c();
        this.b.d(this.g, this.h, i);
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }
}
