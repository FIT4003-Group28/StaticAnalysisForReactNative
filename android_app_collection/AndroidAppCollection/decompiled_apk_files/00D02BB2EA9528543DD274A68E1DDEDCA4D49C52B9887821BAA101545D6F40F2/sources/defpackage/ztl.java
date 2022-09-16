package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ztl  reason: default package */
/* loaded from: classes7.dex */
final class ztl extends Drawable {
    public static final dcqe a = dcqe.c("ztl");
    public final Rect b;
    public final Rect c;
    public final vuk d;
    public final Paint e;
    public int f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public float k;
    public float l;
    public dcdc<Integer> m;
    @dzsi
    ztk n;
    public int o;
    public int p;
    public int q;
    public int r;
    int s;
    public Point t;
    public boolean u;
    private final vuk v;
    private final Path w;
    private final Path x;
    private final Bitmap y;
    private int z;

    public ztl(Resources resources, vuk vukVar, vuk vukVar2) {
        Path path = new Path();
        Paint h = h();
        Path path2 = new Path();
        Paint i = i();
        Paint paint = new Paint();
        Paint i2 = i();
        Paint h2 = h();
        this.b = new Rect();
        this.c = new Rect();
        this.d = vukVar;
        this.v = vukVar2;
        this.x = path;
        this.e = h;
        this.w = path2;
        this.g = i;
        this.h = paint;
        this.i = i2;
        this.k = 5.0f;
        this.l = 12.5f;
        this.j = h2;
        this.y = BitmapFactory.decodeResource(resources, R.drawable.elevation_profile_selection_dot);
        this.m = dcdc.e();
    }

    private final void e(Canvas canvas, Paint paint, float f, float f2, CharSequence charSequence, Rect rect) {
        canvas.drawText(charSequence, 0, charSequence.length(), (f - rect.left) - (this.u ? 0 : rect.width()), (f2 - rect.height()) - rect.top, paint);
    }

    private final float f(float f) {
        return getBounds().left + (this.u ? (b() - this.p) - f : this.o + f);
    }

    private final float g(float f) {
        return getBounds().top + this.q + f;
    }

    private static Paint h() {
        Paint paint = new Paint();
        paint.setColor(-1);
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        return paint;
    }

    private static Paint i() {
        Paint paint = new Paint();
        paint.setStrokeWidth(1.0f);
        paint.setColor(-16777216);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    public final void a(float f) {
        int round = Math.round(Math.min(1.0f, Math.max(0.0f, f)) * 255.0f);
        this.e.setAlpha((int) (Math.min(Math.max(0.7f, f), 1.0f) * this.f));
        this.g.setAlpha(round);
        this.h.setAlpha(round);
        this.i.setAlpha(round);
        this.j.setAlpha(round);
        invalidateSelf();
    }

    public final float b() {
        return getBounds().width();
    }

    public final Point c(int i) {
        ztk ztkVar = this.n;
        dbsk.s(ztkVar);
        doxf doxfVar = ztkVar.a;
        int b = akn.b(i, 0, this.s);
        return new Point(b, amtg.b(doxfVar, b));
    }

    public final void d() {
        this.v.a = (getBounds().height() - this.r) - this.q;
        this.d.a = ((getBounds().width() - this.o) - this.p) - (Math.max(this.b.width(), this.c.width()) + this.k);
        ztk ztkVar = this.n;
        if (ztkVar != null) {
            doxf doxfVar = ztkVar.a;
            dowb dowbVar = doxfVar.b;
            if (dowbVar == null) {
                dowbVar = dowb.d;
            }
            int i = dowbVar.b;
            this.w.reset();
            this.x.reset();
            this.s = 0;
            this.z = i;
            float g = g(this.v.b(i));
            float f = f(this.d.b(this.s));
            this.w.moveTo(f, g);
            float f2 = 0.0f;
            this.x.moveTo(this.u ? b() : 0.0f, g);
            this.x.lineTo(f, g);
            for (int i2 = 0; i2 < doxfVar.i.size(); i2++) {
                int f3 = doxfVar.i.f(i2);
                int f4 = this.s + doxfVar.h.f(i2);
                this.s = f4;
                int i3 = this.z + f3;
                this.z = i3;
                float f5 = i3;
                this.w.lineTo(f(this.d.b(f4)), g(this.v.b(f5)));
                this.x.lineTo(f(this.d.b(this.s)), g(this.v.b(f5)));
            }
            dowb dowbVar2 = doxfVar.c;
            if (dowbVar2 == null) {
                dowbVar2 = dowb.d;
            }
            float g2 = g(this.v.b(dowbVar2.b));
            float height = getBounds().height();
            this.x.lineTo(this.u ? 0.0f : b(), g2);
            this.x.lineTo(this.u ? 0.0f : b(), height);
            Path path = this.x;
            if (this.u) {
                f2 = b();
            }
            path.lineTo(f2, height);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        ztk ztkVar = this.n;
        dbsk.s(ztkVar);
        canvas.drawPath(this.x, this.e);
        canvas.drawPath(this.w, this.g);
        dcdc<Integer> dcdcVar = this.m;
        int size = dcdcVar.size();
        for (int i = 0; i < size; i++) {
            Point c = c(dcdcVar.get(i).intValue());
            float f = f(this.d.b(c.x));
            float g = g(this.v.b(c.y));
            canvas.drawCircle(f, g, this.k, this.j);
            canvas.drawCircle(f, g, this.k, this.i);
        }
        Point point = this.t;
        if (point != null && point.x > 0 && this.t.x < this.s) {
            float f2 = f(this.d.b(this.t.x));
            float g2 = g(this.v.b(this.t.y));
            float f3 = this.l;
            canvas.drawBitmap(this.y, (Rect) null, new RectF(f2 - f3, g2 - f3, f2 + f3, g2 + f3), (Paint) null);
        }
        Paint paint = this.h;
        doxf doxfVar = ztkVar.a;
        float b = this.u ? 0.0f : b();
        vuk vukVar = this.v;
        dowb dowbVar = doxfVar.e;
        if (dowbVar == null) {
            dowbVar = dowb.d;
        }
        float g3 = g(vukVar.b(dowbVar.b));
        vuk vukVar2 = this.v;
        dowb dowbVar2 = doxfVar.d;
        if (dowbVar2 == null) {
            dowbVar2 = dowb.d;
        }
        float g4 = g(vukVar2.b(dowbVar2.b));
        int height = this.b.height();
        float f4 = b;
        e(canvas, paint, f4, g3, ztkVar.c, this.c);
        e(canvas, paint, f4, g4 + height, ztkVar.b, this.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        Rect bounds = getBounds();
        boolean z = true;
        if (bounds.left == i && bounds.right == i3 && bounds.top == i2 && bounds.bottom == i4) {
            z = false;
        }
        super.setBounds(i, i2, i3, i4);
        if (z) {
            d();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(@dzsi ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(Rect rect) {
        boolean equals = rect.equals(getBounds());
        super.setBounds(rect);
        if (!equals) {
            d();
        }
    }
}
