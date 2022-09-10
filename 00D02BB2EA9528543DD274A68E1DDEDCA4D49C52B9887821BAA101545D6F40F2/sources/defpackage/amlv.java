package defpackage;

import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: amlv  reason: default package */
/* loaded from: classes.dex */
public final class amlv extends amml implements altg {
    private final akty K;
    @dzsi
    private altf L;
    @dzsi
    private volatile amog M;
    private final Object N;
    private final Collection<alyh> O;
    @dzsi
    public altc a;
    final dbsl<dmpn> b;

    public amlv(bnsn bnsnVar, akzh akzhVar, anbe anbeVar, amox amoxVar, alvd alvdVar, int i, int i2, ammc ammcVar, bvkx bvkxVar, amoh amohVar, amco amcoVar, Executor executor, alyx alyxVar, amyj amyjVar, alyl alylVar, akty aktyVar, akrz akrzVar) {
        super(bnsnVar, akzhVar, akrw.a(akry.INDOOR), alylVar, anbeVar, amoxVar, new amlu(alvdVar, alyxVar), null, i, true, i2, i2, false, true, ammcVar, bvkxVar, amohVar, amcoVar, executor, null, null, amyjVar, null, null, akrzVar);
        this.M = null;
        this.N = new Object();
        this.O = dchl.a();
        this.b = new dbsl(this) { // from class: amlt
            private final amlv a;

            {
                this.a = this;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                Object b;
                amlv amlvVar = this.a;
                dmpn dmpnVar = (dmpn) obj;
                dsqv<dmpn, dmjo> dsqvVar = dmnl.M;
                dmpnVar.f(dsqvVar);
                if (dmpnVar.V.k(dsqvVar.d) && !akxf.n(dmpnVar)) {
                    dsqv<dmpn, dmjo> dsqvVar2 = dmnl.M;
                    dmpnVar.f(dsqvVar2);
                    Object l = dmpnVar.V.l(dsqvVar2.d);
                    if (l == null) {
                        b = dsqvVar2.b;
                    } else {
                        b = dsqvVar2.b(l);
                    }
                    for (dmjm dmjmVar : ((dmjo) b).a) {
                        akqh a = akqh.a(dmjmVar.b);
                        altc altcVar = amlvVar.a;
                        if (altcVar != null && a != null && altcVar.b(a)) {
                            return false;
                        }
                    }
                    return true;
                }
                return false;
            }
        };
        this.K = aktyVar;
    }

    @Override // defpackage.altg
    public final void a(altc altcVar) {
        if (this.L == null) {
            return;
        }
        synchronized (this.N) {
            this.a = altcVar;
            altf altfVar = this.L;
            synchronized (altfVar.c) {
                altfVar.b = altcVar;
            }
            altfVar.a = true;
        }
        this.B.q();
    }

    @Override // defpackage.amml, defpackage.amlq
    public final void e(amxf amxfVar, boolean z, alwn alwnVar) {
        if (x() == amxfVar && this.h.g == alwnVar) {
            return;
        }
        super.e(amxfVar, z, alwnVar);
        this.M = null;
    }

    @Override // defpackage.amml, defpackage.amlq
    public final void f() {
        super.f();
        this.K.i(this.b);
    }

    @Override // defpackage.amml, defpackage.amlq
    public final void j() {
        super.j();
        this.K.j(this.b);
    }

    @Override // defpackage.amml
    public final amml m(alyl alylVar, amco amcoVar) {
        amox a = this.h.a(alylVar, amcoVar);
        bnsn bnsnVar = this.B;
        akzh akzhVar = this.I;
        anbe anbeVar = this.g;
        amlu amluVar = (amlu) this.s;
        return new amlv(bnsnVar, akzhVar, anbeVar, a, amluVar.a, this.k, this.c, this.z, this.A, this.E, amcoVar, this.D, amluVar.b, this.J, alylVar, this.K, this.H);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amml
    public final void n(alvb alvbVar) {
        this.L = (altf) alvbVar;
        super.n(alvbVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amml
    @dzsi
    public final amqn o(alyh alyhVar, long j) {
        amog amogVar;
        amqn o = super.o(alyhVar, j);
        if (o == null || !o.l()) {
            if (this.M == null && (amogVar = this.h.e) != null) {
                amob amobVar = (amob) amogVar;
                this.M = amog.f(akrw.a(akry.BASE), amobVar.b, amobVar.d, amobVar.c, amobVar.e);
            }
            return this.h.b(alyhVar, j, this.M);
        }
        return o;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.amml
    public final boolean p(Collection<alyh> collection, int i, akra akraVar, long j, Set<amqn> set) {
        altu a;
        this.O.clear();
        altf altfVar = this.L;
        if (altfVar != null) {
            Collection<alyh> collection2 = this.O;
            synchronized (altfVar.d) {
                collection2.clear();
                collection2.addAll(altfVar.d.c);
            }
        }
        collection.addAll(this.O);
        boolean p = super.p(collection, i, akraVar, j, set);
        synchronized (this.N) {
            if (this.a != null) {
                synchronized (this.N) {
                    altc altcVar = this.a;
                    a = altcVar.a(altcVar.a);
                }
                for (amqn amqnVar : set) {
                    altv altvVar = amqnVar.n().d;
                    if (altvVar != null) {
                        ((amps) amqnVar).b(a == null ? false : a.b().equals(altvVar.a));
                    }
                }
            }
        }
        return p;
    }

    @Override // defpackage.amml
    protected final void q(Set<alyh> set) {
        altf altfVar = this.L;
        if (altfVar == null) {
            return;
        }
        synchronized (altfVar.d) {
            set.clear();
            set.addAll(altfVar.d.d);
        }
    }
}
