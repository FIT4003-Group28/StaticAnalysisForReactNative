package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cpwx  reason: default package */
/* loaded from: classes5.dex */
public final class cpwx implements cpxe {
    public static final Uri a = new Uri.Builder().scheme("content").authority("com.google.android.googlequicksearchbox.GsaPublicContentProvider").appendPath("morris_provider").appendPath("com.google.android.googlequicksearchbox.MorrisProvider").build();
    static final cpzl[] b = {cpzl.SUPPORT_ON_VOICE_PLATE_STATE_CHANGED, cpzl.SUPPORT_UNBIND_INTEGRATION_SERVICE};
    public final Context c;
    public final cpxf d;
    public final List<String> e;
    public final List<cpzp> f;
    public final dehp g;
    public int h;
    public int i;
    public dbsg<dehu> j;
    public cpzs k;
    public cpxg l;
    public clau m;
    private final cpww n;
    private final List<cpzb> o;

    public cpwx(Context context) {
        cnnm a2 = cnnm.a(context);
        this.e = dchl.a();
        this.f = dchl.a();
        this.h = 0;
        this.j = dbpy.a;
        this.c = context;
        this.n = new cpww(this, Looper.getMainLooper());
        this.o = new ArrayList();
        dehp c = dehx.c(Executors.newSingleThreadExecutor());
        this.g = c;
        cpxf cpxfVar = new cpxf(context);
        this.d = cpxfVar;
        cpxfVar.b = this;
        this.m = new cpxa(context, cpxfVar, this, a2);
        deha.q(deew.h(cpwp.a(context), cpwq.a, dege.a), new cpwu(this, context), c);
    }

