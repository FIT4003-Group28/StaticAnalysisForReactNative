package defpackage;

import java.io.Serializable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbrf  reason: default package */
/* loaded from: classes5.dex */
public final class dbrf<A, B> extends dbrh<A, B> implements Serializable {
    private final dbrn<? super A, ? extends B> a;
    private final dbrn<? super B, ? extends A> b;

    public dbrf(dbrn<? super A, ? extends B> dbrnVar, dbrn<? super B, ? extends A> dbrnVar2) {
        dbsk.s(dbrnVar);
        this.a = dbrnVar;
        dbsk.s(dbrnVar2);
        this.b = dbrnVar2;
    }

    @Override // defpackage.dbrh
    protected final A b(B b) {
        return this.b.a(b);
    }

    @Override // defpackage.dbrh
    protected final B c(A a) {
        return this.a.a(a);
    }

    @Override // defpackage.dbrn
    public final boolean equals(Object obj) {
        if (obj instanceof dbrf) {
            dbrf dbrfVar = (dbrf) obj;
            if (this.a.equals(dbrfVar.a) && this.b.equals(dbrfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 18 + String.valueOf(valueOf2).length());
        sb.append("Converter.from(");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(valueOf2);
        sb.append(")");
        return sb.toString();
    }
}
