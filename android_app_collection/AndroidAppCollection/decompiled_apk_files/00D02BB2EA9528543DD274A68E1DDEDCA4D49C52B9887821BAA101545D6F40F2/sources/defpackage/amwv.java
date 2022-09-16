package defpackage;

import java.util.concurrent.BlockingQueue;
/* compiled from: PG */
/* renamed from: amwv  reason: default package */
/* loaded from: classes2.dex */
final class amwv implements amwy {
    final /* synthetic */ BlockingQueue a;

    public amwv(BlockingQueue blockingQueue) {
        this.a = blockingQueue;
    }

    @Override // defpackage.amwy
    public final void a(int i) {
        BlockingQueue blockingQueue = this.a;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        blockingQueue.offer(Boolean.valueOf(z));
    }

    @Override // defpackage.amwy
    public final void b() {
    }
}
