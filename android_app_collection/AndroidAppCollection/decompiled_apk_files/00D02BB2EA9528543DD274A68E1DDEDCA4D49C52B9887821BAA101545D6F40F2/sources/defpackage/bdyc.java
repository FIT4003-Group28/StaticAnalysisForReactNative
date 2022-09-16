package defpackage;
/* compiled from: PG */
/* renamed from: bdyc  reason: default package */
/* loaded from: classes3.dex */
public final class bdyc<T> extends btrh<T> {
    private final int d;

    public bdyc(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        brlu c;
        int i = this.d;
        if (i != 0) {
            if (i != 1) {
                bnis bnisVar = (bnis) obj;
                ((bdxz) this.a).a.bl.g();
                return;
            }
            bdxz bdxzVar = (bdxz) this.a;
            iqn iqnVar = (iqn) obj;
            bdxzVar.a.bl.g();
            bdxzVar.a.bl.a.S(bvjk.dx, true);
            return;
        }
        bdxz bdxzVar2 = (bdxz) this.a;
        aehq aehqVar = (aehq) obj;
        if (!bdxzVar2.a.bo().bS().a()) {
            return;
        }
        dnnn d = bdxzVar2.a.al.i() ? aehqVar.a : bdxzVar2.a.an.d();
        bdxzVar2.a.bA(d);
        brlu bx = bdxzVar2.a.bx();
        if (bx == null) {
            return;
        }
        bwrs<brlu> bw = bdxzVar2.a.bw();
        if (bw != null && bdxzVar2.a.al.i() && (c = bw.c()) != null) {
            int g = c.g();
            for (int i2 = 0; i2 < g; i2++) {
                ilo h = c.h(i2);
                dnng dnngVar = h.h().X;
                if (dnngVar == null) {
                    dnngVar = dnng.r;
                }
                if (!dnngVar.equals(dnng.r)) {
                    dnnn dnnnVar = dnngVar.b;
                    if (dnnnVar == null) {
                        dnnnVar = dnnn.l;
                    }
                    if (!dnnnVar.equals(d)) {
                        ily g2 = h.g();
                        dnnf bZ = dnng.r.bZ();
                        if (bZ.c) {
                            bZ.bF();
                            bZ.c = false;
                        }
                        dnng dnngVar2 = (dnng) bZ.b;
                        d.getClass();
                        dnngVar2.b = d;
                        dnngVar2.a |= 32;
                        g2.m(bZ.bK());
                        g2.p = true;
                        c.j(i2, g2.d());
                    }
                }
            }
            bw.d(c);
        }
        bdxzVar2.a.bz(bx, d);
    }

    public bdyc(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = 0;
    }
}
