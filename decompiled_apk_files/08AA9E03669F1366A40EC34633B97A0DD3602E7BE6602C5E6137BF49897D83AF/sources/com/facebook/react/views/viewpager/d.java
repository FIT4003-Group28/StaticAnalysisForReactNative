package com.facebook.react.views.viewpager;

import android.support.v4.j.q;
import android.support.v4.j.u;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.aj;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.events.e;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ReactViewPager.java */
/* loaded from: classes.dex */
public class d extends u {

    /* renamed from: d  reason: collision with root package name */
    private final com.facebook.react.uimanager.events.c f4200d;
    private boolean e;
    private boolean f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReactViewPager.java */
    /* loaded from: classes.dex */
    public class a extends q {

        /* renamed from: b  reason: collision with root package name */
        private final List<View> f4202b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f4203c;

        @Override // android.support.v4.j.q
        public boolean a(View view, Object obj) {
            return view == obj;
        }

        private a() {
            this.f4202b = new ArrayList();
            this.f4203c = false;
        }

        void b(View view, int i) {
            this.f4202b.add(i, view);
            c();
            d.this.setOffscreenPageLimit(this.f4202b.size());
        }

        void b(int i) {
            this.f4202b.remove(i);
            c();
            d.this.setOffscreenPageLimit(this.f4202b.size());
        }

        void a(List<View> list) {
            this.f4202b.clear();
            this.f4202b.addAll(list);
            c();
            this.f4203c = false;
        }

        void a(u uVar) {
            this.f4202b.clear();
            uVar.removeAllViews();
            this.f4203c = true;
        }

        View c(int i) {
            return this.f4202b.get(i);
        }

        @Override // android.support.v4.j.q
        public int a() {
            return this.f4202b.size();
        }

        @Override // android.support.v4.j.q
        public int a(Object obj) {
            if (this.f4203c || !this.f4202b.contains(obj)) {
                return -2;
            }
            return this.f4202b.indexOf(obj);
        }

        @Override // android.support.v4.j.q
        public Object a(ViewGroup viewGroup, int i) {
            View view = this.f4202b.get(i);
            viewGroup.addView(view, 0, d.this.generateDefaultLayoutParams());
            return view;
        }

        @Override // android.support.v4.j.q
        public void a(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }
    }

    /* compiled from: ReactViewPager.java */
    /* loaded from: classes.dex */
    private class b implements u.f {
        private b() {
        }

        @Override // android.support.v4.j.u.f
        public void a(int i, float f, int i2) {
            d.this.f4200d.a(new com.facebook.react.views.viewpager.a(d.this.getId(), i, f));
        }

        @Override // android.support.v4.j.u.f
        public void a(int i) {
            if (!d.this.e) {
                d.this.f4200d.a(new c(d.this.getId(), i));
            }
        }

        @Override // android.support.v4.j.u.f
        public void b(int i) {
            String str;
            switch (i) {
                case 0:
                    str = "idle";
                    break;
                case 1:
                    str = "dragging";
                    break;
                case 2:
                    str = "settling";
                    break;
                default:
                    throw new IllegalStateException("Unsupported pageScrollState");
            }
            d.this.f4200d.a(new com.facebook.react.views.viewpager.b(d.this.getId(), str));
        }
    }

    public d(aj ajVar) {
        super(ajVar);
        this.f = true;
        this.f4200d = ((UIManagerModule) ajVar.b(UIManagerModule.class)).getEventDispatcher();
        this.e = false;
        setOnPageChangeListener(new b());
        setAdapter(new a());
    }

    @Override // android.support.v4.j.u
    /* renamed from: getAdapter  reason: collision with other method in class */
    public a mo72getAdapter() {
        return (a) super.mo72getAdapter();
    }

    @Override // android.support.v4.j.u, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f && super.onInterceptTouchEvent(motionEvent)) {
            e.a(this, motionEvent);
            return true;
        }
        return false;
    }

    @Override // android.support.v4.j.u, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void b(int i, boolean z) {
        this.e = true;
        a(i, z);
        this.e = false;
    }

    public void setScrollEnabled(boolean z) {
        this.f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(View view, int i) {
        mo72getAdapter().b(view, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(int i) {
        mo72getAdapter().b(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getViewCountInAdapter() {
        return mo72getAdapter().a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View e(int i) {
        return mo72getAdapter().c(i);
    }

    public void setViews(List<View> list) {
        mo72getAdapter().a(list);
    }

    public void f() {
        mo72getAdapter().a((u) this);
    }
}
