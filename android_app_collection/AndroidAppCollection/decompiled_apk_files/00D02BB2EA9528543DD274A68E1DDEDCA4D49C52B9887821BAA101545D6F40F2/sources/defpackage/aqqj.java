package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aqqj  reason: default package */
/* loaded from: classes2.dex */
public final class aqqj extends cqiw<aqqm> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aqqm aqqmVar, Context context, cqiv cqivVar) {
        dcdc<aqql> a = aqqmVar.a();
        int size = a.size();
        for (int i2 = 0; i2 < size; i2++) {
            aqql aqqlVar = a.get(i2);
            int b = aqqlVar.b();
            int i3 = b - 1;
            if (b == 0) {
                throw null;
            }
            if (i3 == 0) {
                if (cqivVar.i() > 0) {
                    cqivVar.c(ict.p(false, new cqmp[0]));
                }
                cqivVar.a(new aqqh(), new aqqf(aqqlVar.a()));
            } else if (i3 == 1) {
                cqivVar.a(new aqqd(), aqqlVar.c());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aqqm> a() {
        return cqgr.fY(cqgr.bp(-1), cqgr.cd(-1), jih.a(C(), cqgr.bp(-1), cqgr.cd(-1), cqqx.F(), cqgr.ep(false)));
    }
}
