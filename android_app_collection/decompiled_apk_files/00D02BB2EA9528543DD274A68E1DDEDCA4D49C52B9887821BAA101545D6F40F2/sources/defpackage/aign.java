package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aign  reason: default package */
/* loaded from: classes2.dex */
public final class aign implements aihc<ailh, aigm, aigo> {
    private final ahvi a;

    public aign(ahvi ahviVar) {
        this.a = ahviVar;
    }

    @Override // defpackage.aihc
    public final dssr<ailh> a() {
        return (dssr) ailh.b.cu(7);
    }

    @Override // defpackage.aihc
    public final dcdc<aigm> b(List<aigm> list) {
        return dcdc.r(list);
    }

    @Override // defpackage.aihc
    public final dcdc<aigm> c(List<dspd> list) {
        dbsg dbsgVar;
        dccx F = dcdc.F();
        for (dspd dspdVar : list) {
            try {
                aill aillVar = (aill) dsqw.cp(aill.e, dspdVar);
                if (aillVar.b == 2) {
                    dbsgVar = dbsg.i(aigl.c(aillVar));
                } else {
                    dbsgVar = dbpy.a;
                }
                if (dbsgVar.a()) {
                    F.g((aigm) dbsgVar.b());
                }
            } catch (dsrm e) {
                throw new IllegalArgumentException(e);
            }
        }
        return F.f();
    }

    @Override // defpackage.aihc
    public final dcdc<dspd> d(List<aigm> list) {
        dccx F = dcdc.F();
        for (aigm aigmVar : list) {
            F.g(aigmVar.b().bR());
        }
        return F.f();
    }

    @Override // defpackage.aihc
    public final /* bridge */ /* synthetic */ aigo e(dbsg<ailh> dbsgVar, List<aigm> list) {
        ailh c = dbsgVar.c(ailh.b);
        for (aigm aigmVar : list) {
            c = aigmVar.a(c);
        }
        return new aigo(c, this.a);
    }
}
