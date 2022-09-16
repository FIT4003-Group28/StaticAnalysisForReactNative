package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: PG */
/* renamed from: ajg  reason: default package */
/* loaded from: classes.dex */
public final class ajg implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ CoordinatorLayout a;

    public ajg(CoordinatorLayout coordinatorLayout) {
        this.a = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.k(0);
        return true;
    }
}
