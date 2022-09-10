package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: PG */
/* renamed from: bfty  reason: default package */
/* loaded from: classes3.dex */
public final class bfty extends cqiw<bfub> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bfub bfubVar, Context context, cqiv cqivVar) {
        bftv bftvVar;
        List<bfua> a;
        bfub bfubVar2 = bfubVar;
        if (i == 1) {
            bftvVar = new bftv();
            a = bfubVar2.a();
        } else if (i != 2) {
            return;
        } else {
            bftvVar = new bftv();
            a = bfubVar2.b();
        }
        cqivVar.f(bftvVar, a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bfub> a() {
        Float valueOf = Float.valueOf(1.0f);
        return cqgr.gd(cqgr.gd(cqgr.cd(0), cqgr.ca(valueOf), jgi.e(ibn.f()), cqgr.dr(1), cqgr.ck(D(1))), cqgr.gd(cqgr.cd(0), cqgr.ca(valueOf), jgi.e(ibn.f()), cqgr.dr(1), cqgr.ck(D(2))));
    }
}
