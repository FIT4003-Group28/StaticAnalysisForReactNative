package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ahhc  reason: default package */
/* loaded from: classes2.dex */
public class ahhc implements agzi {
    private final ff a;
    private final akfa b;
    private final akfc c;

    public ahhc(ff ffVar, akfa akfaVar, akfc akfcVar) {
        this.a = ffVar;
        this.b = akfaVar;
        this.c = akfcVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return Boolean.valueOf(!this.b.j().l());
    }

    @Override // defpackage.agzi
    public CharSequence b() {
        return e();
    }

    @Override // defpackage.jad
    public cqkl c() {
        this.c.k(null, null);
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.a(dtxu.cH);
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.a.getResources().getString(R.string.LOCALSTREAM_WELCOME_PAGE_SIGN_IN_BUTTON_TEXT);
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

    @Override // defpackage.agzi, defpackage.jad
    @dzsi
    public cqtd i() {
        return null;
    }
}
