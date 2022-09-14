package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: awvi  reason: default package */
/* loaded from: classes.dex */
public final class awvi extends itb implements awwq {
    public static final dcqe a = dcqe.c("awvi");
    private static final dcep<awwm> f = dcep.C(awwm.LOGIN_STATUS_EVENT, awwm.USER_DATA_UPDATE);
    private static final dcep<awwm> g = dcep.C(awwm.CAMERA_CHANGE, awwm.LOCATION_CHANGE);
    public final dxio<awun> b;
    @dzsi
    public Set<awvv<?>> d;
    @dzsi
    public awvh e;
    private final dxio<awvy> h;
    private final dxio<axbd> i;
    private final dxio<awux> j;
    private final dxio<awva> k;
    private final dxio<awup> o;
    private final dehq p;
    @dzsi
    private bvpj<dhjx> r;
    @dzsi
    private bvpj<awwb> s;
    @dzsi
    private ScheduledFuture<?> t;
    private final Set<awwn> q = new aih();
    public final awwo c = awwp.c();
    private boolean u = false;
    private boolean v = false;

    public awvi(dxio<awvy> dxioVar, dxio<axbd> dxioVar2, dxio<awux> dxioVar3, dxio<awva> dxioVar4, dxio<awup> dxioVar5, dxio<awun> dxioVar6, dehq dehqVar) {
        this.h = dxioVar;
        this.i = dxioVar2;
        this.j = dxioVar3;
        this.k = dxioVar4;
        this.o = dxioVar5;
        this.b = dxioVar6;
        this.p = dehqVar;
    }

    private final void q() {
        this.j.a().b();
        awva a2 = this.k.a();
        a2.c.a(a2.i);
        ahtf ahtfVar = a2.d;
        if (ahtfVar != null) {
            ahtfVar.c();
            a2.d = null;
        }
        synchronized (a2) {
            a2.f = null;
            a2.g = null;
        }
        a2.e = false;
        a2.h = null;
        this.b.a().b();
        synchronized (this) {
            bvpj<dhjx> bvpjVar = this.r;
            if (bvpjVar != null) {
                bvpjVar.c();
            }
            bvpj<awwb> bvpjVar2 = this.s;
            if (bvpjVar2 != null) {
                bvpjVar2.c();
            }
            this.d = null;
            this.e = null;
        }
    }

    @Override // defpackage.itb
    public final void Nu() {
        awup a2 = this.o.a();
        if (a2.e) {
            a2.a.a().C().c(a2.f);
            a2.c = false;
            a2.d = null;
        }
        synchronized (this) {
            bvpj<awwb> bvpjVar = this.s;
            if (bvpjVar != null) {
                bvpjVar.c();
            }
            if (!this.q.isEmpty()) {
                for (awwn awwnVar : this.q) {
                }
                this.q.clear();
                q();
            }
            l();
        }
        super.Nu();
    }

    @Override // defpackage.awwq
    public final void e(@dzsi Runnable runnable) {
        this.i.a().c(runnable);
    }

