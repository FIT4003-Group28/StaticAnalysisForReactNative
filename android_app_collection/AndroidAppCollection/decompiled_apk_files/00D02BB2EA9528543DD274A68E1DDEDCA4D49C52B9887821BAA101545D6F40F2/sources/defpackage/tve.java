package defpackage;

import android.text.TextUtils;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: tve  reason: default package */
/* loaded from: classes7.dex */
final class tve extends cqiw<tvx> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<tvx> a() {
        cqmp[] cqmpVarArr = {ibq.z(), ibq.q(), cqgr.eU(ibm.n())};
        cqmj gq = cqgr.gq(cqgr.aR(Integer.valueOf((int) R.id.precedence_aware_notice_list_item_bullet)), cqgr.eh(false), cqgr.eI("  •  "));
        gq.f(cqmpVarArr);
        cqmp[] cqmpVarArr2 = {cqgr.ce(tvf.a), cqgr.bq(tvf.a), cqgr.bw(17), cqgr.eG(tuz.a)};
        cqmj gc = cqgr.gc(cqgr.aR(Integer.valueOf((int) R.id.precedence_aware_notice_list_item_icon)));
        gc.f(cqmpVarArr2);
        cqmp[] cqmpVarArr3 = {cqgr.bR(ibn.e()), cqgr.bG(ibn.e()), cqgr.aF(cqjv.x(tva.a)), ibq.q(), cqgr.eM(tvb.a), ibq.z(), cqgr.eU(ibm.n())};
        cqmj gq2 = cqgr.gq(cqgr.aR(Integer.valueOf((int) R.id.precedence_aware_notice_list_item_text)), cqgr.eh(false), cqgr.ar(TextUtils.TruncateAt.END));
        gq2.f(cqmpVarArr3);
        cqmp[] cqmpVarArr4 = {cqgr.cd(-2), cqgr.bp(-2), cqgr.dr(0), cqgr.aS(tuy.a), gq, gc, gq2, cqjv.i(udy.NOTICE_PROCEEDING_INTERPUNCT, true, udz.a), cqjv.i(udy.NOTICE_MINIMUM_TEXT_WIDTH, tvf.b, udz.a), cqjv.g(udy.NOTICE_ALLOW_TEXT_TRUNCATION, tvc.a, udz.a), cqjv.g(udy.NOTICE_ALLOW_TEXT_DROPPED, tvd.a, udz.a)};
        cqmh cqmhVar = new cqmh(uec.class, new cqmp[0]);
        cqmhVar.f(cqmpVarArr4);
        return cqmhVar;
    }
}
