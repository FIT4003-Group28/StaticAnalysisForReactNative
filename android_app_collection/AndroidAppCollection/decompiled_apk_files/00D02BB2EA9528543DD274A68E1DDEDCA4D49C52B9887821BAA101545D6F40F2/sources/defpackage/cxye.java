package defpackage;

import com.google.android.libraries.social.populous.Autocompletion;
import com.google.android.libraries.social.populous.Group;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ContactMethodField;
import com.google.android.libraries.social.populous.core.InAppNotificationTarget;
import com.google.android.libraries.social.populous.core.Loggable;
import com.google.android.libraries.social.populous.core.SessionContext;
import com.google.android.libraries.social.populous.logging.LogEntity;
import com.google.android.libraries.social.populous.logging.LogEvent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: cxye  reason: default package */
/* loaded from: classes5.dex */
public class cxye {
    public final ClientConfigInternal a;
    protected final boolean b;
    @dzsi
    public cyua c;
    public cypd d;
    public cyph e;
    @dzsi
    public dehn<cyti> f;
    @dzsi
    public cycl<dbsg<cyqe>> g;
    @dzsi
    public cxyg h;
    protected final cypb i;
    public final HashMap<String, String> j;
    public final List<cxyp> k;
    @dzsi
    public cytq l;
    public final cygq m;
    public Long n;
    public long o;
    public long p;
    public long q;
    public boolean r;
    public boolean s;
    public Integer t;
    protected final Random u;
    protected final cyfq v;
    @dzsi
    public dbty<cyei> w;
    private final cyac x;
    private final cyem<cyth> y;
    private final Executor z;

    /* JADX INFO: Access modifiers changed from: protected */
    public cxye(ClientConfigInternal clientConfigInternal, cyac cyacVar, Executor executor, @dzsi SessionContext sessionContext, cypb cypbVar, boolean z) {
        Long l;
        Random random = new Random();
        cyfs cyfsVar = cyfs.b;
        this.j = new HashMap<>();
        this.t = null;
        this.a = clientConfigInternal;
        this.c = null;
        this.x = cyacVar;
        this.k = d();
        this.d = null;
        this.e = null;
        this.r = false;
        this.z = executor;
        this.w = null;
        this.y = new cyem(this) { // from class: cxxy
            private final cxye a;

            {
                this.a = this;
            }

            @Override // defpackage.cyem
            public final void a(Object obj) {
                this.a.a((cyth) obj);
            }
        };
        this.i = cypbVar;
        this.t = cypbVar.a;
        this.h = null;
        this.b = z;
        this.u = random;
        this.v = cyfsVar;
        this.o = (sessionContext == null || (l = sessionContext.f) == null) ? ((cyab) cyacVar).a.nextLong() : l.longValue();
        this.p = cyacVar.a();
        cygq f = SessionContext.f();
        this.m = f;
        if (sessionContext != null) {
            f.e.addAll(sessionContext.d());
            f.b.addAll(sessionContext.a());
            f.c.addAll(sessionContext.b());
            f.d.addAll(sessionContext.c());
            Long l2 = sessionContext.f;
            cygq.g(l2);
            f.f = l2;
            dbsg<czgq> e = sessionContext.e();
            if (e != null) {
                ((cybs) f).a = e;
            } else {
                throw new NullPointerException("Null entryPoint");
            }
        }
        p(null, 0, false);
    }

    private final cyoz r(ContactMethodField contactMethodField) {
        cyoz w;
        LogEntity logEntity = this.i.get(contactMethodField.k());
        if (logEntity != null) {
            w = logEntity.r();
        } else {
            w = LogEntity.w(contactMethodField, dbsj.e(this.j.get(contactMethodField.k())));
        }
        w.h(contactMethodField.b().k);
        w.o(contactMethodField.b().j);
        return w;
    }

