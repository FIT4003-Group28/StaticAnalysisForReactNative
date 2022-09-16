package defpackage;
/* compiled from: PG */
@wwb(b = apcd.SLOT_TYPE_LOCKSCREEN, d = {xbj.class})
/* renamed from: woy  reason: default package */
/* loaded from: classes4.dex */
public final class woy extends wok {
    public final wvx a;

    public woy(woo wooVar, wvx wvxVar) {
        super(wooVar);
        this.a = wvxVar;
    }

    @Override // defpackage.wok
    public final void a() {
        this.d.c(new ampg() { // from class: wox
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                xdu xduVar = (xdu) obj;
                return woy.this.a.d(xduVar, apcd.SLOT_TYPE_LOCKSCREEN, (String) xduVar.d(xbj.class));
            }
        });
    }
}
