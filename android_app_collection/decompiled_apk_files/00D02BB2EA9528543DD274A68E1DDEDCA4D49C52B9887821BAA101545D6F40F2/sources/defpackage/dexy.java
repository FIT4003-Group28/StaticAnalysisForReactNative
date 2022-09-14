package defpackage;

import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
/* compiled from: PG */
/* renamed from: dexy  reason: default package */
/* loaded from: classes6.dex */
final class dexy {
    private static final int a;
    private static final int b;
    private static final Queue<byte[]> c;

    static {
        int max = Math.max(16384, 8192);
        a = max;
        int i = 131072 / max;
        b = i;
        c = new LinkedBlockingQueue(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] a() {
        return b(a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte[] b(int i) {
        byte[] poll;
        return (i != a || (poll = c.poll()) == null) ? new byte[i] : poll;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(byte[] bArr) {
        if (bArr.length == a) {
            c.offer(bArr);
        }
    }
}
