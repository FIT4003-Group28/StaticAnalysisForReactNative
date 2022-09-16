package defpackage;
/* compiled from: PG */
/* renamed from: anxy  reason: default package */
/* loaded from: classes.dex */
public final class anxy {
    public final Class a;
    public final int b;
    private final int c;

    public anxy(Class cls, int i, int i2) {
        this.a = cls;
        this.b = i;
        this.c = i2;
    }

    public static anxy a(Class cls) {
        return new anxy(cls, 0, 0);
    }

    public static anxy b(Class cls) {
        return new anxy(cls, 0, 1);
    }

    public static anxy c(Class cls) {
        return new anxy(cls, 1, 0);
    }

    public final boolean d() {
        return this.c == 0;
    }

    public final boolean e() {
        return this.b == 2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof anxy) {
            anxy anxyVar = (anxy) obj;
            if (this.a == anxyVar.a && this.b == anxyVar.b && this.c == anxyVar.c) {
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
        sb.append(i == 1 ? "required" : i == 0 ? "optional" : "set");
        sb.append(", injection=");
        sb.append(this.c != 0 ? "provider" : "direct");
        sb.append("}");
        return sb.toString();
    }
}
