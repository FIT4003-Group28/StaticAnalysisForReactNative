package defpackage;
/* compiled from: PG */
/* renamed from: bqso  reason: default package */
/* loaded from: classes4.dex */
public final class bqso {
    private final chhr c;
    public dbsg<djgl> a = dbpy.a;
    public chbv b = chbv.OBEY_SERVER_RESPONSE;
    private boolean d = false;

    public bqso(chhr chhrVar) {
        this.c = chhrVar;
    }

    private final void c(djgl djglVar, ilo iloVar, ddho ddhoVar, ddho ddhoVar2) {
        this.c.b(djglVar, ddhoVar, ddhoVar2, iloVar);
    }

    public final void a(dnqh dnqhVar) {
        this.d = dnqhVar.g == ddda.KB.b;
    }

    public final boolean b(bqlf bqlfVar) {
        ilo c;
        dbsg<djgl> c2 = bqlfVar.c();
        chbv chbvVar = chbv.NEVER_SHOW;
        int ordinal = this.b.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c2 = c2.d(this.a);
            }
            if (!c2.a() || (c = bqlfVar.a().c()) == null) {
                return false;
            }
            if (bqlfVar.b().r.isEmpty()) {
                c(c2.b(), c, this.d ? dtyc.aE : dtya.o, this.d ? dtyc.aF : dtya.p);
            } else {
                c(c2.b(), c, this.d ? dtyc.aG : dtyf.R, this.d ? dtyc.aH : dtyf.S);
            }
            return true;
        }
        return false;
    }
}
