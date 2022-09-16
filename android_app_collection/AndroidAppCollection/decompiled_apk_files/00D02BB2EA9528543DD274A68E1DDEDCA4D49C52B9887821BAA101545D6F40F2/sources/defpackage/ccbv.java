package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: ccbv  reason: default package */
/* loaded from: classes4.dex */
final class ccbv extends zd {
    public ccbv(Context context) {
        super(context, 0);
    }

    @Override // defpackage.zd, defpackage.abp
    public final void b(Rect rect, View view, RecyclerView recyclerView, aci aciVar) {
        if (recyclerView.aa(view) == aciVar.b() - 1) {
            return;
        }
        Drawable drawable = this.a;
        dbsk.s(drawable);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (bvox.a(view)) {
            rect.left = intrinsicWidth;
        } else {
            rect.right = intrinsicWidth;
        }
    }
}
