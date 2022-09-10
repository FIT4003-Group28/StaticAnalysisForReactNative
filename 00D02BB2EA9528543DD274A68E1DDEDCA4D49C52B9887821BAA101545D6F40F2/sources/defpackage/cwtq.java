package defpackage;

import dagger.internal.Factory;
import java.util.concurrent.ScheduledThreadPoolExecutor;
/* compiled from: PG */
/* renamed from: cwtq  reason: default package */
/* loaded from: classes5.dex */
public final class cwtq implements Factory<dehq> {
    private final dzsj<cwty> a;

    public cwtq(dzsj<cwty> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        cwty a = this.a.a();
        dehq a2 = a.a();
        if (a2 == null) {
            int c = a.c();
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(c, new cwto(a.b()), new cwtm());
            scheduledThreadPoolExecutor.setMaximumPoolSize(c);
            a2 = dehx.d(scheduledThreadPoolExecutor);
        }
        return new cwtv(a2, cwtj.a);
    }
}
