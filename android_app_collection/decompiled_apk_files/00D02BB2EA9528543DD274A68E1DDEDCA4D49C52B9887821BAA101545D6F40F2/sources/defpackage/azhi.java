package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: azhi  reason: default package */
/* loaded from: classes3.dex */
public final class azhi {
    public final bati G;
    @dzsi
    public volatile azhf I;
    public final buyg K;
    private final azgu L;
    private final aznd M;
    private final azni N;
    private final azpr O;
    private final azqq P;
    private final azkv Q;
    private final azig R;
    private final azic S;
    private final azly T;
    private final azpg U;
    public final azof a;
    public final azks b;
    public final btrm c;
    public final Application d;
    public final azhj e;
    public final anhk f;
    public final btxv g;
    public final cqat h;
    public final akfa i;
    public final ckcw j;
    public final bvrb k;
    public final batm l;
    public final azgr m;
    public final azmz n;
    public final aznh o;
    public final azpq p;
    public final azps q;
    public final azqn r;
    public final azku s;
    public final azif t;
    public final azib u;
    public final azlx v;
    public final azpd w;
    public final dxio<axwp> x;
    public final dxio<btpc> y;
    public final Object z = new Object();
    public final Object A = new Object();
    public btlu F = btlu.a;
    public deig<Boolean> H = deig.d();
    @dzsi
    public BroadcastReceiver J = null;
    public final AtomicLong E = new AtomicLong(Long.MIN_VALUE);
    public final Map<azhh, bvpk> B = new HashMap();
    public final Set<Long> C = Collections.synchronizedSet(new HashSet());
    public final ConcurrentMap<Long, axxd> D = new ConcurrentHashMap();

