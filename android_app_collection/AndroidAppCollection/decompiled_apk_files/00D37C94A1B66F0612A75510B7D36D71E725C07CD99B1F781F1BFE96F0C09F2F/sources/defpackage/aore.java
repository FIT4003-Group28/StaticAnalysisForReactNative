package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: aore  reason: default package */
/* loaded from: classes.dex */
public final class aore {
    public static final aore a = new aore();
    private final ConcurrentMap b = new ConcurrentHashMap();
    private final aoqm c = new aoqm();

    private aore() {
    }

    public final aorm a(Class cls) {
        aopv.i(cls, "messageType");
        aorm aormVar = (aorm) this.b.get(cls);
        if (aormVar == null) {
            aoqm aoqmVar = this.c;
            aorn.p(cls);
            aoqr a2 = aoqmVar.a.a(cls);
            if (!a2.c()) {
                if (aopi.class.isAssignableFrom(cls)) {
                    if (aoqm.a(a2)) {
                        aormVar = aoqw.m(a2, aoqz.b, aoqi.b, aorn.c, aoot.a, aoqq.b);
                    } else {
                        aormVar = aoqw.m(a2, aoqz.b, aoqi.b, aorn.c, null, aoqq.b);
                    }
                } else if (aoqm.a(a2)) {
                    aormVar = aoqw.m(a2, aoqz.a, aoqi.a, aorn.a, aoot.a(), aoqq.a);
                } else {
                    aormVar = aoqw.m(a2, aoqz.a, aoqi.a, aorn.b, null, aoqq.a);
                }
            } else if (!aopi.class.isAssignableFrom(cls)) {
                aormVar = aoqx.c(aorn.a, aoot.a(), a2.a());
            } else {
                aormVar = aoqx.c(aorn.c, aoot.a, a2.a());
            }
            aopv.i(cls, "messageType");
            aopv.i(aormVar, "schema");
            aorm aormVar2 = (aorm) this.b.putIfAbsent(cls, aormVar);
            if (aormVar2 != null) {
                return aormVar2;
            }
        }
        return aormVar;
    }

    public final aorm b(Object obj) {
        return a(obj.getClass());
    }
}
