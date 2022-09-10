package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: cpub  reason: default package */
/* loaded from: classes5.dex */
public final class cpub<T, D> extends View implements cppu, cpta, cppl {
    public boolean a;
    public Paint b;
    public cpsn c;
    public int d;
    private boolean e;
    private Paint f;
    private float g;
    private float[] h;
    private boolean i;
    private float j;
    private float k;
    private float l;
    private final List<Integer> m;
    private final List<Integer> n;
    private final List<Integer> o;
    private float p;
    private cppq q;

    public cpub(Context context) {
        super(context);
        this.q = g();
        this.a = true;
        this.e = true;
        this.b = new Paint();
        this.f = new Paint();
        this.g = cpqk.a(null, 4.0f);
        this.d = 2;
        this.c = cpsn.a;
        this.i = false;
        this.m = cpwi.a();
        this.n = cpwi.a();
        this.o = cpwi.a();
        e(context);
    }

    private final cppq g() {
        return new cpua(this);
    }

    @Override // defpackage.cppu
    public final void a(cpoj<T, D> cpojVar) {
        cpojVar.h(this);
        cpojVar.t(this.q);
        cpojVar.q(this);
    }

    @Override // defpackage.cppu
    public final void b(cpoj<T, D> cpojVar) {
        cpojVar.removeView(this);
        cpojVar.u(this.q);
        cpojVar.j(this);
    }

    @Override // defpackage.cpta
    public final void c(cpoj<T, D> cpojVar) {
        f(cpojVar.l(), cpojVar.v);
        requestLayout();
        invalidate();
    }

    @Override // defpackage.cpta
    public final void d() {
    }

    protected final void e(Context context) {
        this.b.setStyle(Paint.Style.STROKE);
        this.b.setColor(Color.parseColor("#C0C0C0"));
        this.b.setAntiAlias(true);
        this.b.setDither(true);
        float a = cpqk.a(context, 4.0f);
        this.h = new float[]{a, a};
        this.f.setStyle(Paint.Style.FILL);
        this.f.setAntiAlias(true);
        this.f.setDither(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v7, types: [cpve] */
    public final void f(List<cpot> list, cptb<T, D> cptbVar) {
        Iterator<cpot> it;
        cpve<T, D> cpveVar;
        this.i = false;
        this.j = 0.0f;
        this.n.clear();
        this.m.clear();
        this.o.clear();
        if (!cptbVar.f() || list.isEmpty()) {
            return;
        }
        this.b.setStrokeWidth(cpqk.a(null, 2.0f));
        if (cppt.b(this, cpps.PATH_EFFECT)) {
            this.b.setPathEffect(new DashPathEffect(this.h, 0.0f));
        }
        Iterator<cpot> it2 = list.iterator();
        while (it2.hasNext()) {
            cpot next = it2.next();
            cpvi<T, D> cpviVar = next.a;
            cpsk<D> cpskVar = next.e;
            cpsk<Double> cpskVar2 = next.d;
            cpve d = cpviVar.d(cpvf.a);
            cpve e = cpviVar.e(cpvf.b, Double.valueOf((double) dcyn.a));
            cpve<T, D> a = next.a();
            cpvf<Integer> cpvfVar = cpuc.d;
            cpvf<Integer> cpvfVar2 = cpvf.e;
            cpvr<T> cpvrVar = cpviVar.i;
            cpve a2 = cpvrVar.a(cpvfVar);
            if (a2 == null) {
                a2 = cpvrVar.a(cpvfVar2);
            }
            cpve d2 = cpviVar.d(cpuc.e);
            int i = -1;
            for (T t : cpviVar.e) {
                int i2 = i + 1;
                D a3 = a.a(t, i2, cpviVar);
                Double d3 = (Double) d.a(t, i2, cpviVar);
                Double d4 = (Double) e.a(t, i2, cpviVar);
                Double valueOf = Double.valueOf(d4 == null ? dcyn.a : d4.doubleValue());
                if (d3 == null || Double.isNaN(d3.doubleValue())) {
                    it = it2;
                    cpveVar = a;
                } else {
                    it = it2;
                    cpveVar = a;
                    if (cptbVar.h(cpviVar, a3) == 1) {
                        this.i = cpskVar.q(a3);
                        this.j = Math.round(this.c.a(cpskVar, a3));
                        this.n.add(Integer.valueOf(Math.round(cpskVar2.r(d3, valueOf))));
                        this.m.add((Integer) a2.a(t, i2, cpviVar));
                        this.o.add(Integer.valueOf(d2 == null ? (int) this.g : ((Integer) d2.a(t, i2, cpviVar)).intValue()));
                    }
                }
                it2 = it;
                i = i2;
                a = cpveVar;
            }
        }
        this.k = getHeight() - getPaddingBottom();
        this.l = 0.0f;
        int i3 = this.d;
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
            if (cppt.b(this, cpps.PATH_EFFECT)) {
                float f = this.j;
                canvas.drawLine(f, this.k, f, this.l, this.b);
            } else {
                float f2 = this.j;
                float f3 = this.k;
                float f4 = this.l;
                Paint paint = this.b;
                float[] fArr = this.h;
                int length = fArr.length;
                cpwl.c(true, "dashPattern must have some elements");
                cpwl.c(true, "dashPattern length must be even");
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
        if (!this.a) {
            return;
        }
        for (int i = 0; i < this.n.size(); i++) {
            this.f.setColor(this.m.get(i).intValue());
            canvas.drawCircle(this.j, this.n.get(i).intValue(), this.o.get(i).intValue(), this.f);
        }
    }

    @Override // defpackage.cppl
    public void setAnimationPercent(float f) {
        this.p = f;
        if (f == 1.0d) {
            invalidate();
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof cppw) {
            cppw cppwVar = (cppw) layoutParams;
            cppwVar.d();
            if (cppwVar.b != 0) {
                return;
            }
            cppwVar.b = 25;
        }
    }

    public cpub(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public cpub(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.q = g();
        this.a = true;
        this.e = true;
        this.b = new Paint();
        this.f = new Paint();
        this.g = cpqk.a(null, 4.0f);
        this.d = 2;
        this.c = cpsn.a;
        this.i = false;
        this.m = cpwi.a();
        this.n = cpwi.a();
        this.o = cpwi.a();
        e(context);
    }
}
