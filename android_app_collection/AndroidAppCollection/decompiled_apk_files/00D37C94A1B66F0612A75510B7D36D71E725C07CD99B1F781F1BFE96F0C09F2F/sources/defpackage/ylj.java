package defpackage;

import java.util.concurrent.Semaphore;
/* compiled from: PG */
/* renamed from: ylj  reason: default package */
/* loaded from: classes4.dex */
public final class ylj extends Semaphore {
    public ylj() {
        super(0);
    }

    public final void a() {
        int availablePermits = availablePermits();
        int i = -availablePermits;
        if (i > 0) {
            release(i);
        } else if (i >= 0) {
        } else {
            reducePermits(availablePermits);
        }
    }
}
