package a.r;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public class e extends x {
    private static final String[] N = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};
    private static final Property<C0035e, float[]> O = new a(float[].class, "nonTranslations");
    private static final Property<C0035e, PointF> P = new b(PointF.class, "translations");
    private static final boolean Q;
    boolean K = true;
    private boolean L = true;
    private Matrix M = new Matrix();

    /* loaded from: classes.dex */
    static class a extends Property<C0035e, float[]> {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(C0035e c0035e, float[] fArr) {
            c0035e.a(fArr);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public float[] get(C0035e c0035e) {
            return null;
        }
    }

    /* loaded from: classes.dex */
    static class b extends Property<C0035e, PointF> {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public PointF get(C0035e c0035e) {
            return null;
        }

        @Override // android.util.Property
        /* renamed from: a */
        public void set(C0035e c0035e, PointF pointF) {
            c0035e.a(pointF);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f586a;

        /* renamed from: b  reason: collision with root package name */
        private Matrix f587b = new Matrix();

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ boolean f588c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ Matrix f589d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ View f590e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f f591f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ C0035e f592g;

        c(boolean z, Matrix matrix, View view, f fVar, C0035e c0035e) {
            this.f588c = z;
            this.f589d = matrix;
            this.f590e = view;
            this.f591f = fVar;
            this.f592g = c0035e;
        }

        private void a(Matrix matrix) {
            this.f587b.set(matrix);
            this.f590e.setTag(s.transition_transform, this.f587b);
            this.f591f.a(this.f590e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f586a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f586a) {
                if (!this.f588c || !e.this.K) {
                    this.f590e.setTag(s.transition_transform, null);
                    this.f590e.setTag(s.parent_matrix, null);
                } else {
                    a(this.f589d);
                }
            }
            o0.a(this.f590e, (Matrix) null);
            this.f591f.a(this.f590e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            a(this.f592g.a());
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            e.f(this.f590e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class d extends y {

        /* renamed from: a  reason: collision with root package name */
        private View f594a;

        /* renamed from: b  reason: collision with root package name */
        private i f595b;

        d(View view, i iVar) {
            this.f594a = view;
            this.f595b = iVar;
        }

        @Override // a.r.y, a.r.x.f
        public void c(x xVar) {
            this.f595b.setVisibility(4);
        }

        @Override // a.r.y, a.r.x.f
        public void d(x xVar) {
            this.f595b.setVisibility(0);
        }

        @Override // a.r.x.f
        public void e(x xVar) {
            xVar.mo24b(this);
            m.a(this.f594a);
            this.f594a.setTag(s.transition_transform, null);
            this.f594a.setTag(s.parent_matrix, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a.r.e$e  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static class C0035e {

        /* renamed from: a  reason: collision with root package name */
        private final Matrix f596a = new Matrix();

        /* renamed from: b  reason: collision with root package name */
        private final View f597b;

        /* renamed from: c  reason: collision with root package name */
        private final float[] f598c;

        /* renamed from: d  reason: collision with root package name */
        private float f599d;

        /* renamed from: e  reason: collision with root package name */
        private float f600e;

        C0035e(View view, float[] fArr) {
            this.f597b = view;
            this.f598c = (float[]) fArr.clone();
            float[] fArr2 = this.f598c;
            this.f599d = fArr2[2];
            this.f600e = fArr2[5];
            b();
        }

        private void b() {
            float[] fArr = this.f598c;
            fArr[2] = this.f599d;
            fArr[5] = this.f600e;
            this.f596a.setValues(fArr);
            o0.a(this.f597b, this.f596a);
        }

        Matrix a() {
            return this.f596a;
        }

        void a(PointF pointF) {
            this.f599d = pointF.x;
            this.f600e = pointF.y;
            b();
        }

        void a(float[] fArr) {
            System.arraycopy(fArr, 0, this.f598c, 0, fArr.length);
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        final float f601a;

        /* renamed from: b  reason: collision with root package name */
        final float f602b;

        /* renamed from: c  reason: collision with root package name */
        final float f603c;

        /* renamed from: d  reason: collision with root package name */
        final float f604d;

        /* renamed from: e  reason: collision with root package name */
        final float f605e;

        /* renamed from: f  reason: collision with root package name */
        final float f606f;

        /* renamed from: g  reason: collision with root package name */
        final float f607g;

        /* renamed from: h  reason: collision with root package name */
        final float f608h;

        f(View view) {
            this.f601a = view.getTranslationX();
            this.f602b = view.getTranslationY();
            this.f603c = a.g.m.v.z(view);
            this.f604d = view.getScaleX();
            this.f605e = view.getScaleY();
            this.f606f = view.getRotationX();
            this.f607g = view.getRotationY();
            this.f608h = view.getRotation();
        }

        public void a(View view) {
            e.a(view, this.f601a, this.f602b, this.f603c, this.f604d, this.f605e, this.f606f, this.f607g, this.f608h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return fVar.f601a == this.f601a && fVar.f602b == this.f602b && fVar.f603c == this.f603c && fVar.f604d == this.f604d && fVar.f605e == this.f605e && fVar.f606f == this.f606f && fVar.f607g == this.f607g && fVar.f608h == this.f608h;
        }

        public int hashCode() {
            float f2 = this.f601a;
            int i = 0;
            int floatToIntBits = (f2 != 0.0f ? Float.floatToIntBits(f2) : 0) * 31;
            float f3 = this.f602b;
            int floatToIntBits2 = (floatToIntBits + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f603c;
            int floatToIntBits3 = (floatToIntBits2 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f604d;
            int floatToIntBits4 = (floatToIntBits3 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f605e;
            int floatToIntBits5 = (floatToIntBits4 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f606f;
            int floatToIntBits6 = (floatToIntBits5 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f607g;
            int floatToIntBits7 = (floatToIntBits6 + (f8 != 0.0f ? Float.floatToIntBits(f8) : 0)) * 31;
            float f9 = this.f608h;
            if (f9 != 0.0f) {
                i = Float.floatToIntBits(f9);
            }
            return floatToIntBits7 + i;
        }
    }

    static {
        Q = Build.VERSION.SDK_INT >= 21;
    }

    private ObjectAnimator a(d0 d0Var, d0 d0Var2, boolean z) {
        Matrix matrix = (Matrix) d0Var.f583a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) d0Var2.f583a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = n.f668a;
        }
        if (matrix2 == null) {
            matrix2 = n.f668a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        f fVar = (f) d0Var2.f583a.get("android:changeTransform:transforms");
        View view = d0Var2.f584b;
        f(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C0035e c0035e = new C0035e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(c0035e, PropertyValuesHolder.ofObject(O, new g(new float[9]), fArr, fArr2), r.a(P, g().a(fArr[2], fArr[5], fArr2[2], fArr2[5])));
        c cVar = new c(z, matrix3, view, fVar, c0035e);
        ofPropertyValuesHolder.addListener(cVar);
        a.r.a.a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    static void a(View view, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        view.setTranslationX(f2);
        view.setTranslationY(f3);
        a.g.m.v.b(view, f4);
        view.setScaleX(f5);
        view.setScaleY(f6);
        view.setRotationX(f7);
        view.setRotationY(f8);
        view.setRotation(f9);
    }

    private boolean a(ViewGroup viewGroup, ViewGroup viewGroup2) {
        if (b(viewGroup) && b(viewGroup2)) {
            d0 a2 = a((View) viewGroup, true);
            if (a2 == null || viewGroup2 != a2.f584b) {
                return false;
            }
        } else if (viewGroup != viewGroup2) {
            return false;
        }
        return true;
    }

    private void b(d0 d0Var, d0 d0Var2) {
        Matrix matrix = (Matrix) d0Var2.f583a.get("android:changeTransform:parentMatrix");
        d0Var2.f584b.setTag(s.parent_matrix, matrix);
        Matrix matrix2 = this.M;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) d0Var.f583a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            d0Var.f583a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) d0Var.f583a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    private void b(ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        View view = d0Var2.f584b;
        Matrix matrix = new Matrix((Matrix) d0Var2.f583a.get("android:changeTransform:parentMatrix"));
        o0.c(viewGroup, matrix);
        i a2 = m.a(view, viewGroup, matrix);
        if (a2 == null) {
            return;
        }
        a2.a((ViewGroup) d0Var.f583a.get("android:changeTransform:parent"), d0Var.f584b);
        x xVar = this;
        while (true) {
            x xVar2 = xVar.s;
            if (xVar2 == null) {
                break;
            }
            xVar = xVar2;
        }
        xVar.mo20a(new d(view, a2));
        if (!Q) {
            return;
        }
        View view2 = d0Var.f584b;
        if (view2 != d0Var2.f584b) {
            o0.a(view2, 0.0f);
        }
        o0.a(view, 1.0f);
    }

    private void d(d0 d0Var) {
        View view = d0Var.f584b;
        if (view.getVisibility() == 8) {
            return;
        }
        d0Var.f583a.put("android:changeTransform:parent", view.getParent());
        d0Var.f583a.put("android:changeTransform:transforms", new f(view));
        Matrix matrix = view.getMatrix();
        d0Var.f583a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
        if (!this.L) {
            return;
        }
        Matrix matrix2 = new Matrix();
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        o0.b(viewGroup, matrix2);
        matrix2.preTranslate(-viewGroup.getScrollX(), -viewGroup.getScrollY());
        d0Var.f583a.put("android:changeTransform:parentMatrix", matrix2);
        d0Var.f583a.put("android:changeTransform:intermediateMatrix", view.getTag(s.transition_transform));
        d0Var.f583a.put("android:changeTransform:intermediateParentMatrix", view.getTag(s.parent_matrix));
    }

    static void f(View view) {
        a(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    @Override // a.r.x
    public Animator a(ViewGroup viewGroup, d0 d0Var, d0 d0Var2) {
        if (d0Var == null || d0Var2 == null || !d0Var.f583a.containsKey("android:changeTransform:parent") || !d0Var2.f583a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) d0Var.f583a.get("android:changeTransform:parent");
        boolean z = this.L && !a(viewGroup2, (ViewGroup) d0Var2.f583a.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) d0Var.f583a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            d0Var.f583a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) d0Var.f583a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            d0Var.f583a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z) {
            b(d0Var, d0Var2);
        }
        ObjectAnimator a2 = a(d0Var, d0Var2, z);
        if (z && a2 != null && this.K) {
            b(viewGroup, d0Var, d0Var2);
        } else if (!Q) {
            viewGroup2.endViewTransition(d0Var.f584b);
        }
        return a2;
    }

    @Override // a.r.x
    public void a(d0 d0Var) {
        d(d0Var);
    }

    @Override // a.r.x
    public void c(d0 d0Var) {
        d(d0Var);
        if (!Q) {
            ((ViewGroup) d0Var.f584b.getParent()).startViewTransition(d0Var.f584b);
        }
    }

    @Override // a.r.x
    public String[] n() {
        return N;
    }
}
