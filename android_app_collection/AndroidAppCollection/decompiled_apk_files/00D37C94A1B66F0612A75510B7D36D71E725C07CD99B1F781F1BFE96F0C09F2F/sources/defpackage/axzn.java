package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: axzn  reason: default package */
/* loaded from: classes2.dex */
public final class axzn {
    public static final axzn a;
    public final ConcurrentNavigableMap b;
    public final ConcurrentMap c;
    public final ConcurrentMap d;

    static {
        Logger.getLogger(axzn.class.getName());
        a = new axzn();
    }

    public axzn() {
        new ConcurrentSkipListMap();
        this.b = new ConcurrentSkipListMap();
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static void a(Map map, axzr axzrVar) {
        axzr axzrVar2 = (axzr) map.put(Long.valueOf(axzrVar.c().a), axzrVar);
    }

    public static void b(Map map, axzr axzrVar) {
        axzr axzrVar2 = (axzr) map.remove(Long.valueOf(axzrVar.c().a));
    }
}
