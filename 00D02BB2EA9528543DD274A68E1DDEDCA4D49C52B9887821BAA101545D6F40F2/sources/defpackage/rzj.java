package defpackage;
/* compiled from: PG */
/* renamed from: rzj  reason: default package */
/* loaded from: classes7.dex */
final class rzj extends rzl {
    private final akqi a;

    public rzj(akqi akqiVar) {
        this.a = akqiVar;
    }

    @Override // defpackage.rzl
    public final akqi a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof rzl)) {
            return false;
        }
        return this.a.equals(((rzl) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
        sb.append("Station{featureId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
