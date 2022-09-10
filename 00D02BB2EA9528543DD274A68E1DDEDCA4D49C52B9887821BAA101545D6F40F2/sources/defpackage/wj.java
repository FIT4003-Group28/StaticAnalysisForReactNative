package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
/* compiled from: PG */
/* renamed from: wj  reason: default package */
/* loaded from: classes7.dex */
public final class wj implements Runnable {
    final /* synthetic */ ActionBarOverlayLayout a;

    public wj(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h();
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.d = actionBarOverlayLayout.a.animate().translationY(-this.a.a.getHeight()).setListener(this.a.e);
    }
}
