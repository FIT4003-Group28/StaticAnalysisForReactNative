package defpackage;

import android.text.TextUtils;
import android.widget.ImageView;
import com.google.android.apps.gmm.base.views.webimageview.WebImageView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: oiu  reason: default package */
/* loaded from: classes7.dex */
public final class oiu extends cqiw<bhtu> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cqiw
    public final cqmj<bhtu> a() {
        cqmj a = WebImageView.a(WebImageView.l(oip.a), cqgr.ei(ImageView.ScaleType.CENTER_CROP), cqgr.eD(2131232076), cqgr.bq(cqrt.d(R.dimen.owner_profile_size)), cqgr.ce(cqrt.d(R.dimen.owner_profile_size)), cqgr.bR(cqrt.d(R.dimen.text_spacer)), cqgr.bG(cqrt.d(R.dimen.text_spacer)));
        cqmj gq = cqgr.gq(cqgr.eM(oiq.a), cqgr.bY(cqjd.l(a), cqjd.B(a)), cqgr.aZ(false), cqgr.eS(Integer.valueOf((int) R.style.MediumText)));
        cqmj gq2 = cqgr.gq(cqgr.eM(oir.a), cqgr.bY(cqjd.v(gq), cqjd.B(a)), cqgr.eS(Integer.valueOf((int) R.style.XMicroTertiaryText)));
        cqmj a2 = jef.a(cqgr.bY(cqjd.p(a), cqjd.v(a), cqjd.v(gq2)), cqgr.bV(cqrt.d(R.dimen.text_spacer)), itj.d(2), cqgr.eS(Integer.valueOf((int) R.style.MicroTertiaryText)), cqgr.ar(TextUtils.TruncateAt.END), cqgr.eM(ois.a));
        return cqgr.gd(cqgr.dr(1), cqgr.af(cqrt.f(R.drawable.cardlist_middle_padding)), cqgr.bt(R.layout.viewbinder_wrapcontentcontainerrelativelayout_internal, cqgr.aI(oit.a), cqgr.cd(-1), cqgr.aJ(16), cqgr.dU(cqrt.d(R.dimen.padding_main)), cqgr.dF(cqrt.d(R.dimen.card_side_padding)), cqgr.gs(cqgr.ce(cqrt.d(R.dimen.owner_response_indicator_width)), cqgr.bY(cqjd.n(a2)), cqgr.v(Integer.valueOf((int) R.color.owner_response_border))), a, gq, gq2, a2));
    }
}
