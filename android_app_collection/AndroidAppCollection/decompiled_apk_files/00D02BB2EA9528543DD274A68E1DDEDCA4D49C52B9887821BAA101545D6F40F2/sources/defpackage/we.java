package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: we  reason: default package */
/* loaded from: classes.dex */
public abstract class we extends ViewGroup {
    protected final wd a;
    public final Context b;
    public ActionMenuView c;
    public wt d;
    public int e;
    protected oi f;
    private boolean g;
    private boolean h;

    we(Context context) {
        this(context, null);
    }

    public static int b(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public static final int e(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static final int f(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
            return -measuredWidth;
        }
        view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        return measuredWidth;
    }

    public final oi a(int i, long j) {
        oi oiVar = this.f;
        if (oiVar != null) {
            oiVar.a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            oi B = od.B(this);
            B.b(1.0f);
            B.e(j);
            wd wdVar = this.a;
            wdVar.d(B, 0);
            B.f(wdVar);
            return B;
        }
        oi B2 = od.B(this);
        B2.b(0.0f);
        B2.e(j);
        wd wdVar2 = this.a;
        wdVar2.d(B2, i);
        B2.f(wdVar2);
        return B2;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, sj.a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        wt wtVar = this.d;
        if (wtVar != null) {
            wtVar.j = ub.a(wtVar.b).b();
            vf vfVar = wtVar.c;
            if (vfVar == null) {
                return;
            }
            vfVar.r(true);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.h = false;
            actionMasked = 9;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
            actionMasked = 0;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.g = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.e = i;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            oi oiVar = this.f;
            if (oiVar != null) {
                oiVar.a();
            }
            super.setVisibility(i);
        }
    }

    public we(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public we(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new wd(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
