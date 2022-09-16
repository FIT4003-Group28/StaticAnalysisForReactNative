package defpackage;
/* compiled from: PG */
/* renamed from: beyh  reason: default package */
/* loaded from: classes3.dex */
public final class beyh implements bzml {
    public final gga a;
    public final jlp b;
    public final bzmm c;
    public final cjqq d;
    public final cpv e;
    @dzsi
    public ilo f;
    private final bexz g;
    private final bfaq h;

    public beyh(gga ggaVar, beya beyaVar, bfaq bfaqVar, jlp jlpVar, bzmm bzmmVar, cjqq cjqqVar, cpv cpvVar) {
        this.a = ggaVar;
        this.g = beyaVar.a(null);
        this.h = bfaqVar;
        this.b = jlpVar;
        this.c = bzmmVar;
        this.d = cjqqVar;
        this.e = cpvVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.LOCAL_FOLLOW_WELCOME_OFFER_BUBBLE;
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
        ilo iloVar = this.f;
        if (iloVar == null || !this.g.a() || !this.h.a() || !bfaq.c(iloVar).a() || this.c.d(dqkc.LOCAL_FOLLOW_WELCOME_OFFER_BUBBLE) >= 3) {
            return false;
        }
        return !this.g.d(this.f);
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
