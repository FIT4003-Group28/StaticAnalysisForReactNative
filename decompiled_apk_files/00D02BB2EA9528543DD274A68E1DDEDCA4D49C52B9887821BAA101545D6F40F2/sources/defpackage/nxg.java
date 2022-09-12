package defpackage;

import java.util.ArrayList;
/* renamed from: nxg  reason: default package */
/* loaded from: classes7.dex */
final /* synthetic */ class nxg implements dbty {
    static final dbty a = new nxg();

    private nxg() {
    }

    @Override // defpackage.dbty
    public final Object a() {
        nxf[] values;
        dbyv N = dbyv.N();
        for (nxf nxfVar : nxf.values()) {
            if (nxfVar.aI) {
                N.n(nxfVar.aG, nxfVar.aH);
            }
        }
        ArrayList a2 = dchl.a();
        for (K k : N.J()) {
            dtij bZ = dtik.e.bZ();
            bZ.a(k);
            for (dtle dtleVar : N.f(k)) {
                bZ.b(dtleVar);
            }
            a2.add(bZ.bK());
        }
        a2.addAll(nxh.a);
        return a2;
    }
}
