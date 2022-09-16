package defpackage;

import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: lrj  reason: default package */
/* loaded from: classes7.dex */
public final class lrj extends cqiw<lrl> {
    public static final int a = cqir.a();

    @Override // defpackage.cqiw
    public final cqmj<lrl> a() {
        cqhc a2 = cqhc.a();
        a2.e(B().b(cren.UNMUTED), cqgr.eE(nqu.aj()));
        a2.e(B().b(cren.MINIMAL), cqgr.eE(nqu.aB(R.raw.car_only_ic_sound_alert_36dp, nql.l)));
        a2.e(B().b(cren.MUTED), cqgr.eE(nqu.aB(R.raw.car_only_ic_sound_off_36dp, nql.l)));
        cqnf b = a2.b(cqgr.eE(nqu.aj()));
        cqhc a3 = cqhc.a();
        a3.e(B().b(cren.UNMUTED), iue.b(cjtd.a(dtxm.cx)));
        a3.e(B().b(cren.MINIMAL), iue.b(cjtd.a(dtxm.ca)));
        a3.e(B().b(cren.MUTED), iue.b(cjtd.a(dtxm.ce)));
        return cqgr.gc(cqgr.aR(Integer.valueOf(a)), cqgr.ce(nqo.Y), cqgr.bq(nqo.Y), cqgr.az(npv.a()), cqgr.J(true), nqu.k(npv.a(), nqu.aS(false, nqo.ad), nqu.aT(false)), cqgr.ei(ImageView.ScaleType.CENTER), itj.g(B().a()), b, a3.b(iue.b(null)));
    }
}
