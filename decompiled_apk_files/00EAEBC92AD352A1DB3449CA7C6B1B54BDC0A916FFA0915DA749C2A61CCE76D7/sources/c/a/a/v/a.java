package c.a.a.v;

import android.graphics.PointF;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final PointF f2419a;

    /* renamed from: b  reason: collision with root package name */
    private final PointF f2420b;

    /* renamed from: c  reason: collision with root package name */
    private final PointF f2421c;

    public a() {
        this.f2419a = new PointF();
        this.f2420b = new PointF();
        this.f2421c = new PointF();
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f2419a = pointF;
        this.f2420b = pointF2;
        this.f2421c = pointF3;
    }

    public PointF a() {
        return this.f2419a;
    }

    public void a(float f2, float f3) {
        this.f2419a.set(f2, f3);
    }

    public PointF b() {
        return this.f2420b;
    }

    public void b(float f2, float f3) {
        this.f2420b.set(f2, f3);
    }

    public PointF c() {
        return this.f2421c;
    }

    public void c(float f2, float f3) {
        this.f2421c.set(f2, f3);
    }
}
