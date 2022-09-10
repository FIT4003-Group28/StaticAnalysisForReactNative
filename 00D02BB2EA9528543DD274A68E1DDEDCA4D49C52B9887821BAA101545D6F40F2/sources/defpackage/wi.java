package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
/* compiled from: PG */
/* renamed from: wi  reason: default package */
/* loaded from: classes7.dex */
public final class wi implements Runnable {
    final /* synthetic */ ActionBarOverlayLayout a;

    public wi(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.h();
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.d = actionBarOverlayLayout.a.animate().translationY(0.0f).setListener(this.a.e);
    }
}
