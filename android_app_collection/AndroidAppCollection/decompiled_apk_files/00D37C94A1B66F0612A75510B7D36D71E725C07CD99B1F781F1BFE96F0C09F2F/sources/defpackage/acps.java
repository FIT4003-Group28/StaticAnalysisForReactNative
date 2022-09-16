package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acps  reason: default package */
/* loaded from: classes.dex */
public final class acps {
    public final HandlerThread a;
    public final Handler b;
    public final acqr c;
    public Runnable d;
    public int e;
    public int f;
    public int g;
    public Handler h;
    public volatile bamj i;
    public boolean j;
    public acox k;

    public acps(bamm bammVar, final acoy acoyVar) {
        bammVar.getClass();
        this.c = new acqr(bammVar, new acpo(acoyVar));
        HandlerThread handlerThread = new HandlerThread("WebRtcCapturerThread");
        this.a = handlerThread;
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: acpr
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                acoy acoyVar2 = acoy.this;
                zep.f("VideoCapturerImpl", "WebRTC capturer thread died unexpectedly", th);
                acoyVar2.a();
            }
        });
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.b.post(new acpp(this));
    }
}
