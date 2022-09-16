package defpackage;

import android.net.Uri;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: ppr  reason: default package */
/* loaded from: classes4.dex */
public final class ppr {
    private static final AtomicLong d = new AtomicLong();
    public final long a;
    public final asy b;
    public final long c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ppr(long j, asy asyVar) {
        this(j, asyVar, 0L);
        Uri uri = asyVar.a;
        Collections.emptyMap();
    }

    public ppr(long j, asy asyVar, long j2) {
        this.a = j;
        this.b = asyVar;
        this.c = j2;
    }

    public static long a() {
        return d.getAndIncrement();
    }
}
