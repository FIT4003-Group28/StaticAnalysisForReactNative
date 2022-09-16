package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.google.android.youtube.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: brq  reason: default package */
/* loaded from: classes2.dex */
public final class brq extends bqo {
    public static final Object a;
    private static brq k;
    private static brq l;
    public final Context b;
    public final bps c;
    public final WorkDatabase d;
    public final List e;
    public final bqy f;
    public final bvj g;
    public boolean h;
    public BroadcastReceiver.PendingResult i;
    public final bwn j;

    static {
        bqf.b("WorkManagerImpl");
        k = null;
        l = null;
        a = new Object();
    }

    public brq(Context context, bps bpsVar, bwn bwnVar) {
        WorkDatabase m = WorkDatabase.m(context.getApplicationContext(), bwnVar.a, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
        Context applicationContext = context.getApplicationContext();
        bqf.c(new bqf(bpsVar.f));
        List asList = Arrays.asList(bra.a(applicationContext, this), new brx(applicationContext, bpsVar, bwnVar, this));
        bqy bqyVar = new bqy(context, bpsVar, bwnVar, m, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.b = applicationContext2;
        this.c = bpsVar;
        this.j = bwnVar;
        this.d = m;
        this.e = asList;
        this.f = bqyVar;
        this.g = new bvj(m);
        this.h = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext2.isDeviceProtectedStorage()) {
            bwnVar.a(new bvg(applicationContext2, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0032, code lost:
        r2 = r6.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0038, code lost:
        if (defpackage.brq.l != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
        defpackage.brq.l = new defpackage.brq(r2, r1, new defpackage.bwn(r1.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0048, code lost:
        defpackage.brq.k = defpackage.brq.l;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.brq h(android.content.Context r6) {
        /*
            java.lang.Object r0 = defpackage.brq.a
            monitor-enter(r0)
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L62
            brq r1 = defpackage.brq.k     // Catch: java.lang.Throwable -> L5f
            if (r1 == 0) goto La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            goto Ld
        La:
            brq r1 = defpackage.brq.l     // Catch: java.lang.Throwable -> L5f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
        Ld:
            if (r1 != 0) goto L5d
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L62
            boolean r1 = r6 instanceof defpackage.bpr     // Catch: java.lang.Throwable -> L62
            if (r1 == 0) goto L55
            r1 = r6
            bpr r1 = (defpackage.bpr) r1     // Catch: java.lang.Throwable -> L62
            bps r1 = r1.a()     // Catch: java.lang.Throwable -> L62
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L62
            brq r2 = defpackage.brq.k     // Catch: java.lang.Throwable -> L52
            if (r2 == 0) goto L30
            brq r3 = defpackage.brq.l     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L28
            goto L30
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L52
            throw r6     // Catch: java.lang.Throwable -> L52
        L30:
            if (r2 != 0) goto L4c
            android.content.Context r2 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> L52
            brq r3 = defpackage.brq.l     // Catch: java.lang.Throwable -> L52
            if (r3 != 0) goto L48
            brq r3 = new brq     // Catch: java.lang.Throwable -> L52
            bwn r4 = new bwn     // Catch: java.lang.Throwable -> L52
            java.util.concurrent.Executor r5 = r1.b     // Catch: java.lang.Throwable -> L52
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L52
            r3.<init>(r2, r1, r4)     // Catch: java.lang.Throwable -> L52
            defpackage.brq.l = r3     // Catch: java.lang.Throwable -> L52
        L48:
            brq r1 = defpackage.brq.l     // Catch: java.lang.Throwable -> L52
            defpackage.brq.k = r1     // Catch: java.lang.Throwable -> L52
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            brq r1 = h(r6)     // Catch: java.lang.Throwable -> L62
            goto L5d
        L52:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L52
            throw r6     // Catch: java.lang.Throwable -> L62
        L55:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L62
            java.lang.String r1 = "WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider."
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L62
            throw r6     // Catch: java.lang.Throwable -> L62
        L5d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            return r1
        L5f:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5f
            throw r6     // Catch: java.lang.Throwable -> L62
        L62:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L62
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.brq.h(android.content.Context):brq");
    }

    @Override // defpackage.bqo
    public final bqk b(List list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new brb(this, null, 2, list, null).d();
    }

    @Override // defpackage.bqo
    public final bqk c(String str, int i, List list) {
        return new brb(this, str, i, list).d();
    }

    @Override // defpackage.bqo
    public final void d(String str) {
        this.j.a(new bvc(this, str));
    }

    @Override // defpackage.bqo
    public final void e(String str) {
        this.j.a(bve.b(str, this, true));
    }

    @Override // defpackage.bqo
    public final bqk f(String str, int i, bqq bqqVar) {
        int i2 = 2;
        if (i != 2) {
            i2 = 1;
        }
        return new brb(this, str, i2, Collections.singletonList(bqqVar)).d();
    }

    public final void i() {
        synchronized (a) {
            this.h = true;
            BroadcastReceiver.PendingResult pendingResult = this.i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.i = null;
            }
        }
    }

    public final void j() {
        if (Build.VERSION.SDK_INT >= 23) {
            bsl.a(this.b);
        }
        bun n = this.d.n();
        bux buxVar = (bux) n;
        buxVar.a.e();
        bmb d = buxVar.e.d();
        buxVar.a.f();
        try {
            d.a();
            ((bux) n).a.h();
            buxVar.a.g();
            buxVar.e.e(d);
            bra.b(this.d, this.e);
        } catch (Throwable th) {
            buxVar.a.g();
            buxVar.e.e(d);
            throw th;
        }
    }

    public final void k(String str) {
        m(str, null);
    }

    public final void l(String str) {
        this.j.a(new bvp(this, str, false));
    }

    public final void m(String str, aed aedVar) {
        this.j.a(new bvn(this, str, aedVar, null));
    }
}
