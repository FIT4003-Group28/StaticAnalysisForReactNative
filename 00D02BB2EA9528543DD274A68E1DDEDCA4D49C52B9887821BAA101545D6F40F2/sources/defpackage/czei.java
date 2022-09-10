package defpackage;

import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: czei  reason: default package */
/* loaded from: classes5.dex */
final class czei extends czev {
    final /* synthetic */ czex a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public czei(czex czexVar, int i) {
        super(czexVar, i);
        this.a = czexVar;
    }

    @Override // defpackage.czev
    public final dehn<czew> a(boolean z, UUID uuid, @dzsi CountDownLatch countDownLatch) {
        return deha.a(czew.c(cygn.b(cyes.FAILED_ACCOUNT_NOT_LOGGED_IN), this.a.h.a()));
    }

    @Override // defpackage.czev
    public final void b(TimeUnit timeUnit) {
        this.a.h.a();
    }
}
