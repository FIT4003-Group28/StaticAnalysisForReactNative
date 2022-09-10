package defpackage;

import android.content.Context;
import android.widget.ImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ugz  reason: default package */
/* loaded from: classes7.dex */
public final class ugz extends cqiw<uhe> {
    public static final cqrp a;
    private static final cqmn<uhe> b;

    static {
        cqrp d = cqrp.d(18.0d);
        a = d;
        b = cqmn.a(cqgr.ce(d), cqgr.bq(d));
    }

    public static CharSequence d(uhe uheVar, Context context) {
        if (uheVar.l().booleanValue()) {
            return context.getResources().getString(R.string.WAYPOINT_EDIT_MODE_PARKING_LETTER);
        }
        int min = Math.min(uheVar.f().intValue(), 25) - 1;
        return (min < 0 || uheVar.i().booleanValue()) ? "" : Character.toString((char) (min + 65));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<uhe> a() {
        cqmp[] cqmpVarArr = {cqgr.aF(ugt.a)};
        cqmn<uhe> cqmnVar = b;
        cqmj gc = cqgr.gc(cqgr.eG(ugv.a), cqmnVar, cqgr.ca(Float.valueOf(1.0f)), cqgr.bw(17), cqgr.ei(ImageView.ScaleType.FIT_CENTER));
        gc.f(cqmpVarArr);
        cqmp[] cqmpVarArr2 = {cqgr.aF(ugu.a)};
        cqmj gq = cqgr.gq(cqgr.bv(3), cqgr.aW(2), cqmnVar, cqgr.bw(17), cqgr.aJ(17), cqgr.y(ugw.a), cqgr.dB(cqrp.d(1.0d)), cqgr.fh(cqrp.d(11.0d)), cqgr.fe(ibq.G()), cqgr.eW(ugx.a), cqgr.eK(ugy.a));
        gq.f(cqmpVarArr2);
        return cqgr.fY(cqgr.bv(3), cqgr.aJ(17), cqgr.bw(17), gc, gq);
    }
}
