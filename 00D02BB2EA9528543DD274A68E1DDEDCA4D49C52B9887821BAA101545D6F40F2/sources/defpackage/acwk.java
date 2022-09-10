package defpackage;
/* compiled from: PG */
/* renamed from: acwk  reason: default package */
/* loaded from: classes2.dex */
public final class acwk implements bzml {
    private final dxio<ascb> a;

    public acwk(dxio<ascb> dxioVar) {
        this.a = dxioVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.HAPPINESS_TRACKING_SURVEY;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.HIGH;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return true;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (this.a.a().g()) {
            return bzmk.NONE;
        }
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        return true;
    }
}
