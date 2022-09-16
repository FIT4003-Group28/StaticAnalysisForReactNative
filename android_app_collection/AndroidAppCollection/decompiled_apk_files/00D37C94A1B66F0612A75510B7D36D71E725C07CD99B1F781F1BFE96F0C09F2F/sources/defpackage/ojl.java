package defpackage;

import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import android.view.View;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.scrollselection.ScrollSelectionController;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.BrowseEndpointOuterClass;
import com.google.protos.youtube.api.innertube.SearchEndpointOuterClass;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: ojl  reason: default package */
/* loaded from: classes3.dex */
public final class ojl implements gbp, gbn, gbl, fqb, gbu {
    private frv A;
    private luf B;
    private View C;
    private final lnj D;
    private final aacz E;
    private final sdb F;
    public final gbq a;
    public final ofu b;
    public final azqb c;
    public final azqb d;
    public final ind e;
    public final jsc f;
    public final kwa g;
    public final ogl h;
    public PaneDescriptor i;
    public int j = 1;
    public final ise k;
    private final ems l;
    private final ScrollSelectionController m;
    private final jvc n;
    private final evn o;
    private final ois p;
    private final fqd q;
    private final aadd r;
    private final azqb s;
    private final azqb t;
    private final azqb u;
    private final ipn v;
    private final isd w;
    private final kva x;
    private final azqb y;
    private final ojm z;

    public ojl(ems emsVar, gbq gbqVar, ScrollSelectionController scrollSelectionController, ofu ofuVar, sdb sdbVar, jvc jvcVar, evn evnVar, lnj lnjVar, ois oisVar, fqd fqdVar, aadd aaddVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, ipn ipnVar, isd isdVar, ind indVar, jsc jscVar, kva kvaVar, kwa kwaVar, ise iseVar, azqb azqbVar6, ojm ojmVar, aacz aaczVar, ogl oglVar, byte[] bArr) {
        this.m = scrollSelectionController;
        this.l = emsVar;
        this.a = gbqVar;
        this.b = ofuVar;
        this.F = sdbVar;
        this.n = jvcVar;
        this.o = evnVar;
        this.D = lnjVar;
        this.p = oisVar;
        this.q = fqdVar;
        this.r = aaddVar;
        this.c = azqbVar;
        this.s = azqbVar2;
        this.d = azqbVar3;
        this.t = azqbVar4;
        this.u = azqbVar5;
        this.v = ipnVar;
        this.w = isdVar;
        this.e = indVar;
        this.f = jscVar;
        this.x = kvaVar;
        this.g = kwaVar;
        this.k = iseVar;
        this.y = azqbVar6;
        this.z = ojmVar;
        this.E = aaczVar;
        this.h = oglVar;
    }

    private final void t() {
        int d;
        PaneDescriptor c = this.a.c();
        if (c == null) {
            return;
        }
        if (this.C != null) {
            if (fyv.f(c.e(), this.r) - 1 == 3) {
                d = zhn.d(new ContextThemeWrapper(this.l, 2132083889), R.attr.ytBrandBackgroundSolid);
            } else {
                d = zhn.d(this.l, R.attr.ytBrandBackgroundSolid);
            }
            this.C.setBackgroundColor(d);
        }
        if (this.x.b(c)) {
            this.o.a.d(new evg());
        } else if (!this.k.b(c) && !this.e.h(c)) {
            this.o.a();
        }
        this.m.h(null);
        this.D.b();
        if (!this.e.e(c)) {
            this.A.g();
        }
        ((ojq) this.c.get()).x();
    }

    @Override // defpackage.gbh
    public final PaneDescriptor a() {
        return n();
    }

    @Override // defpackage.gbp
    public final void aI(gbr gbrVar) {
        if (this.a.c() == null) {
            return;
        }
        t();
        int i = gbrVar.c;
        boolean z = false;
        if (i != 0) {
            if (i != 1 && i != 2) {
                return;
            }
            this.n.m(false);
            return;
        }
        int i2 = this.j;
        jvc jvcVar = this.n;
        if (1 == ((i2 & 1) ^ 1)) {
            z = true;
        }
        jvcVar.m(z);
    }

    @Override // defpackage.gbh
    public final ayoi b() {
        return this.a.h();
    }

    @Override // defpackage.gbh
    public final void c(boolean z) {
        if (!this.a.G()) {
            if (z) {
                this.l.finish();
            } else {
                r(f(), this.j | 2);
            }
        }
    }

    @Override // defpackage.gbh
    public final void d(PaneDescriptor paneDescriptor) {
        paneDescriptor.getClass();
        r(paneDescriptor, this.j | 1);
    }

    @Override // defpackage.gbn
    public final void e(gbd gbdVar) {
        this.B.e(gbdVar);
        this.l.mA();
        ((frv) this.y.get()).j();
    }

