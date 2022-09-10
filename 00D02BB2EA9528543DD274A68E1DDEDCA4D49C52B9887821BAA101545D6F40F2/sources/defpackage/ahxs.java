package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ahxs  reason: default package */
/* loaded from: classes2.dex */
class ahxs implements jad {
    final /* synthetic */ ahxx a;

    public ahxs(ahxx ahxxVar) {
        this.a = ahxxVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return true;
    }

    @Override // defpackage.jad
    public cqkl c() {
        ahxx ahxxVar = this.a;
        ahxxVar.r = 5;
        cqkx.p(ahxxVar);
        akep j = akeu.j(new ahxr(this));
        j.a().i(R.string.PERSONAL_SAFETY_CHOOSE_ACCOUNT_TITLE_TEXT);
        this.a.d.a(j.b());
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(dtxu.dR);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.a.b.a().getString(R.string.PERSONAL_SAFETY_SIGN_IN_BUTTON_TEXT);
    }

    @Override // defpackage.jad
    public CharSequence f() {
        return "";
    }

    @Override // defpackage.jad
    public cqkl g(cjqm cjqmVar) {
        return jac.b(this);
    }

    @Override // defpackage.jad
    public Boolean h() {
        return jac.a();
    }

    @Override // defpackage.jad
    public cqtd i() {
        return null;
    }
}
