package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: aznc  reason: default package */
/* loaded from: classes2.dex */
public final class aznc extends ayor {
    private static final aznf c = new aznf("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    final ThreadFactory b = c;

    @Override // defpackage.ayor
    public final ayoq a() {
        return new aznd(this.b);
    }
}
