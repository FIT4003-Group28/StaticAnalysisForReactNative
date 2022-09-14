package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.support.v7.view.menu.ActionMenuItemView;
import android.support.v7.view.menu.g;
import android.support.v7.view.menu.m;
import android.support.v7.widget.y;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewDebug;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* loaded from: classes.dex */
public class ActionMenuView extends y implements g.b, android.support.v7.view.menu.n {

    /* renamed from: a  reason: collision with root package name */
    g.a f808a;

    /* renamed from: b  reason: collision with root package name */
    e f809b;

    /* renamed from: c  reason: collision with root package name */
    private android.support.v7.view.menu.g f810c;

    /* renamed from: d  reason: collision with root package name */
    private Context f811d;
    private int e;
    private boolean f;
    private android.support.v7.widget.d g;
    private m.a h;
    private boolean i;
    private int j;
    private int k;
    private int l;

    /* loaded from: classes.dex */
    public interface a {
        boolean c();

        boolean d();
    }

    /* loaded from: classes.dex */
    public interface e {
        boolean a(MenuItem menuItem);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public int getWindowAnimations() {
        return 0;
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f = context.getResources().getDisplayMetrics().density;
        this.k = (int) (56.0f * f);
        this.l = (int) (f * 4.0f);
        this.f811d = context;
        this.e = 0;
    }

