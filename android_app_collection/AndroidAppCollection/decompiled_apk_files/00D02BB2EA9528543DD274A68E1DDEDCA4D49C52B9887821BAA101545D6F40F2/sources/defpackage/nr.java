package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: nr  reason: default package */
/* loaded from: classes7.dex */
public final class nr implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final View a;
    private ViewTreeObserver b;
    private final Runnable c;

    private nr(View view, Runnable runnable) {
        this.a = view;
        this.b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public final void a() {
        if (this.b.isAlive()) {
            this.b.removeOnPreDrawListener(this);
        } else {
            this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a();
        this.c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        a();
    }

    public static void b(View view, Runnable runnable) {
        if (view != null) {
            if (runnable == null) {
                throw new NullPointerException("runnable == null");
            }
            nr nrVar = new nr(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(nrVar);
            view.addOnAttachStateChangeListener(nrVar);
            return;
        }
        throw new NullPointerException("view == null");
    }
}
