package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.ads.model.VideoTrackingAd;
import com.google.android.libraries.youtube.innertube.model.media.PlayerConfigModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
@wwb(a = apcb.LAYOUT_TYPE_DISCOVERY_PLAYBACK_TRACKER, b = apcd.SLOT_TYPE_PLAYBACK_TRACKING, c = {xbx.class}, d = {xas.class, xat.class})
/* renamed from: wqb  reason: default package */
/* loaded from: classes4.dex */
public final class wqb implements wqg, wlk, wln {
    private final wqf a;
    private final wwg b;
    private final wll c;
    private final wli d;
    private final acti e;
    private final xdu f;
    private final xci g;
    private final String h;
    private final VideoTrackingAd i;
    private final avww j;
    private final PlayerConfigModel k;
    private int l;
    private boolean m;
    private final wty n;

    public wqb(wqf wqfVar, wwg wwgVar, wll wllVar, wty wtyVar, wli wliVar, acti actiVar, xdu xduVar, xci xciVar) {
        this.a = wqfVar;
        this.b = wwgVar;
        this.c = wllVar;
        this.n = wtyVar;
        this.d = wliVar;
        this.e = actiVar;
        this.f = xduVar;
        this.g = xciVar;
        this.h = (String) xduVar.d(xas.class);
        VideoTrackingAd videoTrackingAd = (VideoTrackingAd) xciVar.e(xbx.class);
        this.i = videoTrackingAd;
        this.j = videoTrackingAd.a;
        this.k = videoTrackingAd.k;
    }

    private final void j(boolean z) {
        asjj asjjVar;
        if (this.e == null || (this.j.b & 4) == 0) {
            return;
        }
        ampq ampqVar = this.g.i;
        if (ampqVar.h()) {
            aopa createBuilder = asjj.a.createBuilder();
            createBuilder.copyOnWrite();
            asjj asjjVar2 = (asjj) createBuilder.instance;
            asjjVar2.t = (asit) ampqVar.c();
            asjjVar2.c |= 1024;
            asjjVar = (asjj) createBuilder.mo39build();
        } else {
            asjjVar = null;
        }
        if (z) {
            this.e.u(new acte(this.j.d.I()), asjjVar);
        } else {
            this.e.q(new acte(this.j.d.I()), asjjVar);
        }
    }

    private final void k() {
        if (this.l >= 5) {
            return;
        }
        this.b.a(2, new afzn[0]);
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
    public final void h(int i, String str) {
        if (!TextUtils.equals(str, this.h)) {
            return;
        }
        if (i == 2) {
            if (!this.k.aK()) {
                this.b.b(6, new afzn[0]);
            }
            if (this.l == 0) {
                this.l = 1;
            } else {
                this.b.a(7, new afzn[0]);
            }
        } else if (i == 3) {
            this.b.a(9, new afzn[0]);
        } else if (i == 4) {
            this.b.a(8, new afzn[0]);
        } else if (i != 7) {
        } else {
            try {
                this.d.e(TimeUnit.SECONDS.toMillis(this.i.b));
            } catch (wlb e) {
                wwf.b(this.f, this.g, e.toString());
            }
            this.b.b(14, new afzn[0]);
            this.b.b(13, new afzn[0]);
            this.l = 5;
        }
    }

    @Override // defpackage.wln
    public final void i() {
        k();
    }

    @Override // defpackage.wlk
    public final void qD(afkn afknVar) {
        if (!afknVar.n()) {
            return;
        }
        wyy wyyVar = new wyy(wyx.d(afknVar));
        if (this.l == 5) {
            return;
        }
        this.b.b(8, wyyVar);
        this.b.b(3, wyyVar);
        this.l = 5;
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qE(String str) {
    }

    @Override // defpackage.wlk
    public final void qF(aijs aijsVar, aijs aijsVar2, int i, int i2, boolean z, boolean z2) {
        boolean z3 = this.m;
        boolean z4 = aijsVar == aijs.FULLSCREEN;
        this.m = z4;
        try {
            this.d.f(aijsVar, aijsVar2, i, i2, z, z2);
        } catch (wlb e) {
            wwf.b(this.f, this.g, e.toString());
        }
        if (!z3 && z4) {
            this.b.a(4, new afzn[0]);
        } else if (!z3 || z4) {
        } else {
            this.b.a(5, new afzn[0]);
        }
    }

    @Override // defpackage.wlk
    public final void qG(String str, long j, long j2, long j3, boolean z) {
        if (!z || !TextUtils.equals(str, this.h)) {
            return;
        }
        int i = (int) j;
        int i2 = this.i.b * 1000;
        if (i < 0 || i > i2) {
            xdu xduVar = this.f;
            xci xciVar = this.g;
            StringBuilder sb = new StringBuilder(31);
            sb.append("Spurious videoTime: ");
            sb.append(i);
            wwf.b(xduVar, xciVar, sb.toString());
            return;
        }
        if (this.k.aK()) {
            this.b.b(6, new afzn[0]);
        }
        try {
            this.d.e(i);
        } catch (wlb e) {
            wwf.b(this.f, this.g, e.toString());
        }
        this.b.c(i, new afzn[0]);
        int i3 = (i * 4) / i2;
        if (i3 < this.l) {
            return;
        }
        for (int i4 = i3; i4 >= this.l; i4--) {
            if (i4 == 1) {
                this.b.b(10, new afzn[0]);
            } else if (i4 == 2) {
                this.b.b(11, new afzn[0]);
            } else if (i4 == 3) {
                this.b.b(12, new afzn[0]);
            }
        }
        this.l = i3 + 1;
    }

    @Override // defpackage.wqg
    public final void qH() {
        this.c.c(this);
    }

    @Override // defpackage.wqg
    public final void qI() {
        this.c.a(this);
        this.n.a.add(this);
        this.d.c();
        try {
            this.d.d(null, this.h);
            this.d.g(this.i);
        } catch (wlb e) {
            wwf.b(this.f, this.g, e.toString());
        }
        this.a.a(this.f, this.g);
        if (this.c.d(this.h)) {
            wwf.b(this.f, this.g, "Missed play event for discovery");
            h(2, this.h);
        }
        j(true);
    }

    @Override // defpackage.wqg
    public final void qJ(int i) {
        this.c.c(this);
        wty wtyVar = this.n;
        Iterator it = wtyVar.a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            wln wlnVar = (wln) it.next();
            if (akzj.f(wlnVar, this)) {
                wtyVar.a.remove(wlnVar);
                break;
            }
        }
        k();
        this.a.d(this.f, this.g, i);
        j(false);
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qK(String str, int i) {
    }

    @Override // defpackage.wlk
    public final /* synthetic */ void qM(ahgc ahgcVar) {
    }
}
