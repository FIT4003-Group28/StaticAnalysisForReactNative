package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: aznf  reason: default package */
/* loaded from: classes2.dex */
public final class aznf extends AtomicLong implements ThreadFactory {
    private static final long serialVersionUID = -7789753024099756196L;
    final String a;
    final int b;
    final boolean c;

    public aznf(String str) {
        this(str, 5, false);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.a + '-' + incrementAndGet();
        Thread azneVar = this.c ? new azne(runnable, str) : new Thread(runnable, str);
        azneVar.setPriority(this.b);
        azneVar.setDaemon(true);
        return azneVar;
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

    public aznf(String str, int i) {
        this(str, i, false);
    }

    public aznf(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }
}
