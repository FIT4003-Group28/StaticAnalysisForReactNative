package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aclp  reason: default package */
/* loaded from: classes.dex */
final class aclp extends nd {
    final /* synthetic */ aclr a;

    public aclp(aclr aclrVar) {
        this.a = aclrVar;
    }

    @Override // defpackage.nd
    public final void b(Rect rect, View view, RecyclerView recyclerView, yl ylVar) {
        int i = ((GridLayoutManager) recyclerView.n).b;
        int c = recyclerView.c(view) % i;
        int dimensionPixelSize = this.a.rh().getDimensionPixelSize(R.dimen.lc_scheduled_event_padding);
        int i2 = dimensionPixelSize / 2;
        rect.left = i2;
        rect.right = i2;
        rect.bottom = dimensionPixelSize;
        if (c == 0) {
            rect.left = dimensionPixelSize;
            c = 0;
        }
        if (c == i - 1) {
            rect.right = dimensionPixelSize;
        }
    }
}
