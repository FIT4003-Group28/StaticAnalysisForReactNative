package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: buo  reason: default package */
/* loaded from: classes.dex */
public final class buo {
    private static final buk<?> b = new bum();
    private final Map<Class<?>, buk<?>> a = new HashMap();

    public final synchronized void a(buk<?> bukVar) {
        this.a.put(bukVar.b(), bukVar);
    }

    public final synchronized <T> bul<T> b(T t) {
        buk<?> bukVar;
        cjn.b(t);
        bukVar = this.a.get(t.getClass());
        if (bukVar == null) {
            Iterator<buk<?>> it = this.a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                buk<?> next = it.next();
                if (next.b().isAssignableFrom(t.getClass())) {
                    bukVar = next;
                    break;
                }
            }
        }
        if (bukVar == null) {
            bukVar = b;
        }
        return (bul<T>) bukVar.a(t);
    }
}
