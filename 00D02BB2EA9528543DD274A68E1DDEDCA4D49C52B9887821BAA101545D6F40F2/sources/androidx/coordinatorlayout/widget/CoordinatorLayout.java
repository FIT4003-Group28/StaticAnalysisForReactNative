package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import com.google.android.filament.R;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class CoordinatorLayout extends ViewGroup implements nn, no {
    static final String a;
    static final Class<?>[] b;
    static final ThreadLocal<Map<String, Constructor<aji>>> c;
    static final Comparator<View> d;
    private static final my<Rect> j;
    public final ajp<View> e;
    public final List<View> f;
    public ow g;
    public boolean h;
    public ViewGroup.OnHierarchyChangeListener i;
    private final List<View> k;
    private final List<View> l;
    private final int[] m;
    private final int[] n;
    private boolean o;
    private boolean p;
    private int[] q;
    private View r;
    private View s;
    private ajm t;
    private boolean u;
    private Drawable v;
    private nq w;
    private final np x;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new ajo();
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal<>();
        j = new na(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private static final MotionEvent A(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    private static final void B(View view, int i) {
        ajl ajlVar = (ajl) view.getLayoutParams();
        int i2 = ajlVar.i;
        if (i2 != i) {
            od.ah(view, i - i2);
            ajlVar.i = i;
        }
    }

    private static final void C(View view, int i) {
        ajl ajlVar = (ajl) view.getLayoutParams();
        int i2 = ajlVar.j;
        if (i2 != i) {
            od.ag(view, i - i2);
            ajlVar.j = i;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static aji g(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = a;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<aji>>> threadLocal = c;
            Map<String, Constructor<aji>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<aji> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    static final ajl n(View view) {
        ajl ajlVar = (ajl) view.getLayoutParams();
        if (!ajlVar.b) {
            if (view instanceof ajh) {
                ajlVar.a(((ajh) view).a());
                ajlVar.b = true;
            } else {
                ajj ajjVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    ajjVar = (ajj) cls.getAnnotation(ajj.class);
                    if (ajjVar != null) {
                        break;
                    }
                }
                if (ajjVar != null) {
                    try {
                        ajlVar.a(ajjVar.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception unused) {
                        String str = "Default behavior class " + ajjVar.a().getName() + " could not be instantiated. Did you forget a default constructor?";
                    }
                }
                ajlVar.b = true;
            }
        }
        return ajlVar;
    }

    private static Rect p() {
        Rect a2 = j.a();
        return a2 == null ? new Rect() : a2;
    }

    private static void q(Rect rect) {
        rect.setEmpty();
        j.b(rect);
    }

    private final void r() {
        View view = this.r;
        if (view != null) {
            aji ajiVar = ((ajl) view.getLayoutParams()).a;
            if (ajiVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                ajiVar.d(this, this.r, obtain);
                obtain.recycle();
            }
            this.r = null;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            ((ajl) getChildAt(i).getLayoutParams()).m = false;
        }
        this.o = false;
    }

    private final boolean s(MotionEvent motionEvent, int i) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.l;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i2) : i2));
        }
        Comparator<View> comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = list.get(i3);
            ajl ajlVar = (ajl) view.getLayoutParams();
            aji ajiVar = ajlVar.a;
            if (!z || actionMasked == 0) {
                if (!z && ajiVar != null && (z = t(ajiVar, view, motionEvent, i))) {
                    this.r = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i4 = 0; i4 < i3; i4++) {
                            View view2 = list.get(i4);
                            aji ajiVar2 = ((ajl) view2.getLayoutParams()).a;
                            if (ajiVar2 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = A(motionEvent);
                                }
                                t(ajiVar2, view2, motionEvent2, i);
                            }
                        }
                    }
                }
                if (ajlVar.a == null) {
                    ajlVar.m = false;
                }
                boolean z2 = ajlVar.m;
            } else if (ajiVar != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = A(motionEvent);
                }
                t(ajiVar, view, motionEvent2, i);
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    private final boolean t(aji ajiVar, View view, MotionEvent motionEvent, int i) {
        if (i != 0) {
            return ajiVar.d(this, view, motionEvent);
        }
        return ajiVar.c(this, view, motionEvent);
    }

    private final int u(int i) {
        int[] iArr = this.q;
        if (iArr == null) {
            String str = "No keylines defined for " + this + " - attempted index lookup " + i;
            return 0;
        } else if (i < 0 || i >= iArr.length) {
            String str2 = "Keyline index " + i + " out of range for " + this;
            return 0;
        } else {
            return iArr[i];
        }
    }

    private final void v(ajl ajlVar, Rect rect, int i, int i2) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ajlVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i) - ajlVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + ajlVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i2) - ajlVar.bottomMargin));
        rect.set(max, max2, i + max, i2 + max2);
    }

    private static int w(int i) {
        if ((i & 7) == 0) {
            i |= 8388611;
        }
        return (i & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle) == 0 ? i | 48 : i;
    }

    private static int x(int i) {
        if (i == 0) {
            return 8388661;
        }
        return i;
    }

    private final void y() {
        if (od.M(this)) {
            if (this.w == null) {
                this.w = new ajg(this);
            }
            od.O(this, this.w);
            setSystemUiVisibility(1280);
            return;
        }
        od.O(this, null);
    }

    private static final void z(int i, Rect rect, Rect rect2, ajl ajlVar, int i2, int i3) {
        int width;
        int height;
        int i4 = ajlVar.c;
        if (i4 == 0) {
            i4 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i4, i);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(w(ajlVar.d), i);
        int i5 = absoluteGravity & 7;
        int i6 = absoluteGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i7 = absoluteGravity2 & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
        int i8 = absoluteGravity2 & 7;
        if (i8 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i8 == 5) {
            width = rect.right;
        } else {
            width = rect.left;
        }
        if (i7 == 16) {
            height = (rect.height() / 2) + rect.top;
        } else if (i7 == 80) {
            height = rect.bottom;
        } else {
            height = rect.top;
        }
        if (i5 == 1) {
            width -= i2 / 2;
        } else if (i5 != 5) {
            width -= i2;
        }
        if (i6 == 16) {
            height -= i3 / 2;
        } else if (i6 != 80) {
            height -= i3;
        }
        rect2.set(width, height, i2 + width, i3 + height);
    }

    @Override // defpackage.nn
    public final boolean a(View view, View view2, int i, int i2) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (childAt.getVisibility() != 8) {
                ajl ajlVar = (ajl) childAt.getLayoutParams();
                aji ajiVar = ajlVar.a;
                if (ajiVar != null) {
                    boolean r = ajiVar.r(this, childAt, view, i, i2);
                    z |= r;
                    ajlVar.b(i2, r);
                } else {
                    ajlVar.b(i2, false);
                }
            }
        }
        return true == z;
    }

    @Override // defpackage.nn
    public final void b(View view, View view2, int i, int i2) {
        this.x.b(i, i2);
        this.s = view2;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            ajl ajlVar = (ajl) getChildAt(i3).getLayoutParams();
            if (ajlVar.c(i2)) {
                aji ajiVar = ajlVar.a;
            }
        }
    }

    @Override // defpackage.nn
    public final void c(View view, int i) {
        this.x.c(i);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            ajl ajlVar = (ajl) childAt.getLayoutParams();
            if (ajlVar.c(i)) {
                aji ajiVar = ajlVar.a;
                if (ajiVar != null) {
                    ajiVar.g(this, childAt, view, i);
                }
                ajlVar.b(i, false);
                ajlVar.d();
            }
        }
        this.s = null;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ajl) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.nn
    public final void d(View view, int i, int i2, int i3, int i4, int i5) {
        f(view, i, i2, i3, i4, 0, this.n);
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j2) {
        aji ajiVar = ((ajl) view.getLayoutParams()).a;
        return super.drawChild(canvas, view, j2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.v;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(drawableState)) {
            return;
        }
        invalidate();
    }

    @Override // defpackage.nn
    public final void e(View view, int i, int i2, int[] iArr, int i3) {
        aji ajiVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                ajl ajlVar = (ajl) childAt.getLayoutParams();
                if (ajlVar.c(i3) && (ajiVar = ajlVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ajiVar.n(this, childAt, view, i2, iArr2, i3);
                    if (i > 0) {
                        min = Math.max(i4, this.m[0]);
                    } else {
                        min = Math.min(i4, this.m[0]);
                    }
                    i4 = min;
                    if (i2 > 0) {
                        min2 = Math.max(i5, this.m[1]);
                    } else {
                        min2 = Math.min(i5, this.m[1]);
                    }
                    i5 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i4;
        iArr[1] = i5;
        if (z) {
            j(1);
        }
    }

    @Override // defpackage.no
    public final void f(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        aji ajiVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                ajl ajlVar = (ajl) childAt.getLayoutParams();
                if (ajlVar.c(i5) && (ajiVar = ajlVar.a) != null) {
                    int[] iArr2 = this.m;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ajiVar.o(this, childAt, i2, i3, i4, iArr2);
                    if (i3 > 0) {
                        min = Math.max(i6, this.m[0]);
                    } else {
                        min = Math.min(i6, this.m[0]);
                    }
                    i6 = min;
                    if (i4 > 0) {
                        min2 = Math.max(i7, this.m[1]);
                    } else {
                        min2 = Math.min(i7, this.m[1]);
                    }
                    i7 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i6;
        iArr[1] = iArr[1] + i7;
        if (z) {
            j(1);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ajl(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ajl(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ajl ? new ajl((ajl) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new ajl((ViewGroup.MarginLayoutParams) layoutParams) : new ajl(layoutParams);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.x.a();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public final void h(View view, int i) {
        Rect p;
        Rect p2;
        int i2;
        ajl ajlVar = (ajl) view.getLayoutParams();
        View view2 = ajlVar.k;
        if (view2 != null || ajlVar.f == -1) {
            if (view2 != null) {
                p = p();
                p2 = p();
                try {
                    ajq.a(this, view2, p);
                    ajl ajlVar2 = (ajl) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    z(i, p, p2, ajlVar2, measuredWidth, measuredHeight);
                    v(ajlVar2, p2, measuredWidth, measuredHeight);
                    view.layout(p2.left, p2.top, p2.right, p2.bottom);
                    return;
                } finally {
                    q(p);
                    q(p2);
                }
            }
            int i3 = ajlVar.e;
            if (i3 < 0) {
                ajl ajlVar3 = (ajl) view.getLayoutParams();
                p = p();
                p.set(getPaddingLeft() + ajlVar3.leftMargin, getPaddingTop() + ajlVar3.topMargin, (getWidth() - getPaddingRight()) - ajlVar3.rightMargin, (getHeight() - getPaddingBottom()) - ajlVar3.bottomMargin);
                if (this.g != null && od.M(this) && !od.M(view)) {
                    p.left += this.g.c();
                    p.top += this.g.d();
                    p.right -= this.g.e();
                    p.bottom -= this.g.f();
                }
                p2 = p();
                Gravity.apply(w(ajlVar3.c), view.getMeasuredWidth(), view.getMeasuredHeight(), p, p2, i);
                view.layout(p2.left, p2.top, p2.right, p2.bottom);
                return;
            }
            ajl ajlVar4 = (ajl) view.getLayoutParams();
            int absoluteGravity = Gravity.getAbsoluteGravity(x(ajlVar4.c), i);
            int i4 = absoluteGravity & 7;
            int i5 = absoluteGravity & R.styleable.AppCompatTheme_toolbarNavigationButtonStyle;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i == 1) {
                i3 = width - i3;
            }
            int u = u(i3) - measuredWidth2;
            if (i4 == 1) {
                u += measuredWidth2 / 2;
            } else if (i4 == 5) {
                u += measuredWidth2;
            }
            if (i5 != 16) {
                i2 = i5 != 80 ? 0 : measuredHeight2;
            } else {
                i2 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ajlVar4.leftMargin, Math.min(u, ((width - getPaddingRight()) - measuredWidth2) - ajlVar4.rightMargin));
            int max2 = Math.max(getPaddingTop() + ajlVar4.topMargin, Math.min(i2, ((height - getPaddingBottom()) - measuredHeight2) - ajlVar4.bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    final void i(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            ajq.a(this, view, rect);
        } else {
            rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x028a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r25) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.j(int):void");
    }

    public final void k(View view) {
        List b2 = this.e.b(view);
        if (b2 == null || b2.isEmpty()) {
            return;
        }
        for (int i = 0; i < b2.size(); i++) {
            View view2 = (View) b2.get(i);
            aji ajiVar = ((ajl) view2.getLayoutParams()).a;
            if (ajiVar != null) {
                ajiVar.e(this, view2, view);
            }
        }
    }

    public final List<View> l(View view) {
        ajp<View> ajpVar = this.e;
        int i = ajpVar.b.j;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < i; i2++) {
            ArrayList<View> j2 = ajpVar.b.j(i2);
            if (j2 != null && j2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ajpVar.b.i(i2));
            }
        }
        this.f.clear();
        if (arrayList != null) {
            this.f.addAll(arrayList);
        }
        return this.f;
    }

    public final boolean m(View view, int i, int i2) {
        Rect p = p();
        ajq.a(this, view, p);
        try {
            return p.contains(i, i2);
        } finally {
            q(p);
        }
    }

    public final void o(View view, int i, int i2, int i3) {
        measureChildWithMargins(view, i, i2, i3, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        r();
        if (this.u) {
            if (this.t == null) {
                this.t = new ajm(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.t);
        }
        if (this.g == null && od.M(this)) {
            od.L(this);
        }
        this.p = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r();
        if (this.u && this.t != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.t);
        }
        View view = this.s;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.p = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.h || this.v == null) {
            return;
        }
        ow owVar = this.g;
        int d2 = owVar != null ? owVar.d() : 0;
        if (d2 <= 0) {
            return;
        }
        this.v.setBounds(0, 0, getWidth(), d2);
        this.v.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            r();
            actionMasked = 0;
        }
        boolean s = s(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.r = null;
            r();
        }
        return s;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        aji ajiVar;
        int s = od.s(this);
        int size = this.k.size();
        for (int i5 = 0; i5 < size; i5++) {
            View view = this.k.get(i5);
            if (view.getVisibility() != 8 && ((ajiVar = ((ajl) view.getLayoutParams()).a) == null || !ajiVar.f(this, view, s))) {
                h(view, s);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0342  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 943
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ajl ajlVar = (ajl) childAt.getLayoutParams();
                if (ajlVar.n) {
                    aji ajiVar = ajlVar.a;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        aji ajiVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() != 8) {
                ajl ajlVar = (ajl) childAt.getLayoutParams();
                if (ajlVar.n && (ajiVar = ajlVar.a) != null) {
                    z |= ajiVar.l(view);
                }
            }
        }
        return true == z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        e(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        d(view, i, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i) {
        b(view, view2, i, 0);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        SparseArray<Parcelable> sparseArray = savedState.a;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            aji ajiVar = n(childAt).a;
            if (id != -1 && ajiVar != null && (parcelable2 = sparseArray.get(id)) != null) {
                ajiVar.p(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable q;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            int id = childAt.getId();
            aji ajiVar = ((ajl) childAt.getLayoutParams()).a;
            if (id != -1 && ajiVar != null && (q = ajiVar.q(childAt)) != null) {
                sparseArray.append(id, q);
            }
        }
        savedState.a = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i) {
        return a(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        c(view, 0);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean s;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.r;
        boolean z = false;
        if (view != null) {
            aji ajiVar = ((ajl) view.getLayoutParams()).a;
            s = ajiVar != null ? ajiVar.d(this, this.r, motionEvent) : false;
        } else {
            s = s(motionEvent, 1);
            if (actionMasked != 0 && s) {
                z = true;
            }
        }
        if (this.r == null || actionMasked == 3) {
            s |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent A = A(motionEvent);
            super.onTouchEvent(A);
            A.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.r = null;
            r();
        }
        return s;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        aji ajiVar = ((ajl) view.getLayoutParams()).a;
        if (ajiVar == null || !ajiVar.h(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.o) {
            return;
        }
        if (this.r == null) {
            int childCount = getChildCount();
            MotionEvent motionEvent = null;
            for (int i = 0; i < childCount; i++) {
                View childAt = getChildAt(i);
                aji ajiVar = ((ajl) childAt.getLayoutParams()).a;
                if (ajiVar != null) {
                    if (motionEvent == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    ajiVar.c(this, childAt, motionEvent);
                }
            }
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        r();
        this.o = true;
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        y();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.i = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(Drawable drawable) {
        Drawable drawable2 = this.v;
        if (drawable2 != drawable) {
            Drawable drawable3 = null;
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            if (drawable != null) {
                drawable3 = drawable.mutate();
            }
            this.v = drawable3;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.v.setState(getDrawableState());
                }
                ks.d(this.v, od.s(this));
                this.v.setVisible(getVisibility() == 0, false);
                this.v.setCallback(this);
            }
            od.i(this);
        }
    }

    public void setStatusBarBackgroundColor(int i) {
        setStatusBarBackground(new ColorDrawable(i));
    }

    public void setStatusBarBackgroundResource(int i) {
        setStatusBarBackground(i != 0 ? getContext().getDrawable(i) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.v;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.v.setVisible(z, false);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.v;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.apps.maps.R.attr.coordinatorLayoutStyle);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        this.k = new ArrayList();
        this.e = new ajp<>();
        this.l = new ArrayList();
        this.f = new ArrayList();
        this.m = new int[2];
        this.n = new int[2];
        this.x = new np();
        if (i == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajf.a, 0, 2132018815);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ajf.a, i, 0);
        }
        if (i == 0) {
            od.a(this, context, ajf.a, attributeSet, obtainStyledAttributes, 0, 2132018815);
        } else {
            od.a(this, context, ajf.a, attributeSet, obtainStyledAttributes, i, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.q = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.q.length;
            for (int i2 = 0; i2 < length; i2++) {
                int[] iArr = this.q;
                iArr[i2] = (int) (iArr[i2] * f);
            }
        }
        this.v = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        y();
        super.setOnHierarchyChangeListener(new ajk(this));
        if (od.l(this) == 0) {
            od.m(this, 1);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new ajn();
        SparseArray<Parcelable> a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.a = new SparseArray<>(readInt);
            for (int i = 0; i < readInt; i++) {
                this.a.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray<Parcelable> sparseArray = this.a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.a.keyAt(i2);
                parcelableArr[i2] = this.a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
