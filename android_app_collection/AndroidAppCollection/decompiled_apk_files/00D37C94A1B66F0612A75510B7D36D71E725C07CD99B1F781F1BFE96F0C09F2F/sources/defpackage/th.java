package defpackage;

import android.support.v7.widget.ActionBarOverlayLayout;
/* compiled from: PG */
/* renamed from: th  reason: default package */
/* loaded from: classes4.dex */
public final class th implements Runnable {
    final /* synthetic */ ActionBarOverlayLayout a;
    private final /* synthetic */ int b;

    public th(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public th(ActionBarOverlayLayout actionBarOverlayLayout, int i) {
        this.b = i;
        this.a = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b == 0) {
            this.a.h();
            ActionBarOverlayLayout actionBarOverlayLayout = this.a;
            actionBarOverlayLayout.i = actionBarOverlayLayout.c.animate().translationY(-this.a.c.getHeight()).setListener(this.a.j);
            return;
        }
        this.a.h();
        ActionBarOverlayLayout actionBarOverlayLayout2 = this.a;
        actionBarOverlayLayout2.i = actionBarOverlayLayout2.c.animate().translationY(0.0f).setListener(this.a.j);
    }
}
