package c.a.a.v;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f2422a;

    /* renamed from: b  reason: collision with root package name */
    public final String f2423b;

    /* renamed from: c  reason: collision with root package name */
    public final double f2424c;

    /* renamed from: d  reason: collision with root package name */
    public final a f2425d;

    /* renamed from: e  reason: collision with root package name */
    public final int f2426e;

    /* renamed from: f  reason: collision with root package name */
    public final double f2427f;

    /* renamed from: g  reason: collision with root package name */
    public final double f2428g;

    /* renamed from: h  reason: collision with root package name */
    public final int f2429h;
    public final int i;
    public final double j;
    public final boolean k;

    /* loaded from: classes.dex */
    public enum a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public b(String str, String str2, double d2, a aVar, int i, double d3, double d4, int i2, int i3, double d5, boolean z) {
        this.f2422a = str;
        this.f2423b = str2;
        this.f2424c = d2;
        this.f2425d = aVar;
        this.f2426e = i;
        this.f2427f = d3;
        this.f2428g = d4;
        this.f2429h = i2;
        this.i = i3;
        this.j = d5;
        this.k = z;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f2422a.hashCode() * 31) + this.f2423b.hashCode()) * 31) + this.f2424c)) * 31) + this.f2425d.ordinal()) * 31) + this.f2426e;
        long doubleToLongBits = Double.doubleToLongBits(this.f2427f);
        return (((hashCode * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.f2429h;
    }
}
