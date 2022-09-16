package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cada  reason: default package */
/* loaded from: classes4.dex */
public final class cada implements btzi, ango, angx {
    public final bvrb a;
    public final angp b;
    public final angy c;
    public final cafz d;
    public final bztp e;
    public final ckcw f;
    public final caek g;
    @dzsi
    public String h = null;
    @dzsi
    public btzc i = null;
    public boolean j = false;
    private final buru k;
    private final dxio<akfa> l;
    private final dxio<ahjq> m;
    private final bvjj n;
    private final btvo o;
    private final akpm p;
    private final anhk q;
    private final cgen r;
    private final cgep s;
    private final cdft t;
    @dzsi
    private final cacy u;

    public cada(buru buruVar, bvjj bvjjVar, btvo btvoVar, akpm akpmVar, anhk anhkVar, bvrb bvrbVar, angp angpVar, angy angyVar, cgen cgenVar, cgep cgepVar, dxio<akfa> dxioVar, dxio<ahjq> dxioVar2, cdft cdftVar, cafz cafzVar, bztp bztpVar, ckcw ckcwVar, caek caekVar, @dzsi cacy cacyVar) {
        this.k = buruVar;
        this.b = angpVar;
        this.c = angyVar;
        this.n = bvjjVar;
        this.o = btvoVar;
        this.p = akpmVar;
        this.q = anhkVar;
        this.a = bvrbVar;
        this.l = dxioVar;
        this.m = dxioVar2;
        this.r = cgenVar;
        this.s = cgepVar;
        this.t = cdftVar;
        this.d = cafzVar;
        this.e = bztpVar;
        this.f = ckcwVar;
        this.g = caekVar;
        this.u = cacyVar;
        angyVar.a(this);
        angpVar.a(this);
        caekVar.V(new Runnable(this) { // from class: cacn
            private final cada a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g();
            }
        });
    }

    private final boolean j() {
        int a = dvlx.a(this.o.getPhotoUploadParameters().f);
        if (a == 0) {
            a = 2;
        }
        return a == 4 || a == 5;
    }

    private final synchronized void m() {
        this.a.b(new Runnable(this) { // from class: cact
            private final cada a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cada cadaVar = this.a;
                btzc btzcVar = cadaVar.i;
                if (btzcVar != null) {
                    btzcVar.a();
                }
                cadaVar.g.R(true);
                cadaVar.g.N();
                cadaVar.g.S(false);
                cadaVar.h = null;
                cadaVar.j = false;
                cadaVar.i(false);
            }
        }, bvrj.UI_THREAD);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0132, code lost:
        if (r5 != 3) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0149 A[Catch: all -> 0x0200, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0008, B:10:0x001b, B:11:0x0020, B:13:0x0039, B:14:0x003e, B:16:0x004e, B:17:0x0053, B:19:0x0074, B:20:0x0079, B:22:0x0088, B:23:0x008d, B:25:0x00ac, B:26:0x00b1, B:28:0x00c3, B:29:0x00cc, B:31:0x00d8, B:33:0x00fd, B:34:0x00ff, B:36:0x0103, B:38:0x010b, B:40:0x0113, B:42:0x0117, B:44:0x011c, B:52:0x013c, B:53:0x0144, B:55:0x0149, B:57:0x0155, B:56:0x014d, B:51:0x0137, B:43:0x011a, B:58:0x0167, B:60:0x0179, B:61:0x017e, B:63:0x0190, B:64:0x0195, B:65:0x01aa, B:67:0x01b2, B:69:0x01be, B:70:0x01c3, B:71:0x01cf, B:73:0x01e7, B:74:0x01ea), top: B:80:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x014d A[Catch: all -> 0x0200, TryCatch #0 {, blocks: (B:3:0x0001, B:8:0x0008, B:10:0x001b, B:11:0x0020, B:13:0x0039, B:14:0x003e, B:16:0x004e, B:17:0x0053, B:19:0x0074, B:20:0x0079, B:22:0x0088, B:23:0x008d, B:25:0x00ac, B:26:0x00b1, B:28:0x00c3, B:29:0x00cc, B:31:0x00d8, B:33:0x00fd, B:34:0x00ff, B:36:0x0103, B:38:0x010b, B:40:0x0113, B:42:0x0117, B:44:0x011c, B:52:0x013c, B:53:0x0144, B:55:0x0149, B:57:0x0155, B:56:0x014d, B:51:0x0137, B:43:0x011a, B:58:0x0167, B:60:0x0179, B:61:0x017e, B:63:0x0190, B:64:0x0195, B:65:0x01aa, B:67:0x01b2, B:69:0x01be, B:70:0x01c3, B:71:0x01cf, B:73:0x01e7, B:74:0x01ea), top: B:80:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void n() {
        /*
            Method dump skipped, instructions count: 515
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cada.n():void");
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dwmp> btzrVar, btzy btzyVar) {
        this.g.R(false);
        i(true);
        this.j = false;
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr btzrVar, Object obj) {
        int a;
        dwmt dwmtVar = (dwmt) obj;
        int a2 = dwms.a(dwmtVar.c);
        if ((a2 != 0 && a2 == 4) || ((a = dwms.a(dwmtVar.c)) != 0 && a == 6)) {
            this.g.R(false);
            i(true);
            this.j = false;
            return;
        }
        this.g.I(dwmtVar.a);
        final dwla dwlaVar = dwmtVar.b;
        if (dwlaVar == null) {
            dwlaVar = dwla.m;
        }
        if ((dwlaVar.a & 1) != 0) {
            this.h = dwlaVar.c;
        } else {
            this.g.S(true);
        }
        if (!j() && (dwlaVar.a & 2) != 0) {
            caek caekVar = this.g;
            dvlu dvluVar = dwlaVar.d;
            if (dvluVar == null) {
                dvluVar = dvlu.e;
            }
            caekVar.W(dvluVar);
        }
        if ((dwlaVar.a & 8) != 0) {
            dvof dvofVar = dwlaVar.f;
            if (dvofVar == null) {
                dvofVar = dvof.c;
            }
            if ((dvofVar.a & 1) != 0) {
                caek caekVar2 = this.g;
                dvof dvofVar2 = dwlaVar.f;
                if (dvofVar2 == null) {
                    dvofVar2 = dvof.c;
                }
                dvoe dvoeVar = dvofVar2.b;
                if (dvoeVar == null) {
                    dvoeVar = dvoe.b;
                }
                dvoc dvocVar = dvoeVar.a;
                if (dvocVar == null) {
                    dvocVar = dvoc.b;
                }
                caekVar2.T(dvocVar.a);
            }
        }
        if ((dwlaVar.a & 4) != 0) {
            caek caekVar3 = this.g;
            dwrz dwrzVar = dwlaVar.e;
            if (dwrzVar == null) {
                dwrzVar = dwrz.d;
            }
            caekVar3.M(dwrzVar);
            alad l = this.r.l();
            if (l != null) {
                akqs m = akyx.m(this.p.Y(l));
                cgep cgepVar = this.s;
                dwrz dwrzVar2 = dwlaVar.e;
                if (dwrzVar2 == null) {
                    dwrzVar2 = dwrz.d;
                }
                cgepVar.b(dwrzVar2, m);
            }
        }
        if ((dwlaVar.a & 16) != 0) {
            this.g.X(dwlaVar.g);
        }
        if (!dwlaVar.i.isEmpty()) {
            this.g.ab(dwlaVar.i);
        }
        this.g.w((dwlaVar.a & 64) != 0 ? dwlaVar.j : null);
        if ((dwlaVar.a & 256) != 0) {
            this.g.x(dwlaVar.k);
        }
        this.a.b(new Runnable(this, dwlaVar) { // from class: caco
            private final cada a;
            private final dwla b;

            {
                this.a = this;
                this.b = dwlaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final cada cadaVar = this.a;
                dwla dwlaVar2 = this.b;
                ArrayList<cadx> arrayList = new ArrayList(dwlaVar2.b.size());
                for (dwmk dwmkVar : dwlaVar2.b) {
                    cadx K = cadaVar.g.K(dwmkVar);
                    cadaVar.g.L(K);
                    arrayList.add(K);
                }
                if (cadaVar.d.a()) {
                    bvrj.UI_THREAD.d();
                    bztn g = cadaVar.e.g();
                    final cacx cacxVar = new cacx(g);
                    dcbg s = dcbg.b(arrayList).t(cacu.a).s(new dbrn(cacxVar) { // from class: cacv
                        private final cacx a;

                        {
                            this.a = cacxVar;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj2) {
                            return this.a.a.c((eaps) obj2);
                        }
                    });
                    dbsg i = s.y() ? dbpy.a : dbsg.i(cacxVar.a.d(s));
                    if (i.a()) {
                        ArrayList b = dchl.b((bztm) i.b(), g.j());
                        if (!cadaVar.d.b().a) {
                            b.add(g.f());
                        }
                        dcdc z = dcbg.b((Iterable) deha.s(cadaVar.e.b(b))).o(cacq.a).z();
                        int size = z.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            final bztl bztlVar = (bztl) z.get(i2);
                            Iterator it = arrayList.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    cadx cadxVar = (cadx) it.next();
                                    if (dcft.j(cadxVar.X(), new dbsl(bztlVar) { // from class: cacw
                                        private final bztl a;

                                        {
                                            this.a = bztlVar;
                                        }

                                        @Override // defpackage.dbsl
                                        public final boolean a(Object obj2) {
                                            return ((eaps) obj2).h(this.a.b());
                                        }
                                    })) {
                                        cadxVar.W(bztlVar);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    for (cadx cadxVar2 : arrayList) {
                        ((ckcp) cadaVar.f.a(ckdz.aF)).a(cadxVar2.R().size());
                    }
                }
                cadaVar.a.b(new Runnable(cadaVar) { // from class: cacp
                    private final cada a;

                    {
                        this.a = cadaVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cada cadaVar2 = this.a;
                        cadaVar2.i(true);
                        cadaVar2.j = false;
                    }
                }, bvrj.UI_THREAD);
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.ango
    public final void c(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void d(dcdc dcdcVar) {
    }

    @Override // defpackage.ango
    public final void e(duyc duycVar, duye duyeVar) {
        for (final dnrw dnrwVar : duycVar.b) {
            int i = dnrwVar.a;
            if (i == 1) {
                this.a.b(new Runnable(this, dnrwVar) { // from class: cacr
                    private final cada a;
                    private final dnrw b;

                    {
                        this.a = this;
                        this.b = dnrwVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        dnrp dnrpVar;
                        dniu dniuVar;
                        cada cadaVar = this.a;
                        dnrw dnrwVar2 = this.b;
                        caek caekVar = cadaVar.g;
                        if (dnrwVar2.a == 1) {
                            dnrpVar = (dnrp) dnrwVar2.b;
                        } else {
                            dnrpVar = dnrp.c;
                        }
                        dnsc dnscVar = dnrpVar.b;
                        if (dnscVar == null) {
                            dnscVar = dnsc.f;
                        }
                        if (dnscVar.b == 1) {
                            dniuVar = (dniu) dnscVar.c;
                        } else {
                            dniuVar = dniu.i;
                        }
                        caekVar.O(dniuVar.b);
                    }
                }, bvrj.UI_THREAD);
            } else if (i == 7) {
                dnqt dnqtVar = (dnqt) dnrwVar.b;
                if ((dnqtVar.a & 4) == 0 || (dnqtVar.a & 8) != 0) {
                    m();
                    return;
                } else {
                    this.a.b(new Runnable(this, dnrwVar) { // from class: cacs
                        private final cada a;
                        private final dnrw b;

                        {
                            this.a = this;
                            this.b = dnrwVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            dnqt dnqtVar2;
                            cada cadaVar = this.a;
                            dnrw dnrwVar2 = this.b;
                            caek caekVar = cadaVar.g;
                            if (dnrwVar2.a == 7) {
                                dnqtVar2 = (dnqt) dnrwVar2.b;
                            } else {
                                dnqtVar2 = dnqt.g;
                            }
                            dniu dniuVar = dnqtVar2.d;
                            if (dniuVar == null) {
                                dniuVar = dniu.i;
                            }
                            caekVar.O(dniuVar.b);
                        }
                    }, bvrj.UI_THREAD);
                    return;
                }
            } else if (i == 3 || i == 4) {
                m();
                return;
            }
        }
    }

    @Override // defpackage.ango
    public final void f(duyc duycVar) {
    }

    public final void g() {
        int a = dvlx.a(this.o.getPhotoUploadParameters().f);
        if (a == 0) {
            a = 2;
        }
        if ((a == 4 || a == 3 || a == 5) && !this.j && this.h == null) {
            this.t.c(j() ? new cacz(this.g) : null);
        }
        if (!this.j) {
            n();
        }
    }

    public final void h() {
        btzc btzcVar = this.i;
        if (btzcVar != null) {
            btzcVar.a();
        }
        this.g.R(true);
        this.j = false;
        i(false);
    }

    public final void i(boolean z) {
        cacy cacyVar;
        cqkx.p(this.g);
        if (!z || (cacyVar = this.u) == null) {
            return;
        }
        cacyVar.a();
    }

    @Override // defpackage.angx
    public final void k(duxy duxyVar, duya duyaVar) {
        m();
    }

    @Override // defpackage.angx
    public final void l() {
    }
}
