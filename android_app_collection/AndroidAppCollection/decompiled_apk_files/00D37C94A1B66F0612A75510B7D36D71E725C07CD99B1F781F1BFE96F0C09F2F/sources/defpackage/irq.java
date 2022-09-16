package defpackage;

import android.os.Bundle;
import android.support.v4.app.Fragment$SavedState;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.fragments.panels.PanelsBackStack;
import com.google.android.youtube.R;
import j$.util.Optional;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: irq  reason: default package */
/* loaded from: classes3.dex */
public final class irq extends iri implements gbk, gbv, irv {
    public aafd a;
    private Object af;
    private Fragment$SavedState ag;
    private PanelDescriptor ah;
    private Object ai;
    private Fragment$SavedState aj;
    private PanelDescriptor ak;
    private PanelDescriptor al;
    private irw an;
    public irx b;
    public ypf c;
    public axnm d;
    public PanelsConfiguration e;
    private Optional ae = Optional.empty();
    private PanelsBackStack am = PanelsBackStack.e(new ArrayList());

    private final dp aG(int i) {
        return mL().e(i);
    }

    private final PanelDescriptor aH() {
        dp r = r();
        return r instanceof gbd ? PaneFragmentPanelDescriptor.b(PaneDescriptor.b((gbd) r)) : this.al;
    }

    private final void aI(PanelsBackStack.PanelsBackStackEntry panelsBackStackEntry) {
        if (panelsBackStackEntry == null) {
            return;
        }
        this.ak = panelsBackStackEntry.a;
        this.aj = panelsBackStackEntry.b;
        this.ai = panelsBackStackEntry.c;
        dp r = r();
        PanelDescriptor panelDescriptor = this.ak;
        if ((panelDescriptor instanceof PaneFragmentPanelDescriptor) && (r instanceof gbd)) {
            gbd gbdVar = (gbd) r;
            aopa createBuilder = atnp.a.createBuilder();
            if (gbdVar.oi() != null && gbdVar.oi().k() != null) {
                String k = gbdVar.oi().k();
                createBuilder.copyOnWrite();
                atnp atnpVar = (atnp) createBuilder.instance;
                k.getClass();
                atnpVar.b |= 1;
                atnpVar.c = k;
            }
            int i = actj.MOBILE_BACK_BUTTON.II;
            createBuilder.copyOnWrite();
            atnp atnpVar2 = (atnp) createBuilder.instance;
            atnpVar2.b |= 2;
            atnpVar2.d = i;
            ((PaneFragmentPanelDescriptor) panelDescriptor).a().j((atnp) createBuilder.mo39build());
        }
        bd(this.ak, false);
    }

    private final void bd(PanelDescriptor panelDescriptor, boolean z) {
        PanelDescriptor aH;
        if (z && (aH = aH()) != null) {
            dp r = r();
            this.am.f(aH, mL().c(r), r instanceof gbd ? ((gbd) r).aQ() : null, aH.d());
        }
        this.an.d();
        g(panelDescriptor, R.id.detail_panel_container);
        j(R.id.detail_panel_container, this.an.h);
    }

    private static final Optional be(PanelDescriptor panelDescriptor) {
        if (!(panelDescriptor instanceof PaneFragmentPanelDescriptor)) {
            return Optional.empty();
        }
        return Optional.of(((PaneFragmentPanelDescriptor) panelDescriptor).a());
    }

    private static final void bf(PanelDescriptor panelDescriptor, PanelDescriptor panelDescriptor2, dp dpVar, Fragment$SavedState fragment$SavedState) {
        if (panelDescriptor != panelDescriptor2 || fragment$SavedState == null) {
            return;
        }
        dpVar.ag(fragment$SavedState);
    }

    @Override // defpackage.gbk
    public final boolean B() {
        if (!this.am.g()) {
            return false;
        }
        return d() || !aY() || this.an.i();
    }

    @Override // defpackage.gbk
    public final boolean C() {
        if (this.am.g()) {
            return this.an.j();
        }
        aI(this.am.d());
        return true;
    }

