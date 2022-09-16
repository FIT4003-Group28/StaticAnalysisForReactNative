package defpackage;

import android.text.TextUtils;
import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ab;
import com.google.android.libraries.youtube.ads.model.ForecastingAd;
import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.ads.model.PlayerAd;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xiw  reason: default package */
/* loaded from: classes4.dex */
public final class xiw implements wlh {
    public final Map a = new HashMap();
    public final Map b = new HashMap();
    public xip c;
    public volatile xiu d;
    private final afzo e;
    private final xis f;
    private final xix g;
    private final xfc h;

    public xiw(afzo afzoVar, xix xixVar, xis xisVar, xfc xfcVar, airw airwVar, aynx aynxVar) {
        this.e = afzoVar;
        this.g = xixVar;
        this.f = xisVar;
        this.h = xfcVar;
        airwVar.G().d.aa(new xiv(this, 2), ab.p);
        airwVar.G().a.aa(new xiv(this), ab.p);
        airwVar.G().i.aa(new xiv(this, 4), ab.p);
        aynxVar.n().O(ona.p).aa(new xiv(this, 3), ab.p);
        aynxVar.n().O(ona.q).aa(new xiv(this, 1), ab.p);
    }

    @Override // defpackage.wlh
    public final void a() {
        if (this.d != null) {
            this.d.i();
        }
        p();
    }

    @Override // defpackage.wlh
    public final void b(String str, InstreamAdBreak instreamAdBreak, PlayerAd playerAd) {
        ylr.c();
        if (this.d != null) {
            if (TextUtils.equals(this.d.g(), playerAd.l)) {
                return;
            }
            this.d.C();
        }
        if (!this.a.containsKey(playerAd.l)) {
            this.a.put(playerAd.l, this.f.b(this.h.c(playerAd), str, instreamAdBreak, playerAd));
        }
        this.d = (xiu) this.a.get(playerAd.l);
        this.e.e(this.d.f());
    }

    @Override // defpackage.wlh
    public final void c(InstreamAdBreak instreamAdBreak, PlayerAd playerAd) {
        ylr.c();
        if (!this.b.containsKey(instreamAdBreak)) {
            this.b.put(instreamAdBreak, new xjc(this.h.a(), instreamAdBreak, playerAd));
        }
        this.c = (xip) this.b.get(instreamAdBreak);
    }

    @Override // defpackage.wlh
    public final void d(String str, InstreamAdBreak instreamAdBreak, PlayerAd playerAd) {
        if (this.d != null) {
            this.d.C();
        }
        p();
        this.d = this.f.a(this.h.c(playerAd), str, instreamAdBreak, playerAd);
    }

    @Override // defpackage.wlh
    public final void e() {
        ylr.c();
        this.c = null;
        this.d = null;
    }

    @Override // defpackage.wlh
    public final void f() {
        xip xipVar = this.c;
        if (xipVar != null) {
            xipVar.a();
            this.c = null;
        }
    }

    @Override // defpackage.wlh
    public final void g(InstreamAdBreak instreamAdBreak) {
        if (instreamAdBreak == null) {
            return;
        }
        if (this.c == null) {
            this.c = this.g.a(this.h.a(), instreamAdBreak);
        }
        this.c.b();
    }

    @Override // defpackage.wlh
    public final void h() {
        ylr.c();
        if (this.d != null) {
            this.d.n();
        }
    }

    @Override // defpackage.wlh
    public final void i(wzq wzqVar) {
        ylr.c();
        if (this.d != null) {
            this.d.j(wzqVar);
        }
    }

    @Override // defpackage.wlh
    public final void j(int i, int i2) {
        ylr.c();
        if (this.d != null) {
            this.d.k(i, i2);
        }
    }

    @Override // defpackage.wlh
    public final void k(long j, String str) {
        ylr.c();
        if (this.d != null) {
            this.d.l(j);
        }
        xip xipVar = this.c;
        if (xipVar != null) {
            xipVar.c(j, str);
        }
    }

    @Override // defpackage.wlh
    public final void l() {
        ylr.c();
        if (this.d != null) {
            this.d.q();
        }
    }

    @Override // defpackage.wlh
    public final void m() {
        ylr.c();
        if (this.d != null) {
            this.d.u();
        }
    }

    @Override // defpackage.wlh
    public final void n(int i, int i2, int i3, int i4) {
        ylr.c();
        if (this.d != null) {
            this.d.A(i, i2, i3, i4);
        }
    }

    @Override // defpackage.wlh
    @Deprecated
    public final void o(String str, InstreamAdBreak instreamAdBreak, ForecastingAd forecastingAd) {
        xip a = this.g.a(this.h.a(), instreamAdBreak);
        a.b();
        xjb xjbVar = (xjb) this.f.a(this.h.c(forecastingAd), str, instreamAdBreak, forecastingAd);
        PlayerAd playerAd = xjbVar.b;
        if ((playerAd instanceof ForecastingAd) && !xjbVar.e) {
            xjbVar.d.f(playerAd.Q());
            xjbVar.e = true;
        }
        int i = wyx.c;
        a.a();
    }

    public final void p() {
        if (this.d != null) {
            this.d.C();
            this.d = null;
        }
    }

    public final void q(xec xecVar) {
        ylr.c();
        if (this.d != null) {
            this.d.x(xecVar);
        }
    }

    public final void r() {
        ylr.c();
        if (this.d != null) {
            this.d.t();
        }
    }

    public final void s(ahhx ahhxVar, boolean z) {
        ylr.c();
        if (z != (this.d instanceof xje)) {
            return;
        }
        if (this.d != null) {
            this.d.z(ahhxVar);
        }
        xip xipVar = this.c;
        if (xipVar == null) {
            return;
        }
        xipVar.d(ahhxVar);
    }
}
