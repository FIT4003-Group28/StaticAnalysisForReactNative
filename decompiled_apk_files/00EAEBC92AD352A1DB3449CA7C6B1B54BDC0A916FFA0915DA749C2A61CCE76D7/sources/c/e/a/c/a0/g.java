package c.e.a.c.a0;

import android.annotation.TargetApi;
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
import android.util.AttributeSet;
import c.e.a.c.a0.k;
import c.e.a.c.a0.l;
import c.e.a.c.a0.m;
/* loaded from: classes.dex */
public class g extends Drawable implements androidx.core.graphics.drawable.b, n {
    private static final Paint w = new Paint(1);

    /* renamed from: b  reason: collision with root package name */
    private c f4660b;

    /* renamed from: c  reason: collision with root package name */
    private final m.g[] f4661c;

    /* renamed from: d  reason: collision with root package name */
    private final m.g[] f4662d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4663e;

    /* renamed from: f  reason: collision with root package name */
    private final Matrix f4664f;

    /* renamed from: g  reason: collision with root package name */
    private final Path f4665g;

    /* renamed from: h  reason: collision with root package name */
    private final Path f4666h;
    private final RectF i;
    private final RectF j;
    private final Region k;
    private final Region l;
    private k m;
    private final Paint n;
    private final Paint o;
    private final c.e.a.c.z.a p;
    private final l.a q;
    private final l r;
    private PorterDuffColorFilter s;
    private PorterDuffColorFilter t;
    private Rect u;
    private final RectF v;

    /* loaded from: classes.dex */
    class a implements l.a {
        a() {
        }

        @Override // c.e.a.c.a0.l.a
        public void a(m mVar, Matrix matrix, int i) {
            g.this.f4662d[i] = mVar.a(matrix);
        }

