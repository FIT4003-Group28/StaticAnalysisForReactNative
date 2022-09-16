package defpackage;

import android.util.Log;
import java.lang.Thread;
/* compiled from: PG */
/* renamed from: akwq  reason: default package */
/* loaded from: classes.dex */
public final class akwq implements Thread.UncaughtExceptionHandler {
    public String a = null;
    public Thread.UncaughtExceptionHandler b;

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        this.a = Log.getStackTraceString(th).replace(String.valueOf(th.getMessage()).concat("\n"), "\n");
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
