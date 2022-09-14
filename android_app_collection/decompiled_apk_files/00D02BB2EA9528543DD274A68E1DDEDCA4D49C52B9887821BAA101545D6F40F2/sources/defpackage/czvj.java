package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
/* compiled from: PG */
/* renamed from: czvj  reason: default package */
/* loaded from: classes5.dex */
public abstract class czvj extends czvl<View> {
    public final Rect a;
    final Rect b;
    public int c;
    public int d;

    public czvj() {
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }

    @Override // defpackage.czvl
    protected final void R(CoordinatorLayout coordinatorLayout, View view, int i) {
        View u = u(coordinatorLayout.l(view));
        if (u == null) {
            coordinatorLayout.h(view, i);
            this.c = 0;
            return;
        }
        ajl ajlVar = (ajl) view.getLayoutParams();
        Rect rect = this.a;
        rect.set(coordinatorLayout.getPaddingLeft() + ajlVar.leftMargin, u.getBottom() + ajlVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ajlVar.rightMargin, ((coordinatorLayout.getHeight() + u.getBottom()) - coordinatorLayout.getPaddingBottom()) - ajlVar.bottomMargin);
        ow owVar = coordinatorLayout.g;
        if (owVar != null && od.M(coordinatorLayout) && !od.M(view)) {
            rect.left += owVar.c();
            rect.right -= owVar.e();
        }
        Rect rect2 = this.b;
        int i2 = ajlVar.c;
        Gravity.apply(i2 == 0 ? 8388659 : i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
        int x = x(u);
        view.layout(rect2.left, rect2.top - x, rect2.right, rect2.bottom - x);
        this.c = rect2.top - u.getBottom();
    }

    public float s(View view) {
        throw null;
    }

    public int t(View view) {
        throw null;
    }

    public abstract View u(List<View> list);

    public final int x(View view) {
        if (this.d == 0) {
            return 0;
        }
        float s = s(view);
        int i = this.d;
        return akn.b((int) (s * i), 0, i);
    }

    public czvj(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new Rect();
        this.b = new Rect();
        this.c = 0;
    }
}
