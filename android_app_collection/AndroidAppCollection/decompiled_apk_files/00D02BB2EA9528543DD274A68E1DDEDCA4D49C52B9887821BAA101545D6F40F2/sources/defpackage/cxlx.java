package defpackage;

import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cxlx  reason: default package */
/* loaded from: classes5.dex */
public final class cxlx implements Runnable {
    final /* synthetic */ dehq a;
    final /* synthetic */ TimeUnit b;

    public cxlx(dehq dehqVar, TimeUnit timeUnit) {
        this.a = dehqVar;
        this.b = timeUnit;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cxly.b();
        cxlj.a(this.a.d(this, 10L, this.b));
    }
}
