package defpackage;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: azos  reason: default package */
/* loaded from: classes2.dex */
public final class azos {
    static boolean a(aypz aypzVar) {
        try {
            return ((ayud) aypzVar).j;
        } catch (Throwable th) {
            bapv.j(th);
            return true;
        }
    }

    public static boolean b(long j, bame bameVar, Queue queue, AtomicLong atomicLong, aypz aypzVar) {
        long j2 = j & Long.MIN_VALUE;
        while (true) {
            if (j2 != j) {
                if (a(aypzVar)) {
                    return true;
                }
                Object poll = queue.poll();
                if (poll != null) {
                    bameVar.c(poll);
                    j2++;
                } else {
                    bameVar.sm();
                    return true;
                }
            } else if (a(aypzVar)) {
                return true;
            } else {
                if (!queue.isEmpty()) {
                    j = atomicLong.get();
                    if (j == j2) {
                        long addAndGet = atomicLong.addAndGet(-(j2 & Long.MAX_VALUE));
                        if ((Long.MAX_VALUE & addAndGet) == 0) {
                            return false;
                        }
                        j = addAndGet;
                        j2 = addAndGet & Long.MIN_VALUE;
                    } else {
                        continue;
                    }
                } else {
                    bameVar.sm();
                    return true;
                }
            }
        }
    }

    public static int c(int i) {
        return 1 << (32 - Integer.numberOfLeadingZeros(i - 1));
    }
}
