package defpackage;

import java.util.concurrent.ThreadFactory;
/* renamed from: cxjg  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class cxjg implements ThreadFactory {
    static final ThreadFactory a = new cxjg();

    private cxjg() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ProcessStablePhenotypeFlag");
    }
}
