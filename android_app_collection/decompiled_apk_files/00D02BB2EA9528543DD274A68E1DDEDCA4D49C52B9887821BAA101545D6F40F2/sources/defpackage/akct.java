package defpackage;
/* compiled from: PG */
/* renamed from: akct  reason: default package */
/* loaded from: classes.dex */
public final class akct implements awnu {
    private final bvjj a;
    private final bttf b;
    private final dxio<akfa> c;

    public akct(bvjj bvjjVar, bttf bttfVar, dxio<akfa> dxioVar) {
        this.a = bvjjVar;
        this.b = bttfVar;
        this.c = dxioVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.LOGIN_OOB;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.CRITICAL;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return this.b.b() && this.c.a().i();
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (this.a.m(bvjk.bw, false)) {
            return bzmk.NONE;
        }
        if (!this.c.a().k().o()) {
            this.a.S(bvjk.bw, true);
            return bzmk.NONE;
        }
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        return bzmkVar != bzmk.REPRESSED;
    }

    @Override // defpackage.awnu
    public final ggg g() {
        return new akcr();
    }
}
