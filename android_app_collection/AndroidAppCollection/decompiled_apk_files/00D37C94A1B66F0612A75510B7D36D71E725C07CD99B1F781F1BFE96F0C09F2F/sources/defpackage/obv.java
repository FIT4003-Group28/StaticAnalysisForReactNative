package defpackage;

import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
/* compiled from: PG */
/* renamed from: obv  reason: default package */
/* loaded from: classes3.dex */
public final class obv implements nqj {
    final /* synthetic */ DefaultWatchPanelViewController a;

    public obv(DefaultWatchPanelViewController defaultWatchPanelViewController) {
        this.a = defaultWatchPanelViewController;
    }

    @Override // defpackage.nqj
    public final void g(nmc nmcVar) {
        DefaultWatchPanelViewController defaultWatchPanelViewController;
        nmc nmcVar2;
        if (nmcVar != null) {
            DefaultWatchPanelViewController defaultWatchPanelViewController2 = this.a;
            if (defaultWatchPanelViewController2.l == null) {
                defaultWatchPanelViewController2.m.g(8, defaultWatchPanelViewController2.f.a(nmcVar));
                this.a.l = nmcVar;
            }
        }
        if (nmcVar == null && (nmcVar2 = (defaultWatchPanelViewController = this.a).l) != null) {
            defaultWatchPanelViewController.m.d(8, defaultWatchPanelViewController.f.a(nmcVar2));
        }
        this.a.l = nmcVar;
    }
}
