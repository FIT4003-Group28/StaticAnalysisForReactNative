package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: dsu  reason: default package */
/* loaded from: classes3.dex */
public final class dsu implements Runnable, dsp {
    public Context a;
    public final rcd b;
    public final dnl c;
    public final boolean d;
    private final Executor g;
    private final boolean h;
    private final AtomicReference f = new AtomicReference();
    private final List i = new ArrayList();
    CountDownLatch e = new CountDownLatch(1);

    public dsu(Context context, Executor executor, dnl dnlVar) {
        boolean z = true;
        this.c = dnlVar;
        this.a = context;
        this.g = executor;
        qdb.b(context);
        boolean booleanValue = ((Boolean) qdb.d.e()).booleanValue();
        this.d = booleanValue;
        rcd a = rcd.a(context, executor, booleanValue);
        this.b = a;
        Context context2 = this.a;
        rcu rcuVar = new rcu(this.a, qnm.w(context2, a), new dst(this), ((Boolean) qdb.c.e()).booleanValue());
        long currentTimeMillis = System.currentTimeMillis();
        synchronized (rcu.a) {
            dvb g = rcuVar.g(1);
            if (g != null) {
                File a2 = rcuVar.a(g.c);
                if (!new File(a2, "pcam.jar").exists()) {
                    rcuVar.e(4026, currentTimeMillis);
                } else if (!new File(a2, "pcbc").exists()) {
                    rcuVar.e(4027, currentTimeMillis);
                } else {
                    rcuVar.e(5019, currentTimeMillis);
                }
            } else {
                rcuVar.e(4025, currentTimeMillis);
            }
            z = false;
        }
        this.h = z;
        executor.execute(this);
    }

    public static final Context a(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    private final void b() {
        if (this.i.isEmpty() || this.f.get() == null) {
            return;
        }
        for (Object[] objArr : this.i) {
            int length = objArr.length;
            if (length == 1) {
                ((dsp) this.f.get()).h((MotionEvent) objArr[0]);
            } else if (length == 3) {
                ((dsp) this.f.get()).i(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.i.clear();
    }

    private final boolean j() {
        try {
            this.e.await();
            return true;
        } catch (InterruptedException unused) {
            return false;
        }
    }

    private final void l() {
        this.f.set(dsw.n(this.c.e, a(this.a), this.c.f));
    }

    @Override // defpackage.dsp
    @Deprecated
    public final String c(Context context, String str) {
        return d(context, str, null, null);
    }

    @Override // defpackage.dsp
    @Deprecated
    public final String d(Context context, String str, View view, Activity activity) {
        if (!j() || this.f.get() == null) {
            return "";
        }
        b();
        return ((dsp) this.f.get()).d(a(context), str, view, activity);
    }

    @Override // defpackage.dsp
    public final String e(Context context) {
        return f(context, null);
    }

    @Override // defpackage.dsp
    public final String f(Context context, byte[] bArr) {
        if (!j() || this.f.get() == null) {
            return "";
        }
        b();
        return ((dsp) this.f.get()).e(a(context));
    }

    @Override // defpackage.dsp
    public final String g(Context context, View view, Activity activity) {
        return (!j() || this.f.get() == null) ? "" : ((dsp) this.f.get()).g(context, view, activity);
    }

    @Override // defpackage.dsp
    public final void h(MotionEvent motionEvent) {
        if (this.f.get() != null) {
            b();
            ((dsp) this.f.get()).h(motionEvent);
            return;
        }
        this.i.add(new Object[]{motionEvent});
    }

    @Override // defpackage.dsp
    public final void i(int i, int i2, int i3) {
        if (this.f.get() == null) {
            this.i.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
            return;
        }
        b();
        ((dsp) this.f.get()).i(i, i2, i3);
    }

    @Override // defpackage.dsp
    public final void k(View view) {
        if (this.f.get() != null) {
            ((dsp) this.f.get()).k(view);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0028 A[Catch: all -> 0x0075, NullPointerException -> 0x0077, TryCatch #1 {NullPointerException -> 0x0077, blocks: (B:3:0x0005, B:6:0x0010, B:15:0x0024, B:17:0x0028, B:21:0x0038, B:22:0x0043, B:24:0x0064, B:26:0x006a, B:9:0x0018, B:11:0x001c), top: B:41:0x0005, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[Catch: all -> 0x0075, NullPointerException -> 0x0077, TryCatch #1 {NullPointerException -> 0x0077, blocks: (B:3:0x0005, B:6:0x0010, B:15:0x0024, B:17:0x0028, B:21:0x0038, B:22:0x0043, B:24:0x0064, B:26:0x006a, B:9:0x0018, B:11:0x001c), top: B:41:0x0005, outer: #0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r8 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            dnl r3 = r8.c     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            int r3 = r3.c     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            int r3 = defpackage.dnt.c(r3)     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            if (r3 != 0) goto L10
            r3 = 1
        L10:
            int r3 = r3 + (-1)
            r4 = 3
            r5 = 2
            if (r3 == r5) goto L18
        L16:
            r3 = 2
            goto L24
        L18:
            boolean r3 = r8.h     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            if (r3 != 0) goto L23
            dnl r3 = r8.c     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            boolean r3 = r3.d     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            if (r3 == 0) goto L23
            goto L16
        L23:
            r3 = 3
        L24:
            int r3 = r3 + (-1)
            if (r3 == r5) goto L43
            r8.l()     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            dnl r3 = r8.c     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            int r3 = r3.c     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            int r3 = defpackage.dnt.c(r3)     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            if (r3 != 0) goto L36
            goto L6d
        L36:
            if (r3 != r4) goto L6d
            java.util.concurrent.Executor r3 = r8.g     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            dss r4 = new dss     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            r4.<init>()     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            r3.execute(r4)     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            goto L6d
        L43:
            dnl r3 = r8.c     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            java.lang.String r3 = r3.e     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            android.content.Context r4 = r8.a     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            android.content.Context r4 = a(r4)     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            java.util.concurrent.Executor r5 = r8.g     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            dnl r6 = r8.c     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            boolean r6 = r6.f     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            boolean r7 = r8.d     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            dsm r3 = defpackage.dsm.b(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            java.util.concurrent.atomic.AtomicReference r4 = r8.f     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            r4.set(r3)     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            boolean r3 = r3.m()     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            if (r3 != 0) goto L6d
            dnl r3 = r8.c     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            boolean r3 = r3.d     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
            if (r3 == 0) goto L6d
            r8.l()     // Catch: java.lang.Throwable -> L75 java.lang.NullPointerException -> L77
        L6d:
            java.util.concurrent.CountDownLatch r0 = r8.e
        L6f:
            r0.countDown()
            r8.a = r2
            return
        L75:
            r0 = move-exception
            goto L90
        L77:
            r3 = move-exception
            dnl r4 = r8.c     // Catch: java.lang.Throwable -> L75
            boolean r4 = r4.d     // Catch: java.lang.Throwable -> L75
            if (r4 == 0) goto L81
            r8.l()     // Catch: java.lang.Throwable -> L75
        L81:
            rcd r4 = r8.b     // Catch: java.lang.Throwable -> L75
            r5 = 2031(0x7ef, float:2.846E-42)
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L75
            long r6 = r6 - r0
            r4.c(r5, r6, r3)     // Catch: java.lang.Throwable -> L75
            java.util.concurrent.CountDownLatch r0 = r8.e
            goto L6f
        L90:
            java.util.concurrent.CountDownLatch r1 = r8.e
            r1.countDown()
            r8.a = r2
            goto L99
        L98:
            throw r0
        L99:
            goto L98
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dsu.run():void");
    }
}
