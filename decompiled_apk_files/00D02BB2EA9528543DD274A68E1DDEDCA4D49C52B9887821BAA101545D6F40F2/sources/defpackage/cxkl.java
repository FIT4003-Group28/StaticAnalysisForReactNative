package defpackage;

import java.util.concurrent.ThreadFactory;
/* renamed from: cxkl  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cxkl implements ThreadFactory {
    public static final ThreadFactory a = new cxkl();

    private cxkl() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "PhenotypeAccountRemovedBroadcastReceiver");
    }
}
