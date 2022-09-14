package a.r;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
/* loaded from: classes.dex */
public class w extends v0 {
    private static final TimeInterpolator N = new DecelerateInterpolator();
    private static final TimeInterpolator O = new AccelerateInterpolator();
    private static final g P = new a();
    private static final g Q = new b();
    private static final g R = new c();
    private static final g S = new d();
    private static final g T = new e();
    private static final g U = new f();
    private g M = U;

    /* loaded from: classes.dex */
    static class a extends h {
        a() {
            super(null);
        }

        @Override // a.r.w.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    static class b extends h {
        b() {
            super(null);
        }

        @Override // a.r.w.g
        public float b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (a.g.m.v.p(viewGroup) != 1) {
                z = false;
            }
            float translationX = view.getTranslationX();
            float width = viewGroup.getWidth();
            return z ? translationX + width : translationX - width;
        }
    }

    /* loaded from: classes.dex */
    static class c extends i {
        c() {
            super(null);
        }

        @Override // a.r.w.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - viewGroup.getHeight();
        }
    }

    /* loaded from: classes.dex */
    static class d extends h {
        d() {
            super(null);
        }

        @Override // a.r.w.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + viewGroup.getWidth();
        }
    }

    /* loaded from: classes.dex */
    static class e extends h {
        e() {
            super(null);
        }

        @Override // a.r.w.g
        public float b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (a.g.m.v.p(viewGroup) != 1) {
                z = false;
            }
            float translationX = view.getTranslationX();
            float width = viewGroup.getWidth();
            return z ? translationX - width : translationX + width;
        }
    }

    /* loaded from: classes.dex */
    static class f extends i {
        f() {
            super(null);
        }

        @Override // a.r.w.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + viewGroup.getHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface g {
        float a(ViewGroup viewGroup, View view);

        float b(ViewGroup viewGroup, View view);
    }

    /* loaded from: classes.dex */
    private static abstract class h implements g {
        private h() {
        }

        /* synthetic */ h(a aVar) {
            this();
        }

        @Override // a.r.w.g
        public float a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }
    }

    /* loaded from: classes.dex */
    private static abstract class i implements g {
        private i() {
        }

        /* synthetic */ i(a aVar) {
            this();
        }

        @Override // a.r.w.g
        public float b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }
    }

    public w(int i2) {
        b(i2);
    }

    private void d(d0 d0Var) {
        int[] iArr = new int[2];
        d0Var.f584b.getLocationOnScreen(iArr);
        d0Var.f583a.put("android:slide:screenPosition", iArr);
    }

    @Override // a.r.v0
    public Animator a(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        if (d0Var2 == null) {
            return null;
        }
        int[] iArr = (int[]) d0Var2.f583a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return f0.a(view, d0Var2, iArr[0], iArr[1], this.M.b(viewGroup, view), this.M.a(viewGroup, view), translationX, translationY, N, this);
    }

    @Override // a.r.v0, a.r.x
    public void a(d0 d0Var) {
        super.a(d0Var);
        d(d0Var);
    }

    @Override // a.r.v0
    public Animator b(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        if (d0Var == null) {
            return null;
        }
        int[] iArr = (int[]) d0Var.f583a.get("android:slide:screenPosition");
        return f0.a(view, d0Var, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.M.b(viewGroup, view), this.M.a(viewGroup, view), O, this);
    }

    public void b(int i2) {
        g gVar;
        if (i2 == 3) {
            gVar = P;
        } else if (i2 == 5) {
            gVar = S;
        } else if (i2 == 48) {
            gVar = R;
        } else if (i2 == 80) {
            gVar = U;
        } else if (i2 == 8388611) {
            gVar = Q;
        } else if (i2 != 8388613) {
            throw new IllegalArgumentException("Invalid slide direction");
        } else {
            gVar = T;
        }
        this.M = gVar;
        v vVar = new v();
        vVar.a(i2);
        a(vVar);
    }

    @Override // a.r.v0, a.r.x
    public void c(d0 d0Var) {
        super.c(d0Var);
        d(d0Var);
    }
}
