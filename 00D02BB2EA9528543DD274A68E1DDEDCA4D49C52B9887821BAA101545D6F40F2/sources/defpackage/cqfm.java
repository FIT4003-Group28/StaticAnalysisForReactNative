package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqfm  reason: default package */
/* loaded from: classes.dex */
public final class cqfm implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final cqjz<?> a;
    public final View b;
    private final cqfd c;
    private ViewTreeObserver d;

    public cqfm(cqfd cqfdVar, cqjz<?> cqjzVar) {
        this.c = cqfdVar;
        this.a = cqjzVar;
        View view = cqjzVar.c;
        this.b = view;
        view.addOnAttachStateChangeListener(this);
        if (view.getWindowToken() != null) {
            onViewAttachedToWindow(null);
        } else {
            onViewDetachedFromWindow(null);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        return this.c.a(this.b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@dzsi View view) {
        ViewTreeObserver viewTreeObserver = this.b.getViewTreeObserver();
        this.d = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@dzsi View view) {
        ViewTreeObserver viewTreeObserver = this.d;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.d.removeOnPreDrawListener(this);
        }
        this.d = null;
    }
}
