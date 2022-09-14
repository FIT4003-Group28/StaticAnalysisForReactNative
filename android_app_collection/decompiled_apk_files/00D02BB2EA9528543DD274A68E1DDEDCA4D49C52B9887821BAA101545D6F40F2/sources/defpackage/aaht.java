package defpackage;
/* compiled from: PG */
/* renamed from: aaht  reason: default package */
/* loaded from: classes2.dex */
public class aaht implements aahd {
    @dzsi
    public ddho a;
    private final dxio<bwft> b;
    private dbsg<divo> c = dbpy.a;
    private dpuk e = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
    private String d = "";

    public aaht(dxio<bwft> dxioVar) {
        this.b = dxioVar;
    }

    @Override // defpackage.aahd
    public final Boolean a() {
        return Boolean.valueOf(this.c.a());
    }

    @Override // defpackage.aahd
    public final void b() {
        if (!this.c.a()) {
            return;
        }
        dpuk dpukVar = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
        this.b.a().o(this.c.b().b, this.c.b().c, e(), this.d, this.e.ordinal() != 1 ? 1 : 2, this.a);
    }

    @Override // defpackage.aahd
    public final Runnable c() {
        return null;
    }

    public final void d(diwb diwbVar) {
        dbsg<divo> dbsgVar;
        if ((diwbVar.a & 536870912) != 0) {
            divo divoVar = diwbVar.A;
            if (divoVar == null) {
                divoVar = divo.d;
            }
            dbsgVar = dbsg.i(divoVar);
        } else {
            dbsgVar = dbpy.a;
        }
        this.c = dbsgVar;
        this.d = diwbVar.c;
        dpuk b = dpuk.b(diwbVar.d);
        if (b == null) {
            b = dpuk.UNKNOWN_KNOWLEDGE_ENTITY;
        }
        this.e = b;
    }

    public final String e() {
        if (this.c.a()) {
            dnpq dnpqVar = this.c.b().a;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
            return dnpqVar.c;
        }
        return "";
    }
}
