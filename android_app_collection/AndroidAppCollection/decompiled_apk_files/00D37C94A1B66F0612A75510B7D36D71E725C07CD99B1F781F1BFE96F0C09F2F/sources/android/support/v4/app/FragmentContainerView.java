package android.support.v4.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
/* compiled from: PG */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {
    public boolean a;
    private ArrayList b;
    private ArrayList c;
    private View.OnApplyWindowInsetsListener d;

    public FragmentContainerView(Context context) {
        super(context);
        this.a = true;
    }

    private final void a(View view) {
        ArrayList arrayList = this.c;
        if (arrayList == null || !arrayList.contains(view)) {
            return;
        }
        if (this.b == null) {
            this.b = new ArrayList();
        }
        this.b.add(view);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (eo.h(view) == null) {
            throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected final boolean addViewInLayout(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        if (eo.h(view) == null) {
            throw new IllegalStateException("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.");
        }
        return super.addViewInLayout(view, i, layoutParams, z);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        mb t;
        mb q = mb.q(windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.d;
        if (onApplyWindowInsetsListener != null) {
            t = mb.q(onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets));
        } else {
            t = lj.t(this, q);
        }
        if (!t.x()) {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                lj.r(getChildAt(i), t);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        if (this.a && this.b != null) {
            for (int i = 0; i < this.b.size(); i++) {
                super.drawChild(canvas, (View) this.b.get(i), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        ArrayList arrayList;
        if (!this.a || (arrayList = this.b) == null || arrayList.size() <= 0 || !this.b.contains(view)) {
            return super.drawChild(canvas, view, j);
        }
        return false;
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            arrayList.remove(view);
            ArrayList arrayList2 = this.b;
            if (arrayList2 != null && arrayList2.remove(view)) {
                this.a = true;
            }
        }
        super.endViewTransition(view);
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                a(getChildAt(childCount));
            } else {
                super.removeAllViewsInLayout();
                return;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final void removeDetachedView(View view, boolean z) {
        if (z) {
            a(view);
        }
        super.removeDetachedView(view, z);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i) {
        a(getChildAt(i));
        super.removeViewAt(i);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        super.removeViews(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            a(getChildAt(i3));
        }
        super.removeViewsInLayout(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public final void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.d = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        if (view.getParent() == this) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            this.c.add(view);
        }
        super.startViewTransition(view);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String str;
        this.a = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cm.b);
            if (classAttribute == null) {
                classAttribute = obtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            obtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + "\"");
        }
    }

    public FragmentContainerView(Context context, AttributeSet attributeSet, eo eoVar) {
        super(context, attributeSet);
        View view;
        this.a = true;
        String classAttribute = attributeSet.getClassAttribute();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cm.b);
        classAttribute = classAttribute == null ? obtainStyledAttributes.getString(0) : classAttribute;
        String string = obtainStyledAttributes.getString(1);
        obtainStyledAttributes.recycle();
        int id = getId();
        dp e = eoVar.e(id);
        if (classAttribute != null && e == null) {
            if (id <= 0) {
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + (string != null ? " with tag " + string : ""));
            }
            dy i = eoVar.i();
            context.getClassLoader();
            dp c = i.c(classAttribute);
            c.aA();
            ex l = eoVar.l();
            l.x();
            c.N = this;
            l.q(getId(), c, string);
            l.e();
        }
        for (et etVar : eoVar.a.e()) {
            dp dpVar = etVar.b;
            if (dpVar.E == getId() && (view = dpVar.O) != null && view.getParent() == null) {
                dpVar.N = this;
                etVar.b();
            }
        }
    }
}
