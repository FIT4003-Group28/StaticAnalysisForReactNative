package c.d.j.e;

import c.d.d.d.i;
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final int f3266a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3267b;

    /* renamed from: c  reason: collision with root package name */
    public final float f3268c;

    /* renamed from: d  reason: collision with root package name */
    public final float f3269d;

    public e(int i, int i2) {
        this(i, i2, 2048.0f);
    }

    public e(int i, int i2, float f2) {
        this(i, i2, f2, 0.6666667f);
    }

    public e(int i, int i2, float f2, float f3) {
        boolean z = true;
        i.a(i > 0);
        i.a(i2 <= 0 ? false : z);
        this.f3266a = i;
        this.f3267b = i2;
        this.f3268c = f2;
        this.f3269d = f3;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f3266a == eVar.f3266a && this.f3267b == eVar.f3267b;
    }

    public int hashCode() {
        return c.d.d.k.b.a(this.f3266a, this.f3267b);
    }

    public String toString() {
        return String.format(null, "%dx%d", Integer.valueOf(this.f3266a), Integer.valueOf(this.f3267b));
    }
}
