package defpackage;
/* compiled from: PG */
/* renamed from: bfhx  reason: default package */
/* loaded from: classes3.dex */
public class bfhx implements bfgv {
    private final dzsj<begg> a;
    private final bego b;
    private dbsg<ilo> c = dbpy.a;
    @dzsi
    private cjtd d;

    public bfhx(dzsj<begg> dzsjVar, cqhn cqhnVar, bego begoVar) {
        this.a = dzsjVar;
        this.b = begoVar;
    }

    @Override // defpackage.bfgv
    public Float a() {
        return (Float) this.c.h(bfhv.a).c(Float.valueOf(Float.NaN));
    }

    @Override // defpackage.bfgv
    public Integer b() {
        return (Integer) this.c.h(bfhw.a).c(0);
    }

    @Override // defpackage.bfgv
    public void c(@dzsi ilo iloVar) {
        this.c = dbsg.j(iloVar);
        if (iloVar != null) {
            cjta c = cjtd.c(iloVar.bZ());
            c.d = dtxy.eX;
            this.d = c.a();
        }
        cqkx.p(this);
    }

    @Override // defpackage.bfgv
    public Boolean d() {
        boolean z = true;
        if (!Boolean.valueOf(b().intValue() > 0).booleanValue() || !this.a.a().i(bege.REVIEWS)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.bfgv
    public cqkl e() {
        if (d().booleanValue()) {
            this.a.a().k(bege.REVIEWS);
        }
        return cqkl.a;
    }

    @Override // defpackage.bfgv
    @dzsi
    public cjtd f() {
        return this.d;
    }

    @Override // defpackage.bfgv
    public Boolean g() {
        bego begoVar = this.b;
        if (begoVar == null) {
            return false;
        }
        return Boolean.valueOf(begoVar.a(this.c.f()));
    }
}