    @Override // defpackage.gbu
    public final PaneDescriptor f() {
        PaneDescriptor b;
        if (this.F.a) {
            if (((fcl) this.u.get()).h()) {
                if (eog.ak(this.E)) {
                    isd isdVar = this.w;
                    aopa createBuilder = apnv.a.createBuilder();
                    createBuilder.copyOnWrite();
                    apnv apnvVar = (apnv) createBuilder.instance;
                    apnvVar.b = 1 | apnvVar.b;
                    apnvVar.c = "FElibrary";
                    aopc aopcVar = (aopc) apzg.a.createBuilder();
                    aopcVar.e(BrowseEndpointOuterClass.browseEndpoint, (apnv) createBuilder.mo39build());
                    return isdVar.a((apzg) aopcVar.mo39build());
                } else if (zew.m(this.l) == 4) {
                    ipn ipnVar = this.v;
                    aopa createBuilder2 = apnv.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    apnv apnvVar2 = (apnv) createBuilder2.instance;
                    apnvVar2.b = 1 | apnvVar2.b;
                    apnvVar2.c = "FElibrary";
                    aopc aopcVar2 = (aopc) apzg.a.createBuilder();
                    aopcVar2.e(BrowseEndpointOuterClass.browseEndpoint, (apnv) createBuilder2.mo39build());
                    return ipnVar.a((apzg) aopcVar2.mo39build());
                } else {
                    return this.f.a();
                }
            }
            etd etdVar = (etd) this.t.get();
            try {
                if (!((fcl) this.u.get()).h()) {
                    b = this.e.b(aafr.d("FEwhat_to_watch"), true);
                } else {
                    etdVar.g();
                    b = this.e.b(aafr.d("FElibrary"), true);
                }
                return b;
            } catch (IOException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("Failed to get offline response: ");
                sb.append(valueOf);
                zep.b(sb.toString());
                return o();
            }
        }
        return o();
    }

    @Override // defpackage.fqb
    public final void g(Configuration configuration) {
        gbd h = h();
        if (h == null) {
            return;
        }
        int aJ = h.aJ();
        if ((Math.min(configuration.screenWidthDp, configuration.screenHeightDp) < aJ || h().aY()) && (Math.min(configuration.screenWidthDp, configuration.screenHeightDp) >= aJ || !h().aY())) {
            return;
        }
        this.a.s();
    }

    @Override // defpackage.gbu
    public final gbd h() {
        return this.a.e();
    }

    @Override // defpackage.gbu
    public final gbd i() {
        gbd h = h();
        if (h != null) {
            if (ggs.i()) {
                if (!h.at()) {
                    return null;
                }
            } else if (!h.ar()) {
                return null;
            }
            return h;
        }
        return null;
    }

    @Override // defpackage.gbu
    public final String j() {
        gbd i = i();
        if (i != null) {
            PaneDescriptor.b(i);
            apzg e = PaneDescriptor.b(i).e();
            if (e != null && e.qn(SearchEndpointOuterClass.searchEndpoint)) {
                return ((auoy) e.qm(SearchEndpointOuterClass.searchEndpoint)).f;
            }
        }
        return null;
    }

    @Override // defpackage.gbu
    public final void k() {
        this.a.t();
    }

    @Override // defpackage.gbu
    public final void l() {
        this.a.u();
    }

    @Override // defpackage.gbu
    public final void m() {
        s(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PaneDescriptor n() {
        return this.a.c();
    }

    final PaneDescriptor o() {
        return this.e.b(aafr.a("FEwhat_to_watch"), true);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void p(int... iArr) {
        for (int i = 0; i <= 0; i++) {
            this.j = iArr[i] | this.j;
        }
    }

    @Override // defpackage.gbl
    public final void pr(int i, int i2) {
        if (this.a.c() == null) {
            return;
        }
        t();
        this.n.m(false);
    }

    public final void q(luf lufVar, frv frvVar) {
        this.A = frvVar;
        this.B = lufVar;
        this.a.l(lufVar);
        this.a.y(this);
        this.a.l(this);
        this.a.k(this);
        this.a.k(this.p);
        this.a.j(this);
        this.a.H(new ojj(this));
        this.a.x(this.l.getClassLoader());
        this.q.f(this);
        this.C = this.l.findViewById(R.id.pane_fragment_container);
    }

    public final void r(PaneDescriptor paneDescriptor, int i) {
        boolean b = this.k.b(paneDescriptor);
        ojx ojxVar = (ojx) this.s.get();
        if (!this.z.b() && (b || ojxVar.l != 0)) {
            int i2 = this.j;
            this.j = i;
            if (paneDescriptor.b.getBoolean("detail_pane", false)) {
                this.a.q(paneDescriptor);
            } else {
                this.a.E(paneDescriptor);
            }
            this.j = i2;
            return;
        }
        this.i = paneDescriptor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void s(boolean z) {
        PaneDescriptor n = n();
        int i = true != z ? 0 : 2;
        PaneDescriptor paneDescriptor = this.i;
        if (paneDescriptor != null) {
            r(paneDescriptor, this.j | i);
            this.i = null;
        } else if (!z && n != null && !this.k.b(n)) {
        } else {
            r(f(), (this.j | i) & (-2));
        }
    }
}