    public static void f(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            return;
        }
        throw new RuntimeException(str.concat(" should be called in main thread"));
    }

    public final int a() {
        return this.m.a();
    }

    public final void b() {
        f("maybeCancelUnBindServiceTask");
        if (this.j.a()) {
            this.j.b().cancel(true);
            this.j = dbpy.a;
        }
    }

    public final void c() {
        if (!this.m.c() || this.n.hasMessages(100)) {
            return;
        }
        this.n.sendEmptyMessage(100);
    }

    public final void d(cpzg cpzgVar) {
        if (this.m.c()) {
            try {
                cpzj bZ = cpzy.g.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                cpzy cpzyVar = (cpzy) bZ.b;
                cpzi cpziVar = (cpzi) cpzgVar.bK();
                cpziVar.getClass();
                cpzyVar.e = cpziVar;
                cpzyVar.a |= 32;
                i(bZ);
                return;
            } catch (RemoteException unused) {
                return;
            }
        }
        throw new IllegalStateException("Check connected state before use.");
    }

    public final cpzs e() {
        if (this.k == null) {
            this.k = cpzx.h.bZ();
        }
        return this.k;
    }

    public final dehn<cpxx> g() {
        return this.g.c(new Callable(this) { // from class: cpwr
            private final cpwx a;

            {
                this.a = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x002b, code lost:
                if (r2 != null) goto L8;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
                if (r2 == null) goto L9;
             */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    r10 = this;
                    cpwx r0 = r10.a
                    java.lang.String r1 = "com.google.android.apps.gsa.staticplugins.opa.morris.shared.provider_args_morris_eligibility_status"
                    r2 = 0
                    r3 = 0
                    android.content.Context r0 = r0.c     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L29
                    android.content.ContentResolver r4 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L29
                    android.net.Uri r5 = defpackage.cpwx.a     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L29
                    r0 = 1
                    java.lang.String[] r8 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L29
                    r8[r3] = r1     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L29
                    r6 = 0
                    r7 = 0
                    r9 = 0
                    android.database.Cursor r2 = r4.query(r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L29
                    if (r2 == 0) goto L2b
                    boolean r0 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L29
                    if (r0 == 0) goto L2b
                    int r3 = r2.getInt(r3)     // Catch: java.lang.Throwable -> L27 java.lang.RuntimeException -> L29
                    goto L33
                L27:
                    r0 = move-exception
                    goto L3f
                L29:
                    r0 = move-exception
                    goto L2e
                L2b:
                    if (r2 == 0) goto L36
                    goto L33
                L2e:
                    r0.getMessage()     // Catch: java.lang.Throwable -> L27
                    if (r2 == 0) goto L36
                L33:
                    r2.close()
                L36:
                    cpxx r0 = defpackage.cpxx.b(r3)
                    if (r0 != 0) goto L3e
                    cpxx r0 = defpackage.cpxx.UNKNOWN
                L3e:
                    return r0
                L3f:
                    if (r2 == 0) goto L44
                    r2.close()
                L44:
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cpwr.call():java.lang.Object");
            }
        });
    }

    public final void h() {
        if (!this.m.c() || this.k == null) {
            return;
        }
        cpzj bZ = cpzy.g.bZ();
        cpzs cpzsVar = this.k;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cpzy cpzyVar = (cpzy) bZ.b;
        cpzx bK = cpzsVar.bK();
        bK.getClass();
        cpzyVar.c = bK;
        cpzyVar.a |= 4;
        try {
            i(bZ);
            this.k = null;
        } catch (RemoteException unused) {
        }
    }

    public final void i(cpzj cpzjVar) {
        List<cpzb> list = this.o;
        if (cpzjVar.c) {
            cpzjVar.bF();
            cpzjVar.c = false;
        }
        cpzy cpzyVar = (cpzy) cpzjVar.b;
        cpzy cpzyVar2 = cpzy.g;
        dsrj<cpzb> dsrjVar = cpzyVar.d;
        if (!dsrjVar.a()) {
            cpzyVar.d = dsqw.cl(dsrjVar);
        }
        dsod.bv(list, cpzyVar.d);
        this.m.d(cpzjVar.bK());
        this.o.clear();
    }

    public final void j(dehq dehqVar) {
        f("unbindServiceWithDelay");
        if (this.j.a()) {
            return;
        }
        this.j = dbsg.i(dehqVar.d(new Runnable(this) { // from class: cpws
            private final cpwx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cpwx cpwxVar = this.a;
                cpwxVar.j = dbpy.a;
                cpwx.f("unbindService");
                if (cpwxVar.m.a() != 0) {
                    if (cpwxVar.m.a() == 3) {
                        cpzg cpzgVar = (cpzg) cpzi.c.bZ();
                        if (cpzgVar.c) {
                            cpzgVar.bF();
                            cpzgVar.c = false;
                        }
                        cpzi cpziVar = (cpzi) cpzgVar.b;
                        cpziVar.b = 100;
                        cpziVar.a |= 1;
                        cpwxVar.d(cpzgVar);
                    }
                    cpwxVar.m.b();
                }
                cpwxVar.d.g = null;
            }
        }, 1000L, TimeUnit.MILLISECONDS));
    }

    @Override // defpackage.cpxe
    public final void k(int i) {
        if (!this.m.c()) {
            return;
        }
        cpzg cpzgVar = (cpzg) cpzi.c.bZ();
        if (cpzgVar.c) {
            cpzgVar.bF();
            cpzgVar.c = false;
        }
        cpzi cpziVar = (cpzi) cpzgVar.b;
        cpziVar.b = 5;
        cpziVar.a |= 1;
        dsqv<cpzi, cqae> dsqvVar = cqac.a;
        cqad bZ = cqae.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cqae cqaeVar = (cqae) bZ.b;
        cqaeVar.b = i - 1;
        cqaeVar.a |= 1;
        cpzgVar.k(dsqvVar, bZ.bK());
        d(cpzgVar);
    }

    public final void l(int i) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        List<cpzb> list = this.o;
        cpza bZ = cpzb.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        cpzb cpzbVar = (cpzb) bZ.b;
        cpzbVar.b = i - 1;
        int i2 = cpzbVar.a | 1;
        cpzbVar.a = i2;
        cpzbVar.a = i2 | 2;
        cpzbVar.c = elapsedRealtimeNanos;
        list.add(bZ.bK());
    }
}
