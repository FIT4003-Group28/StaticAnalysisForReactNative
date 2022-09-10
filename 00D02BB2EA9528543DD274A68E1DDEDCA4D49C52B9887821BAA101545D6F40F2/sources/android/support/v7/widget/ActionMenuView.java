package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ActionMenuView extends aab implements ve, vv {
    public vf a;
    public boolean b;
    public wt c;
    public vd d;
    public wy e;
    private Context i;
    private int j;
    private vs k;
    private boolean l;
    private int m;
    private int n;
    private int o;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static final ww j() {
        ww wwVar = new ww();
        wwVar.gravity = 16;
        return wwVar;
    }

    public static final ww k(ViewGroup.LayoutParams layoutParams) {
        ww wwVar;
        if (layoutParams != null) {
            if (layoutParams instanceof ww) {
                wwVar = new ww((ww) layoutParams);
            } else {
                wwVar = new ww(layoutParams);
            }
            if (wwVar.gravity <= 0) {
                wwVar.gravity = 16;
            }
            return wwVar;
        }
        return j();
    }

    @Override // defpackage.vv
    public final void a(vf vfVar) {
        this.a = vfVar;
    }

    @Override // defpackage.ve
    public final boolean b(vi viVar) {
        return this.a.o(viVar, 0);
    }

    @Override // defpackage.aab
    /* renamed from: c */
    public final ww i(AttributeSet attributeSet) {
        return new ww(getContext(), attributeSet);
    }

    @Override // defpackage.aab, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ww;
    }

    public final Menu d() {
        if (this.a == null) {
            Context context = getContext();
            vf vfVar = new vf(context);
            this.a = vfVar;
            vfVar.g(new wx(this));
            wt wtVar = new wt(context);
            this.c = wtVar;
            wtVar.o();
            wt wtVar2 = this.c;
            vs vsVar = this.k;
            if (vsVar == null) {
                vsVar = new wv();
            }
            wtVar2.e = vsVar;
            this.a.b(this.c, this.i);
            this.c.m(this);
        }
        return this.a;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final void e() {
        wt wtVar = this.c;
        if (wtVar != null) {
            wtVar.n();
        }
    }

    protected final boolean f(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof wu)) {
            z = ((wu) childAt).e();
        }
        return (i <= 0 || !(childAt2 instanceof wu)) ? z : ((wu) childAt2).d() | z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aab
    public final /* bridge */ /* synthetic */ aaa g(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    @Override // defpackage.aab, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.aab, android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aab
    public final /* bridge */ /* synthetic */ aaa h() {
        return j();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        wt wtVar = this.c;
        if (wtVar != null) {
            wtVar.i();
            if (!this.c.l()) {
                return;
            }
            this.c.k();
            this.c.j();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aab, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.l) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int i7 = this.h;
        int i8 = i3 - i;
        int paddingRight = (i8 - getPaddingRight()) - getPaddingLeft();
        boolean a = afm.a(this);
        int i9 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                ww wwVar = (ww) childAt.getLayoutParams();
                if (wwVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (f(i11)) {
                        measuredWidth += i7;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a) {
                        i5 = getPaddingLeft() + wwVar.leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - wwVar.rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i12 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i12, width, measuredHeight + i12);
                    paddingRight -= measuredWidth;
                    i9 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + wwVar.leftMargin) + wwVar.rightMargin;
                    f(i11);
                    i10++;
                }
            }
        }
        if (childCount == 1) {
            if (i9 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i13 = (i8 / 2) - (measuredWidth2 / 2);
                int i14 = i6 - (measuredHeight2 / 2);
                childAt2.layout(i13, i14, measuredWidth2 + i13, measuredHeight2 + i14);
                return;
            }
            childCount = 1;
        }
        int i15 = i10 - (i9 ^ 1);
        int max = Math.max(0, i15 > 0 ? paddingRight / i15 : 0);
        if (a) {
            int width2 = getWidth() - getPaddingRight();
            for (int i16 = 0; i16 < childCount; i16++) {
                View childAt3 = getChildAt(i16);
                ww wwVar2 = (ww) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !wwVar2.a) {
                    int i17 = width2 - wwVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i18 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i17 - measuredWidth3, i18, i17, measuredHeight3 + i18);
                    width2 = i17 - ((measuredWidth3 + wwVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i19 = 0; i19 < childCount; i19++) {
            View childAt4 = getChildAt(i19);
            ww wwVar3 = (ww) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !wwVar3.a) {
                int i20 = paddingLeft + wwVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + wwVar3.rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f2  */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v37 */
    @Override // defpackage.aab, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r30, int r31) {
        /*
            Method dump skipped, instructions count: 789
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.c.k = z;
    }

    public void setMenuCallbacks(vs vsVar, vd vdVar) {
        this.k = vsVar;
        this.d = vdVar;
    }

    public void setOnMenuItemClickListener(wy wyVar) {
        this.e = wyVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        d();
        wt wtVar = this.c;
        wq wqVar = wtVar.g;
        if (wqVar != null) {
            wqVar.setImageDrawable(drawable);
            return;
        }
        wtVar.i = true;
        wtVar.h = drawable;
    }

    public void setOverflowReserved(boolean z) {
        this.b = z;
    }

    public void setPopupTheme(int i) {
        if (this.j != i) {
            this.j = i;
            if (i == 0) {
                this.i = getContext();
            } else {
                this.i = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(wt wtVar) {
        this.c = wtVar;
        wtVar.m(this);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.n = (int) (56.0f * f);
        this.o = (int) (f * 4.0f);
        this.i = context;
        this.j = 0;
    }
}
