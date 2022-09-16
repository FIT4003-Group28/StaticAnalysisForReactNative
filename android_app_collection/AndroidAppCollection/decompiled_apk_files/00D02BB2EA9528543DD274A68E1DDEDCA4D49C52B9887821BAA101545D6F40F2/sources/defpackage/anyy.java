package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: anyy  reason: default package */
/* loaded from: classes2.dex */
public final class anyy extends cqiw<anzn> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, anzn anznVar, Context context, cqiv cqivVar) {
        Object obj;
        cqiw anwhVar;
        anzn anznVar2 = anznVar;
        int size = anznVar2.h().size();
        if (size > 1) {
            cqivVar.a(new anyx(), anznVar2);
        }
        if (anznVar2.j().booleanValue() || size <= 1) {
            dcdc<cqkp> h = anznVar2.h();
            int size2 = h.size();
            for (int i2 = 0; i2 < size2; i2++) {
                Object obj2 = (cqkp) h.get(i2);
                if (obj2 instanceof antv) {
                    obj = (antv) obj2;
                    anwhVar = new antu();
                } else if (obj2 instanceof anxw) {
                    obj = (anxw) obj2;
                    anwhVar = new anwh();
                }
                cqivVar.a(anwhVar, obj);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<anzn> a() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.fP(new anza(), anyt.a, new cqmp[0]), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C())));
    }
}
