package defpackage;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_IN_PLAYER, d = {xav.class, xax.class})
/* renamed from: woq  reason: default package */
/* loaded from: classes4.dex */
public final class woq extends wok {
    public final wvx a;

    public woq(woo wooVar, wvx wvxVar) {
        super(wooVar);
        this.a = wvxVar;
    }

    @Override // defpackage.wok
    public final void a() {
        this.d.c(new ampg() { // from class: wop
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                woq woqVar = woq.this;
                xdu xduVar = (xdu) obj;
                String str = (String) xduVar.d(xax.class);
                aunb aunbVar = (aunb) xduVar.d(xav.class);
                wvx wvxVar = woqVar.a;
                String a = wvxVar.c.a(apcb.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, xduVar.a);
                return xci.d(a, apcb.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, 1, amuk.r(xco.e(wvxVar.c.c(apcf.TRIGGER_TYPE_LAYOUT_ID_EXITED), str)), amuk.q(), amuk.q(), amon.a, ampq.j(wvxVar.d.c(xduVar, a, apcb.LAYOUT_TYPE_MEDIA_LAYOUT_PLAYER_OVERLAY, 1, null)), xac.b(new xav(aunbVar)));
            }
        });
    }
}
