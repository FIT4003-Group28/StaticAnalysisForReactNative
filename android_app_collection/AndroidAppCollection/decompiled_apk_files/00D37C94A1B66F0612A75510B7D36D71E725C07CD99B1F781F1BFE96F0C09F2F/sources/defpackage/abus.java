package defpackage;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.protos.youtube.api.innertube.LogStreamEventsCommandOuterClass$LogStreamEventsCommand;
import com.google.protos.youtube.api.innertube.RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand;
import java.lang.Thread;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: abus  reason: default package */
/* loaded from: classes.dex */
public final class abus implements abtx {
    public final acbs A;
    public abxj B;
    private final Handler C;
    private final HandlerThread D;
    private absi E;
    private final acbr F;
    public final boolean a;
    public final Context b;
    public final Handler c;
    public final ScheduledExecutorService d;
    public final snc e;
    public final abss f;
    public final abtw g;
    public boolean h;
    public boolean i;
    public acbt j;
    public acbt k;
    public acbc l;
    public acbq m;
    public abtu n;
    public acbw o;
    public boolean p;
    public accg q;
    public final boolean r;
    public volatile abto s;
    public abrx t;
    public absz u;
    public abrz v;
    public int w;
    public boolean x;
    public final Runnable y;
    public final Runnable z;