    public azhi(azof azofVar, azks azksVar, anhk anhkVar, btrm btrmVar, Application application, buyg buygVar, azhj azhjVar, btxv btxvVar, cqat cqatVar, bvrb bvrbVar, batm batmVar, akfa akfaVar, ckcw ckcwVar, bati batiVar, azgr azgrVar, azgu azguVar, azmz azmzVar, aznd azndVar, aznh aznhVar, azni azniVar, azpq azpqVar, azpr azprVar, azps azpsVar, azqn azqnVar, azqq azqqVar, azku azkuVar, azkv azkvVar, azif azifVar, azig azigVar, azib azibVar, azic azicVar, azlx azlxVar, azly azlyVar, azpd azpdVar, azpg azpgVar, dxio dxioVar, dxio dxioVar2) {
        this.a = azofVar;
        this.b = azksVar;
        this.f = anhkVar;
        this.c = btrmVar;
        this.d = application;
        this.K = buygVar;
        this.e = azhjVar;
        this.g = btxvVar;
        this.h = cqatVar;
        this.k = bvrbVar;
        this.l = batmVar;
        this.i = akfaVar;
        this.j = ckcwVar;
        this.G = batiVar;
        this.m = azgrVar;
        this.L = azguVar;
        this.n = azmzVar;
        this.M = azndVar;
        this.o = aznhVar;
        this.N = azniVar;
        this.p = azpqVar;
        this.O = azprVar;
        this.q = azpsVar;
        this.r = azqnVar;
        this.P = azqqVar;
        this.s = azkuVar;
        this.Q = azkvVar;
        this.t = azifVar;
        this.R = azigVar;
        this.u = azibVar;
        this.S = azicVar;
        this.v = azlxVar;
        this.T = azlyVar;
        this.w = azpdVar;
        this.U = azpgVar;
        this.x = dxioVar;
        this.y = dxioVar2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.k.b(new Runnable(this) { // from class: azgx
            private final azhi a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azhi azhiVar = this.a;
                synchronized (azhiVar.A) {
                    if (!azhiVar.e.c()) {
                        return;
                    }
                    azhiVar.e.a();
                    if (azhiVar.e.b) {
                        azhiVar.i(azxm.n, azhiVar.e.d, null, true, 5);
                    }
                }
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(@dzsi final axxd axxdVar) {
        this.k.b(new Runnable(this, axxdVar) { // from class: azgy
            private final azhi a;
            private final axxd b;

            {
                this.a = this;
                this.b = axxdVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                azhi azhiVar = this.a;
                axxd axxdVar2 = this.b;
                synchronized (azhiVar.A) {
                    if (azhiVar.C.isEmpty()) {
                        azhiVar.i(azxm.n, 0L, axxdVar2, false, 4);
                        return;
                    }
                    if (axxdVar2 != null) {
                        axxdVar2.a(false);
                    }
                }
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        try {
            return this.a.m() != null;
        } catch (axxc unused) {
            return false;
        }
    }

    public final void d() {
        synchronized (this.A) {
            for (bvpk bvpkVar : this.B.values()) {
                bvpkVar.b();
            }
            this.B.clear();
        }
    }

    public final void e() {
        d();
        this.e.a();
        if (!this.e.c() || !this.e.a) {
            return;
        }
        i(azxm.n, this.e.c, null, true, 3);
    }

    public final void f(@dzsi dxcq dxcqVar, dcep<azxm<?>> dcepVar, long j, long j2, btlu btluVar) {
        azrd azrdVar;
        Set set;
        azrd azrdVar2;
        boolean z;
        boolean f;
        boolean z2;
        dbsg dbsgVar;
        boolean z3;
        Iterator<doiz> it;
        djuj djujVar;
        bzoh bzohVar;
        bzok bzokVar;
        int a;
        int i;
        Set<Long> set2 = this.C;
        Long valueOf = Long.valueOf(j);
        if (!set2.contains(valueOf)) {
            return;
        }
        this.C.remove(valueOf);
        if (dxcqVar != null) {
            djuj djujVar2 = dxcqVar.b;
            if (djujVar2 == null) {
                djujVar2 = djuj.e;
            }
            int a2 = dnsl.a(djujVar2.d);
            if (a2 == 0 || a2 == 1) {
                if (!this.i.j().equals(btluVar)) {
                    return;
                }
                azhg azhgVar = new azhg();
                synchronized (this.z) {
                    Long h = h();
                    if (h == null || h.longValue() < j) {
                        try {
                            azhg azhgVar2 = new azhg();
                            djuj djujVar3 = dxcqVar.b;
                            if (djujVar3 == null) {
                                djujVar3 = djuj.e;
                            }
                            djuj djujVar4 = djujVar3;
                            ArrayList<doiz> arrayList = new ArrayList();
                            ArrayList<doiz> arrayList2 = new ArrayList();
                            ArrayList<doiz> arrayList3 = new ArrayList();
                            Iterator<doiz> it2 = djujVar4.b.iterator();
                            while (it2.hasNext()) {
                                doiz next = it2.next();
                                int i2 = next.b;
                                if (i2 == 10 || i2 == 2) {
                                    djujVar = djujVar4;
                                    it = it2;
                                    arrayList.add(next);
                                } else {
                                    if (i2 == 9) {
                                        try {
                                            azqq azqqVar = this.P;
                                            bati batiVar = this.G;
                                            dong dongVar = ((donk) next.c).a;
                                            if (dongVar == null) {
                                                dongVar = dong.d;
                                            }
                                            donf donfVar = dongVar.c;
                                            if (donfVar == null) {
                                                donfVar = donf.j;
                                            }
                                            if ((donfVar.a & 4) != 0) {
                                                auhi auhiVar = azqqVar.c;
                                                int i3 = dpyv.TRAFFIC_TO_PLACE.dm;
                                                it = it2;
                                                try {
                                                    donf donfVar2 = dongVar.c;
                                                    if (donfVar2 == null) {
                                                        donfVar2 = donf.j;
                                                    }
                                                    auhiVar.e(i3, donfVar2.d ? aufs.ENABLED : aufs.DISABLED);
                                                } catch (axxc unused) {
                                                    azhgVar2.b();
                                                    it2 = it;
                                                }
                                            } else {
                                                it = it2;
                                            }
                                            donf donfVar3 = dongVar.c;
                                            if (donfVar3 == null) {
                                                donfVar3 = donf.j;
                                            }
                                            if ((donfVar3.a & 8) != 0) {
                                                auhi auhiVar2 = azqqVar.c;
                                                int i4 = dpyv.TIME_TO_LEAVE.dm;
                                                donf donfVar4 = dongVar.c;
                                                if (donfVar4 == null) {
                                                    donfVar4 = donf.j;
                                                }
                                                auhiVar2.e(i4, donfVar4.e ? aufs.ENABLED : aufs.DISABLED);
                                            }
                                            donf donfVar5 = dongVar.c;
                                            if (donfVar5 == null) {
                                                donfVar5 = donf.j;
                                            }
                                            done doneVar = donfVar5.b;
                                            if (doneVar == null) {
                                                doneVar = done.e;
                                            }
                                            dbsg r = dcbg.b(doneVar.d).o(azqo.a).r(azqp.a);
                                            if (r.a()) {
                                                ckco ckcoVar = (ckco) azqqVar.d.a(ckeo.N);
                                                domy b = domy.b(((dond) r.b()).c);
                                                if (b == null) {
                                                    b = domy.UNKNOWN_TRAVEL_MODE;
                                                }
                                                ckcoVar.a(ckeo.a(b).h);
                                            }
                                            boolean f2 = azqqVar.a.f(azxm.d, azqqVar, next, j2, batiVar) | ((dongVar.a & 1) != 0 ? azqqVar.b.c(dongVar.b, 1) : false);
                                            azqqVar.a.o(azxl.USER_PARAMETERS, Long.valueOf(j2));
                                            azhgVar2.a(f2);
                                        } catch (axxc unused2) {
                                            it = it2;
                                        }
                                    } else {
                                        it = it2;
                                        if (i2 == 11) {
                                            try {
                                                azni azniVar = this.N;
                                                boolean f3 = azniVar.a.f(azxm.e, azniVar, next, j2, this.G);
                                                azniVar.a.o(azxl.STARRED_PLACE, Long.valueOf(j2));
                                                azhgVar2.a(f3);
                                            } catch (axxc unused3) {
                                                azhgVar2.b();
                                            }
                                        } else if (i2 == 15) {
                                            try {
                                                azkv azkvVar = this.Q;
                                                boolean f4 = azkvVar.a.f(azxm.c, azkvVar, next, j2, this.G);
                                                azkvVar.a.o(azxl.PARKING_LOCATION, Long.valueOf(j2));
                                                azhgVar2.a(f4);
                                            } catch (axxc unused4) {
                                                azhgVar2.b();
                                            }
                                        } else if (i2 == 13) {
                                            try {
                                                azpr azprVar = this.O;
                                                bati batiVar2 = this.G;
                                                long j3 = ((domq) next.c).b;
                                                azpp azppVar = azprVar.b;
                                                synchronized (azppVar) {
                                                    try {
                                                        bzok b2 = azppVar.b();
                                                        dsqp dsqpVar = (dsqp) b2.cu(5);
                                                        dsqpVar.bC(b2);
                                                        bzohVar = (bzoh) dsqpVar;
                                                        if (bzohVar.c) {
                                                            bzohVar.bF();
                                                            bzohVar.c = false;
                                                        }
                                                        bzokVar = (bzok) bzohVar.b;
                                                        bzok bzokVar2 = bzok.e;
                                                        djujVar = djujVar4;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        djujVar = djujVar4;
                                                    }
                                                    try {
                                                        bzokVar.a |= 2;
                                                        bzokVar.d = j3;
                                                        azppVar.c(bzohVar.bK());
                                                    } catch (Throwable th2) {
                                                        th = th2;
                                                        throw th;
                                                        break;
                                                    }
                                                }
                                                try {
                                                    boolean f5 = azprVar.a.f(azxm.f, azprVar, next, j2, batiVar2);
                                                    azprVar.a.o(azxl.TUTORIAL_HISTORY, Long.valueOf(j2));
                                                    azhgVar2.a(f5);
                                                } catch (axxc unused5) {
                                                    azhgVar2.b();
                                                    it2 = it;
                                                    djujVar4 = djujVar;
                                                }
                                            } catch (axxc unused6) {
                                                djujVar = djujVar4;
                                            }
                                        } else {
                                            djujVar = djujVar4;
                                            if (i2 == 14) {
                                                try {
                                                    azig azigVar = this.R;
                                                    bati batiVar3 = this.G;
                                                    for (dokm dokmVar : ((dokn) next.c).a) {
                                                        ckco ckcoVar2 = (ckco) azigVar.b.a(ckeo.e);
                                                        int a3 = dokk.a(dokmVar.a);
                                                        if (a3 == 0) {
                                                            a3 = 1;
                                                        }
                                                        int i5 = a3 - 1;
                                                        ckcoVar2.a(i5 != 1 ? i5 != 2 ? -1 : ckek.a(2) : ckek.a(1));
                                                    }
                                                    boolean f6 = azigVar.a.f(azxm.g, azigVar, next, j2, batiVar3);
                                                    azigVar.a.o(azxl.FREQUENT_TRIP, Long.valueOf(j2));
                                                    azhgVar2.a(f6);
                                                } catch (axxc unused7) {
                                                    azhgVar2.b();
                                                }
                                            } else if (i2 == 17) {
                                                try {
                                                    azic azicVar = this.S;
                                                    boolean f7 = azicVar.a.f(azxm.i, azicVar, next, j2, this.G);
                                                    azicVar.a.o(azxl.ELECTRIC_VEHICLE_PROFILE, Long.valueOf(j2));
                                                    azhgVar2.a(f7);
                                                } catch (axxc unused8) {
                                                    azhgVar2.b();
                                                }
                                            } else if (i2 == 18 || i2 == 19) {
                                                arrayList2.add(next);
                                            } else if (i2 == 16) {
                                                try {
                                                    azly azlyVar = this.T;
                                                    bati batiVar4 = this.G;
                                                    for (dohs dohsVar : ((doht) next.c).a) {
                                                        ckco ckcoVar3 = (ckco) azlyVar.b.a(ckdc.c);
                                                        int a4 = dohq.a(dohsVar.a);
                                                        if (a4 == 0) {
                                                            a4 = 1;
                                                        }
                                                        int i6 = a4 - 1;
                                                        if (i6 == 1) {
                                                            a = ckdb.a(2);
                                                        } else if (i6 != 2) {
                                                            i = ckdb.a(1);
                                                            ckcoVar3.a(i);
                                                        } else {
                                                            a = ckdb.a(3);
                                                        }
                                                        i = a;
                                                        ckcoVar3.a(i);
                                                    }
                                                    boolean f8 = azlyVar.a.f(azxm.h, azlyVar, next, j2, batiVar4);
                                                    azlyVar.a.o(azxl.PLACE_ALIAS, Long.valueOf(j2));
                                                    azhgVar2.a(f8);
                                                } catch (axxc unused9) {
                                                }
                                            } else if (i2 == 20 || i2 == 21) {
                                                arrayList3.add(next);
                                            }
                                        }
                                    }
                                    it2 = it;
                                }
                                it2 = it;
                                djujVar4 = djujVar;
                            }
                            djuj djujVar5 = djujVar4;
                            if (this.G.a.get()) {
                                throw new batj();
                            }
                            if (!arrayList.isEmpty()) {
                                azgu azguVar = this.L;
                                bati batiVar5 = this.G;
                                doiz doizVar = null;
                                doiz doizVar2 = null;
                                for (doiz doizVar3 : arrayList) {
                                    int i7 = doizVar3.b;
                                    if (i7 == 10) {
                                        doizVar2 = doizVar3;
                                    } else if (i7 == 2) {
                                        doizVar = doizVar3;
                                    }
                                }
                                if (doizVar2 != null && doizVar != null) {
                                    try {
                                        z3 = new azgt(azguVar).a.c.f(azxm.a, azgu.a, doizVar2, j2, batiVar5) | new azgs(azguVar).a.c.f(azxm.b, azgu.b, doizVar, j2, batiVar5);
                                        azof azofVar = azguVar.c;
                                        azxl azxlVar = azxl.CONTACT;
                                        Long valueOf2 = Long.valueOf(j2);
                                        azofVar.o(azxlVar, valueOf2);
                                        azguVar.c.o(azxl.CONTACT_ADDRESS, valueOf2);
                                    } catch (axxc unused10) {
                                    }
                                    azhgVar2.a(z3);
                                }
                                z3 = false;
                                azhgVar2.a(z3);
                            }
                            if (!arrayList2.isEmpty()) {
                                aznd azndVar = this.M;
                                azof a5 = azndVar.a.a();
                                aznd.a(a5, 1);
                                axwk a6 = azndVar.b.a();
                                aznd.a(a6, 2);
                                aznd.a(btluVar, 3);
                                aznc azncVar = new aznc(a5, a6, btluVar);
                                bati batiVar6 = this.G;
                                for (doiz doizVar4 : arrayList2) {
                                    int i8 = doizVar4.b;
                                    if (i8 == 18) {
                                        azncVar.d = doizVar4;
                                    } else if (i8 == 19) {
                                        azncVar.e = doizVar4;
                                    }
                                }
                                if (azncVar.d != null) {
                                    if (azncVar.e == null) {
                                        z2 = false;
                                        azrdVar = null;
                                    } else {
                                        try {
                                            HashMap hashMap = new HashMap();
                                            doiz doizVar5 = azncVar.d;
                                            dbsk.s(doizVar5);
                                            for (dojx dojxVar : doizVar5.f) {
                                                long j4 = dojxVar.b;
                                                String str = dojxVar.d;
                                                azxm<azxi> azxmVar = azxm.j;
                                                try {
                                                    aznp o = aznn.o(j4);
                                                    azwm e = azof.e(azxmVar, o);
                                                    if (e == null) {
                                                        azxl azxlVar2 = azxl.CONTACT;
                                                        dbsgVar = dbpy.a;
                                                    } else {
                                                        dbsgVar = dbsg.i(new azkt(e, o.e));
                                                    }
                                                } catch (azom e2) {
                                                    throw new axxc("Failed to retrieve item from database.", e2);
                                                } catch (IllegalArgumentException unused11) {
                                                    dbsgVar = dbpy.a;
                                                }
                                                if (dbsgVar.a()) {
                                                    azwl azwlVar = ((azxi) ((azkt) dbsgVar.b()).a).j;
                                                    dbsk.s(azwlVar);
                                                    hashMap.put(str, azwlVar.a);
                                                }
                                            }
                                            doiz doizVar6 = azncVar.d;
                                            dbsk.s(doizVar6);
                                            for (doip doipVar : (doizVar6.b == 18 ? (doiq) doizVar6.c : doiq.b).a) {
                                                dolo doloVar = doipVar.b;
                                                if (doloVar == null) {
                                                    doloVar = dolo.d;
                                                }
                                                dpot dpotVar = doloVar.b;
                                                if (dpotVar == null) {
                                                    dpotVar = dpot.m;
                                                }
                                                dpov dpovVar = dpotVar.b;
                                                if (dpovVar == null) {
                                                    dpovVar = dpov.f;
                                                }
                                                String str2 = dpovVar.b;
                                                azrdVar = null;
                                                try {
                                                    azxi azxiVar = (azxi) dcft.r(azof.q(azxm.j, str2), null);
                                                    if (azxiVar != null) {
                                                        azwl azwlVar2 = azxiVar.j;
                                                        dbsk.s(azwlVar2);
                                                        if (!str2.equals(azwlVar2.a)) {
                                                            azwl azwlVar3 = azxiVar.j;
                                                            dbsk.s(azwlVar3);
                                                            hashMap.put(str2, azwlVar3.a);
                                                        }
                                                    }
                                                } catch (axxc unused12) {
                                                }
                                            }
                                            azrdVar = null;
                                            azncVar.f = dcdn.r(hashMap);
                                            aznb aznbVar = new aznb(azncVar);
                                            doiz doizVar7 = azncVar.d;
                                            dbsk.s(doizVar7);
                                            boolean f9 = aznbVar.a.a.f(azxm.j, aznbVar, doizVar7, j2, batiVar6);
                                            if (f9 && doizVar7.g) {
                                                aznc azncVar2 = aznbVar.a;
                                                azncVar2.b.e(azncVar2.c);
                                                f9 = true;
                                            }
                                            azna aznaVar = new azna(azncVar);
                                            doiz doizVar8 = azncVar.e;
                                            dbsk.s(doizVar8);
                                            z2 = f9 | aznaVar.a.a.f(azxm.k, aznaVar, doizVar8, j2, batiVar6);
                                            azof azofVar2 = azncVar.a;
                                            azxl azxlVar3 = azxl.SAVES_LIST;
                                            Long valueOf3 = Long.valueOf(j2);
                                            azofVar2.o(azxlVar3, valueOf3);
                                            azncVar.a.o(azxl.SAVES_ITEM, valueOf3);
                                        } catch (axxc unused13) {
                                        }
                                    }
                                    azhgVar2.a(z2);
                                }
                                azrdVar = null;
                                z2 = false;
                                azhgVar2.a(z2);
                            } else {
                                azrdVar = null;
                            }
                            if (!arrayList3.isEmpty()) {
                                azpg azpgVar = this.U;
                                bati batiVar7 = this.G;
                                boolean z4 = false;
                                for (doiz doizVar9 : arrayList3) {
                                    int i9 = doizVar9.b;
                                    if (i9 == 20) {
                                        try {
                                            azpf azpfVar = new azpf(azpgVar);
                                            dbsk.s(doizVar9);
                                            f = azpfVar.a.c.f(azxm.l, azpg.a, doizVar9, j2, batiVar7);
                                        } catch (axxc unused14) {
                                        }
                                    } else if (i9 == 21) {
                                        azpe azpeVar = new azpe(azpgVar);
                                        dbsk.s(doizVar9);
                                        f = azpeVar.a.c.f(azxm.m, azpg.b, doizVar9, j2, batiVar7);
                                    } else {
                                        continue;
                                    }
                                    z4 |= f;
                                }
                                azof azofVar3 = azpgVar.c;
                                azxl azxlVar4 = azxl.TRIP;
                                Long valueOf4 = Long.valueOf(j2);
                                azofVar3.o(azxlVar4, valueOf4);
                                azpgVar.c.o(azxl.RESERVATION, valueOf4);
                                if (true == z4) {
                                    z = true;
                                    azhgVar2.a(z);
                                }
                                z = false;
                                azhgVar2.a(z);
                            }
                            if ((djujVar5.a & 1) != 0) {
                                dnwb dnwbVar = djujVar5.c;
                                if (dnwbVar == null) {
                                    dnwbVar = dnwb.i;
                                }
                                this.f.c(dnwbVar);
                            }
                            azks azksVar = this.b;
                            try {
                                set = (Set) azksVar.d.a(new azkq(azksVar, dxcqVar, this.G));
                            } catch (azom unused15) {
                                set = dcmr.a;
                            }
                            azrd azrdVar3 = !set.isEmpty() ? new azrd(true != c() ? 2 : 1, set) : azrdVar;
                            if (dcepVar.containsAll(azxm.n)) {
                                g(Long.valueOf(j));
                            }
                            this.H.j(true);
                            azrdVar2 = azrdVar3;
                            azhgVar = azhgVar2;
                        } catch (batj unused16) {
                            this.G.a();
                            if (!this.H.isDone()) {
                                this.H.j(false);
                            }
                            return;
                        }
                    } else {
                        azrdVar2 = null;
                    }
                    this.G.a();
                }
                if (azhgVar.a && !azhgVar.b) {
                    dcen N = dcep.N();
                    synchronized (this.z) {
                        try {
                            dcpd<azxm<?>> it3 = azxm.n.iterator();
                            while (it3.hasNext()) {
                                azxm<?> next2 = it3.next();
                                if (this.a.l(next2).b() != null) {
                                    N.b(next2);
                                }
                            }
                        } catch (axxc unused17) {
                        }
                    }
                    dcep<azxm<?>> f10 = N.f();
                    if (!f10.isEmpty()) {
                        i(f10, 0L, null, false, 7);
                    }
                }
                if (azhgVar.a || azrdVar2 != null) {
                    this.c.b(azrh.b(1));
                }
                if (azrdVar2 != null) {
                    this.c.b(azrdVar2);
                }
                boolean z5 = azhgVar.a;
                Iterator<Map.Entry<Long, axxd>> it4 = this.D.entrySet().iterator();
                while (it4.hasNext()) {
                    Map.Entry<Long, axxd> next3 = it4.next();
                    if (next3.getKey().longValue() <= j) {
                        next3.getValue().a(z5);
                        it4.remove();
                    }
                }
                return;
            }
        }
        if (dxcqVar == null) {
            return;
        }
        djuj djujVar6 = dxcqVar.b;
        if (djujVar6 == null) {
            djujVar6 = djuj.e;
        }
        int a7 = dnsl.a(djujVar6.d);
        int i10 = a7 == 0 ? 1 : a7;
        StringBuilder sb = new StringBuilder(27);
        sb.append("with statusCode ");
        sb.append(i10 - 1);
        sb.toString();
    }

    public final void g(@dzsi Long l) {
        try {
            try {
                aznn.g(new azoe(l));
            } catch (azom e) {
                throw new axxc("Failed to update last sync time.", e);
            }
        } catch (axxc unused) {
        }
    }

    @dzsi
    public final Long h() {
        try {
            Long m = this.a.m();
            if (m == null) {
                return null;
            }
            if (m.longValue() <= this.h.b()) {
                return m;
            }
            g(null);
            return null;
        } catch (axxc unused) {
            return null;
        }
    }

    public final void i(dcep<azxm<?>> dcepVar, long j, @dzsi axxd axxdVar, boolean z, int i) {
        synchronized (this.A) {
            azhh azhhVar = new azhh(this, dcepVar, z, i);
            bvpk a = bvpk.a(azhhVar);
            this.B.put(azhhVar, a);
            if (axxdVar != null) {
                this.D.put(Long.valueOf(this.h.b()), axxdVar);
            }
            this.k.a(a, bvrj.BACKGROUND_THREADPOOL, j);
        }
    }
}
