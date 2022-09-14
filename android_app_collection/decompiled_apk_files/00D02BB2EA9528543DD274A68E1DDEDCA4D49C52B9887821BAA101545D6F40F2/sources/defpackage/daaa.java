package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
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
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: daaa  reason: default package */
/* loaded from: classes5.dex */
public class daaa {
    final czzp B;
    public ViewTreeObserver.OnPreDrawListener C;
    final czzo D;
    private final daas E;
    dadx b;
    dadr c;
    Drawable d;
    czzc e;
    Drawable f;
    boolean g;
    float i;
    float j;
    float k;
    int l;
    public czur m;
    public czur n;
    public Animator o;
    public czur p;
    public czur q;
    public float r;
    public int t;
    static final TimeInterpolator a = czum.c;
    static final int[] v = {16842919, 16842910};
    static final int[] w = {16843623, 16842908, 16842910};
    static final int[] x = {16842908, 16842910};
    static final int[] y = {16843623, 16842910};
    static final int[] z = {16842910};
    static final int[] A = new int[0];
    boolean h = true;
    public float s = 1.0f;
    public int u = 0;
    private final Rect F = new Rect();
    private final RectF G = new RectF();
    private final RectF H = new RectF();
    private final Matrix I = new Matrix();

    public daaa(czzp czzpVar, czzo czzoVar) {
        this.B = czzpVar;
        this.D = czzoVar;
        daas daasVar = new daas();
        this.E = daasVar;
        daasVar.a(v, x(new czzx(this)));
        daasVar.a(w, x(new czzw(this)));
        daasVar.a(x, x(new czzw(this)));
        daasVar.a(y, x(new czzw(this)));
        daasVar.a(z, x(new czzy(this)));
        daasVar.a(A, x(new czzv(this)));
        this.r = czzpVar.getRotation();
    }

    private final void w(float f, Matrix matrix) {
        Drawable drawable;
        matrix.reset();
        if (this.B.getDrawable() == null || this.t == 0) {
            return;
        }
        RectF rectF = this.G;
        RectF rectF2 = this.H;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        float f2 = this.t;
        rectF2.set(0.0f, 0.0f, f2, f2);
        matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
        float f3 = this.t / 2.0f;
        matrix.postScale(f, f, f3, f3);
    }

    private static final ValueAnimator x(czzz czzzVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(a);
        valueAnimator.setDuration(100L);
        valueAnimator.addListener(czzzVar);
        valueAnimator.addUpdateListener(czzzVar);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        return valueAnimator;
    }

    private static final void y(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT != 26) {
            return;
        }
        objectAnimator.setEvaluator(new czzt());
    }

    public void a(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        throw null;
    }

    public void b(ColorStateList colorStateList) {
        Drawable drawable = this.d;
        if (drawable != null) {
            drawable.setTintList(dadg.a(colorStateList));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(float f) {
        if (this.i != f) {
            this.i = f;
            k(f, this.j, this.k);
        }
    }

    public float d() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(float f) {
        if (this.j != f) {
            this.j = f;
            k(this.i, f, this.k);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(float f) {
        if (this.k != f) {
            this.k = f;
            k(this.i, this.j, f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        h(this.s);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(float f) {
        this.s = f;
        Matrix matrix = this.I;
        w(f, matrix);
        this.B.setImageMatrix(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i(dadx dadxVar) {
        this.b = dadxVar;
        dadr dadrVar = this.c;
        if (dadrVar != null) {
            dadrVar.setShapeAppearanceModel(dadxVar);
        }
        Drawable drawable = this.d;
        if (drawable instanceof daei) {
            ((daei) drawable).setShapeAppearanceModel(dadxVar);
        }
        czzc czzcVar = this.e;
        if (czzcVar != null) {
            czzcVar.h = dadxVar;
            czzcVar.invalidateSelf();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        return !this.g || this.B.b() >= this.l;
    }

    public void k(float f, float f2, float f3) {
        q();
        l(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void l(float f) {
        dadr dadrVar = this.c;
        if (dadrVar != null) {
            dadrVar.aa(f);
        }
    }

    public void m(int[] iArr) {
        throw null;
    }

    public void n() {
        throw null;
    }

    public final AnimatorSet o(czur czurVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.B, View.ALPHA, f);
        czurVar.a("opacity").a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.B, View.SCALE_X, f2);
        czurVar.a("scale").a(ofFloat2);
        y(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.B, View.SCALE_Y, f2);
        czurVar.a("scale").a(ofFloat3);
        y(ofFloat3);
        arrayList.add(ofFloat3);
        w(f3, this.I);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.B, new czup(), new czzs(this), new Matrix(this.I));
        czurVar.a("iconScale").a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        czun.a(animatorSet, arrayList);
        return animatorSet;
    }

    public void p() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void q() {
        Rect rect = this.F;
        r(rect);
        nb.c(this.f, "Didn't initialize content background");
        if (s()) {
            this.D.a(new InsetDrawable(this.f, rect.left, rect.top, rect.right, rect.bottom));
        } else {
            this.D.a(this.f);
        }
        czzo czzoVar = this.D;
        int i = rect.left;
        int i2 = rect.top;
        int i3 = rect.right;
        int i4 = rect.bottom;
        czzoVar.a.c.set(i, i2, i3, i4);
        czzp czzpVar = czzoVar.a;
        int i5 = czzpVar.a;
        czzpVar.setPadding(i + i5, i2 + i5, i3 + i5, i4 + i5);
    }

    public void r(Rect rect) {
        int b = this.g ? (this.l - this.B.b()) / 2 : 0;
        float d = this.h ? d() + this.k : 0.0f;
        int max = Math.max(b, (int) Math.ceil(d));
        int max2 = Math.max(b, (int) Math.ceil(d * 1.5f));
        rect.set(max, max2, max, max2);
    }

    public boolean s() {
        return true;
    }

    public boolean t() {
        throw null;
    }

    public dadr u() {
        throw null;
    }

    public final boolean v() {
        return od.ae(this.B) && !this.B.isInEditMode();
    }
}
