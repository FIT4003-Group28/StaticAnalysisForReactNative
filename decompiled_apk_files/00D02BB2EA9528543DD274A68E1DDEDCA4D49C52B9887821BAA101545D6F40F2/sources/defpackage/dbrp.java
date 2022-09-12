package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: dbrp  reason: default package */
/* loaded from: classes5.dex */
final class dbrp<A, B, C> implements Serializable, dbrn {
    private static final long serialVersionUID = 0;
    private final dbrn<B, C> a;
    private final dbrn<A, ? extends B> b;

    public dbrp(dbrn<B, C> dbrnVar, dbrn<A, ? extends B> dbrnVar2) {
        dbsk.s(dbrnVar);
        this.a = dbrnVar;
        dbsk.s(dbrnVar2);
        this.b = dbrnVar2;
    }

    @Override // defpackage.dbrn
    public final C a(A a) {
        return this.a.a(this.b.a(a));
    }

    @Override // defpackage.dbrn
    public final boolean equals(Object obj) {
        if (obj instanceof dbrp) {
            dbrp dbrpVar = (dbrp) obj;
            if (this.b.equals(dbrpVar.b) && this.a.equals(dbrpVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 2 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("(");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
