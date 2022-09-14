package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqhc  reason: default package */
/* loaded from: classes5.dex */
public final class cqhc<V extends cqkp> {
    @dzsi
    private cqhb a;

    public static <V extends cqkp> cqhc<V> a() {
        return new cqhc<>();
    }

    public final cqnf<V> b(cqnf<V> cqnfVar) {
        for (cqhb cqhbVar = this.a; cqhbVar != null; cqhbVar = cqhbVar.c) {
            cqnfVar = cqhbVar.a(cqnfVar);
        }
        return cqnfVar;
    }

    public final void c(cqjb<V, Boolean> cqjbVar, cqnf<V> cqnfVar) {
        this.a = new cqha(this.a, cqjbVar, cqnfVar);
    }

    public final void d(cqlc<V, Boolean> cqlcVar, cqnf<V> cqnfVar) {
        this.a = new cqgz(this.a, cqlcVar, cqnfVar);
    }

    public final void e(Boolean bool, cqnf<V> cqnfVar) {
        this.a = new cqgy(this.a, bool, cqnfVar);
    }
}
