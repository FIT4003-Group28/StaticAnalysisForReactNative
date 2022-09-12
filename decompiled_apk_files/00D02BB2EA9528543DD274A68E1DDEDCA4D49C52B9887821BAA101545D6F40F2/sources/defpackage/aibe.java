package defpackage;

import com.google.ar.core.ImageMetadata;
/* renamed from: aibe  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aibe implements dbrn {
    static final dbrn a = new aibe();

    private aibe() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        amun amunVar = (amun) obj;
        dpcp bZ = dpdq.x.bZ();
        dozc dozcVar = dozc.NONE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpdq dpdqVar = (dpdq) bZ.b;
        dpdqVar.u = dozcVar.d;
        dpdqVar.a |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
        dpdp dpdpVar = dpdp.TURN_UNKNOWN;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpdq dpdqVar2 = (dpdq) bZ.b;
        dpdqVar2.h = dpdpVar.j;
        dpdqVar2.a |= 64;
        dpdn dpdnVar = dpdn.SIDE_UNSPECIFIED;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpdq dpdqVar3 = (dpdq) bZ.b;
        dpdqVar3.i = dpdnVar.d;
        dpdqVar3.a |= 128;
        dgau dgauVar = amunVar.a;
        if (dgauVar == null) {
            dgauVar = dgau.MANEUVER_UNKNOWN;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dpdq dpdqVar4 = (dpdq) bZ.b;
        dpdqVar4.g = dgauVar.F;
        int i = dpdqVar4.a | 32;
        dpdqVar4.a = i;
        int i2 = amunVar.h;
        dpdqVar4.a = i | 4096;
        dpdqVar4.q = i2;
        return bZ.bK();
    }
}
