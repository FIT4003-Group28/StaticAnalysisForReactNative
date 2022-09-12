package defpackage;

import android.app.Application;
import android.content.Context;
import android.os.IBinder;
/* compiled from: PG */
/* renamed from: byoz  reason: default package */
/* loaded from: classes4.dex */
public final class byoz implements byqc {
    public final cqat a;
    public final Context b;
    public final dbrn<IBinder, danq> e;
    public final dxio<ckcw> f;
    private final btvo h;
    private final bvjj i;
    private final dehq j;
    public final Object c = new Object();
    public final Object d = new Object();
    @dzsi
    public byoy g = null;

    public byoz(Application application, btvo btvoVar, cqat cqatVar, bvjj bvjjVar, dehq dehqVar, dbrn<IBinder, danq> dbrnVar, dxio<ckcw> dxioVar) {
        this.b = application.getApplicationContext();
        this.h = btvoVar;
        this.a = cqatVar;
        this.i = bvjjVar;
        this.j = dehqVar;
        this.e = dbrnVar;
        this.f = dxioVar;
    }

    @Override // defpackage.byqc
    public final boolean a() {
        dkqn dkqnVar = this.h.getNotificationsParameters().l;
        if (dkqnVar == null) {
            dkqnVar = dkqn.i;
        }
        return dkqnVar.f;
    }

    @Override // defpackage.byqc
    public final boolean b(btlu btluVar) {
        if (!btluVar.l()) {
            return false;
        }
        long x = this.i.x(bvjk.ip, btluVar, 0L);
        if (x == 0) {
            return true;
        }
        dkqn dkqnVar = this.h.getNotificationsParameters().l;
        if (dkqnVar == null) {
            dkqnVar = dkqn.i;
        }
        return !new eapd(x).e(eaow.c((long) dkqnVar.g)).I(this.a.b());
    }

