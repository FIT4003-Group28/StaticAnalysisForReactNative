package defpackage;
/* compiled from: PG */
/* renamed from: gbh  reason: default package */
/* loaded from: classes6.dex */
class gbh implements gbd {
    private final String a;
    private final int b;
    private final int c;

    public gbh(dqse dqseVar) {
        this.a = dqseVar.c;
        dgaq dgaqVar = dqseVar.b;
        this.b = (dgaqVar == null ? dgaq.d : dgaqVar).b;
        dgaq dgaqVar2 = dqseVar.b;
        this.c = (dgaqVar2 == null ? dgaq.d : dgaqVar2).c;
    }

    @Override // defpackage.gbd
    public String a() {
        return this.a;
    }

    @Override // defpackage.gbd
    public cqtd b() {
        cqtd n = cqtt.n(cquy.a(), ibl.s(), gbi.b);
        cqtv cqtvVar = gbi.b;
        return cqtt.i(cqtt.d(cqtt.e(n, cqtvVar, cqtvVar, cqtvVar, cqtvVar), cqtt.g(iva.b(cqta.e(this.b), cqta.e(this.c)))), gbi.a, gbi.a);
    }
}
