package defpackage;
/* compiled from: PG */
/* renamed from: etw  reason: default package */
/* loaded from: classes3.dex */
public final class etw implements ett {
    public final azqb a;
    private final etn b;
    private final azqb c;
    private final acvh d;
    private acvg e = new acvi();
    private boolean f;

    public etw(etn etnVar, azqb azqbVar, azqb azqbVar2, acvh acvhVar) {
        this.b = etnVar;
        this.d = acvhVar;
        this.c = azqbVar;
        this.a = azqbVar2;
    }

    @Override // defpackage.ett
    public final void a() {
        acvg c = this.d.c(asny.LATENCY_ACTION_HOME);
        this.e = c;
        if (this.f) {
            c.e();
            acvg acvgVar = this.e;
            aopa createBuilder = asno.a.createBuilder();
            createBuilder.copyOnWrite();
            asno asnoVar = (asno) createBuilder.instance;
            asnoVar.b |= 8;
            asnoVar.g = "warm";
            acvgVar.a((asno) createBuilder.mo39build());
            return;
        }
        ylx.k((ankt) this.c.get(), anjk.a, new ylv() { // from class: etu
            @Override // defpackage.zdt
            /* renamed from: b */
            public final void a(Throwable th) {
                etw etwVar = etw.this;
                etwVar.b(false, !((Boolean) etwVar.a.get()).booleanValue());
            }
        }, new ylw() { // from class: etv
            @Override // defpackage.ylw, defpackage.zdt
            public final void a(Object obj) {
                etw etwVar = etw.this;
                etwVar.b(((Boolean) obj).booleanValue(), !((Boolean) etwVar.a.get()).booleanValue());
            }
        });
        this.f = true;
    }

    public final void b(boolean z, boolean z2) {
        String str = true != z ? "cold" : "frozen";
        this.e.f(this.b.a);
        acvg acvgVar = this.e;
        aopa createBuilder = asno.a.createBuilder();
        createBuilder.copyOnWrite();
        asno asnoVar = (asno) createBuilder.instance;
        asnoVar.b |= 8;
        asnoVar.g = str;
        createBuilder.copyOnWrite();
        asno asnoVar2 = (asno) createBuilder.instance;
        asnoVar2.b |= 16;
        asnoVar2.h = z2;
        acvgVar.a((asno) createBuilder.mo39build());
    }
}
