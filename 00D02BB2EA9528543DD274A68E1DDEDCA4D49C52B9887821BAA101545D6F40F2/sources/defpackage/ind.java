package defpackage;
/* compiled from: PG */
/* renamed from: ind  reason: default package */
/* loaded from: classes.dex */
public final class ind implements cvzm {
    public final dxio<ina> a;
    private final dxio<afef> b;
    private final dxio<cjqy> c;
    private final dxio<cjqq> d;

    public ind(dxio<ina> dxioVar, dxio<afef> dxioVar2, dxio<cjqy> dxioVar3, dxio<cjqq> dxioVar4) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dxioVar3;
        this.d = dxioVar4;
    }

    @Override // defpackage.cvzm
    public final void a(boolean z) {
        cjta b = cjtd.b();
        b.d = dtxv.o;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = z ? deaa.TOGGLE_OFF : deaa.TOGGLE_ON;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        cjtd a = b.a();
        this.c.a().n(this.d.a().g().d(a), new cjte(deaf.TAP), a);
        this.b.a().e(z);
    }
}
