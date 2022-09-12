package defpackage;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbsn  reason: default package */
/* loaded from: classes5.dex */
public final class dbsn<A, B> implements Serializable, dbsl {
    private static final long serialVersionUID = 0;
    final dbsl<B> a;
    final dbrn<A, ? extends B> b;

    public dbsn(dbsl<B> dbslVar, dbrn<A, ? extends B> dbrnVar) {
        dbsk.s(dbslVar);
        this.a = dbslVar;
        dbsk.s(dbrnVar);
        this.b = dbrnVar;
    }

    @Override // defpackage.dbsl
    public final boolean a(A a) {
        return this.a.a(this.b.a(a));
    }

    @Override // defpackage.dbsl
    public final boolean equals(Object obj) {
        if (obj instanceof dbsn) {
            dbsn dbsnVar = (dbsn) obj;
            if (this.b.equals(dbsnVar.b) && this.a.equals(dbsnVar.a)) {
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
