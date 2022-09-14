package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqnb  reason: default package */
/* loaded from: classes.dex */
public final class cqnb<V extends cqkp> extends cqmd<V> {
    private final cqjb<V, ?> a;
    private final cqkv b;

    public cqnb(cqku cqkuVar, cqjb<V, ?> cqjbVar, cqkv cqkvVar) {
        super(cqkuVar);
        this.a = cqjbVar;
        this.b = cqkvVar;
    }

    @Override // defpackage.cqnf
    public final cqiz<V> e(cqjz<V> cqjzVar) {
        return new cqna(this.c, cqjzVar, this.b, this.d, this.a);
    }
}
