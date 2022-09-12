package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dzfg  reason: default package */
/* loaded from: classes6.dex */
public final class dzfg extends dyzz {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.dyzz
    public final dyzy a() {
        return new dzff();
    }

    @Override // defpackage.dyzz
    public final dzak c(Runnable runnable, long j, TimeUnit timeUnit) {
        try {
            timeUnit.sleep(j);
            dzfy.c(runnable);
            runnable.run();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            dzfy.a(e);
        }
        return dzbe.INSTANCE;
    }
}
