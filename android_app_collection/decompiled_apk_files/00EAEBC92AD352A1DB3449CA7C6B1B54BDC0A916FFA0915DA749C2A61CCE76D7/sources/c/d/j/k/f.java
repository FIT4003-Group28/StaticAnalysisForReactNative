package c.d.j.k;
/* loaded from: classes.dex */
public class f implements g {

    /* renamed from: d  reason: collision with root package name */
    public static final g f3386d = a(Integer.MAX_VALUE, true, true);

    /* renamed from: a  reason: collision with root package name */
    int f3387a;

    /* renamed from: b  reason: collision with root package name */
    boolean f3388b;

    /* renamed from: c  reason: collision with root package name */
    boolean f3389c;

    private f(int i, boolean z, boolean z2) {
        this.f3387a = i;
        this.f3388b = z;
        this.f3389c = z2;
    }

    public static g a(int i, boolean z, boolean z2) {
        return new f(i, z, z2);
    }

    @Override // c.d.j.k.g
    public boolean a() {
        return this.f3389c;
    }

    @Override // c.d.j.k.g
    public boolean b() {
        return this.f3388b;
    }

    @Override // c.d.j.k.g
    public int c() {
        return this.f3387a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f3387a == fVar.f3387a && this.f3388b == fVar.f3388b && this.f3389c == fVar.f3389c;
    }

    public int hashCode() {
        int i = 0;
        int i2 = this.f3387a ^ (this.f3388b ? 4194304 : 0);
        if (this.f3389c) {
            i = 8388608;
        }
        return i2 ^ i;
    }
}
