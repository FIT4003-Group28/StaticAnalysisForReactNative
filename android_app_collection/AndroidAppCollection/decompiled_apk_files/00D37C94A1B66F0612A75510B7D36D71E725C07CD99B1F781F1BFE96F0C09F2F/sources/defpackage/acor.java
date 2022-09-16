package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.lang.Thread;
/* compiled from: PG */
/* renamed from: acor  reason: default package */
/* loaded from: classes.dex */
public final class acor implements acoe {
    public final Context a;
    public final Handler b;
    public final absz c;
    public final abrz d;
    public final abss e;
    public abrx f;
    public boolean g;
    public String h;
    public acbk i;
    public acbq j;
    public accg k;
    public acbw l;
    public acbt m;
    public acbt n;
    public accj o;
    public final abtw p;
    public final Runnable q;
    public final Runnable r;
    public final acbs s;
    public final acbr t;
    public abxj u;
    private final Handler v;
    private boolean w;
    private boolean x;

    public acor(Context context, abss abssVar, abtw abtwVar, absz abszVar, abrz abrzVar) {
        acbd.a();
        abxb.f();
        achj.i();
        achc.f();
        acbp.b();
        this.v = new Handler(Looper.getMainLooper());
        this.q = new acoh(this, 1);
        this.r = new acoh(this);
        this.s = new acol(this);
        this.t = new acom(this);
        this.a = context;
        this.e = abssVar;
        this.p = abtwVar;
        this.c = abszVar;
        this.d = abrzVar;
        this.g = false;
        HandlerThread handlerThread = new HandlerThread("LocalRecordingManagerThread", 0);
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper());
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: acog
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                acor acorVar = acor.this;
                zep.f("LocalRecordingManagerImpl", "Local Recording Manager thread has encounter an exception.", th);
                acorVar.g();
            }
        });
    }

    @Override // defpackage.acoe
    public final void a(boolean z) {
        this.w = z;
        d();
    }

    @Override // defpackage.acoe
    public final void b(boolean z) {
        this.x = z;
        d();
    }

    public final void c(boolean z) {
        boolean e;
        ylr.b();
        if (f()) {
            this.l.g(this.a, new acon());
            e = false;
        } else {
            zep.c("LocalRecordingManagerImpl", "Not able to stop muxer.");
            e = e();
        }
        this.g = false;
        Handler handler = this.v;
        final int i = e ? 1 : 0;
        int i2 = e ? 1 : 0;
        handler.post(new Runnable() { // from class: acoi
            @Override // java.lang.Runnable
            public final void run() {
                acor acorVar = acor.this;
                int i3 = i;
                abxj abxjVar = acorVar.u;
                if (abxjVar != null) {
                    abxjVar.a(i3);
                    acorVar.u = null;
                }
            }
        });
    }

    public final void d() {
        acbk acbkVar = this.i;
        if (acbkVar != null) {
            boolean z = false;
            if (this.w && !this.x) {
                z = true;
            }
            acbkVar.d = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return (this.k == null || this.i == null || this.l == null || this.m == null || this.n == null) ? false : true;
    }

    public final boolean f() {
        acbw acbwVar = this.l;
        return acbwVar != null && acbwVar.m();
    }

    public final void g() {
        this.v.post(new qvl(17));
    }
}
