package defpackage;
/* compiled from: PG */
/* renamed from: amcs  reason: default package */
/* loaded from: classes2.dex */
public final class amcs implements amcl {
    private static final alyh a = new alyh(-1, -1, -1);
    private final alvx b;
    private final btnc<alyh, alyg> c;

    public amcs(btmv btmvVar, akry akryVar, int i) {
        this.c = new btnc<>(i, btmz.IN_MEMORY_TILE, akryVar, btmvVar);
        amzd bZ = amze.o.bZ();
        akrw a2 = akrw.a(akryVar);
        alyl alylVar = alyl.o;
        String str = akryVar.J;
        alyh alyhVar = a;
        amza a3 = alym.a(a2, alylVar, str, alyhVar, "", "");
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        amze amzeVar = (amze) bZ.b;
        a3.getClass();
        amzeVar.b = a3;
        amzeVar.a |= 1;
        this.b = new alvx(bZ.bK(), akryVar, alyhVar, akrx.UNKNOWN);
    }

    @Override // defpackage.amcl
    public final boolean m(alyh alyhVar) {
        boolean z;
        synchronized (this.c) {
            z = this.c.a(alyhVar) != null;
        }
        return z;
    }

    @Override // defpackage.amcl
    @dzsi
    public final alyg n(alyh alyhVar) {
        alyg a2;
        synchronized (this.c) {
            a2 = this.c.a(alyhVar);
        }
        return a2;
    }

    @Override // defpackage.amcl
    public final void o(alyh alyhVar, alyg alygVar) {
        synchronized (this.c) {
            this.c.Pz(alyhVar, alygVar);
        }
    }

    @Override // defpackage.amcl
    public final void p(alyh alyhVar) {
        o(alyhVar, this.b);
    }

    @Override // defpackage.amcl
    public final boolean q(alyg alygVar) {
        return alygVar == this.b;
    }

    @Override // defpackage.amcl
    public final void r() {
        synchronized (this.c) {
            this.c.e();
        }
    }
}
