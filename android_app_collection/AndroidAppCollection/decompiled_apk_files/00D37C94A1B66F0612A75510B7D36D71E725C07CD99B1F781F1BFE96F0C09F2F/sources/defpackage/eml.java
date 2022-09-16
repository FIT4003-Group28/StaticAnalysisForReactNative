package defpackage;
/* compiled from: PG */
/* renamed from: eml  reason: default package */
/* loaded from: classes3.dex */
public final class eml {
    public final emm a;
    private final aagi b;
    private final aypf c = new aypf();

    public eml(aagi aagiVar, emm emmVar) {
        this.b = aagiVar;
        this.a = emmVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final String e(bahu bahuVar) {
        bahu c = bahu.c((bahuVar.b + 500) / 1000);
        int i = bahuVar.a() > 0 ? 2 : 1;
        balp balpVar = new balp();
        balpVar.e();
        balpVar.i(":");
        balpVar.h();
        balpVar.a = i;
        balpVar.f();
        balpVar.i(":");
        balpVar.h();
        balpVar.a = 2;
        balpVar.g();
        return balpVar.a().a(c.e());
    }

    public final void a() {
        this.c.c();
    }

    public final void b() {
        this.c.c();
        this.c.g(this.a.a().Z(new emk(this)), this.a.b().Z(new emk(this, 1)));
        c(!this.a.c().booleanValue());
        d(e(bahu.b(this.a.d().longValue())));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(boolean z) {
        aagh c = this.b.c();
        apzw apzwVar = (apzw) c.f(aakj.f(apzx.b.a(), "")).g(apzw.class).W();
        if (apzwVar != null) {
            apzu e = apzwVar.e();
            Boolean valueOf = Boolean.valueOf(z);
            aopa aopaVar = e.a;
            boolean booleanValue = valueOf.booleanValue();
            aopaVar.copyOnWrite();
            apzx apzxVar = (apzx) aopaVar.instance;
            apzxVar.c |= 2;
            apzxVar.e = booleanValue;
            apzw b = e.b();
            aahb c2 = ((aagu) c).c();
            c2.d(b);
            c2.b().Q();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(String str) {
        aagh c = this.b.c();
        String f = aakj.f(aqaf.b.a(), "");
        f.getClass();
        aqxo.z(!f.isEmpty(), "key cannot be empty");
        aopa createBuilder = aqaf.a.createBuilder();
        createBuilder.copyOnWrite();
        aqaf aqafVar = (aqaf) createBuilder.instance;
        aqafVar.c |= 1;
        aqafVar.d = f;
        aqac aqacVar = new aqac(createBuilder);
        aopa aopaVar = aqacVar.a;
        aopaVar.copyOnWrite();
        aqaf aqafVar2 = (aqaf) aopaVar.instance;
        str.getClass();
        aqafVar2.c |= 2;
        aqafVar2.e = str;
        aqae b = aqacVar.b();
        aahb c2 = ((aagu) c).c();
        c2.d(b);
        c2.b().Q();
    }
}
