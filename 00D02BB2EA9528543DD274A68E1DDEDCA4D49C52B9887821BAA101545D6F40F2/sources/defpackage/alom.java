package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: alom  reason: default package */
/* loaded from: classes.dex */
public final class alom implements akty, amhc, amiy, aljp {
    public final alrv b;
    public final aloi c;
    public final alol d;
    public final alok e;
    public final akzh f;
    public final aloc g;
    @dzsi
    public amix h;
    public final float i;
    public final alkw j;
    public final alns k;
    public final alob l;
    public final dbty<Boolean> m;
    public final Runnable n;
    public volatile amky o;
    public final alne p;
    private final Set<alsl> q;
    private final Map<dmti, akqn> r;
    private final Set<akvq<dmpn, akqw>> s;
    private final Set<akvq<aktd, akqw>> t;
    private final alqw u;

    public alom(alrv alrvVar, amlm amlmVar, Executor executor, alqw alqwVar, Map map, float f, alkw alkwVar, akzh akzhVar, akpq akpqVar, boolean z, boolean z2, dbty dbtyVar, boolean z3) {
        aloc alocVar = new aloc();
        this.g = alocVar;
        alob alobVar = new alob();
        this.l = alobVar;
        this.s = new HashSet();
        this.t = new HashSet();
        this.n = new alnz(this);
        this.o = amky.f;
        this.b = alrvVar;
        this.f = akzhVar;
        aloi aloiVar = new aloi(alrvVar, executor, akzhVar, akpqVar);
        this.c = aloiVar;
        this.d = new alol();
        this.e = new alok();
        this.q = new HashSet();
        this.u = alqwVar;
        this.r = map;
        this.i = f;
        this.m = dbtyVar;
        this.p = new alne();
        this.j = alkwVar;
        alns alnsVar = new alns(alrvVar, amlmVar, alocVar, z, z2, z3);
        this.k = alnsVar;
        alrvVar.k(alnsVar);
        aloiVar.e(alobVar.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0031, code lost:
        if (w(r2) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0043, code lost:
        if (w(r7) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static boolean C(defpackage.dmpn r7, defpackage.alqw r8) {
        /*
            r0 = 0
            r1 = 1
            if (r7 == 0) goto L53
            int r2 = r7.a
            r2 = r2 & 4096(0x1000, float:5.74E-42)
            if (r2 == 0) goto L13
            long r2 = r7.l
            r4 = 32767(0x7fff, double:1.6189E-319)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L13
            goto L46
        L13:
            dsqv<dmpn, dmpz> r2 = defpackage.dmqa.b
            r7.f(r2)
            dsqh<dsqu> r3 = r7.V
            dsqu r2 = r2.d
            boolean r2 = r3.k(r2)
            if (r2 != 0) goto L46
            int r2 = r7.a
            r2 = r2 & r1
            if (r2 == 0) goto L33
            dmph r2 = r7.b
            if (r2 != 0) goto L2d
            dmph r2 = defpackage.dmph.f
        L2d:
            boolean r2 = w(r2)
            if (r2 == 0) goto L46
        L33:
            int r2 = r7.a
            r2 = r2 & 2
            if (r2 == 0) goto L52
            dmph r7 = r7.c
            if (r7 != 0) goto L3f
            dmph r7 = defpackage.dmph.f
        L3f:
            boolean r7 = w(r7)
            if (r7 == 0) goto L46
            goto L52
        L46:
            alrc r7 = r8.a
            almu r7 = r7.j()
            boolean r7 = r7.l()
            if (r7 == 0) goto L53
        L52:
            r0 = 1
        L53:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alom.C(dmpn, alqw):boolean");
    }

    private static void D(dmti dmtiVar) {
        if (dmtiVar != dmti.WORLD_ENCODING_UNKNOWN) {
            return;
        }
        throw new IllegalArgumentException("Attempting to create a client-inject label with an unknown vertex encoding");
    }

    private static alsi E(aktd aktdVar) {
        dbsk.l(aktdVar instanceof alsi);
        return (alsi) aktdVar;
    }

    static boolean w(dmph dmphVar) {
        if ((dmphVar.a & 2) == 0 || dmphVar.d >= 32767) {
            dsqv<dmph, dmpz> dsqvVar = dmqa.c;
            dmphVar.f(dsqvVar);
            if (dmphVar.V.k(dsqvVar.d)) {
                return false;
            }
            for (dmpd dmpdVar : dmphVar.b) {
                if ((dmpdVar.a & 4) == 0) {
                    dsqv<dmpd, dmpz> dsqvVar2 = dmqa.d;
                    dmpdVar.f(dsqvVar2);
                    if (dmpdVar.V.k(dsqvVar2.d)) {
                        return false;
                    }
                } else if (dmpdVar.d < 32767) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.amiy
    public final void A(aktd aktdVar, akqw akqwVar) {
        dcep K;
        synchronized (this.t) {
            K = dcep.K(this.t);
        }
        dcpd it = K.iterator();
        while (it.hasNext()) {
            akvq akvqVar = (akvq) it.next();
            if (akvqVar.b(aktdVar)) {
                akvqVar.a(aktdVar, akqwVar);
            }
        }
    }

    @Override // defpackage.amhc
    @dzsi
    public final /* bridge */ /* synthetic */ akti B(dmpn dmpnVar) {
        return this.g.c(dmpnVar);
    }

    @Override // defpackage.akty
    public final /* bridge */ /* synthetic */ aktd a(dmpn dmpnVar, dmti dmtiVar, akvx akvxVar) {
        D(dmtiVar);
        alrk alrkVar = (alrk) akvxVar;
        return (dmpnVar.a & 4) != 0 ? x(dmpnVar, dmtiVar, alrkVar) : y(dmpnVar, dmtiVar, alrkVar);
    }

    @Override // defpackage.akty
    public final /* bridge */ /* synthetic */ aktd b(dmpn dmpnVar, dmti dmtiVar) {
        D(dmtiVar);
        alrk alrkVar = this.b.i;
        return (dmpnVar.a & 4) != 0 ? x(dmpnVar, dmtiVar, alrkVar) : y(dmpnVar, dmtiVar, alrkVar);
    }

    @Override // defpackage.akty
    public final /* bridge */ /* synthetic */ akti c(dmpn dmpnVar, dmti dmtiVar) {
        return x(dmpnVar, dmtiVar, this.b.i);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // defpackage.akty
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ defpackage.aktc d(defpackage.dmpn r10, defpackage.dmti r11) {
        /*
            r9 = this;
            java.util.Map<dmti, akqn> r0 = r9.r
            java.lang.Object r11 = r0.get(r11)
            akqn r11 = (defpackage.akqn) r11
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L30
            dmlq r2 = r10.d
            if (r2 != 0) goto L12
            dmlq r2 = defpackage.dmlq.e
        L12:
            dmls r2 = r2.b
            if (r2 != 0) goto L18
            dmls r2 = defpackage.dmls.c
        L18:
            int r2 = r2.a
            r2 = r2 & r0
            if (r2 == 0) goto L30
            dmlq r2 = r10.d     // Catch: java.io.IOException -> L30
            if (r2 != 0) goto L23
            dmlq r2 = defpackage.dmlq.e     // Catch: java.io.IOException -> L30
        L23:
            dmls r2 = r2.b     // Catch: java.io.IOException -> L30
            if (r2 != 0) goto L29
            dmls r2 = defpackage.dmls.c     // Catch: java.io.IOException -> L30
        L29:
            dspd r2 = r2.b     // Catch: java.io.IOException -> L30
            akra r11 = r11.h(r2)     // Catch: java.io.IOException -> L30
            goto L31
        L30:
            r11 = r1
        L31:
            alks r8 = new alks
            aloi r3 = r9.c
            alkw r4 = r9.j
            int r2 = r10.h
            if (r2 != 0) goto L3d
            r2 = r10
            goto L65
        L3d:
            r2 = 5
            java.lang.Object r2 = r10.cu(r2)
            dsqp r2 = (defpackage.dsqp) r2
            r2.bC(r10)
            dmpk r2 = (defpackage.dmpk) r2
            boolean r5 = r2.c
            r6 = 0
            if (r5 == 0) goto L53
            r2.bF()
            r2.c = r6
        L53:
            MessageType extends dsqw<MessageType, BuilderType> r5 = r2.b
            dmpn r5 = (defpackage.dmpn) r5
            int r7 = r5.a
            r7 = r7 | 64
            r5.a = r7
            r5.h = r6
            dsqw r2 = r2.bK()
            dmpn r2 = (defpackage.dmpn) r2
        L65:
            if (r11 != 0) goto L6c
            amje r11 = defpackage.amje.e(r1, r1)
            goto L74
        L6c:
            alvi r11 = defpackage.alvi.c(r11)
            amje r11 = defpackage.amje.c(r11)
        L74:
            amkn r5 = defpackage.amkn.ad(r2, r0, r11)
            int r11 = r10.a
            r11 = r11 & 4
            if (r11 == 0) goto L8e
            dmlq r11 = r10.d
            if (r11 != 0) goto L84
            dmlq r11 = defpackage.dmlq.e
        L84:
            int r11 = r11.c
            dmlo r1 = defpackage.dmlo.b(r11)
            if (r1 != 0) goto L8e
            dmlo r1 = defpackage.dmlo.CENTER
        L8e:
            r6 = r1
            r2 = r8
            r7 = r9
            r2.<init>(r3, r4, r5, r6, r7)
            alnv r11 = new alnv
            r11.<init>(r9, r8)
            alqw r0 = r9.u
            boolean r10 = C(r10, r0)
            if (r10 == 0) goto La7
            alob r10 = r9.l
            r10.a(r11)
            goto Lb1
        La7:
            alqw r10 = r9.u
            alnw r0 = new alnw
            r0.<init>(r9, r11)
            r10.a(r0)
        Lb1:
            aloi r10 = r9.c
            monitor-enter(r10)
            java.util.Set<amhf> r11 = r10.g     // Catch: java.lang.Throwable -> Lbd
            amhf r0 = r8.c     // Catch: java.lang.Throwable -> Lbd
            r11.add(r0)     // Catch: java.lang.Throwable -> Lbd
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lbd
            return r8
        Lbd:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lbd
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alom.d(dmpn, dmti):aktc");
    }

    @Override // defpackage.akty
    public final void e(aktd aktdVar) {
        alsi E = E(aktdVar);
        g(E);
        E.z();
        this.g.b(aktdVar.k());
        if (E instanceof allu) {
            this.e.b((allu) E);
        }
        if (E instanceof alks) {
            aloi aloiVar = this.c;
            alks alksVar = (alks) E;
            synchronized (aloiVar) {
                aloiVar.g.remove(alksVar.c);
            }
        }
    }

    @Override // defpackage.akty
    public final void f(aktd aktdVar) {
        boolean add;
        alsi E = E(aktdVar);
        synchronized (this) {
            add = this.q.add(E);
        }
        if (add) {
            E.x();
        }
    }

    @Override // defpackage.akty
    public final void g(aktd aktdVar) {
        boolean remove;
        alsi E = E(aktdVar);
        synchronized (this) {
            remove = this.q.remove(E);
        }
        if (remove) {
            E.y();
        }
    }

    @Override // defpackage.akty
    public final void h(int i, @dzsi aktr aktrVar) {
        aloi aloiVar = this.c;
        if (i == 0) {
            return;
        }
        synchronized (aloiVar) {
            aloiVar.j.a(i, aktrVar);
        }
    }

    @Override // defpackage.akty
    public final void i(dbsl<dmpn> dbslVar) {
        boolean add;
        aloi aloiVar = this.c;
        synchronized (aloiVar) {
            add = aloiVar.e.add(dbslVar);
        }
        if (add) {
            aloiVar.c();
        }
    }

    @Override // defpackage.akty
    public final void j(dbsl<dmpn> dbslVar) {
        boolean remove;
        aloi aloiVar = this.c;
        synchronized (aloiVar) {
            remove = aloiVar.e.remove(dbslVar);
        }
        if (remove) {
            aloiVar.c();
        }
    }

    @Override // defpackage.akty
    public final void k(akvq<dmpn, akqw> akvqVar) {
        synchronized (this.s) {
            this.s.add(akvqVar);
        }
    }

    @Override // defpackage.akty
    public final void l(akvq<dmpn, akqw> akvqVar) {
        synchronized (this.s) {
            this.s.remove(akvqVar);
        }
    }

    @Override // defpackage.akty
    public final void m(akvq<aktd, akqw> akvqVar) {
        synchronized (this.t) {
            this.t.add(akvqVar);
        }
    }

    @Override // defpackage.akty
    public final void n(akvq<aktd, akqw> akvqVar) {
        synchronized (this.t) {
            this.t.remove(akvqVar);
        }
    }

    @Override // defpackage.akty
    public final void o(@dzsi aktx aktxVar) {
        aloi aloiVar = this.c;
        synchronized (aloiVar) {
            if (aktxVar != aloiVar.i) {
                aloiVar.i = aktxVar;
                amii amiiVar = aloiVar.h;
                if (amiiVar != null) {
                    amiiVar.l(aktxVar);
                }
            }
        }
    }

    @Override // defpackage.akty
    public final aktx p(long j, double d, double d2) {
        alns alnsVar = this.k;
        alni alniVar = new alni(j);
        dmrt dmrtVar = alns.c;
        dsqp dsqpVar = (dsqp) dmrtVar.cu(5);
        dsqpVar.bC(dmrtVar);
        dmrs dmrsVar = (dmrs) dsqpVar;
        dmry bZ = dmrz.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmrz dmrzVar = (dmrz) bZ.b;
        dmrzVar.a |= 1;
        dmrzVar.b = j;
        if (dmrsVar.c) {
            dmrsVar.bF();
            dmrsVar.c = false;
        }
        dmrt dmrtVar2 = (dmrt) dmrsVar.b;
        dmrz bK = bZ.bK();
        dmrt dmrtVar3 = dmrt.k;
        bK.getClass();
        dmrtVar2.b = bK;
        dmrtVar2.a |= 1;
        return new alnn(alnsVar, alniVar, new alnr(alnsVar, akra.e(d, d2), null), aljr.c((dmrt) dmrsVar.bK()));
    }

    @Override // defpackage.akty
    public final aktx q(akra akraVar) {
        alns alnsVar = this.k;
        return new alnn(alnsVar, new alnj(akraVar), new alnr(alnsVar, akraVar, null));
    }

    @Override // defpackage.akty
    public final aktx r(long j, double d, double d2) {
        alns alnsVar = this.k;
        return new alnn(alnsVar, new alnl(j), new alnr(alnsVar, akra.e(d, d2), null));
    }

    @Override // defpackage.akty
    public final aktx s(Resources resources, String str, String str2, akra akraVar) {
        akuh akuhVar;
        alns alnsVar = this.k;
        alnm alnmVar = new alnm(str, str2);
        Bitmap bitmap = new alwe(BitmapFactory.decodeResource(resources, 2131231958)).f;
        if (bitmap != null) {
            if (!alnsVar.i.containsKey(bitmap)) {
                alnsVar.i.put(bitmap, alnsVar.d.d(bitmap));
            }
            akuhVar = alnsVar.i.get(bitmap);
        } else {
            akuhVar = alrv.c;
        }
        dmpc dmpcVar = (dmpc) dmpd.h.bZ();
        int a = akuhVar.a();
        if (dmpcVar.c) {
            dmpcVar.bF();
            dmpcVar.c = false;
        }
        dmpd dmpdVar = (dmpd) dmpcVar.b;
        dmpdVar.a |= 2;
        dmpdVar.c = a;
        return new alnn(alnsVar, alnmVar, new alnq(alnsVar, akraVar, alns.f((dmpd) dmpcVar.bK(), 1)));
    }

    @Override // defpackage.akty
    public final aktx t(dnbv dnbvVar, double d, double d2, int i) {
        alns alnsVar = this.k;
        alnk alnkVar = new alnk(dnbvVar);
        String str = i == 3 ? "http://mt0.google.com/vt/icon/name=icons/spotlight/measle_ad_spotlight_L.png&scale=4" : i == 4 ? "http://mt0.google.com/vt/icon/name=icons/spotlight/measle_spotlight_L.png&scale=4" : "http://mt0.google.com/vt/icon/name=icons/spotlight/measle_ad_monroe_spotlight_L.png&scale=4";
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        dmoo dmooVar = (dmoo) dmop.h.bZ();
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar = (dmop) dmooVar.b;
        dmopVar.a |= 1;
        dmopVar.b = 0;
        dmpq bZ = dmpv.s.bZ();
        dmog dmogVar = (dmog) dmoh.h.bZ();
        if (dmogVar.c) {
            dmogVar.bF();
            dmogVar.c = false;
        }
        dmoh dmohVar = (dmoh) dmogVar.b;
        int i2 = dmohVar.a | 1;
        dmohVar.a = i2;
        dmohVar.b = str;
        dmohVar.a = i2 | 4;
        dmohVar.c = 4;
        bZ.a(dmogVar);
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar2 = (dmop) dmooVar.b;
        dmpv bK = bZ.bK();
        bK.getClass();
        dmopVar2.d = bK;
        dmopVar2.a = 4 | dmopVar2.a;
        dmqtVar.a(dmooVar);
        akuh a = alnsVar.a((dmqx) dmqtVar.bK());
        akra e = akra.e(d, d2);
        dmpc dmpcVar = (dmpc) dmpd.h.bZ();
        int a2 = a.a();
        if (dmpcVar.c) {
            dmpcVar.bF();
            dmpcVar.c = false;
        }
        dmpd dmpdVar = (dmpd) dmpcVar.b;
        dmpdVar.a |= 2;
        dmpdVar.c = a2;
        return new alnn(alnsVar, alnkVar, new alnr(alnsVar, e, (dmpd) dmpcVar.bK()));
    }

    @Override // defpackage.aljp
    public final void u(dmrt dmrtVar) {
        boolean add;
        aloi aloiVar = this.c;
        synchronized (aloiVar) {
            add = aloiVar.d.add(dmrtVar);
        }
        if (add) {
            aloiVar.b(true);
        }
    }

    @Override // defpackage.aljp
    public final void v(dmrt dmrtVar) {
        boolean remove;
        aloi aloiVar = this.c;
        synchronized (aloiVar) {
            remove = aloiVar.d.remove(dmrtVar);
        }
        if (remove) {
            aloiVar.b(true);
        }
    }

    public final allu x(final dmpn dmpnVar, dmti dmtiVar, final alrk alrkVar) {
        alvi c;
        alvi c2;
        if ((dmpnVar.a & 8) == 0) {
            if (!C(dmpnVar, this.u)) {
                akqn akqnVar = this.r.get(dmtiVar);
                dbsk.s(akqnVar);
                try {
                    dmlq dmlqVar = dmpnVar.d;
                    if (dmlqVar == null) {
                        dmlqVar = dmlq.e;
                    }
                    c = alvi.a(dmlqVar, akqnVar);
                    alwg.b(dmpnVar, c);
                } catch (IOException unused) {
                    c = alvi.c(new akra());
                }
                final allu alluVar = new allu(c, this.c, this.j, this.d, dmpnVar, alrkVar.d, this);
                this.u.a(new Runnable(this, alluVar, dmpnVar, alrkVar) { // from class: alnx
                    private final alom a;
                    private final allu b;
                    private final dmpn c;
                    private final alrk d;

                    {
                        this.a = this;
                        this.b = alluVar;
                        this.c = dmpnVar;
                        this.d = alrkVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        alom alomVar = this.a;
                        allu alluVar2 = this.b;
                        dmpn dmpnVar2 = this.c;
                        alluVar2.E(alkx.D(dmpnVar2, this.d, (int) alomVar.f.p().k));
                        alluVar2.s();
                        alomVar.g.a(dmpnVar2, alluVar2);
                    }
                });
                return alluVar;
            }
            akqn akqnVar2 = this.r.get(dmtiVar);
            dbsk.s(akqnVar2);
            int i = (int) this.f.p().k;
            try {
                dmlq dmlqVar2 = dmpnVar.d;
                if (dmlqVar2 == null) {
                    dmlqVar2 = dmlq.e;
                }
                c2 = alvi.a(dmlqVar2, akqnVar2);
                alwg.b(dmpnVar, c2);
            } catch (IOException unused2) {
                c2 = alvi.c(new akra());
            }
            allu alluVar2 = new allu(c2, this.c, this.j, this.d, dmpnVar, alkx.D(dmpnVar, alrkVar, i), alrkVar.d, this);
            this.g.a(dmpnVar, alluVar2);
            return alluVar2;
        }
        throw new UnsupportedOperationException("Cannot create point label from line label proto");
    }

    public final allf y(final dmpn dmpnVar, dmti dmtiVar, final alrk alrkVar) {
        akrk akrkVar;
        akrk akrkVar2;
        if ((dmpnVar.a & 4) == 0) {
            if (!C(dmpnVar, this.u)) {
                akqn akqnVar = this.r.get(dmtiVar);
                dbsk.s(akqnVar);
                try {
                    dmrf dmrfVar = dmpnVar.e;
                    if (dmrfVar == null) {
                        dmrfVar = dmrf.f;
                    }
                    dspd dspdVar = dmrfVar.a;
                    dmrf dmrfVar2 = dmpnVar.e;
                    if (dmrfVar2 == null) {
                        dmrfVar2 = dmrf.f;
                    }
                    akrkVar = akqnVar.j(dspdVar, dmrfVar2.b);
                } catch (IOException unused) {
                    akrkVar = akrk.a;
                }
                final allf allfVar = new allf(akrkVar, this.c, this.j, dmpnVar, alrkVar.d, this);
                this.u.a(new Runnable(this, allfVar, dmpnVar, alrkVar) { // from class: alny
                    private final alom a;
                    private final allf b;
                    private final dmpn c;
                    private final alrk d;

                    {
                        this.a = this;
                        this.b = allfVar;
                        this.c = dmpnVar;
                        this.d = alrkVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        alom alomVar = this.a;
                        allf allfVar2 = this.b;
                        allfVar2.E(alkx.D(this.c, this.d, (int) alomVar.f.p().k));
                        allfVar2.s();
                    }
                });
                return allfVar;
            }
            akqn akqnVar2 = this.r.get(dmtiVar);
            dbsk.s(akqnVar2);
            int i = (int) this.f.p().k;
            try {
                dmrf dmrfVar3 = dmpnVar.e;
                if (dmrfVar3 == null) {
                    dmrfVar3 = dmrf.f;
                }
                dspd dspdVar2 = dmrfVar3.a;
                dmrf dmrfVar4 = dmpnVar.e;
                if (dmrfVar4 == null) {
                    dmrfVar4 = dmrf.f;
                }
                akrkVar2 = akqnVar2.j(dspdVar2, dmrfVar4.b);
            } catch (IOException unused2) {
                akrkVar2 = akrk.a;
            }
            boolean D = alkx.D(dmpnVar, alrkVar, i);
            return new allf(akrkVar2, this.c, this.j, dmpnVar, alrkVar.d, this, D);
        }
        throw new UnsupportedOperationException("Cannot create line label from point label proto");
    }

    @Override // defpackage.amiy
    public final void z(dmpn dmpnVar, akqw akqwVar) {
        dcep K;
        synchronized (this.s) {
            K = dcep.K(this.s);
        }
        dcpd it = K.iterator();
        while (it.hasNext()) {
            akvq akvqVar = (akvq) it.next();
            if (akvqVar.b(dmpnVar)) {
                akvqVar.a(dmpnVar, akqwVar);
            }
        }
    }
}