        @Override // c.e.a.c.a0.l.a
        public void b(m mVar, Matrix matrix, int i) {
            g.this.f4661c[i] = mVar.a(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements k.c {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f4668a;

        b(g gVar, float f2) {
            this.f4668a = f2;
        }

        @Override // c.e.a.c.a0.k.c
        public c.e.a.c.a0.c a(c.e.a.c.a0.c cVar) {
            return cVar instanceof i ? cVar : new c.e.a.c.a0.b(this.f4668a, cVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends Drawable.ConstantState {

        /* renamed from: a  reason: collision with root package name */
        public k f4669a;

        /* renamed from: b  reason: collision with root package name */
        public c.e.a.c.t.a f4670b;

        /* renamed from: c  reason: collision with root package name */
        public ColorFilter f4671c;

        /* renamed from: d  reason: collision with root package name */
        public ColorStateList f4672d;

        /* renamed from: e  reason: collision with root package name */
        public ColorStateList f4673e;

        /* renamed from: f  reason: collision with root package name */
        public ColorStateList f4674f;

        /* renamed from: g  reason: collision with root package name */
        public ColorStateList f4675g;

        /* renamed from: h  reason: collision with root package name */
        public PorterDuff.Mode f4676h;
        public Rect i;
        public float j;
        public float k;
        public float l;
        public int m;
        public float n;
        public float o;
        public float p;
        public int q;
        public int r;
        public int s;
        public int t;
        public boolean u;
        public Paint.Style v;

        public c(c cVar) {
            this.f4672d = null;
            this.f4673e = null;
            this.f4674f = null;
            this.f4675g = null;
            this.f4676h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.f4669a = cVar.f4669a;
            this.f4670b = cVar.f4670b;
            this.l = cVar.l;
            this.f4671c = cVar.f4671c;
            this.f4672d = cVar.f4672d;
            this.f4673e = cVar.f4673e;
            this.f4676h = cVar.f4676h;
            this.f4675g = cVar.f4675g;
            this.m = cVar.m;
            this.j = cVar.j;
            this.s = cVar.s;
            this.q = cVar.q;
            this.u = cVar.u;
            this.k = cVar.k;
            this.n = cVar.n;
            this.o = cVar.o;
            this.p = cVar.p;
            this.r = cVar.r;
            this.t = cVar.t;
            this.f4674f = cVar.f4674f;
            this.v = cVar.v;
            Rect rect = cVar.i;
            if (rect != null) {
                this.i = new Rect(rect);
            }
        }

        public c(k kVar, c.e.a.c.t.a aVar) {
            this.f4672d = null;
            this.f4673e = null;
            this.f4674f = null;
            this.f4675g = null;
            this.f4676h = PorterDuff.Mode.SRC_IN;
            this.i = null;
            this.j = 1.0f;
            this.k = 1.0f;
            this.m = 255;
            this.n = 0.0f;
            this.o = 0.0f;
            this.p = 0.0f;
            this.q = 0;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = false;
            this.v = Paint.Style.FILL_AND_STROKE;
            this.f4669a = kVar;
            this.f4670b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g(this, null);
            gVar.f4663e = true;
            return gVar;
        }
    }

    public g() {
        this(new k());
    }

    public g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(k.a(context, attributeSet, i, i2).a());
    }

    private g(c cVar) {
        this.f4661c = new m.g[4];
        this.f4662d = new m.g[4];
        this.f4664f = new Matrix();
        this.f4665g = new Path();
        this.f4666h = new Path();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new Region();
        this.l = new Region();
        this.n = new Paint(1);
        this.o = new Paint(1);
        this.p = new c.e.a.c.z.a();
        this.r = new l();
        this.v = new RectF();
        this.f4660b = cVar;
        this.o.setStyle(Paint.Style.STROKE);
        this.n.setStyle(Paint.Style.FILL);
        w.setColor(-1);
        w.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        A();
        a(getState());
        this.q = new a();
    }

    /* synthetic */ g(c cVar, a aVar) {
        this(cVar);
    }

    public g(k kVar) {
        this(new c(kVar, null));
    }

    private boolean A() {
        PorterDuffColorFilter porterDuffColorFilter = this.s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.t;
        c cVar = this.f4660b;
        this.s = a(cVar.f4675g, cVar.f4676h, this.n, true);
        c cVar2 = this.f4660b;
        this.t = a(cVar2.f4674f, cVar2.f4676h, this.o, false);
        c cVar3 = this.f4660b;
        if (cVar3.u) {
            this.p.a(cVar3.f4675g.getColorForState(getState(), 0));
        }
        return !androidx.core.util.c.a(porterDuffColorFilter, this.s) || !androidx.core.util.c.a(porterDuffColorFilter2, this.t);
    }

    private void B() {
        float p = p();
        this.f4660b.r = (int) Math.ceil(0.75f * p);
        this.f4660b.s = (int) Math.ceil(p * 0.25f);
        A();
        y();
    }

    private static int a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, Paint paint, boolean z) {
        return (colorStateList == null || mode == null) ? a(paint, z) : a(colorStateList, mode, z);
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode, boolean z) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z) {
            colorForState = b(colorForState);
        }
        return new PorterDuffColorFilter(colorForState, mode);
    }

    private PorterDuffColorFilter a(Paint paint, boolean z) {
        int color;
        int b2;
        if (!z || (b2 = b((color = paint.getColor()))) == color) {
            return null;
        }
        return new PorterDuffColorFilter(b2, PorterDuff.Mode.SRC_IN);
    }

    public static g a(Context context, float f2) {
        int a2 = c.e.a.c.q.a.a(context, c.e.a.c.b.colorSurface, g.class.getSimpleName());
        g gVar = new g();
        gVar.a(context);
        gVar.a(ColorStateList.valueOf(a2));
        gVar.a(f2);
        return gVar;
    }

    private void a(Canvas canvas) {
        if (this.f4660b.s != 0) {
            canvas.drawPath(this.f4665g, this.p.a());
        }
        for (int i = 0; i < 4; i++) {
            this.f4661c[i].a(this.p, this.f4660b.r, canvas);
            this.f4662d[i].a(this.p, this.f4660b.r, canvas);
        }
        int h2 = h();
        int i2 = i();
        canvas.translate(-h2, -i2);
        canvas.drawPath(this.f4665g, w);
        canvas.translate(h2, i2);
    }

    private void a(Canvas canvas, Paint paint, Path path, k kVar, RectF rectF) {
        if (!kVar.a(rectF)) {
            canvas.drawPath(path, paint);
            return;
        }
        float a2 = kVar.l().a(rectF);
        canvas.drawRoundRect(rectF, a2, a2, paint);
    }

    private boolean a(int[] iArr) {
        boolean z;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f4660b.f4672d == null || color2 == (colorForState2 = this.f4660b.f4672d.getColorForState(iArr, (color2 = this.n.getColor())))) {
            z = false;
        } else {
            this.n.setColor(colorForState2);
            z = true;
        }
        if (this.f4660b.f4673e == null || color == (colorForState = this.f4660b.f4673e.getColorForState(iArr, (color = this.o.getColor())))) {
            return z;
        }
        this.o.setColor(colorForState);
        return true;
    }

