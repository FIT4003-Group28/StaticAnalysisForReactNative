package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqmx  reason: default package */
/* loaded from: classes.dex */
public final class cqmx<V extends cqkp> extends cqmg<V> {
    private final Object a;
    private final cqnf<V> b;
    private final cqnf<V> f;

    public cqmx(Object obj, cqnf<V> cqnfVar, cqnf<V> cqnfVar2) {
        super(cqnfVar.b());
        dbsk.b(cqnfVar.b() == cqnfVar2.b(), "thenProperty and elseProperty should have the same ViewProperty");
        cqny.c(obj);
        this.a = obj;
        dbsk.t(cqnfVar, "ifThenElse thenProperty cannot be null");
        this.b = cqnfVar;
        dbsk.t(cqnfVar2, "ifThenElse elseProperty cannot be null");
        this.f = cqnfVar2;
    }

    @Override // defpackage.cqmg, defpackage.cqnf
    public final boolean c() {
        return false;
    }

    @Override // defpackage.cqnf
    public final cqiz<V> e(cqjz<V> cqjzVar) {
        return new cqmw(this.c, cqjzVar, this.d, this.a, this.b, this.f);
    }
}
