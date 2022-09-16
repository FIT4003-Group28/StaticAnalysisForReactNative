package defpackage;
/* compiled from: PG */
/* renamed from: aoor  reason: default package */
/* loaded from: classes.dex */
final class aoor {
    private final Object a;
    private final int b;

    public aoor(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aoor)) {
            return false;
        }
        aoor aoorVar = (aoor) obj;
        return this.a == aoorVar.a && this.b == aoorVar.b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.a) * 65535) + this.b;
    }
}
