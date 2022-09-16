package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment$SavedState;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.fragments.panels.PanelsBackStack;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: isc  reason: default package */
/* loaded from: classes3.dex */
public final class isc implements gbv, irv {
    final PanelsBackStack a;
    public final eo b;
    public PanelDescriptor c;
    PanelsConfiguration d;
    private final Context e;
    private final irw f;

    public isc(oa oaVar, ypf ypfVar, ViewGroup viewGroup, irx irxVar) {
        this.e = oaVar;
        this.b = oaVar.getSupportFragmentManager();
        blj savedStateRegistry = oaVar.getSavedStateRegistry();
        irw a = irxVar.a(ypfVar, viewGroup, R.id.settings_selection_container, R.id.settings_detail_container, R.id.settings_selection_detail_panel_separator, this, new amqo() { // from class: isa
            @Override // defpackage.amqo
            public final Object get() {
                return Optional.ofNullable(isc.this.d);
            }
        }, Optional.ofNullable(savedStateRegistry.a("fragments.panels.SelectionDetailPanelsController.restoredPanelsLayoutController")));
        this.f = a;
        savedStateRegistry.b("PANELS_MANAGER_BUNDLE", new bli() { // from class: irz
            @Override // defpackage.bli
            public final Bundle a() {
                isc iscVar = isc.this;
                Bundle bundle = new Bundle();
                PanelsConfiguration panelsConfiguration = iscVar.d;
                if (panelsConfiguration != null) {
                    bundle.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootSelectionPanel", panelsConfiguration.a);
                    bundle.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootDetailPanel", (Parcelable) iscVar.d.b.orElse(null));
                    bundle.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredBackStack", iscVar.a);
                    PanelDescriptor panelDescriptor = iscVar.c;
                    if (panelDescriptor != null && !panelDescriptor.equals(iscVar.d.a())) {
                        bundle.putParcelable("fragments.panels.SelectionDetailPanelsController.restoredMainDescriptor", iscVar.c);
                    }
                }
                return bundle;
            }
        });
        a.getClass();
        savedStateRegistry.b("fragments.panels.SelectionDetailPanelsController.restoredPanelsLayoutController", new iry(a));
        Bundle a2 = savedStateRegistry.a("PANELS_MANAGER_BUNDLE");
        if (a2 == null || !a2.containsKey("fragments.panels.SelectionDetailPanelsController.restoredBackStack")) {
            this.a = PanelsBackStack.e(new ArrayList());
            return;
        }
        this.a = (PanelsBackStack) a2.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredBackStack");
        if (((PanelDescriptor) a2.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootDetailPanel")) != null) {
            this.d = PanelsConfiguration.c((PanelDescriptor) a2.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootSelectionPanel"), (PanelDescriptor) a2.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootDetailPanel"));
        } else {
            this.d = PanelsConfiguration.b((PanelDescriptor) a2.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredRootSelectionPanel"));
        }
        b(this.d);
        PanelDescriptor panelDescriptor = (PanelDescriptor) a2.getParcelable("fragments.panels.SelectionDetailPanelsController.restoredMainDescriptor");
        if (panelDescriptor == null) {
            return;
        }
        c(panelDescriptor, false);
    }

    @Override // defpackage.gbv
    public final boolean C() {
        if (this.d == null) {
            return false;
        }
        if (!this.a.g()) {
            a(this.a.d().a, true);
            return true;
        } else if (!d()) {
            return this.f.j();
        } else {
            return false;
        }
    }

    @Override // defpackage.gbv
    public final void b(PanelsConfiguration panelsConfiguration) {
        if (panelsConfiguration == null) {
            return;
        }
        this.a.h();
        this.c = null;
        this.d = panelsConfiguration;
        this.f.c();
    }

    @Override // defpackage.gbv
    public final void c(PanelDescriptor panelDescriptor, boolean z) {
        PanelsConfiguration panelsConfiguration = this.d;
        if (panelsConfiguration == null) {
            return;
        }
        if (panelsConfiguration.d() && z) {
            this.a.h();
            this.c = null;
            this.d = PanelsConfiguration.c(this.d.a, panelDescriptor);
        }
        PanelDescriptor panelDescriptor2 = this.c;
        a(panelDescriptor, panelDescriptor2 == null ? true : panelDescriptor2.equals(panelDescriptor));
    }

    @Override // defpackage.gcm
    public final boolean d() {
        return this.f.g();
    }

    @Override // defpackage.gcm
    public final boolean f() {
        return this.f.i() && !this.f.h();
    }

    @Override // defpackage.irv
    public final void g(final PanelDescriptor panelDescriptor, final int i) {
        if (i == R.id.settings_detail_container) {
            this.c = panelDescriptor;
            i = R.id.settings_detail_container;
        }
        panelDescriptor.c().ifPresent(new Consumer() { // from class: isb
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                isc iscVar = isc.this;
                int i2 = i;
                PanelDescriptor panelDescriptor2 = panelDescriptor;
                ex l = iscVar.b.l();
                l.u(i2, (dp) obj, panelDescriptor2.d());
                if (iscVar.d()) {
                    l.i = 4099;
                }
                l.d();
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
    }

    @Override // defpackage.irv
    public final void h() {
    }

    @Override // defpackage.irv
    public final void j(int i, int i2) {
        irw.b(this.e, this.b.e(i), i2);
    }

    @Override // defpackage.irv
    public final void mP(int i) {
        dp e = this.b.e(i);
        if (e != null) {
            ex l = this.b.l();
            l.m(e);
            l.d();
        }
    }

    private final void a(PanelDescriptor panelDescriptor, boolean z) {
        if (!z && this.c != null) {
            dp e = this.b.e(R.id.settings_detail_container);
            Fragment$SavedState c = e != null ? this.b.c(e) : null;
            PanelsBackStack panelsBackStack = this.a;
            PanelDescriptor panelDescriptor2 = this.c;
            panelsBackStack.f(panelDescriptor2, c, null, panelDescriptor2.d());
        }
        this.f.d();
        g(panelDescriptor, R.id.settings_detail_container);
        j(R.id.settings_detail_container, this.f.h);
    }
}