    @Override // defpackage.gbk
    public final boolean D() {
        if (this.am.g()) {
            return this.an.j();
        }
        PanelsBackStack.PanelsBackStackEntry c = this.am.c();
        this.am.h();
        aI(c);
        return true;
    }

    @Override // defpackage.gbk
    public final boolean E(PaneDescriptor paneDescriptor) {
        return aF(PaneFragmentPanelDescriptor.b(paneDescriptor), paneDescriptor.b.getBoolean("selection_panel_selection_changed", false));
    }

    @Override // defpackage.gbk
    public final boolean G() {
        return C();
    }

    public final boolean aE() {
        irw irwVar = this.an;
        return irwVar != null && !irwVar.i() && this.an.h();
    }

    public final boolean aF(PaneFragmentPanelDescriptor paneFragmentPanelDescriptor, boolean z) {
        PanelsConfiguration panelsConfiguration = this.e;
        boolean z2 = false;
        if (panelsConfiguration == null) {
            return false;
        }
        if (panelsConfiguration.d() && z) {
            this.am.h();
            this.al = null;
            this.e = PanelsConfiguration.c((PaneFragmentPanelDescriptor) this.e.a, paneFragmentPanelDescriptor);
        }
        PanelDescriptor panelDescriptor = this.al;
        if (panelDescriptor != null && !panelDescriptor.equals(paneFragmentPanelDescriptor)) {
            z2 = true;
        }
        bd(paneFragmentPanelDescriptor, z2);
        return true;
    }

    @Override // defpackage.gbd
    public final fsx aL(fsx fsxVar) {
        if (aE()) {
            dp r = r();
            return r instanceof gbd ? ((gbd) r).lt() : fsxVar;
        }
        return fsxVar;
    }

    @Override // defpackage.gbd
    public final Optional aO(PaneDescriptor paneDescriptor) {
        if (PaneDescriptor.k(paneDescriptor, (PaneDescriptor) be(this.ah).orElse(null), this.a)) {
            return Optional.ofNullable(this.af);
        }
        if (PaneDescriptor.k(paneDescriptor, (PaneDescriptor) be(this.ak).orElse(null), this.a)) {
            return Optional.ofNullable(this.ai);
        }
        return Optional.empty();
    }

    @Override // defpackage.gbd
    public final Object aQ() {
        PanelDescriptor panelDescriptor;
        iro iroVar = new iro();
        dp s = s();
        if (s != null) {
            if (s instanceof gbd) {
                iroVar.a = ((gbd) s).aQ();
            }
            iroVar.d = mL().c(s);
        }
        dp r = r();
        if (r != null) {
            if (r instanceof gbd) {
                iroVar.b = ((gbd) r).aQ();
            }
            iroVar.e = mL().c(r);
        }
        iroVar.c = this.am;
        dp s2 = s();
        if (s2 instanceof gbd) {
            panelDescriptor = PaneFragmentPanelDescriptor.b(PaneDescriptor.b((gbd) s2));
        } else {
            PanelsConfiguration panelsConfiguration = this.e;
            panelDescriptor = panelsConfiguration != null ? panelsConfiguration.a : null;
        }
        iroVar.g = panelDescriptor;
        iroVar.f = aH();
        return new irp(iroVar.a, iroVar.b, iroVar.c, iroVar.d, iroVar.e, iroVar.f, iroVar.g);
    }

    @Override // defpackage.gbd
    public final void aV(Object obj) {
        if (!(obj instanceof irp)) {
            return;
        }
        this.ae = Optional.of((irp) obj);
    }

    @Override // defpackage.gbd
    public final boolean aY() {
        PanelsConfiguration panelsConfiguration = this.e;
        return panelsConfiguration != null && panelsConfiguration.d();
    }