    private final cyoz s(Group group) {
        cyoz y;
        LogEntity logEntity = this.i.get(group.a());
        if (logEntity != null) {
            y = logEntity.r();
        } else {
            y = LogEntity.y(group.c(), group.f());
        }
        y.o(group.c().f());
        return y;
    }

    private final void t(String str, @dzsi Loggable loggable) {
        if (this.r) {
            if (!h() ? !this.c.h.D : !this.a.D) {
                throw new cxxm(str);
            }
            if (!dybl.a.a().a()) {
                return;
            }
            Long l = null;
            if (loggable instanceof ContactMethodField) {
                ContactMethodField contactMethodField = (ContactMethodField) loggable;
                if (contactMethodField.b() != null) {
                    l = contactMethodField.b().g();
                }
            } else if (loggable instanceof Group) {
                Group group = (Group) loggable;
                if (group.c() != null) {
                    l = Long.valueOf(group.c().c());
                }
            }
            cyph cyphVar = this.e;
            cyoq a = cyor.a();
            a.d = m();
            a.a = l;
            a.b = Long.valueOf(this.p);
            a.c = Long.valueOf(this.o);
            cypg.c(cyphVar, 33, 13, a.a());
        }
    }

    private final dbsg<cyqe> u() {
        cycl<dbsg<cyqe>> cyclVar;
        if (this.b && dyaz.e() && (cyclVar = this.g) != null) {
            dbsg<dbsg<cyqe>> c = cyclVar.c();
            if (c.a()) {
                return c.b();
            }
        }
        return dbpy.a;
    }

    private static final List<ContactMethodField> v(ContactMethodField contactMethodField) {
        cyep SA = contactMethodField.SA();
        if (SA == cyep.IN_APP_NOTIFICATION_TARGET || SA == cyep.IN_APP_EMAIL || SA == cyep.IN_APP_PHONE || SA == cyep.IN_APP_GAIA) {
            InAppNotificationTarget j = contactMethodField.j();
            dccx dccxVar = new dccx();
            dccxVar.g(j);
            dccxVar.i(j.d());
            return dccxVar.f();
        }
        return dcdc.e();
    }

