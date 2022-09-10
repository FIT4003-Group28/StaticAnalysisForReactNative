package defpackage;
/* compiled from: PG */
/* renamed from: bdbf  reason: default package */
/* loaded from: classes3.dex */
public abstract class bdbf implements bday {
    private final String a;
    private final Integer b;
    private final String c;
    private final float d;
    private final cjtd e;
    private final appj f;
    @dzsi
    private final Long g;
    private boolean h;

    public bdbf(appj appjVar, cqhn cqhnVar, dwfl dwflVar, int i, @dzsi Long l) {
        dkec dkecVar;
        this.f = appjVar;
        dkea dkeaVar = dwflVar.j;
        dkeaVar = dkeaVar == null ? dkea.d : dkeaVar;
        if (dkeaVar.c.size() > 0) {
            dkecVar = dkeaVar.c.get(0);
        } else {
            dkecVar = dkec.f;
        }
        this.a = dkecVar.e;
        this.b = Integer.valueOf(dkecVar.b);
        this.d = dkecVar.c / dkecVar.d;
        this.c = dwflVar.h;
        this.g = l;
        cjta b = cjtd.b();
        b.b = dwflVar.b;
        b.g(dwflVar.c);
        b.i(i);
        b.d = dtxy.cK;
        this.e = b.a();
    }

    private final void i(boolean z) {
        this.h = z;
        cqkx.p(this);
    }

    @Override // defpackage.bday
    public String a() {
        return this.a;
    }

    @Override // defpackage.bday
    public String b() {
        return this.c;
    }

    @Override // defpackage.bday
    public Float c() {
        return Float.valueOf(this.d);
    }

    @Override // defpackage.bday
    public Boolean d() {
        return Boolean.valueOf(this.h);
    }

    @Override // defpackage.bday
    @dzsi
    public Long e() {
        return this.g;
    }

    @Override // defpackage.bday
    public appj f() {
        return this.f;
    }

    @Override // defpackage.bday
    @dzsi
    public String g() {
        return null;
    }

    @Override // defpackage.bday
    public Integer h() {
        return this.b;
    }

    @Override // defpackage.jbt
    public cjtd k() {
        return this.e;
    }

    @Override // defpackage.bdar
    public void l() {
        i(true);
    }

    @Override // defpackage.bdar
    public void m() {
        i(false);
    }
}
