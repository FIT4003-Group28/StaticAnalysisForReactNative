package android.support.v4.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.j.a.a;
import android.support.v4.j.s;
import android.support.v4.widget.p;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
/* compiled from: DrawerLayout.java */
/* loaded from: classes.dex */
public class g extends ViewGroup {

    /* renamed from: b  reason: collision with root package name */
    static final boolean f654b;

    /* renamed from: d  reason: collision with root package name */
    private static final boolean f656d;
    private float A;
    private Drawable B;
    private Drawable C;
    private Drawable D;
    private CharSequence E;
    private CharSequence F;
    private Object G;
    private boolean H;
    private Drawable I;
    private Drawable J;
    private Drawable K;
    private Drawable L;
    private final ArrayList<View> M;
    private final b e;
    private float f;
    private int g;
    private int h;
    private float i;
    private Paint j;
    private final p k;
    private final p l;
    private final f m;
    private final f n;
    private int o;
    private boolean p;
    private boolean q;
    private int r;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean w;
    private c x;
    private List<c> y;
    private float z;

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f655c = {16843828};

    /* renamed from: a  reason: collision with root package name */
    static final int[] f653a = {16842931};

    /* compiled from: DrawerLayout.java */
    /* loaded from: classes.dex */
    public interface c {
        void a(int i);

        void a(View view);

        void a(View view, float f);

        void b(View view);
    }

    static {
        boolean z = true;
        f654b = Build.VERSION.SDK_INT >= 19;
        if (Build.VERSION.SDK_INT < 21) {
            z = false;
        }
        f656d = z;
    }

    public g(Context context) {
        this(context, null);
    }

