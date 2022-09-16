package defpackage;

import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
/* compiled from: PG */
/* renamed from: obs  reason: default package */
/* loaded from: classes3.dex */
public final class obs implements ajql {
    final /* synthetic */ ajqm a;
    final /* synthetic */ DefaultWatchPanelViewController b;

    public obs(DefaultWatchPanelViewController defaultWatchPanelViewController, ajqm ajqmVar) {
        this.b = defaultWatchPanelViewController;
        this.a = ajqmVar;
    }

    @Override // defpackage.ymy
    public final void d(int i, int i2) {
    }

    @Override // defpackage.ymy
    public final void e(int i, int i2) {
    }

    @Override // defpackage.ajql
    public final void pi() {
    }

    @Override // defpackage.ymy
    public final void pj(int i, int i2) {
    }

    @Override // defpackage.ymy
    public final void pk(int i, int i2) {
        Object obj = ((ync) this.a).get(i);
        if ((obj instanceof fkh) || (obj instanceof aqef) || i != 0) {
            if (this.b.p.I() <= 1) {
                this.b.p.aa(0, 0);
            }
            DefaultWatchPanelViewController defaultWatchPanelViewController = this.b;
            defaultWatchPanelViewController.c.a(defaultWatchPanelViewController.d);
        }
    }
}
