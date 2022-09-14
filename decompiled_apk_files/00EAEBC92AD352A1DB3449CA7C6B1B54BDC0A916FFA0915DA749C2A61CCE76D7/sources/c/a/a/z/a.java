package c.a.a.z;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import c.a.a.e;
/* loaded from: classes.dex */
public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final e f2702a;

    /* renamed from: b  reason: collision with root package name */
    public final T f2703b;

    /* renamed from: c  reason: collision with root package name */
    public T f2704c;

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f2705d;

    /* renamed from: e  reason: collision with root package name */
    public final float f2706e;

    /* renamed from: f  reason: collision with root package name */
    public Float f2707f;

    /* renamed from: g  reason: collision with root package name */
    private float f2708g;

    /* renamed from: h  reason: collision with root package name */
    private float f2709h;
    private int i;
    private int j;
    private float k;
    private float l;
    public PointF m;
    public PointF n;

    public a(e eVar, T t, T t2, Interpolator interpolator, float f2, Float f3) {
        this.f2708g = -3987645.8f;
        this.f2709h = -3987645.8f;
        this.i = 784923401;
        this.j = 784923401;
        this.k = Float.MIN_VALUE;
        this.l = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.f2702a = eVar;
        this.f2703b = t;
        this.f2704c = t2;
        this.f2705d = interpolator;
        this.f2706e = f2;
        this.f2707f = f3;
    }

    public a(T t) {
        this.f2708g = -3987645.8f;
        this.f2709h = -3987645.8f;
        this.i = 784923401;
        this.j = 784923401;
        this.k = Float.MIN_VALUE;
        this.l = Float.MIN_VALUE;
        this.m = null;
        this.n = null;
        this.f2702a = null;
        this.f2703b = t;
        this.f2704c = t;
        this.f2705d = null;
        this.f2706e = Float.MIN_VALUE;
        this.f2707f = Float.valueOf(Float.MAX_VALUE);
    }

    public float a() {
        if (this.f2702a == null) {
            return 1.0f;
        }
        if (this.l == Float.MIN_VALUE) {
            if (this.f2707f == null) {
                this.l = 1.0f;
            } else {
                this.l = d() + ((this.f2707f.floatValue() - this.f2706e) / this.f2702a.d());
            }
        }
        return this.l;
    }

    public boolean a(float f2) {
        return f2 >= d() && f2 < a();
    }

    public float b() {
        if (this.f2709h == -3987645.8f) {
            this.f2709h = ((Float) this.f2704c).floatValue();
        }
        return this.f2709h;
    }

    public int c() {
        if (this.j == 784923401) {
            this.j = ((Integer) this.f2704c).intValue();
        }
        return this.j;
    }

    public float d() {
        e eVar = this.f2702a;
        if (eVar == null) {
            return 0.0f;
        }
        if (this.k == Float.MIN_VALUE) {
            this.k = (this.f2706e - eVar.l()) / this.f2702a.d();
        }
        return this.k;
    }

    public float e() {
        if (this.f2708g == -3987645.8f) {
            this.f2708g = ((Float) this.f2703b).floatValue();
        }
        return this.f2708g;
    }

    public int f() {
        if (this.i == 784923401) {
            this.i = ((Integer) this.f2703b).intValue();
        }
        return this.i;
    }

    public boolean g() {
        return this.f2705d == null;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f2703b + ", endValue=" + this.f2704c + ", startFrame=" + this.f2706e + ", endFrame=" + this.f2707f + ", interpolator=" + this.f2705d + '}';
    }
}
