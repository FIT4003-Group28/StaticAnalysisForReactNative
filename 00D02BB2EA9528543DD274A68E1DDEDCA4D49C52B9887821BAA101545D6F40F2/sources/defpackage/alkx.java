package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: alkx  reason: default package */
/* loaded from: classes2.dex */
public class alkx extends aljo<aktd, dmpn> implements alsi {
    private static final akra j = new akra(0, 0);
    private final Object c;
    protected final aloi d;
    protected final amkk e;
    private boolean f;
    private final akty g;
    @dzsi
    private volatile amkh h;
    @dzsi
    private volatile cjqm i;

    public alkx(aloi aloiVar, alkw alkwVar, amkk amkkVar, akty aktyVar, boolean z) {
        this(aloiVar, alkwVar, amkkVar, aktyVar, z, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean D(dmpn dmpnVar, alxa alxaVar, int i) {
        Object b;
        alxp g;
        int i2 = 0;
        while (true) {
            dmph dmphVar = dmpnVar.b;
            if (dmphVar == null) {
                dmphVar = dmph.f;
            }
            if (i2 >= dmphVar.b.size()) {
                return false;
            }
            dmph dmphVar2 = dmpnVar.b;
            if (dmphVar2 == null) {
                dmphVar2 = dmph.f;
            }
            dmpd dmpdVar = dmphVar2.b.get(i2);
            dsqv<dmpd, dmpz> dsqvVar = dmqa.d;
            dmpdVar.f(dsqvVar);
            Object l = dmpdVar.V.l(dsqvVar.d);
            if (l == null) {
                b = dsqvVar.b;
            } else {
                b = dsqvVar.b(l);
            }
            dmpz dmpzVar = (dmpz) b;
            if ((dmpzVar.a & 1) != 0) {
                g = alxaVar.h(dmpzVar.b);
            } else {
                int i3 = dmpdVar.a;
                if ((i3 & 4) != 0) {
                    g = alxaVar.f(dmpdVar.d);
                } else {
                    g = (i3 & 2) != 0 ? alxaVar.g(dmpdVar.c) : null;
                }
            }
            if (g != null && !g.equals(alxp.e)) {
                alxo c = g.c(i);
                if (!c.equals(alxo.c) && (c.b() || c.d())) {
                    break;
                }
            }
            i2++;
        }
        return true;
    }

    public boolean A() {
        boolean z;
        synchronized (this.c) {
            z = this.f;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean B() {
        return r(new Runnable(this) { // from class: alku
            private final alkx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean add;
                alkx alkxVar = this.a;
                aloi aloiVar = alkxVar.d;
                synchronized (aloiVar) {
                    if (alkxVar instanceof alks) {
                        add = aloiVar.f.add((alks) alkxVar);
                    } else {
                        add = aloiVar.c.add(alkxVar);
                    }
                }
                if (add) {
                    aloiVar.b(true);
                }
            }
        });
    }

    @Override // defpackage.akvu
    /* renamed from: C */
    public final dmpn k() {
        return this.e.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(boolean z) {
        synchronized (this.c) {
            this.f = z;
        }
    }

    public void F(alrv alrvVar, int i) {
    }

    @Override // defpackage.alsm
    public final dbsg<amkh> G() {
        return dbsg.j(this.h);
    }

    @Override // defpackage.alsm
    public final void H(@dzsi amkh amkhVar) {
        this.h = amkhVar;
    }

    @Override // defpackage.alsm
    public final void I(cjqm cjqmVar) {
        this.i = cjqmVar;
    }

    @Override // defpackage.aktd
    public synchronized boolean f() {
        return n();
    }

    @Override // defpackage.alaq
    public final dbsg<cjqm> g() {
        return dbsg.j(this.i);
    }

    @Override // defpackage.aktj
    public final void h() {
        this.g.f(this);
    }

    @Override // defpackage.aktj
    public final void i() {
        this.g.g(this);
    }

    @Override // defpackage.aktj
    public final void j() {
        this.g.e(this);
    }

    @Override // defpackage.alaq
    public akra l() {
        return j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aljo
    public final void o(aktn aktnVar) {
        p(aktnVar, this);
    }

    public void v() {
    }

    public void x() {
        B();
    }

    @Override // defpackage.alsl
    public void y() {
        r(new Runnable(this) { // from class: alkv
            private final alkx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                alkx alkxVar = this.a;
                alkxVar.d.a(alkxVar);
            }
        });
    }

    public void z() {
        synchronized (this) {
            this.b = true;
            u();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alkx(aloi aloiVar, alkw alkwVar, amkk amkkVar, akty aktyVar, boolean z, boolean z2) {
        super(null);
        final deig deigVar = null;
        this.c = new Object();
        this.d = aloiVar;
        this.f = z;
        this.e = amkkVar;
        this.g = aktyVar;
        if (z2) {
            dmpn a = amkkVar.a();
            int c = amkkVar.c();
            final alnc alncVar = (alnc) alkwVar;
            amlm amlmVar = alncVar.d;
            final ArrayList arrayList = new ArrayList(3);
            dmph dmphVar = a.b;
            alnc.a(amlmVar, c, dmphVar == null ? dmph.f : dmphVar, a, arrayList);
            dmph dmphVar2 = a.c;
            alnc.a(amlmVar, c, dmphVar2 == null ? dmph.f : dmphVar2, a, arrayList);
            if (!arrayList.isEmpty()) {
                deigVar = deig.d();
                alncVar.b.execute(new Runnable(alncVar, arrayList, deigVar) { // from class: almz
                    private final alnc a;
                    private final List b;
                    private final deig c;

                    {
                        this.a = alncVar;
                        this.b = arrayList;
                        this.c = deigVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        alnc alncVar2 = this.a;
                        List<alnb> list = this.b;
                        deig deigVar2 = this.c;
                        amky amkyVar = alncVar2.e;
                        alna alnaVar = new alna(alncVar2.b, deigVar2, list.size());
                        int i = 0;
                        for (alnb alnbVar : list) {
                            if (amkv.c(alnbVar.a, alnbVar.b, alnbVar.c, amkyVar, alncVar2.c, "prefetch", alnaVar) != null) {
                                i++;
                            }
                        }
                        for (int i2 = 0; i2 < i; i2++) {
                            alnaVar.a(alnc.a);
                        }
                    }
                });
            }
            if (deigVar != null) {
                deigVar.Pk(new Runnable(this) { // from class: alkt
                    private final alkx a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.s();
                    }
                }, dege.a);
            } else {
                this.a = true;
            }
        }
    }
}
