package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ujh  reason: default package */
/* loaded from: classes7.dex */
public final class ujh extends cqiw<uma> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final /* bridge */ /* synthetic */ cqiv NL(int i, uma umaVar, Context context) {
        umc umcVar;
        cqiw ulzVar;
        cqiv cqivVar = new cqiv();
        for (umc umcVar2 : umaVar.f()) {
            if (umcVar2 instanceof ume) {
                umcVar = (ume) umcVar2;
                ulzVar = new ulz();
            } else if (umcVar2 instanceof umd) {
                umcVar = (umd) umcVar2;
                ulzVar = new ukl();
            }
            cqivVar.a(ulzVar, umcVar);
        }
        return cqivVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<uma> a() {
        return hye.b(cqgr.cd(-1), cqgr.bp(-2), cqgr.bA(ibn.f()), cqgr.z(ibm.b()), cqgr.fY(cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), cqgr.ck(C()))));
    }
}
