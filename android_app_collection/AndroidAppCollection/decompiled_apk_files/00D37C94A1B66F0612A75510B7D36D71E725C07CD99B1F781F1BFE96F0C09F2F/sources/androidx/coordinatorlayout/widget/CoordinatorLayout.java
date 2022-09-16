package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.customview.view.AbsSavedState;
import com.google.android.youtube.R;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes.dex */
public class CoordinatorLayout extends ViewGroup implements kf, kg {
    static final String a;
    static final Class[] b;
    static final ThreadLocal c;
    static final Comparator d;
    private static final jk i;
    public final ajh e;
    public mb f;
    public boolean g;
    public ViewGroup.OnHierarchyChangeListener h;
    private final List j;
    private final List k;
    private final int[] l;
    private final int[] m;
    private boolean n;
    private boolean o;
    private int[] p;
    private View q;
    private View r;
    private ajg s;
    private boolean t;
    private Drawable u;
    private kj v;
    private final ki w;

    static {
        Package r0 = CoordinatorLayout.class.getPackage();
        a = r0 != null ? r0.getName() : null;
        d = new wd(3);
        b = new Class[]{Context.class, AttributeSet.class};
        c = new ThreadLocal();
        i = new jm(12);
    }

    public CoordinatorLayout(Context context) {
        this(context, null);
    }

    private static final MotionEvent A(MotionEvent motionEvent) {
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.setAction(3);
        return obtain;
    }

    private static final void B(View view, int i2) {
        ajf ajfVar = (ajf) view.getLayoutParams();
        int i3 = ajfVar.i;
        if (i3 != i2) {
            lj.D(view, i2 - i3);
            ajfVar.i = i2;
        }
    }

    private static final void C(View view, int i2) {
        ajf ajfVar = (ajf) view.getLayoutParams();
        int i3 = ajfVar.j;
        if (i3 != i2) {
            lj.E(view, i2 - i3);
            ajfVar.j = i2;
        }
    }

