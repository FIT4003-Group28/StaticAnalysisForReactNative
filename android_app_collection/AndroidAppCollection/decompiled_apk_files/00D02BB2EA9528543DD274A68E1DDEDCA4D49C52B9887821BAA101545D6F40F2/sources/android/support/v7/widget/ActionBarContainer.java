package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.maps.R;
import com.google.ar.core.ImageMetadata;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActionBarContainer extends FrameLayout {
    public View a;
    public Drawable b;
    public Drawable c;
    public Drawable d;
    public boolean e;
    public boolean f;
    private boolean g;
    private View h;
    private View i;
    private int j;

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    private static final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private static final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.b;
        if (drawable != null && drawable.isStateful()) {
            this.b.setState(getDrawableState());
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null && drawable2.isStateful()) {
            this.c.setState(getDrawableState());
        }
        Drawable drawable3 = this.d;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.d.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.h = findViewById(R.id.action_bar);
        this.i = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.g || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.a;
        boolean z2 = true;
        boolean z3 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.e) {
            Drawable drawable2 = this.d;
            if (drawable2 == null) {
                return;
            }
            drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            if (this.b == null) {
                z2 = false;
            } else if (this.h.getVisibility() == 0) {
                this.b.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
            } else {
                View view2 = this.i;
                if (view2 == null || view2.getVisibility() != 0) {
                    this.b.setBounds(0, 0, 0, 0);
                } else {
                    this.b.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
                }
            }
            this.f = z3;
            if (z3 && (drawable = this.c) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else if (!z2) {
                return;
            }
        }
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int a;
        int i3;
        if (this.h == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.j) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.h == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        View view = this.a;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (!b(this.h)) {
            a = a(this.h);
        } else {
            a = !b(this.i) ? a(this.i) : 0;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(a + a(this.a), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.b;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.b);
        }
        this.b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.h;
            if (view != null) {
                this.b.setBounds(view.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
            }
        }
        boolean z = true;
        if (!this.e ? this.b != null || this.c != null : this.d != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.d);
        }
        this.d = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.e && (drawable2 = this.d) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.e ? !(this.b != null || this.c != null) : this.d == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.c;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.c);
        }
        this.c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f && (drawable2 = this.c) != null) {
                drawable2.setBounds(this.a.getLeft(), this.a.getTop(), this.a.getRight(), this.a.getBottom());
            }
        }
        boolean z = true;
        if (!this.e ? this.b != null || this.c != null : this.d != null) {
            z = false;
        }
        setWillNotDraw(z);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(add addVar) {
        View view = this.a;
        if (view != null) {
            removeView(view);
        }
        this.a = addVar;
        if (addVar != null) {
            addView(addVar);
            ViewGroup.LayoutParams layoutParams = addVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            addVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z) {
        this.g = z;
        setDescendantFocusability(true != z ? 262144 : ImageMetadata.HOT_PIXEL_MODE);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.b;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.c;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.d;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.b || this.e) {
            if (drawable == this.c && this.f) {
                return true;
            }
            return (drawable == this.d && this.e) || super.verifyDrawable(drawable);
        }
        return true;
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        od.U(this, new wf(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, sj.a);
        boolean z = false;
        this.b = obtainStyledAttributes.getDrawable(0);
        this.c = obtainStyledAttributes.getDrawable(2);
        this.j = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.e = true;
            this.d = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.e ? !(this.b != null || this.c != null) : this.d == null) {
            z = true;
        }
        setWillNotDraw(z);
    }
}
