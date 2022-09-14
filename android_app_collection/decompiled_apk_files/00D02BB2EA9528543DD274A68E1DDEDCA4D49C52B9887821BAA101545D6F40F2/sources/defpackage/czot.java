package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: czot  reason: default package */
/* loaded from: classes5.dex */
final class czot implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.a.getAndIncrement();
        StringBuilder sb = new StringBuilder(19);
        sb.append("Survey #");
        sb.append(andIncrement);
        return new Thread(runnable, sb.toString());
    }
}
