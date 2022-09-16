package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: sfw  reason: default package */
/* loaded from: classes4.dex */
public final class sfw extends View implements sbw, sez, sbn {
    public final Paint a;
    public float b;
    public int c;
    private final boolean d;
    private final boolean e;
    private final Paint f;
    private final float[] g;
    private final ses h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private final List m;
    private final List n;
    private final List o;
    private float p;
    private final sbs q;

    public sfw(Context context) {
        super(context);
        this.q = new sfv(this);
        this.d = true;
        this.e = true;
        Paint paint = new Paint();
        this.a = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        this.b = scf.b(null, 4.0f);
        this.c = 2;
        this.h = ses.a;
        this.i = false;
        this.m = sbv.d();
        this.n = sbv.d();
        this.o = sbv.d();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.parseColor("#C0C0C0"));
        paint.setAntiAlias(true);
        paint.setDither(true);
        float b = scf.b(context, 4.0f);
        this.g = new float[]{b, b};
        paint2.setStyle(Paint.Style.FILL);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
    }

    @Override // defpackage.sez
    public final void a(sai saiVar) {
    }

    @Override // defpackage.sbw
    public final void b(sai saiVar) {
        saiVar.m(this);
        saiVar.y(this.q);
        saiVar.v(this);
    }

    @Override // defpackage.sbw
    public final void c(sai saiVar) {
        saiVar.removeView(this);
        saiVar.z(this.q);
        saiVar.o(this);
    }

    @Override // defpackage.sez
    public final void d(sai saiVar) {
        e(saiVar.l(), saiVar.x);
        requestLayout();
        invalidate();
    }

    public final void e(List list, sfa sfaVar) {
        Iterator it;
        sgp sgpVar;
        this.i = false;
        this.j = 0.0f;
        this.n.clear();
        this.m.clear();
        this.o.clear();
        if (!sfaVar.e() || list.isEmpty()) {
            return;
        }
        this.a.setStrokeWidth(scf.b(null, 2.0f));
        if (sbv.b(this, sbu.PATH_EFFECT)) {
            this.a.setPathEffect(new DashPathEffect(this.g, 0.0f));
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            sat satVar = (sat) it2.next();
            sgt sgtVar = satVar.a;
            sep sepVar = satVar.d;
            sep sepVar2 = satVar.c;
            sgp c = sgtVar.c(sgq.a);
            sgp d = sgtVar.d(sgq.b, Double.valueOf(0.0d));
            sgp c2 = satVar.c();
            sgq sgqVar = sfx.d;
            sgq sgqVar2 = sgq.e;
            sgz sgzVar = sgtVar.d;
            sgp a = sgzVar.a(sgqVar);
            if (a == null) {
                a = sgzVar.a(sgqVar2);
            }
            sgp c3 = sgtVar.c(sfx.e);
            int i = -1;
            for (Object obj : sgtVar.a) {
                int i2 = i + 1;
                Object a2 = c2.a(obj, i2, sgtVar);
                Double d2 = (Double) c.a(obj, i2, sgtVar);
                Double d3 = (Double) d.a(obj, i2, sgtVar);
                Double valueOf = Double.valueOf(d3 == null ? 0.0d : d3.doubleValue());
                if (d2 == null || Double.isNaN(d2.doubleValue())) {
                    it = it2;
                    sgpVar = c2;
                } else {
                    it = it2;
                    sgpVar = c2;
                    if (sfaVar.f(sgtVar, a2) == 1) {
                        this.i = sepVar.o(a2);
                        this.j = Math.round(this.h.a(sepVar, a2));
                        this.n.add(Integer.valueOf(Math.round(sepVar2.b(d2, valueOf))));
                        this.m.add((Integer) a.a(obj, i2, sgtVar));
                        this.o.add(Integer.valueOf(c3 == null ? (int) this.b : ((Integer) c3.a(obj, i2, sgtVar)).intValue()));
                    }
                }
                it2 = it;
                i = i2;
                c2 = sgpVar;
            }
        }
        this.k = getHeight() - getPaddingBottom();
        this.l = 0.0f;
        int i3 = this.c;
        int i4 = i3 - 1;
        if (i3 == 0) {
            throw null;
        }
        if (i4 != 0) {
            if (i4 == 1) {
                this.l = getPaddingTop();
            } else {
                this.l = getPaddingTop();
            }
        } else if (!this.n.isEmpty()) {
            this.l = this.k;
            for (Integer num : this.n) {
                float intValue = num.intValue();
                if (intValue < this.l) {
                    this.l = intValue;
                }
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.p < 1.0d || !this.i || this.j < getPaddingLeft() || this.j > getWidth() - getPaddingRight()) {
            return;
        }
        if (this.e) {
            if (sbv.b(this, sbu.PATH_EFFECT)) {
                float f = this.j;
                canvas.drawLine(f, this.k, f, this.l, this.a);
            } else {
                float f2 = this.j;
                float f3 = this.k;
                float f4 = this.l;
                Paint paint = this.a;
                float[] fArr = this.g;
                int length = fArr.length;
                sho.a(true, "dashPattern must have some elements");
                sho.a(true, "dashPattern length must be even");
                float f5 = f4 - f3;
                float f6 = 0.0f;
                float sqrt = (float) Math.sqrt((f5 * f5) + 0.0f);
                float f7 = 0.0f / sqrt;
                float f8 = f5 / sqrt;
                while (f6 < sqrt) {
                    float min = f6 + Math.min(fArr[0], sqrt - f6);
                    canvas.drawLine(f2 + (f6 * f7), f3 + (f6 * f8), f2 + (min * f7), f3 + (min * f8), paint);
                    f6 = min + fArr[1];
                    int length2 = fArr.length;
                }
            }
        }
        if (!this.d) {
            return;
        }
        for (int i = 0; i < this.n.size(); i++) {
            this.f.setColor(((Integer) this.m.get(i)).intValue());
            canvas.drawCircle(this.j, ((Integer) this.n.get(i)).intValue(), ((Integer) this.o.get(i)).intValue(), this.f);
        }
    }

    @Override // defpackage.sbn
    public final void setAnimationPercent(float f) {
        this.p = f;
        if (f == 1.0d) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof sby) {
            sby sbyVar = (sby) layoutParams;
            sbyVar.d();
            if (sbyVar.b != 0) {
                return;
            }
            sbyVar.b = 25;
        }
    }
}
