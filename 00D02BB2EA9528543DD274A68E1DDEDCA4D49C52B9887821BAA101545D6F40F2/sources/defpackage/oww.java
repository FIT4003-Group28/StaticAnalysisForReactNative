package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: oww  reason: default package */
/* loaded from: classes7.dex */
public final class oww extends cqiw<oxy> {
    public static final /* synthetic */ int a = 0;

    public static CharSequence d(oxy oxyVar, Context context) {
        dhyq dhyqVar = dhyq.UNKNOWN_FACTUAL_EDIT_STATE;
        int ordinal = oxyVar.e().ordinal();
        if (ordinal != 0) {
            return context.getText(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? 0 : R.string.EDIT_STATE_REJECTED : R.string.EDIT_STATE_ACCEPTED : R.string.EDIT_STATE_PENDING_MODERATION);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<oxy> a() {
        return cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(1), cqgr.cH(ibn.a()), cqgr.K(owh.a), cqgr.cW(acly.a(own.a)), iue.c(owo.a), cqgr.x(ibo.a()), cqgr.U(owp.a), cqgr.dz(ibn.g(), ibn.o(), ibn.g(), ibn.o()), cqgr.gd(cqgr.bp(-2), cqgr.cd(-1), cqgr.dr(0), cqgr.aJ(48), WebImageView.e(owq.a, cqgr.bG(ibn.o())), cqgr.gd(cqgr.cd(0), cqgr.ca(Float.valueOf(1.0f)), cqgr.dr(1), cqgr.gq(ibq.l(), cqgr.cB(1), cqgr.dB(ibn.e()), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(owr.a)), cqgr.gq(cqgr.aF(cqjv.x(ows.a)), ibq.p(), cqgr.cB(1), cqgr.dB(ibn.e()), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eU(ibm.o()), cqgr.eM(owt.a)), cqgr.gd(cqgr.cd(-1), cqgr.dE(owu.a), cqgr.gq(ibq.l(), cqgr.l(true), cqgr.eN(5), cqgr.eU(ibm.o()), cqgr.eK(owv.a)), cqgr.gq(cqgr.aF(cqjv.x(owi.a)), ibq.l(), cqgr.eN(5), cqgr.eI(" · ")), cqgr.gq(cqgr.aF(cqjv.x(owj.a)), ibq.l(), cqgr.cB(1), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eN(5), cqgr.eM(owk.a))), cqgr.gq(cqgr.aF(cqjv.x(owl.a)), ibq.p(), cqgr.eU(ibm.o()), cqgr.eM(owm.a), cqgr.cp(Float.valueOf(1.4f))))));
    }
}
