package defpackage;
/* compiled from: PG */
/* renamed from: wjy  reason: default package */
/* loaded from: classes7.dex */
class wjy implements dbrn<dooy, djys> {
    @Override // defpackage.dbrn
    public final /* bridge */ /* synthetic */ djys a(dooy dooyVar) {
        dooy dooyVar2 = dooyVar;
        djyr bZ = djys.g.bZ();
        if ((dooyVar2.a & 1) != 0) {
            String str = dooyVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djys djysVar = (djys) bZ.b;
            str.getClass();
            djysVar.a |= 1;
            djysVar.b = str;
        }
        if ((dooyVar2.a & 2) != 0) {
            String str2 = dooyVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djys djysVar2 = (djys) bZ.b;
            str2.getClass();
            djysVar2.a |= 2;
            djysVar2.c = str2;
        }
        if ((dooyVar2.a & 4) != 0) {
            doos b = doos.b(dooyVar2.d);
            if (b == null) {
                b = doos.PNG;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djys djysVar3 = (djys) bZ.b;
            djysVar3.d = b.c;
            djysVar3.a |= 4;
        }
        if ((dooyVar2.a & 8) != 0) {
            dhkd dhkdVar = dooyVar2.e;
            if (dhkdVar == null) {
                dhkdVar = dhkd.d;
            }
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djys djysVar4 = (djys) bZ.b;
            dhkdVar.getClass();
            djysVar4.e = dhkdVar;
            djysVar4.a |= 8;
        }
        if ((dooyVar2.a & 16) != 0) {
            int i = dooyVar2.f;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            djys djysVar5 = (djys) bZ.b;
            djysVar5.a |= 16;
            djysVar5.f = i;
        }
        return bZ.bK();
    }
}
