package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.util.DisplayMetrics;
import com.google.android.libraries.lidar.VisibilityChangeEventData;
import com.google.android.libraries.youtube.ads.model.MediaAd;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
/* renamed from: wmd  reason: default package */
/* loaded from: classes4.dex */
public final class wmd implements wlg, xgo, wlk {
    private final wme a;
    private wzm b;

    public wmd(wme wmeVar) {
        this.a = wmeVar;
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void c(Bundle bundle) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void d() {
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
    public final void h(int i, String str) {
        wzm wzmVar = this.b;
        if (wzmVar == null) {
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            wzmVar.k();
        } else if (wzmVar.c) {
            wzmVar.l();
        } else {
            wzmVar.j();
            wzmVar.c = true;
        }
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void i(xgb xgbVar) {
    }

    @Override // defpackage.wlg
    public final tjt j() {
        wzm wzmVar = this.b;
        if (wzmVar != null) {
            return wzmVar.e;
        }
        return null;
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void k() {
    }

    @Override // defpackage.wlg
    public final tjt l(long j) {
        tjt tjtVar;
        wzm wzmVar = this.b;
        if (wzmVar == null) {
            wwf.a(null, "Ping migration null ActiveVieweClient on AdQuartileProgress");
            return null;
        }
        int i = 3;
        while (true) {
            if (i <= 0) {
                tjtVar = null;
                break;
            } else if (j >= (wzmVar.d * i) / 4) {
                tjtVar = wzmVar.f(i);
                break;
            } else {
                i--;
            }
        }
        if (tjtVar != null) {
            return tjtVar;
        }
        wwf.a(null, "Ping migration ActiveViewApi cannot process quartile update");
        return null;
    }

    @Override // defpackage.wlg
    public final void m(VisibilityChangeEventData visibilityChangeEventData) {
        wzm wzmVar = this.b;
        if (wzmVar != null) {
            wzmVar.o(visibilityChangeEventData);
        }
    }

    @Override // defpackage.wlg
    public final void n(DisplayMetrics displayMetrics, Rect rect, Rect rect2) {
        wzm wzmVar = this.b;
        if (wzmVar == null || rect == null || rect2 == null) {
            return;
        }
        wzmVar.r(zew.n(displayMetrics, rect2.left - rect.left), zew.n(displayMetrics, rect2.top - rect.top), zew.n(displayMetrics, rect2.width()), zew.n(displayMetrics, rect2.height()));
    }

    @Override // defpackage.wua
    public final void o(xdu xduVar, xci xciVar) {
        wme wmeVar = this.a;
        int a = wme.a(xduVar, xciVar);
        if (a != 1) {
            if (a != 2 || !xrz.b((aadd) wmeVar.a.get())) {
                return;
            }
        } else if (!xrz.m((aadd) wmeVar.a.get())) {
            return;
        }
        wzm wzmVar = this.b;
        wzm wzmVar2 = null;
        if (wzmVar != null) {
            if (wzmVar.g(xciVar).booleanValue()) {
                return;
            }
            this.b.n();
            this.b = null;
        }
        wme wmeVar2 = this.a;
        int a2 = wme.a(xduVar, xciVar);
        if (a2 == 1) {
            asop O = ((MediaAd) xciVar.e(xbh.class)).k.O();
            if (O.b) {
                tjq tjqVar = new tjq();
                boolean z = O.c;
                boolean z2 = O.d;
                boolean z3 = O.e;
                tjqVar.a = O.f;
                boolean z4 = O.g;
                tjqVar.b = O.h;
                tjqVar.c = O.i;
                wka a3 = ((wjy) wmeVar2.c.get()).a(tjqVar);
                if (a3 != null) {
                    wzmVar2 = new wzo(xciVar, (PlayerAd) xciVar.e(xbh.class), wmeVar2, wmeVar2.b.d().d() == aijs.FULLSCREEN, wmeVar2.b.d().d() == aijs.BACKGROUND, a3);
                }
            }
        } else if (a2 == 2) {
            atzv atzvVar = ((asaj) xciVar.e(xbl.class)).e;
            if (atzvVar == null) {
                atzvVar = atzv.a;
            }
            asop asopVar = atzvVar.n;
            if (asopVar == null) {
                asopVar = asop.a;
            }
            if (asopVar.b) {
                wzmVar2 = new wzn(xciVar, (asaj) xciVar.e(xbl.class), wmeVar2, (tjv) wmeVar2.d.get(), ((xdo) xciVar.e(xbn.class)).d);
            }
        }
        this.b = wzmVar2;
    }

    @Override // defpackage.xgo
    public final void p() {
        wzm wzmVar = this.b;
        if (wzmVar != null) {
            wzmVar.m();
        }
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void q(int i, int i2) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qD(afkn afknVar) {
    }

    @Override // defpackage.wlk
    public final void qE(String str) {
        wzm wzmVar = this.b;
        if (wzmVar != null) {
            wzmVar.p();
        }
    }

    @Override // defpackage.wlk
    public final void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
        wzm wzmVar = this.b;
        if (wzmVar == null) {
            return;
        }
        wzmVar.q(aijsVar);
    }

    @Override // defpackage.wlk
    public final void qG(String str, long j, long j2, long j3, boolean z) {
        wzm wzmVar = this.b;
        if (wzmVar != null) {
            wzmVar.b = j;
        }
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

    @Override // defpackage.wub
    public final void s(xdu xduVar, xci xciVar, int i) {
        wzm wzmVar = this.b;
        if (wzmVar == null || !wzmVar.g(xciVar).booleanValue()) {
            return;
        }
        if (i == 4) {
            this.b.h();
        } else if (i != 0) {
        } else {
            this.b.i();
        }
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void t(boolean z) {
    }

    @Override // defpackage.xgo
    public final /* synthetic */ void u(boolean z) {
    }

    @Override // defpackage.wud
    public final void v(xci xciVar) {
        wzm wzmVar = this.b;
        if (wzmVar == null || !wzmVar.g(xciVar).booleanValue()) {
            return;
        }
        this.b.n();
        this.b = null;
    }
}
