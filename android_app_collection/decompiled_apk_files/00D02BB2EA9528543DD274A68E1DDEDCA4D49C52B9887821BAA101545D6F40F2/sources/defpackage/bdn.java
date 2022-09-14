package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import com.google.android.apps.maps.R;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: bdn  reason: default package */
/* loaded from: classes.dex */
public final class bdn extends bcl {
    public static final Object j;
    private static bdn l;
    private static bdn m;
    public final Context a;
    public final bbj b;
    public final WorkDatabase c;
    public final List<bcx> d;
    public final bcw e;
    public final bhf f;
    public boolean g;
    public BroadcastReceiver.PendingResult h;
    public volatile bii i;
    public final bif k;

    static {
        bbz.f("WorkManagerImpl");
        l = null;
        m = null;
        j = new Object();
    }

    public bdn(Context context, bbj bbjVar, bif bifVar) {
        WorkDatabase r = WorkDatabase.r(context.getApplicationContext(), bifVar.a, context.getResources().getBoolean(R.bool.workmanager_test_configuration));
        Context applicationContext = context.getApplicationContext();
        int i = bbjVar.e;
        bbz.d(new bby(4));
        List<bcx> asList = Arrays.asList(bcy.b(applicationContext, this), new bdu(applicationContext, bbjVar, bifVar, this));
        bcw bcwVar = new bcw(context, bbjVar, bifVar, r, asList);
        Context applicationContext2 = context.getApplicationContext();
        this.a = applicationContext2;
        this.b = bbjVar;
        this.k = bifVar;
        this.c = r;
        this.d = asList;
        this.e = bcwVar;
        this.f = new bhf(r);
        this.g = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext2.isDeviceProtectedStorage()) {
            bifVar.a(new bhc(applicationContext2, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    public static bdn g(Context context) {
        bdn bdnVar;
        Object obj = j;
        synchronized (obj) {
            synchronized (obj) {
                bdnVar = l;
                if (bdnVar == null) {
                    bdnVar = m;
                }
            }
            return bdnVar;
        }
        if (bdnVar == null) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext instanceof bbi) {
                h(applicationContext, ((bbi) applicationContext).a());
                bdnVar = g(applicationContext);
            } else {
                throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
            }
        }
        return bdnVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0016, code lost:
        r4 = r4.getApplicationContext();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (defpackage.bdn.m != null) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x001e, code lost:
        defpackage.bdn.m = new defpackage.bdn(r4, r5, new defpackage.bif(r5.b));
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        defpackage.bdn.l = defpackage.bdn.m;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void h(android.content.Context r4, defpackage.bbj r5) {
        /*
            java.lang.Object r0 = defpackage.bdn.j
            monitor-enter(r0)
            bdn r1 = defpackage.bdn.l     // Catch: java.lang.Throwable -> L32
            if (r1 == 0) goto L14
            bdn r2 = defpackage.bdn.m     // Catch: java.lang.Throwable -> L32
            if (r2 != 0) goto Lc
            goto L14
        Lc:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L32
            java.lang.String r5 = "WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information."
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L32
            throw r4     // Catch: java.lang.Throwable -> L32
        L14:
            if (r1 != 0) goto L30
            android.content.Context r4 = r4.getApplicationContext()     // Catch: java.lang.Throwable -> L32
            bdn r1 = defpackage.bdn.m     // Catch: java.lang.Throwable -> L32
            if (r1 != 0) goto L2c
            bdn r1 = new bdn     // Catch: java.lang.Throwable -> L32
            bif r2 = new bif     // Catch: java.lang.Throwable -> L32
            java.util.concurrent.Executor r3 = r5.b     // Catch: java.lang.Throwable -> L32
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L32
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L32
            defpackage.bdn.m = r1     // Catch: java.lang.Throwable -> L32
        L2c:
            bdn r4 = defpackage.bdn.m     // Catch: java.lang.Throwable -> L32
            defpackage.bdn.l = r4     // Catch: java.lang.Throwable -> L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            return
        L32:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdn.h(android.content.Context, bbj):void");
    }

    @Override // defpackage.bcl
    public final bcg b(List<? extends bcn> list) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
        }
        return new bcz(this, null, 2, list, null).a();
    }

    @Override // defpackage.bcl
    public final void c(String str) {
        this.k.a(new bgy(this, str));
    }

    @Override // defpackage.bcl
    public final bcg e(String str, int i, List<bcb> list) {
        return new bcz(this, str, i, list).a();
    }

    @Override // defpackage.bcl
    public final bcg f(String str, int i, bci bciVar) {
        int i2 = 2;
        if (i != 2) {
            i2 = 1;
        }
        return new bcz(this, str, i2, Collections.singletonList(bciVar)).a();
    }

    public final void i(String str) {
        j(str, null);
    }

    public final void j(String str, bcr bcrVar) {
        this.k.a(new bhj(this, str, bcrVar));
    }

    public final void k(String str) {
        this.k.a(new bhk(this, str, false));
    }

    public final void l() {
        if (Build.VERSION.SDK_INT >= 23) {
            bei.e(this.a);
        }
        this.c.t().s();
        bcy.a(this.b, this.c, this.d);
    }
}
