package com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded;

import com.google.android.apps.youtube.embeddedplayer.service.errorlogging.shared.c;
import com.google.android.apps.youtube.embeddedplayer.service.model.RemoteEmbedExceptionData;
import java.lang.Thread;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class b {
    private static b a;
    private Thread.UncaughtExceptionHandler b;
    private volatile c c;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (a == null) {
                a = new b();
            }
            bVar = a;
        }
        return bVar;
    }

    public final synchronized void b(c cVar) {
        if (this.c == null) {
            this.c = cVar;
            if (this.b == null) {
                this.b = Thread.getDefaultUncaughtExceptionHandler();
                Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.google.android.apps.youtube.embeddedplayer.service.errorlogging.remoteloaded.a
                    @Override // java.lang.Thread.UncaughtExceptionHandler
                    public final void uncaughtException(Thread thread, Throwable th) {
                        b.this.d(thread, th);
                    }
                });
            }
        }
    }

    public final synchronized void c() {
        this.c = null;
    }

    public final synchronized void d(Thread thread, Throwable th) {
        if (th == null) {
            return;
        }
        c cVar = this.c;
        if (cVar != null) {
            Throwable th2 = th;
            loop0: while (true) {
                if (th2 == null) {
                    break;
                }
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    if (stackTraceElement.getClassName().startsWith("com.google.android.apps.youtube.embeddedplayer")) {
                        cVar.a(new RemoteEmbedExceptionData(th));
                        break loop0;
                    }
                }
                th2 = th2.getCause();
            }
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        } else {
            aqvb.k("Error calling original UncaughtExceptionHandler, cannot propagate exception to embedding app.", new Object[0]);
        }
    }
}
