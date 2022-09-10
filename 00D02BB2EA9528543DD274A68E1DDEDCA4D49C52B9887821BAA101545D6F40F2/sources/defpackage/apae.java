package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
/* compiled from: PG */
/* renamed from: apae  reason: default package */
/* loaded from: classes2.dex */
public final class apae extends cqiw<aphu> {
    private static final cqrp a = cqrp.d(8.0d);
    private final ckln<aphu> b = new ckln<>();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aphu aphuVar, Context context, cqiv cqivVar) {
        aphu aphuVar2 = aphuVar;
        cklj b = this.b.b(cqivVar, 1, a.e(context));
        b.d(new apan(), aphuVar2.a());
        b.a(new aoyo(), aphuVar2.b());
        b.a(new aoyn(), aphuVar2.c());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aphu> a() {
        return GmmRecyclerView.aw(C(), cqgr.aT(apkj.a), ckln.a(this.b), cqgr.ep(false), cqgr.cd(-1), cqgr.bp(-2));
    }
}
