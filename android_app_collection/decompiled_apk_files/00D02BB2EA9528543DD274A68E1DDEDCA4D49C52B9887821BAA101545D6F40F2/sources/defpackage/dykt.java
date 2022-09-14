package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;
/* compiled from: PG */
/* renamed from: dykt  reason: default package */
/* loaded from: classes6.dex */
public final class dykt {
    public static final Logger a = Logger.getLogger(dykt.class.getName());
    public final String b;
    public final AtomicLong c;

    public dykt(long j) {
        AtomicLong atomicLong = new AtomicLong();
        this.c = atomicLong;
        dbsk.b(true, "value must be positive");
        this.b = "keepalive time nanos";
        atomicLong.set(Long.MAX_VALUE);
    }
}
