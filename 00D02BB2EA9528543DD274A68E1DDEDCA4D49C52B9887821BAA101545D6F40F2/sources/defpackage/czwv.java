package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: czwv  reason: default package */
/* loaded from: classes.dex */
public final class czwv extends dadr implements Drawable.Callback, kt, daaw {
    private static final int[] C = {16842910};
    private static final ShapeDrawable D = new ShapeDrawable(new OvalShape());
    private ColorStateList E;
    private float F;
    private ColorStateList G;
    private float H;
    private boolean I;
    private Drawable J;
    private ColorStateList K;
    private float L;
    private boolean M;
    private Drawable N;
    private ColorStateList O;
    private boolean P;
    private Drawable Q;
    private ColorStateList R;
    private float S;
    private float T;
    private final Paint U;
    private final Paint.FontMetrics V;
    private final RectF W;
    private final PointF X;
    private final Path Y;
    private int Z;
    public ColorStateList a;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private boolean af;
    private int ag;
    private int ah;
    private ColorFilter ai;
    private PorterDuffColorFilter aj;
    private ColorStateList ak;
    private PorterDuff.Mode al;
    private int[] am;
    private ColorStateList an;
    private WeakReference<czwu> ao;
    public float b;
    public ColorStateList c;
    public CharSequence d;
    public boolean e;
    public Drawable f;
    public float g;
    public CharSequence h;
    public boolean i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public final Context p;
    public final daax q;
    public boolean r;
    public TextUtils.TruncateAt s;
    public boolean t;
    public int u;
    public boolean v;

    public czwv(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.F = -1.0f;
        this.U = new Paint(1);
        this.V = new Paint.FontMetrics();
        this.W = new RectF();
        this.X = new PointF();
        this.Y = new Path();
        this.ah = 255;
        this.al = PorterDuff.Mode.SRC_IN;
        this.ao = new WeakReference<>(null);
        W(context);
        this.p = context;
        daax daaxVar = new daax(this);
        this.q = daaxVar;
        this.d = "";
        daaxVar.a.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = C;
        setState(iArr);
        f(iArr);
        this.t = true;
        int[] iArr2 = dadg.a;
        D.setTint(-1);
    }

    private final boolean an() {
        return this.I && this.J != null;
    }

    private final boolean ao() {
        return this.P && this.Q != null && this.af;
    }

    private final boolean ap() {
        return this.P && this.Q != null && this.i;
    }

    private final float aq() {
        Drawable drawable = this.af ? this.Q : this.J;
        float f = this.L;
        return (f > 0.0f || drawable == null) ? f : drawable.getIntrinsicWidth();
    }

