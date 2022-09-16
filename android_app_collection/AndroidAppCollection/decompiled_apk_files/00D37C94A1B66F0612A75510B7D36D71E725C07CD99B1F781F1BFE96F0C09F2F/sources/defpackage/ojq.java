package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EdgeEffect;
import com.google.android.apps.youtube.app.common.player.overlay.YouTubePlayerOverlaysLayout;
import com.google.android.apps.youtube.app.common.ui.elements.activestate.ActiveStateScrollSelectionController;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerLayout;
import com.google.android.apps.youtube.app.common.ui.inline.InlinePlayerOverlayLayout;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import com.google.android.apps.youtube.app.common.util.AccessibilityStateReceiver;
import com.google.android.apps.youtube.app.offline.controller.OfflineSlimStatusBarConnectivityController;
import com.google.android.apps.youtube.app.ui.inline.InlinePlaybackController;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.android.libraries.youtube.player.model.WatchDescriptor;
import com.google.android.youtube.R;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ojq  reason: default package */
/* loaded from: classes3.dex */
public final class ojq implements yzx, izq, feg, ezg, ahsn, emo {
    public boolean A;
    public boolean B;
    public ezu C;
    public InlinePlaybackController D;
    public final aacz E;
    public final lnj F;
    public final jvo G;
    private final azqb H;
    private final azqb I;

    /* renamed from: J  reason: collision with root package name */
    private final ScrollSelectionController f238J;
    private final ActiveStateScrollSelectionController K;
    private final eza L;
    private final fpg M;
    private final gck N;
    private final azqb O;
    private final azqb P;
    private final aizb Q;
    private final jwj R;
    private final YouTubePlayerOverlaysLayout S;
    private final jwa T;
    private final adoa U;
    private final axnm V;
    private final fyy W;
    private final ntv X;
    private final Set Y;
    private final ois Z;
    public final ems a;
    private final azqb aa;
    private final olu ab;
    private final azqb ac;
    private final ojm ad;
    private final axnm af;
    private View ag;
    private InlinePlayerLayout ah;
    private aijc ai;
    private final aiak aj;
    private final ise ak;
    public final oiy b;
    public final ofu c;
    public final ezh d;
    public final jvc e;
    public final aadd f;
    public final gdi g;
    public final ajgz h;
    public final aara i;
    public final yni j;
    public final feo k;
    public final ahub l;
    public final acti m;
    public final axnm n;
    public final azqb o;
    public final airw p;
    public final yzm q;
    public final feh r;
    public final azpx s;
    public final aiix t;
    public final ghd u;
    public final ogq v;
    public final srr w;
    public final aypf x = new aypf();
    public final aypf y = new aypf();
    public final aypf z = new aypf();
    private final aypf ae = new aypf();

