package defpackage;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dygj  reason: default package */
/* loaded from: classes6.dex */
public final class dygj {
    public static final Logger a = Logger.getLogger(dygj.class.getName());
    public static final dygj b = new dygj();
    public final ConcurrentNavigableMap<Long, dygn> c;
    public final ConcurrentMap<Long, dygn> d;
    public final ConcurrentMap<Long, dygn> e;

    public dygj() {
        new ConcurrentSkipListMap();
        this.c = new ConcurrentSkipListMap();
        this.d = new ConcurrentHashMap();
        this.e = new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static <T extends dygn> void a(Map<Long, T> map, T t) {
        map.put(Long.valueOf(t.k().a), t);
    }

    public static <T extends dygn> void b(Map<Long, T> map, T t) {
        map.remove(Long.valueOf(t.k().a));
    }
}
