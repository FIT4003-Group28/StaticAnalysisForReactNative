package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: grw  reason: default package */
/* loaded from: classes6.dex */
public final class grw extends cqiw<izw> {
    private final boolean a;

    public grw() {
        this(false);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, izw izwVar, Context context, cqiv cqivVar) {
        List<izx> c = izwVar.c();
        for (izx izxVar : c) {
            cqivVar.a(new gsi(Integer.valueOf(c.size()), this.a), izxVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<izw> a() {
        cqmp[] cqmpVarArr = new cqmp[4];
        cqmpVarArr[0] = cqgr.cd(-1);
        cqmpVarArr[1] = iue.c(grv.a);
        cqmpVarArr[2] = this.a ? cqmn.a(cqgr.bR(cqrp.d(8.0d)), cqgr.bG(cqrp.d(8.0d))) : cqmp.e;
        cqmpVarArr[3] = cqgr.ck(C());
        return grg.a(cqmpVarArr);
    }

    public grw(boolean z) {
        super(Boolean.valueOf(z));
        this.a = z;
    }
}