    public void setPopupTheme(int i) {
        if (this.e != i) {
            this.e = i;
            if (i == 0) {
                this.f811d = getContext();
            } else {
                this.f811d = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public int getPopupTheme() {
        return this.e;
    }

    public void setPresenter(android.support.v7.widget.d dVar) {
        this.g = dVar;
        this.g.a(this);
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.g != null) {
            this.g.b(false);
            if (!this.g.h()) {
                return;
            }
            this.g.e();
            this.g.d();
        }
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f809b = eVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.y, android.view.View
    public void onMeasure(int i, int i2) {
        boolean z = this.i;
        this.i = View.MeasureSpec.getMode(i) == 1073741824;
        if (z != this.i) {
            this.j = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.i && this.f810c != null && size != this.j) {
            this.j = size;
            this.f810c.b(true);
        }
        int childCount = getChildCount();
        if (this.i && childCount > 0) {
            c(i, i2);
            return;
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            c cVar = (c) getChildAt(i3).getLayoutParams();
            cVar.rightMargin = 0;
            cVar.leftMargin = 0;
        }
        super.onMeasure(i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x024c A[LOOP:5: B:139:0x024c->B:144:0x026f, LOOP_START, PHI: r5 r32 
      PHI: (r5v7 int) = (r5v6 int), (r5v8 int) binds: [B:138:0x024a, B:144:0x026f] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r32v1 int) = (r32v0 int), (r32v2 int) binds: [B:138:0x024a, B:144:0x026f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x027b  */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(int r35, int r36) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v7.widget.ActionMenuView.c(int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(View view, int i, int i2, int i3, int i4) {
        c cVar = (c) view.getLayoutParams();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3) - i4, View.MeasureSpec.getMode(i3));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z = false;
        boolean z2 = actionMenuItemView != null && actionMenuItemView.b();
        int i5 = 2;
        if (i2 <= 0 || (z2 && i2 < 2)) {
            i5 = 0;
        } else {
            view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i, PKIFailureInfo.systemUnavail), makeMeasureSpec);
            int measuredWidth = view.getMeasuredWidth();
            int i6 = measuredWidth / i;
            if (measuredWidth % i != 0) {
                i6++;
            }
            if (!z2 || i6 >= 2) {
                i5 = i6;
            }
        }
        if (!cVar.f812a && z2) {
            z = true;
        }
        cVar.f815d = z;
        cVar.f813b = i5;
        view.measure(View.MeasureSpec.makeMeasureSpec(i * i5, 1073741824), makeMeasureSpec);
        return i5;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.y, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int width;
        int i7;
        if (!this.i) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i3 - i;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean a2 = as.a(this);
        int i10 = paddingRight;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f812a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (a(i13)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a2) {
                        i7 = getPaddingLeft() + cVar.leftMargin;
                        width = i7 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - cVar.rightMargin;
                        i7 = width - measuredWidth;
                    }
                    int i14 = i8 - (measuredHeight / 2);
                    childAt.layout(i7, i14, width, measuredHeight + i14);
                    i10 -= measuredWidth;
                    i11 = 1;
                } else {
                    i10 -= (childAt.getMeasuredWidth() + cVar.leftMargin) + cVar.rightMargin;
                    a(i13);
                    i12++;
                }
            }
        }
        if (childCount == 1 && i11 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i15 = (i9 / 2) - (measuredWidth2 / 2);
            int i16 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i15, i16, measuredWidth2 + i15, measuredHeight2 + i16);
            return;
        }
        int i17 = i12 - (i11 ^ 1);
        if (i17 > 0) {
            i6 = i10 / i17;
            i5 = 0;
        } else {
            i5 = 0;
            i6 = 0;
        }
        int max = Math.max(i5, i6);
        if (a2) {
            int width2 = getWidth() - getPaddingRight();
            while (i5 < childCount) {
                View childAt3 = getChildAt(i5);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f812a) {
                    int i18 = width2 - cVar2.rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + cVar2.leftMargin) + max);
                }
                i5++;
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        while (i5 < childCount) {
            View childAt4 = getChildAt(i5);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f812a) {
                int i20 = paddingLeft + cVar3.leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i21 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i20, i21, i20 + measuredWidth4, measuredHeight4 + i21);
                paddingLeft = i20 + measuredWidth4 + cVar3.rightMargin + max;
            }
            i5++;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f();
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.g.a(drawable);
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.g.c();
    }

    public void setOverflowReserved(boolean z) {
        this.f = z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.y, android.view.ViewGroup
    /* renamed from: a */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        cVar.h = 16;
        return cVar;
    }

    @Override // android.support.v7.widget.y, android.view.ViewGroup
    /* renamed from: a */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.y, android.view.ViewGroup
    /* renamed from: a */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams != null) {
            c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
            if (cVar.h <= 0) {
                cVar.h = 16;
            }
            return cVar;
        }
        return generateDefaultLayoutParams();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v7.widget.y, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams != null && (layoutParams instanceof c);
    }

    public c b() {
        c generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.f812a = true;
        return generateDefaultLayoutParams;
    }

    @Override // android.support.v7.view.menu.g.b
    public boolean a(android.support.v7.view.menu.h hVar) {
        return this.f810c.a(hVar, 0);
    }

    public void a(android.support.v7.view.menu.g gVar) {
        this.f810c = gVar;
    }

    public Menu getMenu() {
        if (this.f810c == null) {
            Context context = getContext();
            this.f810c = new android.support.v7.view.menu.g(context);
            this.f810c.a(new d());
            this.g = new android.support.v7.widget.d(context);
            this.g.c(true);
            this.g.a(this.h != null ? this.h : new b());
            this.f810c.a(this.g, this.f811d);
            this.g.a(this);
        }
        return this.f810c;
    }

    public void a(m.a aVar, g.a aVar2) {
        this.h = aVar;
        this.f808a = aVar2;
    }

    public android.support.v7.view.menu.g c() {
        return this.f810c;
    }

    public boolean d() {
        return this.g != null && this.g.d();
    }

    public boolean e() {
        return this.g != null && this.g.h();
    }

    public void f() {
        if (this.g != null) {
            this.g.f();
        }
    }

    protected boolean a(int i) {
        boolean z = false;
        if (i == 0) {
            return false;
        }
        View childAt = getChildAt(i - 1);
        View childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof a)) {
            z = false | ((a) childAt).d();
        }
        return (i <= 0 || !(childAt2 instanceof a)) ? z : z | ((a) childAt2).c();
    }

    public void setExpandedActionViewsExclusive(boolean z) {
        this.g.d(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements g.a {
        d() {
        }

        @Override // android.support.v7.view.menu.g.a
        public boolean a(android.support.v7.view.menu.g gVar, MenuItem menuItem) {
            return ActionMenuView.this.f809b != null && ActionMenuView.this.f809b.a(menuItem);
        }

        @Override // android.support.v7.view.menu.g.a
        public void a(android.support.v7.view.menu.g gVar) {
            if (ActionMenuView.this.f808a != null) {
                ActionMenuView.this.f808a.a(gVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class b implements m.a {
        @Override // android.support.v7.view.menu.m.a
        public void a(android.support.v7.view.menu.g gVar, boolean z) {
        }

        @Override // android.support.v7.view.menu.m.a
        public boolean a(android.support.v7.view.menu.g gVar) {
            return false;
        }

        b() {
        }
    }

    /* loaded from: classes.dex */
    public static class c extends y.a {
        @ViewDebug.ExportedProperty

        /* renamed from: a  reason: collision with root package name */
        public boolean f812a;
        @ViewDebug.ExportedProperty

        /* renamed from: b  reason: collision with root package name */
        public int f813b;
        @ViewDebug.ExportedProperty

        /* renamed from: c  reason: collision with root package name */
        public int f814c;
        @ViewDebug.ExportedProperty

        /* renamed from: d  reason: collision with root package name */
        public boolean f815d;
        @ViewDebug.ExportedProperty
        public boolean e;
        boolean f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super(cVar);
            this.f812a = cVar.f812a;
        }

        public c(int i, int i2) {
            super(i, i2);
            this.f812a = false;
        }
    }
}