    public final void c(long j, btlu btluVar) {
        this.i.aa(bvjk.ip, btluVar, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2  */
    @Override // defpackage.byqc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.byqe r15, defpackage.btlu r16) {
        /*
            r14 = this;
            r8 = r14
            r0 = r16
            boolean r1 = r14.a()
            r9 = 1
            if (r1 != 0) goto L14
            int r0 = r15.g()
            byqb r1 = defpackage.byqb.NO_CLIENT_CAPABILITY
            r14.f(r0, r1, r9)
            return
        L14:
            boolean r1 = r14.b(r0)
            if (r1 == 0) goto Lc8
            java.lang.Object r10 = r8.c
            monitor-enter(r10)
            r11 = 0
            byoy r1 = r8.g     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 java.lang.SecurityException -> L98
            if (r1 == 0) goto L2d
            int r1 = r15.g()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 java.lang.SecurityException -> L98
            byqb r2 = defpackage.byqb.REMOTE_SEARCH_SERVICE_ALREADY_EXISTS     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 java.lang.SecurityException -> L98
            r14.f(r1, r2, r11)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 java.lang.SecurityException -> L98
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7e
            return
        L2d:
            btvo r1 = r8.h     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 java.lang.SecurityException -> L98
            dkre r1 = r1.getNotificationsParameters()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 java.lang.SecurityException -> L98
            dkqn r1 = r1.l     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 java.lang.SecurityException -> L98
            if (r1 != 0) goto L39
            dkqn r1 = defpackage.dkqn.i     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 java.lang.SecurityException -> L98
        L39:
            int r1 = r1.h     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 java.lang.SecurityException -> L98
            dehq r2 = r8.j     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 java.lang.SecurityException -> L98
            byox r3 = new byox     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L80 java.lang.SecurityException -> L98
            r12 = r15
            r3.<init>(r14, r15, r0)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            long r4 = (long) r1     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            dehu r5 = r2.d(r3, r4, r1)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            byoy r13 = new byoy     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            cqat r1 = r8.a     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            long r6 = r1.b()     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            r8.g = r13     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            android.content.Intent r1 = new android.content.Intent     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            java.lang.String r2 = "com.google.android.remotesearch.IRemoteSearchService"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            java.lang.String r2 = "com.google.android.googlequicksearchbox"
            r1.setPackage(r2)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            java.lang.String r2 = "com.google.android.remotesearch.RemoteSearchService.CLIENT_SESSION_TYPE"
            java.lang.String r3 = "GMM_COMMUTE_UPDATE_SESSION"
            r1.putExtra(r2, r3)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            android.content.Context r2 = r8.b     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            byoy r3 = r8.g     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            defpackage.dbsk.s(r3)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            r4 = 65
            boolean r0 = r2.bindService(r1, r3, r4)     // Catch: java.lang.Throwable -> L7e java.lang.Exception -> L81 java.lang.SecurityException -> L99
            r9 = 0
            goto Lb0
        L7e:
            r0 = move-exception
            goto Lc6
        L80:
            r12 = r15
        L81:
            r1 = 4
            r14.e(r1)     // Catch: java.lang.Throwable -> L7e
            int r1 = r15.g()     // Catch: java.lang.Throwable -> L7e
            byqb r2 = defpackage.byqb.OTHER_EXCEPTION_WHILE_BINDING     // Catch: java.lang.Throwable -> L7e
            r14.f(r1, r2, r11)     // Catch: java.lang.Throwable -> L7e
            cqat r1 = r8.a     // Catch: java.lang.Throwable -> L7e
            long r1 = r1.b()     // Catch: java.lang.Throwable -> L7e
            r14.c(r1, r0)     // Catch: java.lang.Throwable -> L7e
            goto Laf
        L98:
            r12 = r15
        L99:
            r1 = 6
            r14.e(r1)     // Catch: java.lang.Throwable -> L7e
            int r1 = r15.g()     // Catch: java.lang.Throwable -> L7e
            byqb r2 = defpackage.byqb.SECURITY_EXCEPTION_WHILE_BINDING     // Catch: java.lang.Throwable -> L7e
            r14.f(r1, r2, r11)     // Catch: java.lang.Throwable -> L7e
            cqat r1 = r8.a     // Catch: java.lang.Throwable -> L7e
            long r1 = r1.b()     // Catch: java.lang.Throwable -> L7e
            r14.c(r1, r0)     // Catch: java.lang.Throwable -> L7e
        Laf:
            r0 = 0
        Lb0:
            if (r0 != 0) goto Lc4
            if (r9 != 0) goto Lbd
            int r0 = r15.g()     // Catch: java.lang.Throwable -> L7e
            byqb r1 = defpackage.byqb.FAILURE_TO_BIND     // Catch: java.lang.Throwable -> L7e
            r14.f(r0, r1, r11)     // Catch: java.lang.Throwable -> L7e
        Lbd:
            byoy r0 = r8.g     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto Lc4
            r0.c()     // Catch: java.lang.Throwable -> L7e
        Lc4:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7e
            return
        Lc6:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L7e
            throw r0
        Lc8:
            r12 = r15
            int r0 = r15.g()
            byqb r1 = defpackage.byqb.NOT_ENABLED
            r14.f(r0, r1, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byoz.d(byqe, btlu):void");
    }

    public final void e(int i) {
        ((ckco) this.f.a().a(ckht.aL)).a(i - 1);
    }

    public final void f(int i, byqb byqbVar, boolean z) {
        if (z) {
            String str = byqbVar.F;
        }
        int i2 = i - 1;
        if (i != 0) {
            if (i2 == 0) {
                ((ckco) this.f.a().a(ckht.aN)).a(byqbVar.E);
                return;
            } else if (i2 != 1) {
                return;
            } else {
                ((ckco) this.f.a().a(ckht.aO)).a(byqbVar.E);
                return;
            }
        }
        throw null;
    }
}
