package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.ar.core.ImageMetadata;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: avbe  reason: default package */
/* loaded from: classes2.dex */
public final class avbe implements avby {
    public final avol a;
    public final dxio<avbg> b;
    private final avop c;
    private final btvo d;
    private final avba e;
    private final avbz f;
    private final Executor g;
    private final Executor h;
    private final dehq i;
    private final avtr j;
    private final avki k;
    private final avjl l;
    private final avhd m;
    private final avll o;
    private final awhs p;
    private final cjqy q;
    private final avtv r;
    private final avbd n = new avbd();
    private int u = 1;
    @dzsi
    private avca s = null;
    private final Runnable t = new avbb(this);

    public avbe(btvo btvoVar, avba avbaVar, avop avopVar, avbz avbzVar, avtr avtrVar, avll avllVar, awhs awhsVar, Executor executor, Executor executor2, dehq dehqVar, avki avkiVar, avjl avjlVar, dxio<avbg> dxioVar, cjqy cjqyVar, avtv avtvVar, avhd avhdVar, avol avolVar) {
        this.d = btvoVar;
        this.e = avbaVar;
        this.c = avopVar;
        this.f = avbzVar;
        this.j = avtrVar;
        this.g = executor;
        this.h = executor2;
        this.i = dehqVar;
        this.k = avkiVar;
        this.l = avjlVar;
        this.b = dxioVar;
        this.a = avolVar;
        this.m = avhdVar;
        this.o = avllVar;
        this.p = awhsVar;
        this.q = cjqyVar;
        this.r = avtvVar;
    }

    private final Executor f() {
        return this.d.getOfflineMapsParameters().B > 1 ? this.h : this.g;
    }

    private final synchronized avca g() {
        if (this.s == null) {
            this.s = this.f.a(this, this.a.j());
        }
        return this.s;
    }

    @Override // defpackage.avby
    public final void b(String str, dlqg dlqgVar) {
        dlrq b;
        this.b.a().a();
        avol avolVar = this.a;
        try {
            b = (dlrq) dsqw.cq(dlrq.q, avolVar.c.m(avolVar.b, str, dlqgVar.bS()));
        } catch (Exception e) {
            avolVar.a("setDownloadResult", e);
            b = avol.b();
        }
        a(b);
    }

    @Override // defpackage.avby
    public final void c(String str, double d) {
        avol avolVar = this.a;
        try {
            avolVar.c.C(avolVar.b, str, d);
        } catch (Exception e) {
            avolVar.a("setDownloadProgress", e);
        }
    }

    @Override // defpackage.avby
    public final void d() {
        this.a.d();
    }

    public final synchronized void e() {
    }

