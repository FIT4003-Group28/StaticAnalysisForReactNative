package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: bmxd  reason: default package */
/* loaded from: classes3.dex */
public final class bmxd extends View {
    public static final /* synthetic */ int q = 0;
    private static final dcqe r = dcqe.c("bmxd");
    private static final cqtv s = cqrt.d(R.dimen.text_size_micro);
    private static final int[] t = new int[0];
    private static final float[] u = new float[0];
    private final Paint A;
    private final Paint B;
    private final float C;
    private final float D;
    private final float E;
    private final float F;
    private final Drawable G;
    private final int H;
    private dcdc<bmwz> I;
    private dcdc<bmwz> J;
    private dcdc<bmxa> K;
    private AnimatorSet L;
    private dbsg<Integer> M;
    private dbsg<bmof<ckgn>> N;
    public final float a;
    public bmtp b;
    public dbsg<bmtp> c;
    public bmtl d;
    public final TextPaint e;
    final bmxc f;
    final Point g;
    public dcdc<Float> h;
    @dzsi
    public bmxb i;
    public float[] j;
    public int[] k;
    public int[] l;
    public int[] m;
    public int n;
    public int o;
    public boolean p;
    private final float v;
    private final float w;
    private final Paint x;
    private final Paint y;
    private final Paint z;

