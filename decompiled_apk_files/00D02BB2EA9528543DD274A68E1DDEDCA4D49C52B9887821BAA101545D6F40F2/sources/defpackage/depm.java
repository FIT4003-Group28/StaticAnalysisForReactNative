package defpackage;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: depm  reason: default package */
/* loaded from: classes6.dex */
final class depm implements dera, deqz {
    private final Executor c;
    private final Map<Class<?>, ConcurrentHashMap<deqy<Object>, Executor>> b = new HashMap();
    public Queue<deqx<?>> a = new ArrayDeque();

    public depm(Executor executor) {
        this.c = executor;
    }

    @Override // defpackage.dera
    public final synchronized <T> void a(Class<T> cls, Executor executor, deqy<? super T> deqyVar) {
        depp.checkNotNull(cls);
        depp.checkNotNull(deqyVar);
        depp.checkNotNull(executor);
        if (!this.b.containsKey(cls)) {
            this.b.put(cls, new ConcurrentHashMap<>());
        }
        this.b.get(cls).put(deqyVar, executor);
    }

    @Override // defpackage.dera
    public final <T> void b(Class<T> cls, deqy<? super T> deqyVar) {
        a(cls, this.c, deqyVar);
    }

    public final synchronized Set<Map.Entry<deqy<Object>, Executor>> c() {
        throw null;
    }
}
