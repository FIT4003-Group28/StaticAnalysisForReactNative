package defpackage;

import com.spotify.protocol.types.Types;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: dxhk  reason: default package */
/* loaded from: classes6.dex */
public final class dxhk {
    private final AtomicInteger c = new AtomicInteger(0);
    private final Map<Types.RequestId, dxhi<?>> d = new ConcurrentHashMap();
    public final Map<Types.RequestId, dxhj<?>> a = new ConcurrentHashMap();
    public final Map<Types.SubscriptionId, Types.RequestId> b = new ConcurrentHashMap();

    public final Types.RequestId a() {
        return Types.RequestId.from(this.c.getAndIncrement());
    }

    public final <T> dxhi<T> b(Class<T> cls) {
        dxhi<T> dxhiVar = new dxhi<>(a(), new dxgl(), cls);
        this.d.put(dxhiVar.a, dxhiVar);
        return dxhiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dxhj<?> c(Types.RequestId requestId) {
        return this.a.get(requestId);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dxhj<?> d(Types.SubscriptionId subscriptionId) {
        Types.RequestId requestId = this.b.get(subscriptionId);
        if (requestId != null) {
            return c(requestId);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dxhi<?> e(Types.RequestId requestId) {
        return this.d.get(requestId);
    }

    public final void f(Types.RequestId requestId) {
        this.d.remove(requestId);
    }
}
