package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: acqr  reason: default package */
/* loaded from: classes.dex */
public final class acqr {
    public final bamm a;
    public final Handler b;
    public bapm c;
    private final HandlerThread d;

    public acqr(bamm bammVar, final acpo acpoVar) {
        this.a = bammVar;
        HandlerThread handlerThread = new HandlerThread("YuvConverterThread");
        this.d = handlerThread;
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: acqp
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                acpo acpoVar2 = acpo.this;
                zep.f("YuvConversionHelper", "YUV conversion helper thread died unexpectedly", th);
                acpoVar2.a.a();
            }
        });
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.b = handler;
        bapa.e(handler, new Runnable() { // from class: acqo
            @Override // java.lang.Runnable
            public final void run() {
                acqr acqrVar = acqr.this;
                bams d = bamk.d(acqrVar.a, bams.d);
                try {
                    d.c();
                    d.f();
                    acqrVar.c = new bapm();
                } catch (RuntimeException e) {
                    d.g();
                    acqrVar.b.getLooper().quit();
                    throw e;
                }
            }
        });
    }

    protected final void finalize() {
        this.d.quit();
        super.finalize();
    }
}
