package defpackage;
/* compiled from: PG */
/* renamed from: xci  reason: default package */
/* loaded from: classes7.dex */
public final class xci implements xcj {
    private final dxio<akfa> a;
    private final xck b;

    public xci(dxio<akfa> dxioVar, xck xckVar) {
        this.a = dxioVar;
        this.b = xckVar;
    }

    @Override // defpackage.xcj
    public final boolean a() {
        btlu j = this.a.a().j();
        if (j == null || !j.u()) {
            j = null;
        }
        if (j != null) {
            this.b.a();
            return false;
        }
        return false;
    }
}
