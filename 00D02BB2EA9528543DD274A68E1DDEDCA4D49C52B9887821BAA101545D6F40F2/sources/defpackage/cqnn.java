package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqnn  reason: default package */
/* loaded from: classes5.dex */
final class cqnn<V extends cqkp> extends cqmc<V> {
    private final cqlc<V, ?> g;

    public cqnn(cqku cqkuVar, cqjz<V> cqjzVar, cqkv cqkvVar, StackTraceElement[] stackTraceElementArr, cqlc<V, ?> cqlcVar) {
        super(cqkuVar, cqjzVar, cqkvVar, stackTraceElementArr);
        this.g = cqlcVar;
    }

    @Override // defpackage.cqmc
    @dzsi
    protected final Object e(V v) {
        return this.g.a(v);
    }
}
