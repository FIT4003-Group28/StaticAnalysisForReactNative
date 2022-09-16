package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: aylg  reason: default package */
/* loaded from: classes2.dex */
final class aylg {
    private final AtomicLong a = new AtomicLong();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long a(long j) {
        return this.a.addAndGet(j);
    }
}
