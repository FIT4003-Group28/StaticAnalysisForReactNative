package defpackage;

import android.os.ConditionVariable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: aohk  reason: default package */
/* loaded from: classes.dex */
public final class aohk {
    private static final ConditionVariable g = new ConditionVariable();
    static final Map a = DesugarCollections.synchronizedMap(new HashMap());
    static final Collection b = new ConcurrentLinkedQueue();
    static final Collection c = new ConcurrentLinkedQueue();
    static final AtomicInteger d = new AtomicInteger();
    public static volatile boolean e = false;
    private static volatile aohh h = aohi.a;
    public static volatile aohj f = null;
    private static volatile Thread i = null;

    public static List a() {
        return new ArrayList(c);
    }

    public static List b() {
        return new ArrayList(b);
    }

    public static void c(String str, String... strArr) {
        f(h, str);
    }

    public static void d(aohh aohhVar) {
        if (aohhVar == null) {
            aohhVar = aohi.a;
        }
        h = aohhVar;
    }

    private static void e(aohh aohhVar, String str) {
        boolean z;
        Map map = a;
        synchronized (map) {
            ConditionVariable conditionVariable = (ConditionVariable) map.get(str);
            ConditionVariable conditionVariable2 = g;
            if (conditionVariable == conditionVariable2) {
                return;
            }
            if (conditionVariable != null) {
                z = true;
            } else {
                conditionVariable = new ConditionVariable();
                map.put(str, conditionVariable);
                z = false;
            }
            if (!z) {
                synchronized (conditionVariable) {
                    long nanoTime = System.nanoTime();
                    aohhVar.a(str);
                    map.put(str, conditionVariable2);
                    b.add(new jj(str, Long.valueOf(System.nanoTime() - nanoTime)));
                    conditionVariable.open();
                }
            }
            if (Thread.holdsLock(conditionVariable)) {
                return;
            }
            conditionVariable.block();
        }
    }

    private static void f(aohh aohhVar, String str) {
        if (e) {
            long nanoTime = System.nanoTime();
            e(aohhVar, str);
            if (d.incrementAndGet() > 20) {
                return;
            }
            c.add(new jj(str, Long.valueOf(System.nanoTime() - nanoTime)));
            return;
        }
        e(aohhVar, str);
    }
}
