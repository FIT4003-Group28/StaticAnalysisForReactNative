package com.facebook.react.uimanager.h1;

import android.os.Handler;
import android.os.Looper;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
/* loaded from: classes.dex */
public class e {

    /* renamed from: h  reason: collision with root package name */
    private static Handler f5950h;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5955e;

    /* renamed from: g  reason: collision with root package name */
    private Runnable f5957g;

    /* renamed from: a  reason: collision with root package name */
    private final com.facebook.react.uimanager.h1.a f5951a = new h();

    /* renamed from: b  reason: collision with root package name */
    private final com.facebook.react.uimanager.h1.a f5952b = new k();

    /* renamed from: c  reason: collision with root package name */
    private final com.facebook.react.uimanager.h1.a f5953c = new i();

    /* renamed from: d  reason: collision with root package name */
    private final SparseArray<j> f5954d = new SparseArray<>(0);

    /* renamed from: f  reason: collision with root package name */
    private long f5956f = -1;

    /* loaded from: classes.dex */
    class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Callback f5958b;

        a(e eVar, Callback callback) {
            this.f5958b = callback;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f5958b.invoke(Boolean.TRUE);
        }
    }

    /* loaded from: classes.dex */
    class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f5959a;

        b(int i) {
            this.f5959a = i;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            e.this.f5954d.remove(this.f5959a);
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            e.this.f5954d.put(this.f5959a, (j) animation);
        }
    }

    /* loaded from: classes.dex */
    class c implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f f5961a;

        c(e eVar, f fVar) {
            this.f5961a = fVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f5961a.a();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    private void a(long j) {
        if (f5950h == null) {
            f5950h = new Handler(Looper.getMainLooper());
        }
        Runnable runnable = this.f5957g;
        if (runnable != null) {
            f5950h.removeCallbacks(runnable);
            f5950h.postDelayed(this.f5957g, j);
        }
    }

    private void b(View view) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                b(viewGroup.getChildAt(i));
            }
        }
    }

    public void a() {
        this.f5951a.b();
        this.f5952b.b();
        this.f5953c.b();
        this.f5957g = null;
        this.f5955e = false;
        this.f5956f = -1L;
    }

    public void a(View view, int i, int i2, int i3, int i4) {
        UiThreadUtil.assertOnUiThread();
        int id = view.getId();
        j jVar = this.f5954d.get(id);
        if (jVar != null) {
            jVar.a(i, i2, i3, i4);
            return;
        }
        Animation a2 = ((view.getWidth() == 0 || view.getHeight() == 0) ? this.f5951a : this.f5952b).a(view, i, i2, i3, i4);
        if (a2 instanceof j) {
            a2.setAnimationListener(new b(id));
        } else {
            view.layout(i, i2, i3 + i, i4 + i2);
        }
        if (a2 == null) {
            return;
        }
        long duration = a2.getDuration();
        if (duration > this.f5956f) {
            this.f5956f = duration;
            a(duration);
        }
        view.startAnimation(a2);
    }

    public void a(View view, f fVar) {
        UiThreadUtil.assertOnUiThread();
        Animation a2 = this.f5953c.a(view, view.getLeft(), view.getTop(), view.getWidth(), view.getHeight());
        if (a2 == null) {
            fVar.a();
            return;
        }
        b(view);
        a2.setAnimationListener(new c(this, fVar));
        long duration = a2.getDuration();
        if (duration > this.f5956f) {
            a(duration);
            this.f5956f = duration;
        }
        view.startAnimation(a2);
    }

    public void a(ReadableMap readableMap, Callback callback) {
        if (readableMap == null) {
            a();
            return;
        }
        int i = 0;
        this.f5955e = false;
        if (readableMap.hasKey("duration")) {
            i = readableMap.getInt("duration");
        }
        if (readableMap.hasKey(g.a(g.CREATE))) {
            this.f5951a.a(readableMap.mo210getMap(g.a(g.CREATE)), i);
            this.f5955e = true;
        }
        if (readableMap.hasKey(g.a(g.UPDATE))) {
            this.f5952b.a(readableMap.mo210getMap(g.a(g.UPDATE)), i);
            this.f5955e = true;
        }
        if (readableMap.hasKey(g.a(g.DELETE))) {
            this.f5953c.a(readableMap.mo210getMap(g.a(g.DELETE)), i);
            this.f5955e = true;
        }
        if (!this.f5955e || callback == null) {
            return;
        }
        this.f5957g = new a(this, callback);
    }

    public boolean a(View view) {
        return (this.f5955e && view.getParent() != null) || this.f5954d.get(view.getId()) != null;
    }
}
