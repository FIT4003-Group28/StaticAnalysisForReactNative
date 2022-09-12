package defpackage;
/* compiled from: PG */
/* renamed from: xhw  reason: default package */
/* loaded from: classes7.dex */
public class xhw implements xhv {
    private final dxio<qbt> a;
    private final pyx b;

    public xhw(dxio<qbt> dxioVar, dpgh dpghVar) {
        this.a = dxioVar;
        this.b = pyy.a(dpghVar);
    }

    @Override // defpackage.xhv
    public String l() {
        dqtp dqtpVar;
        pyx pyxVar = this.b;
        int i = pyxVar.a;
        if (i == 1) {
            return ((dpgh) pyxVar.b).b;
        }
        if (i == 2) {
            dqtpVar = (dqtp) pyxVar.b;
        } else {
            dqtpVar = dqtp.f;
        }
        return dqtpVar.b;
    }

    @Override // defpackage.xhv
    public cqkl o() {
        this.a.a().p(dcdc.f(this.b));
        return cqkl.a;
    }
}
