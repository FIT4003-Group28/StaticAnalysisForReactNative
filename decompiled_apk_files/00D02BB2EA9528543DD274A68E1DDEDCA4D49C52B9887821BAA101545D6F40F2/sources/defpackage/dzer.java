package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: dzer  reason: default package */
/* loaded from: classes6.dex */
public final class dzer extends dyzz {
    private static final dzeu b = new dzeu("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    final ThreadFactory a = b;

    @Override // defpackage.dyzz
    public final dyzy a() {
        return new dzes(this.a);
    }
}
