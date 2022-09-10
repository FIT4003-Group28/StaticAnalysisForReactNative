package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bpip  reason: default package */
/* loaded from: classes3.dex */
final class bpip extends ipx<bpvl> {
    public bpip(cqrp cqrpVar) {
        super(R.id.rmi_feature_picker_scroll_view, cqrpVar);
    }

    @Override // defpackage.cqiw
    protected final /* bridge */ /* synthetic */ void RI(int i, cqkp cqkpVar, Context context, cqiv cqivVar) {
        bpvl bpvlVar = (bpvl) cqkpVar;
        cqivVar.f(new bpir(), bpvlVar.c());
        if (bpvlVar.k().booleanValue()) {
            iox ioxVar = new iox(bpis.a, bpis.b, bpis.c, bpis.e, dtya.bU, true, new Object[0]);
            ixw ixwVar = new ixw();
            ixwVar.d = bpvlVar;
            ixwVar.a = context.getString(R.string.ADD_A_MISSING_PLACE);
            ixwVar.g = cqrt.h(2131231581, ibm.b());
            ixwVar.e = bpvlVar.l();
            cqivVar.a(ioxVar, ixwVar.a());
        }
        cqivVar.a(new hsd(), hsd.d(cqsg.g(cqsz.c(), cqsg.d(ibn.d(), cqsg.f(cqsg.d(bpis.e, ibn.d(), bpis.b, ibn.d(), bpis.e), Float.valueOf(true != bpvlVar.k().booleanValue() ? 1 : 2)), ibn.d()))));
    }
}
