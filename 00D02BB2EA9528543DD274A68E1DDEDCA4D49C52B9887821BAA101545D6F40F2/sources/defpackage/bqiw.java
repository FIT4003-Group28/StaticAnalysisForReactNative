package defpackage;
/* compiled from: PG */
/* renamed from: bqiw  reason: default package */
/* loaded from: classes4.dex */
final class bqiw extends bqla {
    private final bqkx a;
    private final bqkz b;

    public bqiw(bqkx bqkxVar, bqkz bqkzVar) {
        this.a = bqkxVar;
        this.b = bqkzVar;
    }

    @Override // defpackage.bqla
    public final bqkx a() {
        return this.a;
    }

    @Override // defpackage.bqla
    public final bqkz b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bqla) {
            bqla bqlaVar = (bqla) obj;
            if (this.a.equals(bqlaVar.a()) && this.b.equals(bqlaVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length());
        sb.append("ReviewRequest{review=");
        sb.append(valueOf);
        sb.append(", submitOptions=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
