package com.google.android.material.floatingactionbutton;

import a.g.m.v;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import c.e.a.c.a0.n;
import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b {
    static final TimeInterpolator F = c.e.a.c.l.a.f4735c;
    static final int[] G = {16842919, 16842910};
    static final int[] H = {16843623, 16842908, 16842910};
    static final int[] I = {16842908, 16842910};
    static final int[] J = {16843623, 16842910};
    static final int[] K = {16842910};
    static final int[] L = new int[0];
    private ViewTreeObserver.OnPreDrawListener E;

    /* renamed from: a  reason: collision with root package name */
    c.e.a.c.a0.k f8087a;

    /* renamed from: b  reason: collision with root package name */
    c.e.a.c.a0.g f8088b;

    /* renamed from: c  reason: collision with root package name */
    Drawable f8089c;

    /* renamed from: d  reason: collision with root package name */
    com.google.android.material.floatingactionbutton.a f8090d;

    /* renamed from: e  reason: collision with root package name */
    Drawable f8091e;

    /* renamed from: f  reason: collision with root package name */
    boolean f8092f;

    /* renamed from: h  reason: collision with root package name */
    float f8094h;
    float i;
    float j;
    int k;
    private c.e.a.c.l.h m;
    private c.e.a.c.l.h n;
    private Animator o;
    private c.e.a.c.l.h p;
    private c.e.a.c.l.h q;
    private float r;
    private int t;
    private ArrayList<Animator.AnimatorListener> v;
    private ArrayList<Animator.AnimatorListener> w;
    private ArrayList<i> x;
    final FloatingActionButton y;
    final c.e.a.c.z.b z;

    /* renamed from: g  reason: collision with root package name */
    boolean f8093g = true;
    private float s = 1.0f;
    private int u = 0;
    private final Rect A = new Rect();
    private final RectF B = new RectF();
    private final RectF C = new RectF();
    private final Matrix D = new Matrix();
    private final com.google.android.material.internal.e l = new com.google.android.material.internal.e();

    /* loaded from: classes.dex */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        private boolean f8095a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ boolean f8096b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ j f8097c;

        a(boolean z, j jVar) {
            this.f8096b = z;
            this.f8097c = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f8095a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.u = 0;
            b.this.o = null;
            if (!this.f8095a) {
                b.this.y.a(this.f8096b ? 8 : 4, this.f8096b);
                j jVar = this.f8097c;
                if (jVar == null) {
                    return;
                }
                jVar.b();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.y.a(0, this.f8096b);
            b.this.u = 1;
            b.this.o = animator;
            this.f8095a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0157b extends AnimatorListenerAdapter {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ boolean f8099a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ j f8100b;

        C0157b(boolean z, j jVar) {
            this.f8099a = z;
            this.f8100b = jVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.u = 0;
            b.this.o = null;
            j jVar = this.f8100b;
            if (jVar != null) {
                jVar.a();
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            b.this.y.a(0, this.f8099a);
            b.this.u = 2;
            b.this.o = animator;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c extends c.e.a.c.l.g {
        c() {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Matrix evaluate(float f2, Matrix matrix, Matrix matrix2) {
            b.this.s = f2;
            return super.a(f2, matrix, matrix2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d implements TypeEvaluator<Float> {

        /* renamed from: a  reason: collision with root package name */
        FloatEvaluator f8103a = new FloatEvaluator();

        d(b bVar) {
        }

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public Float evaluate(float f2, Float f3, Float f4) {
            float floatValue = this.f8103a.evaluate(f2, (Number) f3, (Number) f4).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e implements ViewTreeObserver.OnPreDrawListener {
        e() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            b.this.o();
            return true;
        }
    }

    /* loaded from: classes.dex */
    private class f extends l {
        f(b bVar) {
            super(bVar, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            return 0.0f;
        }
    }

    /* loaded from: classes.dex */
    private class g extends l {
        g() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            b bVar = b.this;
            return bVar.f8094h + bVar.i;
        }
    }

    /* loaded from: classes.dex */
    private class h extends l {
        h() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            b bVar = b.this;
            return bVar.f8094h + bVar.j;
        }
    }

    /* loaded from: classes.dex */
    interface i {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    interface j {
        void a();

        void b();
    }

    /* loaded from: classes.dex */
    private class k extends l {
        k() {
            super(b.this, null);
        }

        @Override // com.google.android.material.floatingactionbutton.b.l
        protected float a() {
            return b.this.f8094h;
        }
    }

    /* loaded from: classes.dex */
    private abstract class l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a  reason: collision with root package name */
        private boolean f8108a;

        /* renamed from: b  reason: collision with root package name */
        private float f8109b;

        /* renamed from: c  reason: collision with root package name */
        private float f8110c;

        private l() {
        }

        /* synthetic */ l(b bVar, a aVar) {
            this();
        }

        protected abstract float a();

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            b.this.e((int) this.f8110c);
            this.f8108a = false;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f8108a) {
                c.e.a.c.a0.g gVar = b.this.f8088b;
                this.f8109b = gVar == null ? 0.0f : gVar.e();
                this.f8110c = a();
                this.f8108a = true;
            }
            b bVar = b.this;
            float f2 = this.f8109b;
            bVar.e((int) (f2 + ((this.f8110c - f2) * valueAnimator.getAnimatedFraction())));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(FloatingActionButton floatingActionButton, c.e.a.c.z.b bVar) {
        this.y = floatingActionButton;
        this.z = bVar;
        this.l.a(G, a((l) new h()));
        this.l.a(H, a((l) new g()));
        this.l.a(I, a((l) new g()));
        this.l.a(J, a((l) new g()));
        this.l.a(K, a((l) new k()));
        this.l.a(L, a((l) new f(this)));
        this.r = this.y.getRotation();
    }

    private boolean A() {
        return v.I(this.y) && !this.y.isInEditMode();
    }

    private AnimatorSet a(c.e.a.c.l.h hVar, float f2, float f3, float f4) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.y, View.ALPHA, f2);
        hVar.a("opacity").a((Animator) ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.y, View.SCALE_X, f3);
        hVar.a("scale").a((Animator) ofFloat2);
        a(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.y, View.SCALE_Y, f3);
        hVar.a("scale").a((Animator) ofFloat3);
        a(ofFloat3);
        arrayList.add(ofFloat3);
        a(f4, this.D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.y, new c.e.a.c.l.f(), new c(), new Matrix(this.D));
        hVar.a("iconScale").a((Animator) ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        c.e.a.c.l.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private ValueAnimator a(l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(F);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private void a(float f2, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.y.getDrawable();
        if (drawable == null || this.t == 0) {
            return;
        }
        RectF rectF = this.B;
        RectF rectF2 = this.C;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        int i2 = this.t;
        rectF2.set(0.0f, 0.0f, i2, i2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        int i3 = this.t;
        matrix.postScale(f2, f2, i3 / 2.0f, i3 / 2.0f);
    }

    private void a(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new d(this));
    }

    private c.e.a.c.l.h x() {
        if (this.n == null) {
            this.n = c.e.a.c.l.h.a(this.y.getContext(), c.e.a.c.a.design_fab_hide_motion_spec);
        }
        c.e.a.c.l.h hVar = this.n;
        androidx.core.util.g.a(hVar);
        return hVar;
    }

    private c.e.a.c.l.h y() {
        if (this.m == null) {
            this.m = c.e.a.c.l.h.a(this.y.getContext(), c.e.a.c.a.design_fab_show_motion_spec);
        }
        c.e.a.c.l.h hVar = this.m;
        androidx.core.util.g.a(hVar);
        return hVar;
    }

    private ViewTreeObserver.OnPreDrawListener z() {
        if (this.E == null) {
            this.E = new e();
        }
        return this.E;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Drawable a() {
        return this.f8091e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(float f2) {
        if (this.f8094h != f2) {
            this.f8094h = f2;
            a(this.f8094h, this.i, this.j);
        }
    }

    void a(float f2, float f3, float f4) {
        w();
        e(f2);
    }

    public void a(Animator.AnimatorListener animatorListener) {
        if (this.w == null) {
            this.w = new ArrayList<>();
        }
        this.w.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        c.e.a.c.a0.g gVar = this.f8088b;
        if (gVar != null) {
            gVar.setTintList(colorStateList);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f8090d;
        if (aVar == null) {
            return;
        }
        aVar.a(colorStateList);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        c.e.a.c.a0.g gVar = this.f8088b;
        if (gVar != null) {
            gVar.setTintMode(mode);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(Rect rect) {
        int sizeDimension = this.f8092f ? (this.k - this.y.getSizeDimension()) / 2 : 0;
        float b2 = this.f8093g ? b() + this.j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil(b2));
        int max2 = Math.max(sizeDimension, (int) Math.ceil(b2 * 1.5f));
        rect.set(max, max2, max, max2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(c.e.a.c.a0.k kVar) {
        this.f8087a = kVar;
        c.e.a.c.a0.g gVar = this.f8088b;
        if (gVar != null) {
            gVar.setShapeAppearanceModel(kVar);
        }
        Drawable drawable = this.f8089c;
        if (drawable instanceof n) {
            ((n) drawable).setShapeAppearanceModel(kVar);
        }
        com.google.android.material.floatingactionbutton.a aVar = this.f8090d;
        if (aVar == null) {
            return;
        }
        aVar.a(kVar);
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(c.e.a.c.l.h hVar) {
        this.q = hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(i iVar) {
        if (this.x == null) {
            this.x = new ArrayList<>();
        }
        this.x.add(iVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(j jVar, boolean z) {
        if (i()) {
            return;
        }
        Animator animator = this.o;
        if (animator != null) {
            animator.cancel();
        }
        if (!A()) {
            this.y.a(z ? 8 : 4, z);
            if (jVar == null) {
                return;
            }
            jVar.b();
            return;
        }
        c.e.a.c.l.h hVar = this.q;
        if (hVar == null) {
            hVar = x();
        }
        AnimatorSet a2 = a(hVar, 0.0f, 0.0f, 0.0f);
        a2.addListener(new a(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.w;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                a2.addListener(it.next());
            }
        }
        a2.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.f8092f = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int[] iArr) {
        this.l.a(iArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float b() {
        return this.f8094h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(float f2) {
        if (this.i != f2) {
            this.i = f2;
            a(this.f8094h, this.i, this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(Animator.AnimatorListener animatorListener) {
        if (this.v == null) {
            this.v = new ArrayList<>();
        }
        this.v.add(animatorListener);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        Drawable drawable = this.f8089c;
        if (drawable != null) {
            androidx.core.graphics.drawable.a.a(drawable, c.e.a.c.y.b.a(colorStateList));
        }
    }

    void b(Rect rect) {
        c.e.a.c.z.b bVar;
        Drawable drawable;
        androidx.core.util.g.a(this.f8091e, "Didn't initialize content background");
        if (s()) {
            drawable = new InsetDrawable(this.f8091e, rect.left, rect.top, rect.right, rect.bottom);
            bVar = this.z;
        } else {
            bVar = this.z;
            drawable = this.f8091e;
        }
        bVar.a(drawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(c.e.a.c.l.h hVar) {
        this.p = hVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(j jVar, boolean z) {
        if (j()) {
            return;
        }
        Animator animator = this.o;
        if (animator != null) {
            animator.cancel();
        }
        if (!A()) {
            this.y.a(0, z);
            this.y.setAlpha(1.0f);
            this.y.setScaleY(1.0f);
            this.y.setScaleX(1.0f);
            c(1.0f);
            if (jVar == null) {
                return;
            }
            jVar.a();
            return;
        }
        if (this.y.getVisibility() != 0) {
            this.y.setAlpha(0.0f);
            this.y.setScaleY(0.0f);
            this.y.setScaleX(0.0f);
            c(0.0f);
        }
        c.e.a.c.l.h hVar = this.p;
        if (hVar == null) {
            hVar = y();
        }
        AnimatorSet a2 = a(hVar, 1.0f, 1.0f, 1.0f);
        a2.addListener(new C0157b(z, jVar));
        ArrayList<Animator.AnimatorListener> arrayList = this.v;
        if (arrayList != null) {
            Iterator<Animator.AnimatorListener> it = arrayList.iterator();
            while (it.hasNext()) {
                a2.addListener(it.next());
            }
        }
        a2.start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        this.f8093g = z;
        w();
    }

    final void c(float f2) {
        this.s = f2;
        Matrix matrix = this.D;
        a(f2, matrix);
        this.y.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean c() {
        return this.f8092f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c.e.a.c.l.h d() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(float f2) {
        if (this.j != f2) {
            this.j = f2;
            a(this.f8094h, this.i, this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float e() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(float f2) {
        c.e.a.c.a0.g gVar = this.f8088b;
        if (gVar != null) {
            gVar.a(f2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float f() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c.e.a.c.a0.k g() {
        return this.f8087a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final c.e.a.c.l.h h() {
        return this.p;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean i() {
        return this.y.getVisibility() == 0 ? this.u == 1 : this.u != 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.y.getVisibility() != 0 ? this.u == 2 : this.u != 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void k() {
        this.l.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        c.e.a.c.a0.g gVar = this.f8088b;
        if (gVar != null) {
            c.e.a.c.a0.h.a(this.y, gVar);
        }
        if (r()) {
            this.y.getViewTreeObserver().addOnPreDrawListener(z());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void m() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void n() {
        ViewTreeObserver viewTreeObserver = this.y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.E = null;
        }
    }

    void o() {
        float rotation = this.y.getRotation();
        if (this.r != rotation) {
            this.r = rotation;
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q() {
        ArrayList<i> arrayList = this.x;
        if (arrayList != null) {
            Iterator<i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().a();
            }
        }
    }

    boolean r() {
        return true;
    }

    boolean s() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean t() {
        return !this.f8092f || this.y.getSizeDimension() >= this.k;
    }

    void u() {
        FloatingActionButton floatingActionButton;
        int i2;
        if (Build.VERSION.SDK_INT == 19) {
            if (this.r % 90.0f != 0.0f) {
                i2 = 1;
                if (this.y.getLayerType() != 1) {
                    floatingActionButton = this.y;
                    floatingActionButton.setLayerType(i2, null);
                }
            } else if (this.y.getLayerType() != 0) {
                floatingActionButton = this.y;
                i2 = 0;
                floatingActionButton.setLayerType(i2, null);
            }
        }
        c.e.a.c.a0.g gVar = this.f8088b;
        if (gVar != null) {
            gVar.a((int) this.r);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v() {
        c(this.s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void w() {
        Rect rect = this.A;
        a(rect);
        b(rect);
        this.z.a(rect.left, rect.top, rect.right, rect.bottom);
    }
}
