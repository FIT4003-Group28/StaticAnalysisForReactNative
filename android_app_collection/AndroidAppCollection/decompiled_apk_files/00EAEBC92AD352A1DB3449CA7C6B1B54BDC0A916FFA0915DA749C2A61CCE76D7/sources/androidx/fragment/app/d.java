package androidx.fragment.app;

import a.g.j.b;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.fragment.app.t;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class d {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a implements b.a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Fragment f1668a;

        a(Fragment fragment) {
            this.f1668a = fragment;
        }

        @Override // a.g.j.b.a
        public void a() {
            if (this.f1668a.j() != null) {
                View j = this.f1668a.j();
                this.f1668a.a((View) null);
                j.clearAnimation();
            }
            this.f1668a.a((Animator) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b implements Animation.AnimationListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1669a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Fragment f1670b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ t.g f1671c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ a.g.j.b f1672d;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f1670b.j() != null) {
                    b.this.f1670b.a((View) null);
                    b bVar = b.this;
                    bVar.f1671c.a(bVar.f1670b, bVar.f1672d);
                }
            }
        }

        b(ViewGroup viewGroup, Fragment fragment, t.g gVar, a.g.j.b bVar) {
            this.f1669a = viewGroup;
            this.f1670b = fragment;
            this.f1671c = gVar;
            this.f1672d = bVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f1669a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ViewGroup f1674a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ View f1675b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ Fragment f1676c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ t.g f1677d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ a.g.j.b f1678e;

        c(ViewGroup viewGroup, View view, Fragment fragment, t.g gVar, a.g.j.b bVar) {
            this.f1674a = viewGroup;
            this.f1675b = view;
            this.f1676c = fragment;
            this.f1677d = gVar;
            this.f1678e = bVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f1674a.endViewTransition(this.f1675b);
            Animator k = this.f1676c.k();
            this.f1676c.a((Animator) null);
            if (k == null || this.f1674a.indexOfChild(this.f1675b) >= 0) {
                return;
            }
            this.f1677d.a(this.f1676c, this.f1678e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0050d {

        /* renamed from: a  reason: collision with root package name */
        public final Animation f1679a;

        /* renamed from: b  reason: collision with root package name */
        public final Animator f1680b;

        C0050d(Animator animator) {
            this.f1679a = null;
            this.f1680b = animator;
            if (animator != null) {
                return;
            }
            throw new IllegalStateException("Animator cannot be null");
        }

        C0050d(Animation animation) {
            this.f1679a = animation;
            this.f1680b = null;
            if (animation != null) {
                return;
            }
            throw new IllegalStateException("Animation cannot be null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class e extends AnimationSet implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        private final ViewGroup f1681b;

        /* renamed from: c  reason: collision with root package name */
        private final View f1682c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1683d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f1684e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f1685f;

        e(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f1685f = true;
            this.f1681b = viewGroup;
            this.f1682c = view;
            addAnimation(animation);
            this.f1681b.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation) {
            this.f1685f = true;
            if (this.f1683d) {
                return !this.f1684e;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f1683d = true;
                a.g.m.s.a(this.f1681b, this);
            }
            return true;
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, Transformation transformation, float f2) {
            this.f1685f = true;
            if (this.f1683d) {
                return !this.f1684e;
            }
            if (!super.getTransformation(j, transformation, f2)) {
                this.f1683d = true;
                a.g.m.s.a(this.f1681b, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1683d || !this.f1685f) {
                this.f1681b.endViewTransition(this.f1682c);
                this.f1684e = true;
                return;
            }
            this.f1685f = false;
            this.f1681b.post(this);
        }
    }

    private static int a(int i, boolean z) {
        if (i == 4097) {
            return z ? a.k.a.fragment_open_enter : a.k.a.fragment_open_exit;
        } else if (i == 4099) {
            return z ? a.k.a.fragment_fade_enter : a.k.a.fragment_fade_exit;
        } else if (i != 8194) {
            return -1;
        } else {
            return z ? a.k.a.fragment_close_enter : a.k.a.fragment_close_exit;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C0050d a(Context context, androidx.fragment.app.e eVar, Fragment fragment, boolean z) {
        int a2;
        int u = fragment.u();
        int t = fragment.t();
        boolean z2 = false;
        fragment.b(0);
        View a3 = eVar.a(fragment.x);
        if (a3 != null && a3.getTag(a.k.b.visible_removing_fragment_view_tag) != null) {
            a3.setTag(a.k.b.visible_removing_fragment_view_tag, null);
        }
        ViewGroup viewGroup = fragment.G;
        if (viewGroup == null || viewGroup.getLayoutTransition() == null) {
            Animation a4 = fragment.a(u, z, t);
            if (a4 != null) {
                return new C0050d(a4);
            }
            Animator b2 = fragment.b(u, z, t);
            if (b2 != null) {
                return new C0050d(b2);
            }
            if (t != 0) {
                boolean equals = "anim".equals(context.getResources().getResourceTypeName(t));
                if (equals) {
                    try {
                        Animation loadAnimation = AnimationUtils.loadAnimation(context, t);
                        if (loadAnimation != null) {
                            return new C0050d(loadAnimation);
                        }
                        z2 = true;
                    } catch (Resources.NotFoundException e2) {
                        throw e2;
                    } catch (RuntimeException unused) {
                    }
                }
                if (!z2) {
                    try {
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, t);
                        if (loadAnimator != null) {
                            return new C0050d(loadAnimator);
                        }
                    } catch (RuntimeException e3) {
                        if (equals) {
                            throw e3;
                        }
                        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, t);
                        if (loadAnimation2 != null) {
                            return new C0050d(loadAnimation2);
                        }
                    }
                }
            }
            if (u == 0 || (a2 = a(u, z)) < 0) {
                return null;
            }
            return new C0050d(AnimationUtils.loadAnimation(context, a2));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Fragment fragment, C0050d c0050d, t.g gVar) {
        View view = fragment.H;
        ViewGroup viewGroup = fragment.G;
        viewGroup.startViewTransition(view);
        a.g.j.b bVar = new a.g.j.b();
        bVar.a(new a(fragment));
        gVar.b(fragment, bVar);
        Animation animation = c0050d.f1679a;
        if (animation != null) {
            e eVar = new e(animation, viewGroup, view);
            fragment.a(fragment.H);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, bVar));
            fragment.H.startAnimation(eVar);
            return;
        }
        Animator animator = c0050d.f1680b;
        fragment.a(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, bVar));
        animator.setTarget(fragment.H);
        animator.start();
    }
}
