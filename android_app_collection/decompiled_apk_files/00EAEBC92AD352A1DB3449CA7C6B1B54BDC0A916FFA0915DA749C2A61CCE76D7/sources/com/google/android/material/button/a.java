package com.google.android.material.button;

import a.g.m.v;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import c.e.a.c.a0.g;
import c.e.a.c.a0.k;
import c.e.a.c.a0.n;
import c.e.a.c.b;
import c.e.a.c.x.c;
import com.google.android.material.internal.h;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class a {
    private static final boolean s;

    /* renamed from: a  reason: collision with root package name */
    private final MaterialButton f7968a;

    /* renamed from: b  reason: collision with root package name */
    private k f7969b;

    /* renamed from: c  reason: collision with root package name */
    private int f7970c;

    /* renamed from: d  reason: collision with root package name */
    private int f7971d;

    /* renamed from: e  reason: collision with root package name */
    private int f7972e;

    /* renamed from: f  reason: collision with root package name */
    private int f7973f;

    /* renamed from: g  reason: collision with root package name */
    private int f7974g;

    /* renamed from: h  reason: collision with root package name */
    private int f7975h;
    private PorterDuff.Mode i;
    private ColorStateList j;
    private ColorStateList k;
    private ColorStateList l;
    private Drawable m;
    private boolean n = false;
    private boolean o = false;
    private boolean p = false;
    private boolean q;
    private LayerDrawable r;

    static {
        s = Build.VERSION.SDK_INT >= 21;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(MaterialButton materialButton, k kVar) {
        this.f7968a = materialButton;
        this.f7969b = kVar;
    }

    private InsetDrawable a(Drawable drawable) {
        return new InsetDrawable(drawable, this.f7970c, this.f7972e, this.f7971d, this.f7973f);
    }

    private void b(k kVar) {
        if (c() != null) {
            c().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (b() != null) {
            b().setShapeAppearanceModel(kVar);
        }
    }

    private g c(boolean z) {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (g) (s ? (LayerDrawable) ((InsetDrawable) this.r.getDrawable(0)).getDrawable() : this.r).getDrawable(!z ? 1 : 0);
    }

    private Drawable m() {
        g gVar = new g(this.f7969b);
        gVar.a(this.f7968a.getContext());
        androidx.core.graphics.drawable.a.a(gVar, this.j);
        PorterDuff.Mode mode = this.i;
        if (mode != null) {
            androidx.core.graphics.drawable.a.a(gVar, mode);
        }
        gVar.a(this.f7975h, this.k);
        g gVar2 = new g(this.f7969b);
        gVar2.setTint(0);
        gVar2.a(this.f7975h, this.n ? c.e.a.c.q.a.a(this.f7968a, b.colorSurface) : 0);
        if (s) {
            this.m = new g(this.f7969b);
            androidx.core.graphics.drawable.a.b(this.m, -1);
            this.r = new RippleDrawable(c.e.a.c.y.b.a(this.l), a(new LayerDrawable(new Drawable[]{gVar2, gVar})), this.m);
            return this.r;
        }
        this.m = new c.e.a.c.y.a(this.f7969b);
        androidx.core.graphics.drawable.a.a(this.m, c.e.a.c.y.b.a(this.l));
        this.r = new LayerDrawable(new Drawable[]{gVar2, gVar, this.m});
        return a(this.r);
    }

    private g n() {
        return c(true);
    }

    private void o() {
        g c2 = c();
        g n = n();
        if (c2 != null) {
            c2.a(this.f7975h, this.k);
            if (n == null) {
                return;
            }
            n.a(this.f7975h, this.n ? c.e.a.c.q.a.a(this.f7968a, b.colorSurface) : 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a() {
        return this.f7974g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i) {
        if (c() != null) {
            c().setTint(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(int i, int i2) {
        Drawable drawable = this.m;
        if (drawable != null) {
            drawable.setBounds(this.f7970c, this.f7972e, i2 - this.f7971d, i - this.f7973f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(ColorStateList colorStateList) {
        if (this.l != colorStateList) {
            this.l = colorStateList;
            if (s && (this.f7968a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f7968a.getBackground()).setColor(c.e.a.c.y.b.a(colorStateList));
            } else if (s || !(this.f7968a.getBackground() instanceof c.e.a.c.y.a)) {
            } else {
                ((c.e.a.c.y.a) this.f7968a.getBackground()).setTintList(c.e.a.c.y.b.a(colorStateList));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(TypedArray typedArray) {
        this.f7970c = typedArray.getDimensionPixelOffset(c.e.a.c.k.MaterialButton_android_insetLeft, 0);
        this.f7971d = typedArray.getDimensionPixelOffset(c.e.a.c.k.MaterialButton_android_insetRight, 0);
        this.f7972e = typedArray.getDimensionPixelOffset(c.e.a.c.k.MaterialButton_android_insetTop, 0);
        this.f7973f = typedArray.getDimensionPixelOffset(c.e.a.c.k.MaterialButton_android_insetBottom, 0);
        if (typedArray.hasValue(c.e.a.c.k.MaterialButton_cornerRadius)) {
            this.f7974g = typedArray.getDimensionPixelSize(c.e.a.c.k.MaterialButton_cornerRadius, -1);
            a(this.f7969b.a(this.f7974g));
            this.p = true;
        }
        this.f7975h = typedArray.getDimensionPixelSize(c.e.a.c.k.MaterialButton_strokeWidth, 0);
        this.i = h.a(typedArray.getInt(c.e.a.c.k.MaterialButton_backgroundTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.j = c.a(this.f7968a.getContext(), typedArray, c.e.a.c.k.MaterialButton_backgroundTint);
        this.k = c.a(this.f7968a.getContext(), typedArray, c.e.a.c.k.MaterialButton_strokeColor);
        this.l = c.a(this.f7968a.getContext(), typedArray, c.e.a.c.k.MaterialButton_rippleColor);
        this.q = typedArray.getBoolean(c.e.a.c.k.MaterialButton_android_checkable, false);
        int dimensionPixelSize = typedArray.getDimensionPixelSize(c.e.a.c.k.MaterialButton_elevation, 0);
        int u = v.u(this.f7968a);
        int paddingTop = this.f7968a.getPaddingTop();
        int t = v.t(this.f7968a);
        int paddingBottom = this.f7968a.getPaddingBottom();
        this.f7968a.setInternalBackground(m());
        g c2 = c();
        if (c2 != null) {
            c2.a(dimensionPixelSize);
        }
        v.a(this.f7968a, u + this.f7970c, paddingTop + this.f7972e, t + this.f7971d, paddingBottom + this.f7973f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(PorterDuff.Mode mode) {
        if (this.i != mode) {
            this.i = mode;
            if (c() == null || this.i == null) {
                return;
            }
            androidx.core.graphics.drawable.a.a(c(), this.i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(k kVar) {
        this.f7969b = kVar;
        b(kVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(boolean z) {
        this.q = z;
    }

    public n b() {
        LayerDrawable layerDrawable = this.r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.r.getNumberOfLayers() > 2 ? this.r.getDrawable(2) : this.r.getDrawable(1));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(int i) {
        if (!this.p || this.f7974g != i) {
            this.f7974g = i;
            this.p = true;
            a(this.f7969b.a(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(ColorStateList colorStateList) {
        if (this.k != colorStateList) {
            this.k = colorStateList;
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(boolean z) {
        this.n = z;
        o();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public g c() {
        return c(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(int i) {
        if (this.f7975h != i) {
            this.f7975h = i;
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c(ColorStateList colorStateList) {
        if (this.j != colorStateList) {
            this.j = colorStateList;
            if (c() == null) {
                return;
            }
            androidx.core.graphics.drawable.a.a(c(), this.j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList d() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k e() {
        return this.f7969b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList f() {
        return this.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int g() {
        return this.f7975h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ColorStateList h() {
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PorterDuff.Mode i() {
        return this.i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean j() {
        return this.o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean k() {
        return this.q;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void l() {
        this.o = true;
        this.f7968a.setSupportBackgroundTintList(this.j);
        this.f7968a.setSupportBackgroundTintMode(this.i);
    }
}
