package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: btgz  reason: default package */
/* loaded from: classes4.dex */
public final class btgz extends abp {
    private final Drawable a;

    public btgz(Context context) {
        this.a = context.getDrawable(R.drawable.settings_divider);
    }

    @Override // defpackage.abp
    public final void k(Canvas canvas, RecyclerView recyclerView) {
        View childAt;
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        abg abgVar = recyclerView.k;
        if (abgVar == null) {
            return;
        }
        int c = abgVar.c();
        for (int i = 0; i < c; i++) {
            if (i != c - 1 && (childAt = recyclerView.getChildAt(i)) != null) {
                int bottom = childAt.getBottom() + ((abt) childAt.getLayoutParams()).bottomMargin;
                this.a.setBounds(paddingLeft, bottom, width, this.a.getIntrinsicHeight() + bottom);
                this.a.draw(canvas);
            }
        }
    }
}
