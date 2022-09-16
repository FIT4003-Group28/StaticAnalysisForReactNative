package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dyej  reason: default package */
/* loaded from: classes6.dex */
public final class dyej {
    public dyel a;
    public Map<dyek<?>, Object> b;

    public dyej(dyel dyelVar) {
        this.a = dyelVar;
    }

    public final dyel a() {
        if (this.b != null) {
            dyel dyelVar = this.a;
            dyel dyelVar2 = dyel.b;
            for (Map.Entry<dyek<?>, Object> entry : dyelVar.a.entrySet()) {
                if (!this.b.containsKey(entry.getKey())) {
                    this.b.put(entry.getKey(), entry.getValue());
                }
            }
            this.a = new dyel(this.b);
            this.b = null;
        }
        return this.a;
    }

    public final <T> void b(dyek<T> dyekVar, T t) {
        if (this.b == null) {
            this.b = new IdentityHashMap(1);
        }
        this.b.put(dyekVar, t);
    }
}
