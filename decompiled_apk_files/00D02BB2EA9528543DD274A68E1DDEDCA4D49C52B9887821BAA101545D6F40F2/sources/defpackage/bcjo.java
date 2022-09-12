package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.base.components.gmmrecyclerview.GmmRecyclerView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bcjo  reason: default package */
/* loaded from: classes3.dex */
public class bcjo extends cqiw<bcly> implements cqkp {
    public static final cqjg a = cqjg.a();
    private static final cqjb<bcly, abp> b = bcij.a;
    private static final cqkp c = new bcin();

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, bcly bclyVar, Context context, cqiv cqivVar) {
        bcly bclyVar2 = bclyVar;
        bclv f = bclyVar2.f();
        if (bclyVar2.i().e().booleanValue()) {
            cqivVar.a(new bciq(), f.H());
        }
        if (f.u().a().booleanValue()) {
            cqivVar.a(new bcjd(), f.u());
            return;
        }
        cqivVar.a(new bcjg(), f);
        cqivVar.a(new bcjb(), f);
        if (f.x().booleanValue()) {
            cqivVar.a(new bcjk(), f);
        }
        dcdc<bcme> F = f.F();
        int size = F.size();
        for (int i2 = 0; i2 < size; i2++) {
            F.get(i2).a(cqivVar);
        }
        if (f.j()) {
            cqivVar.a(new bcjl(), f.k());
        }
        cqivVar.a(new bcio(), c);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bcly> a() {
        return cqgr.gd(cqgr.z(ibm.b()), cqgr.gd(cqic.c(bcic.a, new cqmp[0]), cqgr.cd(-1), cqgr.bp(-2), cqgr.bV(irh.c()), cqgr.aJ(17), cqgr.gg(irn.A())), cqgr.fY(cqic.f(bcid.a, new cqmp[0]), cqgr.cd(-1), cqgr.bp(-2), cqgr.dr(1), GmmRecyclerView.aw(C(), cqgr.aR(Integer.valueOf((int) R.id.photo_gallery_recyclerview_id)), cqgr.aT(a), cqqx.K(b), cqqx.p(null), cqqx.v(bcie.a), cqqx.x(bcif.a), cqjv.f(cqqi.LAYOUT_MANAGER, bcig.a), iue.c(bcih.a), new bcim()), cqgr.gd(cqgr.cd(-1), cqgr.bp(-2), cqgr.z(ibm.b()), cqgr.fP(new bcit(), bcii.a, new cqmp[0]))));
    }
}
