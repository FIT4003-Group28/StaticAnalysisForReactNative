package defpackage;

import android.view.ViewTreeObserver;
import com.google.android.apps.youtube.app.watch.panel.ui.DefaultWatchPanelViewController;
/* compiled from: PG */
/* renamed from: obu  reason: default package */
/* loaded from: classes3.dex */
public final class obu implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ DefaultWatchPanelViewController a;

    public obu(DefaultWatchPanelViewController defaultWatchPanelViewController) {
        this.a = defaultWatchPanelViewController;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        acvg acvgVar = this.a.z;
        if (acvgVar != null) {
            acvgVar.c("wnl");
        }
        this.a.o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
