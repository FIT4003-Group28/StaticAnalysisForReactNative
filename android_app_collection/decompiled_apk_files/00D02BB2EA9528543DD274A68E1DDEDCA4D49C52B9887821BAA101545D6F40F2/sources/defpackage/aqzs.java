package defpackage;

import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.gmm.location.events.CarHeadingEvent;
import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aqzs  reason: default package */
/* loaded from: classes.dex */
public final class aqzs implements aqzu {
    private static final TypeEvaluator<akra> A;
    private static final TimeInterpolator B;
    private static final TimeInterpolator C;
    private static final TimeInterpolator D;
    private static final TimeInterpolator E;
    static final long a;
    static final long b;
    static final long c;
    public static final TimeInterpolator g;
    private static final long h;
    private static final TimeInterpolator i;
    private final ValueAnimator F;
    private final ValueAnimator G;
    private final ValueAnimator H;
    private final ValueAnimator I;
    private final ValueAnimator J;
    private final List<ValueAnimator> K;
    private int L;
    private int M;
    final ValueAnimator d;
    final ValueAnimator e;
    public final area f;
    private long j;
    private long k;
    private final area l;
    private final area m;
    private final aqzw n;
    private float o;
    private double p;
    private float q;
    private float r;
    private float s;
    private float t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private float y;
    private float z;

    static {
        long millis = TimeUnit.SECONDS.toMillis(1L);
        a = millis;
        b = millis;
        c = TimeUnit.MINUTES.toMillis(1L);
        h = TimeUnit.SECONDS.toMillis(3L);
        i = eho.a(0.33f, 0.0f, 0.67f, 1.0f);
        A = new aqzi();
        B = new LinearInterpolator();
        g = new AccelerateDecelerateInterpolator();
        C = new aqzj();
        D = new aqzk();
        E = new aqzl();
    }

    public aqzs(duwo duwoVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.d = valueAnimator;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        this.e = valueAnimator2;
        this.j = 0L;
        this.k = 500L;
        this.l = new area();
        this.m = new area();
        this.f = new area();
        this.n = new aqzw();
        this.o = 1.0f;
        this.p = 1.0d;
        this.q = 1.0f;
        this.r = 0.0f;
        this.s = 0.0f;
        this.t = 0.0f;
        this.u = false;
        this.v = false;
        this.w = true;
        this.x = false;
        this.y = -1.0f;
        this.z = -1.0f;
        this.L = 1;
        this.M = 1;
        ValueAnimator valueAnimator3 = new ValueAnimator();
        this.F = valueAnimator3;
        ValueAnimator valueAnimator4 = new ValueAnimator();
        this.G = valueAnimator4;
        ValueAnimator valueAnimator5 = new ValueAnimator();
        this.H = valueAnimator5;
        ValueAnimator valueAnimator6 = new ValueAnimator();
        this.I = valueAnimator6;
        ValueAnimator valueAnimator7 = new ValueAnimator();
        this.J = valueAnimator7;
        this.K = dchl.b(valueAnimator5, valueAnimator3, valueAnimator4, valueAnimator6, valueAnimator7);
        valueAnimator5.addUpdateListener(new aqzm(this));
        valueAnimator6.addUpdateListener(new aqzn(this));
        valueAnimator4.addUpdateListener(new aqzo(this));
        valueAnimator3.addUpdateListener(new aqzp(this));
        valueAnimator7.addUpdateListener(new aqzq(this));
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setDuration(a);
        valueAnimator.setInterpolator(B);
        valueAnimator.setRepeatCount(5);
        valueAnimator.setRepeatMode(2);
        boolean z = duwoVar.a;
        this.x = z;
        if (z) {
            valueAnimator2.setFloatValues(0.82f, 0.62f, 0.72f, 0.82f);
            valueAnimator2.setDuration(h);
            valueAnimator2.setInterpolator(i);
            valueAnimator2.setRepeatCount(duwoVar.b);
            valueAnimator2.setRepeatMode(1);
        }
    }

    private final boolean p(long j) {
        long j2 = this.j;
        return j >= j2 && j <= this.k + j2;
    }

    private final float q(float f) {
        return (f / this.o) / this.q;
    }

