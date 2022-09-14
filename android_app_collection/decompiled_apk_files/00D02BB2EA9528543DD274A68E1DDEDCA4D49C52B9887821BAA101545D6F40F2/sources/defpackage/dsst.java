package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: dsst  reason: default package */
/* loaded from: classes.dex */
public final class dsst {
    public static final dsst a = new dsst();
    private final ConcurrentMap<Class<?>, dstc<?>> b = new ConcurrentHashMap();
    private final dssa c = new dssa();

    private dsst() {
    }

    public final <T> dstc<T> a(Class<T> cls) {
        dsrk.i(cls, "messageType");
        dssn dssnVar = (dstc<T>) this.b.get(cls);
        if (dssnVar == null) {
            dssa dssaVar = this.c;
            dstd.a(cls);
            dssg b = dssaVar.a.b(cls);
            if (!b.a()) {
                if (dsqw.class.isAssignableFrom(cls)) {
                    if (dssa.a(b)) {
                        dssnVar = dssm.m(b, dssq.b, dsrw.b, dstd.c, dsqd.a, dssf.b);
                    } else {
                        dssnVar = dssm.m(b, dssq.b, dsrw.b, dstd.c, null, dssf.b);
                    }
                } else if (dssa.a(b)) {
                    dssnVar = dssm.m(b, dssq.a, dsrw.a, dstd.a, dsqd.a(), dssf.a);
                } else {
                    dssnVar = dssm.m(b, dssq.a, dsrw.a, dstd.b, null, dssf.a);
                }
            } else if (!dsqw.class.isAssignableFrom(cls)) {
                dssnVar = dssn.g(dstd.a, dsqd.a(), b.b());
            } else {
                dssnVar = dssn.g(dstd.c, dsqd.a, b.b());
            }
            dsrk.i(cls, "messageType");
            dsrk.i(dssnVar, "schema");
            dstc<?> putIfAbsent = this.b.putIfAbsent(cls, dssnVar);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
        }
        return dssnVar;
    }

    public final <T> dstc<T> b(T t) {
        return a(t.getClass());
    }
}
