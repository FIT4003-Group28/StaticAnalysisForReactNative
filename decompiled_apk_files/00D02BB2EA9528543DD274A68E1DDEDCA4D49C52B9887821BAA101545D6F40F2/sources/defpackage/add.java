package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: add  reason: default package */
/* loaded from: classes2.dex */
public final class add extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    Runnable a;
    final aab b;
    int c;
    int d;
    public int e;
    private Spinner f;
    private boolean g;
    private int h;

    static {
        new DecelerateInterpolator();
    }

    public add(Context context) {
        super(context);
        new adc(this);
        setHorizontalScrollBarEnabled(false);
        ub a = ub.a(context);
        setContentHeight(a.d());
        this.d = a.e();
        aab aabVar = new aab(getContext(), null, R.attr.actionBarTabBarStyle);
        aabVar.setMeasureWithLargestChildEnabled(true);
        aabVar.setGravity(17);
        aabVar.setLayoutParams(new aaa(-2, -1));
        this.b = aabVar;
        addView(aabVar, new ViewGroup.LayoutParams(-2, -1));
    }

    private final boolean a() {
        Spinner spinner = this.f;
        return spinner != null && spinner.getParent() == this;
    }

    private final void b() {
        if (!a()) {
            return;
        }
        removeView(this.f);
        addView(this.b, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f.getSelectedItemPosition());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ub a = ub.a(getContext());
        setContentHeight(a.d());
        this.d = a.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((adb) view).a.d();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = mode == 1073741824;
        setFillViewport(z);
        int childCount = this.b.getChildCount();
        if (childCount > 1 && (mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            if (childCount > 2) {
                size = (int) (View.MeasureSpec.getSize(i) * 0.4f);
                this.c = size;
            } else {
                size = View.MeasureSpec.getSize(i) / 2;
                this.c = size;
            }
            this.c = Math.min(size, this.d);
        } else {
            this.c = -1;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.e, 1073741824);
        if (z || !this.g) {
            b();
        } else {
            this.b.measure(0, makeMeasureSpec);
            if (this.b.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                if (!a()) {
                    if (this.f == null) {
                        ye yeVar = new ye(getContext(), null, R.attr.actionDropDownStyle);
                        yeVar.setLayoutParams(new aaa(-2, -1));
                        yeVar.setOnItemSelectedListener(this);
                        this.f = yeVar;
                    }
                    removeView(this.b);
                    addView(this.f, new ViewGroup.LayoutParams(-2, -1));
                    if (this.f.getAdapter() == null) {
                        this.f.setAdapter((SpinnerAdapter) new ada(this));
                    }
                    Runnable runnable = this.a;
                    if (runnable != null) {
                        removeCallbacks(runnable);
                        this.a = null;
                    }
                    this.f.setSelection(this.h);
                }
            } else {
                b();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.h);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.g = z;
    }

    public void setContentHeight(int i) {
        this.e = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.h = i;
        int childCount = this.b.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.b.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                View childAt2 = this.b.getChildAt(i);
                Runnable runnable = this.a;
                if (runnable != null) {
                    removeCallbacks(runnable);
                }
                acz aczVar = new acz(this, childAt2);
                this.a = aczVar;
                post(aczVar);
            }
            i2++;
        }
        Spinner spinner = this.f;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