    private final float r(float f) {
        double d = f;
        double d2 = this.p;
        Double.isNaN(d);
        return q((float) (d * d2));
    }

    private final void s(area areaVar) {
        if (r(areaVar.i) >= 17.0f || this.t >= 12.0f) {
            return;
        }
        areaVar.i = 0;
    }

    private final void t(long j) {
        int size = this.K.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.K.get(i2).setDuration(j);
        }
        this.k = j;
    }

    @Override // defpackage.aqzu
    public final void a(area areaVar) {
        area areaVar2 = this.f;
        areaVar.a = areaVar2.a;
        areaVar.j = areaVar2.a();
        area areaVar3 = this.f;
        areaVar.i = areaVar3.i;
        areaVar.m = areaVar3.m;
        areaVar.e = this.n.a;
        boolean z = true;
        areaVar.k = this.y != -1.0f;
        float f = this.z;
        areaVar.h = f;
        if (f == -1.0f) {
            z = false;
        }
        areaVar.l = z;
        float f2 = 1.0f;
        if (this.d.isRunning()) {
            areaVar.r = ((Float) this.d.getAnimatedValue()).floatValue();
        } else {
            areaVar.r = 1.0f;
        }
        float f3 = this.f.q;
        float f4 = this.t;
        if (f4 < 16.0f) {
            f2 = f4 < 12.0f ? 0.75f : ((f4 - 12.0f) * 0.0625f) + 0.75f;
        }
        areaVar.q = f3 * f2;
        if (this.e.isRunning()) {
            areaVar.s = ((Float) this.e.getAnimatedValue()).floatValue();
        } else {
            areaVar.s = 0.82f;
        }
        s(areaVar);
    }

    @Override // defpackage.aqzu
    public final void c(akzh akzhVar) {
        this.o = akyx.e(akzhVar);
        this.q = akzhVar.B();
        this.r = akzhVar.y() / this.q;
        this.s = akzhVar.z() / this.q;
        this.p = akzhVar.g().r();
        this.t = akzhVar.p().k;
    }

    @Override // defpackage.aqzu, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aqzt.a(this);
    }

    @Override // defpackage.aqzu
    public final void d() {
        if (this.w && !this.d.isRunning()) {
            this.d.start();
        }
    }

    @Override // defpackage.aqzu
    public final void e() {
        if (this.x) {
            ValueAnimator valueAnimator = this.e;
            if (valueAnimator.isRunning()) {
                return;
            }
            valueAnimator.start();
        }
    }

    @Override // defpackage.aqzu
    public final void f() {
        this.d.end();
    }

    @Override // defpackage.aqzu
    public final void g() {
        if (this.e.isRunning()) {
            this.e.end();
        }
    }

    @Override // defpackage.aqzu
    public final boolean h(GmmLocation gmmLocation) {
        this.v = true;
        area areaVar = this.m;
        akra C2 = gmmLocation.C();
        int i2 = -1;
        if (gmmLocation != null && gmmLocation.hasBearing()) {
            i2 = (int) gmmLocation.getBearing();
        }
        areaVar.c(C2, i2, gmmLocation.hasAccuracy() ? (int) gmmLocation.getAccuracy() : 1, gmmLocation.hasBearing());
        return true;
    }

    @Override // defpackage.aqzu
    public final void i(AndroidLocationEvent androidLocationEvent) {
    }

    @Override // defpackage.aqzu
    public final boolean j(CarHeadingEvent carHeadingEvent) {
        return false;
    }

    @Override // defpackage.aqzu
    public final boolean k(float f) {
        this.n.a(f);
        this.y = f;
        return true;
    }

    @Override // defpackage.aqzu
    public final void l(float f) {
        this.z = f;
    }

    @Override // defpackage.aqzu
    public final void m(boolean z) {
    }

    @Override // defpackage.aqzu
    public final void n() {
        this.u = false;
        this.v = false;
        e();
    }

    @Override // defpackage.aqzu
    public final void o() {
        this.w = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c9, code lost:
        if (r3 != false) goto L35;
     */
    @Override // defpackage.aqzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(long r18) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqzs.b(long):boolean");
    }
}
