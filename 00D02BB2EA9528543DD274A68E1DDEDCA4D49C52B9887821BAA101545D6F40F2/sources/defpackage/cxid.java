package defpackage;
/* compiled from: PG */
/* renamed from: cxid  reason: default package */
/* loaded from: classes5.dex */
public final class cxid implements cxhm {
    public final Object a;
    public volatile cxic b;
    public final cxil c;
    public final cqat d;
    private dehn<Void> e;
    private final degn f;
    private final long g;
    private final long h;

    public cxid(cxil cxilVar, cxgq cxgqVar) {
        this.a = new Object();
        this.e = deha.a(null);
        this.c = cxilVar;
        this.h = 0L;
        this.g = -1L;
        this.d = null;
        this.f = g(cxgqVar);
    }

    public static <T> dehn<Void> c(dehn<T> dehnVar) {
        return dbae.b(dehnVar, cxhr.a, dege.a);
    }

    private static degn g(cxgq cxgqVar) {
        if (cxgqVar.e()) {
            return degn.a();
        }
        return null;
    }

    @Override // defpackage.cxhm
    public final dehn<cxhl> a() {
        dehn e;
        dehn dehnVar;
        if (!f()) {
            dehnVar = deha.a(dsld.IN_MEMORY_CACHE);
        } else {
            synchronized (this.a) {
                if (!f()) {
                    e = deha.a(dsld.IN_MEMORY_CACHE);
                } else {
                    e = e(new deff(this) { // from class: cxhn
                        private final cxid a;

                        {
                            this.a = this;
                        }

                        @Override // defpackage.deff
                        public final dehn a() {
                            final cxid cxidVar = this.a;
                            if (cxidVar.f()) {
                                return cxidVar.d(dbac.b(dbae.b(deha.a(dbpy.a), cxhx.a, dege.a)).d(Exception.class, new defg(cxidVar) { // from class: cxhy
                                    private final cxid a;

                                    {
                                        this.a = cxidVar;
                                    }

                                    @Override // defpackage.defg
                                    public final dehn a(Object obj) {
                                        Exception exc = (Exception) obj;
                                        return this.a.b(cxik.EMPTY_CACHE);
                                    }
                                }, dege.a).e(new defg(cxidVar) { // from class: cxhz
                                    private final cxid a;

                                    {
                                        this.a = cxidVar;
                                    }

                                    @Override // defpackage.defg
                                    public final dehn a(Object obj) {
                                        cxid cxidVar2 = this.a;
                                        cxhl cxhlVar = (cxhl) obj;
                                        if (cxhlVar == null) {
                                            return cxidVar2.b(cxik.EMPTY_CACHE);
                                        }
                                        return deha.a(cxhlVar);
                                    }
                                }, dege.a));
                            }
                            return deha.a(dsld.IN_MEMORY_CACHE);
                        }
                    });
                }
            }
            dehnVar = e;
        }
        return dbae.b(dehnVar, new dbrn(this) { // from class: cxht
            private final cxid a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return cxhl.c(((cxhj) this.a.b).a, (dsld) obj);
            }
        }, dege.a);
    }

    public final dehn<cxhl> b(cxik cxikVar) {
        return dbac.b(this.c.a(cxikVar)).f(cxia.a, dege.a).e(new defg(this) { // from class: cxib
            private final cxid a;

            {
                this.a = this;
            }

            @Override // defpackage.defg
            public final dehn a(Object obj) {
                cxhl cxhlVar = (cxhl) obj;
                cxhlVar.a();
                return dbae.b(cxie.a(), new dbrn(cxhlVar) { // from class: cxho
                    private final cxhl a;

                    {
                        this.a = cxhlVar;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj2) {
                        Void r2 = (Void) obj2;
                        return this.a;
                    }
                }, dege.a);
            }
        }, dege.a);
    }

    public final dehn<dsld> d(dehn<cxhl> dehnVar) {
        return dbae.b(dehnVar, new dbrn(this) { // from class: cxhs
            private final cxid a;

            {
                this.a = this;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                cxid cxidVar = this.a;
                cxhl cxhlVar = (cxhl) obj;
                cxidVar.b = cxic.c(cxhlVar.a(), cxidVar.d);
                return cxhlVar.b();
            }
        }, dege.a);
    }

    public final <T> dehn<T> e(deff<T> deffVar) {
        degn degnVar = this.f;
        if (degnVar != null) {
            return degnVar.b(deffVar, dege.a);
        }
        dehn<T> a = dbae.f(this.e).a.a(dazv.f(deffVar), dege.a);
        this.e = c(a);
        return a;
    }

    public final boolean f() {
        if (this.b == null) {
            return true;
        }
        if (this.g == -1) {
            return false;
        }
        long e = this.d.e() - ((cxhj) this.b).b;
        long j = this.g;
        return e > j || j - e < this.h;
    }

    public cxid(cxil cxilVar, cqat cqatVar, long j, long j2, cxgq cxgqVar) {
        this.a = new Object();
        this.e = deha.a(null);
        boolean z = true;
        dbsk.a(j > 0);
        dbsk.a((j2 <= 0 || j2 > j) ? false : z);
        this.c = cxilVar;
        dbsk.s(cqatVar);
        this.d = cqatVar;
        this.g = j;
        this.h = j2;
        this.f = g(cxgqVar);
    }
}
