package defpackage;

import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
/* compiled from: PG */
/* renamed from: obh  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class obh implements ayqb {
    public final /* synthetic */ DefaultWatchPanelViewController a;
    private final /* synthetic */ int b;

    public /* synthetic */ obh(DefaultWatchPanelViewController defaultWatchPanelViewController) {
        this.a = defaultWatchPanelViewController;
    }

    public /* synthetic */ obh(DefaultWatchPanelViewController defaultWatchPanelViewController, int i) {
        this.b = i;
        this.a = defaultWatchPanelViewController;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            DefaultWatchPanelViewController defaultWatchPanelViewController = this.a;
            Boolean bool = (Boolean) obj;
            if (defaultWatchPanelViewController.y == bool.booleanValue()) {
                return;
            }
            boolean u = defaultWatchPanelViewController.u(defaultWatchPanelViewController.x);
            defaultWatchPanelViewController.y = bool.booleanValue();
            if (u == defaultWatchPanelViewController.u(defaultWatchPanelViewController.x)) {
                return;
            }
            defaultWatchPanelViewController.s.c(defaultWatchPanelViewController.i(defaultWatchPanelViewController.x));
            defaultWatchPanelViewController.r.c(defaultWatchPanelViewController.j(defaultWatchPanelViewController.x));
            ((xo) defaultWatchPanelViewController.q.f).mr();
            return;
        }
        this.a.z = (acvg) ((zgz) obj).a();
    }
}
