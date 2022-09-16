package defpackage;

import com.google.android.apps.youtube.app.common.player.overlay.InlineTimeBarWrapper;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.mdx.MdxOverlaysPresenter;
import com.google.android.apps.youtube.app.player.overlay.YouTubeControlsOverlay;
import com.google.android.apps.youtube.app.player.overlay.suggestedactions.SuggestedActionsMainController;
import com.google.android.libraries.youtube.player.features.iv.CreatorEndscreenOverlayPresenter;
import java.util.Set;
/* compiled from: PG */
/* renamed from: jvp  reason: default package */
/* loaded from: classes3.dex */
public final class jvp implements fei {
    private final kdj A;
    private final ahqu B;
    private final jxh C;
    private final MdxOverlaysPresenter D;
    private final SuggestedActionsMainController E;
    private final edc F;
    private final jwj G;
    private final YouTubeControlsOverlay H;
    private final khy I;

    /* renamed from: J  reason: collision with root package name */
    private final ahyo f218J;
    private final ahyo K;
    private final ahyo L;
    private final airw M;
    private final aacz N;
    private final udt O;
    private final YouTubePlayerOverlaysLayout a;
    private final ahkv b;
    private final xgp c;
    private final wty d;
    private final jyf e;
    private final feo f;
    private final aypf g = new aypf();
    private final ahiw h;
    private final ahrd i;
    private final ahrf j;
    private final nit k;
    private final aict l;
    private final zbq m;
    private final kkj n;
    private final ahyz o;
    private final xfm p;
    private final xgm q;
    private final xfx r;
    private final CreatorEndscreenOverlayPresenter s;
    private final ahqb t;
    private final aiah u;
    private final ahqt v;
    private final jxj w;
    private final jzp x;
    private final xjz y;
    private final ahqy z;

    public jvp(YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout, ahkv ahkvVar, xgp xgpVar, wty wtyVar, jyf jyfVar, feh fehVar, feo feoVar, ahyo ahyoVar, jwj jwjVar, YouTubeControlsOverlay youTubeControlsOverlay, khy khyVar, ahqu ahquVar, ahqy ahqyVar, ahzd ahzdVar, ahzd ahzdVar2, xjz xjzVar, jxh jxhVar, ahrd ahrdVar, ahrf ahrfVar, nit nitVar, kdj kdjVar, xfm xfmVar, ahyz ahyzVar, xgm xgmVar, xfx xfxVar, kkj kkjVar, CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter, aict aictVar, aiah aiahVar, ahqb ahqbVar, ahqt ahqtVar, jxj jxjVar, jzp jzpVar, aacz aaczVar, airw airwVar, ahiw ahiwVar, zbq zbqVar, MdxOverlaysPresenter mdxOverlaysPresenter, SuggestedActionsMainController suggestedActionsMainController, udt udtVar, edc edcVar, byte[] bArr) {
        this.a = youTubePlayerOverlaysLayout;
        this.b = ahkvVar;
        this.c = xgpVar;
        this.d = wtyVar;
        this.e = jyfVar;
        this.f = feoVar;
        this.f218J = ahyoVar;
        this.G = jwjVar;
        this.H = youTubeControlsOverlay;
        this.I = khyVar;
        this.B = ahquVar;
        this.L = ahzdVar;
        this.K = ahzdVar2;
        this.y = xjzVar;
        this.z = ahqyVar;
        this.C = jxhVar;
        this.i = ahrdVar;
        this.j = ahrfVar;
        this.k = nitVar;
        this.A = kdjVar;
        this.p = xfmVar;
        this.o = ahyzVar;
        this.q = xgmVar;
        this.r = xfxVar;
        this.n = kkjVar;
        this.s = creatorEndscreenOverlayPresenter;
        this.u = aiahVar;
        this.t = ahqbVar;
        this.v = ahqtVar;
        this.w = jxjVar;
        this.x = jzpVar;
        this.N = aaczVar;
        this.M = airwVar;
        this.h = ahiwVar;
        this.l = aictVar;
        this.m = zbqVar;
        this.D = mdxOverlaysPresenter;
        this.E = suggestedActionsMainController;
        this.O = udtVar;
        this.F = edcVar;
        youTubeControlsOverlay.s = creatorEndscreenOverlayPresenter;
        youTubeControlsOverlay.i(ahyoVar);
        ahquVar.i(ahyoVar);
        Set set = ahrdVar.a;
        jxjVar.getClass();
        set.add(jxjVar);
        zbqVar.b(kdjVar);
        ahqbVar.a(feoVar);
        if (kdjVar != null) {
            fem femVar = feoVar.a[1];
            femVar.a.add(kdjVar);
            kdjVar.c = femVar.b;
            feoVar.b();
        }
        ahkvVar.b(ahqyVar);
        ahkvVar.b(ahquVar);
        ahkvVar.b(xjzVar);
        ahkvVar.b(ahrdVar);
        ahkvVar.b(ahrfVar);
        ahkvVar.b(nitVar);
        youTubeControlsOverlay.getClass();
        youTubePlayerOverlaysLayout.o = new kie(youTubeControlsOverlay, 1);
        jyfVar.c = aiahVar;
        jxhVar.g(jxjVar);
        jxhVar.g(ahiwVar);
        jxjVar.s(youTubeControlsOverlay);
        jxjVar.e.add(youTubeControlsOverlay);
        jxjVar.s(suggestedActionsMainController);
        mdxOverlaysPresenter.d.f.add(youTubeControlsOverlay);
        mdxOverlaysPresenter.d.e.add(youTubeControlsOverlay);
        fehVar.a(this);
    }

    private static final int f(ezx ezxVar) {
        if (ezxVar.b()) {
            return 2;
        }
        return ezxVar.i() ? 1 : 0;
    }

