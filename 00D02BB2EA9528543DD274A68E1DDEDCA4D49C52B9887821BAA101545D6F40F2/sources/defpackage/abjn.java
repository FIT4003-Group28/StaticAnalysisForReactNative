package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: abjn  reason: default package */
/* loaded from: classes2.dex */
public final class abjn extends cqiw<abqn> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, abqn abqnVar, Context context, cqiv cqivVar) {
        List<abql> Pd = abqnVar.Pd();
        for (int i2 = 0; i2 < Pd.size(); i2++) {
            cqivVar.a(new abjm(abjc.g(i2)), Pd.get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<abqn> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(0), cqgr.bR(ibn.d()), cqgr.bG(ibn.d()), cqgr.ck(C()), iue.c(abjj.a));
    }
}
