package defpackage;

import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.PersonFieldMetadata;
import com.google.android.libraries.social.populous.core.Photo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: cxzh  reason: default package */
/* loaded from: classes5.dex */
public final class cxzh {
    public final czar a;
    public final cyxc b;
    public final cyph c;
    public final dbty<cyei> d;
    public final dehp e;
    public final dbtp f;
    public final dbtp g;
    public final dbtp h;
    private final ClientConfigInternal i;
    private final czbj j;
    private final cxzy k;
    private final czct l;
    private final Object m = new Object();

    public cxzh(cyxc cyxcVar, czbj czbjVar, czar czarVar, ClientConfigInternal clientConfigInternal, dehp dehpVar, cyph cyphVar, dbrn<ClientConfigInternal, czct> dbrnVar, dbty<cyei> dbtyVar) {
        cyec e = clientConfigInternal.e();
        e.l(true);
        ClientConfigInternal b = e.b();
        this.i = b;
        this.b = cyxcVar;
        this.j = czbjVar;
        this.a = czarVar;
        this.c = cyphVar;
        this.l = dbrnVar.a(b);
        this.d = dbtyVar;
        this.e = dehpVar;
        this.k = cxzy.c(b, "", 0L);
        dbtp b2 = cyphVar.b();
        b2.e();
        this.f = b2;
        dbtp b3 = cyphVar.b();
        b3.e();
        this.g = b3;
        dbtp b4 = cyphVar.b();
        b4.e();
        this.h = b4;
    }

    public static final boolean f(cywi cywiVar, cxzw cxzwVar) {
        return !cxzwVar.a() || !cywiVar.c().isEmpty();
    }

    public final void a(dbtp dbtpVar) {
        synchronized (this.m) {
            if (!dbtpVar.a || dbtpVar.d(TimeUnit.MILLISECONDS) >= 500) {
                this.c.c(15, cyor.a);
            } else {
                cypg.a(this.c, 10, dbtpVar, cyor.a);
            }
            dbtpVar.e();
            dbtpVar.f();
        }
    }

