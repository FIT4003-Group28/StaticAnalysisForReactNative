package defpackage;
/* compiled from: PG */
/* renamed from: ahrt  reason: default package */
/* loaded from: classes.dex */
public final class ahrt {
    static final dzpe<ahrs> a;
    static final dzpe<ahrs> b;
    public float c;
    float d;
    float e;
    long f;
    float g;
    long h;
    public float i;
    public long j;
    long k;
    float l;
    float m;
    public final ahru n;
    public final ahru o;
    final ahru p;
    public boolean q;
    private final dzpe<ahrs> r;
    private final dzpe<ahrs> s;
    private final dzpe<ahrs> t;

    static {
        dzpe<ahrs> dzpeVar = new dzpe<>();
        a = dzpeVar;
        dzpeVar.a(ahrs.DEVICE_MAGNETOMETER_ACCURACY, 6.26f);
        dzpeVar.a(ahrs.MAGNETIC_FIELD_STRENGTH_DIFF_FROM_IDEAL_MICROT, 0.87f);
        dzpeVar.a(ahrs.MAGNETIC_FIELD_STRENGTH_DEVIATION, 1.32f);
        dzpeVar.a(ahrs.CORRELATION_BETWEEN_DEVICE_AND_GYRO_ORIENTATION_CHANGES, -15.25f);
        dzpeVar.a(ahrs.RMS_DIFF_BETWEEN_DEVICE_AND_GYRO_ORIENTATION_CHANGES, 0.02f);
        dzpeVar.a(ahrs.CROSS_BETWEEN_ORIENTATION_CORRELATION_AND_ORIENTATION_RMS_DIFF, 15.77f);
        dzpeVar.a(ahrs.CROSS_BETWEEN_MAG_STRENGTH_DIFF_AND_MAG_STRENGTH_DEVIATION, 0.02f);
        dzpe<ahrs> dzpeVar2 = new dzpe<>();
        b = dzpeVar2;
        dzpeVar2.a(ahrs.DEVICE_MAGNETOMETER_ACCURACY, 6.26f);
        dzpeVar2.a(ahrs.MAGNETIC_FIELD_STRENGTH_DIFF_FROM_IDEAL_MICROT, 1.6f);
        dzpeVar2.a(ahrs.MAGNETIC_FIELD_STRENGTH_DEVIATION, 3.2f);
        dzpeVar2.a(ahrs.CROSS_BETWEEN_MAG_STRENGTH_DIFF_AND_MAG_STRENGTH_DEVIATION, 0.1f);
    }

    public ahrt() {
        this.d = Float.NaN;
        this.e = Float.NaN;
        this.f = Long.MIN_VALUE;
        this.g = Float.NaN;
        this.h = Long.MIN_VALUE;
        this.i = Float.NaN;
        this.j = Long.MIN_VALUE;
        this.k = Long.MIN_VALUE;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = new ahru();
        this.o = new ahru();
        this.p = new ahru();
        this.q = true;
        this.t = new dzpe<>();
        this.c = 45.0f;
        throw null;
    }

    public final void a(float f, long j) {
        if (Float.isNaN(f)) {
            return;
        }
        if (!Float.isNaN(this.g)) {
            f = ahrr.b((akrb.h(f, this.g) * 0.7f) + f, -180.0f, 180.0f);
        }
        this.g = f;
        this.h = j;
    }

    public final float b() {
        if (!c()) {
            return -1.0f;
        }
        dzpe<ahrs> d = d();
        dzrn<ahrs> a2 = d.keySet().a();
        float f = 0.0f;
        float f2 = 0.0f;
        while (a2.hasNext()) {
            ahrs next = a2.next();
            if (this.r.containsKey(next)) {
                f2 += this.r.g(next) * d.g(next);
            }
            if (this.s.containsKey(next)) {
                f += this.s.g(next) * d.g(next);
            }
        }
        if (this.q && f >= 30.0f && f <= 60.0f) {
            f = f2;
        }
        return Math.min(Math.max(f, 0.0f), 180.0f);
    }

    public final boolean c() {
        return this.n.b == 10 && this.o.b == 10 && this.p.b == 10 && !Float.isNaN(this.d) && !Float.isNaN(this.e);
    }

