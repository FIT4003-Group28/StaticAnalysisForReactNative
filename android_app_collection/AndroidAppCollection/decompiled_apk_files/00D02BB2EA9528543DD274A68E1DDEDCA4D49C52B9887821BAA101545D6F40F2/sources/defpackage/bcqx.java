package defpackage;
/* compiled from: PG */
/* renamed from: bcqx  reason: default package */
/* loaded from: classes3.dex */
public final class bcqx implements bcrr {
    private final dxio<bbut> a;
    private final ilo b;

    public bcqx(dxio<bbut> dxioVar, ilo iloVar) {
        this.a = dxioVar;
        this.b = iloVar;
    }

    @Override // defpackage.bcrr
    public final void a() {
        bbuz m = bbve.m();
        m.b(bbuy.SHOW_FULLY_EXPANDED_PLACESHEET);
        m.e(dwyd.PHOTO_VIEWER);
        ((bbsu) m).b = this.b;
        this.a.a().j(m.a());
    }
}
