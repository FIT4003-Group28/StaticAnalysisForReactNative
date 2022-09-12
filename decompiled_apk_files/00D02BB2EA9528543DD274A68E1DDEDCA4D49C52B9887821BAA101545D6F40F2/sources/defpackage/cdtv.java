package defpackage;
/* compiled from: PG */
/* renamed from: cdtv  reason: default package */
/* loaded from: classes4.dex */
abstract class cdtv implements cdtu {
    public abstract cebg a();

    public abstract cebf b();

    public abstract int c();

    @Override // defpackage.cdtu
    public Integer d() {
        return Integer.valueOf(e().intValue() + 1);
    }

    @Override // defpackage.cdtu
    public Integer e() {
        return Integer.valueOf(c());
    }

    @Override // defpackage.cdtu
    public jic f() {
        return b().a();
    }

    @Override // defpackage.cdtu
    public Float g() {
        return b().c();
    }

    @Override // defpackage.cdtu
    @dzsi
    public String h(int i) {
        return a().c(6);
    }

    @Override // defpackage.cdtu
    public cqkl i() {
        return b().b();
    }

    @Override // defpackage.cdtu
    public cjtd j() {
        return b().g();
    }

    @Override // defpackage.cdtu
    public Boolean k() {
        boolean z = true;
        if (a().a().intValue() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