    @Override // defpackage.awwq
    public final void f(awwn awwnVar) {
        synchronized (this) {
            if (this.q.contains(awwnVar)) {
                return;
            }
            boolean isEmpty = this.q.isEmpty();
            if (isEmpty) {
                this.i.a().c(null);
                this.j.a().a(new Runnable(this) { // from class: awvc
                    private final awvi a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.m(awwm.CAMERA_CHANGE);
                    }
                });
                awva a2 = this.k.a();
                a2.h = new dbsz(this) { // from class: awvd
                    private final awvi a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.dbsz
                    public final void NU(Object obj) {
                        this.a.m((awwm) obj);
                    }
                };
                btrm btrmVar = a2.c;
                awuy awuyVar = a2.i;
                dceq a3 = dcet.a();
                a3.b(amqo.class, new awvb(amqo.class, awuyVar));
                btrmVar.g(awuyVar, a3.a());
                ahtf b = a2.b.b(new awuz(a2));
                a2.d = b;
                int j = a2.a.a().j();
                if (j > 0) {
                    b.b(j);
                }
                b.a();
                if (!this.o.a().e) {
                    awup a4 = this.o.a();
                    Runnable runnable = new Runnable(this) { // from class: awve
                        private final awvi a;

                        {
                            this.a = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.m(awwm.LOGIN_STATUS_EVENT);
                        }
                    };
                    if (!a4.e) {
                        a4.d = runnable;
                        if (a4.a.a().C().k()) {
                            a4.a(btlu.q(a4.a.a().C().l()));
                        }
                        a4.a.a().C().d(a4.f, a4.b);
                        a4.e = true;
                    }
                }
            }
            synchronized (this) {
                this.q.add(awwnVar);
            }
            m(awwm.NEW_LISTENER_REGISTERED);
        }
    }

    @Override // defpackage.awwq
    public final synchronized void i(awwn awwnVar) {
        if (!this.q.remove(awwnVar) || !this.q.isEmpty()) {
            return;
        }
        q();
    }

    @Override // defpackage.awwq
    public final void j(awwm awwmVar) {
        m(awwmVar);
    }

    @Override // defpackage.awwq
    public final synchronized void k() {
        if (this.u) {
            return;
        }
        this.u = true;
        this.t = this.p.d(new Runnable(this) { // from class: awvf
            private final awvi a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                awvi awviVar = this.a;
                bvoo.h("Passive Assist request batching threshold reached.", new Object[0]);
                awviVar.l();
            }
        }, 1000L, TimeUnit.MILLISECONDS);
    }

    @Override // defpackage.awwq
    public final synchronized void l() {
        if (!this.u) {
            return;
        }
        this.u = false;
        ScheduledFuture<?> scheduledFuture = this.t;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        if (!this.v) {
            return;
        }
        m(awwm.BATCHED_REQUEST);
        this.v = false;
    }

    public final synchronized void m(final awwm awwmVar) {
        if (awwmVar.equals(awwm.USER_BLOCKING)) {
            this.i.a().e(dcdc.f(awvv.J));
        }
        if (f.contains(awwmVar)) {
            this.c.c(true);
        }
        if (g.contains(awwmVar)) {
            this.c.b(true);
        }
        if (this.u) {
            this.v = true;
        } else if (!this.k.a().e || !this.o.a().c) {
            boolean z = this.k.a().e;
            boolean z2 = this.o.a().c;
        } else {
            bvpj<dhjx> bvpjVar = this.r;
            if (bvpjVar != null) {
                bvpjVar.c();
            }
            final bvpj<dhjx> b = bvpj.b(new dbsz(this, awwmVar) { // from class: awvg
                private final awvi a;
                private final awwm b;

                {
                    this.a = this;
                    this.b = awwmVar;
                }

                @Override // defpackage.dbsz
                public final void NU(Object obj) {
                    this.a.p((dhjx) obj);
                }
            });
            final awux a2 = this.j.a();
            a2.j = null;
            a2.d.execute(new Runnable(a2, b) { // from class: awur
                private final awux a;
                private final dbsz b;

                {
                    this.a = a2;
                    this.b = b;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    final awux awuxVar = this.a;
                    dbsz<dhjx> dbszVar = this.b;
                    if (awuxVar.b.a().i() || !awuxVar.h) {
                        awuxVar.j = new awuw(false, dbszVar);
                        awuxVar.d();
                        return;
                    }
                    alad a3 = awuxVar.a.a();
                    if (awuxVar.a.b()) {
                        GmmLocation a4 = awuxVar.c.a().a();
                        if (a4 != null) {
                            awuxVar.e(awuxVar.c(a4), dbszVar);
                            awuxVar.h = false;
                            return;
                        }
                        awuxVar.j = new awuw(true, dbszVar);
                        awuxVar.d();
                        deha.q(awuxVar.f.a().a(), bvqj.b(new bvqg(awuxVar) { // from class: awus
                            private final awux a;

                            {
                                this.a = awuxVar;
                            }

                            @Override // defpackage.bvqg
                            public final void NU(Object obj) {
                                awux awuxVar2 = this.a;
                                GmmLocation gmmLocation = (GmmLocation) obj;
                                if (awuxVar2.j == null || !awuxVar2.j.a) {
                                    return;
                                }
                                dbsz<dhjx> dbszVar2 = awuxVar2.j.b;
                                awuxVar2.j = null;
                                awuxVar2.e(awuxVar2.c(gmmLocation), dbszVar2);
                            }
                        }), dege.a);
                        return;
                    }
                    awuxVar.e(a3, dbszVar);
                    awuxVar.h = false;
                }
            });
            this.r = b;
        }
    }

    public final synchronized void n(awvh awvhVar) {
        this.b.a().b();
        bvpj<awwb> bvpjVar = this.s;
        if (bvpjVar != null) {
            bvpjVar.c();
        }
        this.d = awvhVar.a.d().b();
        bvpj<awwb> b = bvpj.b(awvhVar);
        this.s = b;
        this.h.a().c(awvhVar.a, b, bvrj.UI_THREAD);
    }

    @Override // defpackage.awwq
    public final void o(acxq acxqVar) {
        boolean z = this.k.a().e;
        boolean z2 = this.j.a().l;
        boolean d = this.i.a().d();
        acxc acxcVar = (acxc) acxqVar.a.aq;
        if (acxcVar.l()) {
            bvmo.g.c(ckfh.d);
            ((ckhe) acxcVar.a.a(ckfh.j)).a();
            if (d) {
                ((ckhe) acxcVar.a.a(ckfh.i)).d();
            } else {
                ((ckhe) acxcVar.a.a(ckfh.i)).a();
            }
            if (z) {
                ((ckhe) acxcVar.a.a(ckfh.g)).d();
            } else {
                ((ckhe) acxcVar.a.a(ckfh.g)).a();
            }
            if (z2) {
                ((ckhe) acxcVar.a.a(ckfh.h)).d();
            } else {
                ((ckhe) acxcVar.a.a(ckfh.h)).a();
            }
        }
    }

    public final synchronized void p(dhjx dhjxVar) {
        dccx dccxVar;
        akqi s;
        if (this.q.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (awwn awwnVar : this.q) {
            awwt a2 = awwnVar.a();
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        aih aihVar = new aih();
        aih aihVar2 = new aih();
        ArrayList arrayList2 = new ArrayList();
        final ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        dccx dccxVar2 = new dccx();
        akqi akqiVar = akqi.a;
        Iterator it = arrayList.iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (it.hasNext()) {
            awwt awwtVar = (awwt) it.next();
            Iterator it2 = it;
            if (awwtVar.a().size() != 1) {
                dccxVar = dccxVar2;
                bvoo.h("PassiveAssist consumers should set exactly one surface_id in RequestOptions", new Object[0]);
            } else {
                dccxVar = dccxVar2;
            }
            aihVar.addAll(awwtVar.a());
            aihVar2.addAll(awwtVar.b());
            arrayList2.addAll(awwtVar.c());
            Runnable j = awwtVar.j();
            if (j != null) {
                arrayList3.add(j);
            }
            arrayList4.addAll(awwtVar.n());
            arrayList5.addAll(awwtVar.o());
            z |= awwtVar.d();
            z2 |= awwtVar.k();
            z3 |= awwtVar.l();
            z4 |= awwtVar.m();
            i = Math.max(i, awwtVar.h());
            i2 = Math.max(i2, awwtVar.i());
            i3 = Math.max(i3, awwtVar.e());
            i4 = Math.max(i4, awwtVar.f());
            i5 = Math.max(i5, awwtVar.g());
            i6 = Math.max(i6, awwtVar.p());
            i7 = Math.max(i7, awwtVar.q());
            if (akqi.d(awwtVar.s())) {
                if (!akqi.d(akqiVar) || akqiVar.equals(awwtVar.s())) {
                    s = awwtVar.s();
                } else {
                    s = akqi.a;
                    bvoo.h("Unable to merge FeatureIds [%s], [%s] in RequestOptions.", s, awwtVar.s());
                }
                akqiVar = s;
            }
            dccxVar2 = dccxVar;
            dccxVar2.i(awwtVar.r());
            it = it2;
        }
        dccx dccxVar3 = dccxVar2;
        int i8 = i2;
        int i9 = i3;
        int i10 = i7;
        int i11 = i4;
        int i12 = i5;
        akqi akqiVar2 = akqiVar;
        int i13 = i6;
        awws u = awwt.u();
        u.t(new ArrayList(aihVar));
        u.d(aihVar2);
        u.n(arrayList2);
        boolean z5 = true;
        u.h(true == z);
        u.s(true == z2);
        u.p(true == z3);
        if (true != z4) {
            z5 = false;
        }
        u.o(z5);
        u.b(i);
        u.c(i8);
        u.l(i9);
        u.k(i11);
        u.i(i12);
        u.m(i13);
        u.j(i10);
        u.g(akqiVar2);
        u.f(dccxVar3.f());
        if (!arrayList3.isEmpty()) {
            ((awvt) u).a = new Runnable(arrayList3) { // from class: awwr
                private final List a;

                {
                    this.a = arrayList3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    for (Runnable runnable : this.a) {
                        runnable.run();
                    }
                }
            };
        }
        if (!arrayList4.isEmpty()) {
            u.q(arrayList4);
        }
        if (!arrayList5.isEmpty()) {
            u.r(arrayList5);
        }
        awwt a3 = u.a();
        if (a3.b().isEmpty() && a3.c().isEmpty()) {
            return;
        }
        awvw f2 = awvx.f();
        f2.b(dhjxVar);
        f2.e(a3);
        GmmLocation a4 = this.k.a().a();
        if (a4 != null) {
            f2.d(a4);
        }
        awvh awvhVar = new awvh(this, dcdc.r(this.q), f2.a());
        Set<awvv<?>> set = this.d;
        if (set == null || !dcnm.p(a3.b(), set).isEmpty()) {
            n(awvhVar);
        } else {
            this.e = awvhVar;
        }
    }
}
