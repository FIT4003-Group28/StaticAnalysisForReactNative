package defpackage;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: PG */
/* renamed from: aliq  reason: default package */
/* loaded from: classes.dex */
final class aliq implements Runnable {
    final /* synthetic */ alir a;
    private final CoordinatorLayout b;
    private final View c;

    public aliq(alir alirVar, CoordinatorLayout coordinatorLayout, View view) {
        this.a = alirVar;
        this.b = coordinatorLayout;
        this.c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller;
        if (this.c == null || (overScroller = this.a.c) == null) {
            return;
        }
        if (overScroller.computeScrollOffset()) {
            alir alirVar = this.a;
            alirVar.B(this.b, this.c, alirVar.c.getCurrY());
            lj.H(this.c, this);
            return;
        }
        this.a.x(this.b, this.c);
    }
}
