package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cztr  reason: default package */
/* loaded from: classes5.dex */
public enum cztr {
    ACCESSIBILITY_EXTRA_LONG(TimeUnit.SECONDS.toMillis(90)),
    EXTRA_LONG(TimeUnit.SECONDS.toMillis(30)),
    LONG(TimeUnit.SECONDS.toMillis(5)),
    MEDIUM(TimeUnit.SECONDS.toMillis(2)),
    SHORT(TimeUnit.SECONDS.toMillis(1));
    
    public final long f;

    cztr(long j) {
        this.f = j;
    }
}
