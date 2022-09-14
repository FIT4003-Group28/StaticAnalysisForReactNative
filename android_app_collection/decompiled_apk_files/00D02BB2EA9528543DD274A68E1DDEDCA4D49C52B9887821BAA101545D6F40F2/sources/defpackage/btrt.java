package defpackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: btrt  reason: default package */
/* loaded from: classes.dex */
public final class btrt {
    private final Map<Class<?>, Object> a = new HashMap();
    private final btrq b;

    public btrt(btrq btrqVar) {
        this.b = btrqVar;
    }

    public final synchronized void a(Object obj, Set<Class<?>> set) {
        for (Class<?> cls : set) {
            this.a.put(cls, obj);
        }
    }

    public final synchronized void b(Object obj, Set<Class<?>> set) {
        for (Class<?> cls : set) {
            if (this.a.get(cls) == obj) {
                this.a.remove(cls);
            }
        }
    }

    public final synchronized void c(dcet<Class<?>, btrs> dcetVar) {
        dcpd<Map.Entry<Class<?>, btrs>> it = dcetVar.s().iterator();
        while (it.hasNext()) {
            Map.Entry<Class<?>, btrs> next = it.next();
            Object obj = this.a.get(next.getKey());
            if (obj != null) {
                this.b.i(obj, next.getValue());
            }
        }
    }
}
