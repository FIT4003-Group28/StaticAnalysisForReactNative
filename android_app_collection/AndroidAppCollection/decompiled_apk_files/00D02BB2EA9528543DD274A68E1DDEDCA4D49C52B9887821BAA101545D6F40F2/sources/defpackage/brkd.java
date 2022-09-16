package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: brkd  reason: default package */
/* loaded from: classes4.dex */
public final class brkd extends cqiw<jba> {
    final /* synthetic */ cqmp[] a;
    final /* synthetic */ brkj b;

    public brkd(brkj brkjVar, cqmp[] cqmpVarArr) {
        this.b = brkjVar;
        this.a = cqmpVarArr;
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, jba jbaVar, Context context, cqiv cqivVar) {
        List<jaz> X = jbaVar.X();
        if (X.isEmpty()) {
            return;
        }
        cqivVar.f(new brji(this.b.a()), X);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<jba> a() {
        cqmj<jba> gd = cqgr.gd(cqic.d(B().W(), new cqmp[0]), cqgr.dr(1), cqgr.ck(C()));
        gd.f(this.a);
        return gd;
    }
}
