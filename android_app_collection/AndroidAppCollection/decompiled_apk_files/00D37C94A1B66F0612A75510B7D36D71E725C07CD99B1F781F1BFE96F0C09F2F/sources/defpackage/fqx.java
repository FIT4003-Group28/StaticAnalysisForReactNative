package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: fqx  reason: default package */
/* loaded from: classes3.dex */
public final class fqx extends nd {
    private final int a;

    public fqx(int i) {
        this.a = i;
    }

    @Override // defpackage.nd
    public final void b(Rect rect, View view, RecyclerView recyclerView, yl ylVar) {
        int c = recyclerView.c(view);
        int e = lj.e(recyclerView);
        if (c != 0) {
            if (e != 1) {
                rect.left += this.a;
            } else {
                rect.right += this.a;
            }
        }
        Object tag = view.getTag(R.id.offset_adjuster_tag);
        if (tag instanceof fqw) {
            ((fqw) tag).a(rect);
        }
    }
}
