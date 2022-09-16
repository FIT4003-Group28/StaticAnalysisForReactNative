package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_SEQUENCE_ITEM_IN_PLAYER, d = {xbn.class, xay.class, xah.class})
/* renamed from: edf  reason: default package */
/* loaded from: classes3.dex */
public final class edf extends wok {
    public final wvx a;
    private final Executor b;
    private final Executor c;

    public edf(woo wooVar, Executor executor, Executor executor2, wvx wvxVar) {
        super(wooVar);
        this.b = executor;
        this.c = executor2;
        this.a = wvxVar;
    }

    @Override // defpackage.wok
    public final void a() {
        this.d.a(new ampg() { // from class: ede
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                edf edfVar = edf.this;
                xdu xduVar = (xdu) obj;
                xdo xdoVar = (xdo) xduVar.d(xbn.class);
                aqtb aqtbVar = (aqtb) xduVar.d(xay.class);
                aoyz aoyzVar = (aoyz) xduVar.d(xah.class);
                wvx wvxVar = edfVar.a;
                String a = wvxVar.c.a(apcb.LAYOUT_TYPE_REELS_PLAYER_OVERLAY, xduVar.a);
                return xci.d(a, apcb.LAYOUT_TYPE_REELS_PLAYER_OVERLAY, 1, amuk.r(new xds(wvxVar.c.c(apcf.TRIGGER_TYPE_SEQUENCE_ITEM_IN_PLAYER_SPACE_UNAVAILABLE), apcf.TRIGGER_TYPE_SEQUENCE_ITEM_IN_PLAYER_SPACE_UNAVAILABLE, xdoVar)), amuk.q(), amuk.q(), ampq.j(aoyzVar), ampq.j(wvxVar.d.c(xduVar, a, apcb.LAYOUT_TYPE_REELS_PLAYER_OVERLAY, 1, aoyzVar)), xac.b(new xbn(xdoVar), new xay(aqtbVar)));
            }
        }, this.b, this.c);
    }
}