    @Override // defpackage.fei
    public final void a() {
        this.H.nf();
    }

    @Override // defpackage.fei
    public final void d() {
    }

    @Override // defpackage.fei
    public final void e() {
        this.H.Q();
    }

    @Override // defpackage.feg
    public final void kF() {
        this.g.c();
        this.c.d();
        this.d.d(this.q);
        this.d.d(this.r);
        this.d.d(this.n);
        xgm xgmVar = this.q;
        if (xgmVar.e != null && xgmVar.h != null) {
            xgmVar.f();
        }
        xfx xfxVar = this.r;
        if (xfxVar.e != null) {
            xfxVar.f();
        }
        kkj kkjVar = this.n;
        if (kkjVar.e) {
            kkjVar.b();
        }
        jxj jxjVar = this.w;
        if (jxjVar.f == 2) {
            jxjVar.f = 3;
            jxjVar.y();
        }
        ahyz ahyzVar = this.o;
        ahyzVar.c();
        ahyzVar.N.a();
        ahqt ahqtVar = this.v;
        ((ahqx) ahqtVar.a).a = null;
        ((jzd) ahqtVar.b).c = null;
        ((ahso) ahqtVar.c.get()).e = null;
        this.a.removeOnLayoutChangeListener(this.x);
        this.O.b();
    }

    @Override // defpackage.feg
    public final void nr() {
        asxj asxjVar = this.N.b().e;
        if (asxjVar == null) {
            asxjVar = asxj.a;
        }
        if (asxjVar.S) {
            this.g.g(this.j.g(this.M));
        }
        this.g.g(this.o.Q.g(this.M));
        aypf aypfVar = this.g;
        final aict aictVar = this.l;
        aypfVar.d(this.M.V().Z(new ayqb() { // from class: aicp
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aict aictVar2 = aict.this;
                ahic ahicVar = (ahic) obj;
                if (ahicVar.a().c() != null) {
                    aictVar2.g |= ahicVar.a().c().d.d("PLAYER_IS_CONTENT_INTERSTITIAL_KEY");
                    aictVar2.a(ahicVar.a().c().a);
                    return;
                }
                aictVar2.c.a(false);
            }
        }));
        this.g.g(this.u.u.g(this.M));
        this.c.m(this.p);
        this.d.a(this.q);
        this.d.a(this.r);
        this.d.a(this.n);
        xfx xfxVar = this.r;
        if (xfxVar.e != null) {
            xfxVar.h(xfxVar.i);
        }
        kkj kkjVar = this.n;
        if (kkjVar.e) {
            kkjVar.d();
        }
        this.w.y();
        ahyz ahyzVar = this.o;
        ahyzVar.b();
        ahyzVar.N.b();
        ahqt ahqtVar = this.v;
        ((ahqx) ahqtVar.a).a = ahqtVar;
        ((jzd) ahqtVar.b).c = ahqtVar;
        ((ahso) ahqtVar.c.get()).e = ahqtVar;
        this.a.addOnLayoutChangeListener(this.x);
        this.O.c(this.F);
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pa(ezx ezxVar) {
    }

    @Override // defpackage.ezg
    public final void pb(ezx ezxVar, ezx ezxVar2) {
        ahvm ahvmVar;
        khy khyVar = this.I;
        boolean z = false;
        if (!khyVar.i) {
            int f = f(ezxVar);
            int f2 = f(ezxVar2);
            if (f != f2) {
                khy khyVar2 = this.I;
                aqxo.z(!khyVar2.i, "wrong arm");
                InlineTimeBarWrapper inlineTimeBarWrapper = khyVar2.j;
                if (f == 2) {
                    YouTubeControlsOverlay youTubeControlsOverlay = this.H;
                    if (youTubeControlsOverlay.C) {
                        youTubeControlsOverlay.l.removeView(inlineTimeBarWrapper);
                    } else {
                        youTubeControlsOverlay.O.remove(inlineTimeBarWrapper);
                    }
                } else if (f == 1) {
                    this.G.d[0].d(inlineTimeBarWrapper);
                }
                if (f2 == 2) {
                    YouTubeControlsOverlay youTubeControlsOverlay2 = this.H;
                    if (youTubeControlsOverlay2.C) {
                        youTubeControlsOverlay2.l.addView(inlineTimeBarWrapper);
                        youTubeControlsOverlay2.h.bringToFront();
                    } else {
                        youTubeControlsOverlay2.O.add(inlineTimeBarWrapper);
                    }
                } else if (f2 == 1) {
                    this.G.d[0].a(inlineTimeBarWrapper);
                }
            }
        } else {
            khyVar.z(ezxVar2);
        }
        YouTubeControlsOverlay youTubeControlsOverlay3 = this.H;
        ahyo ahyoVar = this.K;
        if (!youTubeControlsOverlay3.mY(ezxVar2)) {
            ahyoVar = this.f218J;
        }
        youTubeControlsOverlay3.i(ahyoVar);
        this.B.i(ezxVar2.g() ? this.L : this.f218J);
        CreatorEndscreenOverlayPresenter creatorEndscreenOverlayPresenter = this.s;
        boolean z2 = ezxVar2.j() || ezxVar2.e();
        boolean l = ezxVar2.l();
        if (z2 || l) {
            z = true;
        }
        if (creatorEndscreenOverlayPresenter.j == z) {
            return;
        }
        creatorEndscreenOverlayPresenter.j = z;
        if (z && (ahvmVar = creatorEndscreenOverlayPresenter.l) != null) {
            ahvmVar.a(true);
        }
        if (!creatorEndscreenOverlayPresenter.i) {
            return;
        }
        creatorEndscreenOverlayPresenter.s();
    }
}
