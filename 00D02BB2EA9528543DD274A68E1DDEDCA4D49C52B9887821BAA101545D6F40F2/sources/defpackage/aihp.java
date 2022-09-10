package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aihp  reason: default package */
/* loaded from: classes2.dex */
public final class aihp extends aihs {
    private static final eaow c = eaow.c(5);
    private final dqzv d;

    public aihp(eapd eapdVar, dqzv dqzvVar) {
        super(eapdVar, c);
        this.d = dqzvVar;
    }

    public static aihp c(aimf aimfVar) {
        aimb aimbVar;
        aimb aimbVar2;
        boolean z = false;
        dbsk.l(aimfVar.b == 4);
        if (aimfVar.b == 4) {
            aimbVar = (aimb) aimfVar.c;
        } else {
            aimbVar = aimb.c;
        }
        if (1 == (aimbVar.a & 1)) {
            z = true;
        }
        dbsk.l(z);
        eapd eapdVar = new eapd(aimfVar.d);
        if (aimfVar.b == 4) {
            aimbVar2 = (aimb) aimfVar.c;
        } else {
            aimbVar2 = aimb.c;
        }
        dqzv dqzvVar = aimbVar2.b;
        if (dqzvVar == null) {
            dqzvVar = dqzv.h;
        }
        return new aihp(eapdVar, dqzvVar);
    }

    @Override // defpackage.aihs
    public final List<aihr> a(List<aihr> list, ahvi ahviVar) {
        if (ahwg.g(this.d)) {
            return dcdc.r(list);
        }
        dccx F = dcdc.F();
        for (aihr aihrVar : list) {
            if (!f(this.d, aihrVar.a())) {
                F.g(aihrVar);
            }
        }
        return F.f();
    }

    @Override // defpackage.aihs
    public final aimf b() {
        aime bZ = aimf.e.bZ();
        long j = this.a.a;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aimf aimfVar = (aimf) bZ.b;
        aimfVar.a |= 1;
        aimfVar.d = j;
        aima bZ2 = aimb.c.bZ();
        dqzv dqzvVar = this.d;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        aimb aimbVar = (aimb) bZ2.b;
        dqzvVar.getClass();
        aimbVar.b = dqzvVar;
        aimbVar.a |= 1;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        aimf aimfVar2 = (aimf) bZ.b;
        aimb bK = bZ2.bK();
        bK.getClass();
        aimfVar2.c = bK;
        aimfVar2.b = 4;
        return bZ.bK();
    }
}
