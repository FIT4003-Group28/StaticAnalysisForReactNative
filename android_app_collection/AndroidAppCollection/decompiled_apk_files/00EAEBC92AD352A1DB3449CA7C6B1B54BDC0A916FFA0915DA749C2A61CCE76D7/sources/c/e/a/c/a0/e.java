package c.e.a.c.a0;
/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: a  reason: collision with root package name */
    float f4659a = -1.0f;

    @Override // c.e.a.c.a0.d
    public void a(m mVar, float f2, float f3, float f4) {
        mVar.a(0.0f, f4 * f3, 180.0f, 180.0f - f2);
        double d2 = f4;
        double d3 = f3;
        mVar.a((float) (Math.sin(Math.toRadians(f2)) * d2 * d3), (float) (Math.sin(Math.toRadians(90.0f - f2)) * d2 * d3));
    }
}