    private int b(int i) {
        float p = p() + g();
        c.e.a.c.t.a aVar = this.f4660b.f4670b;
        return aVar != null ? aVar.b(i, p) : i;
    }

    private void b(Canvas canvas) {
        a(canvas, this.n, this.f4665g, this.f4660b.f4669a, d());
    }

    private void b(RectF rectF, Path path) {
        a(rectF, path);
        if (this.f4660b.j != 1.0f) {
            this.f4664f.reset();
            Matrix matrix = this.f4664f;
            float f2 = this.f4660b.j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f4664f);
        }
        path.computeBounds(this.v, true);
    }

    private void c(Canvas canvas) {
        a(canvas, this.o, this.f4666h, this.m, t());
    }

    private void d(Canvas canvas) {
        int h2 = h();
        int i = i();
        if (Build.VERSION.SDK_INT < 21) {
            Rect clipBounds = canvas.getClipBounds();
            int i2 = this.f4660b.r;
            clipBounds.inset(-i2, -i2);
            clipBounds.offset(h2, i);
            canvas.clipRect(clipBounds, Region.Op.REPLACE);
        }
        canvas.translate(h2, i);
    }

    private void s() {
        this.m = k().a(new b(this, -u()));
        this.r.a(this.m, this.f4660b.k, t(), this.f4666h);
    }

    private RectF t() {
        RectF d2 = d();
        float u = u();
        this.j.set(d2.left + u, d2.top + u, d2.right - u, d2.bottom - u);
        return this.j;
    }

