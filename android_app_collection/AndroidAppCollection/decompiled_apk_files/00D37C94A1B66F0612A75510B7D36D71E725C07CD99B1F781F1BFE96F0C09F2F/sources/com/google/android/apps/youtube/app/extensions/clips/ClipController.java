package com.google.android.apps.youtube.app.extensions.clips;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ClipController implements njc, f, gqe, gqi, gpz {
    private final azqb A;
    private final azqb B;
    private final azqb C;
    private aypg D;
    private aypg E;
    private aypg F;
    private aypg G;
    private aypg H;
    private aypg I;

    /* renamed from: J  reason: collision with root package name */
    private aypg f146J;
    private aypg K;
    private aypg L;
    private aypg M;
    private aypg N;
    private aypg O;
    public final yni a;
    public final azqb b;
    public final axnm c;
    public final azqb d;
    public grk f;
    public String h;
    public int i;
    public boolean j;
    public apyo t;
    private final azqb y;
    private final azqb z;
    public apzg e = null;
    public ajbv g = new ajbt();
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;
    private boolean P = false;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public String r = "";
    public long s = Long.MAX_VALUE;
    public WeakReference u = new WeakReference(null);
    public WeakReference v = new WeakReference(null);
    private long Q = 0;
    public boolean w = false;
    public String x = "";

    public ClipController(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, axnm axnmVar, azqb azqbVar6, yni yniVar, azqb azqbVar7) {
        this.y = azqbVar;
        this.b = azqbVar2;
        this.z = azqbVar3;
        this.A = azqbVar4;
        this.B = azqbVar5;
        this.c = axnmVar;
        this.d = azqbVar6;
        this.a = yniVar;
        this.C = azqbVar7;
    }

    private final void v(boolean z) {
        grv grvVar;
        this.k = z;
        if (z) {
            r();
        } else {
            ((ahvz) this.y.get()).a();
        }
        grk grkVar = this.f;
        if (grkVar == null || z || (grvVar = grkVar.q) == null) {
            return;
        }
        grvVar.ap();
    }

    @Override // defpackage.njc
    public final void aJ(ezu ezuVar) {
        PlaybackStartDescriptor playbackStartDescriptor = ezuVar.a.a;
        apzg apzgVar = playbackStartDescriptor.b;
        if (apzgVar == null || !apzgVar.qn(WatchEndpointOuterClass.watchEndpoint)) {
            return;
        }
        awel awelVar = (awel) playbackStartDescriptor.b.qm(WatchEndpointOuterClass.watchEndpoint);
        if ((awelVar.b & 33554432) == 0) {
            this.t = null;
            return;
        }
        awed awedVar = awelVar.s;
        if (awedVar == null) {
            awedVar = awed.a;
        }
        apyo apyoVar = awedVar.b;
        if (apyoVar == null) {
            apyoVar = apyo.a;
        }
        this.t = apyoVar;
    }

    @Override // defpackage.njc
    public final void aL() {
    }

    public final long g(long j) {
        long g = this.g.g();
        if (!this.j) {
            g -= j / 2;
        }
        long j2 = j / 2;
        if (g - j2 < 0) {
            g = 0;
        }
        long f = this.g.f();
        return j2 + g > f ? f - j : g;
    }

    @Override // defpackage.gqi
    public final String h() {
        return this.x;
    }

    public final void i() {
        if (((aiuo) this.u.get()) != null) {
            ((aiuo) this.u.get()).b(null);
        }
        this.e = null;
        this.t = null;
        this.a.d(new aicc(aicb.CLIP_VIEWING, amuk.q()));
    }

    public final void j(apyo apyoVar, String str) {
        if (this.i != 0 || str.equals(this.r)) {
            return;
        }
        ((ahvz) this.y.get()).b(apyoVar.e, apyoVar.f);
        if ((apyoVar.b & 16) != 0) {
            apzg apzgVar = apyoVar.g;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            this.e = apzgVar;
        }
        this.r = str;
        this.s = apyoVar.e;
        this.P = false;
        ayqi.c((AtomicReference) this.L);
        this.x = (apyoVar.b & 2) != 0 ? apyoVar.d : "";
    }

    public final void k(String... strArr) {
        for (String str : strArr) {
            aopa createBuilder = HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.a.createBuilder();
            createBuilder.copyOnWrite();
            HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.instance;
            str.getClass();
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.c = 1;
            hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.d = str;
            HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2 = (HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint) createBuilder.mo39build();
            aafo aafoVar = (aafo) this.b.get();
            if (aafoVar != null) {
                aopc aopcVar = (aopc) apzg.a.createBuilder();
                aopcVar.e(HideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint.hideEngagementPanelEndpoint, hideEngagementPanelEndpointOuterClass$HideEngagementPanelEndpoint2);
                aafoVar.a((apzg) aopcVar.mo39build());
            }
        }
        i();
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.gpz
    public final void l() {
        this.P = true;
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void lc(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void ld(apy apyVar) {
    }

    @Override // defpackage.gqe
    public final void m() {
        v(false);
        if (this.w) {
            ((airr) this.B.get()).V(this.Q);
        }
    }

    @Override // defpackage.gqe
    public final void n() {
        v(true);
        if (this.w) {
            if (this.g.g() + 1000 >= this.g.f()) {
                this.Q = Long.MAX_VALUE;
            } else {
                this.Q = this.g.g();
            }
        }
    }

    @Override // defpackage.g
    public final void nA(apy apyVar) {
        i();
        azof.f((AtomicReference) this.D);
        azof.f((AtomicReference) this.E);
        azof.f((AtomicReference) this.F);
        azof.f((AtomicReference) this.G);
        azof.f((AtomicReference) this.f146J);
        azof.f((AtomicReference) this.I);
        azof.f((AtomicReference) this.H);
        ((oev) this.A.get()).d(this);
        ayqi.c((AtomicReference) this.K);
        ayqi.c((AtomicReference) this.L);
        ayqi.c((AtomicReference) this.M);
        ayqi.c((AtomicReference) this.N);
        ayqi.c((AtomicReference) this.O);
        ((aihr) this.c.get()).n.c();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void nz(apy apyVar) {
        kpc kpcVar = (kpc) this.z.get();
        this.D = kpcVar.ae(fuj.r, fuj.s).h(aiwv.l(1)).aa(new gpw(this, 4), fzc.p);
        this.E = kpcVar.X().aa(new gpw(this, 9), fzc.p);
        this.F = kpcVar.Y().aa(new gpw(this, 10), fzc.p);
        this.G = kpcVar.V().aa(new gpw(this, 8), fzc.p);
        this.f146J = kpcVar.G().d.aa(new gpw(this, 6), fzc.p);
        this.I = kpcVar.G().i.aa(new gpw(this, 7), fzc.p);
        this.H = kpcVar.G().a.aa(new gpw(this, 5), fzc.p);
        ((oev) this.A.get()).a(this);
        ((aihr) this.c.get()).f();
        this.K = ((axxe) this.C.get()).a.a.V(axwv.u).B().at(new gpw(this, 3), fzc.p);
        this.L = ((axxe) this.C.get()).a.a.V(axxd.b).B().at(new gpw(this, 2), fzc.p);
        this.M = ((axxe) this.C.get()).a.a.V(axxd.a).B().at(new gpw(this, 11), fzc.p);
        this.N = ((axxe) this.C.get()).a.a.V(axwv.s).B().at(new gpw(this, 1), fzc.p);
        this.O = ((axxe) this.C.get()).a.a.V(axwv.r).B().at(new gpw(this), fzc.p);
    }

    @Override // defpackage.gqi
    public final void o() {
        this.l = false;
        ((ahvz) this.y.get()).a();
    }

    @Override // defpackage.gqi
    public final void p() {
        this.l = true;
    }

    public final void r() {
        grk grkVar;
        if (!this.k || (grkVar = this.f) == null) {
            return;
        }
        grkVar.t(gqd.e(g(grkVar.d), this.g.h(), this.g.f()));
    }

    @Override // defpackage.gqi
    public final boolean s() {
        return this.P;
    }

    @Override // defpackage.gqi
    public final boolean t() {
        return this.m;
    }

    public final boolean u() {
        return this.g.f() > 0;
    }

    public final void q(Runnable runnable, Runnable runnable2) {
        grk grkVar;
        if (!this.n || (grkVar = this.f) == null || (!grkVar.D && !grkVar.E)) {
            runnable2.run();
        } else {
            runnable.run();
        }
    }
}
