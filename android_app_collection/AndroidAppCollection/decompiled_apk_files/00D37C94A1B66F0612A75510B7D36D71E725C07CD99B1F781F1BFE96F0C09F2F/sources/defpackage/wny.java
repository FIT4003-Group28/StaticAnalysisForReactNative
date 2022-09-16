package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdImpl;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_BELOW_PLAYER, d = {xbj.class, xau.class, xat.class, xar.class, xbf.class})
/* renamed from: wny  reason: default package */
/* loaded from: classes4.dex */
public final class wny extends wok {
    public final wvx a;

    public wny(woo wooVar, wvx wvxVar) {
        super(wooVar);
        this.a = wvxVar;
    }

    @Override // defpackage.wok
    public final void a() {
        this.d.c(new ampg() { // from class: wnx
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                aoyz aoyzVar;
                wny wnyVar = wny.this;
                xdu xduVar = (xdu) obj;
                InstreamAdImpl instreamAdImpl = (InstreamAdImpl) xduVar.d(xbf.class);
                aqfd aqfdVar = (aqfd) xduVar.d(xau.class);
                PlayerResponseModel playerResponseModel = (PlayerResponseModel) xduVar.d(xat.class);
                String str = (String) xduVar.d(xar.class);
                String str2 = (String) xduVar.d(xbj.class);
                wvx wvxVar = wnyVar.a;
                int i = aqfdVar.b;
                if ((i & 512) != 0) {
                    apng apngVar = aqfdVar.l;
                    if (apngVar == null) {
                        apngVar = apng.a;
                    }
                    return wvxVar.h(xduVar, apngVar, amuk.r(xdc.e(wvxVar.c.c(apcf.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED), str2, apcd.SLOT_TYPE_PLAYER_BYTES, apcb.LAYOUT_TYPE_MEDIA)), amuk.q(), amuk.q());
                }
                if ((i & 256) != 0) {
                    aoza aozaVar = aqfdVar.k;
                    if (aozaVar == null) {
                        aozaVar = aoza.a;
                    }
                    aoyzVar = aozaVar.b;
                    if (aoyzVar == null) {
                        aoyzVar = aoyz.a;
                    }
                } else {
                    aoyzVar = null;
                }
                aoyz aoyzVar2 = aoyzVar;
                String a = wvxVar.c.a(apcb.LAYOUT_TYPE_COMPANION, xduVar.a);
                return xci.d(a, apcb.LAYOUT_TYPE_COMPANION, 1, amuk.r(xdc.e(wvxVar.c.c(apcf.TRIGGER_TYPE_ON_DIFFERENT_LAYOUT_ID_ENTERED), str2, apcd.SLOT_TYPE_PLAYER_BYTES, apcb.LAYOUT_TYPE_MEDIA)), amuk.q(), amuk.q(), ampq.i(aoyzVar2), ampq.j(wvxVar.d.c(xduVar, a, apcb.LAYOUT_TYPE_COMPANION, 1, aoyzVar2)), xac.b(new xbf(instreamAdImpl), new xat(playerResponseModel), new xaq(aqfdVar)));
            }
        });
    }
}
