package defpackage;
/* compiled from: PG */
/* renamed from: bbem  reason: default package */
/* loaded from: classes3.dex */
public final class bbem implements brwy {
    public final dxio<bzmm> a;
    public final bvjj b;
    public boolean c;
    private final btvo d;
    private final bryf e;

    public bbem(dxio<bzmm> dxioVar, bvjj bvjjVar, btvo btvoVar, abmh abmhVar) {
        this.a = dxioVar;
        this.b = bvjjVar;
        this.d = btvoVar;
        this.e = abmhVar;
        abmhVar.i(new brye(this) { // from class: bbel
            private final bbem a;

            {
                this.a = this;
            }

            @Override // defpackage.brye
            public final void a() {
                bbem bbemVar = this.a;
                bbemVar.b.S(bvjk.jb, true);
                bbemVar.a.a().f(dqkc.PERSONAL_SCORE_SEARCH_RESULT_PROMO);
                bbemVar.c = false;
            }
        });
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.PERSONAL_SCORE_SEARCH_RESULT_PROMO;
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
        if (!this.c) {
            if (!this.d.getEnableFeatureParameters().aW) {
                return false;
            }
            return bryb.a(this.a.a().d(dqkc.PERSONAL_SCORE_SEARCH_RESULT_PROMO), this.a.a().c(dqkc.PERSONAL_SCORE_SEARCH_RESULT_PROMO), this.b.m(bvjk.jb, false));
        }
        return true;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        return bzmkVar == bzmk.VISIBLE;
    }

    @Override // defpackage.brwy
    public final bryf g() {
        return this.e;
    }

    @Override // defpackage.brwy
    public final int h(brww brwwVar) {
        brww brwwVar2 = brww.ANY;
        return brwwVar.ordinal() != 1 ? 2 : 0;
    }
}
