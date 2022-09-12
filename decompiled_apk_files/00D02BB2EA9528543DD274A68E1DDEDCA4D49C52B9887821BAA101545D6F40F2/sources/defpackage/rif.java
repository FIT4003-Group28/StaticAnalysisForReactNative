package defpackage;
/* compiled from: PG */
/* renamed from: rif  reason: default package */
/* loaded from: classes7.dex */
public final class rif {
    public final dnkt a;
    public dbsg<rie> b;

    public rif(dnkt dnktVar) {
        dbsg<rie> dbsgVar;
        if ((dnktVar.a & 1) != 0) {
            dnks dnksVar = dnktVar.b;
            dbsgVar = dbsg.i(new rie(dnksVar == null ? dnks.b : dnksVar));
        } else {
            dbsgVar = dbpy.a;
        }
        this.b = dbsgVar;
        dnko ca = dnkt.c.ca(dnktVar);
        if (ca.c) {
            ca.bF();
            ca.c = false;
        }
        dnkt dnktVar2 = (dnkt) ca.b;
        dnktVar2.b = null;
        dnktVar2.a &= -2;
        this.a = ca.bK();
    }

    public final rie a() {
        if (!this.b.a()) {
            this.b = dbsg.i(new rie(dnks.b));
        }
        return this.b.b();
    }
}
