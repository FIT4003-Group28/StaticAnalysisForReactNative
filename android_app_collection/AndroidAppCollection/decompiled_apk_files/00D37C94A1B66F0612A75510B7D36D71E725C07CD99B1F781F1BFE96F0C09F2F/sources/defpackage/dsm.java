package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: dsm  reason: default package */
/* loaded from: classes3.dex */
public final class dsm implements dsp {
    private static dsm l;
    public final Context a;
    public final rct b;
    public final rcu c;
    public final rcw d;
    public final rcd e;
    public volatile boolean h;
    public final dsk j;
    public final int k;
    private final dtl m;
    private final Executor n;
    volatile long f = 0;
    public final Object g = new Object();
    public volatile boolean i = false;

    public dsm(Context context, rcd rcdVar, rct rctVar, rcu rcuVar, rcw rcwVar, dtl dtlVar, Executor executor, qzu qzuVar, int i) {
        this.a = context;
        this.e = rcdVar;
        this.b = rctVar;
        this.c = rcuVar;
        this.d = rcwVar;
        this.m = dtlVar;
        this.n = executor;
        this.k = i;
        this.j = new dsk(qzuVar);
    }

    public static synchronized dsm a(String str, Context context, boolean z, boolean z2) {
        dsm b;
        synchronized (dsm.class) {
            b = b(str, context, Executors.newCachedThreadPool(), z, z2);
        }
        return b;
    }

    public static synchronized dsm b(String str, Context context, Executor executor, boolean z, boolean z2) {
        dsm dsmVar;
        Boolean bool;
        synchronized (dsm.class) {
            if (l == null) {
                rce rceVar = new rce();
                rceVar.a(false);
                rceVar.c = true;
                if (str != null) {
                    rceVar.a = str;
                    rceVar.a(z);
                    String str2 = rceVar.a;
                    if (str2 != null && (bool = rceVar.b) != null && rceVar.c != null) {
                        rcf rcfVar = new rcf(str2, bool.booleanValue(), rceVar.c.booleanValue());
                        rcd a = rcd.a(context, executor, z2);
                        dta a2 = ((Boolean) qdb.w.e()).booleanValue() ? dta.a(context) : null;
                        dnw dnwVar = rcl.a;
                        dnw dnwVar2 = rcm.a;
                        rcn rcnVar = new rcn(context, executor, a, rcfVar);
                        if (!rcnVar.c.b) {
                            rcnVar.d = rwd.c(rcl.a);
                        } else {
                            rcnVar.d = rcnVar.b(new rck(rcnVar, 1));
                        }
                        rcnVar.e = rcnVar.b(new rck(rcnVar));
                        dtk dtkVar = new dtk(context);
                        dtl dtlVar = new dtl(rcfVar, rcnVar, new dtw(context, dtkVar), dtkVar, a2);
                        int w = qnm.w(context, a);
                        qzu qzuVar = new qzu();
                        dsm dsmVar2 = new dsm(context, a, new rct(context, w), new rcu(context, w, new dsj(a), ((Boolean) qdb.c.e()).booleanValue()), new rcw(context, dtlVar, a, qzuVar), dtlVar, executor, qzuVar, w);
                        l = dsmVar2;
                        dsmVar2.j();
                        l.l();
                    }
                    StringBuilder sb = new StringBuilder();
                    if (rceVar.a == null) {
                        sb.append(" clientVersion");
                    }
                    if (rceVar.b == null) {
                        sb.append(" shouldGetAdvertisingId");
                    }
                    if (rceVar.c == null) {
                        sb.append(" isGooglePlayServicesAvailable");
                    }
                    String valueOf = String.valueOf(sb);
                    StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
                    sb2.append("Missing required properties:");
                    sb2.append(valueOf);
                    throw new IllegalStateException(sb2.toString());
                }
                throw new NullPointerException("Null clientVersion");
            }
            dsmVar = l;
        }
        return dsmVar;
    }

    @Override // defpackage.dsp
    public final String c(Context context, String str) {
        return d(context, str, null, null);
    }

