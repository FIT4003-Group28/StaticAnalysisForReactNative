package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cknc  reason: default package */
/* loaded from: classes4.dex */
public final class cknc extends cknw {
    private static final dcqe a = dcqe.c("cknc");

    public cknc(@dzsi ilo iloVar, boolean z, boolean z2, boolean z3, boolean z4, List<drbz> list) {
        super(iloVar, z, z2, z3, z4, list);
    }

    public final dwge c(akqi akqiVar, dspd dspdVar, int i, @dzsi String str, int i2, int i3) {
        if (i2 <= 0 || i3 <= 0) {
            bvoo.h("Thumbnail size (width = %d, height = %d) is not valid", Integer.valueOf(i2), Integer.valueOf(i3));
            return dwge.m;
        }
        dwge a2 = a(akqiVar, i, str, i2, i3);
        dsqp dsqpVar = (dsqp) a2.cu(5);
        dsqpVar.bC(a2);
        dwfy dwfyVar = (dwfy) dsqpVar;
        dwfz bZ = dwgd.g.bZ();
        dwgb bZ2 = dwgc.c.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dwgc dwgcVar = (dwgc) bZ2.b;
        dspdVar.getClass();
        dwgcVar.a |= 1;
        dwgcVar.b = dspdVar;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwgd dwgdVar = (dwgd) bZ.b;
        dwgc bK = bZ2.bK();
        bK.getClass();
        dwgdVar.c = bK;
        dwgdVar.a |= 2;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dwgd dwgdVar2 = (dwgd) bZ.b;
        dwgdVar2.b = 1;
        dwgdVar2.a |= 1;
        if (dwfyVar.c) {
            dwfyVar.bF();
            dwfyVar.c = false;
        }
        dwge dwgeVar = (dwge) dwfyVar.b;
        dwgd bK2 = bZ.bK();
        dwge dwgeVar2 = dwge.m;
        bK2.getClass();
        dwgeVar.i = bK2;
        dwgeVar.a |= 256;
        return dwfyVar.bK();
    }
}
