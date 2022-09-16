package defpackage;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_IN_PLAYER, d = {xbj.class, xbo.class})
/* renamed from: wow  reason: default package */
/* loaded from: classes4.dex */
public final class wow extends wok {
    public final wvx a;

    public wow(woo wooVar, wvx wvxVar) {
        super(wooVar);
        this.a = wvxVar;
    }

    @Override // defpackage.wok
    public final void a() {
        this.d.c(new ampg() { // from class: wov
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                xdu xduVar = (xdu) obj;
                return wow.this.a.d(xduVar, apcd.SLOT_TYPE_IN_PLAYER, (String) xduVar.d(xbj.class));
            }
        });
    }
}