    public final Map<cygg, Person> b(czbn czbnVar, cygf cygfVar, cxzw cxzwVar, cyxc cyxcVar) {
        HashMap hashMap = new HashMap();
        dcdc<czbm> a = czbnVar.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            czbm czbmVar = a.get(i);
            cyge c = cygg.c();
            c.c(cygfVar);
            c.b(czbmVar.a());
            cygg a2 = c.a();
            if (!hashMap.containsKey(a2)) {
                dcdc<String> b = czbmVar.b();
                int size2 = b.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    cywi cywiVar = czbnVar.b().get(b.get(i2));
                    cyxcVar.a(a2, cywiVar);
                    if (f(cywiVar, cxzwVar)) {
                        hashMap.put(a2, d(cywiVar, a2, cxzwVar));
                    }
                }
            }
        }
        return hashMap;
    }

    public final Map<cygg, Person> c(czav czavVar, cxzw cxzwVar, cyxc cyxcVar) {
        HashMap hashMap = new HashMap();
        dcdc<czau> a = czavVar.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            czau czauVar = a.get(i);
            cyge c = cygg.c();
            c.c(cygf.PROFILE_ID);
            c.b(czauVar.a());
            cygg a2 = c.a();
            if (!hashMap.containsKey(a2)) {
                cywi b = czauVar.b();
                cyxcVar.a(a2, b);
                if (f(b, cxzwVar)) {
                    hashMap.put(a2, d(b, a2, cxzwVar));
                }
            }
        }
        return hashMap;
    }

    public final Person d(cywi cywiVar, final cygg cyggVar, cxzw cxzwVar) {
        List<PersonFieldMetadata> k;
        int c = cxzwVar.c();
        int i = c - 1;
        if (c != 0) {
            if (i == 1 || i == 2) {
                cxzy cxzyVar = this.k;
                cyvs u = cywiVar.u(false);
                final int c2 = cxzwVar.c();
                this.l.a(dcdc.f(u), new cyvc(), cyggVar.a(), false);
                ArrayList c3 = dchl.c(dcft.i(u.a(), new dbsl(cyggVar, c2) { // from class: cxyt
                    private final cygg a;
                    private final int b;

                    {
                        this.a = cyggVar;
                        this.b = c2;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        cygg cyggVar2 = this.a;
                        int i2 = this.b;
                        cyvi cyviVar = (cyvi) obj;
                        int i3 = i2 - 1;
                        if (i2 != 0) {
                            return i3 != 1 ? i3 != 2 : !cyviVar.b().n.isEmpty() && cyviVar.a().e == cyggVar2.b();
                        }
                        throw null;
                    }
                }));
                dcdc e = e(c3, dcdc.e());
                ArrayList c4 = dchl.c(dcft.i(u.g(), new dbsl(c2) { // from class: cxyu
                    private final int a;

                    {
                        this.a = c2;
                    }

                    @Override // defpackage.dbsl
                    public final boolean a(Object obj) {
                        int i2 = this.a;
                        InAppNotificationTarget inAppNotificationTarget = (InAppNotificationTarget) obj;
                        int i3 = i2 - 1;
                        if (i2 != 0) {
                            if (i3 == 1) {
                                return false;
                            }
                            if (i3 == 2 && inAppNotificationTarget.b().n.isEmpty()) {
                                dcdc<ContactMethodField> d = inAppNotificationTarget.d();
                                int size = d.size();
                                int i4 = 0;
                                while (i4 < size) {
                                    int i5 = i4 + 1;
                                    if (d.get(i4).b().n.isEmpty()) {
                                        i4 = i5;
                                    }
                                }
                                return false;
                            }
                            return true;
                        }
                        throw null;
                    }
                }));
                dcdc e2 = e(c4, dcdc.e());
                if (!c3.isEmpty() || !c4.isEmpty()) {
                    k = dchl.k(dcdc.q(dcbg.d(c3, c4)), cxyv.a);
                } else {
                    k = dcdc.e();
                }
                dcdc e3 = e(u.k, k);
                if (dyan.a.a().a() && !e3.isEmpty() && !((Photo) e3.get(0)).d()) {
                    this.c.c(37, cyor.a);
                }
                cyvt a = cyvt.a();
                a.h(u);
                a.j = e;
                a.e = e3;
                a.d = e(u.d(), k);
                a.g = e2;
                cyvs b = a.b();
                if (!b.a().isEmpty() || !b.g().isEmpty()) {
                    if (!b.a().isEmpty()) {
                        this.c.c(14, cyor.a);
                        b.a().get(0).b().n = dcdc.e();
                    } else if (!b.g().isEmpty()) {
                        this.c.c(16, cyor.a);
                        b.g().get(0).b().n = dcdc.e();
                    }
                } else {
                    this.c.c(13, cyor.a);
                }
                return cxzyVar.a(b);
            }
            return this.k.a(cywiVar.u(false));
        }
        throw null;
    }

    final <T extends cyft> dcdc<T> e(Iterable<T> iterable, final List<PersonFieldMetadata> list) {
        if (dcft.w(iterable)) {
            return dcdc.e();
        }
        if (!list.isEmpty()) {
            iterable = dcft.i(iterable, new dbsl(this, list) { // from class: cxyw
                private final cxzh a;
                private final List b;

                {
                    this.a = this;
                    this.b = list;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    final cyft cyftVar = (cyft) obj;
                    return dcft.j(this.b, new dbsl(cyftVar) { // from class: cxyx
                        private final cyft a;

                        {
                            this.a = cyftVar;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj2) {
                            return ((PersonFieldMetadata) obj2).j(this.a.b());
                        }
                    });
                }
            });
        }
        if (dcft.w(iterable)) {
            return dcdc.e();
        }
        return dcdc.f((cyft) this.i.E.c.j(iterable));
    }

    public final void g(final List<cygg> list, final cygf cygfVar, final Object obj, final AtomicInteger atomicInteger, final cxzs cxzsVar, final cxzw cxzwVar, final int i, final int i2, final int i3, final dbtp dbtpVar, dbtp dbtpVar2) {
        dehn g;
        a(dbtpVar2);
        if (dyaw.f()) {
            czbj czbjVar = this.j;
            final List k = dchl.k(list, cxyy.a);
            final czbd czbdVar = (czbd) czbjVar;
            if (!cyui.a(czbdVar.a)) {
                czbk d = czbn.d();
                d.d(cyes.FAILED_NETWORK);
                g = deha.a(d.a());
            } else {
                g = deew.g(czbdVar.d, new defg(czbdVar, k, cygfVar) { // from class: czaw
                    private final czbd a;
                    private final List b;
                    private final cygf c;

                    {
                        this.a = czbdVar;
                        this.b = k;
                        this.c = cygfVar;
                    }

                    @Override // defpackage.defg
                    public final dehn a(Object obj2) {
                        final czbd czbdVar2 = this.a;
                        final List list2 = this.b;
                        final cygf cygfVar2 = this.c;
                        final cych cychVar = (cych) obj2;
                        if (czbdVar2.c.b() == null) {
                            return deha.b(new cylw());
                        }
                        dbtp b = czbdVar2.f.b();
                        dehn f = deha.f(new deff(czbdVar2, cygfVar2, list2, cychVar) { // from class: czax
                            private final czbd a;
                            private final cygf b;
                            private final List c;
                            private final cych d;

                            {
                                this.a = czbdVar2;
                                this.b = cygfVar2;
                                this.c = list2;
                                this.d = cychVar;
                            }

                            @Override // defpackage.deff
                            public final dehn a() {
                                czbd czbdVar3 = this.a;
                                cygf cygfVar3 = this.b;
                                List list3 = this.c;
                                cych cychVar2 = this.d;
                                cylx b2 = czbdVar3.c.b();
                                cykm bZ = cyko.c.bZ();
                                int a = czbi.a(cygfVar3);
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                ((cyko) bZ.b).a = cykn.a(a);
                                bZ.a(list3);
                                cylt e = cylu.e();
                                e.d(czbdVar3.g);
                                ((cyim) e).a = czbdVar3.e;
                                e.c(czbdVar3.c.a());
                                e.b(cychVar2);
                                return b2.f(bZ.bK(), e.a());
                            }
                        }, czbdVar2.b);
                        deha.q(f, new czbc(czbdVar2, b), czbdVar2.b);
                        return deee.g(deew.h(f, new dbrn(czbdVar2) { // from class: czay
                            private final czbd a;

                            {
                                this.a = czbdVar2;
                            }

                            @Override // defpackage.dbrn
                            public final Object a(Object obj3) {
                                return this.a.b((cykt) obj3);
                            }
                        }, czbdVar2.b), cylw.class, czaz.a, czbdVar2.b);
                    }
                }, czbdVar.b);
            }
            final dehn dehnVar = g;
            dehnVar.Pk(new Runnable(this, dehnVar, cygfVar, cxzwVar, list, obj, cxzsVar, atomicInteger, i, i2, i3, dbtpVar) { // from class: cxyz
                private final cxzh a;
                private final dehn b;
                private final cygf c;
                private final cxzw d;
                private final List e;
                private final Object f;
                private final cxzs g;
                private final AtomicInteger h;
                private final dbtp i;
                private final int j;
                private final int k;
                private final int l;

                {
                    this.a = this;
                    this.b = dehnVar;
                    this.c = cygfVar;
                    this.d = cxzwVar;
                    this.e = list;
                    this.f = obj;
                    this.g = cxzsVar;
                    this.h = atomicInteger;
                    this.j = i;
                    this.k = i2;
                    this.l = i3;
                    this.i = dbtpVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    czbn a;
                    cxzh cxzhVar = this.a;
                    dehn dehnVar2 = this.b;
                    cygf cygfVar2 = this.c;
                    cxzw cxzwVar2 = this.d;
                    List<cygg> list2 = this.e;
                    Object obj2 = this.f;
                    cxzs cxzsVar2 = this.g;
                    AtomicInteger atomicInteger2 = this.h;
                    int i4 = this.j;
                    int i5 = this.k;
                    int i6 = this.l;
                    dbtp dbtpVar3 = this.i;
                    try {
                        a = (czbn) deha.r(dehnVar2);
                    } catch (Throwable th) {
                        czbk d2 = czbn.d();
                        d2.d(cyet.a(th));
                        a = d2.a();
                    }
                    cxzhVar.h(list2, obj2, cxzsVar2, atomicInteger2, i4, i5, i6, dbtpVar3, a.c(), cxzhVar.b(a, cygfVar2, cxzwVar2, cxzhVar.b), cyer.PEOPLE_API_LIST_PEOPLE_BY_KNOWN_ID);
                }
            }, this.e);
            return;
        }
        czbj czbjVar2 = this.j;
        List k2 = dchl.k(list, cxza.a);
        cyem cyemVar = new cyem(this, cygfVar, cxzwVar, list, obj, cxzsVar, atomicInteger, i, i2, i3, dbtpVar) { // from class: cxzb
            private final cxzh a;
            private final cygf b;
            private final cxzw c;
            private final List d;
            private final Object e;
            private final cxzs f;
            private final AtomicInteger g;
            private final dbtp h;
            private final int i;
            private final int j;
            private final int k;

            {
                this.a = this;
                this.b = cygfVar;
                this.c = cxzwVar;
                this.d = list;
                this.e = obj;
                this.f = cxzsVar;
                this.g = atomicInteger;
                this.i = i;
                this.j = i2;
                this.k = i3;
                this.h = dbtpVar;
            }

            @Override // defpackage.cyem
            public final void a(Object obj2) {
                cxzh cxzhVar = this.a;
                cygf cygfVar2 = this.b;
                cxzw cxzwVar2 = this.c;
                czbn czbnVar = (czbn) obj2;
                cxzhVar.h(this.d, this.e, this.f, this.g, this.i, this.j, this.k, this.h, czbnVar.c(), cxzhVar.b(czbnVar, cygfVar2, cxzwVar2, cxzhVar.b), cyer.PEOPLE_API_LIST_PEOPLE_BY_KNOWN_ID);
            }
        };
        czbd czbdVar2 = (czbd) czbjVar2;
        if (!cyui.a(czbdVar2.a)) {
            czbk d2 = czbn.d();
            d2.d(cyes.FAILED_NETWORK);
            cyemVar.a(d2.a());
            return;
        }
        deha.q(czbdVar2.d, new czbb(czbdVar2, cyemVar, k2, cygfVar), dege.a);
    }

    public final void h(List<cygg> list, Object obj, cxzs cxzsVar, AtomicInteger atomicInteger, int i, int i2, int i3, dbtp dbtpVar, cyes cyesVar, final Map<cygg, Person> map, cyer cyerVar) {
        dcep<cygg> L = dcep.L(dcft.i(list, new dbsl(map) { // from class: cxzg
            private final Map a;

            {
                this.a = map;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj2) {
                return !this.a.containsKey((cygg) obj2);
            }
        }));
        cyfo<cygg> cyfoVar = this.b.b;
        for (cygg cyggVar : L) {
            cyfoVar.b.b(cyggVar, cyfo.a);
        }
        cydx c = cydx.c(cyerVar, cyesVar);
        this.c.d(i, map.size(), cyor.a);
        this.c.d(i2, L.size(), cyor.a);
        synchronized (obj) {
            int a = cxyq.a(this.d.a().d);
            cyph cyphVar = this.c;
            int i4 = c == null ? 2 : 4;
            cype h = cypf.h();
            h.c(i3);
            h.d(a);
            boolean z = true;
            ((cyoo) h).b = 1;
            h.b(map.size());
            ((cyoo) h).a = dbtpVar;
            h.e(6);
            cypg.g(cyphVar, 10, i4, h.a(), null, cyor.a);
            dcdn r = dcdn.r(map);
            cxzt f = cxzu.f();
            if (atomicInteger.decrementAndGet() != 0) {
                z = false;
            }
            f.c(z);
            f.b(c == null ? dcdc.e() : dcdc.f(c));
            ((cxxs) f).b = 2;
            f.d(L);
            ((cxxs) f).a = Integer.valueOf(list.size());
            cxzsVar.a(r, f.a());
        }
    }
}
