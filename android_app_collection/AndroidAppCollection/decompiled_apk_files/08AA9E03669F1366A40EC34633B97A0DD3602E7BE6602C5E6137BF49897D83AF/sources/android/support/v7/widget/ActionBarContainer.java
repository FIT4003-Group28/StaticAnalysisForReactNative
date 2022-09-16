package android.support.v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.a.a;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Api;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a  reason: collision with root package name */
    Drawable f797a;

    /* renamed from: b  reason: collision with root package name */
    Drawable f798b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f799c;

    /* renamed from: d  reason: collision with root package name */
    boolean f800d;
    boolean e;
    private boolean f;
    private View g;
    private View h;
    private View i;
    private int j;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        android.support.v4.j.s.a(this, Build.VERSION.SDK_INT >= 21 ? new c(this) : new b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.j.ActionBar);
        this.f797a = obtainStyledAttributes.getDrawable(a.j.ActionBar_background);
        this.f798b = obtainStyledAttributes.getDrawable(a.j.ActionBar_backgroundStacked);
        this.j = obtainStyledAttributes.getDimensionPixelSize(a.j.ActionBar_height, -1);
        if (getId() == a.f.split_action_bar) {
            this.f800d = true;
            this.f799c = obtainStyledAttributes.getDrawable(a.j.ActionBar_backgroundSplit);
        }
        obtainStyledAttributes.recycle();
        boolean z = false;
        if (!this.f800d ? !(this.f797a != null || this.f798b != null) : this.f799c == null) {
            z = true;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.h = findViewById(a.f.action_bar);
        this.i = findViewById(a.f.action_context_bar);
    }

    public void setPrimaryBackground(Drawable drawable) {
        if (this.f797a != null) {
            this.f797a.setCallback(null);
            unscheduleDrawable(this.f797a);
        }
        this.f797a = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.h != null) {
                this.f797a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
            }
        }
        boolean z = false;
        if (!this.f800d ? !(this.f797a != null || this.f798b != null) : this.f799c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setStackedBackground(Drawable drawable) {
        if (this.f798b != null) {
            this.f798b.setCallback(null);
            unscheduleDrawable(this.f798b);
        }
        this.f798b = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.e && this.f798b != null) {
                this.f798b.setBounds(this.g.getLeft(), this.g.getTop(), this.g.getRight(), this.g.getBottom());
            }
        }
        boolean z = false;
        if (!this.f800d ? !(this.f797a != null || this.f798b != null) : this.f799c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    public void setSplitBackground(Drawable drawable) {
        if (this.f799c != null) {
            this.f799c.setCallback(null);
            unscheduleDrawable(this.f799c);
        }
        this.f799c = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f800d && this.f799c != null) {
                this.f799c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f800d ? !(this.f797a != null || this.f798b != null) : this.f799c == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        if (this.f797a != null) {
            this.f797a.setVisible(z, false);
        }
        if (this.f798b != null) {
            this.f798b.setVisible(z, false);
        }
        if (this.f799c != null) {
            this.f799c.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return (drawable == this.f797a && !this.f800d) || (drawable == this.f798b && this.e) || ((drawable == this.f799c && this.f800d) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (this.f797a != null && this.f797a.isStateful()) {
            this.f797a.setState(getDrawableState());
        }
        if (this.f798b != null && this.f798b.isStateful()) {
            this.f798b.setState(getDrawableState());
        }
        if (this.f799c == null || !this.f799c.isStateful()) {
            return;
        }
        this.f799c.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        if (this.f797a != null) {
            this.f797a.jumpToCurrentState();
        }
        if (this.f798b != null) {
            this.f798b.jumpToCurrentState();
        }
        if (this.f799c != null) {
            this.f799c.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean z) {
        this.f = z;
        setDescendantFocusability(z ? 393216 : PKIFailureInfo.transactionIdInUse);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public void setTabContainer(ae aeVar) {
        if (this.g != null) {
            removeView(this.g);
        }
        this.g = aeVar;
        if (aeVar != null) {
            addView(aeVar);
            ViewGroup.LayoutParams layoutParams = aeVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            aeVar.setAllowCollapse(false);
        }
    }

    public View getTabContainer() {
        return this.g;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    private boolean a(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    private int b(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int b2;
        if (this.h == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && this.j >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(this.j, View.MeasureSpec.getSize(i2)), PKIFailureInfo.systemUnavail);
        }
        super.onMeasure(i, i2);
        if (this.h == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (this.g == null || this.g.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (!a(this.h)) {
            b2 = b(this.h);
        } else {
            b2 = !a(this.i) ? b(this.i) : 0;
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(b2 + b(this.g), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Api.BaseClientBuilder.API_PRIORITY_OTHER));
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        View view = this.g;
        boolean z2 = true;
        boolean z3 = false;
        boolean z4 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - layoutParams.bottomMargin, i3, measuredHeight - layoutParams.bottomMargin);
        }
        if (this.f800d) {
            if (this.f799c != null) {
                this.f799c.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z2 = false;
            }
        } else {
            if (this.f797a != null) {
                if (this.h.getVisibility() == 0) {
                    this.f797a.setBounds(this.h.getLeft(), this.h.getTop(), this.h.getRight(), this.h.getBottom());
                } else if (this.i != null && this.i.getVisibility() == 0) {
                    this.f797a.setBounds(this.i.getLeft(), this.i.getTop(), this.i.getRight(), this.i.getBottom());
                } else {
                    this.f797a.setBounds(0, 0, 0, 0);
                }
                z3 = true;
            }
            this.e = z4;
            if (!z4 || this.f798b == null) {
                z2 = z3;
            } else {
                this.f798b.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z2) {
            invalidate();
        }
    }
}
