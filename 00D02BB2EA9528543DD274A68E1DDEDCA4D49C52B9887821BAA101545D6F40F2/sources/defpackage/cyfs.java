package defpackage;

import android.os.Debug;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cyfs  reason: default package */
/* loaded from: classes5.dex */
public final class cyfs implements cyfq {
    public static final Object a = new Object();
    public static final cyfs b = new cyfs();
    public boolean c;
    public long d;
    public long e;
    public long f;
    public int g;
    private final dehq h = dehx.d(Executors.newSingleThreadScheduledExecutor());
    @dzsi
    private cyfp i;
    private dehn<?> j;

    private cyfs() {
        c();
    }

    private final void c() {
        synchronized (a) {
            this.d = -1L;
            this.e = -1L;
            this.f = -1L;
            this.g = 0;
        }
    }

    @Override // defpackage.cyfq
    public final void a(long j, long j2) {
        synchronized (a) {
            if (this.c) {
                dehn<?> dehnVar = this.j;
                if (dehnVar == null || !dehnVar.isDone()) {
                    throw new IllegalStateException("Cannot start memory measurement because another measurement is in progress.");
                }
                b();
            }
            this.c = true;
        }
        this.j = deha.h(this.h.f(new Runnable(this) { // from class: cyfr
            private final cyfs a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cyfs cyfsVar = this.a;
                if (cyfsVar.c) {
                    long pss = Debug.getPss();
                    synchronized (cyfs.a) {
                        int i = cyfsVar.g;
                        if (i == 0) {
                            cyfsVar.d = pss;
                            cyfsVar.e = pss;
                            cyfsVar.f = pss;
                        } else {
                            if (pss > cyfsVar.e) {
                                cyfsVar.e = pss;
                            }
                            cyfsVar.f += pss;
                        }
                        cyfsVar.g = i + 1;
                    }
                }
            }
        }, 0L, j, TimeUnit.MILLISECONDS), j2, TimeUnit.MILLISECONDS, this.h);
    }

    @Override // defpackage.cyfq
    public final cyfp b() {
        long j;
        cyfp cyfpVar;
        Object obj = a;
        synchronized (obj) {
            if (this.c) {
                this.c = false;
                if (!this.j.isDone()) {
                    this.j.cancel(true);
                }
                long j2 = this.d;
                long j3 = this.e;
                int i = this.g;
                if (i > 0) {
                    double d = this.f;
                    double d2 = i;
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    j = Math.round(d / d2);
                } else {
                    j = -1;
                }
                this.i = new cyfp(j2, j3, j);
            } else {
                throw new IllegalStateException("Unable to stop a non-running measurement.");
            }
        }
        c();
        synchronized (obj) {
            cyfpVar = this.i;
        }
        return cyfpVar;
    }
}
