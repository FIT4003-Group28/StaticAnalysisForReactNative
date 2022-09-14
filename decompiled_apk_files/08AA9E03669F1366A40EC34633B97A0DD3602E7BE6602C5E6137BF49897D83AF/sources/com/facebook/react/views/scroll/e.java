package com.facebook.react.views.scroll;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v4.j.s;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.facebook.react.bridge.aj;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.r;
import com.google.android.gms.common.api.Api;
import java.lang.reflect.Field;
/* compiled from: ReactScrollView.java */
/* loaded from: classes.dex */
public class e extends ScrollView implements View.OnLayoutChangeListener, ViewGroup.OnHierarchyChangeListener, q {

    /* renamed from: a  reason: collision with root package name */
    private static Field f4029a = null;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f4030b = false;

    /* renamed from: c  reason: collision with root package name */
    private final b f4031c;

    /* renamed from: d  reason: collision with root package name */
    private final OverScroller f4032d;
    private final j e;
    private Rect f;
    private boolean g;
    private boolean h;
    private boolean i;
    private boolean j;
    private boolean k;
    private boolean l;
    private a m;
    private String n;
    private Drawable o;
    private int p;
    private View q;
    private com.facebook.react.views.view.e r;

    public e(aj ajVar, a aVar) {
        super(ajVar);
        this.f4031c = new b();
        this.e = new j();
        this.k = true;
        this.m = null;
        this.p = 0;
        this.m = aVar;
        this.r = new com.facebook.react.views.view.e(this);
        if (!f4030b) {
            f4030b = true;
            try {
                f4029a = ScrollView.class.getDeclaredField("mScroller");
                f4029a.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.w("ReactNative", "Failed to get mScroller field for ScrollView! This app will exhibit the bounce-back scrolling bug :(");
            }
        }
        if (f4029a != null) {
            try {
                Object obj = f4029a.get(this);
                if (obj instanceof OverScroller) {
                    this.f4032d = (OverScroller) obj;
                } else {
                    Log.w("ReactNative", "Failed to cast mScroller field in ScrollView (probably due to OEM changes to AOSP)! This app will exhibit the bounce-back scrolling bug :(");
                    this.f4032d = null;
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to get mScroller from ScrollView!", e);
            }
        } else {
            this.f4032d = null;
        }
        setOnHierarchyChangeListener(this);
        setScrollBarStyle(33554432);
    }

    public void setSendMomentumEvents(boolean z) {
        this.l = z;
    }

    public void setScrollPerfTag(String str) {
        this.n = str;
    }

    public void setScrollEnabled(boolean z) {
        this.k = z;
    }

    public void b() {
        awakenScrollBars();
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        com.facebook.react.uimanager.i.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        scrollTo(getScrollX(), getScrollY());
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.j) {
            a_();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.j) {
            a_();
        }
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (this.f4031c.a(i, i2)) {
            if (this.j) {
                a_();
            }
            if (this.i) {
                this.g = false;
            }
            g.a(this, this.f4031c.a(), this.f4031c.b());
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.k && super.onInterceptTouchEvent(motionEvent)) {
            com.facebook.react.uimanager.events.e.a(this, motionEvent);
            g.a(this);
            this.h = true;
            c();
            return true;
        }
        return false;
    }

    @Override // android.widget.ScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.k) {
            return false;
        }
        this.e.a(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.h) {
            g.b(this, this.e.a(), this.e.b());
            this.h = false;
            d();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.f == null) {
            this.f = new Rect();
        }
        this.j = z;
        a_();
    }

    @Override // com.facebook.react.uimanager.q
    public boolean getRemoveClippedSubviews() {
        return this.j;
    }

    @Override // com.facebook.react.uimanager.q
    public void a_() {
        if (!this.j) {
            return;
        }
        com.facebook.j.a.a.b(this.f);
        r.a(this, this.f);
        View childAt = getChildAt(0);
        if (!(childAt instanceof q)) {
            return;
        }
        ((q) childAt).a_();
    }

    @Override // com.facebook.react.uimanager.q
    public void a(Rect rect) {
        rect.set((Rect) com.facebook.j.a.a.b(this.f));
    }

    @Override // android.widget.ScrollView
    public void fling(int i) {
        if (this.f4032d != null) {
            this.f4032d.fling(getScrollX(), getScrollY(), 0, i, 0, 0, 0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0, ((getHeight() - getPaddingBottom()) - getPaddingTop()) / 2);
            s.a(this);
        } else {
            super.fling(i);
        }
        if (this.l || e()) {
            this.i = true;
            c();
            g.a((ViewGroup) this, 0, i);
            s.a(this, new Runnable() { // from class: com.facebook.react.views.scroll.e.1
                @Override // java.lang.Runnable
                public void run() {
                    if (e.this.g) {
                        e.this.i = false;
                        e.this.d();
                        g.b(e.this);
                        return;
                    }
                    e.this.g = true;
                    s.a(e.this, this, 20L);
                }
            }, 20L);
        }
    }

    private void c() {
        if (e()) {
            com.facebook.j.a.a.b(this.m);
            com.facebook.j.a.a.b(this.n);
            this.m.a(this.n);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (e()) {
            com.facebook.j.a.a.b(this.m);
            com.facebook.j.a.a.b(this.n);
            this.m.b(this.n);
        }
    }

    private boolean e() {
        return (this.m == null || this.n == null || this.n.isEmpty()) ? false : true;
    }

    private int getMaxScrollY() {
        return Math.max(0, this.q.getHeight() - ((getHeight() - getPaddingBottom()) - getPaddingTop()));
    }

    @Override // android.widget.ScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.p != 0) {
            View childAt = getChildAt(0);
            if (this.o != null && childAt != null && childAt.getBottom() < getHeight()) {
                this.o.setBounds(0, childAt.getBottom(), getWidth(), getHeight());
                this.o.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    public void setEndFillColor(int i) {
        if (i != this.p) {
            this.p = i;
            this.o = new ColorDrawable(this.p);
        }
    }

    @Override // android.widget.ScrollView, android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        int maxScrollY;
        if (this.f4032d != null && !this.f4032d.isFinished() && this.f4032d.getCurrY() != this.f4032d.getFinalY() && i2 >= (maxScrollY = getMaxScrollY())) {
            this.f4032d.abortAnimation();
            i2 = maxScrollY;
        }
        super.onOverScrolled(i, i2, z, z2);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        this.q = view2;
        this.q.addOnLayoutChangeListener(this);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
        this.q.removeOnLayoutChangeListener(this);
        this.q = null;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (this.q == null) {
            return;
        }
        int scrollY = getScrollY();
        int maxScrollY = getMaxScrollY();
        if (scrollY <= maxScrollY) {
            return;
        }
        scrollTo(getScrollX(), maxScrollY);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.r.a(i);
    }

    public void a(int i, float f) {
        this.r.a(i, f);
    }

    public void a(int i, float f, float f2) {
        this.r.a(i, f, f2);
    }

    public void setBorderRadius(float f) {
        this.r.a(f);
    }

    public void a(float f, int i) {
        this.r.a(f, i);
    }

    public void setBorderStyle(String str) {
        this.r.a(str);
    }
}
