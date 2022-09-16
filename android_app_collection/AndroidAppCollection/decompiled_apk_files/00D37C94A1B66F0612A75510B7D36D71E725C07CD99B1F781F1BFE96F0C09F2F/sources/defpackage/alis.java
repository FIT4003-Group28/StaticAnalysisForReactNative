package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
/* compiled from: PG */
/* renamed from: alis  reason: default package */
/* loaded from: classes.dex */
public abstract class alis extends aliu {
    public final Rect d;
    final Rect e;
    public int f;
    public int g;

    public alis() {
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }

    @Override // defpackage.aliu
    protected final void sc(CoordinatorLayout coordinatorLayout, View view, int i) {
        View v = v(coordinatorLayout.h(view));
        if (v == null) {
            coordinatorLayout.l(view, i);
            this.f = 0;
            return;
        }
        ajf ajfVar = (ajf) view.getLayoutParams();
        Rect rect = this.d;
        rect.set(coordinatorLayout.getPaddingLeft() + ajfVar.leftMargin, v.getBottom() + ajfVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ajfVar.rightMargin, ((coordinatorLayout.getHeight() + v.getBottom()) - coordinatorLayout.getPaddingBottom()) - ajfVar.bottomMargin);
        mb mbVar = coordinatorLayout.f;
        if (mbVar != null && lj.af(coordinatorLayout) && !lj.af(view)) {
            rect.left += mbVar.d();
            rect.right -= mbVar.e();
        }
        Rect rect2 = this.e;
        int i2 = ajfVar.c;
        Gravity.apply(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int x = x(v);
        view.layout(rect2.left, rect2.top - x, rect2.right, rect2.bottom - x);
        this.f = rect2.top - v.getBottom();
    }

    public float t(View view) {
        throw null;
    }

    public int u(View view) {
        throw null;
    }

    public abstract View v(List list);

    public final int x(View view) {
        if (this.g == 0) {
            return 0;
        }
        float t = t(view);
        int i = this.g;
        return akf.c((int) (t * i), 0, i);
    }

    public alis(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new Rect();
        this.e = new Rect();
        this.f = 0;
    }
}
