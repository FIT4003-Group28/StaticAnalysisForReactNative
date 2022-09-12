package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.concurrent.Future;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: byoy  reason: default package */
/* loaded from: classes4.dex */
public final class byoy extends dans implements ServiceConnection {
    final /* synthetic */ byoz a;
    private final byqe b;
    private final Future<?> c;
    private final btlu d;
    private final long e;
    @dzsi
    private danq f = null;
    @dzsi
    private danr g;

    public byoy(byoz byozVar, byqe byqeVar, btlu btluVar, Future<?> future, long j) {
        this.a = byozVar;
        this.b = byqeVar;
        this.d = btluVar;
        this.c = future;
        this.e = j;
    }

    @Override // defpackage.dant
    public final void b(byte[] bArr) {
        byoz byozVar;
        long b;
        btlu btluVar;
        claf clafVar;
        int a;
        try {
            try {
                try {
                    try {
                        try {
                            dsqa a2 = dsqa.a();
                            a2.e(ckyx.a);
                            clafVar = (claf) dsqw.cr(claf.c, bArr, a2);
                            a = clad.a(clafVar.b);
                        } catch (Exception unused) {
                            this.a.f(this.b.g(), byqb.OTHER_EXCEPTION_WHILE_SENDING_NOTIFICATION, false);
                            this.a.e(4);
                            byozVar = this.a;
                            b = byozVar.a.b();
                            btluVar = this.d;
                        }
                    } catch (SecurityException unused2) {
                        this.a.f(this.b.g(), byqb.SECURITY_EXCEPTION_WHILE_SENDING_NOTIFICATION, false);
                        this.a.e(6);
                        byozVar = this.a;
                        b = byozVar.a.b();
                        btluVar = this.d;
                    }
                } catch (Throwable th) {
                    byoz byozVar2 = this.a;
                    byozVar2.c(byozVar2.a.b(), this.d);
                    c();
                    throw th;
                }
            } catch (dsrm unused3) {
                this.a.f(this.b.g(), byqb.INVALID_PROTOCOL_BUFFER_EXCEPTION_WHILE_PROCESSING_GSA_RESPONSE, false);
            }
        } catch (RemoteException unused4) {
            this.a.f(this.b.g(), byqb.REMOTE_EXCEPTION_WHILE_SENDING_NOTIFICATION, false);
            this.a.e(5);
            byozVar = this.a;
            b = byozVar.a.b();
            btluVar = this.d;
        }
        if (a != 0 && a == 206) {
            dsqv<claf, ckyz> dsqvVar = ckyx.a;
            clafVar.f(dsqvVar);
            Object l = clafVar.V.l(dsqvVar.d);
            if ((((ckyz) (l == null ? dsqvVar.b : dsqvVar.b(l))).a & 1) != 0) {
                dsqv<claf, ckyz> dsqvVar2 = ckyx.a;
                clafVar.f(dsqvVar2);
                Object l2 = clafVar.V.l(dsqvVar2.d);
                if (((ckyz) (l2 == null ? dsqvVar2.b : dsqvVar2.b(l2))).b) {
                    if (this.g == null) {
                        this.a.f(this.b.g(), byqb.NULL_REMOTE_SEARCH_SERVICE_SESSION_WHILE_PROCESSING_GSA_RESPONSE, false);
                        byozVar = this.a;
                        b = byozVar.a.b();
                        btluVar = this.d;
                        byozVar.c(b, btluVar);
                        c();
                    }
                    byqe byqeVar = this.b;
                    clao bZ = claq.i.bZ();
                    int i = 3;
                    if (byqeVar != null) {
                        String a3 = byqeVar.a();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        claq claqVar = (claq) bZ.b;
                        a3.getClass();
                        claqVar.a |= 1;
                        claqVar.b = a3;
                        int f = (int) byqeVar.b().f();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        claq claqVar2 = (claq) bZ.b;
                        claqVar2.a |= 2;
                        claqVar2.c = f;
                        String e = byqeVar.e();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        claq claqVar3 = (claq) bZ.b;
                        e.getClass();
                        claqVar3.a |= 16;
                        claqVar3.f = e;
                        long f2 = byqeVar.f();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        claq claqVar4 = (claq) bZ.b;
                        claqVar4.a |= 64;
                        claqVar4.g = f2;
                        int g = byqeVar.g();
                        int i2 = g - 1;
                        if (g == 0) {
                            throw null;
                        }
                        int i3 = i2 != 0 ? i2 != 1 ? 1 : 3 : 2;
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        claq claqVar5 = (claq) bZ.b;
                        claqVar5.h = i3 - 1;
                        claqVar5.a |= 128;
                        if (byqeVar.c() != null) {
                            String c = byqeVar.c();
                            dbsk.s(c);
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            claq claqVar6 = (claq) bZ.b;
                            c.getClass();
                            claqVar6.a |= 4;
                            claqVar6.d = c;
                        }
                        if (byqeVar.d() != null) {
                            String d = byqeVar.d();
                            dbsk.s(d);
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            claq claqVar7 = (claq) bZ.b;
                            d.getClass();
                            claqVar7.a |= 8;
                            claqVar7.e = d;
                        }
                    }
                    claq bK = bZ.bK();
                    ckyp ckypVar = (ckyp) ckyq.c.bZ();
                    if (ckypVar.c) {
                        ckypVar.bF();
                        ckypVar.c = false;
                    }
                    ckyq ckyqVar = (ckyq) ckypVar.b;
                    ckyqVar.b = cpnx.a;
                    ckyqVar.a |= 1;
                    dsqv<ckyq, ckzc> dsqvVar3 = ckza.a;
                    ckzb bZ2 = ckzc.c.bZ();
                    dspd bR = bK.bR();
                    if (bZ2.c) {
                        bZ2.bF();
                        bZ2.c = false;
                    }
                    ckzc ckzcVar = (ckzc) bZ2.b;
                    bR.getClass();
                    ckzcVar.a = 1 | ckzcVar.a;
                    ckzcVar.b = bR;
                    ckypVar.k(dsqvVar3, bZ2.bK());
                    ckyq ckyqVar2 = (ckyq) ckypVar.bK();
                    boolean equals = this.b.equals(byqe.i());
                    danr danrVar = this.g;
                    if (danrVar != null) {
                        byoz byozVar3 = this.a;
                        if (!equals) {
                            i = 2;
                        }
                        byozVar3.e(i);
                        this.a.f(this.b.g(), equals ? byqb.TOMBSTONE_SUCCESSFUL : byqb.SEND_SUCCESSFUL, false);
                        danrVar.e(ckyqVar2.bS());
                        ((ckcp) this.a.f.a().a(ckht.aM)).a(this.a.a.b() - this.e);
                    } else {
                        this.a.f(this.b.g(), byqb.NULL_REMOTE_SEARCH_SERVICE_SESSION_WHILE_SENDING_NOTIFICATION, false);
                    }
                    c();
                    return;
                }
                this.a.f(this.b.g(), byqb.GSA_RESPONSE_NOT_SMARTSPACE_ENABLED, true);
            } else {
                this.a.f(this.b.g(), byqb.GSA_RESPONSE_MISSING, true);
            }
            this.a.e(1);
            byozVar = this.a;
            b = byozVar.a.b();
            btluVar = this.d;
            byozVar.c(b, btluVar);
            c();
        }
        this.a.f(this.b.g(), byqb.GSA_RESPONSE_INVALID_EVENT_ID, false);
        this.a.e(1);
        byozVar = this.a;
        b = byozVar.a.b();
        btluVar = this.d;
        byozVar.c(b, btluVar);
        c();
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [danq, danr] */
    public final void c() {
        byoz byozVar;
        synchronized (this.a.c) {
            try {
                byoy byoyVar = this.a.g;
                if (byoyVar != null) {
                    try {
                        danq danqVar = this.f;
                        if (danqVar != null) {
                            danqVar.e();
                        }
                    } catch (RemoteException unused) {
                        this.a.f(this.b.g(), byqb.REMOTE_EXCEPTION_WHILE_ENDING_RSS_SESSION, false);
                        this.a.e(5);
                    } catch (SecurityException unused2) {
                        this.a.f(this.b.g(), byqb.SECURITY_EXCEPTION_WHILE_ENDING_RSS_SESSION, false);
                        this.a.e(6);
                    } catch (Exception unused3) {
                        this.a.f(this.b.g(), byqb.OTHER_EXCEPTION_WHILE_ENDING_RSS_SESSION, false);
                        this.a.e(4);
                    } finally {
                        this.f = null;
                        this.g = null;
                    }
                    this.a.b.unbindService(byoyVar);
                }
                if (!this.c.isCancelled() && !this.c.isDone()) {
                    this.c.cancel(true);
                }
                byozVar = this.a;
            } catch (Exception unused4) {
                this.a.e(4);
                byozVar = this.a;
            }
            byozVar.g = null;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        try {
            String t = this.d.t();
            if (t == null) {
                this.a.f(this.b.g(), byqb.NO_ACCOUNT_NAME, false);
                c();
                return;
            }
            danq a = this.a.e.a(iBinder);
            this.f = a;
            danr f = a.f(this);
            this.g = f;
            ckyp ckypVar = (ckyp) ckyq.c.bZ();
            if (ckypVar.c) {
                ckypVar.bF();
                ckypVar.c = false;
            }
            ckyq ckyqVar = (ckyq) ckypVar.b;
            ckyqVar.b = 301;
            ckyqVar.a |= 1;
            dsqv<ckyq, ckyw> dsqvVar = ckyu.a;
            ckyv bZ = ckyw.c.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ckyw ckywVar = (ckyw) bZ.b;
            t.getClass();
            ckywVar.a |= 1;
            ckywVar.b = t;
            ckypVar.k(dsqvVar, bZ.bK());
            f.e(((ckyq) ckypVar.bK()).bS());
        } catch (RemoteException unused) {
            this.a.f(this.b.g(), byqb.REMOTE_EXCEPTION_WHILE_QUERYING_GSA, false);
            this.a.e(5);
            byoz byozVar = this.a;
            byozVar.c(byozVar.a.b(), this.d);
            c();
        } catch (SecurityException unused2) {
            this.a.f(this.b.g(), byqb.SECURITY_EXCEPTION_WHILE_QUERYING_GSA, false);
            this.a.e(6);
            byoz byozVar2 = this.a;
            byozVar2.c(byozVar2.a.b(), this.d);
            c();
        } catch (Exception unused3) {
            this.a.f(this.b.g(), byqb.OTHER_EXCEPTION_WHILE_QUERYING_GSA, false);
            this.a.e(4);
            byoz byozVar3 = this.a;
            byozVar3.c(byozVar3.a.b(), this.d);
            c();
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        synchronized (this.a.d) {
            c();
        }
    }
}
