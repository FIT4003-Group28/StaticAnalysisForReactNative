package defpackage;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_BELOW_PLAYER, d = {xbk.class})
/* renamed from: wnu  reason: default package */
/* loaded from: classes4.dex */
public final class wnu extends wok {
    public final wvx a;
    private final xdu b;

    public wnu(woo wooVar, wvx wvxVar, xdu xduVar) {
        super(wooVar);
        this.a = wvxVar;
        this.b = xduVar;
    }

    @Override // defpackage.wok
    public final void a() {
        final atzu atzuVar = (atzu) this.b.d(xbk.class);
        this.d.c(new ampg() { // from class: wnt
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                wnu wnuVar = wnu.this;
                atzu atzuVar2 = atzuVar;
                xdu xduVar = (xdu) obj;
                wvx wvxVar = wnuVar.a;
                String a = wvxVar.c.a(apcb.LAYOUT_TYPE_COMPANION, xduVar.a);
                return xci.h(a, apcb.LAYOUT_TYPE_COMPANION, amuk.r(xdd.e(wvxVar.c.c(apcf.TRIGGER_TYPE_ON_LAYOUT_SELF_EXIT_REQUESTED), a)), ampq.j(wvxVar.d.c(xduVar, a, apcb.LAYOUT_TYPE_COMPANION, 1, null)), xac.b(new xbk(atzuVar2)));
            }
        });
    }
}
