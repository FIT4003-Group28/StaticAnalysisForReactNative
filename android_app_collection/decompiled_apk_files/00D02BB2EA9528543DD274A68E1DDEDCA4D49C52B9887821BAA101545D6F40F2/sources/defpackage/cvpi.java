package defpackage;

import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: cvpi  reason: default package */
/* loaded from: classes5.dex */
public final class cvpi implements cpcl, cpci, cpcc {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.cpcl
    public final void c(Object obj) {
        this.a.countDown();
    }

    @Override // defpackage.cpci
    public final void d(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.cpcc
    public final void e() {
        this.a.countDown();
    }
}
