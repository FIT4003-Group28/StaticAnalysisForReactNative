package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.ViewGroup;
import com.google.android.apps.youtube.app.common.ui.navigation.PaneDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PaneFragmentPanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelDescriptor;
import com.google.android.apps.youtube.app.common.ui.navigation.panels.PanelsConfiguration;
import com.google.android.apps.youtube.app.fragments.panels.AutoValue_PanePanelsController_PanePanelsState;
import com.google.android.apps.youtube.app.fragments.panels.PanePanelsController$PanePanelsState;
import com.google.android.youtube.R;
import j$.util.Optional;
import j$.util.function.Consumer;
/* compiled from: PG */
/* renamed from: irm  reason: default package */
/* loaded from: classes3.dex */
public final class irm implements gbv, gbp, gbn, irv, gbl, gbm {
    final gbq a;
    public final SparseArray b;
    PanelsConfiguration c;
    private final aafd d;
    private final eo e;
    private final Context f;
    private final irw g;

    public irm(oa oaVar, ypf ypfVar, aafd aafdVar, ViewGroup viewGroup, gbq gbqVar, irx irxVar) {
        this.f = oaVar;
        this.e = oaVar.getSupportFragmentManager();
        this.d = aafdVar;
        this.a = gbqVar;
        blj savedStateRegistry = oaVar.getSavedStateRegistry();
        irw a = irxVar.a(ypfVar, viewGroup, R.id.selection_container, R.id.pane_fragment_container, R.id.selection_detial_panel_separator, this, new amqo() { // from class: irk
            @Override // defpackage.amqo
            public final Object get() {
                return Optional.ofNullable(irm.this.c);
            }
        }, Optional.ofNullable(savedStateRegistry.a("fragments.panels.PanePanelsController.restoredPanelsLayoutController")));
        this.g = a;
        gbqVar.l(this);
        gbqVar.k(this);
        gbqVar.j(this);
        savedStateRegistry.b("PANELS_MANAGER_BUNDLE", new bli() { // from class: irj
            @Override // defpackage.bli
            public final Bundle a() {
                irm irmVar = irm.this;
                Bundle bundle = new Bundle(1);
                if (irmVar.b.size() > 0) {
                    bundle.putSparseParcelableArray("fragments.panels.PanePanelsController.restoredSparsePanePanelsConfiguration", irmVar.b);
                }
                return bundle;
            }
        });
        a.getClass();
        savedStateRegistry.b("fragments.panels.PanePanelsController.restoredPanelsLayoutController", new iry(a, 1));
        Bundle a2 = savedStateRegistry.a("PANELS_MANAGER_BUNDLE");
        if (a2 == null || !a2.containsKey("fragments.panels.PanePanelsController.restoredSparsePanePanelsConfiguration")) {
            this.b = new SparseArray();
            return;
        }
        this.b = a2.getSparseParcelableArray("fragments.panels.PanePanelsController.restoredSparsePanePanelsConfiguration");
        n();
    }

    private final Optional k(int i) {
        return Optional.ofNullable((PanePanelsController$PanePanelsState) this.b.get(i));
    }

    private final void l() {
        this.c = null;
        this.b.remove(this.a.a());
    }

    private final void m(PanelsConfiguration panelsConfiguration, boolean z) {
        if (panelsConfiguration == null) {
            return;
        }
        this.c = panelsConfiguration;
        SparseArray sparseArray = this.b;
        int a = this.a.a();
        PanelsConfiguration panelsConfiguration2 = this.c;
        sparseArray.put(a, new AutoValue_PanePanelsController_PanePanelsState((PaneFragmentPanelDescriptor) panelsConfiguration2.a, (PaneFragmentPanelDescriptor) panelsConfiguration2.b.orElse(null)));
        if (!z) {
            return;
        }
        this.g.c();
    }

    private final void n() {
        Optional empty;
        Optional k = k(this.a.a());
        if (k.isPresent()) {
            if (((PanePanelsController$PanePanelsState) k.get()).a() == null) {
                empty = Optional.of(PanelsConfiguration.b(((PanePanelsController$PanePanelsState) k.get()).b()));
            } else {
                empty = Optional.of(PanelsConfiguration.c(((PanePanelsController$PanePanelsState) k.get()).b(), ((PanePanelsController$PanePanelsState) k.get()).a()));
            }
        } else {
            empty = Optional.empty();
        }
        PanelsConfiguration panelsConfiguration = (PanelsConfiguration) empty.orElse(null);
        l();
        m(panelsConfiguration, o(panelsConfiguration));
    }

    private final boolean o(PanelsConfiguration panelsConfiguration) {
        if (panelsConfiguration == null) {
            return false;
        }
        return PaneDescriptor.k(((PaneFragmentPanelDescriptor) panelsConfiguration.a()).a(), this.a.c(), this.d);
    }

    @Override // defpackage.gbv
    public final boolean C() {
        return false;
    }

    @Override // defpackage.gbv
    public final void b(PanelsConfiguration panelsConfiguration) {
        m(panelsConfiguration, true);
    }

    @Override // defpackage.gbv
    public final /* bridge */ /* synthetic */ void c(PanelDescriptor panelDescriptor, boolean z) {
        PaneFragmentPanelDescriptor paneFragmentPanelDescriptor = (PaneFragmentPanelDescriptor) panelDescriptor;
    }

    @Override // defpackage.gcm
    public final boolean d() {
        return this.g.g();
    }

    @Override // defpackage.gbn
    public final void e(gbd gbdVar) {
        if (this.c == null || !PaneDescriptor.k(PaneDescriptor.b(gbdVar), ((PaneFragmentPanelDescriptor) this.c.a()).a(), this.d)) {
            return;
        }
        irw.b(this.f, gbdVar, this.g.h);
    }

    @Override // defpackage.gcm
    public final boolean f() {
        return this.g.i() && !this.g.h();
    }

    @Override // defpackage.irv
    public final void g(PanelDescriptor panelDescriptor, int i) {
    }

    @Override // defpackage.irv
    public final void h() {
    }

    @Override // defpackage.irv
    public final void j(int i, int i2) {
        if (!o(this.c)) {
            return;
        }
        irw.b(this.f, this.e.e(i), i2);
    }

    @Override // defpackage.gbm
    public final void mO() {
        final int a = this.a.a();
        Optional k = k(this.a.a());
        this.b.clear();
        k.ifPresent(new Consumer() { // from class: irl
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                irm.this.b.put(a, (PanePanelsController$PanePanelsState) obj);
            }

            @Override // j$.util.function.Consumer
            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return consumer.getClass();
            }
        });
    }

    @Override // defpackage.irv
    public final void mP(int i) {
    }

    @Override // defpackage.gbl
    public final void pr(int i, int i2) {
        n();
    }

    @Override // defpackage.gbp
    public final void aI(gbr gbrVar) {
        PanelsConfiguration panelsConfiguration = this.c;
        if (panelsConfiguration != null) {
            int i = gbrVar.c;
            if (i == 1) {
                if (!PaneDescriptor.k(((PaneFragmentPanelDescriptor) panelsConfiguration.a()).a(), gbrVar.a, this.d)) {
                    return;
                }
                l();
            } else if (i != 2 || PaneDescriptor.k(((PaneFragmentPanelDescriptor) panelsConfiguration.a()).a(), gbrVar.b, this.d)) {
            } else {
                l();
            }
        }
    }
}
