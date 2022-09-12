package defpackage;

import java.util.concurrent.ThreadFactory;
/* compiled from: PG */
/* renamed from: eaez  reason: default package */
/* loaded from: classes6.dex */
final class eaez implements ThreadFactory {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    public eaez(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.a);
        thread.setDaemon(this.b);
        return thread;
    }
}
