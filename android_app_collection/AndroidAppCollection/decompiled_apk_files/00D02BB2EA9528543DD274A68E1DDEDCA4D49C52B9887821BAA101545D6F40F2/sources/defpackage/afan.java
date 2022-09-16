package defpackage;

import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: afan  reason: default package */
/* loaded from: classes2.dex */
final class afan implements btzi<dunb, dund> {
    final /* synthetic */ CountDownLatch a;

    public afan(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dunb> btzrVar, btzy btzyVar) {
        this.a.countDown();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dunb> btzrVar, dund dundVar) {
        this.a.countDown();
    }
}
