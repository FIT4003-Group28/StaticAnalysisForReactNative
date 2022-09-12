package defpackage;

import android.text.style.ClickableSpan;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: axvl  reason: default package */
/* loaded from: classes3.dex */
public class axvl extends axve {
    private final ff c;
    private final akfc d;
    private final akey e;
    private final cjtd f;
    private final cjtd g;
    private final cjtd h;
    private final bvsx i;
    private final cklf j;

    public axvl(ff ffVar, akfc akfcVar, cklf cklfVar, dndp dndpVar, akey akeyVar) {
        super(ffVar, dndpVar);
        this.c = ffVar;
        this.d = akfcVar;
        this.j = cklfVar;
        this.e = akeyVar;
        this.f = cjtd.a(dtxj.ab);
        this.g = cjtd.a(dtxj.ac);
        this.h = cjtd.a(dtxj.ad);
        this.i = new bvsx(this.b);
    }

    @Override // defpackage.axvc
    public cjtd a() {
        return this.f;
    }

    @Override // defpackage.axvc
    public cjtd b() {
        return this.g;
    }

    @Override // defpackage.axve, defpackage.axvc
    public cjtd c() {
        return this.h;
    }

    @Override // defpackage.axvc
    public cqkl d() {
        this.c.g().f();
        this.d.k(this.e, null);
        return cqkl.a;
    }

    @Override // defpackage.axvc
    public CharSequence f() {
        bvsu c = this.i.c(R.string.ALIAS_SETTING_SIGN_IN_PROMPT);
        c.a(i());
        return c.c();
    }

    @Override // defpackage.axvc
    public CharSequence g() {
        String string = this.b.getString(R.string.LEARN_MORE);
        ClickableSpan e = this.j.e("maps_android_accounts");
        bvsu b = this.i.b(string);
        b.k(e);
        return b.c();
    }

    @Override // defpackage.axvc
    public CharSequence h() {
        return this.b.getString(R.string.LOGIN_PROMPT_PANEL_BUTTON_LABEL);
    }
}
