package defpackage;
/* compiled from: PG */
/* renamed from: beye  reason: default package */
/* loaded from: classes3.dex */
public final class beye implements bzml {
    public final gga a;
    public final jlp b;
    public final bzmm c;
    public final cjqq d;
    public final cpv e;
    private final bexz f;

    public beye(beya beyaVar, gga ggaVar, jlp jlpVar, bzmm bzmmVar, cjqq cjqqVar, cpv cpvVar) {
        this.f = beyaVar.a(null);
        this.a = ggaVar;
        this.b = jlpVar;
        this.c = bzmmVar;
        this.d = cjqqVar;
        this.e = cpvVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.LOCAL_FOLLOW_NEW_BUBBLE;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.LOW;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return false;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return this.f.a() && this.c.d(dqkc.LOCAL_FOLLOW_NEW_BUBBLE) <= 0;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        return bzmkVar == bzmk.VISIBLE;
    }
}