    public abus(boolean z, Context context, snc sncVar, abss abssVar, abtw abtwVar) {
        abxb f = abxb.f();
        acbd.a();
        achj.i();
        achc.f();
        acbp.b();
        if (abtp.a == null) {
            abtp.a = new abtp();
        }
        this.C = new Handler(Looper.getMainLooper());
        this.w = 0;
        this.F = new abum(this);
        this.y = new abuh(this, 1);
        this.z = new abuh(this);
        this.A = new abup(this);
        this.a = z;
        this.b = context.getApplicationContext();
        this.e = sncVar;
        this.f = abssVar;
        this.g = abtwVar;
        f.getClass();
        this.r = context.getPackageManager().hasSystemFeature("android.hardware.microphone");
        HandlerThread handlerThread = new HandlerThread("CodecThread", 0);
        this.D = handlerThread;
        handlerThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: abuf
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                abus abusVar = abus.this;
                zep.f("MediaMuxCapturePipelineMgr", "Codec thread died unexpectedly", th);
                abusVar.v(1);
            }
        });
        handlerThread.start();
        this.c = new Handler(handlerThread.getLooper());
        this.d = Executors.newSingleThreadScheduledExecutor(new yli(0, "AbrThread"));
        if (z) {
            this.u = new absz();
            this.v = new abrz(this.u);
            this.E = new absi(this.v);
        }
    }

    private final boolean B() {
        acbw acbwVar = this.o;
        return acbwVar != null && acbwVar.m();
    }

    public final void A(int i) {
        this.w = 0;
        this.C.post(new abui(this, i));
    }

    @Override // defpackage.abtx
    public final absi a() {
        return this.E;
    }

    @Override // defpackage.abtx
    public final abto b() {
        return this.s;
    }

    @Override // defpackage.abtx
    public final void c(LogStreamEventsCommandOuterClass$LogStreamEventsCommand logStreamEventsCommandOuterClass$LogStreamEventsCommand) {
    }

    @Override // defpackage.abtx
    public final void d(RecordStreamEventsCommandOuterClass$RecordStreamEventsCommand recordStreamEventsCommandOuterClass$RecordStreamEventsCommand) {
    }

    @Override // defpackage.abtx
    public final void e() {
    }

    @Override // defpackage.abtx
    public final synchronized void f(abtv abtvVar) {
        this.c.post(new abub(this, abtvVar, 1));
    }

    protected final void finalize() {
        HandlerThread handlerThread = this.D;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        super.finalize();
    }

    @Override // defpackage.abtx
    public final synchronized void g(abtv abtvVar) {
        this.c.post(new abub(this, abtvVar));
    }

    @Override // defpackage.abtx
    public final void h(abut abutVar) {
    }

    @Override // defpackage.abtx
    public final synchronized void i(final abtu abtuVar, final abtv abtvVar) {
        this.c.post(new Runnable() { // from class: abuk
            @Override // java.lang.Runnable
            public final void run() {
                abus abusVar = abus.this;
                abtu abtuVar2 = abtuVar;
                abtv abtvVar2 = abtvVar;
                ylr.b();
                if (abusVar.w != 1) {
                    zep.c("MediaMuxCapturePipelineMgr", "Start capture requested when not prepared");
                    abusVar.s(8, abtvVar2);
                    return;
                }
                int i = 7;
                if (!abusVar.y()) {
                    i = 2;
                } else if (abusVar.j.d() && abusVar.k.d() && abusVar.q.h()) {
                    if (abusVar.s != null && !abusVar.x) {
                        abusVar.s.d(true);
                    }
                    i = 0;
                }
                if (i != 0) {
                    abusVar.s(i, abtvVar2);
                    return;
                }
                abusVar.n = abtuVar2;
                abusVar.w = 2;
                abusVar.u(0, abtvVar2);
            }
        });
        abxa.b().f(astk.class, abur.class, new abur(this));
    }

    @Override // defpackage.abtx
    public final boolean j() {
        return this.h;
    }

    @Override // defpackage.abtx
    public final boolean k() {
        return ((acbz) this.l).d;
    }

    @Override // defpackage.abtx
    public final boolean l() {
        return this.i;
    }

    @Override // defpackage.abtx
    public final absz m() {
        return this.u;
    }

    @Override // defpackage.abtx
    public final synchronized void n(final boolean z, final abxq abxqVar) {
        this.c.post(new Runnable() { // from class: abue
            @Override // java.lang.Runnable
            public final void run() {
                abus abusVar = abus.this;
                boolean z2 = z;
                abxq abxqVar2 = abxqVar;
                if (abusVar.w == 0) {
                    abusVar.z(2, abxqVar2);
                } else if (abusVar.r || !z2) {
                    abusVar.h = z2;
                    abusVar.x();
                    abusVar.z(0, abxqVar2);
                } else {
                    abusVar.z(3, abxqVar2);
                }
            }
        });
    }

    @Override // defpackage.abtx
    public final void o(final abxj abxjVar) {
        this.n = null;
        this.c.post(new Runnable() { // from class: abuc
            @Override // java.lang.Runnable
            public final void run() {
                abus abusVar = abus.this;
                abxj abxjVar2 = abxjVar;
                ylr.b();
                abusVar.B = abxjVar2;
                abusVar.w();
                abusVar.c.postDelayed(abusVar.z, 250L);
            }
        });
        abxa.b().f(astk.class, abur.class, null);
    }

    @Override // defpackage.abtx
    public final synchronized void p(abtv abtvVar) {
        this.c.post(new abub(this, abtvVar, 2));
    }

    @Override // defpackage.abtx
    public final synchronized void q(final boolean z, boolean z2, Integer num, Integer num2, final MediaFormat mediaFormat, final MediaFormat mediaFormat2, final String str, final String str2, final accg accgVar, final Bundle bundle, final abtv abtvVar) {
        this.c.post(new Runnable() { // from class: abuj
            /* JADX WARN: Removed duplicated region for block: B:41:0x011c  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x0126  */
            /* JADX WARN: Removed duplicated region for block: B:56:0x0153  */
            /* JADX WARN: Removed duplicated region for block: B:57:0x0156  */
            /* JADX WARN: Removed duplicated region for block: B:60:0x017c  */
            /* JADX WARN: Removed duplicated region for block: B:61:0x017e  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x01a1  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x01a3  */
            /* JADX WARN: Removed duplicated region for block: B:67:0x01b3  */
            /* JADX WARN: Removed duplicated region for block: B:69:0x01b7  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 798
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.abuj.run():void");
            }
        });
    }

    public final void r(boolean z) {
        ylr.b();
        this.c.removeCallbacks(this.y);
        this.c.removeCallbacks(this.z);
        if (!this.p) {
            zep.c("MediaMuxCapturePipelineMgr", "Re-entered codec pipeline stop handler.  Skipping");
            A(2);
        } else if (B()) {
            this.p = false;
            this.o.g(this.b, new abun(this));
        } else {
            boolean y = y();
            t();
            this.p = false;
            A(y ? 1 : 0);
        }
    }

    public final void s(int i, abtv abtvVar) {
        ylr.b();
        aqxo.y(true);
        t();
        u(i, abtvVar);
    }

    public final void t() {
        acbw acbwVar;
        ylr.b();
        w();
        B();
        if (this.p && (acbwVar = this.o) != null) {
            acbwVar.f();
        }
        if (this.o != null) {
            B();
            this.o.o();
            this.o = null;
        }
        acbt acbtVar = this.j;
        if (acbtVar != null) {
            ((acbo) acbtVar).e = null;
            acbtVar.e();
            this.j.c();
            this.j = null;
        }
        acbt acbtVar2 = this.k;
        if (acbtVar2 != null) {
            ((acbe) acbtVar2).d = null;
            acbtVar2.e();
            this.k.c();
            this.k = null;
        }
        this.w = 0;
        this.x = false;
    }

    public final void u(int i, abtv abtvVar) {
        this.C.post(new acqc(abtvVar, i, 1));
    }

    public final void v(int i) {
        this.C.post(new abui(this, i, 1));
        if (abxb.c(i)) {
            this.c.post(new abuh(this, 2));
        }
    }

    public final void w() {
        if (this.s != null) {
            this.s.d(false);
        }
        acbt acbtVar = this.j;
        if (acbtVar != null) {
            acbtVar.l(this.F);
        }
        acbt acbtVar2 = this.k;
        if (acbtVar2 != null) {
            acbtVar2.l(this.F);
        }
        if (this.s != null) {
            this.s.d(false);
            this.s = null;
        }
        accg accgVar = this.q;
        if (accgVar != null) {
            accgVar.c(null, null);
            this.q.b(null, null);
            this.q.j();
            this.q.i();
            this.q = null;
        }
    }

    public final void x() {
        acbc acbcVar = this.l;
        if (acbcVar != null) {
            boolean z = false;
            if (this.h && !this.i) {
                z = true;
            }
            ((acbz) acbcVar).d = z;
        }
    }

    public final boolean y() {
        return (this.q == null || this.j == null || this.k == null || this.l == null || this.o == null) ? false : true;
    }

    public final void z(final int i, final abxq abxqVar) {
        this.C.post(new Runnable() { // from class: abua
            @Override // java.lang.Runnable
            public final void run() {
                abxqVar.a(i, abus.this.h);
            }
        });
    }
}
