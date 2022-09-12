package defpackage;

import java.util.concurrent.ThreadFactory;
/* renamed from: cxlt  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cxlt implements ThreadFactory {
    static final ThreadFactory a = new cxlt();

    private cxlt() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "PhenotypeBackgroundRecv");
    }
}
