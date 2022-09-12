package defpackage;
/* compiled from: PG */
/* renamed from: cjrd  reason: default package */
/* loaded from: classes4.dex */
class cjrd implements dbrn<dndc, deai> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ deai a(dndc dndcVar) {
        dndc dndcVar2 = dndcVar;
        deah bZ = deai.f.bZ();
        int i = 1;
        if ((dndcVar2.a & 2) != 0) {
            int i2 = dndcVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deai deaiVar = (deai) bZ.b;
            deaiVar.a |= 1;
            deaiVar.b = i2;
        }
        if ((dndcVar2.a & 4) != 0) {
            int i3 = dndcVar2.d;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deai deaiVar2 = (deai) bZ.b;
            deaiVar2.a |= 2;
            deaiVar2.c = i3;
        }
        if ((dndcVar2.a & 8) != 0) {
            int i4 = dndcVar2.e;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deai deaiVar3 = (deai) bZ.b;
            deaiVar3.a |= 4;
            deaiVar3.d = i4;
        }
        if ((dndcVar2.a & 1) != 0) {
            int a = dndf.a(dndcVar2.b);
            if (a != 0) {
                i = a;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            deai deaiVar4 = (deai) bZ.b;
            deaiVar4.e = i - 1;
            deaiVar4.a |= 8;
        }
        return bZ.bK();
    }
}
