package defpackage;

import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqng  reason: default package */
/* loaded from: classes.dex */
final class cqng<V extends cqkp> extends cqmc<V> {
    private static final Object[] g = new Object[0];
    private final cqnx<V, ?> h;

    public cqng(cqku cqkuVar, cqjz<V> cqjzVar, cqkv cqkvVar, StackTraceElement[] stackTraceElementArr, cqnx<V, ?> cqnxVar) {
        super(cqkuVar, cqjzVar, cqkvVar, stackTraceElementArr);
        this.h = cqnxVar;
    }

    @Override // defpackage.cqmc
    @dzsi
    protected final Object e(V v) {
        return this.h.a(v, g);
    }
}
