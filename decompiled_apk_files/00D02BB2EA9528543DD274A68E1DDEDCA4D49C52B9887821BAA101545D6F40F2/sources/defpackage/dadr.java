package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import java.util.BitSet;
import java.util.Objects;
/* compiled from: PG */
/* renamed from: dadr  reason: default package */
/* loaded from: classes.dex */
public class dadr extends Drawable implements kt, daei {
    private static final Paint a = new Paint(1);
    public boolean A;
    public boolean B;
    private final Matrix b;
    private final Path c;
    private final Path d;
    private final RectF e;
    private final RectF f;
    private final Region g;
    private final Region h;
    private dadx i;
    private final Paint j;
    private final Paint k;
    private final dadh l;
    private final dadz m;
    private PorterDuffColorFilter n;
    private PorterDuffColorFilter o;
    private final RectF p;
    private final dado q;
    public dadq w;
    public final daeg[] x;
    public final daeg[] y;
    public final BitSet z;

    public dadr() {
        this(new dadx());
    }

    public static dadr O(Context context, float f) {
        int d = czxb.d(context, dadr.class.getSimpleName());
        dadr dadrVar = new dadr();
        dadrVar.W(context);
        dadrVar.Q(ColorStateList.valueOf(d));
        dadrVar.aa(f);
        return dadrVar;
    }

    private static int a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private final boolean b() {
        return (this.w.v == Paint.Style.FILL_AND_STROKE || this.w.v == Paint.Style.STROKE) && this.k.getStrokeWidth() > 0.0f;
    }

    private final void c(Canvas canvas) {
        this.z.cardinality();
        if (this.w.s != 0) {
            canvas.drawPath(this.c, this.l.a);
        }
        for (int i = 0; i < 4; i++) {
            this.x[i].c(this.l, this.w.r, canvas);
            this.y[i].c(this.l, this.w.r, canvas);
        }
        if (this.B) {
            int ae = ae();
            int af = af();
            canvas.translate(-ae, -af);
            canvas.drawPath(this.c, a);
            canvas.translate(ae, af);
        }
    }

