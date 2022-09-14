package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import com.google.lens.sdk.PendingIntentConsumer;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* compiled from: PG */
/* renamed from: cseq  reason: default package */
/* loaded from: classes5.dex */
public final class cseq extends ckyk implements ServiceConnection, csei {
    public final Executor a;
    public final Context b;
    public final cseh c;
    public int d;
    public int e;
    public ckzp f;
    public ckzn g;
    public long h;
    public int i;
    public int j;
    public ckyg k;
    public ckyj l;
    private final Executor m;
    private final csea n;

    public cseq(Context context, cseh csehVar, csea cseaVar) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(csej.a);
        this.a = new csep(new Handler(Looper.getMainLooper()));
        this.d = 1;
        this.i = 1;
        this.j = 1;
        this.b = context;
        this.c = csehVar;
        this.n = cseaVar;
        this.m = newSingleThreadExecutor;
    }

    private static boolean n(int i) {
        return i == 5;
    }

    private static boolean o(int i) {
        return i == 6 || i == 7 || i == 8;
    }

    @Override // defpackage.csei
    public final void a() {
        cser.b();
        cser.a(e(), "Attempted to handover when not ready.");
        ckyp ckypVar = (ckyp) ckyq.c.bZ();
        if (ckypVar.c) {
            ckypVar.bF();
            ckypVar.c = false;
        }
        ckyq ckyqVar = (ckyq) ckypVar.b;
        ckyqVar.b = 99;
        ckyqVar.a |= 1;
        dsqv<ckyq, clab> dsqvVar = ckzz.a;
        claa bZ = clab.c.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        clab clabVar = (clab) bZ.b;
        clabVar.a |= 1;
        clabVar.b = true;
        ckypVar.k(dsqvVar, bZ.bK());
        ckyq ckyqVar2 = (ckyq) ckypVar.bK();
        try {
            ckyj ckyjVar = this.l;
            cser.c(ckyjVar);
            ckyjVar.e(ckyqVar2.bS());
        } catch (RemoteException | SecurityException unused) {
        }
        this.j = 12;
        l(8);
    }

    @Override // defpackage.ckyl
    public final void b(final byte[] bArr, final SystemParcelableWrapper systemParcelableWrapper) {
        this.a.execute(new Runnable(this, bArr, systemParcelableWrapper) { // from class: csem
            private final cseq a;
            private final byte[] b;
            private final SystemParcelableWrapper c;

            {
                this.a = this;
                this.b = bArr;
                this.c = systemParcelableWrapper;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Object b;
                cseq cseqVar = this.a;
                byte[] bArr2 = this.b;
                SystemParcelableWrapper systemParcelableWrapper2 = this.c;
                int i = cseqVar.d;
                if (i == 4 || i == 5) {
                    try {
                        claf clafVar = (claf) dsqw.cr(claf.c, bArr2, dsqa.c());
                        int a = clad.a(clafVar.b);
                        if (a != 0 && a == 240) {
                            dsqv<claf, ckzq> dsqvVar = ckzg.a;
                            clafVar.f(dsqvVar);
                            Object l = clafVar.V.l(dsqvVar.d);
                            if (l == null) {
                                b = dsqvVar.b;
                            } else {
                                b = dsqvVar.b(l);
                            }
                            ckzq ckzqVar = (ckzq) b;
                            cseqVar.e = ckzqVar.a;
                            ckzp ckzpVar = ckzqVar.b;
                            if (ckzpVar == null) {
                                ckzpVar = ckzp.f;
                            }
                            cseqVar.f = ckzpVar;
                            ckzn ckznVar = ckzqVar.c;
                            if (ckznVar == null) {
                                ckznVar = ckzn.b;
                            }
                            cseqVar.g = ckznVar;
                            int a2 = csfk.a(ckzqVar.d);
                            if (a2 == 0) {
                                a2 = 1;
                            }
                            cseqVar.i = a2;
                            cseqVar.j = 2;
                            cseqVar.l(5);
                            return;
                        }
                        int a3 = clad.a(clafVar.b);
                        if (a3 != 0 && a3 == 310) {
                            long j = ((Bundle) systemParcelableWrapper2.a).getLong("session_id");
                            cseqVar.h = j;
                            StringBuilder sb = new StringBuilder(40);
                            sb.append("Received session id ");
                            sb.append(j);
                            sb.toString();
                            return;
                        }
                        cseh csehVar = cseqVar.c;
                        int a4 = clad.a(clafVar.b);
                        if (a4 == 0 || a4 != 268) {
                            return;
                        }
                        Parcelable parcelable = systemParcelableWrapper2.a;
                        if (!(parcelable instanceof PendingIntent)) {
                            return;
                        }
                        PendingIntent pendingIntent = (PendingIntent) parcelable;
                        ((cseg) csehVar).a.a();
                        PendingIntentConsumer pendingIntentConsumer = ((cseg) csehVar).b;
                        if (pendingIntentConsumer == null) {
                            return;
                        }
                        pendingIntentConsumer.onReceivedPendingIntent(pendingIntent);
                    } catch (dsrm unused) {
                        cseqVar.j = 11;
                        cseqVar.l(8);
                    }
                }
            }
        });
    }

    @Override // defpackage.csei
    public final void c(byte[] bArr, SystemParcelableWrapper systemParcelableWrapper) {
        cser.b();
        cser.a(e(), "Attempted to use lensServiceSession before ready.");
        ckyj ckyjVar = this.l;
        cser.c(ckyjVar);
        ckyjVar.f(bArr, systemParcelableWrapper);
    }

    @Override // defpackage.csei
    public final int d() {
        cser.b();
        cser.a(i(), "Attempted to use lensServiceSession before ready.");
        return this.e;
    }

    @Override // defpackage.csei
    public final boolean e() {
        cser.b();
        return n(this.d);
    }

    @Override // defpackage.csei
    public final boolean f() {
        cser.b();
        return o(this.d);
    }

    @Override // defpackage.csei
    public final int g() {
        cser.b();
        boolean z = true;
        if (!e() && !f()) {
            z = false;
        }
        cser.a(z, "Attempted to use ServerFlags before ready or dead.");
        return this.j;
    }

    public final void h() {
        cser.b();
        if (this.l == null) {
            this.j = 11;
            l(7);
            return;
        }
        this.j = 11;
        l(8);
    }

    public final boolean i() {
        int i = this.d;
        return i == 5 || i == 8;
    }

    public final boolean j() {
        int i = this.d;
        return i == 3 || i == 4 || i == 5 || i == 7 || i == 8;
    }

    public final boolean k() {
        return this.d == 2;
    }

    public final void l(int i) {
        cser.b();
        int i2 = this.d;
        this.d = i;
        if (n(i) && !n(i2)) {
            cseh csehVar = this.c;
            cser.b();
            ((cseg) csehVar).c();
        }
        if (!o(i) || o(i2)) {
            return;
        }
        cseh csehVar2 = this.c;
        cser.b();
        ((cseg) csehVar2).c();
    }

    public final void m() {
        cser.b();
        if (k() || j()) {
            return;
        }
        l(2);
        this.n.a(new csdx(this) { // from class: csek
            private final cseq a;

            {
                this.a = this;
            }

            @Override // defpackage.csdx
            public final void a(csfl csflVar) {
                cseq cseqVar = this.a;
                int a = csfk.a(csflVar.d);
                if (a == 0 || a != 2) {
                    int a2 = csfk.a(csflVar.d);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    cseqVar.j = a2;
                    cseqVar.l(6);
                    return;
                }
                Intent intent = new Intent("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
                intent.setPackage("com.google.android.googlequicksearchbox");
                try {
                    if (!cseqVar.b.bindService(intent, cseqVar, 65)) {
                        cseqVar.j = 11;
                        cseqVar.l(7);
                        return;
                    }
                    cseqVar.l(3);
                } catch (SecurityException unused) {
                    cseqVar.j = 11;
                    cseqVar.l(7);
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        final ckyg ckygVar;
        cser.b();
        if (iBinder == null) {
            ckygVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.gsa.publicsearch.IPublicSearchService");
            if (queryLocalInterface instanceof ckyg) {
                ckygVar = (ckyg) queryLocalInterface;
            } else {
                ckygVar = new ckyg(iBinder);
            }
        }
        this.k = ckygVar;
        this.m.execute(new Runnable(this, ckygVar) { // from class: csel
            private final cseq a;
            private final ckyg b;

            {
                this.a = this;
                this.b = ckygVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final cseq cseqVar = this.a;
                try {
                    final ckyj e = this.b.e("LENS_SERVICE_SESSION", cseqVar, null);
                    cseqVar.a.execute(new Runnable(cseqVar, e) { // from class: csen
                        private final cseq a;
                        private final ckyj b;

                        {
                            this.a = cseqVar;
                            this.b = e;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            cseq cseqVar2 = this.a;
                            ckyj ckyjVar = this.b;
                            cser.b();
                            if (cseqVar2.k == null) {
                                cseqVar2.h();
                                return;
                            }
                            try {
                                cseqVar2.l = ckyjVar;
                                if (cseqVar2.l == null) {
                                    cseqVar2.j = 11;
                                    cseqVar2.l(7);
                                    return;
                                }
                                cseqVar2.l(4);
                                ckyp ckypVar = (ckyp) ckyq.c.bZ();
                                if (ckypVar.c) {
                                    ckypVar.bF();
                                    ckypVar.c = false;
                                }
                                ckyq ckyqVar = (ckyq) ckypVar.b;
                                ckyqVar.b = 98;
                                ckyqVar.a |= 1;
                                ckyq ckyqVar2 = (ckyq) ckypVar.bK();
                                ckyp ckypVar2 = (ckyp) ckyq.c.bZ();
                                if (ckypVar2.c) {
                                    ckypVar2.bF();
                                    ckypVar2.c = false;
                                }
                                ckyq ckyqVar3 = (ckyq) ckypVar2.b;
                                ckyqVar3.b = 348;
                                ckyqVar3.a |= 1;
                                dsqv<ckyq, ckzf> dsqvVar = ckzd.a;
                                ckze bZ = ckzf.c.bZ();
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                ckzf ckzfVar = (ckzf) bZ.b;
                                ckzfVar.a |= 1;
                                ckzfVar.b = 2;
                                ckypVar2.k(dsqvVar, bZ.bK());
                                ckyj ckyjVar2 = cseqVar2.l;
                                cser.c(ckyjVar2);
                                ckyjVar2.e(ckyqVar2.bS());
                                ckyj ckyjVar3 = cseqVar2.l;
                                cser.c(ckyjVar3);
                                ckyjVar3.e(((ckyq) ckypVar2.bK()).bS());
                            } catch (RemoteException unused) {
                                cseqVar2.h();
                            }
                        }
                    });
                } catch (RemoteException unused) {
                    cseqVar.a.execute(new Runnable(cseqVar) { // from class: cseo
                        private final cseq a;

                        {
                            this.a = cseqVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.h();
                        }
                    });
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        cser.b();
        this.j = 11;
        l(7);
    }
}
