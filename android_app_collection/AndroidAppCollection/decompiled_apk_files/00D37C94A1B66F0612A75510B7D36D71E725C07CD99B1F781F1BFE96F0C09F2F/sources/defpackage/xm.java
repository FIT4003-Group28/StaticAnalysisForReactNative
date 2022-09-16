package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: xm  reason: default package */
/* loaded from: classes4.dex */
public final class xm {
    public final /* synthetic */ RecyclerView a;

    public xm(RecyclerView recyclerView) {
        this.a = recyclerView;
    }

    public final int a() {
        return this.a.getChildCount();
    }

    public final int b(View view) {
        return this.a.indexOfChild(view);
    }

    public final View c(int i) {
        return this.a.getChildAt(i);
    }

    public final void d(View view) {
        yo l = RecyclerView.l(view);
        if (l != null) {
            this.a.ay(l, l.o);
            l.o = 0;
        }
    }

    public final void e(int i) {
        View childAt = this.a.getChildAt(i);
        if (childAt != null) {
            this.a.C(childAt);
            childAt.clearAnimation();
        }
        this.a.removeViewAt(i);
    }
}
