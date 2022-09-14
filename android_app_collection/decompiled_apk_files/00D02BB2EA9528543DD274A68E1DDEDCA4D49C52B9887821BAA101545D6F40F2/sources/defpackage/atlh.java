package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: atlh  reason: default package */
/* loaded from: classes2.dex */
public final class atlh extends cqiw<atna> {
    public static final /* synthetic */ int a = 0;

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, atna atnaVar, Context context, cqiv cqivVar) {
        atna atnaVar2 = atnaVar;
        atnh ar = atnaVar2.ar();
        if (atnaVar2.s().booleanValue()) {
            vch vchVar = new vch();
            zcr a2 = ar.a();
            dbsk.s(a2);
            cqivVar.a(vchVar, a2);
        }
        List<? extends zbh> b = ar.b();
        if (b.isEmpty()) {
            return;
        }
        List<zcd> a3 = b.get(0).a();
        for (int i2 = 0; i2 < a3.size(); i2++) {
            if (i2 == 0) {
                atjq atjqVar = new atjq();
                atnf e = ar.e();
                dbsk.s(e);
                cqivVar.a(atjqVar, e);
            } else {
                zcd zcdVar = a3.get(i2);
                cqivVar.a(new atjg(), zcdVar);
                cqivVar.a(new atjh(), zcdVar);
            }
        }
        for (int i3 = 1; i3 < b.size(); i3++) {
            zbh zbhVar = b.get(i3);
            List<zcd> a4 = zbhVar.a();
            int i4 = 0;
            while (i4 < a4.size()) {
                zcd zcdVar2 = a4.get(i4);
                if (i4 == 0) {
                    if (!zbhVar.e().booleanValue()) {
                        cqivVar.a(new atjf(), zbhVar);
                    }
                    i4 = 0;
                }
                if (zbhVar.e().booleanValue()) {
                    cqivVar.a(new atjg(), zcdVar2);
                    cqivVar.a(new atjh(), zcdVar2);
                }
                i4++;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<atna> a() {
        return acnp.a(athe.e(), cqgr.ep(false), cqgr.af(null), cqjv.l(atlf.a, cqgr.x(ibl.b()), cqgr.x(ibl.a())), GmmRecyclerView.aw(C(), cqgr.bp(-2), cqgr.cd(-1), cqgr.dE(atlg.a), cqgr.P(false)));
    }
}
