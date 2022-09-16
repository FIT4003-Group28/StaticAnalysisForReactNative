package defpackage;

import android.content.Context;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
/* compiled from: PG */
/* renamed from: obq  reason: default package */
/* loaded from: classes3.dex */
public final class obq extends loh {
    final /* synthetic */ DefaultWatchPanelViewController c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public obq(DefaultWatchPanelViewController defaultWatchPanelViewController, Context context) {
        super(context);
        this.c = defaultWatchPanelViewController;
    }

    @Override // defpackage.loh
    public final void d() {
        DefaultWatchPanelViewController defaultWatchPanelViewController = this.c;
        c(defaultWatchPanelViewController.i(defaultWatchPanelViewController.a.getResources().getConfiguration()));
    }
}
