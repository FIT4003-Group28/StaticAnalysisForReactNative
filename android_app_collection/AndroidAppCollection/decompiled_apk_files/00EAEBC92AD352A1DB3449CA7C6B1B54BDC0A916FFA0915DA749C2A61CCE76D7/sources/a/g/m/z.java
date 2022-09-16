package a.g.m;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<View> f395a;

    /* renamed from: b  reason: collision with root package name */
    Runnable f396b = null;

    /* renamed from: c  reason: collision with root package name */
    Runnable f397c = null;

    /* renamed from: d  reason: collision with root package name */
    int f398d = -1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a0 f399a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f400b;

        a(z zVar, a0 a0Var, View view) {
            this.f399a = a0Var;
            this.f400b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f399a.a(this.f400b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f399a.b(this.f400b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f399a.c(this.f400b);
        }
    }

    /* loaded from: classes.dex */
    class b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c0 f401a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f402b;

        b(z zVar, c0 c0Var, View view) {
            this.f401a = c0Var;
            this.f402b = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f401a.a(this.f402b);
        }
    }

    /* loaded from: classes.dex */
    static class c implements a0 {

        /* renamed from: a  reason: collision with root package name */
        z f403a;

        /* renamed from: b  reason: collision with root package name */
        boolean f404b;

        c(z zVar) {
            this.f403a = zVar;
        }

        @Override // a.g.m.a0
        public void a(View view) {
            Object tag = view.getTag(2113929216);
            a0 a0Var = tag instanceof a0 ? (a0) tag : null;
            if (a0Var != null) {
                a0Var.a(view);
            }
        }

        @Override // a.g.m.a0
        @SuppressLint({"WrongConstant"})
        public void b(View view) {
            int i = this.f403a.f398d;
            a0 a0Var = null;
            if (i > -1) {
                view.setLayerType(i, null);
                this.f403a.f398d = -1;
            }
            if (Build.VERSION.SDK_INT >= 16 || !this.f404b) {
                z zVar = this.f403a;
                Runnable runnable = zVar.f397c;
                if (runnable != null) {
                    zVar.f397c = null;
                    runnable.run();
                }
                Object tag = view.getTag(2113929216);
                if (tag instanceof a0) {
                    a0Var = (a0) tag;
                }
                if (a0Var != null) {
                    a0Var.b(view);
                }
                this.f404b = true;
            }
        }

        @Override // a.g.m.a0
        public void c(View view) {
            this.f404b = false;
            a0 a0Var = null;
            if (this.f403a.f398d > -1) {
                view.setLayerType(2, null);
            }
            z zVar = this.f403a;
            Runnable runnable = zVar.f396b;
            if (runnable != null) {
                zVar.f396b = null;
                runnable.run();
            }
            Object tag = view.getTag(2113929216);
            if (tag instanceof a0) {
                a0Var = (a0) tag;
            }
            if (a0Var != null) {
                a0Var.c(view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public z(View view) {
        this.f395a = new WeakReference<>(view);
    }

    private void a(View view, a0 a0Var) {
        if (a0Var != null) {
            view.animate().setListener(new a(this, a0Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public z a(float f2) {
        View view = this.f395a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public z a(long j) {
        View view = this.f395a.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
        return this;
    }

    public z a(a0 a0Var) {
        View view = this.f395a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, a0Var);
                a0Var = new c(this);
            }
            a(view, a0Var);
        }
        return this;
    }

    public z a(c0 c0Var) {
        View view = this.f395a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            b bVar = null;
            if (c0Var != null) {
                bVar = new b(this, c0Var, view);
            }
            view.animate().setUpdateListener(bVar);
        }
        return this;
    }

    public z a(Interpolator interpolator) {
        View view = this.f395a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public void a() {
        View view = this.f395a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long b() {
        View view = this.f395a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public z b(float f2) {
        View view = this.f395a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }

    public z b(long j) {
        View view = this.f395a.get();
        if (view != null) {
            view.animate().setStartDelay(j);
        }
        return this;
    }

    public void c() {
        View view = this.f395a.get();
        if (view != null) {
            view.animate().start();
        }
    }
}
