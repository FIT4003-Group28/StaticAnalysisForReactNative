package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: ect  reason: default package */
/* loaded from: classes.dex */
public final class ect extends FrameLayout {
    private float a;

    public ect(Context context) {
        super(context);
        b(context);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(ect.class, cqmpVarArr);
    }

    private final void b(Context context) {
        this.a = TypedValue.applyDimension(1, 48.0f, context.getResources().getDisplayMetrics());
    }

    private final Rect c() {
        Rect rect = new Rect();
        getHitRect(rect);
        return rect;
    }

    @dzsi
    private static View d(View view) {
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            return (View) parent;
        }
        return null;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        cpmf cpmfVar;
        Rect c = c();
        if (c.width() < this.a || c.height() < this.a) {
            Rect c2 = c();
            c2.union(new Rect((int) Math.ceil(c2.exactCenterX() - (this.a / 2.0f)), (int) Math.ceil(c2.exactCenterY() - (this.a / 2.0f)), (int) Math.ceil(c2.exactCenterX() + (this.a / 2.0f)), (int) Math.ceil(c2.exactCenterY() + (this.a / 2.0f))));
            View d = d(this);
            if (d == null) {
                return;
            }
            Rect rect = new Rect(0, 0, d.getWidth(), d.getHeight());
            while (!rect.contains(c2)) {
                c2.offset(d.getLeft(), d.getTop());
                d = d(d);
                if (d == null) {
                    return;
                }
                rect = new Rect(0, 0, d.getWidth(), d.getHeight());
            }
            if (!rect.contains(c2)) {
                return;
            }
            TouchDelegate touchDelegate = new TouchDelegate(c2, this);
            dbsk.s(d);
            TouchDelegate touchDelegate2 = d.getTouchDelegate();
            if (touchDelegate2 instanceof cpmf) {
                cpmfVar = (cpmf) touchDelegate2;
            } else {
                cpmfVar = new cpmf(d, touchDelegate2);
            }
            dbsk.l(true);
            cpmfVar.a.put(this, touchDelegate);
            if (touchDelegate == cpmfVar.b) {
                cpmfVar.b = null;
            }
            if (touchDelegate2 == cpmfVar) {
                return;
            }
            d.setTouchDelegate(cpmfVar);
        }
    }

    public ect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public ect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context);
    }
}
