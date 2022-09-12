package com.google.android.apps.gmm.ugc.post.photo;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class KeyboardObserver implements e {
    public final v<Boolean> a;
    private int b;
    private final z<Boolean> c;
    private final WeakReference<Activity> d;

    public KeyboardObserver(Activity activity) {
        dzvx.c(activity, "activity");
        z<Boolean> zVar = new z<>(false);
        this.c = zVar;
        this.d = new WeakReference<>(activity);
        x xVar = new x();
        xVar.m(zVar, new al(xVar));
        this.a = xVar;
    }

    private final void h(boolean z) {
        Window window;
        View decorView;
        Activity activity = this.d.get();
        ViewTreeObserver viewTreeObserver = null;
        if (activity != null && (window = activity.getWindow()) != null && (decorView = window.getDecorView()) != null) {
            viewTreeObserver = decorView.getViewTreeObserver();
        }
        if (!z) {
            if (viewTreeObserver == null) {
                return;
            }
            viewTreeObserver.removeOnGlobalLayoutListener(new cdvr(new cdvq(this)));
        } else if (viewTreeObserver == null) {
        } else {
            this.b = cdvo.a(activity);
            viewTreeObserver.addOnGlobalLayoutListener(new cdvs(new cdvp(this)));
        }
    }

    @Override // defpackage.f
    public final void a(m mVar) {
    }

    @Override // defpackage.f
    public final void b(m mVar) {
        h(true);
    }

    @Override // defpackage.f
    public final void c(m mVar) {
    }

    @Override // defpackage.f
    public final void d(m mVar) {
    }

    @Override // defpackage.f
    public final void e(m mVar) {
        h(false);
    }

    @Override // defpackage.f
    public final void f(m mVar) {
    }

    public final void g() {
        Activity activity = this.d.get();
        if (activity != null) {
            this.c.f(Boolean.valueOf(cdvo.a(activity) < this.b));
        }
    }
}
