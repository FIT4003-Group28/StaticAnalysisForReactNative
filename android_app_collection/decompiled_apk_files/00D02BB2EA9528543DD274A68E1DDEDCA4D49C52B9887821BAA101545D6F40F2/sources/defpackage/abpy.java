package defpackage;

import android.content.Context;
/* compiled from: PG */
@Deprecated
/* renamed from: abpy  reason: default package */
/* loaded from: classes.dex */
public final class abpy extends cqiw<abpz> {
    public static final cqtv a;
    private static final cqtv b;

    static {
        cqrp d = cqrp.d(2.0d);
        a = d;
        cqsv f = cqsv.f(20.0d, 20.0d, 48.0d, 20.0d);
        b = f;
        cqsg.g(f, d);
        Float valueOf = Float.valueOf(2.0f);
        cqsg.d(abjc.a, cqsg.f(d, valueOf));
        cqsg.g(abjc.b, cqsg.f(d, valueOf));
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> e(cqmp<T>... cqmpVarArr) {
        cqmj<T> gd = cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.dQ(b), f(), f(), f(), f());
        gd.f(cqmpVarArr);
        return gd;
    }

    private static <T extends cqkp> cqmj<T> f() {
        cqtv cqtvVar = a;
        return jgn.a(cqgr.ch(abjc.a), cqgr.bG(abjc.b), cqgr.bV(cqtvVar), cqgr.bD(cqtvVar), cqgr.x(ibm.i()), jgn.b(cqrp.d(8.0d)));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, abpz abpzVar, Context context, cqiv cqivVar) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<abpz> a() {
        throw null;
    }
}