    public final dzpe<ahrs> d() {
        ahru ahruVar;
        float sqrt;
        float f;
        this.t.clear();
        if (Float.isNaN(this.d) || Float.isNaN(this.e) || this.n.b != 10 || this.o.b != 10 || this.p.b != 10) {
            return this.t;
        }
        this.q = true;
        this.t.a(ahrs.DEVICE_MAGNETOMETER_ACCURACY, this.d < 2.5f ? 3.0f : 1.0f);
        float f2 = this.c - this.e;
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            f2 += f2;
        }
        float abs = Math.abs(f2);
        this.t.a(ahrs.MAGNETIC_FIELD_STRENGTH_DIFF_FROM_IDEAL_MICROT, abs);
        float a2 = (float) this.p.a();
        this.t.a(ahrs.MAGNETIC_FIELD_STRENGTH_DEVIATION, a2);
        this.t.a(ahrs.CROSS_BETWEEN_MAG_STRENGTH_DIFF_AND_MAG_STRENGTH_DEVIATION, a2 * abs);
        double a3 = this.o.a();
        double a4 = this.n.a();
        if (a3 < 3.0d && (a4 < 5.0d || a4 > 300.0d)) {
            this.q = false;
        }
        ahru ahruVar2 = this.n;
        ahru ahruVar3 = this.o;
        int i = ahruVar2.b;
        int i2 = ahruVar3.b;
        float f4 = Float.NaN;
        if (i == i2 && i >= 2) {
            if (i == i2) {
                for (int i3 = 0; i3 < ahruVar2.b; i3++) {
                    if (ahruVar2.a[i3] == ahruVar3.d(i3)) {
                    }
                }
                f4 = 1.0f;
            }
            int i4 = ahruVar2.b;
            float f5 = 0.0f;
            float f6 = 0.0f;
            float f7 = 0.0f;
            float f8 = 0.0f;
            float f9 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f6 += ahruVar2.d(i5);
                f8 += ahruVar2.d(i5) * ahruVar2.d(i5);
                f7 += ahruVar3.d(i5);
                f9 += ahruVar3.d(i5) * ahruVar3.d(i5);
                f5 += ahruVar2.d(i5) * ahruVar3.d(i5);
            }
            double d = (f5 * i4) - (f6 * f7);
            double sqrt2 = Math.sqrt(((f8 * f) - (f6 * f6)) * ((f * f9) - (f7 * f7)));
            Double.isNaN(d);
            f4 = (float) (d / sqrt2);
            if (Float.isNaN(f4)) {
                f4 = 0.0f;
            }
        }
        ahru ahruVar4 = this.n;
        if (ahruVar4.b != this.o.b) {
            sqrt = 0.0f;
        } else {
            double d2 = dcyn.a;
            for (int i6 = 0; i6 < ahruVar4.b; i6++) {
                d2 += Math.pow(ahrr.b(ahruVar4.d(i6) - ahruVar.d(i6), -180.0f, 180.0f), 2.0d);
            }
            sqrt = (float) Math.sqrt(d2);
        }
        if (Math.log(Math.max((1.0f - f4) * sqrt, 2.718281828459045d)) > 5.199999809265137d) {
            this.q = false;
        }
        if ((f4 >= -0.4f || abs >= 30.0f) && ((f4 >= -0.4f || abs >= 30.0f) && (f4 >= -0.4f || this.d != 2.5f))) {
            f3 = f4;
        }
        this.t.a(ahrs.CORRELATION_BETWEEN_DEVICE_AND_GYRO_ORIENTATION_CHANGES, f3);
        this.t.a(ahrs.RMS_DIFF_BETWEEN_DEVICE_AND_GYRO_ORIENTATION_CHANGES, sqrt);
        this.t.a(ahrs.CROSS_BETWEEN_ORIENTATION_CORRELATION_AND_ORIENTATION_RMS_DIFF, (float) Math.log(Math.max((1.0f - f3) * sqrt, 2.718281828459045d)));
        return this.t;
    }

    public final void e(Long l) {
        if (this.k == Long.MIN_VALUE || l.longValue() - this.k >= 500) {
            if (this.f != Long.MIN_VALUE && !Float.isNaN(this.e)) {
                this.p.b(this.e);
            }
            if (this.h != Long.MIN_VALUE && !Float.isNaN(this.g) && !Float.isNaN(this.l)) {
                this.n.b(ahrr.b(this.g - this.l, -180.0f, 180.0f));
            }
            if (this.j != Long.MIN_VALUE && l.longValue() - this.j <= 500 && !Float.isNaN(this.i) && !Float.isNaN(this.m)) {
                this.o.b(ahrr.b(this.i - this.m, -180.0f, 180.0f));
            } else if (this.j != Long.MIN_VALUE && l.longValue() - this.j > 500) {
                this.o.b(1.0f);
            }
            this.l = this.g;
            this.m = this.i;
            this.k = l.longValue();
        }
    }

    public ahrt(float f) {
        this.d = Float.NaN;
        this.e = Float.NaN;
        this.f = Long.MIN_VALUE;
        this.g = Float.NaN;
        this.h = Long.MIN_VALUE;
        this.i = Float.NaN;
        this.j = Long.MIN_VALUE;
        this.k = Long.MIN_VALUE;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = new ahru();
        this.o = new ahru();
        this.p = new ahru();
        this.q = true;
        this.t = new dzpe<>();
        this.c = f;
        this.r = a;
        this.s = b;
    }
}
