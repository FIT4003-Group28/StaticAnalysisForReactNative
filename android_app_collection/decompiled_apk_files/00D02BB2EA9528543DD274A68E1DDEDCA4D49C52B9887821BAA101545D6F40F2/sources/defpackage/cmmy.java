package defpackage;
/* compiled from: PG */
/* renamed from: cmmy  reason: default package */
/* loaded from: classes5.dex */
final class cmmy<T> {
    public final T a;
    public boolean b;

    public cmmy(T t) {
        this.a = t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.a.equals(((cmmy) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
