package android.support.v4.app;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: OneShotPreDrawListener.java */
/* loaded from: classes.dex */
class ac implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a  reason: collision with root package name */
    private final View f196a;

    /* renamed from: b  reason: collision with root package name */
    private ViewTreeObserver f197b;

    /* renamed from: c  reason: collision with root package name */
    private final Runnable f198c;

    private ac(View view, Runnable runnable) {
        this.f196a = view;
        this.f197b = view.getViewTreeObserver();
        this.f198c = runnable;
    }

    public static ac a(View view, Runnable runnable) {
        ac acVar = new ac(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(acVar);
        view.addOnAttachStateChangeListener(acVar);
        return acVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        a();
        this.f198c.run();
        return true;
    }

    public void a() {
        if (this.f197b.isAlive()) {
            this.f197b.removeOnPreDrawListener(this);
        } else {
            this.f196a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f196a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f197b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
