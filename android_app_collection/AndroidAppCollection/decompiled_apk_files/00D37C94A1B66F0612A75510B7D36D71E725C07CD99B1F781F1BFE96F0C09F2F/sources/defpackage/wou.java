package defpackage;

import com.google.android.libraries.youtube.ads.model.MediaAd;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_IN_PLAYER, d = {xbj.class, xbh.class})
/* renamed from: wou  reason: default package */
/* loaded from: classes4.dex */
public final class wou extends wok {
    public final wvx a;

    public wou(woo wooVar, wvx wvxVar) {
        super(wooVar);
        this.a = wvxVar;
    }

    @Override // defpackage.wok
    public final void a() {
        this.d.c(new ampg() { // from class: wot
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                aoyz aoyzVar;
                wou wouVar = wou.this;
                xdu xduVar = (xdu) obj;
                String str = (String) xduVar.d(xbj.class);
                MediaAd mediaAd = (MediaAd) xduVar.d(xbh.class);
                wvx wvxVar = wouVar.a;
                if (mediaAd.k() != null) {
                    aoyzVar = mediaAd.k().j;
                    if (aoyzVar == null) {
                        aoyzVar = aoyz.a;
                    }
                } else {
                    aoyzVar = null;
                }
                aoyz aoyzVar2 = aoyzVar;
                String a = wvxVar.c.a(apcb.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, xduVar.a);
                return xci.d(a, apcb.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, 1, amuk.r(xco.e(wvxVar.c.c(apcf.TRIGGER_TYPE_LAYOUT_ID_EXITED), str)), amuk.q(), amuk.q(), ampq.i(aoyzVar2), ampq.j(wvxVar.d.c(xduVar, a, apcb.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, 1, aoyzVar2)), xac.b(new xal[0]));
            }
        });
    }
}
