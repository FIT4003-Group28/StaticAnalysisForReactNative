package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqna  reason: default package */
/* loaded from: classes.dex */
public final class cqna<V extends cqkp> extends cqmc<V> {
    private final cqjb<V, ?> g;

    public cqna(cqku cqkuVar, cqjz<V> cqjzVar, cqkv cqkvVar, StackTraceElement[] stackTraceElementArr, cqjb<V, ?> cqjbVar) {
        super(cqkuVar, cqjzVar, cqkvVar, stackTraceElementArr);
        this.g = cqjbVar;
    }

    @Override // defpackage.cqmc
    @dzsi
    protected final Object e(V v) {
        return this.g.a(v, this.e.c.getContext());
    }
}
