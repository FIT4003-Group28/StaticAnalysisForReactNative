package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdpm  reason: default package */
/* loaded from: classes4.dex */
public class cdpm extends dbrh<docl, dmbn> {
    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ docl b(dmbn dmbnVar) {
        dmbn dmbnVar2 = dmbnVar;
        doci bZ = docl.d.bZ();
        for (dmbm dmbmVar : dmbnVar2.b) {
            dock NV = cdps.d().k().NV(dmbmVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            docl doclVar = (docl) bZ.b;
            NV.getClass();
            dsrj<dock> dsrjVar = doclVar.b;
            if (!dsrjVar.a()) {
                doclVar.b = dsqw.cl(dsrjVar);
            }
            doclVar.b.add(NV);
        }
        if ((dmbnVar2.a & 1) != 0) {
            double d = dmbnVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            docl doclVar2 = (docl) bZ.b;
            doclVar2.a |= 1;
            doclVar2.c = d;
        }
        return bZ.bK();
    }

    @Override // defpackage.dbrh
    protected final /* bridge */ /* synthetic */ dmbn c(docl doclVar) {
        docl doclVar2 = doclVar;
        dmbk bZ = dmbn.d.bZ();
        for (dock dockVar : doclVar2.b) {
            dmbm NV = cdps.d().NV(dockVar);
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmbn dmbnVar = (dmbn) bZ.b;
            NV.getClass();
            dsrj<dmbm> dsrjVar = dmbnVar.b;
            if (!dsrjVar.a()) {
                dmbnVar.b = dsqw.cl(dsrjVar);
            }
            dmbnVar.b.add(NV);
        }
        if ((doclVar2.a & 1) != 0) {
            double d = doclVar2.c;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmbn dmbnVar2 = (dmbn) bZ.b;
            dmbnVar2.a |= 1;
            dmbnVar2.c = d;
        }
        return bZ.bK();
    }
}
