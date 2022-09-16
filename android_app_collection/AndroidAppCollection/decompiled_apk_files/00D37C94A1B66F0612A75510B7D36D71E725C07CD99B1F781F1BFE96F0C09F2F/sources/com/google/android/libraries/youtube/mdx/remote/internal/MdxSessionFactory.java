package com.google.android.libraries.youtube.mdx.remote.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.youtube.mdx.remote.internal.MdxSessionFactory;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class MdxSessionFactory implements f {
    private final axnm A;
    private final ankt B;
    private final acwu C;
    private final adnh D;
    private final ScheduledExecutorService E;
    private aypg F;
    private final adnd G;
    private final adrq H;
    public atcw a = atcw.MDX_SESSION_SOURCE_UNKNOWN;
    private final Context b;
    private final String c;
    private final aiyx d;
    private final SharedPreferences e;
    private final adbu f;
    private final adas g;
    private final adkc h;
    private final adkm i;
    private final adbe j;
    private final yni k;
    private final snc l;
    private final zey m;
    private final yzj n;
    private final yrj o;
    private final adpa p;
    private final adsu q;
    private final xik r;
    private final adtt s;
    private final adwc t;
    private final afvn u;
    private final Handler v;
    private final aczr w;
    private final acyz x;
    private final boolean y;
    private final int z;

    static {
        zep.a("MDX.SessionFactory");
    }

    public MdxSessionFactory(Context context, String str, aiyx aiyxVar, SharedPreferences sharedPreferences, adbu adbuVar, adas adasVar, adkc adkcVar, adkm adkmVar, adbe adbeVar, yni yniVar, snc sncVar, zey zeyVar, yzj yzjVar, yrj yrjVar, adpa adpaVar, adsu adsuVar, xik xikVar, adtt adttVar, adwc adwcVar, afvn afvnVar, Handler handler, adnd adndVar, aczr aczrVar, acyz acyzVar, boolean z, int i, axnm axnmVar, ankt anktVar, acwu acwuVar, adnh adnhVar, ScheduledExecutorService scheduledExecutorService, adrq adrqVar) {
        this.b = context;
        this.c = str;
        this.d = aiyxVar;
        this.e = sharedPreferences;
        this.f = adbuVar;
        this.g = adasVar;
        this.h = adkcVar;
        this.i = adkmVar;
        this.j = adbeVar;
        this.k = yniVar;
        this.l = sncVar;
        this.m = zeyVar;
        this.n = yzjVar;
        this.o = yrjVar;
        this.p = adpaVar;
        this.q = adsuVar;
        this.r = xikVar;
        this.s = adttVar;
        this.t = adwcVar;
        this.u = afvnVar;
        this.v = handler;
        this.G = adndVar;
        this.w = aczrVar;
        this.x = acyzVar;
        this.y = z;
        this.z = i;
        this.A = axnmVar;
        this.B = anktVar;
        this.C = acwuVar;
        this.D = adnhVar;
        this.E = scheduledExecutorService;
        this.H = adrqVar;
    }

    public final adqy g(adig adigVar, adrk adrkVar, adnu adnuVar, acvg acvgVar, acvg acvgVar2, int i, ampq ampqVar) {
        if (adigVar instanceof adhz) {
            return new adoz((adhz) adigVar, this, this.b, adrkVar, adnuVar, this.n, this.k, acvgVar, acvgVar2, i, ampqVar, this.x, this.w, this.v, this.C, this.E, this.a, this.G);
        }
        if (adigVar instanceof adid) {
            return new adqh((adid) adigVar, this, this.b, adrkVar, adnuVar, this.n, this.e, this.f, this.g, this.h, this.i, this.j, this.c, acvgVar, acvgVar2, (adbt) this.A.get(), this.z, this.s, i, ampqVar, this.G, this.C, this.a);
        }
        if (adigVar instanceof adif) {
            return new adqr((adif) adigVar, this, this.b, adrkVar, adnuVar, this.n, acvgVar, acvgVar2, i, ampqVar, this.C, this.a);
        }
        throw new IllegalArgumentException("Screen type not supported");
    }

    public final adqy h(adib adibVar, adrk adrkVar, adnu adnuVar, adqy adqyVar, acvg acvgVar, acvg acvgVar2, adon adonVar) {
        adst adstVar;
        Context context = this.b;
        yni yniVar = this.k;
        zey zeyVar = this.m;
        snc sncVar = this.l;
        yzj yzjVar = this.n;
        yrj yrjVar = this.o;
        aiyx aiyxVar = this.d;
        Handler handler = new Handler(Looper.getMainLooper());
        adkc adkcVar = this.h;
        if (adqyVar.au()) {
            adstVar = this.q.a();
        } else {
            adstVar = this.p.a;
        }
        return new adpl(context, adrkVar, adnuVar, yniVar, zeyVar, sncVar, yzjVar, yrjVar, aiyxVar, handler, adkcVar, adibVar, adqyVar, adstVar, this.r, this.B, acvgVar, acvgVar2, this.s, this.z, this.t, this.u, this.D, this.y, this.C, ampq.i(adonVar), this.E, this.c, this.a);
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        aypg aypgVar = this.F;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        aypg aypgVar = this.F;
        if (aypgVar == null || aypgVar.e()) {
            this.F = this.H.a.as(new ayqb() { // from class: adqv
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    MdxSessionFactory.this.a = (atcw) obj;
                }
            });
        }
    }
}
