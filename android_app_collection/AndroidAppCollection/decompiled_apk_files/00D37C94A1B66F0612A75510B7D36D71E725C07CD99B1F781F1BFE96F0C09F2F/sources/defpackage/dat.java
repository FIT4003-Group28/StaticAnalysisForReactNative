package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dat  reason: default package */
/* loaded from: classes3.dex */
public final class dat {
    private Map a;
    private Map b;

    public final synchronized void a() {
        Map map = this.a;
        if (map != null) {
            map.clear();
        }
        Map map2 = this.b;
        if (map2 != null) {
            map2.clear();
        }
    }

    public final void b(das dasVar) {
        synchronized (this) {
            if (this.a == null) {
                this.a = new HashMap();
            }
            if (this.b == null) {
                this.b = new HashMap();
            }
            String str = dasVar.a;
            if (str != null) {
                this.a.put(str, dasVar);
            }
        }
    }
}
