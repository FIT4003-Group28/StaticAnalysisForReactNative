package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: yjm  reason: default package */
/* loaded from: classes4.dex */
public final class yjm {
    private AtomicBoolean b = new AtomicBoolean(false);
    private final ConcurrentMap a = new ConcurrentHashMap();

    public yjm(Map map) {
        if (this.b.compareAndSet(false, true)) {
            for (Map.Entry entry : map.entrySet()) {
                b((String) entry.getKey(), (azqb) entry.getValue());
            }
        }
    }

    public final yjo a(String str) {
        if (this.a.containsKey(str)) {
            return (yjo) ((azqb) this.a.get(str)).get();
        }
        return null;
    }

    public final void b(String str, azqb azqbVar) {
        if (this.a.putIfAbsent(str, azqbVar) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 27);
        sb.append("Tag ");
        sb.append(str);
        sb.append(" is already registered.");
        throw new IllegalStateException(sb.toString());
    }
}
