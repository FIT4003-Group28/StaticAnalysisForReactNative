package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cvzw  reason: default package */
/* loaded from: classes5.dex */
public final class cvzw extends abp {
    private final Drawable a;
    private final Rect b = new Rect();

    public cvzw(Context context) {
        this.a = cwiz.a(context, R.drawable.og_list_divider, cqez.a(context));
    }

    @Override // defpackage.abp
    public final void c(Canvas canvas, RecyclerView recyclerView) {
        int Z;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            abg abgVar = recyclerView.k;
            if (abgVar != null && (Z = recyclerView.Z(childAt)) >= 0 && (Z == 0 || abgVar.i(Z) != abgVar.i(Z - 1))) {
                RecyclerView.ad(childAt, this.b);
                int round = this.b.top + Math.round(childAt.getTranslationY());
                this.a.setBounds(0, round, recyclerView.getWidth(), this.a.getIntrinsicHeight() + round);
                this.a.draw(canvas);
            }
        }
    }
}
