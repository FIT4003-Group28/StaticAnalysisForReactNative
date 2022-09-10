package defpackage;

import java.util.ArrayList;
/* renamed from: aeji  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aeji implements cqlc {
    static final cqlc a = new aeji();

    private aeji() {
    }

    @Override // defpackage.cqlc
    public final Object a(cqkp cqkpVar) {
        aekg aekgVar = (aekg) cqkpVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cqgr.fT(new aejm(), aekgVar));
        arrayList.add(cqgr.fT(new aejo(), aekgVar));
        arrayList.addAll(aekgVar.i());
        return arrayList;
    }

    @Override // defpackage.cqlc
    public final boolean b() {
        return false;
    }
}
