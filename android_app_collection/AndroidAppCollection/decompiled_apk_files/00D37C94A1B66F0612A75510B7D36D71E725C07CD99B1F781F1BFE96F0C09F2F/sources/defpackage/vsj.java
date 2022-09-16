package defpackage;

import java.util.concurrent.CountDownLatch;
/* compiled from: PG */
/* renamed from: vsj  reason: default package */
/* loaded from: classes4.dex */
public final class vsj implements vrr {
    public final vrt a;
    public CountDownLatch b;
    public volatile boolean c = false;

    public vsj(vrt vrtVar) {
        this.a = vrtVar;
    }

    @Override // defpackage.vrr
    public final void a() {
        this.c = false;
        CountDownLatch countDownLatch = this.b;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @Override // defpackage.vrr
    public final void b() {
        this.c = true;
    }

    public final void c() {
        this.a.a(this);
    }
}
