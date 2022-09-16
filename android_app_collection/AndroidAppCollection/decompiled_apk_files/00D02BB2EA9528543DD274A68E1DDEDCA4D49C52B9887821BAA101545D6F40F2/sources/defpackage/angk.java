package defpackage;
/* compiled from: PG */
/* renamed from: angk  reason: default package */
/* loaded from: classes2.dex */
final class angk extends angb {
    private volatile transient dbsg<ilo> b;

    public angk(dbsg<dvyw> dbsgVar) {
        super(dbsgVar);
    }

    @Override // defpackage.anhh
    public final dbsg<ilo> b() {
        dbsg<ilo> dbsgVar;
        if (this.b == null) {
            synchronized (this) {
                if (this.b == null) {
                    dbsg<dvyw> dbsgVar2 = this.a;
                    if (dbsgVar2.a()) {
                        ily ilyVar = new ily();
                        ilyVar.E(dbsgVar2.b());
                        dbsgVar = dbsg.i(ilyVar.d());
                    } else {
                        dbsgVar = dbpy.a;
                    }
                    this.b = dbsgVar;
                    if (this.b == null) {
                        throw new NullPointerException("getPlacemark() cannot return null");
                    }
                }
            }
        }
        return this.b;
    }
}
