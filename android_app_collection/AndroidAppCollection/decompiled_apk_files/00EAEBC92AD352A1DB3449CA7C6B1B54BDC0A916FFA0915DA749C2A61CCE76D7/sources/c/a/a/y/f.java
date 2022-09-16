package c.a.a.y;
/* loaded from: classes.dex */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private float f2693a;

    /* renamed from: b  reason: collision with root package name */
    private int f2694b;

    public void a(float f2) {
        this.f2693a += f2;
        this.f2694b++;
        int i = this.f2694b;
        if (i == Integer.MAX_VALUE) {
            this.f2693a /= 2.0f;
            this.f2694b = i / 2;
        }
    }
}
