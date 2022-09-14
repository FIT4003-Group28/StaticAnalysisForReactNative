package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqno  reason: default package */
/* loaded from: classes5.dex */
public final class cqno<V extends cqkp> extends cqmg<V> {
    private final cqlc<V, ?> a;
    private final cqkv b;

    public cqno(cqku cqkuVar, cqlc<V, ?> cqlcVar, cqkv cqkvVar) {
        super(cqkuVar);
        dbsk.t(cqlcVar, "Null should never be used in place of a VmFunction. If you want to pass a null value, use VmFunction.of(null).");
        this.a = cqlcVar;
        this.b = cqkvVar;
    }

    @Override // defpackage.cqmg, defpackage.cqnf
    public final boolean c() {
        if (this.a.b()) {
            return cqvl.a(this.a.a(null));
        }
        return false;
    }

    @Override // defpackage.cqmg, defpackage.cqnf
    public final void d(cqkv cqkvVar, cqjz<V> cqjzVar) {
        dbsk.l(this.a.b());
        Object a = this.a.a(null);
        if (!cqkvVar.a(this.c, a, cqjzVar)) {
            this.b.a(this.c, a, cqjzVar);
        }
    }

    @Override // defpackage.cqnf
    public final cqiz<V> e(cqjz<V> cqjzVar) {
        return new cqnn(this.c, cqjzVar, this.b, this.d, this.a);
    }
}
