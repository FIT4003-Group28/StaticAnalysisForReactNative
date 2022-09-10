package defpackage;

import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: afao  reason: default package */
/* loaded from: classes2.dex */
final class afao implements btzi<dhqq, dhqs> {
    final /* synthetic */ CountDownLatch a;
    final /* synthetic */ afas b;

    public afao(afas afasVar, CountDownLatch countDownLatch) {
        this.b = afasVar;
        this.a = countDownLatch;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dhqq> btzrVar, btzy btzyVar) {
        this.a.countDown();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dhqq> btzrVar, dhqs dhqsVar) {
        this.b.i.ac(bvjk.q, dhqsVar.a);
        this.b.i.aq();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        this.b.j(countDownLatch);
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        this.a.countDown();
    }
}
