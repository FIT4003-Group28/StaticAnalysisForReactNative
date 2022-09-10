package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Adapter;
import android.widget.HorizontalScrollView;
/* compiled from: PG */
/* renamed from: acnz  reason: default package */
/* loaded from: classes.dex */
public final class acnz extends HorizontalScrollView {
    public static final /* synthetic */ int d = 0;
    public final acnv a;
    @dzsi
    public Adapter b;
    public boolean c;
    private final Context e;
    private float f;
    @dzsi
    private acnw g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private final cjqy l;

    public acnz(Context context) {
        this(context, null);
    }

    private final void c() {
        int childCount = this.a.getChildCount();
        int b = b();
        if (childCount == 0 || b < 0 || b >= childCount) {
            return;
        }
        float f = this.f;
        acnv acnvVar = this.a;
        acnvVar.a = b;
        acnvVar.b = f - b;
        acnvVar.invalidate();
        if (!this.h) {
            return;
        }
        d(this.f, true);
    }

    private final void d(float f, boolean z) {
        float left;
        int b;
        int i = (int) f;
        View childAt = this.a.getChildAt(i);
        if (childAt == null) {
            b = 0;
        } else {
            View childAt2 = this.a.getChildAt(i + 1);
            if (childAt2 == null) {
                left = (childAt.getLeft() + childAt.getRight()) / 2.0f;
            } else {
                float f2 = f - i;
                left = (((childAt.getLeft() + childAt.getRight()) * (1.0f - f2)) + ((childAt2.getLeft() + childAt2.getRight()) * f2)) / 2.0f;
            }
            b = akn.b((int) (left - (getWidth() / 2.0f)), 0, (this.a.getWidth() - getWidth()) + getPaddingLeft() + getPaddingRight());
        }
        if (b != this.i) {
            this.i = b;
            if (z) {
                smoothScrollTo(b, 0);
            } else {
                scrollTo(b, 0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final View[] a() {
        View[] viewArr = new View[this.a.getChildCount()];
        int childCount = this.a.getChildCount();
        while (true) {
            childCount--;
            if (childCount >= 0) {
                viewArr[childCount] = this.a.getChildAt(childCount);
            } else {
                return viewArr;
            }
        }
    }

    public final int b() {
        return (int) this.f;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.h = false;
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.h) {
            d(this.f, false);
        }
        this.h = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0074, code lost:
        if (r0 != false) goto L14;
     */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r9, int r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acnz.onMeasure(int, int):void");
    }

    public void setAdapter(Adapter adapter) {
        View[] a = a();
        this.b = adapter;
        acnw acnwVar = this.g;
        acnx acnxVar = acnwVar == null ? null : new acnx(this, this.a, acnwVar, this.l);
        int i = 0;
        while (i < adapter.getCount()) {
            View view = i < a.length ? a[i] : null;
            View view2 = adapter.getView(i, view, this.a);
            if (acnxVar != null) {
                view2.setOnClickListener(acnxVar);
            }
            if (view2 != view) {
                this.a.addView(view2, i);
                if (view != null) {
                    this.a.removeView(view);
                }
            }
            i++;
        }
        while (this.a.getChildCount() > this.b.getCount()) {
            acnv acnvVar = this.a;
            acnvVar.removeViewAt(acnvVar.getChildCount() - 1);
        }
        this.h = false;
        c();
    }

    public void setCustomTabColorizer(acny acnyVar) {
        acnv acnvVar = this.a;
        acnvVar.c = acnyVar;
        acnvVar.invalidate();
    }

    public void setDividerColors(int... iArr) {
        acnv acnvVar = this.a;
        acnvVar.c = null;
        acnu acnuVar = acnvVar.d;
        acnvVar.invalidate();
    }

    public void setMinTabOverflow(int i) {
        this.j = i;
        requestLayout();
    }

    public void setOnTabSelectedListener(@dzsi acnw acnwVar) {
        this.g = acnwVar;
    }

    public void setPosition(float f) {
        this.f = f;
        c();
    }

    public void setSelectedIndicatorCenterOnTitle(boolean z) {
        this.a.setSelectedIndicatorCenterOnTitle(z);
    }

    public void setSelectedIndicatorColors(int... iArr) {
        acnv acnvVar = this.a;
        acnvVar.c = null;
        acnvVar.d.a = iArr;
        acnvVar.invalidate();
    }

    public void setSelectedIndicatorFullWidth(boolean z) {
        this.a.setSelectedIndicatorFullWidth(z);
    }

    public void setSelectedIndicatorHeight(int i) {
        this.a.setSelectedIndicatorHeight(i);
    }

    public void setSelectedIndicatorMinWidth(int i) {
        this.a.setSelectedIndicatorMinWidth(i);
    }

    public void setSelectedIndicatorPaddingEnd(int i) {
        this.a.setSelectedIndicatorPaddingEnd(i);
    }

    public void setSelectedIndicatorPaddingStart(int i) {
        this.a.setSelectedIndicatorPaddingStart(i);
    }

    public void setSlidingPadding(int i) {
        this.k = i;
    }

    public acnz(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setSelectedIndicatorDrawable(@dzsi cqtd cqtdVar) {
        this.a.setSelectedIndicatorDrawable(cqtdVar == null ? null : cqtdVar.a(this.e));
    }

    public acnz(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = -1;
        this.l = ((cjqz) btsr.a(cjqz.class)).tr();
        this.e = context;
        setHorizontalScrollBarEnabled(false);
        setFillViewport(true);
        acnv acnvVar = new acnv(context);
        this.a = acnvVar;
        addView(acnvVar, -1, -2);
    }
}
