package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqfl  reason: default package */
/* loaded from: classes.dex */
public final class cqfl implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final cqfc a;
    private final cqjz<?> b;
    private final View c;
    private final boolean d;
    private ViewTreeObserver e;

    public cqfl(cqfc cqfcVar, cqjz<?> cqjzVar) {
        this.a = cqfcVar;
        this.b = cqjzVar;
        View view = cqjzVar.c;
        this.c = view;
        view.addOnAttachStateChangeListener(this);
        if (view.getWindowToken() != null) {
            onViewAttachedToWindow(null);
            this.d = true;
            return;
        }
        onViewDetachedFromWindow(null);
        this.d = false;
    }

    public final void a() {
        this.c.removeOnAttachStateChangeListener(this);
        onViewDetachedFromWindow(null);
        this.b.n(cqfp.c, null);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        a();
        this.a.a(this.c, !this.d);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@dzsi View view) {
        ViewTreeObserver viewTreeObserver = this.c.getViewTreeObserver();
        this.e = viewTreeObserver;
        viewTreeObserver.addOnPreDrawListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@dzsi View view) {
        ViewTreeObserver viewTreeObserver = this.e;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            this.e.removeOnPreDrawListener(this);
        }
        this.e = null;
    }
}
