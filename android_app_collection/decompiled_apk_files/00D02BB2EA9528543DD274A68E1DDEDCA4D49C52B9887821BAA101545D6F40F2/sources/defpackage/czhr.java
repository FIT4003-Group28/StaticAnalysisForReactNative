package defpackage;

import android.content.Context;
import java.io.IOException;
import java.lang.Thread;
/* compiled from: PG */
/* renamed from: czhr  reason: default package */
/* loaded from: classes.dex */
public final class czhr implements Thread.UncaughtExceptionHandler {
    private final Thread.UncaughtExceptionHandler a;
    private final Context b;

    public czhr(Context context, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
        this.b = context;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        for (Throwable th2 = th; th2 != null; th2 = th2.getCause()) {
            for (czhq czhqVar : czhd.g(this.b, czhq.class)) {
                if (czhqVar.b(th2)) {
                    try {
                        czhqVar.d(this.b).createNewFile();
                    } catch (IOException unused) {
                    }
                    String a = czhqVar.a();
                    StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 54);
                    sb.append("PlatformBugHandler matcher ");
                    sb.append(a);
                    sb.append(" matched uncaught exception");
                    bvoo.g(new Exception(sb.toString(), th2));
                    System.exit(0);
                }
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            deki.b(th);
        }
    }
}
