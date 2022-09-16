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
import com.google.android.youtube.R;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: td  reason: default package */
/* loaded from: classes4.dex */
public abstract class td extends ViewGroup {
    protected final tc a;
    public final Context b;
    public ActionMenuView c;
    public tq d;
    public int e;
    protected ln f;
    private boolean g;
    private boolean h;

    td(Context context) {
        this(context, null);
    }

    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public static final int f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, CellularSignalStrengthError.ERROR_NOT_SUPPORTED), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    public static final int g(View view, int i, int i2, int i3, boolean z) {
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

    public final ln b(int i, long j) {
        ln lnVar = this.f;
        if (lnVar != null) {
            lnVar.a();
        }
        if (i == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            ln q = lj.q(this);
            q.c(1.0f);
            q.d(j);
            tc tcVar = this.a;
            tcVar.d(q, 0);
            q.f(tcVar);
            return q;
        }
        ln q2 = lj.q(this);
        q2.c(0.0f);
        q2.d(j);
        tc tcVar2 = this.a;
        tcVar2.d(q2, i);
        q2.f(tcVar2);
        return q2;
    }

    public void d(int i) {
        throw null;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, pm.a, R.attr.actionBarStyle, 0);
        d(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        tq tqVar = this.d;
        if (tqVar != null) {
            tqVar.j = ld.d(tqVar.b);
            sf sfVar = tqVar.c;
            if (sfVar == null) {
                return;
            }
            sfVar.l(true);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 9;
        if (actionMasked == 9) {
            this.h = false;
            actionMasked = 9;
        }
        if (!this.h) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.h = true;
                }
                if (i != 10 || i == 3) {
                    this.h = false;
                }
                return true;
            }
        }
        i = actionMasked;
        if (i != 10) {
        }
        this.h = false;
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.g = false;
            actionMasked = 0;
        }
        if (!this.g) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.g = true;
                }
                actionMasked = 0;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.g = false;
        }
        return true;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            ln lnVar = this.f;
            if (lnVar != null) {
                lnVar.a();
            }
            super.setVisibility(i);
        }
    }

    public td(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public td(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new tc(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.b = context;
        } else {
            this.b = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }
}
