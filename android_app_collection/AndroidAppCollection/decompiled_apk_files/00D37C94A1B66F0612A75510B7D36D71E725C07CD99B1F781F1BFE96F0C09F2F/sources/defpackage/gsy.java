package defpackage;
/* compiled from: PG */
/* renamed from: gsy  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gsy implements ayqb {
    public final /* synthetic */ gsz a;
    private final /* synthetic */ int b;

    public /* synthetic */ gsy(gsz gszVar, int i) {
        this.b = i;
        this.a = gszVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            final gsz gszVar = this.a;
            final String str = (String) obj;
            gszVar.b.c().f(str).y(azpj.b(gszVar.c)).g(auzs.class).V(new gsy(gszVar, 1), ayrb.e, new aypv() { // from class: gsx
                @Override // defpackage.aypv
                public final void a() {
                    gsz gszVar2 = gsz.this;
                    String str2 = str;
                    aahb c = ((aagu) gszVar2.a.c()).c();
                    str2.getClass();
                    aqxo.z(!str2.isEmpty(), "key cannot be empty");
                    aopa createBuilder = auzt.a.createBuilder();
                    createBuilder.copyOnWrite();
                    auzt auztVar = (auzt) createBuilder.instance;
                    auztVar.b |= 1;
                    auztVar.c = str2;
                    auzq auzqVar = new auzq(createBuilder);
                    Boolean bool = false;
                    aopa aopaVar = auzqVar.a;
                    boolean booleanValue = bool.booleanValue();
                    aopaVar.copyOnWrite();
                    auzt auztVar2 = (auzt) aopaVar.instance;
                    auztVar2.b |= 2;
                    auztVar2.d = booleanValue;
                    c.j(auzqVar);
                    c.b();
                }
            });
            return;
        }
        aahb c = ((aagu) this.a.a.c()).c();
        c.d((auzs) obj);
        c.b();
    }
}
