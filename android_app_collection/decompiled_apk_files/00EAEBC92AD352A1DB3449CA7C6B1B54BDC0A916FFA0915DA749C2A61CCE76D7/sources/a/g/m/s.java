package a.g.m;

import android.view.View;
import android.view.ViewTreeObserver;
/* loaded from: classes.dex */
public final class s implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: b  reason: collision with root package name */
    private final View f373b;

    /* renamed from: c  reason: collision with root package name */
    private ViewTreeObserver f374c;

    /* renamed from: d  reason: collision with root package name */
    private final Runnable f375d;

    private s(View view, Runnable runnable) {
        this.f373b = view;
        this.f374c = view.getViewTreeObserver();
        this.f375d = runnable;
    }

    public static s a(View view, Runnable runnable) {
        if (view != null) {
            if (runnable == null) {
                throw new NullPointerException("runnable == null");
            }
            s sVar = new s(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(sVar);
            view.addOnAttachStateChangeListener(sVar);
            return sVar;
        }
        throw new NullPointerException("view == null");
    }

    public void a() {
        (this.f374c.isAlive() ? this.f374c : this.f373b.getViewTreeObserver()).removeOnPreDrawListener(this);
        this.f373b.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        a();
        this.f375d.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f374c = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a();
    }
}
