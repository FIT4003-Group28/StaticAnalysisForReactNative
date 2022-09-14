package com.facebook.react.views.scroll;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import com.facebook.react.uimanager.q;
import com.facebook.react.uimanager.r;
/* compiled from: ReactHorizontalScrollView.java */
/* loaded from: classes.dex */
public class d extends HorizontalScrollView implements q {

    /* renamed from: a  reason: collision with root package name */
    private final b f4023a;

    /* renamed from: b  reason: collision with root package name */
    private final j f4024b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f4025c;

    /* renamed from: d  reason: collision with root package name */
    private Rect f4026d;
    private boolean e;
    private boolean f;
    private Runnable g;
    private boolean h;
    private boolean i;
    private boolean j;
    private a k;
    private String l;
    private Drawable m;
    private int n;
    private int o;
    private com.facebook.react.views.view.e p;

    public d(Context context, a aVar) {
        super(context);
        this.f4023a = new b();
        this.f4024b = new j();
        this.f = false;
        this.i = true;
        this.k = null;
        this.n = 0;
        this.o = 0;
        this.p = new com.facebook.react.views.view.e(this);
        this.k = aVar;
    }

    public void setScrollPerfTag(String str) {
        this.l = str;
    }

    public void setRemoveClippedSubviews(boolean z) {
        if (z && this.f4026d == null) {
            this.f4026d = new Rect();
        }
        this.h = z;
        a_();
    }

    @Override // com.facebook.react.uimanager.q
    public boolean getRemoveClippedSubviews() {
        return this.h;
    }

    public void setSendMomentumEvents(boolean z) {
        this.j = z;
    }

    public void setScrollEnabled(boolean z) {
        this.i = z;
    }

    public void setPagingEnabled(boolean z) {
        this.f = z;
    }

    public void setSnapInterval(int i) {
        this.o = i;
    }

    public void b() {
        awakenScrollBars();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        com.facebook.react.uimanager.i.a(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        scrollTo(getScrollX(), getScrollY());
    }

    @Override // android.view.View
    protected void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        this.f4025c = true;
        if (this.f4023a.a(i, i2)) {
            if (this.h) {
                a_();
            }
            g.a(this, this.f4023a.a(), this.f4023a.b());
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.i && super.onInterceptTouchEvent(motionEvent)) {
            com.facebook.react.uimanager.events.e.a(this, motionEvent);
            g.a(this);
            this.e = true;
            c();
            return true;
        }
        return false;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.i) {
            return false;
        }
        this.f4024b.a(motionEvent);
        if ((motionEvent.getAction() & 255) == 1 && this.e) {
            float a2 = this.f4024b.a();
            float b2 = this.f4024b.b();
            g.b(this, a2, b2);
            this.e = false;
            a(Math.round(a2), Math.round(b2));
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.widget.HorizontalScrollView
    public void fling(int i) {
        if (this.f) {
            a(i);
        } else {
            super.fling(i);
        }
        a(i, 0);
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.h) {
            a_();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.h) {
            a_();
        }
    }

    @Override // com.facebook.react.uimanager.q
    public void a_() {
        if (!this.h) {
            return;
        }
        com.facebook.j.a.a.b(this.f4026d);
        r.a(this, this.f4026d);
        View childAt = getChildAt(0);
        if (!(childAt instanceof q)) {
            return;
        }
        ((q) childAt).a_();
    }

    @Override // com.facebook.react.uimanager.q
    public void a(Rect rect) {
        rect.set((Rect) com.facebook.j.a.a.b(this.f4026d));
    }

    private int getSnapInterval() {
        if (this.o != 0) {
            return this.o;
        }
        return getWidth();
    }

    public void setEndFillColor(int i) {
        if (i != this.n) {
            this.n = i;
            this.m = new ColorDrawable(this.n);
        }
    }

    private void c() {
        if (e()) {
            com.facebook.j.a.a.b(this.k);
            com.facebook.j.a.a.b(this.l);
            this.k.a(this.l);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (e()) {
            com.facebook.j.a.a.b(this.k);
            com.facebook.j.a.a.b(this.l);
            this.k.b(this.l);
        }
    }

    private boolean e() {
        return (this.k == null || this.l == null || this.l.isEmpty()) ? false : true;
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    public void draw(Canvas canvas) {
        if (this.n != 0) {
            View childAt = getChildAt(0);
            if (this.m != null && childAt != null && childAt.getRight() < getWidth()) {
                this.m.setBounds(childAt.getRight(), 0, getWidth(), getHeight());
                this.m.draw(canvas);
            }
        }
        super.draw(canvas);
    }

    @TargetApi(16)
    private void a(int i, int i2) {
        if ((this.j || this.f || e()) && this.g == null) {
            if (this.j) {
                g.a((ViewGroup) this, i, i2);
            }
            this.f4025c = false;
            this.g = new Runnable() { // from class: com.facebook.react.views.scroll.d.1

                /* renamed from: b  reason: collision with root package name */
                private boolean f4028b = false;

                @Override // java.lang.Runnable
                public void run() {
                    if (d.this.f4025c) {
                        d.this.f4025c = false;
                        d.this.postOnAnimationDelayed(this, 20L);
                    } else if (!d.this.f || this.f4028b) {
                        if (d.this.j) {
                            g.b(d.this);
                        }
                        d.this.g = null;
                        d.this.d();
                    } else {
                        this.f4028b = true;
                        d.this.a(0);
                        d.this.postOnAnimationDelayed(this, 20L);
                    }
                }
            };
            postOnAnimationDelayed(this.g, 20L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        int snapInterval = getSnapInterval();
        int scrollX = getScrollX();
        int i2 = i + scrollX;
        int i3 = scrollX / snapInterval;
        if (i2 > (i3 * snapInterval) + (snapInterval / 2)) {
            i3++;
        }
        smoothScrollTo(i3 * snapInterval, getScrollY());
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        this.p.a(i);
    }

    public void a(int i, float f) {
        this.p.a(i, f);
    }

    public void a(int i, float f, float f2) {
        this.p.a(i, f, f2);
    }

    public void setBorderRadius(float f) {
        this.p.a(f);
    }

    public void a(float f, int i) {
        this.p.a(f, i);
    }

    public void setBorderStyle(String str) {
        this.p.a(str);
    }
}
