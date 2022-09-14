package com.th3rdwave.safeareacontext;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import java.util.EnumSet;
import java.util.concurrent.atomic.AtomicBoolean;
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public class g extends com.facebook.react.views.view.f implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: b  reason: collision with root package name */
    private j f10099b;

    /* renamed from: c  reason: collision with root package name */
    private com.th3rdwave.safeareacontext.a f10100c;

    /* renamed from: d  reason: collision with root package name */
    private EnumSet<h> f10101d;

    /* renamed from: e  reason: collision with root package name */
    private View f10102e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ AtomicBoolean f10103b;

        a(g gVar, AtomicBoolean atomicBoolean) {
            this.f10103b = atomicBoolean;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f10103b) {
                this.f10103b.set(true);
                this.f10103b.notify();
            }
        }
    }

    public g(Context context) {
        super(context);
        this.f10099b = j.PADDING;
    }

    private View a() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof e) {
                return (View) parent;
            }
        }
        return this;
    }

    private static ReactContext a(View view) {
        Context context = view.getContext();
        if (!(context instanceof ReactContext) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (ReactContext) context;
    }

    private boolean b() {
        com.th3rdwave.safeareacontext.a b2;
        com.th3rdwave.safeareacontext.a aVar;
        View view = this.f10102e;
        if (view == null || (b2 = f.b(view)) == null || ((aVar = this.f10100c) != null && aVar.a(b2))) {
            return false;
        }
        this.f10100c = b2;
        c();
        return true;
    }

    private void c() {
        if (this.f10100c != null) {
            EnumSet<h> enumSet = this.f10101d;
            if (enumSet == null) {
                enumSet = EnumSet.allOf(h.class);
            }
            i iVar = new i(this.f10100c, this.f10099b, enumSet);
            UIManagerModule uIManagerModule = (UIManagerModule) a(this).getNativeModule(UIManagerModule.class);
            if (uIManagerModule == null) {
                return;
            }
            uIManagerModule.setViewLocalData(getId(), iVar);
            d();
        }
    }

    private void d() {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        long nanoTime = System.nanoTime();
        a(this).runOnNativeModulesQueueThread(new a(this, atomicBoolean));
        synchronized (atomicBoolean) {
            long j = 0;
            while (!atomicBoolean.get() && j < 5000000000L) {
                try {
                    atomicBoolean.wait(5000L);
                } catch (InterruptedException e2) {
                    e2.printStackTrace();
                }
                j = System.nanoTime() - nanoTime;
            }
            if (j >= 5000000000L) {
                Log.w("SafeAreaView", "Timed out waiting for layout.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.f, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f10102e = a();
        this.f10102e.getViewTreeObserver().addOnPreDrawListener(this);
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        View view = this.f10102e;
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f10102e = null;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        boolean b2 = b();
        if (b2) {
            requestLayout();
        }
        return !b2;
    }

    public void setEdges(EnumSet<h> enumSet) {
        this.f10101d = enumSet;
        c();
    }

    public void setMode(j jVar) {
        this.f10099b = jVar;
        c();
    }
}
