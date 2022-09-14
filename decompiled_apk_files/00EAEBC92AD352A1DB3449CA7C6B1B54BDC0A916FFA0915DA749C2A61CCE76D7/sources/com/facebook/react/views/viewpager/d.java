package com.facebook.react.views.viewpager;

import a.t.a.b;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.f;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class d extends a.t.a.b {
    private final com.facebook.react.uimanager.events.d k0;
    private boolean l0;
    private boolean m0;
    private final Runnable n0;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.measure(View.MeasureSpec.makeMeasureSpec(dVar.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(d.this.getHeight(), 1073741824));
            d dVar2 = d.this;
            dVar2.layout(dVar2.getLeft(), d.this.getTop(), d.this.getRight(), d.this.getBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class b extends a.t.a.a {

        /* renamed from: c  reason: collision with root package name */
        private final List<View> f6409c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f6410d;

        private b() {
            this.f6409c = new ArrayList();
            this.f6410d = false;
        }

        /* synthetic */ b(d dVar, a aVar) {
            this();
        }

        @Override // a.t.a.a
        public int a() {
            return this.f6409c.size();
        }

        @Override // a.t.a.a
        public int a(Object obj) {
            if (this.f6410d || !this.f6409c.contains(obj)) {
                return -2;
            }
            return this.f6409c.indexOf(obj);
        }

        @Override // a.t.a.a
        public Object a(ViewGroup viewGroup, int i) {
            View view = this.f6409c.get(i);
            viewGroup.addView(view, 0, d.this.generateDefaultLayoutParams());
            return view;
        }

        void a(View view, int i) {
            this.f6409c.add(i, view);
            b();
            d.this.setOffscreenPageLimit(this.f6409c.size());
        }

        @Override // a.t.a.a
        public void a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        void a(List<View> list) {
            this.f6409c.clear();
            this.f6409c.addAll(list);
            b();
            this.f6410d = false;
        }

        @Override // a.t.a.a
        public boolean a(View view, Object obj) {
            return view == obj;
        }

        View b(int i) {
            return this.f6409c.get(i);
        }

        void c(int i) {
            this.f6409c.remove(i);
            b();
            d.this.setOffscreenPageLimit(this.f6409c.size());
        }
    }

    /* loaded from: classes.dex */
    private class c implements b.j {
        private c() {
        }

        /* synthetic */ c(d dVar, a aVar) {
            this();
        }

        @Override // a.t.a.b.j
        public void a(int i) {
            String str;
            if (i == 0) {
                str = "idle";
            } else if (i == 1) {
                str = "dragging";
            } else if (i != 2) {
                throw new IllegalStateException("Unsupported pageScrollState");
            } else {
                str = "settling";
            }
            d.this.k0.a(new com.facebook.react.views.viewpager.b(d.this.getId(), str));
        }

        @Override // a.t.a.b.j
        public void a(int i, float f2, int i2) {
            d.this.k0.a(new com.facebook.react.views.viewpager.a(d.this.getId(), i, f2));
        }

        @Override // a.t.a.b.j
        public void b(int i) {
            if (!d.this.l0) {
                d.this.k0.a(new com.facebook.react.views.viewpager.c(d.this.getId(), i));
            }
        }
    }

    public d(ReactContext reactContext) {
        super(reactContext);
        this.m0 = true;
        this.n0 = new a();
        this.k0 = ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher();
        this.l0 = false;
        setOnPageChangeListener(new c(this, null));
        setAdapter(new b(this, null));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i) {
        mo246getAdapter().a(view, i);
    }

    public void b(int i, boolean z) {
        this.l0 = true;
        a(i, z);
        this.l0 = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View d(int i) {
        return mo246getAdapter().b(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(int i) {
        mo246getAdapter().c(i);
    }

    @Override // a.t.a.b
    /* renamed from: getAdapter  reason: collision with other method in class */
    public b mo246getAdapter() {
        return (b) super.mo246getAdapter();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getViewCountInAdapter() {
        return mo246getAdapter().a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a.t.a.b, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        requestLayout();
        post(this.n0);
    }

    @Override // a.t.a.b, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.m0) {
            return false;
        }
        try {
            if (super.onInterceptTouchEvent(motionEvent)) {
                f.a(this, motionEvent);
                return true;
            }
        } catch (IllegalArgumentException e2) {
            c.d.d.e.a.c("ReactNative", "Error intercepting touch event.", e2);
        }
        return false;
    }

    @Override // a.t.a.b, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.m0) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            c.d.d.e.a.c("ReactNative", "Error handling touch event.", e2);
            return false;
        }
    }

    public void setScrollEnabled(boolean z) {
        this.m0 = z;
    }

    public void setViews(List<View> list) {
        mo246getAdapter().a(list);
    }
}
