package defpackage;
/* compiled from: PG */
/* renamed from: akek  reason: default package */
/* loaded from: classes2.dex */
final class akek extends akeq {
    private final akeo a;
    private final dbsg<cqiw<cqkp>> b;
    private final akeu c;

    public akek(akeo akeoVar, dbsg<cqiw<cqkp>> dbsgVar, akeu akeuVar) {
        this.a = akeoVar;
        this.b = dbsgVar;
        this.c = akeuVar;
    }

    @Override // defpackage.akeq
    public final akeo a() {
        return this.a;
    }

    @Override // defpackage.akeq
    public final dbsg<cqiw<cqkp>> b() {
        return this.b;
    }

    @Override // defpackage.akeq
    public final akeu c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof akeq) {
            akeq akeqVar = (akeq) obj;
            if (this.a.equals(akeqVar.a()) && this.b.equals(akeqVar.b()) && this.c.equals(akeqVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 52 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("DialogUI{ensuredAccountCallback=");
        sb.append(valueOf);
        sb.append(", layout=");
        sb.append(valueOf2);
        sb.append(", options=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
