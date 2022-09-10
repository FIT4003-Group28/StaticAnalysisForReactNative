package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: zwu  reason: default package */
/* loaded from: classes7.dex */
public final class zwu extends View {
    private static final Paint H;
    private static final Path I;
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int E;
    @dzsi
    private final Typeface F;
    private final int G;
    public List<zws> m;
    public List<String> n;
    public dour o;
    private final zwt p;
    private final int q;
    private final int r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;
    private final int w;
    private final int x;
    private final int y;
    private final int z;
    static final cqrp a = cqrp.d(24.0d);
    static final cqrp b = cqrp.d(28.0d);
    static final cqrp c = cqrp.d(28.0d);
    static final cqrp d = cqrp.d(34.0d);
    static final cqrp e = cqrp.d(2.0d);
    static final cqrp f = cqrp.d(20.0d);
    static final cqrp g = cqrp.d(14.0d);
    static final cqrp h = cqrp.d(280.0d);
    static final cqrp i = cqrp.d(160.0d);
    static final cqrp j = cqrp.d(1.0d);
    static final cqrp k = cqrp.d(1.0d);
    static final cqrp l = cqrp.f(14.0d);
    private static final RectF J = new RectF();
    private static final Rect K = new Rect();

    static {
        Paint paint = new Paint();
        H = paint;
        paint.setAntiAlias(true);
        I = new Path();
    }

    public zwu(Context context, @dzsi AttributeSet attributeSet) {
        super(context, attributeSet);
        this.m = dcdc.e();
        this.n = dcdc.e();
        this.o = dour.UNKNOWN_DIRECTION_OF_MOTION;
        int e2 = a.e(context);
        this.q = e2;
        int e3 = b.e(context);
        this.r = e3;
        int e4 = c.e(context);
        this.s = e4;
        int e5 = d.e(context);
        this.t = e5;
        this.u = e.e(context);
        this.v = f.e(context);
        this.w = g.e(context);
        this.y = i.e(context);
        this.x = h.e(context);
        this.z = j.e(context);
        this.A = k.e(context);
        this.p = zwt.e(e2, e3, e4, e5);
        this.B = ibm.h().b(context);
        this.C = ibm.x().b(context);
        this.D = ibm.j().b(context);
        this.E = ibm.b().b(context);
        this.F = ((cqvi) irn.c).a;
        this.G = l.e(context);
    }

    public static <T extends cqkp> cqnf<T> a(cqlc<T, List<zws>> cqlcVar) {
        return cqjv.g(ztg.TRAIN_CARS, cqlcVar, zth.a);
    }

    public static <T extends cqkp> cqnf<T> b(cqjb<T, dour> cqjbVar) {
        return cqjv.e(ztg.TRAIN_CAR_DIRECTION_OF_MOTION, cqjbVar, zth.a);
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> c(cqmp<T>... cqmpVarArr) {
        return new cqmh(zwu.class, cqmpVarArr);
    }

    private static int j(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != Integer.MIN_VALUE) {
            return mode != 1073741824 ? i2 : View.MeasureSpec.getSize(i3);
        }
        return Math.min(View.MeasureSpec.getSize(i3), i2);
    }

    private static void k(Path path, float f2, float f3, float f4, float f5, float f6) {
        float f7 = f4 + f4;
        RectF rectF = J;
        rectF.set(f2, f3, f2 + f7, f7 + f3);
        path.arcTo(rectF, f5, f6);
    }

    private final void l(Canvas canvas, int i2, int i3, int i4, int i5, zws zwsVar, boolean z, dccx<String> dccxVar) {
        int i6;
        String d2 = z ? zwsVar.d() : zwsVar.c();
        if (TextUtils.isEmpty(d2)) {
            return;
        }
        Paint paint = H;
        paint.setTypeface(this.F);
        paint.setTextSize(this.G);
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(this.E);
        paint.setStyle(Paint.Style.FILL);
        int length = d2.length();
        Rect rect = K;
        paint.getTextBounds(d2, 0, length, rect);
        int height = ((i3 + i5) + rect.height()) / 2;
        if (zwsVar.b()) {
            i6 = i2 + (this.o.equals(dour.RIGHT_TO_LEFT) ? Math.round((i4 - i2) * 1.2678571f) / 2 : Math.round((i4 - i2) * 0.73214287f) / 2);
        } else {
            i6 = (i2 + i4) / 2;
        }
        canvas.drawText(d2, i6, height, paint);
        dccxVar.g(d2);
    }

    private final zwt m(int i2, boolean z) {
        if (i2 <= 0) {
            return this.p;
        }
        int i3 = true != z ? 0 : i2;
        int i4 = ((zsw) this.p).a;
        int i5 = this.A;
        int max = Math.max(i4 - i2, i5 + i5);
        int i6 = ((zsw) this.p).b;
        int i7 = this.A;
        int max2 = Math.max(i6 - i2, i7 + i7);
        int i8 = ((zsw) this.p).c;
        int i9 = this.A;
        int max3 = Math.max(i8 - i3, i9 + i9);
        int i10 = ((zsw) this.p).d;
        int i11 = this.A;
        return zwt.e(max, max2, max3, Math.max(i10 - i3, i11 + i11));
    }

    final int d(zwt zwtVar) {
        int i2;
        int i3 = 0;
        for (zws zwsVar : this.m) {
            if (zwsVar.a()) {
                i2 = zwsVar.b() ? ((zsw) zwtVar).d : ((zsw) zwtVar).c;
            } else {
                i2 = zwsVar.b() ? ((zsw) zwtVar).b : ((zsw) zwtVar).a;
            }
            i3 += i2;
        }
        return i3 + Math.max((this.m.size() - 1) * this.u, 0);
    }

    final int e() {
        return d(this.p);
    }

    final int f(zws zwsVar) {
        return zwsVar.a() ? this.v : this.w;
    }

    final int g(zws zwsVar) {
        return zwsVar.a() ? this.C : this.B;
    }

    final int h(zws zwsVar) {
        return zwsVar.a() ? this.C : this.D;
    }

    public final int i() {
        return this.m.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
        if (d(r3) <= r1) goto L19;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final void onDraw(android.graphics.Canvas r30) {
        /*
            Method dump skipped, instructions count: 921
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zwu.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    protected final void onMeasure(int i2, int i3) {
        int b2 = akn.b(e(), this.y, this.x);
        int i4 = this.w;
        Iterator<zws> it = this.m.iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().a()) {
                    i4 = this.v;
                    break;
                }
            } else {
                break;
            }
        }
        setMeasuredDimension(j(b2, i2), j(i4, i3));
    }

    public void setTrainCarDirectionOfMotion(dour dourVar) {
        this.o = dourVar;
    }

    public void setTrainCars(List<zws> list) {
        this.m = list;
        requestLayout();
    }
}
