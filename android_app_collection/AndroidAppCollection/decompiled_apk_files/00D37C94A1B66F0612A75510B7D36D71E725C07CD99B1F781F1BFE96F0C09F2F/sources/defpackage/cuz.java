package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cuz  reason: default package */
/* loaded from: classes3.dex */
public class cuz {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;

    public cuz(long j) {
        this.b = j;
    }

    protected int a(Object obj) {
        return 1;
    }

    protected void c(Object obj, Object obj2) {
    }

    public final synchronized long e() {
        return this.b;
    }

    public final synchronized Object f(Object obj) {
        ddx ddxVar = (ddx) this.a.get(obj);
        if (ddxVar != null) {
            return ddxVar.a;
        }
        return null;
    }

    public final synchronized Object g(Object obj, Object obj2) {
        int a = a(obj2);
        long j = a;
        if (j >= this.b) {
            c(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += j;
        }
        ddx ddxVar = (ddx) this.a.put(obj, obj2 == null ? null : new ddx(obj2, a));
        if (ddxVar != null) {
            this.c -= ddxVar.b;
            if (!ddxVar.a.equals(obj2)) {
                c(obj, ddxVar.a);
            }
        }
        j(this.b);
        if (ddxVar == null) {
            return null;
        }
        return ddxVar.a;
    }

    public final synchronized Object h(Object obj) {
        ddx ddxVar = (ddx) this.a.remove(obj);
        if (ddxVar == null) {
            return null;
        }
        this.c -= ddxVar.b;
        return ddxVar.a;
    }

    public final void i() {
        j(0L);
    }

    public final synchronized void j(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            ddx ddxVar = (ddx) entry.getValue();
            this.c -= ddxVar.b;
            Object key = entry.getKey();
            it.remove();
            c(key, ddxVar.a);
        }
    }
}
