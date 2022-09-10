package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ceik  reason: default package */
/* loaded from: classes4.dex */
public final class ceik extends cqiw<cesu> {
    public static final cqjg a = cqjg.a();
    public static final cqjg b = cqjg.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends cqkp> cqmj<T> e(cqlc<T, String> cqlcVar, cqlc<T, cjtd> cqlcVar2, cqlc<T, View.OnClickListener> cqlcVar3) {
        return cqgr.fY(cqgr.V(cqlcVar), cqgr.cd(-1), cqgr.cH(cqrp.d(48.0d)), cqgr.bR(ibn.o()), cqgr.bG(ibn.o()), cqgr.dU(ibn.d()), cqgr.dB(ibn.d()), cqgr.cW(cqlcVar3), iue.c(cqlcVar2), cqgr.gq(cqgr.bw(16), cqgr.eM(cqlcVar), ibq.t(), cqgr.eU(ibm.t()), cqgr.eN(5)));
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cesu cesuVar, Context context, cqiv cqivVar) {
        cqiw ceqqVar;
        cesi cesiVar;
        cesu cesuVar2 = cesuVar;
        cqivVar.a(cesuVar2.j().booleanValue() ? new ceow() : new cenb(), cesuVar2.b());
        cest g = cesuVar2.g();
        if (g != null) {
            cqivVar.a(new ceii(), g);
            return;
        }
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (cesi cesiVar2 : cesuVar2.c()) {
            if (cesiVar2 instanceof cesh) {
                arrayList.add((cesh) cesiVar2);
            } else {
                if (!z || cesuVar2.j().booleanValue()) {
                    cqivVar.c(new ceij());
                }
                if (cesiVar2 instanceof ceth) {
                    ceqqVar = new ceqq();
                    cesiVar = (ceth) cesiVar2;
                } else if (cesiVar2 instanceof cesw) {
                    ceqqVar = new cejb();
                    cesiVar = (cesw) cesiVar2;
                } else if (cesiVar2 instanceof cess) {
                    ceqqVar = new cehv();
                    cesiVar = (cess) cesiVar2;
                }
                cqivVar.a(ceqqVar, cesiVar);
                z = false;
            }
        }
        if (arrayList.isEmpty()) {
            if (z) {
                return;
            }
            cqivVar.c(ict.p(false, new cqmp[0]));
            return;
        }
        if (!z) {
            cqivVar.c(new ceij());
        }
        cqivVar.c(new ceid(context));
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            cqivVar.a(new cern(), (cesh) arrayList.get(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<cesu> a() {
        return cqgr.fY(iue.b(cjtd.a(dtxl.fi)), cqgr.cd(-1), cqgr.bp(-1), cqgr.z(ibm.b()), cqgr.fH(cehw.a), GmmRecyclerView.aw(C(), cqgr.cd(-1), cqgr.bp(-1), cqgr.bV(ird.b()), cqqx.F(), cqgr.ep(false), cqgr.aF(cehx.a)), cqgr.gd(cqgr.bp(-1), cqgr.cd(-1), cqgr.dr(1), hxc.a(cqgr.aT(b), hxc.b(cehy.a)), iue.c(cehz.a), cqgr.fP(new ico(), ceia.a, new cqmp[0]), cqgr.gg(cqgr.bV(cqrp.d(62.0d)), cqgr.bD(cqrp.d(62.0d)), cqgr.bw(17), cqgr.aI(ceib.a))), cqgr.fR(new cepm(), ceic.a, new cqmp[0]));
    }
}
