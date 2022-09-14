package defpackage;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: bcik  reason: default package */
/* loaded from: classes3.dex */
final class bcik extends abp {
    @Override // defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        super.b(rect, view, recyclerView, aciVar);
        aec aecVar = (aec) view.getLayoutParams();
        if (aecVar != null && !aecVar.b) {
            if (aecVar.d() == 0) {
                rect.bottom = 4;
                rect.right = 2;
                return;
            }
            rect.left = 2;
            rect.bottom = 4;
        }
    }
}
