package defpackage;
/* compiled from: PG */
/* renamed from: dcvk  reason: default package */
/* loaded from: classes5.dex */
public final class dcvk<T> extends dcvh {
    public final dcwf<T> b;

    public dcvk(dcuz dcuzVar, dcwf<T> dcwfVar) {
        super(dcuzVar);
        this.b = dcwfVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(dcvh dcvhVar) {
        return dcvhVar.a.compareTo(this.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcvk) {
            return this.b.equals(((dcvk) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        double a = this.a.f().a();
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
        sb.append(a);
        sb.append(": ");
        sb.append(valueOf);
        return sb.toString();
    }
}
