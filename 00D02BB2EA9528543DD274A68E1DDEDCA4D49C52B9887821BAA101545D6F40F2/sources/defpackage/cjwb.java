package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
/* compiled from: PG */
/* renamed from: cjwb  reason: default package */
/* loaded from: classes.dex */
final class cjwb {
    private final ConcurrentMap<String, ConcurrentLinkedQueue<cjtk>> a = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, cjtk cjtkVar) {
        ConcurrentLinkedQueue<cjtk> putIfAbsent;
        ConcurrentLinkedQueue<cjtk> concurrentLinkedQueue = this.a.get(str);
        if (concurrentLinkedQueue == null && (putIfAbsent = this.a.putIfAbsent(str, (concurrentLinkedQueue = new ConcurrentLinkedQueue<>()))) != null) {
            concurrentLinkedQueue = putIfAbsent;
        }
        concurrentLinkedQueue.add(cjtkVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcde<String, cjtk> b() {
        dcdd a = dcde.a();
        for (String str : this.a.keySet()) {
            ConcurrentLinkedQueue<cjtk> concurrentLinkedQueue = this.a.get(str);
            for (cjtk poll = concurrentLinkedQueue.poll(); poll != null; poll = concurrentLinkedQueue.poll()) {
                a.b(str, poll);
            }
        }
        return a.a();
    }
}