    @Override // defpackage.dsp
    public final String d(Context context, String str, View view, Activity activity) {
        l();
        rcg a = this.d.a();
        if (a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String a2 = a.a(context, str, view, activity);
            this.e.f(5000, System.currentTimeMillis() - currentTimeMillis, a2);
            return a2;
        }
        return "";
    }

    @Override // defpackage.dsp
    public final String e(Context context) {
        l();
        rcg a = this.d.a();
        if (a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String c = a.c(context);
            this.e.f(5001, System.currentTimeMillis() - currentTimeMillis, c);
            return c;
        }
        return "";
    }

    @Override // defpackage.dsp
    public final String f(Context context, byte[] bArr) {
        return null;
    }

    @Override // defpackage.dsp
    public final String g(Context context, View view, Activity activity) {
        l();
        rcg a = this.d.a();
        if (a != null) {
            long currentTimeMillis = System.currentTimeMillis();
            String b = a.b(context, view, activity);
            this.e.f(5002, System.currentTimeMillis() - currentTimeMillis, b);
            return b;
        }
        return "";
    }

    @Override // defpackage.dsp
    public final void h(MotionEvent motionEvent) {
        rcg a = this.d.a();
        if (a != null) {
            try {
                a.d(motionEvent);
            } catch (rcv e) {
                this.e.c(e.a, -1L, e);
            }
        }
    }

    @Override // defpackage.dsp
    public final void i(int i, int i2, int i3) {
    }

    final synchronized void j() {
        long currentTimeMillis = System.currentTimeMillis();
        rcs n = n();
        if (n != null) {
            if (!this.d.b(n)) {
                return;
            }
            this.i = true;
            return;
        }
        this.e.d(4013, System.currentTimeMillis() - currentTimeMillis);
    }

    @Override // defpackage.dsp
    public final void k(View view) {
        this.m.c.d(view);
    }

    public final void l() {
        rcs rcsVar;
        if (!this.h) {
            synchronized (this.g) {
                if (!this.h) {
                    if ((System.currentTimeMillis() / 1000) - this.f < 3600) {
                        return;
                    }
                    rcw rcwVar = this.d;
                    synchronized (rcwVar.b) {
                        rcr rcrVar = rcwVar.a;
                        rcsVar = rcrVar != null ? rcrVar.a : null;
                    }
                    if ((rcsVar == null || rcsVar.a.e - (System.currentTimeMillis() / 1000) < 3600) && qnm.v(this.k)) {
                        this.n.execute(new dsl(this));
                    }
                }
            }
        }
    }

    public final synchronized boolean m() {
        return this.i;
    }

    public final rcs n() {
        rcs rcsVar = null;
        if (!qnm.v(this.k)) {
            return null;
        }
        if (((Boolean) qdb.b.e()).booleanValue()) {
            rcu rcuVar = this.c;
            long currentTimeMillis = System.currentTimeMillis();
            synchronized (rcu.a) {
                dvb g = rcuVar.g(1);
                if (g != null) {
                    File a = rcuVar.a(g.c);
                    File file = new File(a, "pcam.jar");
                    if (!file.exists()) {
                        file = new File(a, "pcam");
                    }
                    File file2 = new File(a, "pcbc");
                    File file3 = new File(a, "pcopt");
                    rcuVar.e(5016, currentTimeMillis);
                    rcsVar = new rcs(g, file, file2, file3);
                } else {
                    rcuVar.e(4022, currentTimeMillis);
                }
            }
            return rcsVar;
        }
        rct rctVar = this.b;
        dvb e = rctVar.e(1);
        if (e == null) {
            return null;
        }
        String str = e.c;
        File q = qnm.q(str, "pcam.jar", rctVar.a());
        if (!q.exists()) {
            q = qnm.q(str, "pcam", rctVar.a());
        }
        return new rcs(e, q, qnm.q(str, "pcbc", rctVar.a()), qnm.q(str, "pcopt", rctVar.a()));
    }
}
