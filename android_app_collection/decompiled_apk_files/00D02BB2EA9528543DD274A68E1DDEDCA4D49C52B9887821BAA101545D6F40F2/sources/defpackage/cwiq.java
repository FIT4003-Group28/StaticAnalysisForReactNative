package defpackage;

import java.util.concurrent.ThreadFactory;
/* renamed from: cwiq  reason: default package */
/* loaded from: classes.dex */
final /* synthetic */ class cwiq implements ThreadFactory {
    static final ThreadFactory a = new cwiq();

    private cwiq() {
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable);
    }
}
