package defpackage;

import android.graphics.PointF;
import android.view.animation.Interpolator;
/* compiled from: PG */
/* renamed from: bpt  reason: default package */
/* loaded from: classes4.dex */
public class bpt<T> {
    private final bis a;
    public final T b;
    public T c;
    public final Interpolator d;
    public final float e;
    public Float f;
    public float g;
    public float h;
    public int i;
    public int j;
    public PointF k;
    public PointF l;
    private float m;
    private float n;

    public bpt(bis bisVar, T t, T t2, Interpolator interpolator, float f, Float f2) {
        this.g = -3987645.8f;
        this.h = -3987645.8f;
        this.i = 784923401;
        this.j = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.k = null;
        this.l = null;
        this.a = bisVar;
        this.b = t;
        this.c = t2;
        this.d = interpolator;
        this.e = f;
        this.f = f2;
    }

    public bpt(T t) {
        this.g = -3987645.8f;
        this.h = -3987645.8f;
        this.i = 784923401;
        this.j = 784923401;
        this.m = Float.MIN_VALUE;
        this.n = Float.MIN_VALUE;
        this.k = null;
        this.l = null;
        this.a = null;
        this.b = t;
        this.c = t;
        this.d = null;
        this.e = Float.MIN_VALUE;
        this.f = Float.valueOf(Float.MAX_VALUE);
    }

    public final float b() {
        bis bisVar = this.a;
        if (bisVar == null) {
            return 0.0f;
        }
        float f = this.m;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        float g = (this.e - bisVar.j) / bisVar.g();
        this.m = g;
        return g;
    }

    public final float c() {
        if (this.a == null) {
            return 1.0f;
        }
        float f = this.n;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        if (this.f == null) {
            this.n = 1.0f;
            return 1.0f;
        }
        float floatValue = ((this.f.floatValue() - this.e) / this.a.g()) + b();
        this.n = floatValue;
        return floatValue;
    }

    public final boolean d() {
        return this.d == null;
    }

    public final boolean e(float f) {
        return f >= b() && f < c();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        float f = this.e;
        String valueOf3 = String.valueOf(this.f);
        String valueOf4 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 86 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("Keyframe{startValue=");
        sb.append(valueOf);
        sb.append(", endValue=");
        sb.append(valueOf2);
        sb.append(", startFrame=");
        sb.append(f);
        sb.append(", endFrame=");
        sb.append(valueOf3);
        sb.append(", interpolator=");
        sb.append(valueOf4);
        sb.append('}');
        return sb.toString();
    }
}
