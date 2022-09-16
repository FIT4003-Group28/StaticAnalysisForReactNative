package defpackage;

import android.view.View;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
/* compiled from: PG */
/* renamed from: obr  reason: default package */
/* loaded from: classes3.dex */
public final class obr implements ajrt {
    final /* synthetic */ DefaultWatchPanelViewController a;
    private final /* synthetic */ int b;

    public obr(DefaultWatchPanelViewController defaultWatchPanelViewController) {
        this.a = defaultWatchPanelViewController;
    }

    public /* synthetic */ obr(DefaultWatchPanelViewController defaultWatchPanelViewController, int i) {
        this.b = i;
        this.a = defaultWatchPanelViewController;
    }

    @Override // defpackage.ajrt
    public final void a(ajrs ajrsVar, ajqm ajqmVar, int i) {
        if (this.b == 0) {
            ajrsVar.f("always_display_as_grid", Boolean.valueOf(this.a.u(this.a.a.getResources().getConfiguration())));
            return;
        }
        final DefaultWatchPanelViewController defaultWatchPanelViewController = this.a;
        ajrsVar.f("watchNextChipsVisibilityPredicate", new ampt() { // from class: obo
            @Override // defpackage.ampt
            public final boolean a(Object obj) {
                View view;
                View view2 = (View) obj;
                gfm gfmVar = DefaultWatchPanelViewController.this.v;
                return (gfmVar == null || (view = gfmVar.i) == null || view2 != view) ? false : true;
            }
        });
    }
}