    @Override // defpackage.gbv
    public final void b(PanelsConfiguration panelsConfiguration) {
        if (panelsConfiguration == null) {
            return;
        }
        this.e = null;
        this.al = null;
        this.af = null;
        this.ag = null;
        this.ah = null;
        this.ai = null;
        this.aj = null;
        this.ak = null;
        this.am.h();
        this.e = panelsConfiguration;
        if (!this.ae.isPresent()) {
            this.an.c();
            return;
        }
        irp irpVar = (irp) this.ae.get();
        this.af = irpVar.a;
        this.ah = irpVar.g;
        this.ag = irpVar.d;
        this.ai = irpVar.b;
        this.ak = irpVar.f;
        this.aj = irpVar.e;
        this.am = irpVar.c;
        g(this.ah, R.id.selection_panel_container);
        j(R.id.selection_panel_container, this.an.g);
        g(this.ak, R.id.detail_panel_container);
        j(R.id.detail_panel_container, this.an.h);
    }

    @Override // defpackage.gbv
    public final /* bridge */ /* synthetic */ void c(PanelDescriptor panelDescriptor, boolean z) {
        aF((PaneFragmentPanelDescriptor) panelDescriptor, true);
    }

    @Override // defpackage.gcm
    public final boolean d() {
        return this.an.g();
    }

    @Override // defpackage.gcm
    public final boolean f() {
        irw irwVar = this.an;
        return irwVar != null && irwVar.i() && !this.an.h();
    }

    @Override // defpackage.irv
    public final void g(PanelDescriptor panelDescriptor, int i) {
        if (panelDescriptor == null) {
            return;
        }
        Optional c = panelDescriptor.c();
        if (!c.isPresent()) {
            return;
        }
        if (i == R.id.detail_panel_container) {
            this.al = panelDescriptor;
        }
        dp dpVar = (dp) c.get();
        if (dpVar instanceof gbd) {
            if (dpVar.m == null) {
                dpVar.ae(new Bundle());
            }
            if (this.e.d() && i == R.id.detail_panel_container) {
                dpVar.m.putBoolean("needs_nested_header", true);
            }
            if (i == R.id.selection_panel_container) {
                dpVar.m.putBoolean("selection_panel", true);
            }
        }
        bf(panelDescriptor, this.ah, dpVar, this.ag);
        bf(panelDescriptor, this.ak, dpVar, this.aj);
        ex l = mL().l();
        l.u(i, dpVar, panelDescriptor.d());
        l.i = 0;
        l.d();
    }

    @Override // defpackage.irv
    public final void h() {
        ((frv) this.d.get()).o();
        ((frv) this.d.get()).j();
        dp r = r();
        if (r instanceof gbd) {
            ((gbd) r).aW(d());
        }
    }

    @Override // defpackage.irv
    public final void j(int i, int i2) {
        irw.b(rb(), aG(i), i2);
    }

    @Override // defpackage.gbd
    public final fsx lt() {
        fsx fsxVar = this.as;
        if (aE()) {
            dp r = r();
            return r instanceof gbd ? ((gbd) r).lt() : fsxVar;
        }
        return fsxVar;
    }

    @Override // defpackage.irv
    public final void mP(int i) {
        dp aG = aG(i);
        if (aG != null) {
            ex l = mL().l();
            l.m(aG);
            l.d();
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.panels_fragment_layout, viewGroup, false);
        PanelsConfiguration panelsConfiguration = null;
        this.an = this.b.a(this.c, (ViewGroup) inflate, R.id.selection_panel_container, R.id.detail_panel_container, R.id.panel_separator, this, new amqo() { // from class: irn
            @Override // defpackage.amqo
            public final Object get() {
                return Optional.ofNullable(irq.this.e);
            }
        }, Optional.ofNullable(bundle != null ? bundle.getBundle("fragments.panels.PanelsFragment.restoredPanelsLayoutController") : null));
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            panelsConfiguration = (PanelsConfiguration) bundle2.getParcelable("panels_configuration");
        }
        b(panelsConfiguration);
        return inflate;
    }

    @Override // defpackage.gbk
    public final /* synthetic */ void n() {
        throw null;
    }

    @Override // defpackage.dp
    public final void oz(Bundle bundle) {
        bundle.putBundle("fragments.panels.PanelsFragment.restoredPanelsLayoutController", this.an.a());
    }

    public final dp r() {
        return aG(R.id.detail_panel_container);
    }

    public final dp s() {
        return aG(R.id.selection_panel_container);
    }
}
