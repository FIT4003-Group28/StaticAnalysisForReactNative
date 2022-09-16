package com.facebook.react.views.scroll;

import a.g.m.v;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.OverScroller;
import com.facebook.react.uimanager.k;
import com.facebook.react.uimanager.t;
import com.facebook.react.uimanager.u;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
/* loaded from: classes.dex */
public class d extends HorizontalScrollView implements t {
    private static Field B = null;
    private static boolean C = false;
    private final Rect A;

    /* renamed from: b  reason: collision with root package name */
    private final b f6207b;

    /* renamed from: c  reason: collision with root package name */
    private final OverScroller f6208c;

    /* renamed from: d  reason: collision with root package name */
    private final j f6209d;

    /* renamed from: e  reason: collision with root package name */
    private final Rect f6210e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f6211f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f6212g;

    /* renamed from: h  reason: collision with root package name */
    private String f6213h;
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
    private boolean s;
    private int t;
    private float u;
    private List<Integer> v;
    private boolean w;
    private boolean x;
    private com.facebook.react.views.view.e y;
    private boolean z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private boolean f6214b = false;

        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (d.this.f6211f) {
                d.this.f6211f = false;
            } else if (!d.this.j || this.f6214b) {
                if (d.this.n) {
                    g.b(d.this);
                }
                d.this.k = null;
                d.this.b();
                return;
            } else {
                this.f6214b = true;
                d.this.a(0);
            }
            v.a(d.this, this, 20L);
        }
    }

    public d(Context context, com.facebook.react.views.scroll.a aVar) {
        super(context);
        this.f6207b = new b();
        this.f6209d = new j();
        this.f6210e = new Rect();
        this.f6213h = "hidden";
        this.j = false;
        this.m = true;
        this.o = null;
        this.r = 0;
        this.s = false;
        this.t = 0;
        this.u = 0.985f;
        this.w = true;
        this.x = true;
        this.z = false;
        this.A = new Rect();
        this.y = new com.facebook.react.views.view.e(this);
        this.o = aVar;
        this.f6208c = getOverScrollerFromParent();
    }

    private int a(View view) {
        view.getDrawingRect(this.A);
        offsetDescendantRectToMyCoords(view, this.A);
        return computeScrollDeltaToGetChildRectOnScreen(this.A);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        int i2;
        int min;
        int i3;
        int floor;
        int i4;
        if (getChildCount() <= 0) {
            return;
        }
        if (this.t == 0 && this.v == null) {
            c(i);
            return;
        }
        int max = Math.max(0, computeHorizontalScrollRange() - getWidth());
        int b2 = b(i);
        if (this.s) {
            b2 = getScrollX();
        }
        int width = (getWidth() - v.u(this)) - v.t(this);
        boolean z = a.g.l.f.b(Locale.getDefault()) == 1;
        if (z) {
            b2 = max - b2;
            i2 = -i;
        } else {
            i2 = i;
        }
        List<Integer> list = this.v;
        if (list != null) {
            int intValue = list.get(0).intValue();
            List<Integer> list2 = this.v;
            i3 = list2.get(list2.size() - 1).intValue();
            int i5 = max;
            floor = 0;
            for (int i6 = 0; i6 < this.v.size(); i6++) {
                int intValue2 = this.v.get(i6).intValue();
                if (intValue2 <= b2 && b2 - intValue2 < b2 - floor) {
                    floor = intValue2;
                }
                if (intValue2 >= b2 && intValue2 - b2 < i5 - b2) {
                    i5 = intValue2;
                }
            }
            i4 = intValue;
            min = i5;
        } else {
            double snapInterval = getSnapInterval();
            double d2 = b2 / snapInterval;
            min = Math.min((int) (Math.ceil(d2) * snapInterval), max);
            i3 = max;
            floor = (int) (Math.floor(d2) * snapInterval);
            i4 = 0;
        }
        int i7 = b2 - floor;
        int i8 = min - b2;
        int i9 = i7 < i8 ? floor : min;
        int scrollX = getScrollX();
        if (z) {
            scrollX = max - scrollX;
        }
        if (!this.x && b2 >= i3) {
            if (scrollX < i3) {
                i9 = i3;
            }
            i9 = b2;
        } else if (!this.w && b2 <= i4) {
            if (scrollX > i4) {
                i9 = i4;
            }
            i9 = b2;
        } else if (i2 > 0) {
            i2 += (int) (i8 * 10.0d);
            i9 = min;
        } else if (i2 < 0) {
            i2 -= (int) (i7 * 10.0d);
            i9 = floor;
        }
        int min2 = Math.min(Math.max(0, i9), max);
        if (z) {
            min2 = max - min2;
            i2 = -i2;
        }
        OverScroller overScroller = this.f6208c;
        if (overScroller == null) {
            smoothScrollTo(min2, getScrollY());
            return;
        }
        this.f6211f = true;
        overScroller.fling(getScrollX(), getScrollY(), i2 != 0 ? i2 : min2 - getScrollX(), 0, min2, min2, 0, 0, (min2 == 0 || min2 == max) ? width / 2 : 0, 0);
        postInvalidateOnAnimation();
    }

    private void a(int i, int i2) {
        if ((this.n || this.j || d()) && this.k == null) {
            if (this.n) {
                g.a((ViewGroup) this, i, i2);
            }
            this.f6211f = false;
            this.k = new a();
            v.a(this, this.k, 20L);
        }
    }

    private int b(int i) {
        OverScroller overScroller = new OverScroller(getContext());
        overScroller.setFriction(1.0f - this.u);
        overScroller.fling(getScrollX(), getScrollY(), i, 0, 0, Math.max(0, computeHorizontalScrollRange() - getWidth()), 0, 0, ((getWidth() - v.u(this)) - v.t(this)) / 2, 0);
        return overScroller.getFinalX();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (d()) {
            c.d.k.a.a.a(this.o);
            c.d.k.a.a.a(this.p);
            this.o.b(this.p);
        }
    }

    private boolean b(View view) {
        int a2 = a(view);
        view.getDrawingRect(this.A);
        return a2 != 0 && Math.abs(a2) < this.A.width() / 2;
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
        double scrollX = getScrollX();
        double d2 = scrollX / snapInterval;
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
        if (d3 != scrollX) {
            this.f6211f = true;
            smoothScrollTo((int) d3, getScrollY());
        }
    }

    private boolean c(View view) {
        int a2 = a(view);
        view.getDrawingRect(this.A);
        return a2 != 0 && Math.abs(a2) < this.A.width();
    }

    private void d(int i) {
        int width = getWidth();
        int scrollX = getScrollX();
        int i2 = scrollX / width;
        if (scrollX % width != 0) {
            i2++;
        }
        int i3 = i == 17 ? i2 - 1 : i2 + 1;
        if (i3 < 0) {
            i3 = 0;
        }
        smoothScrollTo(i3 * width, getScrollY());
        a(0, 0);
    }

    private boolean d() {
        String str;
        return (this.o == null || (str = this.p) == null || str.isEmpty()) ? false : true;
    }

    private boolean d(View view) {
        return a(view) == 0;
    }

    private void e(View view) {
        int a2 = a(view);
        if (a2 != 0) {
            scrollBy(a2, 0);
        }
    }

    private OverScroller getOverScrollerFromParent() {
        if (!C) {
            C = true;
            try {
                B = HorizontalScrollView.class.getDeclaredField("mScroller");
                B.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.w("ReactNative", "Failed to get mScroller field for HorizontalScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        Field field = B;
        OverScroller overScroller = null;
        if (field != null) {
            try {
                Object obj = field.get(this);
                if (obj instanceof OverScroller) {
                    overScroller = (OverScroller) obj;
                } else {
                    Log.w("ReactNative", "Failed to cast mScroller field in HorizontalScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                }
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Failed to get mScroller from HorizontalScrollView!", e2);
            }
        }
        return overScroller;
    }

    private int getSnapInterval() {
        int i = this.t;
        return i != 0 ? i : getWidth();
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

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i, int i2) {
        if (!this.j || this.z) {
            super.addFocusables(arrayList, i, i2);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        super.addFocusables(arrayList2, i, i2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            View view = (View) it.next();
            if (d(view) || c(view) || view.isFocused()) {
                arrayList.add(view);
            }
        }
    }

    @Override // android.widget.HorizontalScrollView
    public boolean arrowScroll(int i) {
        if (this.j) {
            boolean z = true;
            this.z = true;
            if (getChildCount() > 0) {
                View findNextFocus = FocusFinder.getInstance().findNextFocus(this, findFocus(), i);
                View childAt = getChildAt(0);
                if (childAt == null || findNextFocus == null || findNextFocus.getParent() != childAt) {
                    d(i);
                } else {
                    if (!d(findNextFocus) && !b(findNextFocus)) {
                        d(i);
                    }
                    findNextFocus.requestFocus();
                }
            } else {
                z = false;
            }
            this.z = false;
            return z;
        }
        return super.arrowScroll(i);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.r != 0) {
            View childAt = getChildAt(0);
            if (this.q != null && childAt != null && childAt.getRight() < getWidth()) {
                this.q.setBounds(childAt.getRight(), 0, getWidth(), getHeight());
                this.q.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean executeKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (this.m || !(keyCode == 21 || keyCode == 22)) {
            return super.executeKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i) {
        int abs = (int) (Math.abs(i) * Math.signum(this.f6207b.a()));
        if (this.j) {
            a(abs);
        } else if (this.f6208c != null) {
            this.f6208c.fling(getScrollX(), getScrollY(), abs, 0, 0, Integer.MAX_VALUE, 0, 0, ((getWidth() - v.u(this)) - v.t(this)) / 2, 0);
            v.M(this);
        } else {
            super.fling(abs);
        }
        a(abs, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean getChildVisibleRect(View view, Rect rect, Point point) {
        return com.facebook.react.b0.a.i ? u.a(view, rect, point, this, this.f6213h) : super.getChildVisibleRect(view, rect, point);
    }

    @Override // com.facebook.react.uimanager.t
    public void getClippingRect(Rect rect) {
        Rect rect2 = this.f6212g;
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

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        getDrawingRect(this.f6210e);
        String str = this.f6213h;
        if (((str.hashCode() == 466743410 && str.equals("visible")) ? (char) 0 : (char) 65535) != 0) {
            canvas.clipRect(this.f6210e);
        }
        super.onDraw(canvas);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
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

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        scrollTo(getScrollX(), getScrollY());
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        k.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int computeHorizontalScrollRange;
        OverScroller overScroller = this.f6208c;
        if (overScroller != null && !overScroller.isFinished() && this.f6208c.getCurrX() != this.f6208c.getFinalX() && i >= (computeHorizontalScrollRange = computeHorizontalScrollRange() - getWidth())) {
            this.f6208c.abortAnimation();
            i = computeHorizontalScrollRange;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f6211f = true;
        if (this.f6207b.a(i, i2)) {
            if (this.l) {
                updateClippingRect();
            }
            g.b(this, this.f6207b.a(), this.f6207b.b());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.l) {
            updateClippingRect();
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.m) {
            return false;
        }
        this.f6209d.a(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.i) {
            float a2 = this.f6209d.a();
            float b2 = this.f6209d.b();
            g.a(this, a2, b2);
            this.i = false;
            a(Math.round(a2), Math.round(b2));
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView
    public boolean pageScroll(int i) {
        boolean pageScroll = super.pageScroll(i);
        if (this.j && pageScroll) {
            a(0, 0);
        }
        return pageScroll;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (view2 != null && !this.j) {
            e(view2);
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
        this.u = f2;
        OverScroller overScroller = this.f6208c;
        if (overScroller != null) {
            overScroller.setFriction(1.0f - this.u);
        }
    }

    public void setDisableIntervalMomentum(boolean z) {
        this.s = z;
    }

    public void setEndFillColor(int i) {
        if (i != this.r) {
            this.r = i;
            this.q = new ColorDrawable(this.r);
        }
    }

    public void setOverflow(String str) {
        this.f6213h = str;
        invalidate();
    }

    public void setPagingEnabled(boolean z) {
        this.j = z;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.f6212g == null) {
            this.f6212g = new Rect();
        }
        this.l = z;
        updateClippingRect();
    }

    public void setScrollEnabled(boolean z) {
        this.m = z;
    }

    public void setScrollPerfTag(String str) {
        this.p = str;
    }

    public void setSendMomentumEvents(boolean z) {
        this.n = z;
    }

    public void setSnapInterval(int i) {
        this.t = i;
    }

    public void setSnapOffsets(List<Integer> list) {
        this.v = list;
    }

    public void setSnapToEnd(boolean z) {
        this.x = z;
    }

    public void setSnapToStart(boolean z) {
        this.w = z;
    }

    @Override // com.facebook.react.uimanager.t
    public void updateClippingRect() {
        if (!this.l) {
            return;
        }
        c.d.k.a.a.a(this.f6212g);
        u.a(this, this.f6212g);
        View childAt = getChildAt(0);
        if (!(childAt instanceof t)) {
            return;
        }
        ((t) childAt).updateClippingRect();
    }
}
