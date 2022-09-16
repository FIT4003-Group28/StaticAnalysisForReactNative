package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: aqtp  reason: default package */
/* loaded from: classes2.dex */
public final class aqtp extends cqiw<aquy> {
    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, aquy aquyVar, Context context, cqiv cqivVar) {
        aquy aquyVar2 = aquyVar;
        if (aquyVar2.b()) {
            aquyVar2.d().isEmpty();
        }
        if (aquyVar2.b() && !aquyVar2.d().isEmpty() && aquyVar2.c() && !aquyVar2.a().isEmpty()) {
            cqivVar.c(ict.p(false, cqgr.bD(ibn.o())));
        }
        if (aquyVar2.c()) {
            List<aqur> a = aquyVar2.a();
            if (aquyVar2.e().booleanValue()) {
                cqivVar.a(new aqth(), new aqve(context.getString(R.string.MESSAGING_SETTINGS_BUSINESS_CATEGORY_HEADER_TEXT)));
                for (aqur aqurVar : a) {
                    aqtq.b(cqivVar, aqurVar.c());
                }
                return;
            }
            aqur aqurVar2 = (aqur) dcft.r(a, null);
            if (aqurVar2 == null) {
                return;
            }
            List<aquu> c = aqurVar2.b().c();
            if (c.isEmpty()) {
                return;
            }
            cqivVar.a(new aqth(), new aqve(aqurVar2.a()));
            aqtq.a(cqivVar, c);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<aquy> a() {
        return cqgr.fY(cqgr.cd(-1), cqgr.bp(-2), cqgr.z(ibm.b()), cqgr.dU(ibn.o()), cqgr.dB(ibn.o()), cqgr.P(false), cqgr.L(false), cqgr.fY(cqgr.cd(-1), cqgr.bp(-1), cqgr.aI(aqto.a), cqgr.z(cqta.f()), cqgr.dd(), cqgr.az(true), cqgr.ap(ibn.n()), itj.s(cqgr.cd(-2), cqgr.bp(-2), cqgr.bw(17), cqgr.fI(0))), GmmRecyclerView.aw(C(), cqgr.bp(-2), cqgr.cd(-1), cqgr.ep(false), cqgr.P(false)));
    }
}
