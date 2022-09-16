package defpackage;
/* compiled from: PG */
/* renamed from: cycr  reason: default package */
/* loaded from: classes5.dex */
final class cycr extends cydx {
    private final cyer a;
    private final cyes b;

    public cycr(cyer cyerVar, cyes cyesVar) {
        if (cyerVar != null) {
            this.a = cyerVar;
            if (cyesVar != null) {
                this.b = cyesVar;
                return;
            }
            throw new NullPointerException("Null status");
        }
        throw new NullPointerException("Null dataSource");
    }

    @Override // defpackage.cydx
    public final cyer a() {
        return this.a;
    }

    @Override // defpackage.cydx
    public final cyes b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cydx) {
            cydx cydxVar = (cydx) obj;
            if (this.a.equals(cydxVar.a()) && this.b.equals(cydxVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 35 + String.valueOf(valueOf2).length());
        sb.append("CallbackError{dataSource=");
        sb.append(valueOf);
        sb.append(", status=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
