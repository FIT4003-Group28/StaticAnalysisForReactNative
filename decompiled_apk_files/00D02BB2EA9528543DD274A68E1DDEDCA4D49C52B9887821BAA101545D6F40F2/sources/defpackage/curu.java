package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: curu  reason: default package */
/* loaded from: classes5.dex */
public final class curu extends abp {
    private final int a;

    public curu(int i) {
        this.a = i;
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        if (!(recyclerView.l instanceof aag) || recyclerView.Z(view) == recyclerView.k.c() - 1) {
            return;
        }
        if (((aag) recyclerView.l).i != 0) {
            rect.bottom = this.a;
        } else if (od.s(view) == 1) {
            rect.left = this.a;
        } else {
            rect.right = this.a;
        }
    }
}
