package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: abqu  reason: default package */
/* loaded from: classes.dex */
public final class abqu extends nd {
    private final int a;

    public abqu(int i) {
        this.a = i;
    }

    @Override // defpackage.nd
    public final void b(Rect rect, View view, RecyclerView recyclerView, yl ylVar) {
        super.b(rect, view, recyclerView, ylVar);
        if (recyclerView.c(view) > 0) {
            return;
        }
        if (lj.e(recyclerView) == 0) {
            rect.left = this.a;
            rect.right = 0;
            return;
        }
        rect.left = 0;
        rect.right = this.a;
    }
}
