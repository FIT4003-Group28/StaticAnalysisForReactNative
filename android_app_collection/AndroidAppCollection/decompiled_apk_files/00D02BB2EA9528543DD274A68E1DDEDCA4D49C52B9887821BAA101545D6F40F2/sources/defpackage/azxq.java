package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: azxq  reason: default package */
/* loaded from: classes.dex */
final class azxq extends azxm<azwa> {
    @Override // defpackage.azxm
    public final azxl b() {
        return azxl.ELECTRIC_VEHICLE_PROFILE;
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ azwh<azwa> c(byte[] bArr) {
        try {
            return new azvz((dokb) dsqw.cq(dokb.i, bArr));
        } catch (dsrm e) {
            throw new RuntimeException("Failed to parse raw data to a proto.", e);
        }
    }

    @Override // defpackage.azxm
    public final /* bridge */ /* synthetic */ byte[] f(azwa azwaVar) {
        return azwaVar.j().bS();
    }

    @Override // defpackage.azxm
    public final List<azwj> d(doiz doizVar) {
        dohw dohwVar;
        if (doizVar.b != 17) {
            return dcdc.e();
        }
        dccx dccxVar = new dccx();
        if (doizVar.b == 17) {
            dohwVar = (dohw) doizVar.c;
        } else {
            dohwVar = dohw.b;
        }
        for (dokf dokfVar : dohwVar.a) {
            int a = doke.a(dokfVar.b);
            if (a != 0 && a == 3) {
                dokb dokbVar = dokfVar.c;
                if (dokbVar == null) {
                    dokbVar = dokb.i;
                }
                if ((dokbVar.a & 1) != 0) {
                    dccxVar.g(azwj.a(azxm.i, dokbVar.b));
                }
            }
        }
        return dccxVar.f();
    }

    @Override // defpackage.azxm
    public final List<azwa> e(doiz doizVar) {
        dohw dohwVar;
        if (doizVar.b != 17) {
            return dcdc.e();
        }
        dccx dccxVar = new dccx();
        if (doizVar.b == 17) {
            dohwVar = (dohw) doizVar.c;
        } else {
            dohwVar = dohw.b;
        }
        for (dokf dokfVar : dohwVar.a) {
            int a = doke.a(dokfVar.b);
            if (a != 0 && a == 2) {
                dokb dokbVar = dokfVar.c;
                if (dokbVar == null) {
                    dokbVar = dokb.i;
                }
                if ((dokbVar.a & 1) != 0 && !dokbVar.b.isEmpty()) {
                    dccxVar.g(new azvz(dokbVar).b());
                }
            }
        }
        return dccxVar.f();
    }
}
