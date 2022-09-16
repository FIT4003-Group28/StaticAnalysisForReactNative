package defpackage;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_FIXED_FOOTER, d = {xbj.class})
/* renamed from: woe  reason: default package */
/* loaded from: classes4.dex */
public final class woe extends wok {
    public final wvx a;

    public woe(woo wooVar, wvx wvxVar) {
        super(wooVar);
        this.a = wvxVar;
    }

    @Override // defpackage.wok
    public final void a() {
        this.d.c(new ampg() { // from class: wod
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                xdu xduVar = (xdu) obj;
                return woe.this.a.d(xduVar, apcd.SLOT_TYPE_FIXED_FOOTER, (String) xduVar.d(xbj.class));
            }
        });
    }
}
