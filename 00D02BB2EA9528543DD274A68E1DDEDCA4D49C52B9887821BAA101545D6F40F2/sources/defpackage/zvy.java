package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zvy  reason: default package */
/* loaded from: classes7.dex */
public final class zvy extends View implements cppu<zwg, zwh> {
    private static final cqrp c = cqrp.d(3.0d);
    private static final cqrp d = cqrp.d(2.4d);
    private static final cqrp e = cqrp.d(0.75d);
    private static final cqss f = cqrt.c(R.color.quantum_grey300);
    private static final cqrp g = cqrp.d(5.0d);
    private static final cqss h = cqrt.c(R.color.quantum_grey500);
    private static final cqrp i = cqrp.d(10.0d);
    private static final cqvj j = irn.e;
    private static final cqrp k = cqrp.d(8.0d);
    @dzsi
    public zwo a;
    @dzsi
    public cpso<Double> b;
    private final Context l;
    @dzsi
    private final dpfw m;
    private final Paint n;
    private final Path o;
    private final TextPaint p;
    private final Rect q;
    private final cppq r;

    public zvy(Context context) {
        super(context);
        this.r = new zvx(this);
        this.n = new Paint();
        this.o = new Path();
        this.p = new TextPaint();
        this.q = new Rect();
        this.l = context;
        this.m = null;
        c(context);
    }

    private final void c(Context context) {
        this.n.setStyle(Paint.Style.STROKE);
        this.n.setPathEffect(new DashPathEffect(new float[]{c.a(context), d.a(context)}, 0.0f));
        this.n.setStrokeWidth(e.a(context));
        this.n.setColor(f.b(context));
        this.n.setAntiAlias(true);
        this.n.setDither(true);
        this.p.setColor(h.b(context));
        this.p.setTypeface(((cqvi) j).a);
        this.p.setTextSize(i.a(context));
        this.p.setTextAlign(Paint.Align.CENTER);
        this.p.setAntiAlias(true);
        this.p.setDither(true);
        cppw cppwVar = new cppw(-1, (byte) 2);
        cppwVar.d();
        setLayoutParams(cppwVar);
    }

    private final void d(Canvas canvas, float f2, float f3, float f4, float f5) {
        this.o.reset();
        this.o.moveTo(f2, f3);
        this.o.lineTo(f4, f5);
        canvas.drawPath(this.o, this.n);
    }

    @Override // defpackage.cppu
    public final void a(cpoj<zwg, zwh> cpojVar) {
        if (this.a != null) {
            return;
        }
        dbsk.a(cpojVar instanceof zwo);
        this.a = (zwo) cpojVar;
        cpojVar.addView(this);
        cpojVar.t(this.r);
    }

    @Override // defpackage.cppu
    public final void b(cpoj<zwg, zwh> cpojVar) {
        cpojVar.u(this.r);
        cpojVar.removeView(this);
        this.a = null;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        cpso<Double> cpsoVar = this.b;
        if (this.m == null || cpsoVar == null) {
            return;
        }
        this.p.setTextScaleX(bvox.e(bvox.b(this.l)));
        String str = this.m.a;
        this.p.getTextBounds(str, 0, str.length(), this.q);
        int paddingLeft = getPaddingLeft();
        float width = getWidth() - getPaddingRight();
        float a = width - k.a(this.l);
        cqrp cqrpVar = g;
        float a2 = a - cqrpVar.a(this.l);
        float width2 = a2 - this.q.width();
        float a3 = cqrpVar.a(this.l);
        float s = cpsoVar.s(Double.valueOf(this.m.b));
        d(canvas, paddingLeft, s, width2 - a3, s);
        d(canvas, a, s, width, s);
        canvas.drawText(str, 0, str.length(), (width2 + a2) / 2.0f, s - this.q.exactCenterY(), (Paint) this.p);
    }

    public zvy(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public zvy(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.r = new zvx(this);
        this.n = new Paint();
        this.o = new Path();
        this.p = new TextPaint();
        this.q = new Rect();
        this.l = context;
        this.m = null;
        c(context);
    }

    public zvy(Context context, @dzsi dpfw dpfwVar) {
        super(context);
        this.r = new zvx(this);
        this.n = new Paint();
        this.o = new Path();
        this.p = new TextPaint();
        this.q = new Rect();
        this.l = context;
        this.m = dpfwVar;
        c(context);
    }
}
