package defpackage;

import android.util.LruCache;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: afrw  reason: default package */
/* loaded from: classes.dex */
public final class afrw implements ces {
    private final LruCache a;

    public afrw(int i) {
        this.a = new afrv(i);
    }

    @Override // defpackage.ces
    public final synchronized cer a(String str) {
        cer cerVar = (cer) this.a.get(str);
        if (cerVar == null) {
            return null;
        }
        if (!cerVar.a() && !cerVar.b()) {
            if (!cerVar.g.containsKey("X-YouTube-cache-hit")) {
                cerVar.g = new HashMap(cerVar.g);
                cerVar.g.put("X-YouTube-cache-hit", "true");
            }
            return cerVar;
        }
        if (cerVar.g.containsKey("X-YouTube-cache-hit")) {
            cerVar.g.remove("X-YouTube-cache-hit");
        }
        return cerVar;
    }

    @Override // defpackage.ces
    public final synchronized void b() {
        this.a.evictAll();
    }

    @Override // defpackage.ces
    public final synchronized void c() {
    }

    @Override // defpackage.ces
    public final synchronized void d(String str, cer cerVar) {
        this.a.put(str, cerVar);
    }

    @Override // defpackage.ces
    public final synchronized void e(String str) {
        this.a.remove(str);
    }

    @Override // defpackage.ces
    public final synchronized void f(String str) {
        this.a.remove(str);
    }
}
