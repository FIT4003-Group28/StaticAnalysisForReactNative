package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.google.android.apps.gmm.ar.api.ArLauncherParams;
import com.google.android.apps.maps.R;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.NetworkLocationStatus;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: dit  reason: default package */
/* loaded from: classes6.dex */
public final class dit implements czo {
    public static final cjtd a = cjtd.a(dtxj.br);
    public static final cjtd b = cjtd.a(dtxj.bs);
    @dzsi
    public dehn<dbsg<diz>> A;
    public final atbs B;
    private final Map<czh, dzsj<czl<?>>> C;
    public final gga c;
    public final crow d;
    public final dhg e;
    public final dehq f;
    public final aufc g;
    public final btvo h;
    public final axru i;
    public final arag j;
    public final axrx k;
    public final dxio<akfa> l;
    public final dxio<ahjq> m;
    public final dja n;
    public final dehn<cokf> o;
    public final cjqq p;
    public final cjqy q;
    public final dgw r;
    public final dbty<ex> s;
    public final dbty<ex> t;
    public final dbty<ex> u;
    public final dbty<ex> v;
    public final dbty<ex> w;
    public final dehn<dcvg> x;
    public final diu y;
    public final Object z;

    public dit(crow crowVar, dhg dhgVar, dehq dehqVar, dehp dehpVar, aufc aufcVar, final btvo btvoVar, axru axruVar, atbs atbsVar, dxio dxioVar, dxio dxioVar2, final gga ggaVar, arag aragVar, axrx axrxVar, Map map, dja djaVar, cjqq cjqqVar, cjqy cjqyVar, dgw dgwVar, diu diuVar) {
        dehn<cokf> c = dehqVar.c(new Callable(ggaVar) { // from class: dht
            private final gga a;

            {
                this.a = ggaVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                gga ggaVar2 = this.a;
                cjtd cjtdVar = dit.a;
                return LocationServices.getFusedLocationProviderClient((Activity) ggaVar2);
            }
        });
        dbty<ex> dbtyVar = die.a;
        dbty<ex> dbtyVar2 = dik.a;
        dbty<ex> dbtyVar3 = dil.a;
        dbty<ex> dbtyVar4 = dim.a;
        dbty<ex> dbtyVar5 = din.a;
        this.z = new Object();
        this.A = null;
        this.c = ggaVar;
        this.d = crowVar;
        this.e = dhgVar;
        this.f = dehqVar;
        this.g = aufcVar;
        this.h = btvoVar;
        this.i = axruVar;
        this.j = aragVar;
        this.k = axrxVar;
        this.B = atbsVar;
        this.l = dxioVar;
        this.m = dxioVar2;
        this.C = map;
        this.n = djaVar;
        this.p = cjqqVar;
        this.q = cjqyVar;
        this.r = dgwVar;
        this.y = diuVar;
        this.s = dbtyVar;
        this.t = dbtyVar2;
        this.u = dbtyVar3;
        this.v = dbtyVar4;
        this.w = dbtyVar5;
        this.o = c;
        this.x = dehpVar.c(new Callable(btvoVar) { // from class: dio
            private final btvo a;

            {
                this.a = btvoVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                btvo btvoVar2 = this.a;
                dcvg dcvgVar = new dcvg();
                dhlz dhlzVar = btvoVar2.getNavigationParametersProto().aJ;
                if (dhlzVar == null) {
                    dhlzVar = dhlz.n;
                }
                ArrayList<Long> arrayList = new ArrayList();
                for (dhlt dhltVar : dhlzVar.b) {
                    arrayList.addAll(dhltVar.a);
                }
                dcvgVar.a = new ArrayList<>(arrayList.size());
                for (Long l : arrayList) {
                    dcvgVar.a.add(new dcvf(l.longValue()));
                }
                dcvgVar.d();
                return dcvgVar;
            }
        });
    }

