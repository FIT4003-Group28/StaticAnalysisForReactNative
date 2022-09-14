package defpackage;
/* renamed from: cedn  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cedn implements dbrn {
    static final dbrn a = new cedn();

    private cedn() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        cfgc cfgcVar = (cfgc) obj;
        dkff bZ = dkfg.d.bZ();
        dspd dspdVar = cfgcVar.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkfg dkfgVar = (dkfg) bZ.b;
        dspdVar.getClass();
        dkfgVar.a |= 1;
        dkfgVar.b = dspdVar;
        dpum dpumVar = cfgcVar.c;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dkfg dkfgVar2 = (dkfg) bZ.b;
        dpumVar.getClass();
        dkfgVar2.c = dpumVar;
        dkfgVar2.a |= 2;
        return bZ.bK();
    }
}
