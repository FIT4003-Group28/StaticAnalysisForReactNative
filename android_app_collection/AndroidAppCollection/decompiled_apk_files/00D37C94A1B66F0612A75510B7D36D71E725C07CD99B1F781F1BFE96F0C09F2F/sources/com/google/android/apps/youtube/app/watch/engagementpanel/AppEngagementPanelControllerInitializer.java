package com.google.android.apps.youtube.app.watch.engagementpanel;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.apps.youtube.app.watch.engagementpanel.AppEngagementPanelControllerInitializer;
import com.google.android.apps.youtube.app.watch.engagementpanel.size.EngagementPanelSizeBehavior;
import com.google.android.libraries.youtube.common.ui.AccessibilityLayerLayout;
import com.google.android.youtube.R;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AppEngagementPanelControllerInitializer implements f, zas {
    public final nml a;
    public final okf b;
    public yye c;
    private final ViewGroup d;
    private final ezh e;
    private final gbq f;
    private final aypf g = new aypf();
    private final gbp h;

    public AppEngagementPanelControllerInitializer(ViewGroup viewGroup, final nml nmlVar, ezh ezhVar, gbq gbqVar, okf okfVar) {
        this.d = viewGroup;
        this.a = nmlVar;
        this.e = ezhVar;
        this.f = gbqVar;
        this.b = okfVar;
        this.h = new gbp() { // from class: nkq
            @Override // defpackage.gbp
            public final void aI(gbr gbrVar) {
                nml.this.t();
            }
        };
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void kG(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final void lc(apy apyVar) {
        final AccessibilityLayerLayout accessibilityLayerLayout = (AccessibilityLayerLayout) this.d.findViewById(R.id.accessibility_layer_container);
        final View findViewById = accessibilityLayerLayout.findViewById(R.id.app_engagement_panel_wrapper);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById.findViewById(R.id.app_engagement_panel);
        final ocj d = ohn.d(new yye(findViewById.findViewById(R.id.scrim)));
        d.a(this.a);
        this.a.j(relativeLayout, null);
        EngagementPanelSizeBehavior engagementPanelSizeBehavior = this.a.h().b;
        engagementPanelSizeBehavior.x(this.a.h(), relativeLayout);
        zgd.t(relativeLayout, zgd.f(engagementPanelSizeBehavior), ajf.class);
        aypf aypfVar = this.g;
        aynx aynxVar = this.a.h().m;
        relativeLayout.getClass();
        aypfVar.d(aynxVar.Z(new nkr(relativeLayout)));
        yye D = this.a.D();
        this.c = D;
        D.h(this);
        this.g.d(this.a.g().c.Z(new ayqb() { // from class: nkt
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                AppEngagementPanelControllerInitializer appEngagementPanelControllerInitializer = AppEngagementPanelControllerInitializer.this;
                View view = findViewById;
                AccessibilityLayerLayout accessibilityLayerLayout2 = accessibilityLayerLayout;
                ocj ocjVar = d;
                ampq ampqVar = (ampq) obj;
                if (ampqVar.h()) {
                    zag.o(view, true);
                }
                appEngagementPanelControllerInitializer.c.a(ampqVar.h(), true);
                appEngagementPanelControllerInitializer.b.g(ampqVar.h());
                accessibilityLayerLayout2.b(!ampqVar.h());
                ocjVar.b(false, ampqVar.h());
            }
        }));
        this.g.d(this.e.h().as(new ayqb() { // from class: nks
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                AppEngagementPanelControllerInitializer appEngagementPanelControllerInitializer = AppEngagementPanelControllerInitializer.this;
                if (((ezx) obj).i()) {
                    while (appEngagementPanelControllerInitializer.a.y()) {
                        appEngagementPanelControllerInitializer.a.o(ampu.ALWAYS_TRUE, false);
                    }
                }
            }
        }));
        this.f.l(this.h);
    }

    @Override // defpackage.f, defpackage.g
    public final void ld(apy apyVar) {
        this.c.j(this);
        this.f.v(this.h);
        this.g.c();
    }

    @Override // defpackage.g
    public final /* synthetic */ void nA(apy apyVar) {
    }

    @Override // defpackage.zas
    public final void nH(int i, yye yyeVar) {
        if (i == 0) {
            zag.o(this.d.findViewById(R.id.app_engagement_panel_wrapper), false);
        }
    }

    @Override // defpackage.g
    public final /* synthetic */ void nv(apy apyVar) {
    }

    @Override // defpackage.f, defpackage.g
    public final /* synthetic */ void nz(apy apyVar) {
    }
}
