package defpackage;
/* compiled from: PG */
/* renamed from: dhec  reason: default package */
/* loaded from: classes6.dex */
public final class dhec extends dyyt<dhec> {
    public dhec(dyeu dyeuVar, dyet dyetVar) {
        super(dyeuVar, dyetVar);
    }

    @Override // defpackage.dyyv
    protected final /* bridge */ /* synthetic */ dyyv a(dyeu dyeuVar, dyet dyetVar) {
        return new dhec(dyeuVar, dyetVar);
    }

    public final dehn<dhdy> b(dhdw dhdwVar) {
        dyeu dyeuVar = this.a;
        dyib<dhdw, dhdy> dyibVar = dhed.a;
        if (dyibVar == null) {
            synchronized (dhed.class) {
                dyibVar = dhed.a;
                if (dyibVar == null) {
                    dyhx c = dyib.c();
                    c.c = dyhz.UNARY;
                    c.d = dyib.b("google.internal.people.v2.minimal.InternalPeopleMinimalService", "GetPeople");
                    c.e = true;
                    c.a = dyyq.b(dhdw.g);
                    c.b = dyyq.b(dhdy.b);
                    dyibVar = c.a();
                    dhed.a = dyibVar;
                }
            }
        }
        return dyzf.d(dyeuVar.a(dyibVar, this.b), dhdwVar);
    }

    public final dehn<dhet> c(dher dherVar) {
        dyeu dyeuVar = this.a;
        dyib<dher, dhet> dyibVar = dhed.b;
        if (dyibVar == null) {
            synchronized (dhed.class) {
                dyibVar = dhed.b;
                if (dyibVar == null) {
                    dyhx c = dyib.c();
                    c.c = dyhz.UNARY;
                    c.d = dyib.b("google.internal.people.v2.minimal.InternalPeopleMinimalService", "ListRankedTargets");
                    c.e = true;
                    c.a = dyyq.b(dher.g);
                    c.b = dyyq.b(dhet.d);
                    dyibVar = c.a();
                    dhed.b = dyibVar;
                }
            }
        }
        return dyzf.d(dyeuVar.a(dyibVar, this.b), dherVar);
    }

    public final dehn<dhep> d(dhek dhekVar) {
        dyeu dyeuVar = this.a;
        dyib<dhek, dhep> dyibVar = dhed.c;
        if (dyibVar == null) {
            synchronized (dhed.class) {
                dyibVar = dhed.c;
                if (dyibVar == null) {
                    dyhx c = dyib.c();
                    c.c = dyhz.UNARY;
                    c.d = dyib.b("google.internal.people.v2.minimal.InternalPeopleMinimalService", "ListPeopleByKnownId");
                    c.e = true;
                    c.a = dyyq.b(dhek.h);
                    c.b = dyyq.b(dhep.c);
                    dyibVar = c.a();
                    dhed.c = dyibVar;
                }
            }
        }
        return dyzf.d(dyeuVar.a(dyibVar, this.b), dhekVar);
    }
}
