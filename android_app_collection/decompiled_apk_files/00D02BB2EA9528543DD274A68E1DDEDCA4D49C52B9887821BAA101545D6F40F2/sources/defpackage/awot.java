package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: awot  reason: default package */
/* loaded from: classes3.dex */
public final class awot implements awpk {
    public final btrm c;
    public final akox d;
    public final awpf e;
    public final awoi f;
    public final awpi g;
    public boolean i;
    public boolean j;
    public boolean k;
    public final awos m;
    private final jzv n;
    private final awoy o;
    private int p;
    @dzsi
    private astc q;
    @dzsi
    private astc r;
    private final awph s;
    private final awop t;
    private final awoq u;
    public final Handler a = new Handler(Looper.getMainLooper());
    public final awpd b = new awpd();
    public final Object h = new Object();
    public WeakReference<asmp> l = new WeakReference<>(null);

    public awot(bvnx bvnxVar, akox akoxVar, jzv jzvVar, btrm btrmVar, arbx arbxVar, aufc aufcVar, Executor executor, Context context) {
        awop awopVar = new awop(this);
        this.t = awopVar;
        awoq awoqVar = new awoq(this);
        this.u = awoqVar;
        this.s = new awor(this);
        this.m = new awos(this);
        dbsk.s(btrmVar);
        this.c = btrmVar;
        dbsk.s(akoxVar);
        this.d = akoxVar;
        dbsk.s(jzvVar);
        this.n = jzvVar;
        awpf awpfVar = new awpf(akoxVar, btrmVar, arbxVar);
        this.e = awpfVar;
        awoy awoyVar = new awoy(bvnxVar, akoxVar, awpfVar, context);
        this.o = awoyVar;
        awow awowVar = awoyVar.a;
        synchronized (awowVar.n) {
            awowVar.o = awopVar;
        }
        awow awowVar2 = awoyVar.a;
        synchronized (awowVar2.n) {
            awowVar2.p = awoqVar;
        }
        this.f = new awoi(akoxVar, btrmVar, awpfVar, context.getResources(), bvnxVar, aufcVar, executor);
        this.g = new awpi();
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c0 A[Catch: all -> 0x0171, TryCatch #0 {, blocks: (B:37:0x0078, B:39:0x007e, B:44:0x0088, B:48:0x0094, B:50:0x009e, B:53:0x00a5, B:64:0x00ba, B:72:0x00ca, B:74:0x00ce, B:75:0x00d3, B:77:0x00d7, B:78:0x00d9, B:65:0x00bd, B:66:0x00c0, B:70:0x00c6), top: B:136:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00ce A[Catch: all -> 0x0171, TryCatch #0 {, blocks: (B:37:0x0078, B:39:0x007e, B:44:0x0088, B:48:0x0094, B:50:0x009e, B:53:0x00a5, B:64:0x00ba, B:72:0x00ca, B:74:0x00ce, B:75:0x00d3, B:77:0x00d7, B:78:0x00d9, B:65:0x00bd, B:66:0x00c0, B:70:0x00c6), top: B:136:0x0078 }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7 A[Catch: all -> 0x0171, TryCatch #0 {, blocks: (B:37:0x0078, B:39:0x007e, B:44:0x0088, B:48:0x0094, B:50:0x009e, B:53:0x00a5, B:64:0x00ba, B:72:0x00ca, B:74:0x00ce, B:75:0x00d3, B:77:0x00d7, B:78:0x00d9, B:65:0x00bd, B:66:0x00c0, B:70:0x00c6), top: B:136:0x0078 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final boolean k(defpackage.astc r10, @defpackage.dzsi defpackage.astc r11) {
        /*
            Method dump skipped, instructions count: 373
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.awot.k(astc, astc):boolean");
    }

    @Override // defpackage.asmo
    public final void NZ(@dzsi Bundle bundle) {
        synchronized (this.h) {
            int i = this.p + 1;
            this.p = i;
            if (i == 1) {
                this.g.c(this.s);
                this.g.c(this.e);
                this.g.c(this.o);
                this.g.c(this.f);
                awpi awpiVar = this.g;
                synchronized (awpiVar.b) {
                    if (awpiVar.h == 1) {
                        awpiVar.h = 2;
                        for (awph awphVar : awpiVar.c) {
                            awphVar.k(awpiVar.h);
                        }
                        if (awpiVar.e) {
                            awpiVar.e();
                        }
                    }
                }
            }
        }
    }

    @Override // defpackage.atcv
    public final void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
        if (!k(atlqVar, atlqVar2)) {
            synchronized (this.h) {
                this.q = atlqVar;
                this.r = atlqVar2;
            }
        }
    }

    @Override // defpackage.asmo
    public final void Qo(Configuration configuration) {
    }

    @Override // defpackage.asmo
    public final void Qp() {
        synchronized (this.h) {
            int i = this.p - 1;
            this.p = i;
            if (i == 0) {
                awpi awpiVar = this.g;
                synchronized (awpiVar.b) {
                    awpiVar.d = false;
                    if (awpiVar.h != 1) {
                        awpiVar.h = 1;
                        awpiVar.f();
                    }
                    awpiVar.f = false;
                }
                this.g.d(this.f);
                this.g.d(this.o);
                this.g.d(this.e);
                this.g.d(this.s);
            }
        }
    }

    @Override // defpackage.asmo
    public final void Qr(Bundle bundle) {
    }

    @Override // defpackage.asxv
    public final void a(aszm aszmVar, @dzsi aszm aszmVar2) {
        if (!k(aszmVar, aszmVar2)) {
            synchronized (this.h) {
                this.q = aszmVar;
                this.r = null;
            }
        }
    }

    @Override // defpackage.asmo
    public final void b() {
        synchronized (this.h) {
            awpi awpiVar = this.g;
            asmp asmpVar = this.l.get();
            synchronized (awpiVar.b) {
                if (awpiVar.d) {
                    char c = 3;
                    if (asmpVar instanceof asxw) {
                        awpiVar.i = 2;
                        c = 2;
                    } else if (asmpVar instanceof atcw) {
                        awpiVar.i = 3;
                    } else {
                        awpiVar.i = 1;
                        c = 1;
                    }
                    if (c == 1 || c == 2) {
                        awpiVar.f = false;
                        if (awpiVar.h != 2) {
                            awpiVar.h = 2;
                            awpiVar.f();
                        }
                    }
                }
            }
            synchronized (this.h) {
                astc astcVar = this.q;
                if (astcVar != null) {
                    k(astcVar, this.r);
                    this.q = null;
                    this.r = null;
                }
            }
        }
    }

    @Override // defpackage.awpk
    public final void h(@dzsi asmp asmpVar) {
        synchronized (this.h) {
            this.l = new WeakReference<>(asmpVar);
        }
    }

    public final void i() {
        this.g.e();
    }

    public final void j() {
        awpi awpiVar = this.g;
        synchronized (awpiVar.b) {
            awpiVar.e = false;
            if (awpiVar.d) {
                awpiVar.d = false;
            }
        }
    }

    @Override // defpackage.asmo
    public final void c() {
        awpi awpiVar = this.g;
        synchronized (awpiVar.b) {
            if (awpiVar.d) {
                awpiVar.i = 1;
                if (awpiVar.h != 2) {
                    awpiVar.h = 2;
                    awpiVar.f();
                }
            }
        }
        synchronized (this.h) {
            this.q = null;
            this.r = null;
        }
    }
}