    public ojq(ems emsVar, azqb azqbVar, azqb azqbVar2, oiy oiyVar, ScrollSelectionController scrollSelectionController, ActiveStateScrollSelectionController activeStateScrollSelectionController, eza ezaVar, fpg fpgVar, ofu ofuVar, ezh ezhVar, gck gckVar, jvc jvcVar, azqb azqbVar3, aacz aaczVar, aadd aaddVar, gdi gdiVar, azqb azqbVar4, ajgz ajgzVar, aara aaraVar, aizb aizbVar, lnj lnjVar, jwj jwjVar, YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout, jwa jwaVar, yni yniVar, adoa adoaVar, feo feoVar, axnm axnmVar, fyy fyyVar, ahub ahubVar, aiak aiakVar, acti actiVar, ntv ntvVar, axnm axnmVar2, jvo jvoVar, azqb azqbVar5, Set set, ois oisVar, airw airwVar, yzm yzmVar, feh fehVar, azqb azqbVar6, olu oluVar, azpx azpxVar, ise iseVar, aiix aiixVar, azqb azqbVar7, ghd ghdVar, ogq ogqVar, ojm ojmVar, srr srrVar, axnm axnmVar3, byte[] bArr, byte[] bArr2) {
        this.a = emsVar;
        this.H = azqbVar2;
        this.I = azqbVar;
        this.b = oiyVar;
        this.f238J = scrollSelectionController;
        this.K = activeStateScrollSelectionController;
        this.L = ezaVar;
        this.M = fpgVar;
        this.c = ofuVar;
        this.d = ezhVar;
        this.N = gckVar;
        this.e = jvcVar;
        this.O = azqbVar3;
        this.E = aaczVar;
        this.f = aaddVar;
        this.g = gdiVar;
        this.P = azqbVar4;
        this.h = ajgzVar;
        this.i = aaraVar;
        this.Q = aizbVar;
        this.F = lnjVar;
        this.R = jwjVar;
        this.S = youTubePlayerOverlaysLayout;
        this.T = jwaVar;
        this.j = yniVar;
        this.U = adoaVar;
        this.k = feoVar;
        this.V = axnmVar;
        this.W = fyyVar;
        this.l = ahubVar;
        this.aj = aiakVar;
        this.m = actiVar;
        this.X = ntvVar;
        this.n = axnmVar2;
        this.G = jvoVar;
        this.o = azqbVar5;
        this.Y = set;
        this.Z = oisVar;
        this.p = airwVar;
        this.q = yzmVar;
        this.r = fehVar;
        this.aa = azqbVar6;
        this.ab = oluVar;
        this.s = azpxVar;
        this.ak = iseVar;
        this.t = aiixVar;
        this.ac = azqbVar7;
        this.u = ghdVar;
        this.v = ogqVar;
        this.ad = ojmVar;
        this.w = srrVar;
        this.af = axnmVar3;
    }

    @Override // defpackage.emo
    @Deprecated
    public final zao a() {
        return this.ah.c;
    }

    @Override // defpackage.emo
    public final acti d() {
        return this.m;
    }

    @Override // defpackage.emo
    @Deprecated
    public final aijc e() {
        if (this.ai == null) {
            this.ai = new aijc(this.c.a(1), this.c.a(2), this.ah.d, this.c.a(0));
        }
        return this.ai;
    }

    @Override // defpackage.emo, defpackage.niw
    public final void f() {
        this.c.h(true);
    }

    @Override // defpackage.emo
    public final void g(ezu ezuVar) {
        pt(ezuVar, amon.a);
    }

    @Override // defpackage.emo
    public final boolean h() {
        return this.d.g().b();
    }

    @Override // defpackage.emo
    public final boolean i() {
        ezx g = this.d.g();
        return g.i() || g.b();
    }

    @Override // defpackage.emo
    public final boolean j() {
        return this.d.g().j();
    }

    @Override // defpackage.emo, defpackage.ezf
    public final boolean k() {
        return this.d.g().h();
    }

    @Override // defpackage.feg
    public final void kF() {
        this.ae.c();
    }

    @Override // defpackage.emo
    public final boolean l() {
        return this.d.g().l();
    }

    @Override // defpackage.ahsn
    public final void m(boolean z) {
        if (z) {
            this.c.i();
        } else {
            this.c.p();
        }
    }

    @Override // defpackage.feg
    public final void nr() {
        x();
        this.ae.g(this.Q.g(this.p));
    }

