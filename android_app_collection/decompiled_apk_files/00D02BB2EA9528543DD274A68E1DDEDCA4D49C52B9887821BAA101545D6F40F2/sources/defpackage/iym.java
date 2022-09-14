package defpackage;
/* compiled from: PG */
/* renamed from: iym  reason: default package */
/* loaded from: classes7.dex */
final class iym implements jco {
    final /* synthetic */ iyo a;

    public iym(iyo iyoVar) {
        this.a = iyoVar;
    }

    @Override // defpackage.jco
    public final void a(int i, boolean z) {
        int i2;
        iyo iyoVar = this.a;
        if (iyoVar.b == null || !z || i == (i2 = iyoVar.c) || i2 < 0 || i2 >= iyoVar.a.size()) {
            this.a.c = i;
            return;
        }
        dead deadVar = i > this.a.c ? dead.LEFT : dead.RIGHT;
        iyo iyoVar2 = this.a;
        jbs jbsVar = iyoVar2.a.get(iyoVar2.c);
        if (jbsVar == null || jbsVar.a().size() == 0) {
            return;
        }
        jbt jbtVar = jbsVar.a().get(0);
        if (jbtVar != null && jbtVar.k() != null && !dbsd.a(jbtVar.k(), cjtd.b)) {
            this.a.b.n(cjql.a, new cjte(deaf.SWIPE, deadVar), jbtVar.k());
        }
        iyo iyoVar3 = this.a;
        iyoVar3.c = i;
        cqkx.p(iyoVar3);
    }

    @Override // defpackage.jco
    public final void b(int i) {
    }
}
