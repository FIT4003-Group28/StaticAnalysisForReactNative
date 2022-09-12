package defpackage;
/* compiled from: PG */
/* renamed from: depi  reason: default package */
/* loaded from: classes6.dex */
public final class depi {
    public final Class<?> a;
    public final int b;
    private final int c;

    private depi(Class<?> cls, int i, int i2) {
        depp.checkNotNull(cls, "Null dependency anInterface.");
        this.a = cls;
        this.b = i;
        this.c = i2;
    }

    public static depi optional(Class<?> cls) {
        return new depi(cls, 0, 0);
    }

    public static depi optionalProvider(Class<?> cls) {
        return new depi(cls, 0, 1);
    }

    public static depi required(Class<?> cls) {
        return new depi(cls, 1, 0);
    }

    public static depi requiredProvider(Class<?> cls) {
        return new depi(cls, 1, 1);
    }

    public static depi setOf(Class<?> cls) {
        return new depi(cls, 2, 0);
    }

    public static depi setOfProvider(Class<?> cls) {
        return new depi(cls, 2, 1);
    }

    public final boolean a() {
        return this.b == 2;
    }

    public final boolean b() {
        return this.c == 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof depi) {
            depi depiVar = (depi) obj;
            if (this.a == depiVar.a && this.b == depiVar.b && this.c == depiVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        int i = this.b;
        boolean z = true;
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", direct=");
        if (1 != (this.c ^ 1)) {
            z = false;
        }
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
