package defpackage;
/* compiled from: PG */
/* renamed from: dhfd  reason: default package */
/* loaded from: classes6.dex */
public final class dhfd extends dyyt<dhfd> {
    public dhfd(dyeu dyeuVar, dyet dyetVar) {
        super(dyeuVar, dyetVar);
    }

    @Override // defpackage.dyyv
    protected final /* bridge */ /* synthetic */ dyyv a(dyeu dyeuVar, dyet dyetVar) {
        return new dhfd(dyeuVar, dyetVar);
    }

    public final dehn<dheh> b(dhef dhefVar) {
        dyeu dyeuVar = this.a;
        dyib<dhef, dheh> dyibVar = dhfe.a;
        if (dyibVar == null) {
            synchronized (dhfe.class) {
                dyibVar = dhfe.a;
                if (dyibVar == null) {
                    dyhx c = dyib.c();
                    c.c = dyhz.UNARY;
                    c.d = dyib.b("google.internal.people.v2.minimal.PeopleApiAutocompleteMinimalService", "ListAutocompletions");
                    c.e = true;
                    c.a = dyyq.b(dhef.e);
                    c.b = dyyq.b(dheh.d);
                    dyibVar = c.a();
                    dhfe.a = dyibVar;
                }
            }
        }
        return dyzf.d(dyeuVar.a(dyibVar, this.b), dhefVar);
    }
}
