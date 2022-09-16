package defpackage;

import java.lang.Thread;
import org.chromium.base.JavaHandlerThread;
/* compiled from: PG */
/* renamed from: baca  reason: default package */
/* loaded from: classes2.dex */
public final class baca implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ JavaHandlerThread a;

    public baca(JavaHandlerThread javaHandlerThread) {
        this.a = javaHandlerThread;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.a.b = th;
    }
}
