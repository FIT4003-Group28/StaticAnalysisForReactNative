package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: abe  reason: default package */
/* loaded from: classes.dex */
public final class abe {
    public final /* synthetic */ RecyclerView a;

    public abe(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final int a() {
        return this.a.getChildCount();
    }

    public final int b(View view) {
        return this.a.indexOfChild(view);
    }

    public final void c(int i) {
        View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            this.a.aj(childAt);
            childAt.clearAnimation();
        }
        this.a.removeViewAt(i);
    }

    public final View d(int i) {
        return this.a.getChildAt(i);
    }

    public final void e(View view) {
        acl Y = RecyclerView.Y(view);
        if (Y != null) {
            this.a.as(Y, Y.o);
            Y.o = 0;
        }
    }
}