    private float u() {
        if (x()) {
            return this.o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    private boolean v() {
        c cVar = this.f4660b;
        int i = cVar.q;
        return i != 1 && cVar.r > 0 && (i == 2 || z());
    }

    private boolean w() {
        Paint.Style style = this.f4660b.v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    private boolean x() {
        Paint.Style style = this.f4660b.v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.o.getStrokeWidth() > 0.0f;
    }

    private void y() {
        super.invalidateSelf();
    }

    private boolean z() {
        return Build.VERSION.SDK_INT < 21 || (!r() && !this.f4665g.isConvex());
    }

    public void a(float f2) {
        c cVar = this.f4660b;
        if (cVar.o != f2) {
            cVar.o = f2;
            B();
        }
    }

    public void a(float f2, int i) {
        d(f2);
        b(ColorStateList.valueOf(i));
    }

    public void a(float f2, ColorStateList colorStateList) {
        d(f2);
        b(colorStateList);
    }

    public void a(int i) {
        c cVar = this.f4660b;
        if (cVar.t != i) {
            cVar.t = i;
            y();
        }
    }

    public void a(int i, int i2, int i3, int i4) {
        c cVar = this.f4660b;
        if (cVar.i == null) {
            cVar.i = new Rect();
        }
        this.f4660b.i.set(i, i2, i3, i4);
        this.u = this.f4660b.i;
        invalidateSelf();
    }

    public void a(Context context) {
        this.f4660b.f4670b = new c.e.a.c.t.a(context);
        B();
    }

    public void a(ColorStateList colorStateList) {
        c cVar = this.f4660b;
        if (cVar.f4672d != colorStateList) {
            cVar.f4672d = colorStateList;
            onStateChange(getState());
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(Canvas canvas, Paint paint, Path path, RectF rectF) {
        a(canvas, paint, path, this.f4660b.f4669a, rectF);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(RectF rectF, Path path) {
        l lVar = this.r;
        c cVar = this.f4660b;
        lVar.a(cVar.f4669a, cVar.k, rectF, this.q, path);
    }

    public float b() {
        return this.f4660b.f4669a.c().a(d());
    }

    public void b(float f2) {
        c cVar = this.f4660b;
        if (cVar.k != f2) {
            cVar.k = f2;
            this.f4663e = true;
            invalidateSelf();
        }
    }

    public void b(ColorStateList colorStateList) {
        c cVar = this.f4660b;
        if (cVar.f4673e != colorStateList) {
            cVar.f4673e = colorStateList;
            onStateChange(getState());
        }
    }

    public float c() {
        return this.f4660b.f4669a.e().a(d());
    }

    public void c(float f2) {
        c cVar = this.f4660b;
        if (cVar.n != f2) {
            cVar.n = f2;
            B();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public RectF d() {
        Rect bounds = getBounds();
        this.i.set(bounds.left, bounds.top, bounds.right, bounds.bottom);
        return this.i;
    }

    public void d(float f2) {
        this.f4660b.l = f2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.n.setColorFilter(this.s);
        int alpha = this.n.getAlpha();
        this.n.setAlpha(a(alpha, this.f4660b.m));
        this.o.setColorFilter(this.t);
        this.o.setStrokeWidth(this.f4660b.l);
        int alpha2 = this.o.getAlpha();
        this.o.setAlpha(a(alpha2, this.f4660b.m));
        if (this.f4663e) {
            s();
            b(d(), this.f4665g);
            this.f4663e = false;
        }
        if (v()) {
            canvas.save();
            d(canvas);
            int width = (int) (this.v.width() - getBounds().width());
            int height = (int) (this.v.height() - getBounds().height());
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.v.width()) + (this.f4660b.r * 2) + width, ((int) this.v.height()) + (this.f4660b.r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f2 = (getBounds().left - this.f4660b.r) - width;
            float f3 = (getBounds().top - this.f4660b.r) - height;
            canvas2.translate(-f2, -f3);
            a(canvas2);
            canvas.drawBitmap(createBitmap, f2, f3, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
        if (w()) {
            b(canvas);
        }
        if (x()) {
            c(canvas);
        }
        this.n.setAlpha(alpha);
        this.o.setAlpha(alpha2);
    }

    public float e() {
        return this.f4660b.o;
    }

    public ColorStateList f() {
        return this.f4660b.f4672d;
    }

    public float g() {
        return this.f4660b.n;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f4660b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f4660b.q == 2) {
            return;
        }
        if (r()) {
            outline.setRoundRect(getBounds(), m());
            return;
        }
        b(d(), this.f4665g);
        if (!this.f4665g.isConvex()) {
            return;
        }
        outline.setConvexPath(this.f4665g);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.u;
        if (rect2 != null) {
            rect.set(rect2);
            return true;
        }
        return super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.k.set(getBounds());
        b(d(), this.f4665g);
        this.l.setPath(this.f4665g, this.k);
        this.k.op(this.l, Region.Op.DIFFERENCE);
        return this.k;
    }

    public int h() {
        c cVar = this.f4660b;
        return (int) (cVar.s * Math.sin(Math.toRadians(cVar.t)));
    }

    public int i() {
        c cVar = this.f4660b;
        return (int) (cVar.s * Math.cos(Math.toRadians(cVar.t)));
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f4663e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        ColorStateList colorStateList3;
        ColorStateList colorStateList4;
        return super.isStateful() || ((colorStateList = this.f4660b.f4675g) != null && colorStateList.isStateful()) || (((colorStateList2 = this.f4660b.f4674f) != null && colorStateList2.isStateful()) || (((colorStateList3 = this.f4660b.f4673e) != null && colorStateList3.isStateful()) || ((colorStateList4 = this.f4660b.f4672d) != null && colorStateList4.isStateful())));
    }

    public int j() {
        return this.f4660b.r;
    }

    public k k() {
        return this.f4660b.f4669a;
    }

    public ColorStateList l() {
        return this.f4660b.f4675g;
    }

    public float m() {
        return this.f4660b.f4669a.j().a(d());
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f4660b = new c(this.f4660b);
        return this;
    }

    public float n() {
        return this.f4660b.f4669a.l().a(d());
    }

    public float o() {
        return this.f4660b.p;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f4663e = true;
        super.onBoundsChange(rect);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z = a(iArr) || A();
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    public float p() {
        return e() + o();
    }

    public boolean q() {
        c.e.a.c.t.a aVar = this.f4660b.f4670b;
        return aVar != null && aVar.a();
    }

    public boolean r() {
        return this.f4660b.f4669a.a(d());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        c cVar = this.f4660b;
        if (cVar.m != i) {
            cVar.m = i;
            y();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4660b.f4671c = colorFilter;
        y();
    }

    @Override // c.e.a.c.a0.n
    public void setShapeAppearanceModel(k kVar) {
        this.f4660b.f4669a = kVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintList(ColorStateList colorStateList) {
        this.f4660b.f4675g = colorStateList;
        A();
        y();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.b
    public void setTintMode(PorterDuff.Mode mode) {
        c cVar = this.f4660b;
        if (cVar.f4676h != mode) {
            cVar.f4676h = mode;
            A();
            y();
        }
    }
}
