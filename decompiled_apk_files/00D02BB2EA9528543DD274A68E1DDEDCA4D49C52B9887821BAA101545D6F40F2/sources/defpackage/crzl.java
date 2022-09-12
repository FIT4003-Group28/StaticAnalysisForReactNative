package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: crzl  reason: default package */
/* loaded from: classes.dex */
public final class crzl<K> {
    private final Map<K, crzn<?>> a = new ConcurrentHashMap();

    private final <V> crzn<V> c(K k) {
        return (crzn<V>) this.a.get(k);
    }

    public final synchronized <V> crzm<V> a(K k, dbty<V> dbtyVar) {
        crzn<V> c = c(k);
        if (c == null) {
            crzn<?> crznVar = new crzn<>(dbtyVar);
            this.a.put(k, crznVar);
            return crznVar;
        }
        return c;
    }

    public final synchronized <V> void b(K k) {
        crzn<V> c = c(k);
        if (c != null) {
            c.o();
        }
    }
}
