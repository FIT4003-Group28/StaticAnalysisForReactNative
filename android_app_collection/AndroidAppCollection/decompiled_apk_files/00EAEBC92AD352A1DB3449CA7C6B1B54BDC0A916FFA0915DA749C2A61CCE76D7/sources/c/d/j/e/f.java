package c.d.j.e;
/* loaded from: classes.dex */
public class f {

    /* renamed from: c  reason: collision with root package name */
    private static final f f3270c = new f(-1, false);

    /* renamed from: d  reason: collision with root package name */
    private static final f f3271d = new f(-2, false);

    /* renamed from: e  reason: collision with root package name */
    private static final f f3272e = new f(-1, true);

    /* renamed from: a  reason: collision with root package name */
    private final int f3273a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f3274b;

    private f(int i, boolean z) {
        this.f3273a = i;
        this.f3274b = z;
    }

    public static f e() {
        return f3270c;
    }

    public static f f() {
        return f3272e;
    }

    public static f g() {
        return f3271d;
    }

    public boolean a() {
        return this.f3274b;
    }

    public int b() {
        if (!d()) {
            return this.f3273a;
        }
        throw new IllegalStateException("Rotation is set to use EXIF");
    }

    public boolean c() {
        return this.f3273a != -2;
    }

    public boolean d() {
        return this.f3273a == -1;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f3273a == fVar.f3273a && this.f3274b == fVar.f3274b;
    }

    public int hashCode() {
        return c.d.d.k.b.a(Integer.valueOf(this.f3273a), Boolean.valueOf(this.f3274b));
    }

    public String toString() {
        return String.format(null, "%d defer:%b", Integer.valueOf(this.f3273a), Boolean.valueOf(this.f3274b));
    }
}
