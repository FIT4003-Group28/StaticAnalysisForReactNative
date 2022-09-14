package defpackage;
/* compiled from: PG */
/* renamed from: ilb  reason: default package */
/* loaded from: classes6.dex */
public final class ilb extends ilf {
    private final bvrt<dvwr> a;

    public ilb(@dzsi bvrt<dvwr> bvrtVar) {
        this.a = bvrtVar;
    }

    @Override // defpackage.ilf
    @dzsi
    public final bvrt<dvwr> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ilf)) {
            return false;
        }
        ilf ilfVar = (ilf) obj;
        bvrt<dvwr> bvrtVar = this.a;
        return bvrtVar == null ? ilfVar.a() == null : bvrtVar.equals(ilfVar.a());
    }

    public final int hashCode() {
        bvrt<dvwr> bvrtVar = this.a;
        return (bvrtVar == null ? 0 : bvrtVar.hashCode()) ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 68);
        sb.append("ClientPlaceContext{serializedPlaceAnnotationsFromCategoricalSearch=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
