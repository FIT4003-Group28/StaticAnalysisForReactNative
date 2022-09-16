package c.e.a.b.d.g;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private ThreadFactory f4412a = Executors.defaultThreadFactory();

    /* JADX INFO: Access modifiers changed from: package-private */
    public t(h hVar) {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f4412a.newThread(runnable);
        newThread.setName("ScionFrontendApi");
        return newThread;
    }
}
