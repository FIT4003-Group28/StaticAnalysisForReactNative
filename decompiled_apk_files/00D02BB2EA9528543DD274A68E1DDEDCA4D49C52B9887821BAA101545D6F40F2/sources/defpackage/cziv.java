package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: cziv  reason: default package */
/* loaded from: classes5.dex */
public final class cziv {
    @dzsi
    private final ConcurrentMap<String, Semaphore> a = new ConcurrentHashMap();

    public final Semaphore a(String str) {
        Semaphore semaphore = this.a.get(str);
        if (semaphore == null) {
            this.a.putIfAbsent(str, new Semaphore(1));
            return this.a.get(str);
        }
        return semaphore;
    }
}
