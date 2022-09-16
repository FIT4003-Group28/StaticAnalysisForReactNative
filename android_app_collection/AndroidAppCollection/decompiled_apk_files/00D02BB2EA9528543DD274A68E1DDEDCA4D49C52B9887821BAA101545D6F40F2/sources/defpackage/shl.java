package defpackage;
/* compiled from: PG */
/* renamed from: shl  reason: default package */
/* loaded from: classes7.dex */
public final class shl {
    private final dxio<akfa> a;
    private final dxio<acyr> b;

    public shl(dxio<akfa> dxioVar, dxio<acyr> dxioVar2) {
        this.a = dxioVar;
        this.b = dxioVar2;
    }

    public final boolean a() {
        btlu j = this.a.a().j();
        if (this.b.a().f()) {
            return j.l();
        }
        if (!j.l()) {
            return false;
        }
        return !j.h || dbsj.e(j.t()).endsWith("google.com");
    }
}
