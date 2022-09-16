package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: mpb  reason: default package */
/* loaded from: classes3.dex */
final class mpb extends nd {
    final /* synthetic */ int a;
    final /* synthetic */ mpc b;

    public mpb(mpc mpcVar, int i) {
        this.b = mpcVar;
        this.a = i;
    }

    @Override // defpackage.nd
    public final void b(Rect rect, View view, RecyclerView recyclerView, yl ylVar) {
        super.b(rect, view, recyclerView, ylVar);
        if (lj.e(this.b.a) == 1) {
            rect.right = this.a;
        } else {
            rect.left = this.a;
        }
    }
}
