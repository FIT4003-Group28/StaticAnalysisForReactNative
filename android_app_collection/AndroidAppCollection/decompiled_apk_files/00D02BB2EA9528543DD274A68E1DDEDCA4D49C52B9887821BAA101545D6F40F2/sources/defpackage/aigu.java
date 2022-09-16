package defpackage;

import com.google.android.apps.gmm.locationsharing.api.PersonId;
import java.util.List;
/* compiled from: PG */
/* renamed from: aigu  reason: default package */
/* loaded from: classes2.dex */
public final class aigu implements aihc<ailn, aigt, aiky> {
    private final dxio<dkog> a;

    public aigu(dxio<dkog> dxioVar) {
        this.a = dxioVar;
    }

    public static aigt f(PersonId personId, long j) {
        return new aigt(ailp.RPC_FAILED, new eapd(j), personId);
    }

    @Override // defpackage.aihc
    public final dssr<ailn> a() {
        return (dssr) ailn.b.cu(7);
    }

    @Override // defpackage.aihc
    public final dcdc<aigt> b(List<aigt> list) {
        return dcdc.r(list);
    }

    @Override // defpackage.aihc
    public final dcdc<aigt> c(List<dspd> list) {
        dccx F = dcdc.F();
        for (dspd dspdVar : list) {
            try {
                ailr ailrVar = (ailr) dsqw.cp(ailr.e, dspdVar);
                ajja ajjaVar = ailrVar.c;
                if (ajjaVar == null) {
                    ajjaVar = ajja.d;
                }
                dbsg i = PersonId.j(ajjaVar) == null ? dbpy.a : dbsg.i(aigt.a(ailrVar));
                if (i.a()) {
                    F.g((aigt) i.b());
                }
            } catch (dsrm e) {
                throw new IllegalArgumentException(e);
            }
        }
        return F.f();
    }

    @Override // defpackage.aihc
    public final dcdc<dspd> d(List<aigt> list) {
        dccx F = dcdc.F();
        for (aigt aigtVar : list) {
            ailq bZ = ailr.e.bZ();
            long j = aigtVar.a.a;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ailr ailrVar = (ailr) bZ.b;
            ailrVar.a |= 1;
            ailrVar.b = j;
            ajja i = aigtVar.c.i();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            ailr ailrVar2 = (ailr) bZ.b;
            i.getClass();
            ailrVar2.c = i;
            int i2 = ailrVar2.a | 2;
            ailrVar2.a = i2;
            ailrVar2.d = aigtVar.d.e;
            ailrVar2.a = i2 | 4;
            F.g(bZ.bK().bR());
        }
        return F.f();
    }

    @Override // defpackage.aihc
    public final /* bridge */ /* synthetic */ aiky e(dbsg<ailn> dbsgVar, List<aigt> list) {
        ailn c = dbsgVar.c(ailn.b);
        for (aigt aigtVar : list) {
            ailm bZ = ailn.b.bZ();
            ajja i = aigtVar.c.i();
            boolean z = false;
            for (ailr ailrVar : c.a) {
                ajja ajjaVar = ailrVar.c;
                if (ajjaVar == null) {
                    ajjaVar = ajja.d;
                }
                if (i.equals(ajjaVar)) {
                    ailp ailpVar = aigtVar.d;
                    ailp b = ailp.b(ailrVar.d);
                    if (b == null) {
                        b = ailp.TYPE_UNSPECIFIED;
                    }
                    if (ailpVar == b) {
                        if (aigtVar.a.I(ailrVar.b)) {
                            ailq bZ2 = ailr.e.bZ();
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            ailr ailrVar2 = (ailr) bZ2.b;
                            i.getClass();
                            ailrVar2.c = i;
                            int i2 = ailrVar2.a | 2;
                            ailrVar2.a = i2;
                            long j = aigtVar.a.a;
                            int i3 = i2 | 1;
                            ailrVar2.a = i3;
                            ailrVar2.b = j;
                            ailrVar2.d = aigtVar.d.e;
                            ailrVar2.a = i3 | 4;
                            bZ.a(bZ2.bK());
                        } else {
                            bZ.a(ailrVar);
                        }
                        z = true;
                    }
                }
                bZ.a(ailrVar);
            }
            if (!z) {
                ailq bZ3 = ailr.e.bZ();
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                ailr ailrVar3 = (ailr) bZ3.b;
                i.getClass();
                ailrVar3.c = i;
                int i4 = ailrVar3.a | 2;
                ailrVar3.a = i4;
                long j2 = aigtVar.a.a;
                int i5 = i4 | 1;
                ailrVar3.a = i5;
                ailrVar3.b = j2;
                ailrVar3.d = aigtVar.d.e;
                ailrVar3.a = i5 | 4;
                bZ.a(bZ3.bK());
            }
            c = bZ.bK();
        }
        return new aigv(c, this.a.a().w);
    }
}
