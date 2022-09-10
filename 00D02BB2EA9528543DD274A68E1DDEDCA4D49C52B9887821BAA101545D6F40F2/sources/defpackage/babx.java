package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.List;
/* compiled from: PG */
/* renamed from: babx  reason: default package */
/* loaded from: classes3.dex */
final class babx extends cqiw<baes> {
    private static cqjb<baes, abp> e(final boolean z) {
        return new cqjb(z) { // from class: babw
            private final boolean a;

            {
                this.a = z;
            }

            @Override // defpackage.cqjb
            public final Object a(cqkp cqkpVar, Context context) {
                baes baesVar = (baes) cqkpVar;
                return new babu(context, this.a, cqtt.k(ibl.az(), cqrp.d(1.0d)), cqrp.d(1.0d), ibn.o());
            }
        };
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, baes baesVar, Context context, cqiv cqivVar) {
        baes baesVar2 = baesVar;
        List<? extends bayj> a = baesVar2.a();
        if (i == 0) {
            if (a.size() < baesVar2.e()) {
                cqivVar.f(new baxb(cqrp.d(8.0d)), a);
            } else {
                cqivVar.f(new baxb(cqrp.d(8.0d)), a.subList(0, Math.min(a.size(), baesVar2.f())));
            }
        } else if (i == 1) {
            if (a.size() < baesVar2.e()) {
                return;
            }
            cqivVar.f(new baxb(cqrp.d(8.0d)), a.subList(baesVar2.f(), a.size()));
            cqivVar.a(new babr(), baesVar2.d());
        } else if (i != 2) {
            bvoo.h("unexpected list type=%d", Integer.valueOf(i));
        } else if (a.size() < baesVar2.e()) {
        } else {
            cqivVar.a(new babr(), baesVar2.c());
        }
    }

    @Override // defpackage.cqiw
    public final cqmj<baes> a() {
        return cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), GmmRecyclerView.aw(D(0), cqgr.dr(1), cqqx.p(null), cqqx.K(e(true))), new cqmh(jin.class, cqjv.g(jil.SELECTED_CHILD_INDEX, babv.a, jin.b), GmmRecyclerView.aw(D(2), cqgr.cd(-1), cqgr.dr(1), cqqx.p(null), cqqx.K(e(false))), GmmRecyclerView.aw(D(1), cqgr.cd(-1), cqgr.dr(1), cqqx.p(null), cqqx.K(e(false)))));
    }
}
