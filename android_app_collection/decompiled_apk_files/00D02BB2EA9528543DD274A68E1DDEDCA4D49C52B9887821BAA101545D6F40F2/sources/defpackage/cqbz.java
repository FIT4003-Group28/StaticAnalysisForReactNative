package defpackage;
/* compiled from: PG */
/* renamed from: cqbz  reason: default package */
/* loaded from: classes5.dex */
public final class cqbz implements degu<dslz> {
    final /* synthetic */ cqbw a;
    final /* synthetic */ bzox b;

    public cqbz(cqbw cqbwVar, bzox bzoxVar) {
        this.a = cqbwVar;
        this.b = bzoxVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.a(cqdb.CANNOT_CONSENT);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dslz dslzVar) {
        cqdb a = cqdc.a(dslzVar);
        cqbw cqbwVar = this.a;
        dskg bZ = dsks.g.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsks dsksVar = (dsks) bZ.b;
        dsksVar.b = 2;
        dsksVar.a |= 1;
        dskn bZ2 = dskq.c.bZ();
        dskp orDefault = cqdc.a.getOrDefault(a, dskp.PROMOTABILITY_UNKNOWN);
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dskq dskqVar = (dskq) bZ2.b;
        dskqVar.b = orDefault.f;
        dskqVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dsks dsksVar2 = (dsks) bZ.b;
        dskq bK = bZ2.bK();
        bK.getClass();
        dsksVar2.e = bK;
        dsksVar2.a |= 8;
        cqbwVar.a(bZ.bK());
        this.b.a(a);
    }
}
