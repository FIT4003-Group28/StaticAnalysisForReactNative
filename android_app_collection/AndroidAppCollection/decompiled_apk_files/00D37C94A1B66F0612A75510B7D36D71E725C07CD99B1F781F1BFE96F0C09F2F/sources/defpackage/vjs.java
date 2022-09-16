package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: vjs  reason: default package */
/* loaded from: classes4.dex */
public final class vjs {
    private final ConcurrentMap a = new ConcurrentHashMap();

    public final Semaphore a(String str) {
        Semaphore semaphore = (Semaphore) this.a.get(str);
        if (semaphore == null) {
            this.a.putIfAbsent(str, new Semaphore(1));
            return (Semaphore) this.a.get(str);
        }
        return semaphore;
    }
}