    @Override // defpackage.czo
    public final dehn<dbsg<diz>> a(czh czhVar) {
        synchronized (this.z) {
            dehn<dbsg<diz>> dehnVar = this.A;
            if (dehnVar != null) {
                return dehnVar;
            }
            dehn<dbsg<diz>> g = deew.g(f(czhVar).l(), new defg(this) { // from class: dia
                private final dit a;

                {
                    this.a = this;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    final dehn<czk> g2;
                    final dit ditVar = this.a;
                    if (!((Boolean) obj).booleanValue()) {
                        return deha.a(dbpy.a);
                    }
                    dhg dhgVar = ditVar.e;
                    dkgz dkgzVar = dhgVar.c.getAugmentedRealityParameters().c;
                    if (dkgzVar == null) {
                        dkgzVar = dkgz.d;
                    }
                    if (dkgzVar.c) {
                        czk a2 = dhg.a(dhgVar.b.checkAvailability(dhgVar.a));
                        if (a2 == null) {
                            g2 = dhgVar.b();
                        } else {
                            g2 = deha.a(a2);
                        }
                    } else {
                        g2 = deew.g(dhgVar.d.c(new Callable(dhgVar) { // from class: dha
                            private final dhg a;

                            {
                                this.a = dhgVar;
                            }

                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                dhg dhgVar2 = this.a;
                                return dhg.a(dhgVar2.b.checkAvailability(dhgVar2.a));
                            }
                        }), new defg(dhgVar) { // from class: dhb
                            private final dhg a;

                            {
                                this.a = dhgVar;
                            }

                            @Override // defpackage.defg
                            public final dehn a(Object obj2) {
                                czk czkVar = (czk) obj2;
                                return czkVar == null ? this.a.b() : deha.a(czkVar);
                            }
                        }, dhgVar.d);
                    }
                    final dehn<dcvg> dehnVar2 = ditVar.x;
                    return deha.m(g2, dehnVar2).b(new Callable(ditVar, g2, dehnVar2) { // from class: did
                        private final dit a;
                        private final dehn b;
                        private final dehn c;

                        {
                            this.a = ditVar;
                            this.b = g2;
                            this.c = dehnVar2;
                        }

                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            dit ditVar2 = this.a;
                            dehn dehnVar3 = this.b;
                            dehn dehnVar4 = this.c;
                            czk czkVar = (czk) deha.r(dehnVar3);
                            dcvg dcvgVar = (dcvg) deha.r(dehnVar4);
                            dhf dhfVar = dhf.INSTALLED;
                            czk czkVar2 = czk.READY;
                            int ordinal = czkVar.ordinal();
                            if (ordinal != 0 && ordinal != 1) {
                                if (ordinal == 2) {
                                    ditVar2.e(R.string.AR_UPGRADE_TO_PRERELEASE_VERSION);
                                    return dbpy.a;
                                } else if (ordinal != 3) {
                                    if (ordinal != 4) {
                                        return dbpy.a;
                                    }
                                    ditVar2.d.a(3);
                                    return dbpy.a;
                                }
                            }
                            dja djaVar = ditVar2.n;
                            dbsg<czw> a3 = djaVar.a.a();
                            dja.a(a3, 1);
                            btvo a4 = djaVar.b.a();
                            dja.a(a4, 2);
                            dag a5 = djaVar.c.a();
                            dja.a(a5, 3);
                            dja.a(dcvgVar, 4);
                            dja.a(czkVar, 5);
                            return dbsg.i(new diz(a3, a4, a5, dcvgVar, czkVar));
                        }
                    }, ditVar.f);
                }
            }, this.f);
            this.A = g;
            g.Pk(new Runnable(this) { // from class: dib
                private final dit a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    dit ditVar = this.a;
                    synchronized (ditVar.z) {
                        ditVar.A = null;
                    }
                }
            }, this.f);
            return g;
        }
    }

    @Override // defpackage.czo
    public final <T> void b(final ArLauncherParams arLauncherParams, final T t) {
        deha.q(deew.g(deew.g(deew.h(deew.g(deew.h(degp.q(deha.a(null)), new dbrn(this, arLauncherParams, t) { // from class: dip
            private final dit a;
            private final ArLauncherParams b;
            private final Object c;

            {
                this.a = this;
                this.b = arLauncherParams;
                this.c = t;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dit ditVar = this.a;
                ArLauncherParams arLauncherParams2 = this.b;
                Object obj2 = this.c;
                Void r6 = (Void) obj;
                if (ditVar.c.isDestroyed() || ditVar.B.d()) {
                    return false;
                }
                if (!ditVar.m.a().t()) {
                    ditVar.f.execute(new Runnable(ditVar, arLauncherParams2, obj2) { // from class: dhx
                        private final dit a;
                        private final ArLauncherParams b;
                        private final Object c;

                        {
                            this.a = ditVar;
                            this.b = arLauncherParams2;
                            this.c = obj2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            final dit ditVar2 = this.a;
                            final ArLauncherParams arLauncherParams3 = this.b;
                            final Object obj3 = this.c;
                            ditVar2.k.f(new axrw(ditVar2, arLauncherParams3, obj3) { // from class: dih
                                private final dit a;
                                private final ArLauncherParams b;
                                private final Object c;

                                {
                                    this.a = ditVar2;
                                    this.b = arLauncherParams3;
                                    this.c = obj3;
                                }

                                @Override // defpackage.axrw
                                public final void a(int i) {
                                    dit ditVar3 = this.a;
                                    ArLauncherParams arLauncherParams4 = this.b;
                                    Object obj4 = this.c;
                                    if (i == 0) {
                                        ditVar3.b(arLauncherParams4, obj4);
                                    } else {
                                        ditVar3.e(R.string.AR_UNABLE_TO_LAUNCH_LOCATION_PERMISSION);
                                    }
                                }
                            });
                        }
                    });
                    return false;
                } else if (!ditVar.m.a().d()) {
                    ditVar.e(R.string.AR_UNABLE_TO_LAUNCH_LOCATION_SETTING);
                    return false;
                } else if (ditVar.m.a().h().b()) {
                    ditVar.f.execute(new Runnable(ditVar, arLauncherParams2, obj2) { // from class: dhy
                        private final dit a;
                        private final ArLauncherParams b;
                        private final Object c;

                        {
                            this.a = ditVar;
                            this.b = arLauncherParams2;
                            this.c = obj2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            final dit ditVar2 = this.a;
                            final ArLauncherParams arLauncherParams3 = this.b;
                            final Object obj3 = this.c;
                            ditVar2.j.f(false, new arae(ditVar2, arLauncherParams3, obj3) { // from class: dif
                                private final dit a;
                                private final ArLauncherParams b;
                                private final Object c;

                                {
                                    this.a = ditVar2;
                                    this.b = arLauncherParams3;
                                    this.c = obj3;
                                }

                                @Override // defpackage.arae
                                public final void a(araf arafVar) {
                                    final dit ditVar3 = this.a;
                                    ArLauncherParams arLauncherParams4 = this.b;
                                    Object obj4 = this.c;
                                    if (arafVar.j) {
                                        ditVar3.b(arLauncherParams4, obj4);
                                    } else {
                                        ditVar3.f.execute(new Runnable(ditVar3) { // from class: dig
                                            private final dit a;

                                            {
                                                this.a = ditVar3;
                                            }

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                this.a.e(R.string.AR_UNABLE_TO_LAUNCH_LOCATION_SERVICES);
                                            }
                                        });
                                    }
                                }
                            });
                        }
                    });
                    return false;
                } else {
                    return true;
                }
            }
        }, this.f), new defg(this) { // from class: diq
            private final dit a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dit ditVar = this.a;
                if (!((Boolean) obj).booleanValue()) {
                    return deha.a(false);
                }
                return deew.g(ditVar.o, new defg(ditVar) { // from class: dij
                    private final dit a;

                    {
                        this.a = ditVar;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj2) {
                        dit ditVar2 = this.a;
                        return deew.h(csac.a(((cokf) obj2).a()), new dbrn(ditVar2) { // from class: dhz
                            private final dit a;

                            {
                                this.a = ditVar2;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj3) {
                                dit ditVar3 = this.a;
                                LocationAvailability locationAvailability = (LocationAvailability) obj3;
                                if (locationAvailability == null) {
                                    ditVar3.e(R.string.AR_UNABLE_TO_LAUNCH_LOCATION_SERVICES);
                                    return false;
                                }
                                NetworkLocationStatus[] networkLocationStatusArr = locationAvailability.e;
                                if (networkLocationStatusArr == null) {
                                    return true;
                                }
                                for (NetworkLocationStatus networkLocationStatus : networkLocationStatusArr) {
                                    if (networkLocationStatus.b == 7 || networkLocationStatus.a == 7) {
                                        ditVar3.e(R.string.AR_UNABLE_TO_LAUNCH_LOCATION_SERVICES);
                                        return false;
                                    }
                                }
                                return true;
                            }
                        }, ditVar2.f);
                    }
                }, ditVar.f);
            }
        }, this.f), new dbrn(this, arLauncherParams, t) { // from class: dir
            private final dit a;
            private final ArLauncherParams b;
            private final Object c;

            {
                this.a = this;
                this.b = arLauncherParams;
                this.c = t;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dit ditVar = this.a;
                ArLauncherParams arLauncherParams2 = this.b;
                Object obj2 = this.c;
                if (((Boolean) obj).booleanValue()) {
                    if (btlu.i(ditVar.l.a().j()) != btlt.INCOGNITO || arLauncherParams2.i()) {
                        if (!arLauncherParams2.c().isEmpty()) {
                            ditVar.d(arLauncherParams2, obj2, ditVar.t);
                            return false;
                        } else if (!ditVar.i.a("android.permission.CAMERA")) {
                            cjqp g = ditVar.p.g();
                            ditVar.k.b("android.permission.CAMERA", new axrw(ditVar, g, g.d(dit.a), arLauncherParams2, obj2, g.d(dit.b)) { // from class: dhw
                                private final dit a;
                                private final cjqp b;
                                private final cjql c;
                                private final ArLauncherParams d;
                                private final Object e;
                                private final cjql f;

                                {
                                    this.a = ditVar;
                                    this.b = g;
                                    this.c = r3;
                                    this.d = arLauncherParams2;
                                    this.e = obj2;
                                    this.f = r6;
                                }

                                @Override // defpackage.axrw
                                public final void a(int i) {
                                    dit ditVar2 = this.a;
                                    cjqp cjqpVar = this.b;
                                    cjql cjqlVar = this.c;
                                    ArLauncherParams arLauncherParams3 = this.d;
                                    Object obj3 = this.e;
                                    cjql cjqlVar2 = this.f;
                                    cjqpVar.f();
                                    if (i == 0) {
                                        ditVar2.q.j(cjqlVar, dit.a);
                                        ditVar2.b(arLauncherParams3, obj3);
                                        return;
                                    }
                                    ditVar2.q.j(cjqlVar2, dit.b);
                                    ditVar2.e(R.string.AR_UNABLE_TO_LAUNCH_CAMERA_PERMISSION);
                                }
                            });
                            return false;
                        } else if (arLauncherParams2.f() || !ditVar.h.getNavigationParameters().J().d) {
                            if (arLauncherParams2.e() || !ditVar.g.f()) {
                                ditVar.r.b.b(true);
                                if (!arLauncherParams2.g() && !arLauncherParams2.d() && !arLauncherParams2.e()) {
                                    dgw dgwVar = ditVar.r;
                                    dkgz dkgzVar = dgwVar.a.getAugmentedRealityParameters().c;
                                    if (dkgzVar == null) {
                                        dkgzVar = dkgz.d;
                                    }
                                    if (dgwVar.a(dkgzVar.b)) {
                                        ditVar.d(arLauncherParams2, obj2, ditVar.w);
                                        return false;
                                    }
                                }
                                return true;
                            }
                            ditVar.d(arLauncherParams2, obj2, ditVar.v);
                            return false;
                        } else {
                            ditVar.d(arLauncherParams2, obj2, ditVar.u);
                            return false;
                        }
                    }
                    ditVar.d(arLauncherParams2, obj2, ditVar.s);
                    return false;
                }
                return false;
            }
        }, this.f), new defg(this, arLauncherParams) { // from class: dhu
            private final dit a;
            private final ArLauncherParams b;

            {
                this.a = this;
                this.b = arLauncherParams;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                dit ditVar = this.a;
                ArLauncherParams arLauncherParams2 = this.b;
                if (!((Boolean) obj).booleanValue()) {
                    return deha.a(dbpy.a);
                }
                return ditVar.a(arLauncherParams2.a());
            }
        }, this.f), new defg(this) { // from class: dhv
            private final dit a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                final dit ditVar = this.a;
                dbsg dbsgVar = (dbsg) obj;
                if (!dbsgVar.a()) {
                    return deha.a(false);
                }
                diz dizVar = (diz) dbsgVar.b();
                if (!dizVar.b(ditVar.m.a().a()).a()) {
                    cjqy cjqyVar = ditVar.q;
                    cjsx i = cjsy.i();
                    i.b(ddda.S);
                    cjqyVar.k(i.a());
                    return deha.a(false);
                }
                cjqy cjqyVar2 = ditVar.q;
                cjsx i2 = cjsy.i();
                i2.b(ddda.T);
                cjqyVar2.k(i2.a());
                return deew.h(ditVar.e.d(dizVar.a(), ditVar.c, true), new dbrn(ditVar) { // from class: dii
                    private final dit a;

                    {
                        this.a = ditVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        dit ditVar2 = this.a;
                        dhf dhfVar = dhf.INSTALLED;
                        czk czkVar = czk.READY;
                        int ordinal = ((dhf) obj2).ordinal();
                        boolean z = true;
                        if (ordinal != 0) {
                            if (ordinal == 1) {
                                ditVar2.d.a(4);
                            } else if (ordinal == 2) {
                                ditVar2.e(R.string.AR_INSTALL_DECLINED);
                            } else {
                                ditVar2.e(R.string.AR_UNABLE_TO_INSTALL);
                            }
                            z = false;
                        } else {
                            ditVar2.d.a(2);
                        }
                        return Boolean.valueOf(z);
                    }
                }, ditVar.f);
            }
        }, this.f), new dis(this, arLauncherParams, t), this.f);
    }

    @Override // defpackage.czo
    public final void c(czh czhVar) {
        f(czhVar).m();
    }

    public final <T, F extends ex> void d(final ArLauncherParams arLauncherParams, final T t, final dbty<F> dbtyVar) {
        this.f.execute(new Runnable(this, dbtyVar, arLauncherParams, t) { // from class: dic
            private final dit a;
            private final dbty b;
            private final ArLauncherParams c;
            private final Object d;

            {
                this.a = this;
                this.b = dbtyVar;
                this.c = arLauncherParams;
                this.d = t;
            }

            @Override // java.lang.Runnable
            public final void run() {
                dit ditVar = this.a;
                dbty dbtyVar2 = this.b;
                ArLauncherParams arLauncherParams2 = this.c;
                Object obj = this.d;
                if (ditVar.c.g().J()) {
                    return;
                }
                ex exVar = (ex) dbtyVar2.a();
                Bundle bundle = new Bundle();
                arLauncherParams2.q(bundle);
                ditVar.f(arLauncherParams2.a()).n(bundle, obj);
                exVar.B(bundle);
                exVar.e(ditVar.c.g(), gfu.DIALOG_FRAGMENT.c);
            }
        });
    }

    public final void e(int i) {
        Toast.makeText(this.c, i, 1).show();
    }

    public final <T> czl<T> f(czh czhVar) {
        dzsj<czl<?>> dzsjVar = this.C.get(czhVar);
        dbsk.s(dzsjVar);
        return (czl<T>) dzsjVar.a();
    }
}
