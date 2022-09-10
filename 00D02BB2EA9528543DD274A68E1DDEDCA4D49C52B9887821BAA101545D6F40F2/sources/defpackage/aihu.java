package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aihu  reason: default package */
/* loaded from: classes2.dex */
public final class aihu implements aihc<ailz, aihs, aihw> {
    private final ahvi a;

    public aihu(ahvi ahviVar) {
        this.a = ahviVar;
    }

    @Override // defpackage.aihc
    public final dssr<ailz> a() {
        return (dssr) ailz.b.cu(7);
    }

    @Override // defpackage.aihc
    public final dcdc<aihs> b(List<aihs> list) {
        return dcdc.r(list);
    }

    @Override // defpackage.aihc
    public final dcdc<aihs> c(List<dspd> list) {
        dbsg i;
        dccx F = dcdc.F();
        for (dspd dspdVar : list) {
            try {
                aimf aimfVar = (aimf) dsqw.cp(aimf.e, dspdVar);
                int i2 = aimfVar.b;
                if (i2 == 2) {
                    i = dbsg.i(aihq.c(aimfVar));
                } else if (i2 == 3) {
                    i = dbsg.i(aiht.c(aimfVar));
                } else {
                    i = i2 == 4 ? dbsg.i(aihp.c(aimfVar)) : dbpy.a;
                }
                if (i.a()) {
                    F.g((aihs) i.b());
                }
            } catch (dsrm e) {
                throw new IllegalArgumentException(e);
            }
        }
        return F.f();
    }

    @Override // defpackage.aihc
    public final dcdc<dspd> d(List<aihs> list) {
        return dcdc.q(dcft.o(list, aiho.a));
    }

    @Override // defpackage.aihc
    public final /* bridge */ /* synthetic */ aihw e(dbsg<ailz> dbsgVar, List<aihs> list) {
        ahvi ahviVar = this.a;
        dccx F = dcdc.F();
        int i = 0;
        for (dqzv dqzvVar : dbsgVar.c(ailz.b).a) {
            dbsg<ahwg> h = ahwg.h(dqzvVar, ahviVar, false, dbpy.a);
            if (h.a()) {
                F.g(aihr.c(h.b(), dbpy.a));
            } else {
                i++;
            }
        }
        dbsi a = dbsi.a(F.f(), Integer.valueOf(i));
        List<aihr> list2 = (List) a.a;
        for (aihs aihsVar : list) {
            list2 = aihsVar.a(list2, this.a);
        }
        return new aihw(dcdc.q(dcft.o(list2, aihn.a)), ((Integer) a.b).intValue());
    }
}
