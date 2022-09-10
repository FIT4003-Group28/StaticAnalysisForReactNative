package defpackage;
/* compiled from: PG */
/* renamed from: anps  reason: default package */
/* loaded from: classes2.dex */
public abstract class anps implements jbf {
    @dzsi
    private ilo a;

    public static anps i(dvas dvasVar, anpr anprVar, int i) {
        return new anph(dvasVar, anprVar, i);
    }

    public abstract dvas a();

    public abstract anpr b();

    public abstract int c();

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return null;
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        b().a(j(), c());
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    public cjtd h() {
        return cjtd.a(dtyi.bA);
    }

    public ilo j() {
        if (this.a == null) {
            ily ilyVar = new ily();
            dvyw dvywVar = a().b;
            if (dvywVar == null) {
                dvywVar = dvyw.bv;
            }
            ilyVar.E(dvywVar);
            this.a = ilyVar.d();
        }
        return this.a;
    }

    @Override // defpackage.jbf
    public CharSequence l() {
        dvyw dvywVar = a().b;
        if (dvywVar == null) {
            dvywVar = dvyw.bv;
        }
        if (dvywVar.A.isEmpty()) {
            return (dvywVar.a & 1024) != 0 ? dvywVar.p : "";
        }
        return dvywVar.A.get(0);
    }

    @Override // defpackage.jbi
    public CharSequence m() {
        return j().q();
    }
}
