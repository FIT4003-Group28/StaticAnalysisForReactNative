package defpackage;

import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: uhx  reason: default package */
/* loaded from: classes4.dex */
public final class uhx implements ruz, ruw, ruq {
    public final CountDownLatch a = new CountDownLatch(1);

    @Override // defpackage.ruq
    public final void b() {
        this.a.countDown();
    }

    @Override // defpackage.ruw
    public final void c(Exception exc) {
        this.a.countDown();
    }

    @Override // defpackage.ruz
    public final void d(Object obj) {
        this.a.countDown();
    }
}
