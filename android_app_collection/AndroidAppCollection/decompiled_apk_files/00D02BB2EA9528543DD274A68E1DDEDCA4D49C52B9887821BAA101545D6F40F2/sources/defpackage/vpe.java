package defpackage;
/* compiled from: PG */
/* renamed from: vpe  reason: default package */
/* loaded from: classes7.dex */
public final class vpe extends vpb implements vpd {
    private static final dcco<Integer, dowl> a;
    private static final dcqe b;
    private final bvjj c;
    private final dxio<btvo> d;
    private boolean e = false;
    private boolean f = false;
    private boolean g = false;
    private boolean h = false;
    private boolean i = false;

    static {
        dowl dowlVar = dowl.SAO_PAULO_RODIZIO_1_2;
        dowl dowlVar2 = dowl.SAO_PAULO_RODIZIO_3_4;
        dowl dowlVar3 = dowl.SAO_PAULO_RODIZIO_5_6;
        dowl dowlVar4 = dowl.SAO_PAULO_RODIZIO_7_8;
        dowl dowlVar5 = dowl.SAO_PAULO_RODIZIO_9_0;
        dbzb.a(2, dowlVar);
        dbzb.a(3, dowlVar2);
        dbzb.a(5, dowlVar3);
        dbzb.a(7, dowlVar4);
        dbzb.a(9, dowlVar5);
        a = new dcmh(new Object[]{2, dowlVar, 3, dowlVar2, 5, dowlVar3, 7, dowlVar4, 9, dowlVar5}, 5);
        b = dcqe.c("vpe");
    }

    public vpe(dxio<btvo> dxioVar, bvjj bvjjVar) {
        this.c = bvjjVar;
        this.d = dxioVar;
    }

    private final synchronized void m() {
        if (this.e) {
            return;
        }
        dwwt vehicleRotationParameters = this.d.a().getVehicleRotationParameters();
        this.f = vehicleRotationParameters.a;
        this.g = vehicleRotationParameters.b;
        boolean z = this.d.a().getEnableFeatureParameters().aF;
        this.i = z;
        boolean z2 = false;
        if (z && vehicleRotationParameters.c) {
            z2 = true;
        }
        this.h = z2;
        this.e = true;
    }

    @Override // defpackage.vpd
    public final synchronized boolean c(vpc vpcVar) {
        m();
        vpc vpcVar2 = vpc.JAKARTA;
        int ordinal = vpcVar.ordinal();
        if (ordinal == 0) {
            return this.f;
        } else if (ordinal == 1) {
            return this.g;
        } else if (ordinal == 2) {
            return d(vpc.MANILA) && this.h;
        } else if (ordinal != 3) {
            return false;
        } else {
            d(vpc.SANTIAGO);
            return false;
        }
    }

    @Override // defpackage.vpd
    public final synchronized boolean d(vpc vpcVar) {
        m();
        vpc vpcVar2 = vpc.JAKARTA;
        int ordinal = vpcVar.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            return true;
        }
        if (ordinal != 2) {
            return false;
        }
        return this.i;
    }

    @Override // defpackage.vpd
    public final synchronized boolean e(vpc vpcVar) {
        m();
        if (c(vpcVar)) {
            return true;
        }
        vpc vpcVar2 = vpc.JAKARTA;
        int ordinal = vpcVar.ordinal();
        if (ordinal == 0) {
            return this.c.m(bvjk.iP, false);
        } else if (ordinal == 1) {
            return this.c.m(bvjk.iQ, false);
        } else if (ordinal != 2) {
            return false;
        } else {
            return this.c.m(bvjk.iS, false);
        }
    }

    @Override // defpackage.vpd
    public final synchronized dowl f(vpc vpcVar) {
        m();
        vpc vpcVar2 = vpc.JAKARTA;
        int ordinal = vpcVar.ordinal();
        if (ordinal == 0) {
            if (this.c.m(bvjk.iN, false)) {
                return dowl.JAKARTA_EVEN;
            } else if (this.c.m(bvjk.iO, false)) {
                return dowl.JAKARTA_ODD;
            } else {
                return dowl.UNSET;
            }
        } else if (ordinal == 1) {
            dowl dowlVar = a.get(Integer.valueOf(this.c.s(bvjk.iR, -1)));
            if (dowlVar != null) {
                return dowlVar;
            }
            return dowl.UNSET;
        } else if (ordinal == 2) {
            return dowl.b(this.c.s(bvjk.iT, dowl.UNSET.t));
        } else if (ordinal == 3) {
            return dowl.UNSET;
        } else {
            return dowl.UNSET;
        }
    }

    @Override // defpackage.vpd
    public final synchronized void g(vpc vpcVar, dowl dowlVar) {
        m();
        vpc vpcVar2 = vpc.JAKARTA;
        int ordinal = vpcVar.ordinal();
        if (ordinal == 0) {
            this.c.P(bvjk.iN);
            this.c.P(bvjk.iO);
            if (dowlVar == dowl.JAKARTA_EVEN) {
                this.c.S(bvjk.iN, true);
            } else if (dowlVar == dowl.JAKARTA_ODD) {
                this.c.S(bvjk.iO, true);
            }
            if (!a()) {
                return;
            }
            this.c.S(bvjk.iP, true);
            this.c.S(bvjk.is, true);
        } else if (ordinal == 1) {
            Integer num = (Integer) ((dcmh) a).e.get(dowlVar);
            if (num != null) {
                this.c.W(bvjk.iR, num.intValue());
                this.c.S(bvjk.iQ, true);
                this.c.S(bvjk.is, true);
                return;
            }
            this.c.P(bvjk.iR);
        } else if (ordinal != 2) {
            if (ordinal == 3) {
            }
        } else if (vph.b(dowlVar) == vpc.MANILA) {
            this.c.W(bvjk.iT, dowlVar.t);
            this.c.S(bvjk.iS, true);
            this.c.S(bvjk.is, true);
        } else {
            this.c.P(bvjk.iT);
        }
    }

    @Override // defpackage.vpd
    public final synchronized void h(vpc vpcVar, boolean z, boolean z2) {
        m();
        vpc vpcVar2 = vpc.JAKARTA;
        int ordinal = vpcVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                return;
            }
            return;
        }
        if (z && z2) {
            bvoo.h("Attempted to set license plate as both even and odd.", new Object[0]);
            z = false;
            z2 = false;
        }
        this.c.S(bvjk.iN, z);
        this.c.S(bvjk.iO, z2);
        if (!a()) {
            return;
        }
        this.c.S(bvjk.iP, true);
        this.c.S(bvjk.is, true);
    }

    @Override // defpackage.vpd
    public final boolean i() {
        return false;
    }

    @Override // defpackage.vpd
    public final boolean j() {
        return this.c.m(bvjk.is, false);
    }

    @Override // defpackage.vpd
    public final void k() {
        this.c.S(bvjk.is, true);
    }

    @Override // defpackage.vpd
    public final synchronized dowl l() {
        m();
        vpc[] values = vpc.values();
        for (int i = 0; i < values.length; i++) {
            if (c(values[i]) && !vph.a(f(values[i]))) {
                return f(values[i]);
            }
        }
        return dowl.UNSET;
    }
}
