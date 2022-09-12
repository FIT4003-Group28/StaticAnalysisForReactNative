package defpackage;
/* compiled from: PG */
/* renamed from: azev  reason: default package */
/* loaded from: classes3.dex */
public class azev implements azeg {
    private boolean a;

    @Override // defpackage.azeg
    public Boolean a() {
        return Boolean.valueOf(this.a);
    }

    @Override // defpackage.azeg
    public cqkl b() {
        c(!this.a);
        return cqkl.a;
    }

    @Override // defpackage.azeg
    public void c(boolean z) {
        this.a = z;
        cqkx.p(this);
    }

    @Override // defpackage.azeg
    public cjtd d() {
        cjta b = cjtd.b();
        b.d = dtxy.eK;
        ddzy bZ = deab.c.bZ();
        deaa deaaVar = this.a ? deaa.TOGGLE_ON : deaa.TOGGLE_OFF;
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
