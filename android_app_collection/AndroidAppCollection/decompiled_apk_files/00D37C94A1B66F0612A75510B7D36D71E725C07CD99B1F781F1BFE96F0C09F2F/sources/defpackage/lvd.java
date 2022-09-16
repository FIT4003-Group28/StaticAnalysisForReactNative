package defpackage;

import android.view.MenuItem;
/* compiled from: PG */
/* renamed from: lvd  reason: default package */
/* loaded from: classes3.dex */
final class lvd extends fse {
    private final aafo a;
    private final apzg b;
    private final CharSequence c;
    private final aoob d;
    private final acti e;
    private final lyb f;

    public lvd(lya lyaVar, aafo aafoVar, apzg apzgVar, CharSequence charSequence, aoob aoobVar, acti actiVar) {
        this.f = lyaVar.b();
        aafoVar.getClass();
        this.a = aafoVar;
        this.b = apzgVar;
        this.c = charSequence;
        this.d = aoobVar;
        this.e = actiVar;
    }

    @Override // defpackage.fse
    public final int b() {
        return this.f.a;
    }

    @Override // defpackage.fse
    public final CharSequence c() {
        return this.c;
    }

    @Override // defpackage.fry
    public final int g() {
        return this.f.a();
    }

    @Override // defpackage.fry
    public final frx i() {
        return null;
    }

    @Override // defpackage.fry
    public final void j(MenuItem menuItem) {
        menuItem.setTitle(this.c);
    }

    @Override // defpackage.fse, defpackage.fry
    public final void k() {
        acti actiVar;
        aoob aoobVar = this.d;
        if (aoobVar == null || aoobVar.H() || (actiVar = this.e) == null) {
            return;
        }
        actiVar.u(new acte(this.d), null);
    }

    @Override // defpackage.fry
    public final boolean l() {
        return false;
    }

    @Override // defpackage.fry
    public final boolean m() {
        acti actiVar;
        aoob aoobVar = this.d;
        if (aoobVar != null && !aoobVar.H() && (actiVar = this.e) != null) {
            actiVar.H(3, new acte(this.d), null);
        }
        apzg apzgVar = this.b;
        if (apzgVar != null) {
            this.a.a(apzgVar);
            return true;
        }
        return false;
    }
}
