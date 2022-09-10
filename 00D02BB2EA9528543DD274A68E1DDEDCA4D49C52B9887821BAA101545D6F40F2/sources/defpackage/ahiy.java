package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ahiy  reason: default package */
/* loaded from: classes2.dex */
public class ahiy implements agzi {
    private final ff a;
    private final dxio<afef> b;
    private final akfa c;

    public ahiy(ff ffVar, dxio<afef> dxioVar, akfa akfaVar) {
        this.a = ffVar;
        this.b = dxioVar;
        this.c = akfaVar;
    }

    @Override // defpackage.jad
    public Boolean a() {
        return Boolean.valueOf(this.c.j().m());
    }

    @Override // defpackage.agzi
    public CharSequence b() {
        return e();
    }

    @Override // defpackage.jad
    public cqkl c() {
        if (this.c.j().m()) {
            this.b.a().e(false);
        }
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        return cjtd.b;
    }

    @Override // defpackage.jad
    public CharSequence e() {
        return this.a.getResources().getString(R.string.EXIT_INCOGNITO_SIDE_MENU_BUTTON);
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
    public cqtd i() {
        return iup.e(R.raw.ic_incognito_icon);
    }
}
