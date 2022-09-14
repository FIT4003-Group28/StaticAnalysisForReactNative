package com.facebook.react.views.scroll;

import a.g.m.v;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.u;
import java.lang.reflect.Field;
import java.util.List;
/* loaded from: classes.dex */
public class e extends ScrollView implements t, ViewGroup.OnHierarchyChangeListener, View.OnLayoutChangeListener {
    private static boolean A = false;
    private static Field z;

    /* renamed from: b  reason: collision with root package name */
    private final b f6216b;

    /* renamed from: c  reason: collision with root package name */
    private final OverScroller f6217c;

    /* renamed from: d  reason: collision with root package name */
    private final j f6218d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f6219e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6220f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f6221g;

    /* renamed from: h  reason: collision with root package name */
    private String f6222h;
    private boolean i;
    private boolean j;
    private Runnable k;
    private boolean l;
    private boolean m;
    private boolean n;
    private com.facebook.react.views.scroll.a o;
    private String p;
    private Drawable q;
    private int r;
    private int s;
    private float t;
    private List<Integer> u;
    private boolean v;
    private boolean w;
    private View x;
    private com.facebook.react.views.view.e y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private boolean f6223b = false;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (e.this.f6220f) {
                e.this.f6220f = false;
            } else if (!e.this.j || this.f6223b) {
                if (e.this.n) {
                    g.b(e.this);
                }
                e.this.k = null;
                e.this.b();
                return;
            } else {
                this.f6223b = true;
                e.this.a(0);
            }
            v.a(e.this, this, 20L);
        }
    }

    public e(ReactContext reactContext, com.facebook.react.views.scroll.a aVar) {
        super(reactContext);
        this.f6216b = new b();
        this.f6218d = new j();
        this.f6219e = new Rect();
        this.f6222h = "hidden";
        this.j = false;
        this.m = true;
        this.o = null;
        this.r = 0;
        this.s = 0;
        this.t = 0.985f;
        this.v = true;
        this.w = true;
        this.o = aVar;
        this.y = new com.facebook.react.views.view.e(this);
        this.f6217c = getOverScrollerFromParent();
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        int floor;
        int min;
        int i2;
        int i3;
        int i4;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.s == 0 && this.u == null) {
            c(i);
            return;
        }
        int maxScrollY = getMaxScrollY();
        int b2 = b(i);
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        List<Integer> list = this.u;
        if (list != null) {
            int intValue = list.get(0).intValue();
            List<Integer> list2 = this.u;
            int intValue2 = list2.get(list2.size() - 1).intValue();
            int i5 = maxScrollY;
            int i6 = 0;
            for (int i7 = 0; i7 < this.u.size(); i7++) {
                int intValue3 = this.u.get(i7).intValue();
                if (intValue3 <= b2 && b2 - intValue3 < b2 - i6) {
                    i6 = intValue3;
                }
                if (intValue3 >= b2 && intValue3 - b2 < i5 - b2) {
                    i5 = intValue3;
                }
            }
            i2 = intValue2;
            min = i5;
            int i8 = i6;
            i3 = intValue;
            floor = i8;
        } else {
            double snapInterval = getSnapInterval();
            double d2 = b2 / snapInterval;
            floor = (int) (Math.floor(d2) * snapInterval);
            min = Math.min((int) (Math.ceil(d2) * snapInterval), maxScrollY);
            i2 = maxScrollY;
            i3 = 0;
        }
        int i9 = b2 - floor;
        int i10 = min - b2;
        int i11 = i9 < i10 ? floor : min;
        if (!this.w && b2 >= i2) {
            if (getScrollY() < i2) {
                i4 = i;
                b2 = i2;
            }
            i4 = i;
        } else if (!this.v && b2 <= i3) {
            if (getScrollY() > i3) {
                i4 = i;
                b2 = i3;
            }
            i4 = i;
        } else if (i > 0) {
            i4 = i + ((int) (i10 * 10.0d));
            b2 = min;
        } else if (i < 0) {
            int i12 = floor;
            i4 = i - ((int) (i9 * 10.0d));
            b2 = i12;
        } else {
            i4 = i;
            b2 = i11;
        }
        int min2 = Math.min(Math.max(0, b2), maxScrollY);
        OverScroller overScroller = this.f6217c;
        if (overScroller == null) {
            smoothScrollTo(getScrollX(), min2);
            return;
        }
        this.f6220f = true;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        if (i4 == 0) {
            i4 = min2 - getScrollY();
        }
        overScroller.fling(scrollX, scrollY, 0, i4, 0, 0, min2, min2, 0, (min2 == 0 || min2 == maxScrollY) ? height / 2 : 0);
        postInvalidateOnAnimation();
    }

    private void a(int i, int i2) {
        if ((this.n || this.j || d()) && this.k == null) {
            if (this.n) {
                c();
                g.a((ViewGroup) this, i, i2);
            }
            this.f6220f = false;
            this.k = new a();
            v.a(this, this.k, 20L);
        }
    }

    private void a(View view) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        int computeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (computeScrollDeltaToGetChildRectOnScreen != 0) {
            scrollBy(0, computeScrollDeltaToGetChildRectOnScreen);
        }
    }

    private int b(int i) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.t);
        overScroller.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, getMaxScrollY(), 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
        return overScroller.getFinalY();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (d()) {
            c.d.k.a.a.a(this.o);
            c.d.k.a.a.a(this.p);
            this.o.b(this.p);
        }
    }

    private void c() {
        if (d()) {
            c.d.k.a.a.a(this.o);
            c.d.k.a.a.a(this.p);
            this.o.a(this.p);
        }
    }

    private void c(int i) {
        double snapInterval = getSnapInterval();
        double scrollY = getScrollY();
        double d2 = scrollY / snapInterval;
        int floor = (int) Math.floor(d2);
        int ceil = (int) Math.ceil(d2);
        int round = (int) Math.round(d2);
        int round2 = (int) Math.round(b(i) / snapInterval);
        if (i > 0 && ceil == floor) {
            ceil++;
        } else if (i < 0 && floor == ceil) {
            floor--;
        }
        if (i > 0 && round < ceil && round2 > floor) {
            round = ceil;
        } else if (i < 0 && round > floor && round2 < ceil) {
            round = floor;
        }
        double d3 = round * snapInterval;
        if (d3 != scrollY) {
            this.f6220f = true;
            smoothScrollTo(getScrollX(), (int) d3);
        }
    }

    private boolean d() {
        String str;
        return (this.o == null || (str = this.p) == null || str.isEmpty()) ? false : true;
    }

    private int getMaxScrollY() {
        return Math.max(0, this.x.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    private OverScroller getOverScrollerFromParent() {
        if (!A) {
            A = true;
            try {
                z = ScrollView.class.getDeclaredField("mScroller");
                z.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.w("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = z;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    Log.w("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e2);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i = this.s;
        return i != 0 ? i : getHeight();
    }

    public void a() {
        awakenScrollBars();
    }

    public void a(float f2, int i) {
        this.y.a(f2, i);
    }

    public void a(int i, float f2) {
        this.y.a(i, f2);
    }

    public void a(int i, float f2, float f3) {
        this.y.a(i, f2, f3);
    }

    @Override // android.widget.ScrollView, android.view.View
    public void draw(Canvas canvas) {
        char c2 = 0;
        if (this.r != 0) {
            View childAt = getChildAt(0);
            if (this.q != null && childAt != null && childAt.getBottom() < getHeight()) {
                this.q.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.q.draw(canvas);
            }
        }
        getDrawingRect(this.f6219e);
        String str = this.f6222h;
        if (str.hashCode() != 466743410 || !str.equals("visible")) {
            c2 = 65535;
        }
        if (c2 != 0) {
            canvas.clipRect(this.f6219e);
        }
        super.draw(canvas);
    }

    @Override // android.widget.ScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.m || !(keyCode == 19 || keyCode == 20)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        float signum = Math.signum(this.f6216b.b());
        if (signum == 0.0f) {
            signum = Math.signum(i);
        }
        int abs = (int) (Math.abs(i) * signum);
        if (this.j) {
            a(abs);
        } else if (this.f6217c != null) {
            this.f6217c.fling(getScrollX(), getScrollY(), 0, abs, 0, 0, 0, Integer.MAX_VALUE, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            v.M(this);
        } else {
            super.fling(abs);
        }
        a(0, abs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return com.facebook.react.b0.a.i ? u.a(view, rect, point, this, this.f6222h) : super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.t
    public void getClippingRect(Rect rect) {
        Rect rect2 = this.f6221g;
        c.d.k.a.a.a(rect2);
        rect.set(rect2);
    }

    @Override // com.facebook.react.uimanager.t
    public boolean getRemoveClippedSubviews() {
        return this.l;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.l) {
            updateClippingRect();
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.x = view2;
        this.x.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        this.x.removeOnLayoutChangeListener(this);
        this.x = null;
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.m) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                com.facebook.react.uimanager.events.f.a(this, motionEvent);
                g.a(this);
                this.i = true;
                c();
                return true;
            }
        } catch (IllegalArgumentException e2) {
            Log.w("ReactNative", "Error intercepting touch event.", e2);
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        scrollTo(getScrollX(), getScrollY());
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.x == null) {
            return;
        }
        int scrollY = getScrollY();
        int maxScrollY = getMaxScrollY();
        if (scrollY <= maxScrollY) {
            return;
        }
        scrollTo(getScrollX(), maxScrollY);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        k.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z2, boolean z3) {
        int maxScrollY;
        OverScroller overScroller = this.f6217c;
        if (overScroller != null && this.x != null && !overScroller.isFinished() && this.f6217c.getCurrY() != this.f6217c.getFinalY() && i2 >= (maxScrollY = getMaxScrollY())) {
            this.f6217c.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z2, z3);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f6220f = true;
        if (this.f6216b.a(i, i2)) {
            if (this.l) {
                updateClippingRect();
            }
            g.b(this, this.f6216b.a(), this.f6216b.b());
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.l) {
            updateClippingRect();
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.m) {
            return false;
        }
        this.f6218d.a(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.i) {
            float a2 = this.f6218d.a();
            float b2 = this.f6218d.b();
            g.a(this, a2, b2);
            this.i = false;
            a(Math.round(a2), Math.round(b2));
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null) {
            a(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.y.a(i);
    }

    public void setBorderRadius(float f2) {
        this.y.a(f2);
    }

    public void setBorderStyle(String str) {
        this.y.a(str);
    }

    public void setDecelerationRate(float f2) {
        this.t = f2;
        OverScroller overScroller = this.f6217c;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - this.t);
        }
    }

    public void setEndFillColor(int i) {
        if (i != this.r) {
            this.r = i;
            this.q = new ColorDrawable(this.r);
        }
    }

    public void setOverflow(String str) {
        this.f6222h = str;
        invalidate();
    }

    public void setPagingEnabled(boolean z2) {
        this.j = z2;
    }

    public void setRemoveClippedSubviews(boolean z2) {
        if (z2 && this.f6221g == null) {
            this.f6221g = new Rect();
        }
        this.l = z2;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z2) {
        this.m = z2;
    }

    public void setScrollPerfTag(String str) {
        this.p = str;
    }

    public void setSendMomentumEvents(boolean z2) {
        this.n = z2;
    }

    public void setSnapInterval(int i) {
        this.s = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.u = list;
    }

    public void setSnapToEnd(boolean z2) {
        this.w = z2;
    }

    public void setSnapToStart(boolean z2) {
        this.v = z2;
    }

    @Override // com.facebook.react.uimanager.t
    public void updateClippingRect() {
        if (!this.l) {
            return;
        }
        c.d.k.a.a.a(this.f6221g);
        u.a(this, this.f6221g);
        View childAt = getChildAt(0);
        if (!(childAt instanceof t)) {
            return;
        }
        ((t) childAt).updateClippingRect();
    }
}
