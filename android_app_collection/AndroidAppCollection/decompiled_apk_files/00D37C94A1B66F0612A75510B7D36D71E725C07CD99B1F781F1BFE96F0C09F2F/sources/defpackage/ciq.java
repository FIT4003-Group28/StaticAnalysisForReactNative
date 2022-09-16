package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: ciq  reason: default package */
/* loaded from: classes2.dex */
public final class ciq {
    private static final cim a = new cio();
    private final Map b = new HashMap();

    public final synchronized cin a(Object obj) {
        cim cimVar;
        hy.N(obj);
        cimVar = (cim) this.b.get(obj.getClass());
        if (cimVar == null) {
            Iterator it = this.b.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                cim cimVar2 = (cim) it.next();
                if (cimVar2.b().isAssignableFrom(obj.getClass())) {
                    cimVar = cimVar2;
                    break;
                }
            }
        }
        if (cimVar == null) {
            cimVar = a;
        }
        return cimVar.a(obj);
    }

    public final synchronized void b(cim cimVar) {
        this.b.put(cimVar.b(), cimVar);
    }
}