    public bmxd(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new bmtp(false, dcdc.e(), bmwj.a);
        this.c = dbpy.a;
        this.d = bmtl.c(dcdc.e(), false);
        Paint paint = new Paint();
        this.x = paint;
        Paint paint2 = new Paint();
        this.y = paint2;
        Paint paint3 = new Paint();
        this.A = paint3;
        Paint paint4 = new Paint();
        this.B = paint4;
        TextPaint textPaint = new TextPaint();
        this.e = textPaint;
        this.g = new Point();
        this.h = dcdc.e();
        this.I = dcdc.e();
        this.J = dcdc.e();
        this.K = dcdc.e();
        this.M = dbpy.a;
        this.N = dbpy.a;
        paint.setStyle(Paint.Style.FILL);
        int argb = Color.argb(31, 66, 133, 244);
        int argb2 = Color.argb(41, 66, 133, 244);
        paint.setColor(argb);
        paint.setStrokeWidth(jmj.a(context, 4));
        paint.setAlpha(31);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setColor(argb);
        paint4.setStyle(Paint.Style.STROKE);
        paint4.setColor(argb2);
        paint4.setStrokeWidth(jmj.a(context, 1));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(ibm.x().b(context));
        paint2.setAlpha(137);
        Paint paint5 = new Paint(paint2);
        this.z = paint5;
        paint5.setAlpha(255);
        this.C = cqrp.d(10.0d).a(context);
        this.D = cqrp.d(8.0d).a(context);
        this.E = cqrp.d(4.0d).a(context);
        this.F = cqrp.d(4.0d).a(context);
        this.w = cqrp.d(14.0d).a(context);
        float a = irh.a().a(context) / 2.0f;
        this.a = a;
        this.v = a * a;
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(s.e(context));
        textPaint.setAlpha(138);
        textPaint.setColor(ibm.c().b(context));
        Drawable a2 = cqrt.g(2131231717, ibm.x()).a(context);
        this.G = a2;
        a2.setAlpha(255);
        this.j = u;
        int[] iArr = t;
        this.k = iArr;
        this.l = iArr;
        this.m = iArr;
        this.L = new AnimatorSet();
        bmxc bmxcVar = new bmxc(this, this);
        this.f = bmxcVar;
        od.c(this, bmxcVar);
        this.H = irh.e().e(context);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float d(Rect rect, float f, float f2) {
        return (float) (Math.pow(Math.max(Math.abs(f - rect.centerX()) - (rect.width() / 2.0f), 0.0f), 2.0d) + Math.pow(Math.max(Math.abs(f2 - rect.centerY()) - (rect.height() / 2.0f), 0.0f), 2.0d));
    }

    private final void g() {
        this.j = new float[this.d.d()];
        this.k = new int[this.d.d()];
        this.l = new int[this.d.d()];
        this.m = new int[this.d.d()];
    }

    private final void h() {
        Arrays.fill(this.j, 1.0f);
        Arrays.fill(this.k, 31);
        Arrays.fill(this.l, 60);
        Arrays.fill(this.m, 138);
        this.n = 50;
        this.o = 255;
    }

    private final int i(int i) {
        return cjxu.d(this) ? k() - i : i;
    }

    private final float j(float f) {
        return cjxu.d(this) ? k() - f : f;
    }

    private final int k() {
        return (getPaddingStart() - getPaddingEnd()) + getWidth();
    }

    private final void l(Canvas canvas, float f, float f2, float f3, Paint paint) {
        canvas.drawCircle(j(f), f2, f3, paint);
    }

    private final bmtl m(final double d, dcdc<bmwz> dcdcVar) {
        dcdc r2 = dcdc.r(dchl.k(dcdcVar, new dbrn(d) { // from class: bmwu
            private final double a;

            {
                this.a = d;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                double d2 = this.a;
                int i = bmxd.q;
                return dcdc.r(dchl.k(((bmwz) obj).a(), new dbrn(d2) { // from class: bmwn
                    private final double a;

                    {
                        this.a = d2;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        double d3 = this.a;
                        double width = ((Rect) obj2).width();
                        Double.isNaN(width);
                        return Double.valueOf(Math.min(1.0d, width / d3));
                    }
                }));
            }
        }));
        bmtp bmtpVar = this.b;
        bmtm bmtmVar = bmtpVar.c;
        float f = this.C;
        final dcpe listIterator = dcdc.r(dchl.k(bmtpVar.b, bmto.a)).listIterator();
        dcdc<bmth> s2 = dcdc.s(dcgh.l(r2.listIterator(), new dbrn(listIterator) { // from class: bmwt
            private final Iterator a;

            {
                this.a = listIterator;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Iterator it = this.a;
                int i = bmxd.q;
                return new bmtc((eapg) it.next(), (dcdc) obj);
            }
        }));
        dbsk.a(!listIterator.hasNext());
        double d2 = f;
        Double.isNaN(d2);
        return bmtmVar.a(d2 / d, s2);
    }

    private final void n(int i) {
        int paddingStart = getPaddingStart();
        int paddingEnd = getPaddingEnd();
        float f = this.C;
        double max = Math.max(1.0f, (((i - paddingStart) - paddingEnd) - (f + f)) - this.H);
        dcdc<dcdc<String>> q2 = q(false);
        dcdc<bmwz> r2 = r(q2);
        bmtl m = m(max, r2);
        this.d = m;
        boolean z = true;
        if (m.b()) {
            q2 = q(true);
            r2 = r(q2);
            this.d = m(max, r2);
        }
        dbsk.l(r2.size() == this.b.a());
        dcpe<bmwz> listIterator = r2.listIterator();
        dccx F = dcdc.F();
        for (int i2 = 0; i2 < this.d.d(); i2++) {
            F.g(bmwz.d(listIterator.next().a()));
        }
        this.J = F.f().SL();
        dcdc<bmtj> dcdcVar = this.b.b;
        dbsk.l(q2.size() >= this.d.d());
        dbsk.l(dcdcVar.size() >= this.d.d());
        dccx F2 = dcdc.F();
        dcpe<dcdc<String>> listIterator2 = q2.listIterator();
        dcpe<bmtj> listIterator3 = dcdcVar.listIterator();
        for (int i3 = 0; i3 < this.d.d(); i3++) {
            F2.g(new bmwi(listIterator2.next(), listIterator3.next().g()));
        }
        this.K = F2.f().SL();
        dbsk.l(this.d.d() <= this.b.a());
        dbsk.l(this.J.size() == this.d.d());
        dbsk.l(this.K.size() == this.d.d());
        dccx F3 = dcdc.F();
        int paddingStart2 = getPaddingStart();
        int paddingEnd2 = getPaddingEnd();
        float f2 = this.C;
        float f3 = ((i - paddingStart2) - paddingEnd2) - (f2 + f2);
        dcpe<bmtr> listIterator4 = this.d.a().SL().listIterator();
        while (listIterator4.hasNext()) {
            double paddingStart3 = getPaddingStart() + this.C;
            double a = listIterator4.next().a();
            double d = f3;
            Double.isNaN(d);
            Double.isNaN(paddingStart3);
            F3.g(Float.valueOf((float) (paddingStart3 + (a * d))));
        }
        this.h = F3.f();
        if (this.J.size() != this.d.d()) {
            z = false;
        }
        dbsk.l(z);
        dccx F4 = dcdc.F();
        dcpe<Float> listIterator5 = this.h.listIterator();
        float[] s2 = s(u());
        Iterator<bmtq> w = w();
        dcdc<bmwz> dcdcVar2 = this.J;
        int size = dcdcVar2.size();
        int i4 = 0;
        while (i4 < size) {
            bmwz bmwzVar = dcdcVar2.get(i4);
            bmtq next = w.next();
            float floatValue = listIterator5.next().floatValue();
            dccx F5 = dcdc.F();
            float f4 = this.C;
            float e = e();
            float f5 = this.C;
            dcpe<Float> dcpeVar = listIterator5;
            F5.g(new Rect((int) (floatValue - f4), (int) (e - f5), (int) (f5 + floatValue), (int) (e() + this.C)));
            int i5 = 0;
            while (i5 < bmwzVar.a().size()) {
                float p = p(floatValue, bmwzVar, i5, next);
                F5.g(new Rect((int) (bmwzVar.b(i5).left + p), (int) (s2[i5] + bmwzVar.b(i5).top), (int) (p + bmwzVar.b(i5).right), (int) (s2[i5] + bmwzVar.b(i5).bottom)));
                i5++;
                w = w;
                s2 = s2;
            }
            F4.g(bmwz.d(F5.f()));
            i4++;
            listIterator5 = dcpeVar;
        }
        this.I = F4.f();
    }

    private static dbsg<ckgn> o(int i) {
        dbsk.a(i >= 0);
        int i2 = ckgn.MINI_TIMELINE_TODAY.H + i;
        return i2 <= ckgn.MINI_TIMELINE_VISIT4.H ? ckgn.a(i2) : dbpy.a;
    }

    private final float p(float f, bmwz bmwzVar, int i, bmtq bmtqVar) {
        int i2 = 1;
        if (this.d.d() != 1) {
            float f2 = this.D;
            bmtq bmtqVar2 = bmtq.START;
            int ordinal = bmtqVar.ordinal();
            if (ordinal == 0) {
                i2 = -1;
            } else if (ordinal != 1) {
                String valueOf = String.valueOf(bmtqVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
                sb.append("Unrecognized alignment: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            }
            return f + (f2 * i2);
        }
        return ((f + 15.0f) + this.D) - bmwzVar.b(i).left;
    }

    private final dcdc<dcdc<String>> q(final boolean z) {
        return dcdc.r(dchl.k(this.b.b, new dbrn(z) { // from class: bmww
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                boolean z2 = this.a;
                bmtj bmtjVar = (bmtj) obj;
                int i = bmxd.q;
                dccx F = dcdc.F();
                F.g(z2 ? bmtjVar.d() : bmtjVar.b());
                F.g(bmtjVar.g() ? "" : z2 ? bmtjVar.b() : bmtjVar.c());
                F.i(bmtjVar.e());
                return F.f();
            }
        }));
    }

    private final dcdc<bmwz> r(dcdc<dcdc<String>> dcdcVar) {
        return dcdc.r(dchl.k(dcdcVar, new dbrn(this) { // from class: bmwk
            private final bmxd a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final bmxd bmxdVar = this.a;
                return bmwz.d(dchl.k((dcdc) obj, new dbrn(bmxdVar) { // from class: bmwm
                    private final bmxd a;

                    {
                        this.a = bmxdVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        bmxd bmxdVar2 = this.a;
                        String str = (String) obj2;
                        Rect rect = new Rect();
                        bmxdVar2.e.getTextBounds(str, 0, str.length(), rect);
                        return rect;
                    }
                }));
            }
        }));
    }

    private final float[] s(float f) {
        int i;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.d.d(); i4++) {
            i3 = Math.max(i3, this.J.get(i4).a().size());
        }
        float[] fArr = new float[i3];
        dcdc<bmwz> dcdcVar = this.J;
        int size = dcdcVar.size();
        int i5 = 0;
        while (i5 < size) {
            bmwz bmwzVar = dcdcVar.get(i5);
            int i6 = 1;
            while (true) {
                i = i5 + 1;
                if (i6 < bmwzVar.a().size()) {
                    fArr[i6] = Math.max(fArr[i6], (bmwzVar.b(i6 - 1).bottom - bmwzVar.b(i6).top) + 15);
                    i6++;
                }
            }
            i5 = i;
        }
        float[] fArr2 = new float[i3];
        while (i2 < i3) {
            fArr2[i2] = i2 == 0 ? f : fArr2[i2 - 1] + fArr[i2];
            i2++;
        }
        return fArr2;
    }

    private final float t(int i) {
        int d = this.d.d();
        if (d != 0) {
            if (d == 1) {
                return e() - this.J.get(0).b(0).exactCenterY();
            }
            return v() + i;
        }
        return 0.0f;
    }

    private final float u() {
        return t(0);
    }

    private final float v() {
        return ((e() + this.D) - this.J.get(0).b(0).top) + this.w;
    }

    private final Iterator<bmtq> w() {
        return dcgh.l(this.d.a().SL().listIterator(), bmwl.a);
    }

    public final void a() {
        setAnimationStartValues();
        if (this.L.isRunning()) {
            this.L.end();
        }
        this.L = new AnimatorSet();
        for (final int i = 0; i < this.d.d(); i++) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(250L);
            ofFloat.setStartDelay((i * 80) + 400);
            ofFloat.setInterpolator(irf.a);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i) { // from class: bmwo
                private final bmxd a;
                private final int b;

                {
                    this.a = this;
                    this.b = i;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    bmxd bmxdVar = this.a;
                    bmxdVar.j[this.b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    bmxdVar.invalidate();
                }
            });
            this.L.play(ofFloat);
        }
        for (final int i2 = 0; i2 < this.d.d(); i2++) {
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 31);
            ofInt.setDuration(250L);
            ofInt.setStartDelay((i2 * 80) + 510);
            ofInt.setInterpolator(irf.a);
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i2) { // from class: bmwp
                private final bmxd a;
                private final int b;

                {
                    this.a = this;
                    this.b = i2;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    bmxd bmxdVar = this.a;
                    bmxdVar.k[this.b] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    bmxdVar.invalidate();
                }
            });
            this.L.play(ofInt);
        }
        for (final int i3 = 0; i3 < this.d.d(); i3++) {
            ValueAnimator ofInt2 = ValueAnimator.ofInt(0, 60);
            ofInt2.setDuration(200L);
            ofInt2.setStartDelay((i3 * 80) + 800);
            ofInt2.setInterpolator(irf.a);
            ofInt2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i3) { // from class: bmwq
                private final bmxd a;
                private final int b;

                {
                    this.a = this;
                    this.b = i3;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    bmxd bmxdVar = this.a;
                    bmxdVar.l[this.b] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    bmxdVar.invalidate();
                }
            });
            this.L.play(ofInt2);
        }
        for (final int i4 = 0; i4 < this.d.d(); i4++) {
            ValueAnimator ofInt3 = ValueAnimator.ofInt(0, 138);
            ofInt3.setDuration(200L);
            ofInt3.setStartDelay((i4 * 80) + 920);
            ofInt3.setInterpolator(irf.a);
            ofInt3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this, i4) { // from class: bmwr
                private final bmxd a;
                private final int b;

                {
                    this.a = this;
                    this.b = i4;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    bmxd bmxdVar = this.a;
                    bmxdVar.m[this.b] = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                    bmxdVar.invalidate();
                }
            });
            this.L.play(ofInt3);
        }
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.setDuration(200L);
        ofFloat2.setStartDelay(1100L);
        ofFloat2.setInterpolator(irf.a);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: bmws
            private final bmxd a;

            {
                this.a = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                bmxd bmxdVar = this.a;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                bmxdVar.n = (int) (50.0f * floatValue);
                bmxdVar.o = (int) (floatValue * 255.0f);
                bmxdVar.invalidate();
            }
        });
        this.L.addListener(new bmwx(this));
        this.L.play(ofFloat2);
        this.L.start();
    }

    public final dbsg<Integer> b(float f, final float f2) {
        dcep C;
        dbsg i;
        final float j = j(f);
        final dcdc<bmwz> dcdcVar = this.I;
        double d = this.v;
        final int[] iArr = this.l;
        dcdc<Float> dcdcVar2 = this.h;
        int binarySearch = Collections.binarySearch(dcdcVar2, Float.valueOf(j));
        if (binarySearch >= 0) {
            C = dcep.B(Integer.valueOf(binarySearch));
        } else {
            int i2 = (-binarySearch) - 1;
            if (i2 == dcdcVar2.size()) {
                if (dcdcVar2.isEmpty()) {
                    C = dcmr.a;
                } else {
                    C = dcep.B(Integer.valueOf(dcdcVar2.size() - 1));
                }
            } else if (i2 == 0) {
                C = dcep.B(0);
            } else {
                C = dcep.C(Integer.valueOf(i2 - 1), Integer.valueOf(i2));
            }
        }
        if (C.isEmpty()) {
            i = dbpy.a;
        } else {
            int intValue = ((Integer) dcln.a.g(new dbrn(dcdcVar, j, f2, iArr) { // from class: bmwv
                private final dcdc a;
                private final float b;
                private final float c;
                private final int[] d;

                {
                    this.a = dcdcVar;
                    this.b = j;
                    this.c = f2;
                    this.d = iArr;
                }

                @Override // defpackage.dbrn
                public final Object a(Object obj) {
                    dcdc dcdcVar3 = this.a;
                    Integer num = (Integer) obj;
                    return Float.valueOf(((bmwz) dcdcVar3.get(num.intValue())).c(this.b, this.c - (60 - this.d[num.intValue()])));
                }
            }).j(C)).intValue();
            i = ((double) dcdcVar.get(intValue).c(j, f2 - ((float) (60 - iArr[intValue])))) < d ? dbsg.i(Integer.valueOf(intValue)) : dbpy.a;
        }
        return !i.a() ? dbpy.a : dbsg.i(Integer.valueOf((this.d.d() - 1) - ((Integer) i.b()).intValue()));
    }

    public final void c(bmtp bmtpVar) {
        int d = this.d.d();
        this.b = bmtpVar;
        n(getWidth());
        if (d != this.d.d()) {
            g();
            h();
        }
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f.k(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    final float e() {
        return getPaddingTop() + this.C + this.G.getIntrinsicHeight();
    }

    public final void f(int i) {
        bmxb bmxbVar = this.i;
        if (bmxbVar == null) {
            return;
        }
        bmxbVar.a(i);
        if (!this.N.a()) {
            return;
        }
        dbsg<ckgn> o = o(i);
        if (!o.a()) {
            return;
        }
        this.N.b().a(o.b());
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay().getSize(this.g);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int i;
        Paint.Align align;
        float f;
        super.onDraw(canvas);
        if (this.d.d() != this.m.length) {
            setAnimationStartValues();
            bvoo.h("Inconsistent animation array size", new Object[0]);
        }
        int[] iArr = this.l;
        float[] s2 = s(t(60 - (iArr.length == 0 ? 0 : decl.f(iArr))));
        dcpe<Float> listIterator = this.h.listIterator();
        dcpe<bmwz> listIterator2 = this.J.listIterator();
        dcpe<bmxa> listIterator3 = this.K.listIterator();
        Iterator<bmtq> w = w();
        float paddingStart = getPaddingStart();
        for (int i2 = 0; i2 < this.d.d(); i2++) {
            bmxa next = listIterator3.next();
            bmtq next2 = w.next();
            float floatValue = listIterator.next().floatValue();
            bmwz next3 = listIterator2.next();
            this.A.setAlpha((int) (this.j[i2] * 31.0f));
            this.B.setAlpha((int) (this.j[i2] * 41.0f));
            if (next.b()) {
                this.z.setAlpha((int) (this.j[i2] * 255.0f));
            } else {
                Paint paint = this.y;
                double d = this.j[i2] * 255.0f;
                Double.isNaN(d);
                paint.setAlpha((int) (d * 0.54d));
            }
            if (this.N.a()) {
                float e = e();
                if (floatValue >= 0.0f && floatValue < this.g.x && e >= 0.0f && e < this.g.y) {
                    dbsg<ckgn> o = o(i2);
                    if (o.a()) {
                        this.N.b().b(o.b());
                    }
                }
            }
            l(canvas, floatValue, e(), next.b() ? this.C : this.D, next.b() ? this.A : this.B);
            l(canvas, floatValue, e(), this.E, next.b() ? this.z : this.y);
            TextPaint textPaint = this.e;
            bmtq bmtqVar = bmtq.START;
            int ordinal = next2.ordinal();
            if (ordinal == 0) {
                align = cjxu.d(this) ? Paint.Align.RIGHT : Paint.Align.LEFT;
            } else if (ordinal != 1) {
                String valueOf = String.valueOf(next2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Unknown alignment: ");
                sb.append(valueOf);
                throw new IllegalArgumentException(sb.toString());
            } else {
                align = cjxu.d(this) ? Paint.Align.LEFT : Paint.Align.RIGHT;
            }
            textPaint.setTextAlign(align);
            this.e.setAlpha(this.m[i2]);
            int i3 = 0;
            while (i3 < next.a().size()) {
                this.e.setFakeBoldText(i3 == 0);
                canvas.drawText(next.a().get(i3), j(p(floatValue, next3, i3, next2)), s2[i3], this.e);
                i3++;
            }
            float f2 = (floatValue - this.D) - this.F;
            if (paddingStart >= f2 || this.d.d() == 1) {
                f = floatValue;
            } else {
                this.x.setAlpha(this.k[i2]);
                f = floatValue;
                canvas.drawLine(j(paddingStart), e(), j(f2), e(), this.x);
            }
            paddingStart = f + this.D + this.F;
        }
        if (this.b.a) {
            if (!this.h.isEmpty()) {
                i = (int) (((Float) dcft.s(this.h)).floatValue() - (this.G.getIntrinsicWidth() / 2.0f));
            } else {
                bvoo.h("No points in the VisitsTimeline", new Object[0]);
                i = 0;
            }
            float e2 = e();
            float f3 = this.D;
            int intrinsicHeight = (((int) (e2 - ((f3 + f3) / 3.0f))) - this.G.getIntrinsicHeight()) + (50 - this.n);
            this.G.setAlpha(this.o);
            Drawable drawable = this.G;
            int intrinsicWidth = drawable.getIntrinsicWidth() + i;
            int intrinsicHeight2 = this.G.getIntrinsicHeight() + intrinsicHeight;
            if (cjxu.d(this)) {
                drawable.setBounds(i(intrinsicWidth), intrinsicHeight, i(i), intrinsicHeight2);
            } else {
                drawable.setBounds(i, intrinsicHeight, intrinsicWidth, intrinsicHeight2);
            }
            this.G.draw(canvas);
        }
    }

    @Override // android.view.View
    public final boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return false;
        }
        int action = motionEvent.getAction();
        if ((action != 9 && action != 10) || !this.M.a()) {
            return super.onGenericMotionEvent(motionEvent);
        }
        this.M = dbpy.a;
        return true;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        float u2;
        super.onMeasure(i, i2);
        n(getMeasuredWidth());
        if (this.d.d() == 0) {
            setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec(0, View.MeasureSpec.getMode(i2)));
            return;
        }
        if (getWidth() != 0 || this.d.d() != 1 || this.b.a() == 1) {
            u2 = u();
        } else {
            u2 = v();
        }
        float[] s2 = s(u2);
        float f = this.a;
        setMeasuredDimension(i, View.MeasureSpec.makeMeasureSpec((int) Math.max(f + f, s2[s2.length - 1] + cqrp.f(5.0d).a(getContext())), View.MeasureSpec.getMode(i2)));
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        n(i);
        if (!this.p || i == 0) {
            if (this.L.isStarted()) {
                this.L.cancel();
            }
            g();
            h();
            return;
        }
        this.p = false;
        a();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isClickable()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            dbsg<Integer> b = b(motionEvent.getX(), motionEvent.getY());
            this.M = b;
            if (b.a()) {
                return true;
            }
        } else if (action == 1) {
            if (this.M.a()) {
                dbsg<Integer> b2 = b(motionEvent.getX(), motionEvent.getY());
                if (b2.equals(this.M) && this.i != null) {
                    f(b2.b().intValue());
                    this.f.A(b2.b().intValue(), 1);
                }
                this.M = dbpy.a;
                return true;
            }
            return performClick();
        } else if (action != 2) {
            if (action == 3) {
                this.M = dbpy.a;
            }
        } else if (this.M.a()) {
            if (!b(motionEvent.getX(), motionEvent.getY()).equals(this.M)) {
                this.M = dbpy.a;
            }
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAnimationStartValues() {
        g();
        this.n = 0;
        this.o = 0;
    }

    public void setListener(@dzsi bmxb bmxbVar) {
        this.i = bmxbVar;
    }

    public void setLogsReporter(@dzsi bmof<ckgn> bmofVar) {
        this.N = dbsg.j(bmofVar);
    }

    public void setRectilinearPathData(bmtp bmtpVar) {
        if (this.L.isStarted()) {
            this.c = dbsg.i(bmtpVar);
        } else {
            c(bmtpVar);
        }
    }
}
