package defpackage;
/* compiled from: PG */
/* renamed from: afcd  reason: default package */
/* loaded from: classes2.dex */
final class afcd implements afcf {
    private final dxio<akfa> a;
    private final boolean b;

    public afcd(dxio<akfa> dxioVar, boolean z) {
        this.a = dxioVar;
        this.b = z;
    }

    @Override // defpackage.afcf
    public final boolean a(afcj afcjVar) {
        if (afcjVar.f() == 1) {
            return this.a.a().e(this.b);
        }
        return this.a.a().e(true ^ this.b);
    }
}
