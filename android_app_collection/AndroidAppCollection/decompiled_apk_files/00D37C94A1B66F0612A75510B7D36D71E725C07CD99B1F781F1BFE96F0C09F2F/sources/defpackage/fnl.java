package defpackage;

import java.lang.Thread;
/* compiled from: PG */
/* renamed from: fnl  reason: default package */
/* loaded from: classes3.dex */
public final class fnl implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a;
    private final fnf b;
    private final boolean c;

    public fnl(aacz aaczVar, fnf fnfVar) {
        apgs ah = eog.ah(aaczVar);
        boolean z = false;
        if (ah != null && ah.b && ah.d && ah.e > 0) {
            z = true;
        }
        this.c = z;
        this.b = fnfVar;
    }

    public final void a() {
        if (this.c) {
            ylr.c();
            this.a = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        if (this.c && this.b.d()) {
            this.b.c();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