    private final void ar(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (an() || ao()) {
            float f = this.j + this.S;
            float aq = aq();
            if (ks.e(this) == 0) {
                rectF.left = rect.left + f;
                rectF.right = rectF.left + aq;
            } else {
                rectF.right = rect.right - f;
                rectF.left = rectF.right - aq;
            }
            Drawable drawable = this.af ? this.Q : this.J;
            float f2 = this.L;
            if (f2 <= 0.0f && drawable != null) {
                f2 = (float) Math.ceil(dabd.b(this.p, 24));
                if (drawable.getIntrinsicHeight() <= f2) {
                    f2 = drawable.getIntrinsicHeight();
                }
            }
            rectF.top = rect.exactCenterY() - (f2 / 2.0f);
            rectF.bottom = rectF.top + f2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean as(int[] r9, int[] r10) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czwv.as(int[], int[]):boolean");
    }

    private static boolean at(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private final void au(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        ks.d(drawable, ks.e(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f) {
            if (drawable.isStateful()) {
                drawable.setState(this.am);
            }
            drawable.setTintList(this.O);
            return;
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
        Drawable drawable2 = this.J;
        if (drawable != drawable2 || !this.M) {
            return;
        }
        drawable2.setTintList(this.K);
    }

    private final ColorFilter av() {
        ColorFilter colorFilter = this.ai;
        return colorFilter != null ? colorFilter : this.aj;
    }

    private static final void aw(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public static boolean h(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    public final void A(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            if (c()) {
                this.f.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void B(float f) {
        if (this.g != f) {
            this.g = f;
            invalidateSelf();
            if (!c()) {
                return;
            }
            b();
        }
    }

    public final void C(boolean z) {
        if (this.i != z) {
            this.i = z;
            float d = d();
            if (!z && this.af) {
                this.af = false;
            }
            float d2 = d();
            invalidateSelf();
            if (d == d2) {
                return;
            }
            b();
        }
    }

    public final void D(boolean z) {
        if (this.P != z) {
            boolean ao = ao();
            this.P = z;
            boolean ao2 = ao();
            if (ao == ao2) {
                return;
            }
            if (ao2) {
                au(this.Q);
            } else {
                aw(this.Q);
            }
            invalidateSelf();
            b();
        }
    }

    public final void E(Drawable drawable) {
        if (this.Q != drawable) {
            float d = d();
            this.Q = drawable;
            float d2 = d();
            aw(this.Q);
            au(this.Q);
            invalidateSelf();
            if (d == d2) {
                return;
            }
            b();
        }
    }

    public final void F(ColorStateList colorStateList) {
        if (this.R != colorStateList) {
            this.R = colorStateList;
            if (ap()) {
                this.Q.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void G(float f) {
        if (this.j != f) {
            this.j = f;
            invalidateSelf();
            b();
        }
    }

    public final void H(float f) {
        if (this.S != f) {
            float d = d();
            this.S = f;
            float d2 = d();
            invalidateSelf();
            if (d == d2) {
                return;
            }
            b();
        }
    }

    public final void I(float f) {
        if (this.T != f) {
            float d = d();
            this.T = f;
            float d2 = d();
            invalidateSelf();
            if (d == d2) {
                return;
            }
            b();
        }
    }

    public final void J(float f) {
        if (this.k != f) {
            this.k = f;
            invalidateSelf();
            b();
        }
    }

    public final void K(float f) {
        if (this.l != f) {
            this.l = f;
            invalidateSelf();
            b();
        }
    }

    public final void L(float f) {
        if (this.m != f) {
            this.m = f;
            invalidateSelf();
            if (!c()) {
                return;
            }
            b();
        }
    }

    public final void M(float f) {
        if (this.n != f) {
            this.n = f;
            invalidateSelf();
            if (!c()) {
                return;
            }
            b();
        }
    }

    public final void N(float f) {
        if (this.o != f) {
            this.o = f;
            invalidateSelf();
            b();
        }
    }

    public final void a(czwu czwuVar) {
        this.ao = new WeakReference<>(czwuVar);
    }

    protected final void b() {
        czwu czwuVar = this.ao.get();
        if (czwuVar != null) {
            czwuVar.d();
        }
    }

    public final boolean c() {
        return this.e && this.f != null;
    }

    public final float d() {
        if (an() || ao()) {
            return this.S + aq() + this.T;
        }
        return 0.0f;
    }

    @Override // defpackage.dadr, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.ah) == 0) {
            return;
        }
        if (i < 255) {
            float f = bounds.left;
            float f2 = bounds.top;
            float f3 = bounds.right;
            float f4 = bounds.bottom;
            int i7 = this.ah;
            if (Build.VERSION.SDK_INT > 21) {
                i2 = canvas.saveLayerAlpha(f, f2, f3, f4, i7);
            } else {
                i2 = canvas.saveLayerAlpha(f, f2, f3, f4, i7, 31);
            }
        } else {
            i2 = 0;
        }
        if (!this.v) {
            this.U.setColor(this.Z);
            this.U.setStyle(Paint.Style.FILL);
            this.W.set(bounds);
            canvas.drawRoundRect(this.W, l(), l(), this.U);
        }
        if (!this.v) {
            this.U.setColor(this.aa);
            this.U.setStyle(Paint.Style.FILL);
            this.U.setColorFilter(av());
            this.W.set(bounds);
            canvas.drawRoundRect(this.W, l(), l(), this.U);
        }
        if (this.v) {
            super.draw(canvas);
        }
        if (this.H > 0.0f && !this.v) {
            this.U.setColor(this.ac);
            this.U.setStyle(Paint.Style.STROKE);
            if (!this.v) {
                this.U.setColorFilter(av());
            }
            this.W.set(bounds.left + (this.H / 2.0f), bounds.top + (this.H / 2.0f), bounds.right - (this.H / 2.0f), bounds.bottom - (this.H / 2.0f));
            float f5 = this.F - (this.H / 2.0f);
            canvas.drawRoundRect(this.W, f5, f5, this.U);
        }
        this.U.setColor(this.ad);
        this.U.setStyle(Paint.Style.FILL);
        this.W.set(bounds);
        if (!this.v) {
            canvas.drawRoundRect(this.W, l(), l(), this.U);
            i3 = 0;
        } else {
            ag(new RectF(bounds), this.Y);
            i3 = 0;
            super.ad(canvas, this.U, this.Y, this.w.a, V());
        }
        if (an()) {
            ar(bounds, this.W);
            float f6 = this.W.left;
            float f7 = this.W.top;
            canvas.translate(f6, f7);
            this.J.setBounds(i3, i3, (int) this.W.width(), (int) this.W.height());
            this.J.draw(canvas);
            canvas.translate(-f6, -f7);
        }
        if (ao()) {
            ar(bounds, this.W);
            float f8 = this.W.left;
            float f9 = this.W.top;
            canvas.translate(f8, f9);
            this.Q.setBounds(i3, i3, (int) this.W.width(), (int) this.W.height());
            this.Q.draw(canvas);
            canvas.translate(-f8, -f9);
        }
        if (!this.t || this.d == null) {
            i4 = i2;
            i5 = 0;
        } else {
            PointF pointF = this.X;
            pointF.set(0.0f, 0.0f);
            Paint.Align align = Paint.Align.LEFT;
            if (this.d != null) {
                float d = this.j + d() + this.k;
                if (ks.e(this) == 0) {
                    pointF.x = bounds.left + d;
                    align = Paint.Align.LEFT;
                } else {
                    pointF.x = bounds.right - d;
                    align = Paint.Align.RIGHT;
                }
                int centerY = bounds.centerY();
                this.q.a.getFontMetrics(this.V);
                pointF.y = centerY - ((this.V.descent + this.V.ascent) / 2.0f);
            }
            RectF rectF = this.W;
            rectF.setEmpty();
            if (this.d != null) {
                float d2 = this.j + d() + this.k;
                float e = this.o + e() + this.l;
                if (ks.e(this) == 0) {
                    rectF.left = bounds.left + d2;
                    rectF.right = bounds.right - e;
                } else {
                    rectF.left = bounds.left + e;
                    rectF.right = bounds.right - d2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            daax daaxVar = this.q;
            if (daaxVar.e != null) {
                daaxVar.a.drawableState = getState();
                daax daaxVar2 = this.q;
                daaxVar2.e.d(this.p, daaxVar2.a, daaxVar2.b);
            }
            this.q.a.setTextAlign(align);
            int round = Math.round(this.q.a(this.d.toString()));
            int round2 = Math.round(this.W.width());
            if (round > round2) {
                i6 = canvas.save();
                canvas.clipRect(this.W);
            } else {
                i6 = 0;
            }
            CharSequence charSequence = this.d;
            if (round > round2 && this.s != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.q.a, this.W.width(), this.s);
            }
            CharSequence charSequence2 = charSequence;
            i5 = 0;
            i4 = i2;
            canvas.drawText(charSequence2, 0, charSequence2.length(), this.X.x, this.X.y, this.q.a);
            if (round > round2) {
                canvas.restoreToCount(i6);
            }
        }
        if (c()) {
            RectF rectF2 = this.W;
            rectF2.setEmpty();
            if (c()) {
                float f10 = this.o + this.n;
                if (ks.e(this) == 0) {
                    rectF2.right = bounds.right - f10;
                    rectF2.left = rectF2.right - this.g;
                } else {
                    rectF2.left = bounds.left + f10;
                    rectF2.right = rectF2.left + this.g;
                }
                rectF2.top = bounds.exactCenterY() - (this.g / 2.0f);
                rectF2.bottom = rectF2.top + this.g;
            }
            float f11 = this.W.left;
            float f12 = this.W.top;
            canvas.translate(f11, f12);
            this.f.setBounds(i5, i5, (int) this.W.width(), (int) this.W.height());
            int[] iArr = dadg.a;
            this.N.setBounds(this.f.getBounds());
            this.N.jumpToCurrentState();
            this.N.draw(canvas);
            canvas.translate(-f11, -f12);
        }
        if (this.ah >= 255) {
            return;
        }
        canvas.restoreToCount(i4);
    }

    public final float e() {
        if (c()) {
            return this.m + this.g + this.n;
        }
        return 0.0f;
    }

    public final boolean f(int[] iArr) {
        if (!Arrays.equals(this.am, iArr)) {
            this.am = iArr;
            if (!c()) {
                return false;
            }
            return as(getState(), iArr);
        }
        return false;
    }

    @Override // defpackage.daaw
    public final void g() {
        b();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.ah;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.ai;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(this.j + d() + this.k + this.q.a(this.d.toString()) + this.l + e() + this.o), this.u);
    }

    @Override // defpackage.dadr, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // defpackage.dadr, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.v) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.F);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.F);
        }
        outline.setAlpha(this.ah / 255.0f);
    }

    public final void i() {
        this.an = null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // defpackage.dadr, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (at(this.a) || at(this.E) || at(this.G)) {
            return true;
        }
        dade dadeVar = this.q.e;
        return !(dadeVar == null || (colorStateList = dadeVar.a) == null || !colorStateList.isStateful()) || ap() || h(this.J) || h(this.Q) || at(this.ak);
    }

    public final void j(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            onStateChange(getState());
        }
    }

    public final void k(float f) {
        if (this.b != f) {
            this.b = f;
            invalidateSelf();
            b();
        }
    }

    public final float l() {
        return this.v ? ah() : this.F;
    }

    @Deprecated
    public final void m(float f) {
        if (this.F != f) {
            this.F = f;
            setShapeAppearanceModel(P().f(f));
        }
    }

    public final void n(ColorStateList colorStateList) {
        if (this.G != colorStateList) {
            this.G = colorStateList;
            if (this.v) {
                R(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void o(float f) {
        if (this.H != f) {
            this.H = f;
            this.U.setStrokeWidth(f);
            if (this.v) {
                super.U(f);
            }
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (an()) {
            onLayoutDirectionChanged |= ks.d(this.J, i);
        }
        if (ao()) {
            onLayoutDirectionChanged |= ks.d(this.Q, i);
        }
        if (c()) {
            onLayoutDirectionChanged |= ks.d(this.f, i);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (an()) {
            onLevelChange |= this.J.setLevel(i);
        }
        if (ao()) {
            onLevelChange |= this.Q.setLevel(i);
        }
        if (c()) {
            onLevelChange |= this.f.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // defpackage.dadr, android.graphics.drawable.Drawable, defpackage.daaw
    public final boolean onStateChange(int[] iArr) {
        if (this.v) {
            super.onStateChange(iArr);
        }
        return as(iArr, this.am);
    }

    public final void p(ColorStateList colorStateList) {
        if (this.c != colorStateList) {
            this.c = colorStateList;
            i();
            onStateChange(getState());
        }
    }

    public final void q(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (!TextUtils.equals(this.d, charSequence)) {
            this.d = charSequence;
            this.q.c = true;
            invalidateSelf();
            b();
        }
    }

    public final void r(int i) {
        s(new dade(this.p, i));
    }

    public final void s(dade dadeVar) {
        daax daaxVar = this.q;
        Context context = this.p;
        if (daaxVar.e != dadeVar) {
            daaxVar.e = dadeVar;
            if (dadeVar != null) {
                dadeVar.e(context, daaxVar.a, daaxVar.b);
                daaw daawVar = daaxVar.d.get();
                if (daawVar != null) {
                    daaxVar.a.drawableState = daawVar.getState();
                }
                dadeVar.d(context, daaxVar.a, daaxVar.b);
                daaxVar.c = true;
            }
            daaw daawVar2 = daaxVar.d.get();
            if (daawVar2 == null) {
                return;
            }
            daawVar2.g();
            daawVar2.onStateChange(daawVar2.getState());
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // defpackage.dadr, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.ah != i) {
            this.ah = i;
            invalidateSelf();
        }
    }

    @Override // defpackage.dadr, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.ai != colorFilter) {
            this.ai = colorFilter;
            invalidateSelf();
        }
    }

    @Override // defpackage.dadr, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.ak != colorStateList) {
            this.ak = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // defpackage.dadr, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.al != mode) {
            this.al = mode;
            this.aj = czyu.a(this, this.ak, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (an()) {
            visible |= this.J.setVisible(z, z2);
        }
        if (ao()) {
            visible |= this.Q.setVisible(z, z2);
        }
        if (c()) {
            visible |= this.f.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final void t(boolean z) {
        if (this.I != z) {
            boolean an = an();
            this.I = z;
            boolean an2 = an();
            if (an == an2) {
                return;
            }
            if (an2) {
                au(this.J);
            } else {
                aw(this.J);
            }
            invalidateSelf();
            b();
        }
    }

    public final void u(Drawable drawable) {
        Drawable drawable2 = this.J;
        Drawable drawable3 = null;
        Drawable c = drawable2 != null ? ks.c(drawable2) : null;
        if (c != drawable) {
            float d = d();
            if (drawable != null) {
                drawable3 = ks.b(drawable).mutate();
            }
            this.J = drawable3;
            float d2 = d();
            aw(c);
            if (an()) {
                au(this.J);
            }
            invalidateSelf();
            if (d == d2) {
                return;
            }
            b();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public final void v(ColorStateList colorStateList) {
        this.M = true;
        if (this.K != colorStateList) {
            this.K = colorStateList;
            if (an()) {
                this.J.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void w(float f) {
        if (this.L != f) {
            float d = d();
            this.L = f;
            float d2 = d();
            invalidateSelf();
            if (d == d2) {
                return;
            }
            b();
        }
    }

    public final void x(boolean z) {
        if (this.e != z) {
            boolean c = c();
            this.e = z;
            boolean c2 = c();
            if (c == c2) {
                return;
            }
            if (c2) {
                au(this.f);
            } else {
                aw(this.f);
            }
            invalidateSelf();
            b();
        }
    }

    public final Drawable y() {
        Drawable drawable = this.f;
        if (drawable != null) {
            return ks.c(drawable);
        }
        return null;
    }

    public final void z(Drawable drawable) {
        Drawable y = y();
        if (y != drawable) {
            float e = e();
            this.f = drawable != null ? ks.b(drawable).mutate() : null;
            int[] iArr = dadg.a;
            this.N = new RippleDrawable(dadg.a(this.c), this.f, D);
            float e2 = e();
            aw(y);
            if (c()) {
                au(this.f);
            }
            invalidateSelf();
            if (e == e2) {
                return;
            }
            b();
        }
    }
}
