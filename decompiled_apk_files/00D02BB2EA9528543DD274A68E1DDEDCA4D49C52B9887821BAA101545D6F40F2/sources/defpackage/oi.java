package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;
/* compiled from: PG */
/* renamed from: oi  reason: default package */
/* loaded from: classes.dex */
public final class oi {
    public final WeakReference<View> a;

    public oi(View view) {
        this.a = new WeakReference<>(view);
    }

    public final void a() {
        View view = this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public final void b(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void c(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().scaleX(f);
        }
    }

    public final void d(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().scaleY(f);
        }
    }

    public final void e(long j) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void f(oj ojVar) {
        View view = this.a.get();
        if (view != null) {
            if (ojVar != null) {
                view.animate().setListener(new og(ojVar));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    public final void g(sg sgVar) {
        View view = this.a.get();
        if (view != null) {
            view.animate().setUpdateListener(sgVar != null ? new oh(sgVar) : null);
        }
    }

    public final void h(float f) {
        View view = this.a.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }
}
