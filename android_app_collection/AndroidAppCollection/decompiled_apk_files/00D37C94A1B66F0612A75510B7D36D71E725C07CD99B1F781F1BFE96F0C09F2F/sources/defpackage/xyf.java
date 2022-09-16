package defpackage;

import java.util.IdentityHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: xyf  reason: default package */
/* loaded from: classes4.dex */
public final class xyf {
    private final Map a = new IdentityHashMap();

    private final synchronized boolean d(auxq auxqVar) {
        Boolean bool;
        bool = (Boolean) this.a.get(auxqVar);
        return bool == null ? auxqVar.g : bool.booleanValue();
    }

    public final synchronized void a() {
        this.a.clear();
    }

    public final synchronized void b(auxq auxqVar, boolean z) {
        this.a.put(auxqVar, Boolean.valueOf(z));
    }

    public final synchronized boolean c(auxq auxqVar) {
        return d(auxqVar);
    }
}