    public g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public g(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new b();
        this.h = -1728053248;
        this.j = new Paint();
        this.q = true;
        this.r = 3;
        this.s = 3;
        this.t = 3;
        this.u = 3;
        this.I = null;
        this.J = null;
        this.K = null;
        this.L = null;
        setDescendantFocusability(PKIFailureInfo.transactionIdInUse);
        float f2 = getResources().getDisplayMetrics().density;
        this.g = (int) ((64.0f * f2) + 0.5f);
        float f3 = 400.0f * f2;
        this.m = new f(3);
        this.n = new f(5);
        this.k = p.a(this, 1.0f, this.m);
        this.k.a(1);
        this.k.a(f3);
        this.m.a(this.k);
        this.l = p.a(this, 1.0f, this.n);
        this.l.a(2);
        this.l.a(f3);
        this.n.a(this.l);
        setFocusableInTouchMode(true);
        s.a((View) this, 1);
        s.a(this, new a());
        setMotionEventSplittingEnabled(false);
        if (s.j(this)) {
            if (Build.VERSION.SDK_INT >= 21) {
                setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: android.support.v4.widget.g.1
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    @TargetApi(21)
                    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                        ((g) view).a(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
                        return windowInsets.consumeSystemWindowInsets();
                    }
                });
                setSystemUiVisibility(1280);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f655c);
                try {
                    this.B = obtainStyledAttributes.getDrawable(0);
                } finally {
                    obtainStyledAttributes.recycle();
                }
            } else {
                this.B = null;
            }
        }
        this.f = f2 * 10.0f;
        this.M = new ArrayList<>();
    }

    public void setDrawerElevation(float f2) {
        this.f = f2;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (g(childAt)) {
                s.a(childAt, this.f);
            }
        }
    }

    public float getDrawerElevation() {
        return f656d ? this.f : BitmapDescriptorFactory.HUE_RED;
    }

    public void a(Object obj, boolean z) {
        this.G = obj;
        this.H = z;
        setWillNotDraw(!z && getBackground() == null);
        requestLayout();
    }

    public void setScrimColor(int i) {
        this.h = i;
        invalidate();
    }

    @Deprecated
    public void setDrawerListener(c cVar) {
        if (this.x != null) {
            b(this.x);
        }
        if (cVar != null) {
            a(cVar);
        }
        this.x = cVar;
    }

    public void a(c cVar) {
        if (cVar == null) {
            return;
        }
        if (this.y == null) {
            this.y = new ArrayList();
        }
        this.y.add(cVar);
    }

    public void b(c cVar) {
        if (cVar == null || this.y == null) {
            return;
        }
        this.y.remove(cVar);
    }

    public void setDrawerLockMode(int i) {
        a(i, 3);
        a(i, 5);
    }

    public void a(int i, int i2) {
        int a2 = android.support.v4.j.e.a(i2, s.c(this));
        if (i2 == 3) {
            this.r = i;
        } else if (i2 == 5) {
            this.s = i;
        } else if (i2 == 8388611) {
            this.t = i;
        } else if (i2 == 8388613) {
            this.u = i;
        }
        if (i != 0) {
            (a2 == 3 ? this.k : this.l).e();
        }
        switch (i) {
            case 1:
                View c2 = c(a2);
                if (c2 == null) {
                    return;
                }
                i(c2);
                return;
            case 2:
                View c3 = c(a2);
                if (c3 == null) {
                    return;
                }
                h(c3);
                return;
            default:
                return;
        }
    }

    public int a(int i) {
        int c2 = s.c(this);
        if (i == 3) {
            if (this.r != 3) {
                return this.r;
            }
            int i2 = c2 == 0 ? this.t : this.u;
            if (i2 == 3) {
                return 0;
            }
            return i2;
        } else if (i == 5) {
            if (this.s != 3) {
                return this.s;
            }
            int i3 = c2 == 0 ? this.u : this.t;
            if (i3 == 3) {
                return 0;
            }
            return i3;
        } else if (i == 8388611) {
            if (this.t != 3) {
                return this.t;
            }
            int i4 = c2 == 0 ? this.r : this.s;
            if (i4 == 3) {
                return 0;
            }
            return i4;
        } else if (i != 8388613) {
            return 0;
        } else {
            if (this.u != 3) {
                return this.u;
            }
            int i5 = c2 == 0 ? this.s : this.r;
            if (i5 == 3) {
                return 0;
            }
            return i5;
        }
    }

    public int a(View view) {
        if (!g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a drawer");
        }
        return a(((d) view.getLayoutParams()).f660a);
    }

    public CharSequence b(int i) {
        int a2 = android.support.v4.j.e.a(i, s.c(this));
        if (a2 == 3) {
            return this.E;
        }
        if (a2 != 5) {
            return null;
        }
        return this.F;
    }

    void a(int i, int i2, View view) {
        int a2 = this.k.a();
        int a3 = this.l.a();
        int i3 = 2;
        if (a2 == 1 || a3 == 1) {
            i3 = 1;
        } else if (a2 != 2 && a3 != 2) {
            i3 = 0;
        }
        if (view != null && i2 == 0) {
            d dVar = (d) view.getLayoutParams();
            if (dVar.f661b == BitmapDescriptorFactory.HUE_RED) {
                b(view);
            } else if (dVar.f661b == 1.0f) {
                c(view);
            }
        }
        if (i3 != this.o) {
            this.o = i3;
            if (this.y == null) {
                return;
            }
            for (int size = this.y.size() - 1; size >= 0; size--) {
                this.y.get(size).a(i3);
            }
        }
    }

    void b(View view) {
        View rootView;
        d dVar = (d) view.getLayoutParams();
        if ((dVar.f663d & 1) == 1) {
            dVar.f663d = 0;
            if (this.y != null) {
                for (int size = this.y.size() - 1; size >= 0; size--) {
                    this.y.get(size).b(view);
                }
            }
            c(view, false);
            if (!hasWindowFocus() || (rootView = getRootView()) == null) {
                return;
            }
            rootView.sendAccessibilityEvent(32);
        }
    }

    void c(View view) {
        d dVar = (d) view.getLayoutParams();
        if ((dVar.f663d & 1) == 0) {
            dVar.f663d = 1;
            if (this.y != null) {
                for (int size = this.y.size() - 1; size >= 0; size--) {
                    this.y.get(size).a(view);
                }
            }
            c(view, true);
            if (!hasWindowFocus()) {
                return;
            }
            sendAccessibilityEvent(32);
        }
    }

    private void c(View view, boolean z) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((!z && !g(childAt)) || (z && childAt == view)) {
                s.a(childAt, 1);
            } else {
                s.a(childAt, 4);
            }
        }
    }

    void a(View view, float f2) {
        if (this.y != null) {
            for (int size = this.y.size() - 1; size >= 0; size--) {
                this.y.get(size).a(view, f2);
            }
        }
    }

    void b(View view, float f2) {
        d dVar = (d) view.getLayoutParams();
        if (f2 == dVar.f661b) {
            return;
        }
        dVar.f661b = f2;
        a(view, f2);
    }

    float d(View view) {
        return ((d) view.getLayoutParams()).f661b;
    }

    int e(View view) {
        return android.support.v4.j.e.a(((d) view.getLayoutParams()).f660a, s.c(this));
    }

    boolean a(View view, int i) {
        return (e(view) & i) == i;
    }

    View a() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if ((((d) childAt.getLayoutParams()).f663d & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    void c(View view, float f2) {
        float d2 = d(view);
        float width = view.getWidth();
        int i = ((int) (width * f2)) - ((int) (d2 * width));
        if (!a(view, 3)) {
            i = -i;
        }
        view.offsetLeftAndRight(i);
        b(view, f2);
    }

    View c(int i) {
        int a2 = android.support.v4.j.e.a(i, s.c(this)) & 7;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((e(childAt) & 7) == a2) {
                return childAt;
            }
        }
        return null;
    }

    static String d(int i) {
        return (i & 3) == 3 ? "LEFT" : (i & 5) == 5 ? "RIGHT" : Integer.toHexString(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.q = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.q = true;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode != Integer.MIN_VALUE && mode == 0) {
                size = 300;
            }
            if (mode2 != Integer.MIN_VALUE && mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        int i3 = 0;
        boolean z = this.G != null && s.j(this);
        int c2 = s.c(this);
        int childCount = getChildCount();
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (z) {
                    int a2 = android.support.v4.j.e.a(dVar.f660a, c2);
                    if (s.j(childAt)) {
                        if (Build.VERSION.SDK_INT >= 21) {
                            WindowInsets windowInsets = (WindowInsets) this.G;
                            if (a2 == 3) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), i3, windowInsets.getSystemWindowInsetBottom());
                            } else if (a2 == 5) {
                                windowInsets = windowInsets.replaceSystemWindowInsets(i3, windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
                            }
                            childAt.dispatchApplyWindowInsets(windowInsets);
                        }
                    } else if (Build.VERSION.SDK_INT >= 21) {
                        WindowInsets windowInsets2 = (WindowInsets) this.G;
                        if (a2 == 3) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(windowInsets2.getSystemWindowInsetLeft(), windowInsets2.getSystemWindowInsetTop(), i3, windowInsets2.getSystemWindowInsetBottom());
                        } else if (a2 == 5) {
                            windowInsets2 = windowInsets2.replaceSystemWindowInsets(i3, windowInsets2.getSystemWindowInsetTop(), windowInsets2.getSystemWindowInsetRight(), windowInsets2.getSystemWindowInsetBottom());
                        }
                        dVar.leftMargin = windowInsets2.getSystemWindowInsetLeft();
                        dVar.topMargin = windowInsets2.getSystemWindowInsetTop();
                        dVar.rightMargin = windowInsets2.getSystemWindowInsetRight();
                        dVar.bottomMargin = windowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (f(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - dVar.leftMargin) - dVar.rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - dVar.topMargin) - dVar.bottomMargin, 1073741824));
                } else if (g(childAt)) {
                    if (f656d && s.f(childAt) != this.f) {
                        s.a(childAt, this.f);
                    }
                    int e2 = e(childAt) & 7;
                    boolean z4 = e2 == 3;
                    if ((z4 && z2) || (!z4 && z3)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + d(e2) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z4) {
                        z2 = true;
                    } else {
                        z3 = true;
                    }
                    childAt.measure(getChildMeasureSpec(i, this.g + dVar.leftMargin + dVar.rightMargin, dVar.width), getChildMeasureSpec(i2, dVar.topMargin + dVar.bottomMargin, dVar.height));
                    i4++;
                    i3 = 0;
                } else {
                    throw new IllegalStateException("Child " + childAt + " at index " + i4 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                }
            }
            i4++;
            i3 = 0;
        }
    }

    private void e() {
        if (f656d) {
            return;
        }
        this.C = f();
        this.D = g();
    }

    private Drawable f() {
        int c2 = s.c(this);
        if (c2 == 0) {
            if (this.I != null) {
                a(this.I, c2);
                return this.I;
            }
        } else if (this.J != null) {
            a(this.J, c2);
            return this.J;
        }
        return this.K;
    }

    private Drawable g() {
        int c2 = s.c(this);
        if (c2 == 0) {
            if (this.J != null) {
                a(this.J, c2);
                return this.J;
            }
        } else if (this.I != null) {
            a(this.I, c2);
            return this.I;
        }
        return this.L;
    }

    private boolean a(Drawable drawable, int i) {
        if (drawable == null || !android.support.v4.b.a.a.b(drawable)) {
            return false;
        }
        android.support.v4.b.a.a.b(drawable, i);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        float f2;
        int i6;
        this.p = true;
        int i7 = i3 - i;
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                d dVar = (d) childAt.getLayoutParams();
                if (f(childAt)) {
                    childAt.layout(dVar.leftMargin, dVar.topMargin, dVar.leftMargin + childAt.getMeasuredWidth(), dVar.topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (a(childAt, 3)) {
                        float f3 = measuredWidth;
                        i6 = (-measuredWidth) + ((int) (dVar.f661b * f3));
                        f2 = (measuredWidth + i6) / f3;
                    } else {
                        float f4 = measuredWidth;
                        f2 = (i7 - i5) / f4;
                        i6 = i7 - ((int) (dVar.f661b * f4));
                    }
                    boolean z2 = f2 != dVar.f661b;
                    int i9 = dVar.f660a & 112;
                    if (i9 == 16) {
                        int i10 = i4 - i2;
                        int i11 = (i10 - measuredHeight) / 2;
                        if (i11 < dVar.topMargin) {
                            i11 = dVar.topMargin;
                        } else if (i11 + measuredHeight > i10 - dVar.bottomMargin) {
                            i11 = (i10 - dVar.bottomMargin) - measuredHeight;
                        }
                        childAt.layout(i6, i11, measuredWidth + i6, measuredHeight + i11);
                    } else if (i9 != 80) {
                        childAt.layout(i6, dVar.topMargin, measuredWidth + i6, dVar.topMargin + measuredHeight);
                    } else {
                        int i12 = i4 - i2;
                        childAt.layout(i6, (i12 - dVar.bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i6, i12 - dVar.bottomMargin);
                    }
                    if (z2) {
                        b(childAt, f2);
                    }
                    int i13 = dVar.f661b > BitmapDescriptorFactory.HUE_RED ? 0 : 4;
                    if (childAt.getVisibility() != i13) {
                        childAt.setVisibility(i13);
                    }
                }
            }
        }
        this.p = false;
        this.q = false;
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.p) {
            super.requestLayout();
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < childCount; i++) {
            f2 = Math.max(f2, ((d) getChildAt(i).getLayoutParams()).f661b);
        }
        this.i = f2;
        boolean a2 = this.k.a(true);
        boolean a3 = this.l.a(true);
        if (a2 || a3) {
            s.a(this);
        }
    }

    private static boolean m(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    public void setStatusBarBackground(Drawable drawable) {
        this.B = drawable;
        invalidate();
    }

    public Drawable getStatusBarBackgroundDrawable() {
        return this.B;
    }

    public void setStatusBarBackground(int i) {
        this.B = i != 0 ? android.support.v4.a.a.a(getContext(), i) : null;
        invalidate();
    }

    public void setStatusBarBackgroundColor(int i) {
        this.B = new ColorDrawable(i);
        invalidate();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i) {
        e();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.H || this.B == null) {
            return;
        }
        int systemWindowInsetTop = (Build.VERSION.SDK_INT < 21 || this.G == null) ? 0 : ((WindowInsets) this.G).getSystemWindowInsetTop();
        if (systemWindowInsetTop <= 0) {
            return;
        }
        this.B.setBounds(0, 0, getWidth(), systemWindowInsetTop);
        this.B.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        int i;
        int i2;
        int height = getHeight();
        boolean f2 = f(view);
        int width = getWidth();
        int save = canvas.save();
        if (f2) {
            int childCount = getChildCount();
            i = width;
            i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if (childAt != view && childAt.getVisibility() == 0 && m(childAt) && g(childAt) && childAt.getHeight() >= height) {
                    if (a(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i2) {
                            i2 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < i) {
                            i = left;
                        }
                    }
                }
            }
            canvas.clipRect(i2, 0, i, getHeight());
        } else {
            i = width;
            i2 = 0;
        }
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(save);
        if (this.i > BitmapDescriptorFactory.HUE_RED && f2) {
            this.j.setColor((((int) (((this.h & (-16777216)) >>> 24) * this.i)) << 24) | (this.h & 16777215));
            canvas.drawRect(i2, BitmapDescriptorFactory.HUE_RED, i, getHeight(), this.j);
        } else if (this.C != null && a(view, 3)) {
            int intrinsicWidth = this.C.getIntrinsicWidth();
            int right2 = view.getRight();
            float max = Math.max((float) BitmapDescriptorFactory.HUE_RED, Math.min(right2 / this.k.b(), 1.0f));
            this.C.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.C.setAlpha((int) (max * 255.0f));
            this.C.draw(canvas);
        } else if (this.D != null && a(view, 5)) {
            int intrinsicWidth2 = this.D.getIntrinsicWidth();
            int left2 = view.getLeft();
            float max2 = Math.max((float) BitmapDescriptorFactory.HUE_RED, Math.min((getWidth() - left2) / this.l.b(), 1.0f));
            this.D.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.D.setAlpha((int) (max2 * 255.0f));
            this.D.draw(canvas);
        }
        return drawChild;
    }

    boolean f(View view) {
        return ((d) view.getLayoutParams()).f660a == 0;
    }

    boolean g(View view) {
        int a2 = android.support.v4.j.e.a(((d) view.getLayoutParams()).f660a, s.c(view));
        return ((a2 & 3) == 0 && (a2 & 5) == 0) ? false : true;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View d2;
        int actionMasked = motionEvent.getActionMasked();
        boolean a2 = this.k.a(motionEvent) | this.l.a(motionEvent);
        switch (actionMasked) {
            case 0:
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                this.z = x;
                this.A = y;
                z = this.i > BitmapDescriptorFactory.HUE_RED && (d2 = this.k.d((int) x, (int) y)) != null && f(d2);
                this.v = false;
                this.w = false;
                break;
            case 1:
            case 3:
                a(true);
                this.v = false;
                this.w = false;
                z = false;
                break;
            case 2:
                if (this.k.d(3)) {
                    this.m.a();
                    this.n.a();
                }
                z = false;
                break;
            default:
                z = false;
                break;
        }
        return a2 || z || h() || this.w;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View a2;
        this.k.b(motionEvent);
        this.l.b(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action != 3) {
            switch (action) {
                case 0:
                    float x = motionEvent.getX();
                    float y = motionEvent.getY();
                    this.z = x;
                    this.A = y;
                    this.v = false;
                    this.w = false;
                    break;
                case 1:
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    View d2 = this.k.d((int) x2, (int) y2);
                    if (d2 != null && f(d2)) {
                        float f2 = x2 - this.z;
                        float f3 = y2 - this.A;
                        int d3 = this.k.d();
                        if ((f2 * f2) + (f3 * f3) < d3 * d3 && (a2 = a()) != null && a(a2) != 2) {
                            z = false;
                            a(z);
                            this.v = false;
                            break;
                        }
                    }
                    z = true;
                    a(z);
                    this.v = false;
                    break;
            }
        } else {
            a(true);
            this.v = false;
            this.w = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        this.v = z;
        if (z) {
            a(true);
        }
    }

    public void b() {
        a(false);
    }

    void a(boolean z) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            d dVar = (d) childAt.getLayoutParams();
            if (g(childAt) && (!z || dVar.f662c)) {
                int width = childAt.getWidth();
                if (a(childAt, 3)) {
                    z2 |= this.k.a(childAt, -width, childAt.getTop());
                } else {
                    z2 |= this.l.a(childAt, getWidth(), childAt.getTop());
                }
                dVar.f662c = false;
            }
        }
        this.m.a();
        this.n.a();
        if (z2) {
            invalidate();
        }
    }

    public void h(View view) {
        a(view, true);
    }

    public void a(View view, boolean z) {
        if (!g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.q) {
            dVar.f661b = 1.0f;
            dVar.f663d = 1;
            c(view, true);
        } else if (z) {
            dVar.f663d |= 2;
            if (a(view, 3)) {
                this.k.a(view, 0, view.getTop());
            } else {
                this.l.a(view, getWidth() - view.getWidth(), view.getTop());
            }
        } else {
            c(view, 1.0f);
            a(dVar.f660a, 0, view);
            view.setVisibility(0);
        }
        invalidate();
    }

    public void e(int i) {
        a(i, true);
    }

    public void a(int i, boolean z) {
        View c2 = c(i);
        if (c2 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + d(i));
        }
        a(c2, z);
    }

    public void i(View view) {
        b(view, true);
    }

    public void b(View view, boolean z) {
        if (!g(view)) {
            throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
        }
        d dVar = (d) view.getLayoutParams();
        if (this.q) {
            dVar.f661b = BitmapDescriptorFactory.HUE_RED;
            dVar.f663d = 0;
        } else if (z) {
            dVar.f663d |= 4;
            if (a(view, 3)) {
                this.k.a(view, -view.getWidth(), view.getTop());
            } else {
                this.l.a(view, getWidth(), view.getTop());
            }
        } else {
            c(view, BitmapDescriptorFactory.HUE_RED);
            a(dVar.f660a, 0, view);
            view.setVisibility(4);
        }
        invalidate();
    }

    public void f(int i) {
        b(i, true);
    }

    public void b(int i, boolean z) {
        View c2 = c(i);
        if (c2 == null) {
            throw new IllegalArgumentException("No drawer view found with gravity " + d(i));
        }
        b(c2, z);
    }

    public boolean j(View view) {
        if (g(view)) {
            return (((d) view.getLayoutParams()).f663d & 1) == 1;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public boolean k(View view) {
        if (g(view)) {
            return ((d) view.getLayoutParams()).f661b > BitmapDescriptorFactory.HUE_RED;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    private boolean h() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((d) getChildAt(i).getLayoutParams()).f662c) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new d(-1, -1);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof d ? new d((d) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new d((ViewGroup.MarginLayoutParams) layoutParams) : new d(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof d) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new d(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z = false;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (g(childAt)) {
                if (j(childAt)) {
                    childAt.addFocusables(arrayList, i, i2);
                    z = true;
                }
            } else {
                this.M.add(childAt);
            }
        }
        if (!z) {
            int size = this.M.size();
            for (int i4 = 0; i4 < size; i4++) {
                View view = this.M.get(i4);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i, i2);
                }
            }
        }
        this.M.clear();
    }

    private boolean i() {
        return c() != null;
    }

    View c() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (g(childAt) && k(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    void d() {
        if (!this.w) {
            long uptimeMillis = SystemClock.uptimeMillis();
            MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                getChildAt(i).dispatchTouchEvent(obtain);
            }
            obtain.recycle();
            this.w = true;
        }
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && i()) {
            keyEvent.startTracking();
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i == 4) {
            View c2 = c();
            if (c2 != null && a(c2) == 0) {
                b();
            }
            return c2 != null;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View c2;
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.a());
        if (eVar.f664b != 0 && (c2 = c(eVar.f664b)) != null) {
            h(c2);
        }
        if (eVar.f665c != 3) {
            a(eVar.f665c, 3);
        }
        if (eVar.f666d != 3) {
            a(eVar.f666d, 5);
        }
        if (eVar.e != 3) {
            a(eVar.e, 8388611);
        }
        if (eVar.f == 3) {
            return;
        }
        a(eVar.f, 8388613);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            d dVar = (d) getChildAt(i).getLayoutParams();
            boolean z = true;
            boolean z2 = dVar.f663d == 1;
            if (dVar.f663d != 2) {
                z = false;
            }
            if (z2 || z) {
                eVar.f664b = dVar.f660a;
                break;
            }
        }
        eVar.f665c = this.r;
        eVar.f666d = this.s;
        eVar.e = this.t;
        eVar.f = this.u;
        return eVar;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i, layoutParams);
        if (a() != null || g(view)) {
            s.a(view, 4);
        } else {
            s.a(view, 1);
        }
        if (!f654b) {
            s.a(view, this.e);
        }
    }

    static boolean l(View view) {
        return (s.b(view) == 4 || s.b(view) == 2) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: DrawerLayout.java */
    /* loaded from: classes.dex */
    public static class e extends android.support.v4.j.a {
        public static final Parcelable.Creator<e> CREATOR = new Parcelable.ClassLoaderCreator<e>() { // from class: android.support.v4.widget.g.e.1
            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: a */
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public e[] newArray(int i) {
                return new e[i];
            }
        };

        /* renamed from: b  reason: collision with root package name */
        int f664b;

        /* renamed from: c  reason: collision with root package name */
        int f665c;

        /* renamed from: d  reason: collision with root package name */
        int f666d;
        int e;
        int f;

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f664b = 0;
            this.f664b = parcel.readInt();
            this.f665c = parcel.readInt();
            this.f666d = parcel.readInt();
            this.e = parcel.readInt();
            this.f = parcel.readInt();
        }

        public e(Parcelable parcelable) {
            super(parcelable);
            this.f664b = 0;
        }

        @Override // android.support.v4.j.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f664b);
            parcel.writeInt(this.f665c);
            parcel.writeInt(this.f666d);
            parcel.writeInt(this.e);
            parcel.writeInt(this.f);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: DrawerLayout.java */
    /* loaded from: classes.dex */
    public class f extends p.a {

        /* renamed from: b  reason: collision with root package name */
        private final int f668b;

        /* renamed from: c  reason: collision with root package name */
        private p f669c;

        /* renamed from: d  reason: collision with root package name */
        private final Runnable f670d = new Runnable() { // from class: android.support.v4.widget.g.f.1
            @Override // java.lang.Runnable
            public void run() {
                f.this.b();
            }
        };

        @Override // android.support.v4.widget.p.a
        public boolean b(int i) {
            return false;
        }

        f(int i) {
            this.f668b = i;
        }

        public void a(p pVar) {
            this.f669c = pVar;
        }

        public void a() {
            g.this.removeCallbacks(this.f670d);
        }

        @Override // android.support.v4.widget.p.a
        public boolean a(View view, int i) {
            return g.this.g(view) && g.this.a(view, this.f668b) && g.this.a(view) == 0;
        }

        @Override // android.support.v4.widget.p.a
        public void a(int i) {
            g.this.a(this.f668b, i, this.f669c.c());
        }

        @Override // android.support.v4.widget.p.a
        public void a(View view, int i, int i2, int i3, int i4) {
            int width = view.getWidth();
            float width2 = g.this.a(view, 3) ? (i + width) / width : (g.this.getWidth() - i) / width;
            g.this.b(view, width2);
            view.setVisibility(width2 == BitmapDescriptorFactory.HUE_RED ? 4 : 0);
            g.this.invalidate();
        }

        @Override // android.support.v4.widget.p.a
        public void b(View view, int i) {
            ((d) view.getLayoutParams()).f662c = false;
            c();
        }

        private void c() {
            int i = 3;
            if (this.f668b == 3) {
                i = 5;
            }
            View c2 = g.this.c(i);
            if (c2 != null) {
                g.this.i(c2);
            }
        }

        @Override // android.support.v4.widget.p.a
        public void a(View view, float f, float f2) {
            int i;
            float d2 = g.this.d(view);
            int width = view.getWidth();
            if (g.this.a(view, 3)) {
                int i2 = (f > BitmapDescriptorFactory.HUE_RED ? 1 : (f == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                i = (i2 > 0 || (i2 == 0 && d2 > 0.5f)) ? 0 : -width;
            } else {
                int width2 = g.this.getWidth();
                if (f < BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && d2 > 0.5f)) {
                    width2 -= width;
                }
                i = width2;
            }
            this.f669c.a(i, view.getTop());
            g.this.invalidate();
        }

        @Override // android.support.v4.widget.p.a
        public void a(int i, int i2) {
            g.this.postDelayed(this.f670d, 160L);
        }

        void b() {
            View c2;
            int width;
            int b2 = this.f669c.b();
            int i = 0;
            boolean z = this.f668b == 3;
            if (z) {
                c2 = g.this.c(3);
                if (c2 != null) {
                    i = -c2.getWidth();
                }
                width = i + b2;
            } else {
                c2 = g.this.c(5);
                width = g.this.getWidth() - b2;
            }
            if (c2 != null) {
                if (((!z || c2.getLeft() >= width) && (z || c2.getLeft() <= width)) || g.this.a(c2) != 0) {
                    return;
                }
                this.f669c.a(c2, width, c2.getTop());
                ((d) c2.getLayoutParams()).f662c = true;
                g.this.invalidate();
                c();
                g.this.d();
            }
        }

        @Override // android.support.v4.widget.p.a
        public void b(int i, int i2) {
            View c2;
            if ((i & 1) == 1) {
                c2 = g.this.c(3);
            } else {
                c2 = g.this.c(5);
            }
            if (c2 == null || g.this.a(c2) != 0) {
                return;
            }
            this.f669c.a(c2, i2);
        }

        @Override // android.support.v4.widget.p.a
        public int a(View view) {
            if (g.this.g(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // android.support.v4.widget.p.a
        public int a(View view, int i, int i2) {
            if (g.this.a(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i, 0));
            }
            int width = g.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i, width));
        }

        @Override // android.support.v4.widget.p.a
        public int b(View view, int i, int i2) {
            return view.getTop();
        }
    }

    /* compiled from: DrawerLayout.java */
    /* loaded from: classes.dex */
    public static class d extends ViewGroup.MarginLayoutParams {

        /* renamed from: a  reason: collision with root package name */
        public int f660a;

        /* renamed from: b  reason: collision with root package name */
        float f661b;

        /* renamed from: c  reason: collision with root package name */
        boolean f662c;

        /* renamed from: d  reason: collision with root package name */
        int f663d;

        public d(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f660a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f653a);
            this.f660a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }

        public d(int i, int i2) {
            super(i, i2);
            this.f660a = 0;
        }

        public d(d dVar) {
            super((ViewGroup.MarginLayoutParams) dVar);
            this.f660a = 0;
            this.f660a = dVar.f660a;
        }

        public d(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f660a = 0;
        }

        public d(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f660a = 0;
        }
    }

    /* compiled from: DrawerLayout.java */
    /* loaded from: classes.dex */
    class a extends android.support.v4.j.b {

        /* renamed from: c  reason: collision with root package name */
        private final Rect f659c = new Rect();

        a() {
        }

        @Override // android.support.v4.j.b
        public void a(View view, android.support.v4.j.a.a aVar) {
            if (g.f654b) {
                super.a(view, aVar);
            } else {
                android.support.v4.j.a.a a2 = android.support.v4.j.a.a.a(aVar);
                super.a(view, a2);
                aVar.a(view);
                ViewParent d2 = s.d(view);
                if (d2 instanceof View) {
                    aVar.c((View) d2);
                }
                a(aVar, a2);
                a2.s();
                a(aVar, (ViewGroup) view);
            }
            aVar.b(g.class.getName());
            aVar.a(false);
            aVar.b(false);
            aVar.a(a.C0010a.f485a);
            aVar.a(a.C0010a.f486b);
        }

        @Override // android.support.v4.j.b
        public void d(View view, AccessibilityEvent accessibilityEvent) {
            super.d(view, accessibilityEvent);
            accessibilityEvent.setClassName(g.class.getName());
        }

        @Override // android.support.v4.j.b
        public boolean b(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View c2 = g.this.c();
                if (c2 == null) {
                    return true;
                }
                CharSequence b2 = g.this.b(g.this.e(c2));
                if (b2 == null) {
                    return true;
                }
                text.add(b2);
                return true;
            }
            return super.b(view, accessibilityEvent);
        }

        @Override // android.support.v4.j.b
        public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (g.f654b || g.l(view)) {
                return super.a(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        private void a(android.support.v4.j.a.a aVar, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (g.l(childAt)) {
                    aVar.b(childAt);
                }
            }
        }

        private void a(android.support.v4.j.a.a aVar, android.support.v4.j.a.a aVar2) {
            Rect rect = this.f659c;
            aVar2.a(rect);
            aVar.b(rect);
            aVar2.c(rect);
            aVar.d(rect);
            aVar.c(aVar2.g());
            aVar.a(aVar2.o());
            aVar.b(aVar2.p());
            aVar.c(aVar2.r());
            aVar.h(aVar2.l());
            aVar.f(aVar2.j());
            aVar.a(aVar2.e());
            aVar.b(aVar2.f());
            aVar.d(aVar2.h());
            aVar.e(aVar2.i());
            aVar.g(aVar2.k());
            aVar.a(aVar2.b());
        }
    }

    /* compiled from: DrawerLayout.java */
    /* loaded from: classes.dex */
    static final class b extends android.support.v4.j.b {
        b() {
        }

        @Override // android.support.v4.j.b
        public void a(View view, android.support.v4.j.a.a aVar) {
            super.a(view, aVar);
            if (!g.l(view)) {
                aVar.c((View) null);
            }
        }
    }
}
