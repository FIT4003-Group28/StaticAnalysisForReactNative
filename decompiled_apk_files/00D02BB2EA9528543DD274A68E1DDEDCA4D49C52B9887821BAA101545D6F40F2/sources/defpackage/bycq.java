package defpackage;
/* compiled from: PG */
/* renamed from: bycq  reason: default package */
/* loaded from: classes.dex */
public final class bycq implements awnu {
    private final bttf a;

    public bycq(bttf bttfVar) {
        this.a = bttfVar;
    }

    @Override // defpackage.bzml
    public final dqkc a() {
        return dqkc.TERMS_OF_SERVICE;
    }

    @Override // defpackage.bzml
    public final bzmj b() {
        return bzmj.LEGALLY_REQUIRED;
    }

    @Override // defpackage.bzml
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bzml
    public final boolean d() {
        return true;
    }

    @Override // defpackage.bzml
    public final bzmk e() {
        return this.a.b() ? bzmk.NONE : bzmk.VISIBLE;
    }

    @Override // defpackage.bzml
    public final boolean f(bzmk bzmkVar) {
        return true;
    }

    @Override // defpackage.awnu
    public final ggg g() {
        return new bycp();
    }
}
