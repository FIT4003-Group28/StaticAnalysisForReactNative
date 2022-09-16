package defpackage;
/* compiled from: PG */
/* renamed from: vpf  reason: default package */
/* loaded from: classes4.dex */
public final class vpf {
    public final String a;
    public final Class b;

    public vpf(String str, Class cls) {
        this.a = str;
        this.b = cls;
    }

    public static vpf a(String str) {
        return new vpf(str, Boolean.class);
    }

    public static vpf b(String str) {
        return new vpf(str, Integer.class);
    }

    public static vpf c(String str) {
        return new vpf(str, String.class);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vpf) {
            vpf vpfVar = (vpf) obj;
            if (this.b == vpfVar.b && this.a.equals(vpfVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return String.format("(%s, %s)", this.a, this.b);
    }
}
