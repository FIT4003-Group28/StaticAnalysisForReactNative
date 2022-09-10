package defpackage;
/* compiled from: PG */
/* renamed from: dcvj  reason: default package */
/* loaded from: classes5.dex */
final class dcvj extends dcvh {
    public final dcvf b;

    public dcvj(dcuz dcuzVar, dcvf dcvfVar) {
        super(dcuzVar);
        this.b = dcvfVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(dcvh dcvhVar) {
        return this.a.compareTo(dcvhVar.a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcvj) {
            dcvj dcvjVar = (dcvj) obj;
            if (this.b.equals(dcvjVar.b) && this.a.equals(dcvjVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
