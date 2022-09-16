package defpackage;

import java.util.List;
import java.util.Set;
/* compiled from: PG */
/* renamed from: adbz  reason: default package */
/* loaded from: classes2.dex */
public final class adbz implements adab<adgq> {
    private final abfa a;
    private final adgr b;
    private final ilo c;

    public adbz(abfa abfaVar, adgs adgsVar, ilo iloVar) {
        this.a = abfaVar;
        this.b = adgsVar.a(absg.AREA_EXPLORE);
        this.c = iloVar;
    }

    @Override // defpackage.aczy
    public final List<cqix<adgq>> a(List<cqix<?>> list) {
        if (!this.a.h()) {
            return dcdc.e();
        }
        adgr adgrVar = this.b;
        ilo iloVar = this.c;
        dvhv bZ = dvhw.f.bZ();
        dvvy dvvyVar = iloVar.h().as;
        if (dvvyVar == null) {
            dvvyVar = dvvy.d;
        }
        djrl bZ2 = djrm.v.bZ();
        dsrj<dvyw> dsrjVar = dvvyVar.b;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djrm djrmVar = (djrm) bZ2.b;
        djrmVar.b();
        dsod.bv(dsrjVar, djrmVar.e);
        dspd dspdVar = dvvyVar.c;
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        djrm djrmVar2 = (djrm) bZ2.b;
        dspdVar.getClass();
        djrmVar2.a |= 131072;
        djrmVar2.s = dspdVar;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dvhw dvhwVar = (dvhw) bZ.b;
        djrm bK = bZ2.bK();
        bK.getClass();
        dvhwVar.d = bK;
        dvhwVar.a |= 4;
        adgrVar.b(bZ.bK());
        if (!this.b.c()) {
            return dcdc.e();
        }
        return dcdc.f(cqgr.fT(new adgp(), this.b));
    }

    @Override // defpackage.aczy
    public final boolean b() {
        return false;
    }

    @Override // defpackage.aczy
    public final boolean c() {
        return false;
    }

    @Override // defpackage.aczy
    public final boolean d() {
        return false;
    }

    @Override // defpackage.aczy
    public final boolean e() {
        return false;
    }

    @Override // defpackage.aczy
    public final boolean f() {
        return false;
    }

    @Override // defpackage.adab
    public final Set<awvv<?>> g() {
        return dcmr.a;
    }

    @Override // defpackage.adab
    public final Set<awvv<?>> h() {
        return dcmr.a;
    }

    @Override // defpackage.adab
    public final void i(awwb awwbVar) {
    }

    @Override // defpackage.adab
    public final void j(awwb awwbVar) {
    }
}
