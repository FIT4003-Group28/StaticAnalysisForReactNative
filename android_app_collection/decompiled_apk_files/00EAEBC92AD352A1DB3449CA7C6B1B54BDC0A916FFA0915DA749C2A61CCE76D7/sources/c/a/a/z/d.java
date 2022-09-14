package c.a.a.z;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private float f2712a;

    /* renamed from: b  reason: collision with root package name */
    private float f2713b;

    public d() {
        this(1.0f, 1.0f);
    }

    public d(float f2, float f3) {
        this.f2712a = f2;
        this.f2713b = f3;
    }

    public float a() {
        return this.f2712a;
    }

    public boolean a(float f2, float f3) {
        return this.f2712a == f2 && this.f2713b == f3;
    }

    public float b() {
        return this.f2713b;
    }

    public void b(float f2, float f3) {
        this.f2712a = f2;
        this.f2713b = f3;
    }

    public String toString() {
        return a() + "x" + b();
    }
}
