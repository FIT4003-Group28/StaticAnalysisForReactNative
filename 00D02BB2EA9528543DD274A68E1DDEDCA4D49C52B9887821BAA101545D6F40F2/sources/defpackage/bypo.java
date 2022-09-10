package defpackage;
/* compiled from: PG */
/* renamed from: bypo  reason: default package */
/* loaded from: classes.dex */
public final class bypo implements awnu {
    private final bypd a;

    public bypo(bypd bypdVar) {
        this.a = bypdVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.TRAFFIC_TO_PLACE;
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
        return false;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        if (this.a.a.m(bvjk.ct, false)) {
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
        dbsk.l(false);
        return new bypn();
    }
}
