package defpackage;

import defpackage.agxb;
/* compiled from: PG */
/* renamed from: agwz  reason: default package */
/* loaded from: classes2.dex */
public abstract class agwz<V extends agxb> extends cqiw<V> {
    public agwz() {
    }

    public static <V extends agxb> int h(agxa<V> agxaVar) {
        return agxaVar.a.g(agxaVar.b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<V> a() {
        cqml<V> e = e();
        e.h(cqgr.dX(agwx.a), cqgr.dE(agwy.a));
        return agwr.a(cqgr.cd(-1), cqgr.bp(-2), cqgr.L(false), cqgr.P(false), cqmp.e, e);
    }

    protected abstract cqml<V> e();

    public int f(V v) {
        return 0;
    }

    public int g(V v) {
        return 0;
    }

    public agwz(Object... objArr) {
        super(objArr);
    }
}