    public static ajc g(Context context, AttributeSet attributeSet, String str) {
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
            ThreadLocal threadLocal = c;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(b);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (ajc) constructor.newInstance(context, attributeSet);
        } catch (Exception e) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e);
        }
    }

    static final ajf n(View view) {
        ajf ajfVar = (ajf) view.getLayoutParams();
        if (!ajfVar.b) {
            if (view instanceof ajb) {
                ajfVar.b(((ajb) view).a());
                ajfVar.b = true;
            } else {
                ajd ajdVar = null;
                for (Class<?> cls = view.getClass(); cls != null; cls = cls.getSuperclass()) {
                    ajdVar = (ajd) cls.getAnnotation(ajd.class);
                    if (ajdVar != null) {
                        break;
                    }
                }
                if (ajdVar != null) {
                    try {
                        ajfVar.b((ajc) ajdVar.a().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    } catch (Exception e) {
                        Log.e("CoordinatorLayout", "Default behavior class " + ajdVar.a().getName() + " could not be instantiated. Did you forget a default constructor?", e);
                    }
                }
                ajfVar.b = true;
            }
        }
        return ajfVar;
    }

    private final int p(int i2) {
        int[] iArr = this.p;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        } else if (i2 < 0 || i2 >= iArr.length) {
            Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
            return 0;
        } else {
            return iArr[i2];
        }
    }

    private static int q(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int r(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static Rect s() {
        Rect rect = (Rect) i.a();
        return rect == null ? new Rect() : rect;
    }

    private final void t(ajf ajfVar, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int max = Math.max(getPaddingLeft() + ajfVar.leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ajfVar.rightMargin));
        int max2 = Math.max(getPaddingTop() + ajfVar.topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ajfVar.bottomMargin));
        rect.set(max, max2, i2 + max, i3 + max2);
    }

    private static void u(Rect rect) {
        rect.setEmpty();
        i.b(rect);
    }

    private final void v() {
        View view = this.q;
        if (view != null) {
            ajc ajcVar = ((ajf) view.getLayoutParams()).a;
            if (ajcVar != null) {
                long uptimeMillis = SystemClock.uptimeMillis();
                MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                ajcVar.m(this, this.q, obtain);
                obtain.recycle();
            }
            this.q = null;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            ((ajf) getChildAt(i2).getLayoutParams()).m = false;
        }
        this.n = false;
    }

    private final void w() {
        if (lj.af(this)) {
            if (this.v == null) {
                this.v = new aja(this);
            }
            lj.X(this, this.v);
            setSystemUiVisibility(1280);
            return;
        }
        lj.X(this, null);
    }

    private final boolean x(ajc ajcVar, View view, MotionEvent motionEvent, int i2) {
        if (i2 != 0) {
            return ajcVar.m(this, view, motionEvent);
        }
        return ajcVar.g(this, view, motionEvent);
    }

    private final boolean y(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.k;
        list.clear();
        boolean isChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i3 = childCount - 1; i3 >= 0; i3--) {
            list.add(getChildAt(isChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i3) : i3));
        }
        Comparator comparator = d;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
        int size = list.size();
        MotionEvent motionEvent2 = null;
        boolean z = false;
        for (int i4 = 0; i4 < size; i4++) {
            View view = (View) list.get(i4);
            ajf ajfVar = (ajf) view.getLayoutParams();
            ajc ajcVar = ajfVar.a;
            if (!z || actionMasked == 0) {
                if (!z && ajcVar != null && (z = x(ajcVar, view, motionEvent, i2))) {
                    this.q = view;
                    if (actionMasked != 3 && actionMasked != 1) {
                        for (int i5 = 0; i5 < i4; i5++) {
                            View view2 = (View) list.get(i5);
                            ajc ajcVar2 = ((ajf) view2.getLayoutParams()).a;
                            if (ajcVar2 != null) {
                                if (motionEvent2 == null) {
                                    motionEvent2 = A(motionEvent);
                                }
                                x(ajcVar2, view2, motionEvent2, i2);
                            }
                        }
                    }
                }
                if (ajfVar.a == null) {
                    ajfVar.m = false;
                }
                boolean z2 = ajfVar.m;
            } else if (ajcVar != null) {
                if (motionEvent2 == null) {
                    motionEvent2 = A(motionEvent);
                }
                x(ajcVar, view, motionEvent2, i2);
            }
        }
        list.clear();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return z;
    }

    private static final void z(int i2, Rect rect, Rect rect2, ajf ajfVar, int i3, int i4) {
        int width;
        int height;
        int i5 = ajfVar.c;
        if (i5 == 0) {
            i5 = 17;
        }
        int absoluteGravity = Gravity.getAbsoluteGravity(i5, i2);
        int absoluteGravity2 = Gravity.getAbsoluteGravity(q(ajfVar.d), i2);
        int i6 = absoluteGravity & 7;
        int i7 = absoluteGravity & 112;
        int i8 = absoluteGravity2 & 112;
        int i9 = absoluteGravity2 & 7;
        if (i9 == 1) {
            width = rect.left + (rect.width() / 2);
        } else if (i9 == 5) {
            width = rect.right;
        } else {
            width = rect.left;
        }
        if (i8 == 16) {
            height = (rect.height() / 2) + rect.top;
        } else if (i8 == 80) {
            height = rect.bottom;
        } else {
            height = rect.top;
        }
        if (i6 == 1) {
            width -= i3 / 2;
        } else if (i6 != 5) {
            width -= i3;
        }
        if (i7 == 16) {
            height -= i4 / 2;
        } else if (i7 != 80) {
            height -= i4;
        }
        rect2.set(width, height, i3 + width, i4 + height);
    }

    @Override // defpackage.kf
    public final void c(View view, View view2, int i2, int i3) {
        this.w.b(i2, i3);
        this.r = view2;
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            ajf ajfVar = (ajf) getChildAt(i4).getLayoutParams();
            if (ajfVar.d(i3)) {
                ajc ajcVar = ajfVar.a;
            }
        }
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof ajf) && super.checkLayoutParams(layoutParams);
    }

    @Override // defpackage.kf
    public final void d(View view, int i2) {
        this.w.c(i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            ajf ajfVar = (ajf) childAt.getLayoutParams();
            if (ajfVar.d(i2)) {
                ajc ajcVar = ajfVar.a;
                if (ajcVar != null) {
                    ajcVar.e(this, childAt, view, i2);
                }
                ajfVar.c(i2, false);
                ajfVar.a();
            }
        }
        this.r = null;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        ajc ajcVar = ((ajf) view.getLayoutParams()).a;
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.u;
        if (drawable == null || !drawable.isStateful() || !drawable.setState(drawableState)) {
            return;
        }
        invalidate();
    }

    @Override // defpackage.kf
    public final boolean e(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z = false;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                ajf ajfVar = (ajf) childAt.getLayoutParams();
                ajc ajcVar = ajfVar.a;
                if (ajcVar != null) {
                    boolean l = ajcVar.l(this, childAt, view, view2, i2, i3);
                    z |= l;
                    ajfVar.c(i3, l);
                } else {
                    ajfVar.c(i3, false);
                }
            }
        }
        return z;
    }

    @Override // defpackage.kg
    public final void f(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        ajc ajcVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                ajf ajfVar = (ajf) childAt.getLayoutParams();
                if (ajfVar.d(i6) && (ajcVar = ajfVar.a) != null) {
                    int[] iArr2 = this.l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ajcVar.d(this, childAt, view, i2, i3, i4, i5, i6, iArr2);
                    if (i4 > 0) {
                        min = Math.max(i7, this.l[0]);
                    } else {
                        min = Math.min(i7, this.l[0]);
                    }
                    i7 = min;
                    if (i5 > 0) {
                        min2 = Math.max(i8, this.l[1]);
                    } else {
                        min2 = Math.min(i8, this.l[1]);
                    }
                    i8 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = iArr[0] + i7;
        iArr[1] = iArr[1] + i8;
        if (z) {
            k(1);
        }
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ajf();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ajf(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public final int getNestedScrollAxes() {
        return this.w.a();
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected final int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public final List h(View view) {
        ajh ajhVar = this.e;
        int i2 = ajhVar.b.j;
        ArrayList arrayList = null;
        for (int i3 = 0; i3 < i2; i3++) {
            ArrayList arrayList2 = (ArrayList) ajhVar.b.i(i3);
            if (arrayList2 != null && arrayList2.contains(view)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(ajhVar.b.f(i3));
            }
        }
        return arrayList == null ? Collections.emptyList() : arrayList;
    }

    public final void i(View view) {
        ArrayList a2 = this.e.a(view);
        if (a2 == null || a2.isEmpty()) {
            return;
        }
        for (int i2 = 0; i2 < a2.size(); i2++) {
            View view2 = (View) a2.get(i2);
            ajc ajcVar = ((ajf) view2.getLayoutParams()).a;
            if (ajcVar != null) {
                ajcVar.f(this, view2, view);
            }
        }
    }

    final void j(View view, boolean z, Rect rect) {
        if (view.isLayoutRequested() || view.getVisibility() == 8) {
            rect.setEmpty();
        } else if (z) {
            aji.a(this, view, rect);
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
    public final void k(int r25) {
        /*
            Method dump skipped, instructions count: 722
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.k(int):void");
    }

    @Override // defpackage.kf
    public final void ko(View view, int i2, int i3, int[] iArr, int i4) {
        ajc ajcVar;
        int min;
        int min2;
        int childCount = getChildCount();
        boolean z = false;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() != 8) {
                ajf ajfVar = (ajf) childAt.getLayoutParams();
                if (ajfVar.d(i4) && (ajcVar = ajfVar.a) != null) {
                    int[] iArr2 = this.l;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    ajcVar.c(this, childAt, view, i2, i3, iArr2, i4);
                    if (i2 > 0) {
                        min = Math.max(i5, this.l[0]);
                    } else {
                        min = Math.min(i5, this.l[0]);
                    }
                    i5 = min;
                    if (i3 > 0) {
                        min2 = Math.max(i6, this.l[1]);
                    } else {
                        min2 = Math.min(i6, this.l[1]);
                    }
                    i6 = min2;
                    z = true;
                }
            }
        }
        iArr[0] = i5;
        iArr[1] = i6;
        if (z) {
            k(1);
        }
    }

    @Override // defpackage.kf
    public final void kp(View view, int i2, int i3, int i4, int i5, int i6) {
        f(view, i2, i3, i4, i5, 0, this.m);
    }

    public final void l(View view, int i2) {
        Rect s;
        Rect s2;
        int i3;
        ajf ajfVar = (ajf) view.getLayoutParams();
        View view2 = ajfVar.k;
        if (view2 != null || ajfVar.f == -1) {
            if (view2 != null) {
                s = s();
                s2 = s();
                try {
                    aji.a(this, view2, s);
                    ajf ajfVar2 = (ajf) view.getLayoutParams();
                    int measuredWidth = view.getMeasuredWidth();
                    int measuredHeight = view.getMeasuredHeight();
                    z(i2, s, s2, ajfVar2, measuredWidth, measuredHeight);
                    t(ajfVar2, s2, measuredWidth, measuredHeight);
                    view.layout(s2.left, s2.top, s2.right, s2.bottom);
                    return;
                } finally {
                    u(s);
                    u(s2);
                }
            }
            int i4 = ajfVar.e;
            if (i4 < 0) {
                ajf ajfVar3 = (ajf) view.getLayoutParams();
                s = s();
                s.set(getPaddingLeft() + ajfVar3.leftMargin, getPaddingTop() + ajfVar3.topMargin, (getWidth() - getPaddingRight()) - ajfVar3.rightMargin, (getHeight() - getPaddingBottom()) - ajfVar3.bottomMargin);
                if (this.f != null && lj.af(this) && !lj.af(view)) {
                    s.left += this.f.d();
                    s.top += this.f.f();
                    s.right -= this.f.e();
                    s.bottom -= this.f.c();
                }
                s2 = s();
                Gravity.apply(q(ajfVar3.c), view.getMeasuredWidth(), view.getMeasuredHeight(), s, s2, i2);
                view.layout(s2.left, s2.top, s2.right, s2.bottom);
                return;
            }
            ajf ajfVar4 = (ajf) view.getLayoutParams();
            int absoluteGravity = Gravity.getAbsoluteGravity(r(ajfVar4.c), i2);
            int i5 = absoluteGravity & 7;
            int i6 = absoluteGravity & 112;
            int width = getWidth();
            int height = getHeight();
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight2 = view.getMeasuredHeight();
            if (i2 == 1) {
                i4 = width - i4;
            }
            int p = p(i4) - measuredWidth2;
            if (i5 == 1) {
                p += measuredWidth2 / 2;
            } else if (i5 == 5) {
                p += measuredWidth2;
            }
            if (i6 != 16) {
                i3 = i6 != 80 ? 0 : measuredHeight2;
            } else {
                i3 = measuredHeight2 / 2;
            }
            int max = Math.max(getPaddingLeft() + ajfVar4.leftMargin, Math.min(p, ((width - getPaddingRight()) - measuredWidth2) - ajfVar4.rightMargin));
            int max2 = Math.max(getPaddingTop() + ajfVar4.topMargin, Math.min(i3, ((height - getPaddingBottom()) - measuredHeight2) - ajfVar4.bottomMargin));
            view.layout(max, max2, measuredWidth2 + max, measuredHeight2 + max2);
            return;
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    public final boolean m(View view, int i2, int i3) {
        Rect s = s();
        aji.a(this, view, s);
        try {
            return s.contains(i2, i3);
        } finally {
            u(s);
        }
    }

    public final void o(View view, int i2, int i3, int i4) {
        measureChildWithMargins(view, i2, i3, i4, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        v();
        if (this.t) {
            if (this.s == null) {
                this.s = new ajg(this);
            }
            getViewTreeObserver().addOnPreDrawListener(this.s);
        }
        if (this.f == null && lj.af(this)) {
            lj.K(this);
        }
        this.o = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
        if (this.t && this.s != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.s);
        }
        View view = this.r;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.o = false;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.g || this.u == null) {
            return;
        }
        mb mbVar = this.f;
        int f = mbVar != null ? mbVar.f() : 0;
        if (f <= 0) {
            return;
        }
        this.u.setBounds(0, 0, getWidth(), f);
        this.u.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            v();
            actionMasked = 0;
        }
        boolean y = y(motionEvent, 0);
        if (actionMasked == 1 || actionMasked == 3) {
            this.q = null;
            v();
        }
        return y;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i2, int i3, int i4, int i5) {
        ajc ajcVar;
        int e = lj.e(this);
        int size = this.j.size();
        for (int i6 = 0; i6 < size; i6++) {
            View view = (View) this.j.get(i6);
            if (view.getVisibility() != 8 && ((ajcVar = ((ajf) view.getLayoutParams()).a) == null || !ajcVar.h(this, view, e))) {
                l(view, e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0345  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r31, int r32) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.coordinatorlayout.widget.CoordinatorLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(View view, float f, float f2, boolean z) {
        ajc ajcVar;
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ajf ajfVar = (ajf) childAt.getLayoutParams();
                if (ajfVar.n && (ajcVar = ajfVar.a) != null) {
                    z2 |= ajcVar.i(this, childAt, view, f, f2, z);
                }
            }
        }
        if (z2) {
            k(1);
        }
        return z2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(View view, float f, float f2) {
        ajc ajcVar;
        int childCount = getChildCount();
        boolean z = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                ajf ajfVar = (ajf) childAt.getLayoutParams();
                if (ajfVar.n && (ajcVar = ajfVar.a) != null) {
                    z |= ajcVar.j(this, childAt, view, f, f2);
                }
            }
        }
        return z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        ko(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        kp(view, i2, i3, i4, i5, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScrollAccepted(View view, View view2, int i2) {
        c(view, view2, i2, 0);
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
        SparseArray sparseArray = savedState.a;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            ajc ajcVar = n(childAt).a;
            if (id != -1 && ajcVar != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                ajcVar.q(childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Parcelable r;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            ajc ajcVar = ((ajf) childAt.getLayoutParams()).a;
            if (id != -1 && ajcVar != null && (r = ajcVar.r(childAt)) != null) {
                sparseArray.append(id, r);
            }
        }
        savedState.a = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(View view, View view2, int i2) {
        return e(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(View view) {
        d(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean y;
        int actionMasked = motionEvent.getActionMasked();
        View view = this.q;
        boolean z = false;
        if (view != null) {
            ajc ajcVar = ((ajf) view.getLayoutParams()).a;
            y = ajcVar != null ? ajcVar.m(this, this.q, motionEvent) : false;
        } else {
            y = y(motionEvent, 1);
            if (actionMasked != 0 && y) {
                z = true;
            }
        }
        if (this.q == null || actionMasked == 3) {
            y |= super.onTouchEvent(motionEvent);
        } else if (z) {
            MotionEvent A = A(motionEvent);
            super.onTouchEvent(A);
            A.recycle();
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.q = null;
            v();
        }
        return y;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        ajc ajcVar = ((ajf) view.getLayoutParams()).a;
        if (ajcVar == null || !ajcVar.k(this, view, rect, z)) {
            return super.requestChildRectangleOnScreen(view, rect, z);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        if (!z || this.n) {
            return;
        }
        if (this.q == null) {
            int childCount = getChildCount();
            MotionEvent motionEvent = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                ajc ajcVar = ((ajf) childAt.getLayoutParams()).a;
                if (ajcVar != null) {
                    if (motionEvent == null) {
                        long uptimeMillis = SystemClock.uptimeMillis();
                        motionEvent = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    }
                    ajcVar.g(this, childAt, motionEvent);
                }
            }
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        }
        v();
        this.n = true;
    }

    @Override // android.view.View
    public final void setFitsSystemWindows(boolean z) {
        super.setFitsSystemWindows(z);
        w();
    }

    @Override // android.view.ViewGroup
    public final void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.h = onHierarchyChangeListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z = i2 == 0;
        Drawable drawable = this.u;
        if (drawable == null || drawable.isVisible() == z) {
            return;
        }
        this.u.setVisible(z, false);
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.u;
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.coordinatorLayoutStyle);
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ajf) {
            return new ajf((ajf) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new ajf((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new ajf(layoutParams);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        TypedArray obtainStyledAttributes;
        this.j = new ArrayList();
        this.e = new ajh();
        this.k = new ArrayList();
        this.l = new int[2];
        this.m = new int[2];
        this.w = new ki();
        if (i2 == 0) {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aiz.a, 0, 2132084480);
        } else {
            obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aiz.a, i2, 0);
        }
        if (i2 == 0) {
            lj.L(this, context, aiz.a, attributeSet, obtainStyledAttributes, 0, 2132084480);
        } else {
            lj.L(this, context, aiz.a, attributeSet, obtainStyledAttributes, i2, 0);
        }
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            Resources resources = context.getResources();
            this.p = resources.getIntArray(resourceId);
            float f = resources.getDisplayMetrics().density;
            int length = this.p.length;
            for (int i3 = 0; i3 < length; i3++) {
                int[] iArr = this.p;
                iArr[i3] = (int) (iArr[i3] * f);
            }
        }
        this.u = obtainStyledAttributes.getDrawable(1);
        obtainStyledAttributes.recycle();
        w();
        super.setOnHierarchyChangeListener(new aje(this));
        if (lj.c(this) == 0) {
            lj.V(this, 1);
        }
    }

    /* compiled from: PG */
    /* loaded from: classes.dex */
    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new yg(4);
        SparseArray a;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int readInt = parcel.readInt();
            int[] iArr = new int[readInt];
            parcel.readIntArray(iArr);
            Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
            this.a = new SparseArray(readInt);
            for (int i = 0; i < readInt; i++) {
                this.a.append(iArr[i], readParcelableArray[i]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            SparseArray sparseArray = this.a;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = this.a.keyAt(i2);
                parcelableArr[i2] = (Parcelable) this.a.valueAt(i2);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
