package defpackage;
/* compiled from: PG */
/* renamed from: dki  reason: default package */
/* loaded from: classes6.dex */
public final class dki extends dkg {
    @dzsi
    public akqi a;
    private final dkh b;

    public dki(dkh dkhVar, cjqy cjqyVar, dbsg<cjqp> dbsgVar) {
        super(cjqyVar, dbsgVar);
        this.b = dkhVar;
    }

    @Override // defpackage.dkg
    @dzsi
    public final cjtd b(dfhp dfhpVar) {
        int a = dfhm.a(dfhpVar.b);
        if (a == 0) {
            a = 1;
        }
        if (a == 2 || a == 3) {
            if (this.b.a()) {
                return e(a == 2 ? dtxj.bJ : dtxj.bz, this.a);
            }
            return cjtd.a(dtxj.bz);
        }
        return null;
    }
}
