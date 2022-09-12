package defpackage;
/* renamed from: spx  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class spx implements dbrn {
    static final dbrn a = new spx();

    private spx() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        sph sphVar = (sph) obj;
        dntt bZ = dntu.e.bZ();
        dqvj c = sphVar.a().b().c();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dntu dntuVar = (dntu) bZ.b;
        dntuVar.b = c.k;
        dntuVar.a |= 1;
        String a2 = sphVar.a().a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dntu dntuVar2 = (dntu) bZ.b;
        a2.getClass();
        dntuVar2.a |= 4;
        dntuVar2.d = a2;
        if (sphVar.a().b().c() == dqvj.TRANSIT) {
            drbu bZ2 = drbv.d.bZ();
            dspd d = sphVar.a().b().d();
            dbsk.s(d);
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            drbv drbvVar = (drbv) bZ2.b;
            d.getClass();
            int i = drbvVar.a | 1;
            drbvVar.a = i;
            drbvVar.b = d;
            drbvVar.a = i | 4;
            drbvVar.c = true;
            drbv bK = bZ2.bK();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dntu dntuVar3 = (dntu) bZ.b;
            bK.getClass();
            dntuVar3.c = bK;
            dntuVar3.a |= 2;
        }
        return bZ.bK();
    }
}
