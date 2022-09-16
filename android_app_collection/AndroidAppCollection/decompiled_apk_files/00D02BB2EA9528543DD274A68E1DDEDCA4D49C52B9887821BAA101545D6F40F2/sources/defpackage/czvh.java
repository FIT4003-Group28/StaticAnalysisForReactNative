package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: PG */
/* renamed from: czvh  reason: default package */
/* loaded from: classes5.dex */
final class czvh implements Runnable {
    final /* synthetic */ czvi a;
    private final CoordinatorLayout b;
    private final View c;

    public czvh(czvi czviVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = czviVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller;
        if (this.c == null || (overScroller = this.a.b) == null) {
            return;
        }
        if (overScroller.computeScrollOffset()) {
            czvi czviVar = this.a;
            czviVar.B(this.b, this.c, czviVar.b.getCurrY());
            od.j(this.c, this);
            return;
        }
        this.a.w(this.b, this.c);
    }
}
