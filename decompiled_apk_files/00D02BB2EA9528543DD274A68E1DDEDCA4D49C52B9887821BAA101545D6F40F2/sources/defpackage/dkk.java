package defpackage;
/* compiled from: PG */
/* renamed from: dkk  reason: default package */
/* loaded from: classes6.dex */
public final class dkk extends dkg {
    private final dkh a;
    private final cjtd b;
    private final dbsg<cjtd> c;

    public dkk(dkh dkhVar, cjqy cjqyVar, dbsg<cjqp> dbsgVar, ddho ddhoVar, @dzsi akqi akqiVar) {
        super(cjqyVar, dbsgVar);
        this.a = dkhVar;
        this.b = cjtd.a(ddhoVar);
        this.c = akqi.d(akqiVar) ? dbsg.i(e(ddhoVar, akqiVar)) : dbpy.a;
    }

    @Override // defpackage.dkg
    @dzsi
    public final cjtd b(dfhp dfhpVar) {
        return (!this.c.a() || !this.a.a()) ? this.b : this.c.b();
    }
}
