package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: dzeu  reason: default package */
/* loaded from: classes6.dex */
public final class dzeu extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final String a;
    final int b;
    final boolean c;

    public dzeu(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a + '-' + incrementAndGet();
        Thread dzetVar = this.c ? new dzet(runnable, str) : new Thread(runnable, str);
        dzetVar.setPriority(this.b);
        dzetVar.setDaemon(true);
        return dzetVar;
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 17);
        sb.append("RxThreadFactory[");
        sb.append(str);
        sb.append("]");
        return sb.toString();
    }

    public dzeu(String str, int i) {
        this(str, i, false);
    }

    public dzeu(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }
}
