package com.google.android.libraries.youtube.player.features.overlay.live;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.Spanned;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.features.overlay.live.LiveOverlayPresenter;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class LiveOverlayPresenter implements f, ahzl, yiw, airt, ynl {
    public final ahzm a;
    public final Resources b;
    public final alj c;
    public final ScheduledExecutorService d;
    public final ajdz e;
    public final ayqb f;
    public final snc g;
    public final ahzt h;
    public asur i;
    public aypg j;
    public boolean k;
    public boolean l;
    public PlayerResponseModel m;
    public aika n;
    private final Executor o;
    private final ajmy p;
    private final Runnable q;
    private final Runnable r;
    private final aafo s;
    private final ahzu t;
    private Future u;
    private long v;
    private long w;
    private int x;

    public LiveOverlayPresenter(Context context, ahzm ahzmVar, ajdz ajdzVar, Executor executor, ajmy ajmyVar, ScheduledExecutorService scheduledExecutorService, snc sncVar, aafo aafoVar, ahzu ahzuVar) {
        ahzmVar.getClass();
        this.a = ahzmVar;
        executor.getClass();
        this.o = executor;
        ajmyVar.getClass();
        this.p = ajmyVar;
        scheduledExecutorService.getClass();
        this.d = scheduledExecutorService;
        ajdzVar.getClass();
        this.e = ajdzVar;
        sncVar.getClass();
        this.g = sncVar;
        this.s = aafoVar;
        this.b = context.getResources();
        this.t = ahzuVar;
        this.c = alj.a();
        this.f = new ahzs(this, 6);
        this.q = new Runnable() { // from class: ahzn
            @Override // java.lang.Runnable
            public final void run() {
                arag aragVar;
                arag aragVar2;
                arag aragVar3;
                arag aragVar4;
                LiveOverlayPresenter liveOverlayPresenter = LiveOverlayPresenter.this;
                asur asurVar = liveOverlayPresenter.i;
                if (asurVar != null) {
                    arag aragVar5 = null;
                    if ((asurVar.b & 4) != 0) {
                        aragVar = asurVar.d;
                        if (aragVar == null) {
                            aragVar = arag.a;
                        }
                    } else {
                        aragVar = null;
                    }
                    CharSequence b = ajgl.b(aragVar);
                    if ((asurVar.b & 2) != 0) {
                        long max = Math.max(0L, asurVar.c - TimeUnit.MILLISECONDS.toSeconds(liveOverlayPresenter.g.c()));
                        String b2 = liveOverlayPresenter.c.b(String.format(Locale.getDefault(), "%02d:%02d", Long.valueOf(TimeUnit.SECONDS.toMinutes(max)), Long.valueOf(max % 60)));
                        if (liveOverlayPresenter.l) {
                            String valueOf = String.valueOf(b.toString().split("\\d", -1)[0]);
                            String valueOf2 = String.valueOf(b2);
                            b = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
                        } else {
                            b = liveOverlayPresenter.b.getString(R.string.live_event_starts_in, b2);
                        }
                    }
                    apos t = LiveOverlayPresenter.t(asurVar);
                    if (t == null) {
                        if ((asurVar.b & 8) != 0) {
                            aragVar2 = asurVar.e;
                            if (aragVar2 == null) {
                                aragVar2 = arag.a;
                            }
                        } else {
                            aragVar2 = null;
                        }
                        Spanned b3 = ajgl.b(aragVar2);
                        liveOverlayPresenter.a.t(b, b3, false, null, 0, null, 0);
                        apoj u = LiveOverlayPresenter.u(asurVar);
                        if (u != null) {
                            ahzm ahzmVar2 = liveOverlayPresenter.a;
                            if ((u.b & 256) != 0 && (aragVar5 = u.i) == null) {
                                aragVar5 = arag.a;
                            }
                            ahzmVar2.v(b, b3, ajgl.b(aragVar5));
                        }
                    } else {
                        ahzm ahzmVar3 = liveOverlayPresenter.a;
                        if ((asurVar.b & 8) != 0) {
                            aragVar3 = asurVar.e;
                            if (aragVar3 == null) {
                                aragVar3 = arag.a;
                            }
                        } else {
                            aragVar3 = null;
                        }
                        Spanned b4 = ajgl.b(aragVar3);
                        boolean z = t.e;
                        if ((t.b & 64) != 0) {
                            aragVar4 = t.h;
                            if (aragVar4 == null) {
                                aragVar4 = arag.a;
                            }
                        } else {
                            aragVar4 = null;
                        }
                        Spanned b5 = ajgl.b(aragVar4);
                        arhs arhsVar = t.g;
                        if (arhsVar == null) {
                            arhsVar = arhs.a;
                        }
                        int h = LiveOverlayPresenter.h(arhsVar);
                        if ((t.b & 4096) != 0 && (aragVar5 = t.n) == null) {
                            aragVar5 = arag.a;
                        }
                        Spanned b6 = ajgl.b(aragVar5);
                        arhs arhsVar2 = t.m;
                        if (arhsVar2 == null) {
                            arhsVar2 = arhs.a;
                        }
                        ahzmVar3.t(b, b4, z, b5, h, b6, LiveOverlayPresenter.h(arhsVar2));
                    }
                    liveOverlayPresenter.k = true;
                }
            }
        };
        this.r = new ahzo(this);
        ahzmVar.q(this);
        this.h = new ahzt(this);
    }

    public static int h(arhs arhsVar) {
        arhr arhrVar = arhr.UNKNOWN;
        aika aikaVar = aika.NEW;
        arhr b = arhr.b(arhsVar.c);
        if (b == null) {
            b = arhr.UNKNOWN;
        }
        int ordinal = b.ordinal();
        if (ordinal != 255) {
            return ordinal != 256 ? 0 : 2131232615;
        }
        return 2131232619;
    }

    public static asur i(asaa asaaVar) {
        if (asaaVar != null) {
            arzu arzuVar = asaaVar.n;
            if (arzuVar == null) {
                arzuVar = arzu.a;
            }
            asuv asuvVar = arzuVar.c;
            if (asuvVar == null) {
                asuvVar = asuv.a;
            }
            if ((asuvVar.b & 64) == 0) {
                return null;
            }
            arzu arzuVar2 = asaaVar.n;
            if (arzuVar2 == null) {
                arzuVar2 = arzu.a;
            }
            asuv asuvVar2 = arzuVar2.c;
            if (asuvVar2 == null) {
                asuvVar2 = asuv.a;
            }
            asuu asuuVar = asuvVar2.g;
            if (asuuVar == null) {
                asuuVar = asuu.a;
            }
            asur asurVar = asuuVar.c;
            return asurVar == null ? asur.a : asurVar;
        }
        return null;
    }

    public static final apos t(asur asurVar) {
        if (asurVar.g.size() <= 0 || (((apok) asurVar.g.get(0)).b & 2) == 0) {
            return null;
        }
        apos aposVar = ((apok) asurVar.g.get(0)).d;
        if (aposVar == null) {
            aposVar = apos.a;
        }
        if (aposVar.f) {
            return null;
        }
        apos aposVar2 = ((apok) asurVar.g.get(0)).d;
        return aposVar2 == null ? apos.a : aposVar2;
    }

    public static final apoj u(asur asurVar) {
        if (asurVar == null || asurVar.g.size() <= 0 || (((apok) asurVar.g.get(0)).b & 1) == 0) {
            return null;
        }
        apoj apojVar = ((apok) asurVar.g.get(0)).c;
        if (apojVar == null) {
            apojVar = apoj.a;
        }
        if (apojVar.h) {
            return null;
        }
        apoj apojVar2 = ((apok) asurVar.g.get(0)).c;
        return apojVar2 == null ? apoj.a : apojVar2;
    }

    private final void v() {
        k();
        this.a.p(null);
        this.a.g(true);
        this.a.o(0L);
        this.a.m();
        this.l = false;
        this.a.r(false);
        this.i = null;
        Future future = this.u;
        if (future != null) {
            future.cancel(true);
            this.u = null;
        }
        aypg aypgVar = this.j;
        if (aypgVar != null && !aypgVar.e()) {
            azof.f((AtomicReference) this.j);
        }
        this.j = null;
        this.v = 0L;
        this.w = 0L;
        this.x = 0;
    }

    private final boolean x() {
        return this.w > 0;
    }

    private final boolean y() {
        int i;
        long j = this.w;
        return j > 0 && j - this.v <= 1000 && (i = this.x) != 2 && i != 3;
    }

    private final boolean z() {
        return this.x == 5;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void a(Object obj, Exception exc) {
        Uri uri = (Uri) obj;
    }

    @Override // defpackage.yiw
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        Uri uri = (Uri) obj;
        final Bitmap bitmap = (Bitmap) obj2;
        this.o.execute(new Runnable() { // from class: ahzp
            @Override // java.lang.Runnable
            public final void run() {
                LiveOverlayPresenter liveOverlayPresenter = LiveOverlayPresenter.this;
                liveOverlayPresenter.a.p(bitmap);
            }
        });
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 16384L)).h(aiwv.l(1)).aa(new ahzs(this, 2), ahqs.p), airwVar.G().d.h(aiwv.n(airwVar.aB(), 16384L)).h(aiwv.l(1)).aa(new ahzs(this, 3), ahqs.p), airwVar.G().i.h(aiwv.n(airwVar.aB(), 16384L)).h(aiwv.l(1)).aa(new ahzs(this, 4), ahqs.p), airwVar.ab().h(aiwv.n(airwVar.aB(), 16384L)).h(aiwv.l(1)).aa(new ahzs(this, 5), ahqs.p), airwVar.V().h(aiwv.n(airwVar.aB(), 16384L)).h(aiwv.l(1)).aa(new ahzs(this, 5), ahqs.p), airwVar.s().b.h(aiwv.n(airwVar.aB(), 16384L)).h(aiwv.l(1)).aa(new ahzs(this), ahqs.p), aiwv.k(airwVar.G().g, ahja.g).h(aiwv.l(1)).aa(new ahzs(this, 1), ahqs.p)};
    }

    public final void j(ahgn ahgnVar) {
        this.a.w(ahgnVar.d() == aijs.FULLSCREEN);
    }

    public final void k() {
        this.k = false;
        this.a.kT();
        l();
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                j((ahgn) obj);
                return null;
            } else if (i == 1) {
                m((ahhw) obj);
                return null;
            } else if (i == 2) {
                n((ahhx) obj);
                return null;
            } else if (i == 3) {
                o((ahia) obj);
                return null;
            } else {
                StringBuilder sb = new StringBuilder(32);
                sb.append("unsupported op code: ");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
            }
        }
        return new Class[]{ahgn.class, ahhw.class, ahhx.class, ahia.class};
    }

    public final void l() {
        ahzu ahzuVar = this.t;
        if (ahzuVar != null) {
            ahzuVar.e(false);
        }
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        v();
    }

    public final void m(ahhw ahhwVar) {
        this.n = ahhwVar.c();
        arhr arhrVar = arhr.UNKNOWN;
        aika aikaVar = aika.NEW;
        int ordinal = this.n.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            v();
        } else if (ordinal == 2) {
            aypg aypgVar = this.j;
            if (aypgVar != null && !aypgVar.e()) {
                return;
            }
            this.m = ahhwVar.b();
            this.j = this.e.c.n().G(azpj.b(this.d)).Z(this.f);
        } else if (ordinal != 9) {
        } else {
            this.a.g(false);
            this.a.m();
            final asur asurVar = this.i;
            if (!this.l || asurVar == null) {
                return;
            }
            this.o.execute(new Runnable() { // from class: ahzq
                @Override // java.lang.Runnable
                public final void run() {
                    LiveOverlayPresenter liveOverlayPresenter = LiveOverlayPresenter.this;
                    avhn avhnVar = asurVar.f;
                    if (avhnVar == null) {
                        avhnVar = avhn.a;
                    }
                    liveOverlayPresenter.s(avhnVar);
                }
            });
        }
    }

    public final void n(ahhx ahhxVar) {
        this.v = ahhxVar.e();
        this.w = ahhxVar.f();
        w();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }

    public final void o(ahia ahiaVar) {
        int a = ahiaVar.a();
        this.x = a;
        if (a == 5 || a == 2) {
            w();
        }
    }

    public final void p() {
        this.o.execute(this.q);
    }

    public final void q() {
        asur asurVar = this.i;
        if (asurVar == null || (asurVar.b & 16) != 0) {
            final avhn avhnVar = asurVar.f;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            if (x() && !y()) {
                return;
            }
            if (this.t != null) {
                this.o.execute(new Runnable() { // from class: ahzr
                    @Override // java.lang.Runnable
                    public final void run() {
                        LiveOverlayPresenter.this.s(avhnVar);
                    }
                });
                return;
            }
            Uri r = akel.r(avhnVar, this.a.getWidth(), this.a.getHeight());
            if (r == null) {
                return;
            }
            this.p.l(r, this);
        }
    }

    @Override // defpackage.ahzl
    public final void rU() {
        apoj u = u(this.i);
        if (this.s == null || u == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("ALLOW_RELOAD", true);
        aafo aafoVar = this.s;
        apzg apzgVar = u.o;
        if (apzgVar == null) {
            apzgVar = apzg.a;
        }
        aafoVar.c(apzgVar, hashMap);
    }

    @Override // defpackage.ahzl
    public final void rV() {
        apzg apzgVar;
        asur asurVar = this.i;
        if (asurVar != null) {
            aopa mo52toBuilder = t(asurVar).mo52toBuilder();
            if (this.s == null || mo52toBuilder == null) {
                return;
            }
            apos aposVar = (apos) mo52toBuilder.instance;
            if (!aposVar.e || (aposVar.b & 16384) == 0) {
                apzgVar = null;
            } else {
                apzgVar = aposVar.p;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
            }
            apos aposVar2 = (apos) mo52toBuilder.instance;
            if (!aposVar2.e && (aposVar2.b & 512) != 0 && (apzgVar = aposVar2.k) == null) {
                apzgVar = apzg.a;
            }
            this.s.c(apzgVar, null);
            boolean z = ((apos) mo52toBuilder.instance).e;
            mo52toBuilder.copyOnWrite();
            apos aposVar3 = (apos) mo52toBuilder.instance;
            aposVar3.b |= 8;
            aposVar3.e = !z;
            aopa mo52toBuilder2 = asurVar.mo52toBuilder();
            apos aposVar4 = (apos) mo52toBuilder.mo39build();
            if (((asur) mo52toBuilder2.instance).g.size() > 0 && (mo52toBuilder2.at().b & 2) != 0) {
                apos aposVar5 = mo52toBuilder2.at().d;
                if (aposVar5 == null) {
                    aposVar5 = apos.a;
                }
                if (!aposVar5.f) {
                    aopa mo52toBuilder3 = mo52toBuilder2.at().mo52toBuilder();
                    mo52toBuilder3.copyOnWrite();
                    apok apokVar = (apok) mo52toBuilder3.instance;
                    aposVar4.getClass();
                    apokVar.d = aposVar4;
                    apokVar.b |= 2;
                    apok apokVar2 = (apok) mo52toBuilder3.mo39build();
                    mo52toBuilder2.copyOnWrite();
                    asur asurVar2 = (asur) mo52toBuilder2.instance;
                    apokVar2.getClass();
                    aopu aopuVar = asurVar2.g;
                    if (!aopuVar.c()) {
                        asurVar2.g = aopi.mutableCopy(aopuVar);
                    }
                    asurVar2.g.set(0, apokVar2);
                }
            }
            this.i = (asur) mo52toBuilder2.mo39build();
        }
    }

    public final void s(avhn avhnVar) {
        ahzu ahzuVar = this.t;
        if (ahzuVar != null) {
            ahzuVar.f(avhnVar);
            this.t.e(true);
            this.k = true;
        }
    }

    private final void w() {
        if (!this.k && this.i != null && z()) {
            q();
            r();
        } else if (!this.k || !x() || z()) {
        } else {
            if (!this.l) {
                this.o.execute(new ahzo(this, 1));
            } else {
                this.o.execute(new ahzo(this, 2));
            }
        }
    }

    public final void r() {
        asur asurVar = this.i;
        if (asurVar != null) {
            if ((asurVar.b & 2) != 0) {
                if (this.u != null) {
                    return;
                }
                this.u = this.d.scheduleAtFixedRate(this.r, 0L, 1L, TimeUnit.SECONDS);
                return;
            }
            Future future = this.u;
            if (future != null) {
                future.cancel(true);
                this.u = null;
            }
            if (!this.l && x() && !y()) {
                return;
            }
            p();
        }
    }
}
