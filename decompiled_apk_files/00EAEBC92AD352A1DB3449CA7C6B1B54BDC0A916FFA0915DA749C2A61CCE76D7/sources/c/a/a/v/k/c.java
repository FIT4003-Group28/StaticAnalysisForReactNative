package c.a.a.v.k;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f2473a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f2474b;

    public c(float[] fArr, int[] iArr) {
        this.f2473a = fArr;
        this.f2474b = iArr;
    }

    public void a(c cVar, c cVar2, float f2) {
        if (cVar.f2474b.length == cVar2.f2474b.length) {
            for (int i = 0; i < cVar.f2474b.length; i++) {
                this.f2473a[i] = c.a.a.y.g.c(cVar.f2473a[i], cVar2.f2473a[i], f2);
                this.f2474b[i] = c.a.a.y.b.a(f2, cVar.f2474b[i], cVar2.f2474b[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + cVar.f2474b.length + " vs " + cVar2.f2474b.length + ")");
    }

    public int[] a() {
        return this.f2474b;
    }

    public float[] b() {
        return this.f2473a;
    }

    public int c() {
        return this.f2474b.length;
    }
}
