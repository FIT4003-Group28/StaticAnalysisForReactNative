package defpackage;

import java.lang.ref.SoftReference;
/* compiled from: PG */
/* renamed from: amcu  reason: default package */
/* loaded from: classes.dex */
public final class amcu implements amcl {
    private static final alyh a = new alyh(-1, -1, -1);
    private final alvx b;
    private final btnc<alyh, amct> c;

    public amcu(btmv btmvVar, akry akryVar, int i) {
        this.c = new btnc<>(i, btmz.SOFT_IN_MEMORY_TILE, akryVar, btmvVar);
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
        return n(alyhVar) != null;
    }

    @Override // defpackage.amcl
    @dzsi
    public final alyg n(alyh alyhVar) {
        synchronized (this.c) {
            amct a2 = this.c.a(alyhVar);
            alyg alygVar = null;
            if (a2 != null) {
                alyg alygVar2 = a2.b;
                if (alygVar2 != null) {
                    alygVar = alygVar2;
                } else {
                    SoftReference<alyg> softReference = a2.a;
                    if (softReference != null) {
                        alygVar = softReference.get();
                    }
                }
                if (alygVar == null) {
                    this.c.o(alyhVar);
                }
                return alygVar;
            }
            return null;
        }
    }

    @Override // defpackage.amcl
    public final void o(alyh alyhVar, alyg alygVar) {
        synchronized (this.c) {
            this.c.Pz(alyhVar, new amct(alygVar));
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