    private static final <T extends cyft> boolean w(List<T> list) {
        for (T t : list) {
            if (!t.b().n.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(final cyth cythVar) {
        final Autocompletion[] autocompletionArr;
        ContactMethodField[] e;
        cxyo cxyoVar;
        dsia dsiaVar;
        if (cythVar.l() == 3 || cythVar.l() == 4) {
            this.t = cythVar.i();
            this.n = cythVar.g();
            this.i.a = this.t;
        }
        int i = 2;
        if (cythVar.b().a()) {
            cyts b = cythVar.b().b();
            String str = cythVar.f().b;
            long j = cythVar.f().c;
            long c = cythVar.f().c();
            cyor cyorVar = cythVar.f().k;
            dbtp b2 = this.e.b();
            cxyo c2 = cxyo.c(h() ? this.a : this.c.h, str, j);
            autocompletionArr = new Autocompletion[b.b.size()];
            int i2 = 0;
            while (i2 < b.b.size()) {
                cywm cywmVar = b.b.get(i2);
                try {
                    Autocompletion b3 = c2.b(cywmVar);
                    autocompletionArr[i2] = b3;
                    if (b3.d() == i) {
                        ContactMethodField[] e2 = autocompletionArr[i2].e();
                        int length = e2.length;
                        int i3 = 0;
                        while (i3 < length) {
                            ContactMethodField contactMethodField = e2[i3];
                            cyoz w = LogEntity.w(contactMethodField, autocompletionArr[i2].b().q());
                            dsgk dsgkVar = cywmVar.a;
                            int i4 = length;
                            cxyo cxyoVar2 = c2;
                            if (dsgkVar.a == 1) {
                                dsiaVar = (dsia) dsgkVar.b;
                            } else {
                                dsiaVar = dsia.e;
                            }
                            dsgd dsgdVar = dsiaVar.b;
                            if (dsgdVar == null) {
                                dsgdVar = dsgd.d;
                            }
                            w.p(dsgdVar.b.J());
                            w.t(cyfa.a(b.e));
                            w.u(cyfa.a(b.e));
                            w.k(w(autocompletionArr[i2].b().b()));
                            w.l(w(v(contactMethodField)));
                            w.f(c >= 0 ? Integer.valueOf(decl.b(TimeUnit.NANOSECONDS.toMicros(c))) : null);
                            LogEntity s = w.s();
                            if (contactMethodField.b().h().booleanValue()) {
                                this.i.put(contactMethodField.k(), s);
                            } else {
                                this.i.putIfAbsent(contactMethodField.k(), s);
                            }
                            i3++;
                            length = i4;
                            c2 = cxyoVar2;
                        }
                        cxyoVar = c2;
                    } else {
                        cxyoVar = c2;
                        if (autocompletionArr[i2].d() == 3) {
                            Group c3 = autocompletionArr[i2].c();
                            cyoz y = LogEntity.y(c3.c(), c3.f());
                            y.p("");
                            y.t(cyfa.a(b.e));
                            y.u(cyfa.a(b.e));
                            y.f(c >= 0 ? Integer.valueOf(decl.b(TimeUnit.NANOSECONDS.toMicros(c))) : null);
                            this.i.putIfAbsent(c3.a(), y.s());
                        }
                    }
                } catch (IllegalStateException unused) {
                    cxyoVar = c2;
                    cypg.c(this.e, 27, 8, this.l.k);
                }
                i2++;
                c2 = cxyoVar;
                i = 2;
            }
            cypg.a(this.e, 58, b2, cyorVar);
        } else {
            dcdc<cyvs> a = cythVar.a();
            String str2 = cythVar.f().b;
            long j2 = cythVar.f().c;
            long c4 = cythVar.f().c();
            cyor cyorVar2 = cythVar.f().k;
            dbtp b4 = this.e.b();
            cxyo c5 = cxyo.c(h() ? this.a : this.c.h, str2, j2);
            autocompletionArr = new Autocompletion[a.size()];
            for (int i5 = 0; i5 < a.size(); i5++) {
                cyvs cyvsVar = a.get(i5);
                Autocompletion a2 = c5.a(cyvsVar);
                autocompletionArr[i5] = a2;
                if (a2.d() == 2) {
                    for (ContactMethodField contactMethodField2 : autocompletionArr[i5].e()) {
                        cyoz w2 = LogEntity.w(contactMethodField2, autocompletionArr[i5].b().q());
                        w2.p(cyvsVar.n);
                        w2.q(cyvsVar.e());
                        w2.k(w(autocompletionArr[i5].b().b()));
                        w2.l(w(v(contactMethodField2)));
                        w2.f(c4 >= 0 ? Integer.valueOf(decl.b(TimeUnit.NANOSECONDS.toMicros(c4))) : null);
                        LogEntity s2 = w2.s();
                        if (contactMethodField2.b().h().booleanValue()) {
                            this.i.put(contactMethodField2.k(), s2);
                        } else {
                            this.i.putIfAbsent(contactMethodField2.k(), s2);
                        }
                    }
                } else if (autocompletionArr[i5].d() == 3) {
                    Group c6 = autocompletionArr[i5].c();
                    cyoz y2 = LogEntity.y(c6.c(), c6.f());
                    y2.p(cyvsVar.n);
                    y2.q(cyvsVar.e());
                    y2.f(c4 >= 0 ? Integer.valueOf(decl.b(TimeUnit.NANOSECONDS.toMicros(c4))) : null);
                    this.i.putIfAbsent(cyvsVar.h(), y2.s());
                }
            }
            cypg.a(this.e, 58, b4, cyorVar2);
        }
        cxyg cxygVar = this.h;
        if (cxygVar != null) {
            synchronized (cxygVar.a) {
                if (cxygVar.f == cythVar.f()) {
                    cxygVar.c.h(autocompletionArr);
                    if (cythVar.h()) {
                        cxygVar.f = null;
                        cxygVar.d = cxygVar.c.f();
                        cxygVar.e = cxygVar.b.a();
                        cxygVar.h = 2;
                    }
                }
            }
        }
        this.z.execute(new Runnable(this, cythVar, autocompletionArr) { // from class: cxxz
            private final cxye a;
            private final cyth b;
            private final Autocompletion[] c;

            {
                this.a = this;
                this.b = cythVar;
                this.c = autocompletionArr;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final cxye cxyeVar = this.a;
                final cyth cythVar2 = this.b;
                final Autocompletion[] autocompletionArr2 = this.c;
                final cytq f = cythVar2.f();
                cyfp cyfpVar = null;
                if (cythVar2.h() && f.l) {
                    try {
                        cyfpVar = cxyeVar.v.b();
                    } catch (IllegalStateException unused2) {
                    }
                }
                final cyfp cyfpVar2 = cyfpVar;
                cyvc cyvcVar = f.p;
                cyvcVar.e(new Runnable(cxyeVar, f, autocompletionArr2, cythVar2, cyfpVar2) { // from class: cxyb
                    private final cxye a;
                    private final cytq b;
                    private final Autocompletion[] c;
                    private final cyth d;
                    private final cyfp e;

                    {
                        this.a = cxyeVar;
                        this.b = f;
                        this.c = autocompletionArr2;
                        this.d = cythVar2;
                        this.e = cyfpVar2;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cxye cxyeVar2 = this.a;
                        cytq cytqVar = this.b;
                        Autocompletion[] autocompletionArr3 = this.c;
                        cyth cythVar3 = this.d;
                        cxyeVar2.c(cytqVar, autocompletionArr3.length, cythVar3, this.e);
                        cxyeVar2.b(autocompletionArr3, cythVar3);
                    }
                });
                cyvcVar.d(new Runnable(cxyeVar, cyfpVar2, f) { // from class: cxyc
                    private final cxye a;
                    private final cyfp b;
                    private final cytq c;

                    {
                        this.a = cxyeVar;
                        this.b = cyfpVar2;
                        this.c = f;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cxye cxyeVar2 = this.a;
                        cyfp cyfpVar3 = this.b;
                        cytq cytqVar = this.c;
                        if (cyfpVar3 == null || cyfpVar3.a == -1) {
                            return;
                        }
                        cypg.b(cxyeVar2.e, dbsj.d(cytqVar.b) ? cytqVar.p.b() ? 10 : 5 : cytqVar.p.b() ? 9 : 4, cyfpVar3.a(), cyfpVar3.b(), cytqVar.k);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(Autocompletion[] autocompletionArr, cyth cythVar) {
        synchronized (this.k) {
            cythVar.f().c();
            cxyh cxyhVar = new cxyh(cythVar);
            for (cxyp cxypVar : this.k) {
                cxypVar.a(autocompletionArr, cxyhVar);
            }
        }
    }

    public final void c(cytq cytqVar, int i, cyth cythVar, cyfp cyfpVar) {
        int i2 = cythVar.c() != null ? 4 : i == 0 ? 3 : 2;
        int d = cythVar.d();
        dbty<cyei> dbtyVar = this.w;
        int a = dbtyVar != null ? cxyq.a(dbtyVar.a().d) : 1;
        Integer m = m();
        int l = cythVar.l();
        int i3 = cytqVar.s;
        if (i3 == 0) {
            return;
        }
        cyph cyphVar = cytqVar.j;
        cype h = cypf.h();
        cyoo cyooVar = (cyoo) h;
        cyooVar.a = cytqVar.m;
        cyooVar.b = Integer.valueOf(d);
        h.b(i);
        h.c(cytqVar.t);
        h.d(a);
        h.e(l);
        cyooVar.c = cyfpVar;
        cypf a2 = h.a();
        Integer valueOf = Integer.valueOf(cytqVar.b.length());
        cyoq b = cytqVar.k.b();
        b.d = m;
        cypg.g(cyphVar, i3, i2, a2, valueOf, b.a());
    }

    protected <T> List<T> d() {
        return new ArrayList();
    }

    public void e(String str) {
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f(String str, boolean z) {
        String e = dbsj.e(str);
        p(e, e.trim().isEmpty() ? 6 : 7, z);
        dehn<cyti> dehnVar = this.f;
        if (dehnVar != null) {
            deha.q(dehnVar, new cxyd(this, this.l), dege.a);
            return;
        }
        cytq cytqVar = this.l;
        if (this.h != null && "".equals(cytqVar.b)) {
            cxyg cxygVar = this.h;
            cxygVar.a();
            dcdc<Autocompletion> dcdcVar = cxygVar.d;
            if (!dcdcVar.isEmpty()) {
                final Autocompletion[] autocompletionArr = (Autocompletion[]) dcdcVar.toArray(new Autocompletion[0]);
                cxyg cxygVar2 = this.h;
                Long n = n();
                cytg cytgVar = cxygVar2.g;
                ((cytc) cytgVar).c = n;
                cytgVar.g(cytqVar);
                final cyth a = cytgVar.a();
                c(cytqVar, autocompletionArr.length, a, null);
                this.z.execute(new Runnable(this, autocompletionArr, a) { // from class: cxya
                    private final cxye a;
                    private final Autocompletion[] b;
                    private final cyth c;

                    {
                        this.a = this;
                        this.b = autocompletionArr;
                        this.c = a;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b(this.b, this.c);
                    }
                });
                return;
            }
        }
        this.c.a(this.l);
    }

    public final void g(cxyp cxypVar) {
        if (cxypVar != null) {
            synchronized (this.k) {
                this.k.add(cxypVar);
            }
        }
    }

    public final boolean h() {
        return this.b || dyaz.d();
    }

    public final dcdc<LogEntity> i(Loggable[] loggableArr) {
        dccx F = dcdc.F();
        for (int i = 0; i < loggableArr.length; i++) {
            Loggable loggable = loggableArr[i];
            if (loggable != null) {
                if (loggable instanceof ContactMethodField) {
                    cyoz r = r((ContactMethodField) loggable);
                    r.o(i);
                    r.h(0);
                    F.g(r.s());
                }
                if (dybo.a.a().b()) {
                    Loggable loggable2 = loggableArr[i];
                    if (loggable2 instanceof Group) {
                        cyoz s = s((Group) loggable2);
                        s.o(i);
                        s.h(0);
                        F.g(s.s());
                    }
                }
            } else {
                throw new IllegalArgumentException("Illegal empty string as recipient.");
            }
        }
        return F.f();
    }

    public final void j(Loggable loggable) {
        t("Cannot call reportDisplay after close an AutocompleteSession.", loggable);
        dbsk.t(loggable, "The display is a required parameter.");
        if (loggable instanceof ContactMethodField) {
            ContactMethodField contactMethodField = (ContactMethodField) loggable;
            dbsk.t(contactMethodField.b(), "The resultField must have valid Metadata.");
            if (contactMethodField.b().c()) {
                return;
            }
            q(2, contactMethodField.b().f(), contactMethodField.b().g(), dcdc.f(r(contactMethodField).s()));
        } else if (!(loggable instanceof Group)) {
        } else {
            Group group = (Group) loggable;
            dbsk.t(group.c(), "The group must have valid Metadata.");
            q(2, group.c().d(), Long.valueOf(group.c().c()), dcdc.f(s(group).s()));
        }
    }

    public final void k(Loggable loggable) {
        t("Cannot call reportSelection after close an AutocompleteSession.", loggable);
        dbsk.t(loggable, "deselection is a required parameter.");
        if (loggable instanceof ContactMethodField) {
            ContactMethodField contactMethodField = (ContactMethodField) loggable;
            synchronized (this.m) {
                cygq cygqVar = this.m;
                dbsk.t(contactMethodField, "field is a required parameter");
                Iterator<ContactMethodField> it = cygqVar.b.iterator();
                while (it.hasNext()) {
                    if (it.next().k().equals(contactMethodField.k())) {
                        it.remove();
                    }
                }
            }
        }
    }

    public final void l(Loggable loggable) {
        t("Cannot call reportSelection after close an AutocompleteSession.", loggable);
        dbsk.t(loggable, "selection is a required parameter.");
        if (loggable instanceof ContactMethodField) {
            ContactMethodField contactMethodField = (ContactMethodField) loggable;
            dbsk.t(contactMethodField.b(), "contactMethodField must have valid Metadata.");
            if (contactMethodField.b().c()) {
                return;
            }
            LogEntity s = r(contactMethodField).s();
            q(3, contactMethodField.b().f(), contactMethodField.b().g(), dcdc.f(s));
            cyep SA = contactMethodField.SA();
            if (SA == cyep.IN_APP_NOTIFICATION_TARGET || SA == cyep.IN_APP_EMAIL || SA == cyep.IN_APP_PHONE || SA == cyep.IN_APP_GAIA) {
                cyoq a = cyor.a();
                a.d = m();
                a.a = contactMethodField.b().g();
                a.b = Long.valueOf(this.p);
                a.c = Long.valueOf(this.o);
                cyor a2 = a.a();
                if (s.l()) {
                    this.e.c(20, a2);
                } else if (s.m()) {
                    this.e.c(19, a2);
                }
            }
            this.p = this.x.a();
            synchronized (this.m) {
                cygq cygqVar = this.m;
                dbsk.t(contactMethodField, "field is a required parameter");
                cygqVar.b.add(contactMethodField);
            }
        } else if (!(loggable instanceof Group)) {
        } else {
            Group group = (Group) loggable;
            dbsk.t(group.c(), "group must have valid Metadata.");
            q(3, group.c().d(), Long.valueOf(group.c().c()), dcdc.f(s(group).s()));
            if (!dybo.a.a().a()) {
                return;
            }
            this.p = this.x.a();
        }
    }

    @dzsi
    final Integer m() {
        dbsg<cyqe> u = u();
        if (u.a()) {
            dudy dudyVar = u.b().d;
            if (dudyVar != null && (dudyVar.a & 1) != 0) {
                return Integer.valueOf(dudyVar.b);
            }
            return null;
        }
        return this.t;
    }

    @dzsi
    public Long n() {
        dbsg<cyqe> u = u();
        return u.a() ? Long.valueOf(u.b().b) : this.n;
    }

    public final void o(int i, Loggable[] loggableArr) {
        if (!this.r) {
            this.r = true;
            cyph cyphVar = this.e;
            cyoq a = cyor.a();
            a.d = m();
            a.b = Long.valueOf(this.p);
            a.c = Long.valueOf(this.o);
            cypg.f(cyphVar, 4, 0, null, a.a());
            int i2 = i - 1;
            if (i2 == 0) {
                q(6, null, null, i(loggableArr));
                return;
            } else if (i2 != 2) {
                q(4, null, null, i(loggableArr));
                return;
            } else {
                q(5, null, null, dcdc.e());
                return;
            }
        }
        throw new cxzr();
    }

    public final void p(@dzsi String str, @dzsi int i, boolean z) {
        cytq cytqVar = this.l;
        if (cytqVar != null) {
            cytqVar.p.a();
            this.l = null;
        }
        long andIncrement = ((cyab) this.x).b.getAndIncrement();
        this.q = andIncrement;
        if (str != null) {
            SessionContext f = this.m.f();
            cyem<cyth> cyemVar = this.y;
            ClientConfigInternal clientConfigInternal = h() ? this.a : this.c.h;
            dbty<cyei> dbtyVar = this.w;
            int a = dbtyVar != null ? cxyq.a(dbtyVar.a().d) : 1;
            cyph cyphVar = this.e;
            cyoq a2 = cyor.a();
            a2.d = m();
            a2.b = Long.valueOf(this.p);
            a2.c = Long.valueOf(this.o);
            cytq cytqVar2 = new cytq(str, andIncrement, f, cyemVar, clientConfigInternal, a, cyphVar, z, a2.a());
            this.l = cytqVar2;
            if (i != 0) {
                cytqVar2.s = i;
                cytqVar2.m = cypg.f(cytqVar2.j, i, 1, Integer.valueOf(cytqVar2.b.length()), cytqVar2.k);
            }
            cxyg cxygVar = this.h;
            if (cxygVar == null) {
                return;
            }
            cytq cytqVar3 = this.l;
            synchronized (cxygVar.a) {
                if ("".equals(cytqVar3.b)) {
                    cxygVar.a();
                    if (cxygVar.h != 2) {
                        cxygVar.f = cytqVar3;
                        cxygVar.c = dcdc.F();
                    }
                }
            }
        }
    }

    public final void q(int i, @dzsi String str, @dzsi Long l, List<LogEntity> list) {
        cyoz r;
        cypc j = LogEvent.j();
        j.g(i);
        cyoi cyoiVar = (cyoi) j;
        cyoiVar.a = l;
        j.e(this.p);
        j.f(this.o);
        j.d(str == null ? 0 : str.length());
        j.c(dcdc.r(list));
        cyoiVar.b = n();
        j.b(this.s);
        cyoiVar.c = m();
        LogEvent a = j.a();
        cypd cypdVar = this.d;
        cyot cyotVar = cypdVar.b;
        int i2 = a.i();
        int i3 = i2 - 1;
        if (i2 != 0) {
            switch (i3) {
                case 1:
                    ArrayList arrayList = new ArrayList(a.e());
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        LogEntity logEntity = (LogEntity) arrayList.get(i4);
                        if (dcft.j(logEntity.a(), cyoy.a) || logEntity.u()) {
                            r = logEntity.r();
                        } else {
                            r = LogEntity.v();
                            r.g(logEntity.s());
                            r.h(logEntity.f());
                            r.r(logEntity.b());
                            r.q(logEntity.a());
                            r.o(logEntity.e());
                        }
                        if (a.d() > 0) {
                            r.o(-1);
                            r.h(-1);
                        }
                        arrayList.set(i4, r.s());
                    }
                    cypc j2 = LogEvent.j();
                    j2.g(a.i());
                    cyoi cyoiVar2 = (cyoi) j2;
                    cyoiVar2.a = a.a();
                    j2.e(a.b());
                    j2.f(a.c());
                    j2.d(a.d());
                    j2.c(dcdc.r(arrayList));
                    cyoiVar2.b = a.f();
                    j2.b(a.g());
                    cyoiVar2.c = a.h();
                    a = j2.a();
                    break;
                case 2:
                    if (a.e().size() != 1) {
                        int size = a.e().size();
                        StringBuilder sb = new StringBuilder(64);
                        sb.append("Only one is expected for the Click event, but it has ");
                        sb.append(size);
                        throw new IllegalArgumentException(sb.toString());
                    }
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    break;
                default:
                    String a2 = cyou.a(a.i());
                    StringBuilder sb2 = new StringBuilder(String.valueOf(a2).length() + 24);
                    sb2.append("Unsupported event type: ");
                    sb2.append(a2);
                    throw new IllegalArgumentException(sb2.toString());
            }
            if (a == null) {
                return;
            }
            cyoj cyojVar = (cyoj) cypdVar.a;
            cyojVar.a(a, true);
            cyojVar.a(a, false);
            return;
        }
        throw null;
    }
}