    public final void a(dlrq dlrqVar) {
        int i;
        int a;
        int a2;
        int a3;
        dlpx dlpxVar;
        int i2 = dlrqVar.b;
        int i3 = 1;
        if ((dlrqVar.a & 16) != 0) {
            i = dlpv.a(dlrqVar.i);
            if (i == 0) {
                i = 1;
            }
        } else {
            i = 0;
        }
        synchronized (this) {
            if (i != 0) {
                this.u = i;
            } else {
                i = this.u;
            }
            this.b.a().b(i2);
        }
        int i4 = 0;
        while (this.b.a().c(this.d.getOfflineMapsParameters().c)) {
            int i5 = i4 + 1;
            avol avolVar = this.a;
            try {
                dlpxVar = (dlpx) dsqw.cq(dlpx.b, avolVar.c.k(avolVar.b));
            } catch (Exception e) {
                avolVar.a("getNextDownload", e);
                dlpxVar = dlpx.b;
            }
            if (dlpxVar.a.isEmpty()) {
                this.b.a().a();
            } else {
                String str = dlpxVar.a;
                g().b(dlpxVar.a, i);
            }
            i4 = i5;
        }
        if (i4 > 0) {
            this.b.a().j();
        }
        for (dlpx dlpxVar2 : dlrqVar.j) {
            String str2 = dlpxVar2.a;
            g().a(dlpxVar2.a);
        }
        if (dlrqVar.c > 0) {
            this.b.a().d(dlrqVar.c);
            for (int i6 = 0; i6 < dlrqVar.c; i6++) {
                f().execute(this.t);
            }
        }
        for (dluy dluyVar : new dsrh(dlrqVar.d, dlrq.e)) {
            this.l.H(dluyVar);
        }
        int i7 = 4;
        if ((dlrqVar.a & 4) != 0) {
            long j = dlrqVar.g;
            long j2 = dlrqVar.f;
            this.b.a().g(dlrqVar.f);
            bvqd.a(this.i.d(new avbc(this, j), Math.max(dlrqVar.f, 0L), TimeUnit.MILLISECONDS), f());
        }
        for (dlqq dlqqVar : dlrqVar.k) {
            int a4 = dlqp.a(dlqqVar.a);
            if (a4 == 0) {
                a4 = 1;
            }
            int i8 = a4 - 1;
            if (i8 == 1) {
                ddpg ddpgVar = dlqqVar.b;
                if (ddpgVar == null) {
                    ddpgVar = ddpg.j;
                }
                avtr avtrVar = this.j;
                cjug cjugVar = new cjug();
                cjugVar.a = new cjte(deaf.AUTOMATED);
                cjugVar.j = avtrVar.a;
                cjugVar.g = dtxx.aQ;
                ddeu bZ = ddev.u.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                ddev ddevVar = (ddev) bZ.b;
                ddpgVar.getClass();
                ddevVar.d = ddpgVar;
                ddevVar.a |= 4;
                cjugVar.b(bZ.bK());
                cjugVar.l = cjsc.a(avtrVar.c.a);
                cjugVar.k = avtrVar.b.G();
                try {
                    cjugVar.m = avtrVar.c.a();
                } catch (RuntimeException unused) {
                }
                avtrVar.b.u(cjugVar.a());
                avop avopVar = this.c;
                if ((ddpgVar.a & ImageMetadata.SHADING_MODE) != 0) {
                    int a5 = ddpd.a(ddpgVar.h);
                    if (a5 == 0) {
                        a5 = 1;
                    }
                    int i9 = a5 - 1;
                    int a6 = ddpf.a(ddpgVar.g);
                    if (a6 == 0) {
                        a6 = 1;
                    }
                    avopVar.e(i9, a6);
                } else if (ddpgVar.c <= 0 || ddpgVar.i) {
                    int a7 = ddpf.a(ddpgVar.g);
                    if (a7 == 0) {
                        a7 = 1;
                    }
                    ((ckcn) avopVar.a.a(ckia.d)).a();
                    ((ckco) avopVar.a.a(ckia.e)).a(ckhz.a(avop.f(a7)));
                } else {
                    int a8 = ddpf.a(ddpgVar.g);
                    if (a8 == 0) {
                        a8 = 1;
                    }
                    avopVar.e(0, a8);
                }
                if (ddpgVar.e > 0 || ddpgVar.f > 0) {
                    double d = ddpgVar.f;
                    Double.isNaN(d);
                    long round = Math.round(d / 1000.0d);
                    int a9 = ddpf.a(ddpgVar.g);
                    if (a9 != 0 && a9 == 2) {
                        ((ckcp) avopVar.a.a(ckia.q)).a(round);
                    } else {
                        int a10 = ddpf.a(ddpgVar.g);
                        if (a10 != 0 && a10 == 4) {
                            ((ckcp) avopVar.a.a(ckia.s)).a(round);
                        } else {
                            int a11 = ddpf.a(ddpgVar.g);
                            if (a11 != 0 && a11 == 3) {
                                ((ckcp) avopVar.a.a(ckia.r)).a(round);
                            }
                        }
                    }
                }
            } else if (i8 != 2) {
                int i10 = dlqqVar.a;
            } else {
                ddpg ddpgVar2 = dlqqVar.b;
                if (ddpgVar2 == null) {
                    ddpgVar2 = ddpg.j;
                }
                int a12 = ddpd.a(ddpgVar2.h);
                if (a12 != 0 && a12 == 11) {
                    dsqp dsqpVar = (dsqp) ddpgVar2.cu(5);
                    dsqpVar.bC(ddpgVar2);
                    ddpb ddpbVar = (ddpb) dsqpVar;
                    this.b.a().i(ddpbVar);
                    ddpgVar2 = ddpbVar.bK();
                }
                avtr avtrVar2 = this.j;
                cjta b = cjtd.b();
                b.d = dtxx.bz;
                ddeu ddeuVar = b.e;
                if (ddeuVar.c) {
                    ddeuVar.bF();
                    ddeuVar.c = false;
                }
                ddev ddevVar2 = (ddev) ddeuVar.b;
                ddev ddevVar3 = ddev.u;
                ddpgVar2.getClass();
                ddevVar2.d = ddpgVar2;
                ddevVar2.a |= 4;
                avtrVar2.b.O(new cjte(deaf.AUTOMATED), b.a());
            }
        }
        if (dlrqVar.n) {
            this.k.K();
        }
        if (dlrqVar.o.size() > 0) {
            avba avbaVar = this.e;
            for (dlrh dlrhVar : dlrqVar.o) {
                int i11 = dlrhVar.a;
                if (i11 == 1) {
                    dlrg dlrgVar = (dlrg) dlrhVar.b;
                    avop avopVar2 = avbaVar.a;
                    int size = dlrgVar.b.size();
                    int i12 = (dlrgVar.a & 1) != 0 ? dlrgVar.c : -1;
                    ((ckcn) avopVar2.a.a(ckia.k)).b(size);
                    for (int i13 = 0; i13 < size; i13++) {
                        ((ckco) avopVar2.a.a(ckia.l)).a(i12);
                    }
                    if (avbaVar.b != null) {
                        for (dspd dspdVar : dlrgVar.b) {
                            avbaVar.b.d(dspdVar);
                        }
                    }
                } else if (i11 == 2) {
                    dlre dlreVar = (dlre) dlrhVar.b;
                    avop avopVar3 = avbaVar.a;
                    dluy b2 = dluy.b(dlreVar.a);
                    if (b2 == null) {
                        b2 = dluy.UNKNOWN_RESOURCE_TYPE;
                    }
                    int i14 = dlreVar.b;
                    ((ckco) avopVar3.a.a(ckia.F)).a(b2.f);
                    ((ckco) avopVar3.a.a(ckia.G)).a(i14);
                }
            }
        }
        if ((dlrqVar.a & 512) != 0) {
            cjqy cjqyVar = this.q;
            cjtk[] cjtkVarArr = new cjtk[1];
            avtv avtvVar = this.r;
            ddpm ddpmVar = dlrqVar.p;
            if (ddpmVar == null) {
                ddpmVar = ddpm.a;
            }
            dbpy<Object> dbpyVar = dbpy.a;
            cqat a13 = avtvVar.a.a();
            avtv.a(a13, 1);
            avtv.a(ddpmVar, 2);
            avtv.a(dbpyVar, 3);
            cjtkVarArr[0] = new avtu(a13, ddpmVar, dbpyVar);
            cjqyVar.u(cjtkVarArr);
        }
        for (final dlpt dlptVar : dlrqVar.h) {
            avbd avbdVar = this.n;
            for (int i15 = 0; i15 < dlptVar.i.size(); i15++) {
                long c = dlptVar.i.c(i15);
                int a14 = dlpr.a(dlptVar.g);
                if (a14 == 0) {
                    a14 = 1;
                }
                dbsk.m(avbdVar.a.get(c) == null, "Received the same operation id in multiple DoneStates.");
                int i16 = a14 - 1;
                if (i16 == 0) {
                    avbdVar.a.put(c, avih.SUCCESS);
                } else if (i16 != i3) {
                    avbdVar.a.put(c, avih.TERMINATION_OR_NOOP);
                } else {
                    avbdVar.a.put(c, avih.FAILURE);
                }
            }
            this.o.b.d(new dbsz(dlptVar) { // from class: avlk
                private final dlpt a;

                {
                    this.a = dlptVar;
                }

                @Override // defpackage.dbsz
                public final void NU(Object obj) {
                    ((avlm) obj).a(this.a);
                }
            });
            awhs awhsVar = this.p;
            avol avolVar2 = this.a;
            if (awhsVar.d.b.s(dpyv.OFFLINE_TRIPS.dm)) {
                dksh offlineMapsParameters = awhsVar.c.getOfflineMapsParameters();
                GmmLocation a15 = awhsVar.b.a();
                dlrj dlrjVar = dlptVar.e;
                if (dlrjVar == null) {
                    dlrjVar = dlrj.e;
                }
                dltm dltmVar = null;
                boolean z = false;
                boolean z2 = false;
                for (dltm dltmVar2 : dlrjVar.b) {
                    if (offlineMapsParameters.v && ((a3 = dltj.a(dltmVar2.d)) == 0 || a3 == i3)) {
                        dvfg dvfgVar = dltmVar2.g;
                        if (dvfgVar == null) {
                            dvfgVar = dvfg.e;
                        }
                        dvfe dvfeVar = dvfgVar.c;
                        if (dvfeVar == null) {
                            dvfeVar = dvfe.d;
                        }
                        if (!dvfeVar.b) {
                            dltl b3 = dltl.b(dltmVar2.k);
                            if (b3 == null) {
                                b3 = dltl.USER_DEFINED;
                            }
                            if (b3 == dltl.TRIP) {
                                dlte dlteVar = dltmVar2.m;
                                if (dlteVar == null) {
                                    dlteVar = dlte.c;
                                }
                                if (!dlteVar.a) {
                                    dlte dlteVar2 = dltmVar2.m;
                                    if (dlteVar2 == null) {
                                        dlteVar2 = dlte.c;
                                    }
                                    dsqp dsqpVar2 = (dsqp) dlteVar2.cu(5);
                                    dsqpVar2.bC(dlteVar2);
                                    dltd dltdVar = (dltd) dsqpVar2;
                                    if (dltdVar.c) {
                                        dltdVar.bF();
                                        dltdVar.c = false;
                                    }
                                    dlte.b((dlte) dltdVar.b);
                                    avolVar2.e(dltmVar2.b, dltdVar.bK());
                                    if (dltmVar == null) {
                                        dltmVar = dltmVar2;
                                    } else {
                                        z = true;
                                    }
                                    i7 = 4;
                                    i3 = 1;
                                }
                            }
                        }
                    }
                    if (!z2 && offlineMapsParameters.w && a15 != null && (((a = dltj.a(dltmVar2.d)) != 0 && a == 2) || ((a2 = dltj.a(dltmVar2.d)) != 0 && a2 == i7))) {
                        dltl b4 = dltl.b(dltmVar2.k);
                        if (b4 == null) {
                            b4 = dltl.USER_DEFINED;
                        }
                        if (b4 == dltl.TRIP) {
                            dlte dlteVar3 = dltmVar2.m;
                            if (dlteVar3 == null) {
                                dlteVar3 = dlte.c;
                            }
                            if (!dlteVar3.b) {
                                avzm avzmVar = awhsVar.e;
                                dlug dlugVar = dltmVar2.c;
                                if (dlugVar == null) {
                                    dlugVar = dlug.c;
                                }
                                avzl a16 = avzmVar.a(dlugVar);
                                if (a16.a(a15.B())) {
                                    dlte dlteVar4 = dltmVar2.m;
                                    if (dlteVar4 == null) {
                                        dlteVar4 = dlte.c;
                                    }
                                    dsqp dsqpVar3 = (dsqp) dlteVar4.cu(5);
                                    dsqpVar3.bC(dlteVar4);
                                    dltd dltdVar2 = (dltd) dsqpVar3;
                                    if (dltdVar2.c) {
                                        dltdVar2.bF();
                                        dltdVar2.c = false;
                                    }
                                    dlte.c((dlte) dltdVar2.b);
                                    avolVar2.e(dltmVar2.b, dltdVar2.bK());
                                    akqs c2 = a16.c();
                                    if (c2 != null) {
                                        awhsVar.a.A(c2, dltmVar2.a);
                                    }
                                    z2 = true;
                                }
                            }
                        }
                    }
                    i7 = 4;
                    i3 = 1;
                }
                if (dltmVar != null) {
                    if (z) {
                        awhsVar.a.B();
                    } else {
                        awhsVar.a.H(dltmVar);
                    }
                }
                i7 = 4;
                i3 = 1;
            }
        }
        if (dlrqVar.l) {
            synchronized (this) {
            }
            for (int i17 = 0; i17 < dlrqVar.m.size(); i17++) {
                long c3 = dlrqVar.m.c(i17);
                avih avihVar = this.n.a.get(c3);
                if (avihVar == null) {
                    avihVar = avih.UNKNOWN;
                }
                this.m.c(c3, avihVar);
            }
            this.n.a.clear();
        }
    }
}
