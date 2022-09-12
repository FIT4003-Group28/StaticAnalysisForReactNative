package defpackage;
/* compiled from: PG */
/* renamed from: cydo  reason: default package */
/* loaded from: classes5.dex */
final class cydo extends cygn {
    private final cyes a;

    public cydo(cyes cyesVar) {
        if (cyesVar != null) {
            this.a = cyesVar;
            return;
        }
        throw new NullPointerException("Null status");
    }

    @Override // defpackage.cygn
    public final cyes a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof cygn)) {
            return false;
        }
        return this.a.equals(((cygn) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("RefreshDataResponse{status=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
