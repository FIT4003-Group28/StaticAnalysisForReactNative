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
import android.util.Log;
import com.google.android.youtube.R;
import j$.util.Objects;
import java.util.BitSet;
/* compiled from: PG */
/* renamed from: almx  reason: default package */
/* loaded from: classes.dex */
public class almx extends Drawable implements hn, alnn {
    private static final String g = "almx";
    private static final Paint h;
    public almw a;
    public final alnl[] b;
    public final alnl[] c;
    public final BitSet d;
    public boolean e;
    public int f;
    private final Matrix i;
    private final Path j;
    private final Path k;
    private final RectF l;
    private final RectF m;
    private final Region n;
    private final Region o;
    private alnc p;
    private final Paint q;
    private final Paint r;
    private final almp s;
    private final alne t;
    private PorterDuffColorFilter u;
    private PorterDuffColorFilter v;
    private final RectF w;
    private boolean x;
    private final almv y;

    static {
        Paint paint = new Paint(1);
        h = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public almx() {
        this(new alnc());
    }

    private final void A(Canvas canvas) {
        if (this.d.cardinality() > 0) {
            Log.w(g, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.a.s != 0) {
            canvas.drawPath(this.j, this.s.e);
        }
        for (int i = 0; i < 4; i++) {
            this.b[i].c(this.s, this.a.r, canvas);
            this.c[i].c(this.s, this.a.r, canvas);
        }
        if (this.x) {
            int e = e();
            int f = f();
            canvas.translate(-e, -f);
            canvas.drawPath(this.j, h);
            canvas.translate(e, f);
        }
    }

    private final void B(Canvas canvas, Paint paint, Path path, alnc alncVar, RectF rectF) {
        if (alncVar.e(rectF)) {
            float a = alncVar.c.a(rectF) * this.a.k;
            canvas.drawRoundRect(rectF, a, a, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private final void C() {
        float c = c();
        this.a.r = (int) Math.ceil(0.75f * c);
        this.a.s = (int) Math.ceil(c * 0.25f);
        F();
        super.invalidateSelf();
    }

    private final boolean D() {
        return (this.a.v == Paint.Style.FILL_AND_STROKE || this.a.v == Paint.Style.STROKE) && this.r.getStrokeWidth() > 0.0f;
    }

    private final boolean E(int[] iArr) {
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        boolean z = false;
        if (this.a.d != null && color2 != (colorForState2 = this.a.d.getColorForState(iArr, (color2 = this.q.getColor())))) {
            this.q.setColor(colorForState2);
            z = true;
        }
        if (this.a.e == null || color == (colorForState = this.a.e.getColorForState(iArr, (color = this.r.getColor())))) {
            return z;
        }
        this.r.setColor(colorForState);
        return true;
    }

    private final boolean F() {
        PorterDuffColorFilter porterDuffColorFilter = this.u;
        PorterDuffColorFilter porterDuffColorFilter2 = this.v;
        almw almwVar = this.a;
        this.u = x(almwVar.g, almwVar.h, this.q, true);
        almw almwVar2 = this.a;
        ColorStateList colorStateList = almwVar2.f;
        this.v = x(null, almwVar2.h, this.r, false);
        boolean z = this.a.u;
        return !Objects.equals(porterDuffColorFilter, this.u) || !Objects.equals(porterDuffColorFilter2, this.v);
    }

    private final float v() {
        if (D()) {
            return this.r.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private static int w(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private final RectF y() {
        this.m.set(g());
        float v = v();
        this.m.inset(v, v);
        return this.m;
    }

    private final void z(RectF rectF, Path path) {
        alne alneVar = this.t;
        almw almwVar = this.a;
        alneVar.b(almwVar.a, almwVar.k, rectF, this.y, path);
        if (this.a.j != 1.0f) {
            this.i.reset();
            Matrix matrix = this.i;
            float f = this.a.j;
            matrix.setScale(f, f, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.i);
        }
        path.computeBounds(this.w, true);
    }

    public final float a() {
        return this.a.o;
    }

    @Override // defpackage.alnn
    public final void b(alnc alncVar) {
        this.a.a = alncVar;
        invalidateSelf();
    }

    public final float c() {
        float a = a();
        float f = this.a.p;
        return a + 0.0f;
    }

    protected final int d(int i) {
        float c = c();
        almw almwVar = this.a;
        float f = c + almwVar.n;
        aljw aljwVar = almwVar.b;
        return aljwVar != null ? aljwVar.a(i, f) : i;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.q.setColorFilter(this.u);
        int alpha = this.q.getAlpha();
        this.q.setAlpha(w(alpha, this.a.m));
        this.r.setColorFilter(this.v);
        this.r.setStrokeWidth(this.a.l);
        int alpha2 = this.r.getAlpha();
        this.r.setAlpha(w(alpha2, this.a.m));
        if (this.e) {
            float f = -v();
            alnc i = i();
            alnb d = i.d();
            d.a = anlz.D(i.b, f);
            d.b = anlz.D(i.c, f);
            d.d = anlz.D(i.e, f);
            d.c = anlz.D(i.d, f);
            alnc a = d.a();
            this.p = a;
            this.t.a(a, this.a.k, y(), this.k);
            z(g(), this.j);
            this.e = false;
        }
        almw almwVar = this.a;
        int i2 = almwVar.q;
        if (i2 != 1 && almwVar.r > 0 && (i2 == 2 || (!s() && !this.j.isConvex() && Build.VERSION.SDK_INT < 29))) {
            canvas.save();
            canvas.translate(e(), f());
            if (!this.x) {
                A(canvas);
                canvas.restore();
            } else {
                int width = (int) (this.w.width() - getBounds().width());
                int height = (int) (this.w.height() - getBounds().height());
                if (width < 0 || height < 0) {
                    throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                }
                float width2 = this.w.width();
                int i3 = this.a.r;
                float height2 = this.w.height();
                int i4 = this.a.r;
                Bitmap createBitmap = Bitmap.createBitmap(((int) width2) + i3 + i3 + width, ((int) height2) + i4 + i4 + height, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                float f2 = (getBounds().left - this.a.r) - width;
                float f3 = (getBounds().top - this.a.r) - height;
                canvas2.translate(-f2, -f3);
                A(canvas2);
                canvas.drawBitmap(createBitmap, f2, f3, (Paint) null);
                createBitmap.recycle();
                canvas.restore();
            }
        }
        if (this.a.v == Paint.Style.FILL_AND_STROKE || this.a.v == Paint.Style.FILL) {
            B(canvas, this.q, this.j, this.a.a, g());
        }
        if (D()) {
            B(canvas, this.r, this.k, this.p, y());
        }
        this.q.setAlpha(alpha);
        this.r.setAlpha(alpha2);
    }

    public final int e() {
        almw almwVar;
        double d = this.a.s;
        double sin = Math.sin(Math.toRadians(almwVar.t));
        Double.isNaN(d);
        return (int) (d * sin);
    }

    public final int f() {
        almw almwVar;
        double d = this.a.s;
        double cos = Math.cos(Math.toRadians(almwVar.t));
        Double.isNaN(d);
        return (int) (d * cos);
    }

    protected final RectF g() {
        this.l.set(getBounds());
        return this.l;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        if (this.a.q == 2) {
            return;
        }
        if (s()) {
            outline.setRoundRect(getBounds(), this.a.a.b.a(g()) * this.a.k);
            return;
        }
        z(g(), this.j);
        if (!this.j.isConvex() && Build.VERSION.SDK_INT < 29) {
            return;
        }
        try {
            outline.setConvexPath(this.j);
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.a.i;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        this.n.set(getBounds());
        z(g(), this.j);
        this.o.setPath(this.j, this.n);
        this.n.op(this.o, Region.Op.DIFFERENCE);
        return this.n;
    }

    public final alnc i() {
        return this.a.a;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.a.g) == null || !colorStateList.isStateful())) {
            almw almwVar = this.a;
            ColorStateList colorStateList3 = almwVar.f;
            ColorStateList colorStateList4 = almwVar.e;
            if ((colorStateList4 == null || !colorStateList4.isStateful()) && ((colorStateList2 = this.a.d) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    public final void j(Context context) {
        this.a.b = new aljw(context);
        C();
    }

    public final void k(float f) {
        almw almwVar = this.a;
        if (almwVar.o != f) {
            almwVar.o = f;
            C();
        }
    }

    public final void l(ColorStateList colorStateList) {
        almw almwVar = this.a;
        if (almwVar.d != colorStateList) {
            almwVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void m(float f) {
        almw almwVar = this.a;
        if (almwVar.k != f) {
            almwVar.k = f;
            this.e = true;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.a = new almw(this.a);
        return this;
    }

    public final void n(float f) {
        almw almwVar = this.a;
        if (almwVar.n != f) {
            almwVar.n = f;
            C();
        }
    }

    public final void o(int i) {
        this.s.a(i);
        this.a.u = false;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected final void onBoundsChange(Rect rect) {
        this.e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected final boolean onStateChange(int[] iArr) {
        boolean E = E(iArr);
        boolean F = F();
        boolean z = true;
        if (!E && !F) {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public final void p(float f, int i) {
        r(f);
        q(ColorStateList.valueOf(i));
    }

    public final void q(ColorStateList colorStateList) {
        almw almwVar = this.a;
        if (almwVar.e != colorStateList) {
            almwVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void r(float f) {
        this.a.l = f;
        invalidateSelf();
    }

    public final boolean s() {
        return this.a.a.e(g());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        almw almwVar = this.a;
        if (almwVar.m != i) {
            almwVar.m = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.c = colorFilter;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.a.g = colorStateList;
        F();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        almw almwVar = this.a;
        if (almwVar.h != mode) {
            almwVar.h = mode;
            F();
            super.invalidateSelf();
        }
    }

    public final void t() {
        almw almwVar = this.a;
        if (almwVar.q != 2) {
            almwVar.q = 2;
            super.invalidateSelf();
        }
    }

    public final void u() {
        almw almwVar = this.a;
        if (almwVar.t != 180) {
            almwVar.t = 180;
            super.invalidateSelf();
        }
    }

    public almx(almw almwVar) {
        alne alneVar;
        this.b = new alnl[4];
        this.c = new alnl[4];
        this.d = new BitSet(8);
        this.i = new Matrix();
        this.j = new Path();
        this.k = new Path();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Region();
        this.o = new Region();
        Paint paint = new Paint(1);
        this.q = paint;
        Paint paint2 = new Paint(1);
        this.r = paint2;
        this.s = new almp();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            alneVar = alnd.a;
        } else {
            alneVar = new alne();
        }
        this.t = alneVar;
        this.w = new RectF();
        this.x = true;
        this.a = almwVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        F();
        E(getState());
        this.y = new almv(this);
    }

    public static almx h(Context context, float f) {
        int l = almu.l(context, R.attr.colorSurface, g);
        almx almxVar = new almx();
        almxVar.j(context);
        almxVar.l(ColorStateList.valueOf(l));
        almxVar.k(f);
        return almxVar;
    }

    private final PorterDuffColorFilter x(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = d(colorForState);
            }
            this.f = colorForState;
            return new PorterDuffColorFilter(colorForState, mode);
        } else if (!z) {
            return null;
        } else {
            int color = paint.getColor();
            int d = d(color);
            this.f = d;
            if (d == color) {
                return null;
            }
            return new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN);
        }
    }

    public almx(alnc alncVar) {
        this(new almw(alncVar));
    }
}
