package defpackage;
/* compiled from: PG */
/* renamed from: afbi  reason: default package */
/* loaded from: classes2.dex */
public class afbi implements afbh {
    private final dxio<akfa> a;

    public afbi(dxio<akfa> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.afbh
    public jic a() {
        String f = this.a.a().f();
        cqtd g = this.a.a().g();
        if (f != null) {
            return new jic(f, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 0);
        }
        if (g != null) {
            return new jic((String) null, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, g, 0);
        }
        return new jic(null, ckqc.FIFE_MONOGRAM_CIRCLE_CROP, 2131232998);
    }
}
