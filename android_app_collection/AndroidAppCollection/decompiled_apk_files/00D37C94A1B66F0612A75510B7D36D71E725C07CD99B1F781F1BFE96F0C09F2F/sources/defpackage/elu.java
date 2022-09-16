package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: elu  reason: default package */
/* loaded from: classes3.dex */
public final class elu extends nd {
    private final int a;

    public elu(int i) {
        this.a = i;
    }

    @Override // defpackage.nd
    public final void b(Rect rect, View view, RecyclerView recyclerView, yl ylVar) {
        rect.right = this.a / 2;
        rect.left = this.a / 2;
    }
}
