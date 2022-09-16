package defpackage;
/* compiled from: PG */
/* renamed from: aomf  reason: default package */
/* loaded from: classes2.dex */
public abstract class aomf implements aome {
    private Boolean a = false;

    public aomf(cqhn cqhnVar) {
    }

    @Override // defpackage.aome
    public Boolean a() {
        return this.a;
    }

    @Override // defpackage.aome
    public cqkl b() {
        this.a = Boolean.valueOf(!this.a.booleanValue());
        cqkx.p(this);
        return cqkl.a;
    }

    @Override // defpackage.aome
    public cqtd c() {
        return cqrt.g(2131232738, irg.k());
    }

    @Override // defpackage.aome
    public cqtd d() {
        return cqrt.g(2131232731, irg.k());
    }

    @Override // defpackage.aome
    @dzsi
    public cjtd j() {
        ddho i = i();
        if (i == null) {
            return null;
        }
        cjta b = cjtd.b();
        b.d = i;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = a().booleanValue() ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        deab deabVar = (deab) bZ.b;
        deabVar.b = deaaVar.d;
        deabVar.a |= 1;
        b.a = bZ.bK();
        return b.a();
    }
}
