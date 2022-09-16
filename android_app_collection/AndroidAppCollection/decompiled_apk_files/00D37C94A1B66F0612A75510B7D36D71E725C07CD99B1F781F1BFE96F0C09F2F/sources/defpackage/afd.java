package defpackage;
/* compiled from: PG */
/* renamed from: afd  reason: default package */
/* loaded from: classes.dex */
public final class afd {
    public final String a;
    private final Class b;

    public afd(String str, Class cls) {
        this.a = str;
        if (cls != null) {
            this.b = cls;
            return;
        }
        throw new NullPointerException("Null valueClass");
    }

    public static afd a(String str, Class cls) {
        return new afd(str, cls);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof afd) {
            afd afdVar = (afd) obj;
            if (this.a.equals(afdVar.a) && this.b.equals(afdVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
    }

    public final String toString() {
        return "Option{id=" + this.a + ", valueClass=" + this.b + ", token=" + ((Object) null) + "}";
    }

    public afd() {
    }
}
