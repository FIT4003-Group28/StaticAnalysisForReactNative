package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: cxei  reason: default package */
/* loaded from: classes5.dex */
public final class cxei {
    public final cxdy b;
    public final AtomicInteger a = new AtomicInteger(0);
    public final Map<cxdy, ArrayDeque<cxdy>> c = new ConcurrentHashMap();
    private final ThreadLocal<WeakReference<ArrayDeque<cxdy>>> e = new cxeh(this);
    public final List<cxdy> d = new ArrayList();

    public cxei(String str) {
        this.b = new cxdy(str, Thread.currentThread().getId(), 2);
    }

    public final ArrayDeque<cxdy> a() {
        return this.e.get().get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b() {
        return this.a.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c() {
        return this.a.get();
    }
}
