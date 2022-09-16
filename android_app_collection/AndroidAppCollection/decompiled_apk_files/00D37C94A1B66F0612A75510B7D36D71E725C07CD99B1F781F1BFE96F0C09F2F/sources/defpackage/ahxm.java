package defpackage;
/* compiled from: PG */
/* renamed from: ahxm  reason: default package */
/* loaded from: classes.dex */
public final class ahxm implements ahxj {
    public final aafo b;
    public final ampq c;
    private final String d;
    private final String e;
    private final aagi f;
    private final afvn g;
    private final aypf h = new aypf();
    public final amzp a = amzp.a();

    public ahxm(aagi aagiVar, afvn afvnVar, aafo aafoVar, String str, String str2, ampq ampqVar) {
        this.f = aagiVar;
        this.g = afvnVar;
        this.b = aafoVar;
        this.d = str;
        this.e = str2;
        this.c = ampqVar;
    }

    @Override // defpackage.ahxj
    public final void a(long j) {
        ahxl ahxlVar = (ahxl) this.a.b(Long.valueOf(j));
        if (ahxlVar == null) {
            return;
        }
        if (this.c.h()) {
            this.h.d(this.f.a(this.g.c()).f(this.e).P().S(new ahxk(this)));
        }
        aopa createBuilder = aqvy.a.createBuilder();
        alzh b = alzi.b();
        b.d(4);
        alzl b2 = b.b();
        createBuilder.copyOnWrite();
        aqvy aqvyVar = (aqvy) createBuilder.instance;
        b2.getClass();
        aqvyVar.d = b2;
        aqvyVar.b |= 2;
        aopa createBuilder2 = aqvx.a.createBuilder();
        createBuilder2.copyOnWrite();
        aqvx aqvxVar = (aqvx) createBuilder2.instance;
        aqvxVar.c = 1;
        aqvxVar.b |= 1;
        aqvx aqvxVar2 = (aqvx) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        aqvy aqvyVar2 = (aqvy) createBuilder.instance;
        aqvxVar2.getClass();
        aqvyVar2.c = aqvxVar2;
        aqvyVar2.b |= 1;
        aagh a = this.f.a(this.g.c());
        aypf aypfVar = this.h;
        aajs c = a.c();
        String str = this.e;
        atab f = atac.f(str);
        Integer valueOf = Integer.valueOf(ahxlVar.a);
        aopa aopaVar = f.a;
        int intValue = valueOf.intValue();
        aopaVar.copyOnWrite();
        ataf atafVar = (ataf) aopaVar.instance;
        ataf atafVar2 = ataf.a;
        atafVar.c |= 8;
        atafVar.f = intValue;
        c.i(str, (aqvy) createBuilder.mo39build(), f.c().c());
        aypfVar.d(c.b().S(fzb.p, ahqs.i));
    }

    @Override // defpackage.ahxj
    public final void b() {
        this.h.d(this.f.a(this.g.c()).i(this.d).I(new zwb(13)).V(aaku.p).k(avih.class).as(new ahxk(this, 1)));
    }

    @Override // defpackage.ahxj
    public final void c() {
        this.h.c();
    }
}
