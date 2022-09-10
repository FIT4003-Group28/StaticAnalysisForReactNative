package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bgvy  reason: default package */
/* loaded from: classes3.dex */
public abstract class bgvy implements jbf, bega {
    private final ddho a;
    @dzsi
    private ilo b;
    private cjtd c;

    public bgvy(bhat bhatVar, ddho ddhoVar) {
        this(ddhoVar, (ilo) null);
    }

    private static cjtd b(@dzsi ilo iloVar, ddho ddhoVar) {
        if (iloVar == null) {
            return cjtd.b;
        }
        cjta c = cjtd.c(iloVar.ca());
        c.d = ddhoVar;
        return c.a();
    }

    public abstract void a(ilo iloVar);

    @Override // defpackage.jbf
    @dzsi
    public cqtd d() {
        return cqrt.i(iup.e(R.raw.ic_mod_edit), ibm.x());
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return true;
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        ilo iloVar = this.b;
        if (iloVar != null) {
            a(iloVar);
        }
        return cqkl.a;
    }

    @Override // defpackage.jbf
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.jbf
    @dzsi
    public cjtd h() {
        return this.c;
    }

    @Override // defpackage.bega
    public void t(bwrs<ilo> bwrsVar) {
        this.b = (ilo) bwrs.b(bwrsVar);
        this.c = b(bwrsVar.c(), this.a);
    }

    @Override // defpackage.bega
    public void u() {
        this.b = null;
        this.c = cjtd.b;
    }

    @Override // defpackage.bega
    public Boolean w() {
        return false;
    }

    public bgvy(ddho ddhoVar, @dzsi ilo iloVar) {
        this.a = ddhoVar;
        this.b = null;
        this.c = b(null, ddhoVar);
    }
}
