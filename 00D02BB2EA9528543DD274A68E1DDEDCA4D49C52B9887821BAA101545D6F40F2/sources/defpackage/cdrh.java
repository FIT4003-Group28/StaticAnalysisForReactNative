package defpackage;
/* compiled from: PG */
/* renamed from: cdrh  reason: default package */
/* loaded from: classes4.dex */
public abstract class cdrh implements cdiy {
    @dzsi
    private transient cdjl a = null;

    private final dnti i() {
        return f().e((dssr) dnti.k.cu(7), dnti.k);
    }

    @Override // defpackage.cdiy
    public final cdjl a() {
        if (this.a == null) {
            cdrs h = cdrt.h();
            h.c(i().e);
            h.d(i().g);
            h.e(g());
            if ((i().a & 16) != 0) {
                h.f(i().f);
            }
            if (!i().i.isEmpty()) {
                h.b(i().i);
            }
            this.a = h.a();
        }
        return this.a;
    }

    @Override // defpackage.cdiy
    public final String b() {
        return i().b;
    }

    @Override // defpackage.cdiy
    public final dbsg<dnpq> c() {
        dnpq dnpqVar;
        if ((i().a & 256) != 0) {
            dnpqVar = i().j;
            if (dnpqVar == null) {
                dnpqVar = dnpq.g;
            }
        } else {
            dnpqVar = null;
        }
        return dbsg.j(dnpqVar);
    }

    public abstract bvrt<dnti> f();

    public abstract boolean g();

    public abstract cdrg h();
}
