package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
/* compiled from: PG */
/* loaded from: classes.dex */
public class ActionMenuView extends wm implements se, sv {
    public sf a;
    public boolean b;
    public tq c;
    public sd d;
    public aae e;
    private Context f;
    private int g;
    private ss h;
    private boolean i;
    private int j;
    private int k;
    private int l;

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public static final tt j() {
        tt ttVar = new tt();
        ttVar.gravity = 16;
        return ttVar;
    }

    public static final tt k(ViewGroup.LayoutParams layoutParams) {
        tt ttVar;
        if (layoutParams != null) {
            if (layoutParams instanceof tt) {
                ttVar = new tt((tt) layoutParams);
            } else {
                ttVar = new tt(layoutParams);
            }
            if (ttVar.gravity <= 0) {
                ttVar.gravity = 16;
            }
            return ttVar;
        }
        return j();
    }

    @Override // defpackage.sv
    public final void a(sf sfVar) {
        this.a = sfVar;
    }

    @Override // defpackage.se
    public final boolean b(si siVar) {
        return this.a.z(siVar, 0);
    }

    @Override // defpackage.wm, android.view.ViewGroup
    /* renamed from: c */
    public final tt mo22generateLayoutParams(AttributeSet attributeSet) {
        return new tt(getContext(), attributeSet);
    }

    @Override // defpackage.wm, android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof tt;
    }

    public final Menu d() {
        if (this.a == null) {
            Context context = getContext();
            sf sfVar = new sf(context);
            this.a = sfVar;
            sfVar.p(new tu(this));
            tq tqVar = new tq(context);
            this.c = tqVar;
            tqVar.p();
            tq tqVar2 = this.c;
            ss ssVar = this.h;
            if (ssVar == null) {
                ssVar = new ts();
            }
            tqVar2.e = ssVar;
            this.a.h(this.c, this.f);
            this.c.j(this);
        }
        return this.a;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public final void e() {
        tq tqVar = this.c;
        if (tqVar != null) {
            tqVar.n();
        }
    }

    public final void f(ss ssVar, sd sdVar) {
        this.h = ssVar;
        this.d = sdVar;
    }

    public final void g(int i) {
        if (this.g != i) {
            this.g = i;
            if (i == 0) {
                this.f = getContext();
            } else {
                this.f = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    @Override // defpackage.wm, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams  reason: collision with other method in class */
    protected final /* bridge */ /* synthetic */ wl mo21generateDefaultLayoutParams() {
        return j();
    }

    public final void h(tq tqVar) {
        this.c = tqVar;
        tqVar.j(this);
    }

    protected final boolean i(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof tr)) {
            z = ((tr) childAt).c();
        }
        return (i <= 0 || !(childAt2 instanceof tr)) ? z : ((tr) childAt2).d() | z;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        tq tqVar = this.c;
        if (tqVar != null) {
            tqVar.i();
            if (!this.c.l()) {
                return;
            }
            this.c.k();
            this.c.m();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.wm, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean b = aav.b(this);
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                tt ttVar = (tt) childAt.getLayoutParams();
                if (ttVar.a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (i(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (b) {
                        i5 = getPaddingLeft() + ttVar.leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ttVar.rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ttVar.leftMargin) + ttVar.rightMargin;
                    i(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1) {
            if (i8 == 0) {
                View childAt2 = getChildAt(0);
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i12 = (i7 / 2) - (measuredWidth2 / 2);
                int i13 = i6 - (measuredHeight2 / 2);
                childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
                return;
            }
            childCount = 1;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (b) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                tt ttVar2 = (tt) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !ttVar2.a) {
                    int i16 = width2 - ttVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ttVar2.leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            tt ttVar3 = (tt) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !ttVar3.a) {
                int i19 = paddingLeft + ttVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = i19 + measuredWidth4 + ttVar3.rightMargin + max;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x02f6  */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v37 */
    @Override // defpackage.wm, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.onMeasure(int, int):void");
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.k = (int) (56.0f * f);
        this.l = (int) (f * 4.0f);
        this.f = context;
        this.g = 0;
    }

    @Override // defpackage.wm, android.view.ViewGroup
    /* renamed from: generateDefaultLayoutParams */
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams mo21generateDefaultLayoutParams() {
        return j();
    }

    @Override // defpackage.wm, android.view.ViewGroup
    /* renamed from: generateLayoutParams  reason: collision with other method in class */
    protected final /* bridge */ /* synthetic */ wl mo23generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }

    @Override // defpackage.wm, android.view.ViewGroup
    /* renamed from: generateLayoutParams */
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams mo23generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return k(layoutParams);
    }
}
