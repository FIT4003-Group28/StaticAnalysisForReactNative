package defpackage;
/* compiled from: PG */
/* renamed from: cznf  reason: default package */
/* loaded from: classes5.dex */
public final class cznf<T> {
    public final String a;
    public final Class<T> b;

    public cznf(String str, Class<T> cls) {
        this.a = str;
        this.b = cls;
    }

    public static cznf<String> a(String str) {
        return new cznf<>(str, String.class);
    }

    public static cznf<Integer> b(String str) {
        return new cznf<>(str, Integer.class);
    }

    public static cznf<Boolean> c(String str) {
        return new cznf<>(str, Boolean.class);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cznf) {
            cznf cznfVar = (cznf) obj;
            if (this.b == cznfVar.b && this.a.equals(cznfVar.a)) {
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