    @Override // defpackage.nix
    public final void p(boolean z) {
        if (z) {
            this.c.b();
        } else {
            this.c.c();
        }
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pa(ezx ezxVar) {
    }

    @Override // defpackage.ezg
    public final void pb(ezx ezxVar, ezx ezxVar2) {
        x();
        if (ezxVar.b() != ezxVar2.b()) {
            this.a.mA();
            this.a.closeOptionsMenu();
            zdg.d(this.ag);
        }
        if (ezxVar2 == ezx.NONE) {
            this.D.d.sendEmptyMessage(1);
        }
        if (!i()) {
            this.b.n = false;
            PaneDescriptor a = ((gbh) this.I.get()).a();
            if (a != null && this.ak.b(a) && !this.L.l()) {
                ((gbh) this.I.get()).d(((gbu) this.H.get()).f());
            }
        }
        this.M.d();
    }

    @Override // defpackage.izq
    public final void ps() {
        this.c.h(false);
    }

    @Override // defpackage.emp
    public final void pt(ezu ezuVar, ampq ampqVar) {
        this.C = null;
        WatchDescriptor watchDescriptor = ezuVar.a;
        PlaybackStartDescriptor playbackStartDescriptor = watchDescriptor.a;
        if ((this.U.e() != null || this.U.m()) && !adwa.a(playbackStartDescriptor.k())) {
            atcj atcjVar = this.E.b().n;
            if (atcjVar == null) {
                atcjVar = atcj.a;
            }
            if (!atcjVar.l && !((osb) watchDescriptor.b.instance).g) {
                if (this.ad.b()) {
                    this.C = ezuVar;
                    return;
                }
                WatchDescriptor watchDescriptor2 = ezuVar.a;
                aqxo.z(!this.ad.b(), "showRemoteWatchDialogFragment called while paused.");
                ((iqx) this.ac.get()).a(watchDescriptor2, this.a.getSupportFragmentManager());
                this.j.d(new ahgq());
                return;
            }
        }
        oev oevVar = (oev) this.aa.get();
        if (!oevVar.a) {
            oevVar.b = ezuVar;
        } else {
            oevVar.e(ezuVar, ampqVar);
        }
    }

    @Override // defpackage.izq
    public final void pu(boolean z) {
        this.c.l(z);
    }

    @Override // defpackage.niy
    public final void q() {
        if (!k()) {
            return;
        }
        this.c.l(true);
    }

    @Override // defpackage.niz
    public final void r(int i, int i2) {
        if (i != 2 || k()) {
            this.c.m(i2 + (-1) == 0);
        }
    }

    public final void s(View view, ViewGroup viewGroup, fqh fqhVar, Bundle bundle) {
        boolean z = false;
        if (bundle != null) {
            this.A = bundle.getBoolean("IS_IN_PICTURE_IN_PICTURE", false);
        }
        this.ag = view;
        this.q.e(this);
        InlinePlayerLayout inlinePlayerLayout = (InlinePlayerLayout) this.a.findViewById(R.id.inline_player_container);
        this.ah = inlinePlayerLayout;
        axnm axnmVar = this.af;
        if (Build.VERSION.SDK_INT > 30) {
            inlinePlayerLayout.setWillNotDraw(false);
            inlinePlayerLayout.a = new EdgeEffect(inlinePlayerLayout.getContext());
            inlinePlayerLayout.b = new EdgeEffect(inlinePlayerLayout.getContext());
            ((nfg) axnmVar.get()).b(1, inlinePlayerLayout, inlinePlayerLayout.a);
            ((nfg) axnmVar.get()).b(3, inlinePlayerLayout, inlinePlayerLayout.b);
        }
        zao zaoVar = this.ah.c;
        viewGroup.getClass();
        View a = zaoVar.a();
        zaoVar.d();
        zaoVar.a = viewGroup;
        if (a != null) {
            zaoVar.c(a);
        }
        if (eog.ay(this.E)) {
            InlinePlayerOverlayLayout inlinePlayerOverlayLayout = (InlinePlayerOverlayLayout) ((ViewStub) this.a.findViewById(R.id.inline_player_overlay_container_stub)).inflate();
            InlinePlayerLayout inlinePlayerLayout2 = this.ah;
            inlinePlayerLayout2.e = inlinePlayerOverlayLayout;
            inlinePlayerOverlayLayout.a = inlinePlayerLayout2.c;
            inlinePlayerOverlayLayout.addView(inlinePlayerOverlayLayout.d);
        }
        this.c.k(view, this.N);
        fqhVar.a(this.c);
        ((oev) this.aa.get()).a(new ojp(this));
        jwj jwjVar = this.R;
        fel g = this.c.g();
        InlinePlayerLayout inlinePlayerLayout3 = this.ah;
        View findViewById = this.a.findViewById(R.id.player_fragment_container);
        YouTubePlayerOverlaysLayout youTubePlayerOverlaysLayout = this.S;
        jwjVar.d = new fel[2];
        jwjVar.a = 0;
        jwjVar.b = findViewById;
        jwjVar.c = youTubePlayerOverlaysLayout;
        fel[] felVarArr = jwjVar.d;
        g.getClass();
        felVarArr[0] = g;
        inlinePlayerLayout3.getClass();
        felVarArr[1] = inlinePlayerLayout3;
        felVarArr[0].b(findViewById, youTubePlayerOverlaysLayout);
        jwa jwaVar = this.T;
        jvo jvoVar = this.G;
        jvoVar.getClass();
        aqxo.y(jwaVar.a == null);
        jwaVar.a = jvoVar;
        this.d.i(this);
        this.d.i(this.R);
        this.d.i(this.ah);
        this.d.i(this.k);
        this.d.i(this.Z);
        jvc jvcVar = this.e;
        if (jvcVar instanceof OfflineSlimStatusBarConnectivityController) {
            this.d.i((OfflineSlimStatusBarConnectivityController) jvcVar);
        }
        this.l.h();
        x();
        this.y.g(this.aj.g(this.p));
        this.f238J.k(this.ag);
        this.K.k(this.ag);
        this.D = (InlinePlaybackController) this.V.get();
        fyy fyyVar = this.W;
        AccessibilityStateReceiver accessibilityStateReceiver = fyyVar.c;
        accessibilityStateReceiver.i();
        accessibilityStateReceiver.a.add(fyyVar);
        fyyVar.b.g(fyyVar);
        fyyVar.d.c(fyyVar);
        fyyVar.b.f(fyyVar);
        if (fyyVar.a.getResources().getConfiguration().orientation == 1) {
            z = true;
        }
        fyyVar.f = z;
        ((izm) this.n.get()).b();
        for (fdm fdmVar : this.Y) {
            fdmVar.nJ();
        }
        this.r.a(this);
    }

    public final void t(boolean z) {
        ahso ahsoVar = (ahso) this.P.get();
        ahsoVar.h = z;
        ahsm ahsmVar = ahsoVar.e;
        if (ahsmVar != null) {
            ahsmVar.b(ahsoVar.j());
        }
        this.ab.a();
    }

    public final void u(boolean z) {
        this.B = this.A != z;
        if (z) {
            this.s.c(true);
        }
        y(z);
        if (!z) {
            this.s.c(false);
        }
        this.g.i(z);
    }

    public final void v() {
        this.B = false;
    }

    @Override // defpackage.yzx
    public final void w() {
        if (this.d.g().g()) {
            ((ahkv) this.O.get()).j();
        } else if (!h()) {
        } else {
            ems emsVar = this.a;
            boolean z = false;
            if (Build.VERSION.SDK_INT >= 24 && emsVar.isInMultiWindowMode()) {
                z = true;
            }
            boolean z2 = !this.q.m();
            if (z || z2) {
                return;
            }
            this.G.get().l();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void x() {
        if (this.c != null) {
            if (this.d.g().d()) {
                this.l.s(this.a.oi());
            } else {
                this.l.r(this.m);
            }
        }
        ntv ntvVar = this.X;
        ntvVar.a.i(ntvVar);
    }

    public final void y(boolean z) {
        if (this.B) {
            if (z) {
                this.c.i();
                this.h.c();
                this.w.a();
                return;
            }
            this.c.p();
        }
    }
}