    private final void d(RectF rectF, Path path) {
        ag(rectF, path);
        if (this.w.j != 1.0f) {
            this.b.reset();
            Matrix matrix = this.b;
            float f = this.w.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.b);
        }
        path.computeBounds(this.p, true);
    }

    private final boolean e() {
        PorterDuffColorFilter porterDuffColorFilter = this.n;
        PorterDuffColorFilter porterDuffColorFilter2 = this.o;
        dadq dadqVar = this.w;
        this.n = f(dadqVar.g, dadqVar.h, this.j, true);
        dadq dadqVar2 = this.w;
        ColorStateList colorStateList = dadqVar2.f;
        this.o = f(null, dadqVar2.h, this.k, false);
        boolean z = this.w.u;
        return !Objects.equals(porterDuffColorFilter, this.n) || !Objects.equals(porterDuffColorFilter2, this.o);
    }

    private final boolean g(int[] iArr) {
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.w.d != null && color2 != (colorForState2 = this.w.d.getColorForState(iArr, (color2 = this.j.getColor())))) {
            this.j.setColor(colorForState2);
            z = true;
        }
        if (this.w.e == null || color == (colorForState = this.w.e.getColorForState(iArr, (color = this.k.getColor())))) {
            return z;
        }
        this.k.setColor(colorForState);
        return true;
    }

    private final float h() {
        if (b()) {
            return this.k.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private final RectF i() {
        this.f.set(V());
        float h = h();
        this.f.inset(h, h);
        return this.f;
    }

    public final dadx P() {
        return this.w.a;
    }

    public final void Q(ColorStateList colorStateList) {
        dadq dadqVar = this.w;
        if (dadqVar.d != colorStateList) {
            dadqVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void R(ColorStateList colorStateList) {
        dadq dadqVar = this.w;
        if (dadqVar.e != colorStateList) {
            dadqVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void S(float f, int i) {
        U(f);
        R(ColorStateList.valueOf(i));
    }

    public final void T(float f, ColorStateList colorStateList) {
        U(f);
        R(colorStateList);
    }

    public final void U(float f) {
        this.w.l = f;
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final RectF V() {
        this.e.set(getBounds());
        return this.e;
    }

    public final void W(Context context) {
        this.w.b = new czyv(context);
        ac();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int X(int i) {
        float ab = ab();
        dadq dadqVar = this.w;
        float f = ab + dadqVar.n;
        czyv czyvVar = dadqVar.b;
        return czyvVar != null ? czyvVar.a(i, f) : i;
    }

    public final void Y(float f) {
        dadq dadqVar = this.w;
        if (dadqVar.k != f) {
            dadqVar.k = f;
            this.A = true;
            invalidateSelf();
        }
    }

    public final float Z() {
        return this.w.o;
    }

    public final void aa(float f) {
        dadq dadqVar = this.w;
        if (dadqVar.o != f) {
            dadqVar.o = f;
            ac();
        }
    }

    public final float ab() {
        float Z = Z();
        float f = this.w.p;
        return Z + 0.0f;
    }

    public final void ac() {
        float ab = ab();
        this.w.r = (int) Math.ceil(0.75f * ab);
        this.w.s = (int) Math.ceil(ab * 0.25f);
        e();
        super.invalidateSelf();
    }

    public final void ad(Canvas canvas, Paint paint, Path path, dadx dadxVar, RectF rectF) {
        if (dadxVar.g(rectF)) {
            float a2 = dadxVar.g.a(rectF) * this.w.k;
            canvas.drawRoundRect(rectF, a2, a2, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    public final int ae() {
        dadq dadqVar;
        double d = this.w.s;
        double sin = Math.sin(Math.toRadians(dadqVar.t));
        Double.isNaN(d);
        return (int) (d * sin);
    }

    public final int af() {
        dadq dadqVar;
        double d = this.w.s;
        double cos = Math.cos(Math.toRadians(dadqVar.t));
        Double.isNaN(d);
        return (int) (d * cos);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void ag(RectF rectF, Path path) {
        dadz dadzVar = this.m;
        dadq dadqVar = this.w;
        dadzVar.b(dadqVar.a, dadqVar.k, rectF, this.q, path);
    }

    public final float ah() {
        return this.w.a.f.a(V());
    }

    public final float ai() {
        return this.w.a.g.a(V());
    }

    public final float aj() {
        return this.w.a.i.a(V());
    }

    public final float ak() {
        return this.w.a.h.a(V());
    }

    public final boolean al() {
        return this.w.a.g(V());
    }

    public final void am() {
        this.l.a(-12303292);
        this.w.u = false;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.j.setColorFilter(this.n);
        int alpha = this.j.getAlpha();
        this.j.setAlpha(a(alpha, this.w.m));
        this.k.setColorFilter(this.o);
        this.k.setStrokeWidth(this.w.l);
        int alpha2 = this.k.getAlpha();
        this.k.setAlpha(a(alpha2, this.w.m));
        if (this.A) {
            float f = -h();
            dadx P = P();
            dadw e = P.e();
            e.e = dadp.a(P.f, f);
            e.f = dadp.a(P.g, f);
            e.h = dadp.a(P.i, f);
            e.g = dadp.a(P.h, f);
            dadx b = e.b();
            this.i = b;
            this.m.a(b, this.w.k, i(), this.d);
            d(V(), this.c);
            this.A = false;
        }
        dadq dadqVar = this.w;
        int i = dadqVar.q;
        if (dadqVar.r > 0 && !al() && !this.c.isConvex() && Build.VERSION.SDK_INT < 29) {
            canvas.save();
            canvas.translate(ae(), af());
            if (!this.B) {
                c(canvas);
                canvas.restore();
            } else {
                int width = (int) (this.p.width() - getBounds().width());
                int height = (int) (this.p.height() - getBounds().height());
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                float width2 = this.p.width();
                int i2 = this.w.r;
                float height2 = this.p.height();
                int i3 = this.w.r;
                Bitmap createBitmap = Bitmap.createBitmap(((int) width2) + i2 + i2 + width, ((int) height2) + i3 + i3 + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f2 = (getBounds().left - this.w.r) - width;
                float f3 = (getBounds().top - this.w.r) - height;
                canvas2.translate(-f2, -f3);
                c(canvas2);
                canvas.drawBitmap(createBitmap, f2, f3, (Paint) null);
                createBitmap.recycle();
                canvas.restore();
            }
        }
        if (this.w.v == Paint.Style.FILL_AND_STROKE || this.w.v == Paint.Style.FILL) {
            ad(canvas, this.j, this.c, this.w.a, V());
        }
        if (b()) {
            ad(canvas, this.k, this.d, this.i, i());
        }
        this.j.setAlpha(alpha);
        this.k.setAlpha(alpha2);
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        int i = this.w.q;
        if (al()) {
            outline.setRoundRect(getBounds(), ah() * this.w.k);
            return;
        }
        d(V(), this.c);
        if (!this.c.isConvex() && Build.VERSION.SDK_INT < 29) {
            return;
        }
        try {
            outline.setConvexPath(this.c);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.w.i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.g.set(getBounds());
        d(V(), this.c);
        this.h.setPath(this.c, this.g);
        this.g.op(this.h, Region.Op.DIFFERENCE);
        return this.g;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.A = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.w.g) == null || !colorStateList.isStateful())) {
            dadq dadqVar = this.w;
            ColorStateList colorStateList3 = dadqVar.f;
            ColorStateList colorStateList4 = dadqVar.e;
            if ((colorStateList4 == null || !colorStateList4.isStateful()) && ((colorStateList2 = this.w.d) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.w = new dadq(this.w);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.A = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable, defpackage.daaw
    public boolean onStateChange(int[] iArr) {
        boolean g = g(iArr);
        boolean e = e();
        boolean z = true;
        if (!g && !e) {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        dadq dadqVar = this.w;
        if (dadqVar.m != i) {
            dadqVar.m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.w.c = colorFilter;
        super.invalidateSelf();
    }

    @Override // defpackage.daei
    public final void setShapeAppearanceModel(dadx dadxVar) {
        this.w.a = dadxVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.w.g = colorStateList;
        e();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        dadq dadqVar = this.w;
        if (dadqVar.h != mode) {
            dadqVar.h = mode;
            e();
            super.invalidateSelf();
        }
    }

    public dadr(Context context, AttributeSet attributeSet, int i, int i2) {
        this(dadx.b(context, attributeSet, i, i2).b());
    }

    public dadr(dadq dadqVar) {
        dadz dadzVar;
        this.x = new daeg[4];
        this.y = new daeg[4];
        this.z = new BitSet(8);
        this.b = new Matrix();
        this.c = new Path();
        this.d = new Path();
        this.e = new RectF();
        this.f = new RectF();
        this.g = new Region();
        this.h = new Region();
        Paint paint = new Paint(1);
        this.j = paint;
        Paint paint2 = new Paint(1);
        this.k = paint2;
        this.l = new dadh();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            dadzVar = dady.a;
        } else {
            dadzVar = new dadz();
        }
        this.m = dadzVar;
        this.p = new RectF();
        this.B = true;
        this.w = dadqVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        Paint paint3 = a;
        paint3.setColor(-1);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        e();
        g(getState());
        this.q = new dado(this);
    }

    private final PorterDuffColorFilter f(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        int color;
        int X;
        if (colorStateList == null || mode == null) {
            if (z && (X = X((color = paint.getColor()))) != color) {
                return new PorterDuffColorFilter(X, PorterDuff.Mode.SRC_IN);
            }
            return null;
        }
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = X(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public dadr(dadx dadxVar) {
        this(new dadq(dadxVar));
    }
}
