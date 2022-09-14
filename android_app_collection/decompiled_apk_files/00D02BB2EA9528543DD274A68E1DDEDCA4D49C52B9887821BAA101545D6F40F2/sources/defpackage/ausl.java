package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ausl  reason: default package */
/* loaded from: classes2.dex */
public final class ausl extends ausn {
    private final ddos a;
    private final dbsg<akqi> b;

    public ausl(ddos ddosVar, dbsg<akqi> dbsgVar) {
        this.a = ddosVar;
        this.b = dbsgVar;
    }

    @Override // defpackage.ausn
    public final ddos a() {
        return this.a;
    }

    @Override // defpackage.ausn
    public final dbsg<akqi> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ausn) {
            ausn ausnVar = (ausn) obj;
            if (this.a.equals(ausnVar.a()) && this.b.equals(ausnVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 44 + String.valueOf(valueOf2).length());
        sb.append("BackoffExtras{notificationType=");
        sb.append(valueOf);
        sb.append(", featureId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
