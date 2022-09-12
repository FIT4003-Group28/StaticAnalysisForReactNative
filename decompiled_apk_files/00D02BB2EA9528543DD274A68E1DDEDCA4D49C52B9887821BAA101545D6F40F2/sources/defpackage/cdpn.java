package defpackage;
/* compiled from: PG */
/* renamed from: cdpn  reason: default package */
/* loaded from: classes4.dex */
class cdpn extends dbrh<dock, dmbm> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dock b(dmbm dmbmVar) {
        dmbm dmbmVar2 = dmbmVar;
        docj bZ = dock.c.bZ();
        if ((dmbmVar2.a & 1) != 0) {
            String str = dmbmVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dock dockVar = (dock) bZ.b;
            str.getClass();
            dockVar.a |= 1;
            dockVar.b = str;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dmbm c(dock dockVar) {
        dock dockVar2 = dockVar;
        dmbl bZ = dmbm.c.bZ();
        if ((dockVar2.a & 1) != 0) {
            String str = dockVar2.b;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmbm dmbmVar = (dmbm) bZ.b;
            str.getClass();
            dmbmVar.a |= 1;
            dmbmVar.b = str;
        }
        return bZ.bK();
    }
}
