package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: acuo  reason: default package */
/* loaded from: classes.dex */
public final class acuo {
    public static final AtomicInteger a = new AtomicInteger(0);
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final ConcurrentHashMap c = new ConcurrentHashMap();

    static {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
    }

    public static acup a(int i) {
        boolean z = true;
        if (a.get() != 1) {
            z = false;
        }
        return new acup(z, c, i, awwc.class.getName());
    }

    public static acup b(int i) {
        boolean z = true;
        if (a.get() != 1) {
            z = false;
        }
        return new acup(z, b, i, awwd.class.getName());
    }
}
