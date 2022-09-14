package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: wkh  reason: default package */
/* loaded from: classes7.dex */
final class wkh<T extends cqkp> extends wnf<T> {
    private final cqmj<T> a;
    private final cqlc<T, Boolean> b;

    public wkh(cqmj<T> cqmjVar, cqlc<T, Boolean> cqlcVar) {
        this.a = cqmjVar;
        if (cqlcVar != null) {
            this.b = cqlcVar;
            return;
        }
        throw new NullPointerException("Null isVisible");
    }

    @Override // defpackage.wnf
    public final cqmj<T> a() {
        return this.a;
    }

    @Override // defpackage.wnf
    public final cqlc<T, Boolean> b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wnf) {
            wnf wnfVar = (wnf) obj;
            if (this.a.equals(wnfVar.a()) && this.b.equals(wnfVar.b())) {
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
        sb.append("MaybeVisibleNode{node=");
        sb.append(valueOf);
        sb.append(", isVisible=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
