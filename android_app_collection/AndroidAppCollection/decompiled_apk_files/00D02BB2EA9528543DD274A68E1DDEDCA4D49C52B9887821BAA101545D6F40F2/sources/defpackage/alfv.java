package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alfv  reason: default package */
/* loaded from: classes2.dex */
public final class alfv implements amri {
    static final dcdn<dmlo, akse> a;
    private final amuo b;
    private final akrk c;
    private final akse d = new akse();
    private final akse e = new akse();
    private final akse f = new akse();
    private final akse g = new akse();
    private final float[] h = new float[8];

    static {
        dcdg dcdgVar = new dcdg();
        dcdgVar.f(dmlo.BOTTOM, new akse(0.0f, 1.0f));
        dmlo dmloVar = dmlo.BOTTOM_LEFT;
        akse akseVar = new akse(-1.0f, 1.0f);
        akse.o(akseVar, akseVar);
        dcdgVar.f(dmloVar, akseVar);
        dmlo dmloVar2 = dmlo.BOTTOM_RIGHT;
        akse akseVar2 = new akse(1.0f, 1.0f);
        akse.o(akseVar2, akseVar2);
        dcdgVar.f(dmloVar2, akseVar2);
        dcdgVar.f(dmlo.TOP, new akse(0.0f, -1.0f));
        dmlo dmloVar3 = dmlo.TOP_LEFT;
        akse akseVar3 = new akse(-1.0f, -1.0f);
        akse.o(akseVar3, akseVar3);
        dcdgVar.f(dmloVar3, akseVar3);
        dmlo dmloVar4 = dmlo.TOP_RIGHT;
        akse akseVar4 = new akse(1.0f, -1.0f);
        akse.o(akseVar4, akseVar4);
        dcdgVar.f(dmloVar4, akseVar4);
        dcdgVar.f(dmlo.LEFT, new akse(-1.0f, 0.0f));
        dcdgVar.f(dmlo.RIGHT, new akse(1.0f, 0.0f));
        a = dcdgVar.b();
    }

    public alfv(amuo amuoVar, akrk akrkVar) {
        this.b = amuoVar;
        this.c = akrkVar;
    }

    @Override // defpackage.amri
    public final float a(aktc aktcVar, amrk amrkVar, akra akraVar, dmlo dmloVar) {
        akse akseVar;
        if (!akraVar.equals(this.b.c)) {
            akra akraVar2 = this.b.c;
        }
        List<akra> q = this.c.q();
        int i = this.b.j;
        if (i <= 0 || i >= q.size() - 1) {
            return 0.0f;
        }
        if (dmloVar == dmlo.CENTER || (akseVar = a.get(dmloVar)) == null || !akyx.p(amrkVar.e, q.get(i), this.d, this.h) || !akyx.p(amrkVar.e, q.get(i - 1), this.e, this.h) || !akyx.p(amrkVar.e, q.get(i + 1), this.f, this.h)) {
            return 0.5f;
        }
        akse akseVar2 = this.e;
        akse.t(akseVar2, this.d, akseVar2);
        akse.o(akseVar2, akseVar2);
        akse akseVar3 = this.f;
        akse.t(akseVar3, this.d, akseVar3);
        akse.o(akseVar3, akseVar3);
        akse akseVar4 = this.e;
        akse akseVar5 = this.f;
        akse akseVar6 = this.g;
        akse.i(akseVar4, akseVar5, akseVar6);
        akse.o(akseVar6, akseVar6);
        return (this.g.a(akseVar) + 1.0f) / 2.0f;
    }
}
