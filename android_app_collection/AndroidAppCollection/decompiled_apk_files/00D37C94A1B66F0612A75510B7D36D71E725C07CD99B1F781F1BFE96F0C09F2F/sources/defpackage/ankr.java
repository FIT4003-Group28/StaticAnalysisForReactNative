package defpackage;

import java.util.concurrent.locks.AbstractOwnableSynchronizer;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ankr  reason: default package */
/* loaded from: classes.dex */
public final class ankr extends AbstractOwnableSynchronizer implements Runnable {
    private final anks a;

    public ankr(anks anksVar) {
        this.a = anksVar;
    }

    public final void a(Thread thread) {
        super.setExclusiveOwnerThread(thread);
    }

    @Override // java.lang.Runnable
    public final void run() {
    }

    public final String toString() {
        return this.a.toString();
    }
}
