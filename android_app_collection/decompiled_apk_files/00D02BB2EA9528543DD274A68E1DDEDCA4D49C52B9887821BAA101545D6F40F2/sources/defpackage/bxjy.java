package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: bxjy  reason: default package */
/* loaded from: classes4.dex */
final class bxjy extends abp {
    final /* synthetic */ bwob a;

    public bxjy(bwob bwobVar) {
        this.a = bwobVar;
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        if (recyclerView.Z(view) != 0) {
            rect.set(0, 0, 0, 0);
        } else {
            rect.set(0, this.a.u().intValue(), 0, 0);
        }
    }
}
