package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: spf  reason: default package */
/* loaded from: classes4.dex */
public final class spf implements ThreadFactory {
    private final spl a;
    private final spn b;
    private final AtomicInteger c = new AtomicInteger(1000);

    public spf(spn spnVar, ThreadFactory threadFactory) {
        this.b = spnVar;
        this.a = new spl(threadFactory);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int size;
        Thread newThread = this.a.newThread(runnable);
        if (spm.c()) {
            spl splVar = this.a;
            synchronized (splVar) {
                size = splVar.a.size();
            }
            if (size >= 1000) {
                while (true) {
                    int i = this.c.get();
                    if (size < i) {
                        break;
                    } else if (this.c.compareAndSet(i, i + i)) {
                        StringBuilder sb = new StringBuilder(82);
                        sb.append("Number of blocking threads ");
                        sb.append(size);
                        sb.append(" exceeds starvation threshold of 1000");
                        spm.b(this.b, this.a.a(), new spj(sb.toString()));
                    }
                }
            }
        }
        return newThread;
    }
}
