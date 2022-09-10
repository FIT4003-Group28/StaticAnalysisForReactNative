package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: vge  reason: default package */
/* loaded from: classes7.dex */
final class vge extends abp {
    final /* synthetic */ vgf a;

    public vge(vgf vgfVar) {
        this.a = vgfVar;
    }

    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        super.b(rect, view, recyclerView, aciVar);
        if (recyclerView.Z(view) == 0) {
            if (this.a.ay() == 0) {
                rect.left = this.a.a;
            } else {
                rect.right = this.a.a;
            }
        }
    }
}
