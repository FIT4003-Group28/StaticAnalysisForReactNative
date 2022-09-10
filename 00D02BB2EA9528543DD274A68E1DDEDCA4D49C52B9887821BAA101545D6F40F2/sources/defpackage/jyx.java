package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: jyx  reason: default package */
/* loaded from: classes7.dex */
public class jyx implements jyq {
    private final Context a;
    private final CharSequence b;
    private final jyw c;
    private final boolean d;
    @dzsi
    private final ddho e;
    @dzsi
    private final ddho f;
    private jyp g;
    @dzsi
    private CharSequence h;

    public jyx(Context context, CharSequence charSequence, jyw jywVar, boolean z, jyj jyjVar) {
        dbsk.s(context);
        this.a = context;
        this.b = charSequence;
        dbsk.s(jywVar);
        this.c = jywVar;
        this.d = z;
        this.e = jyjVar.b();
        this.f = jyjVar.c();
        this.g = jyp.LOADING_SPINNER;
    }

    @Override // defpackage.jyq
    public CharSequence a() {
        return this.b;
    }

    @Override // defpackage.jyq
    public CharSequence b() {
        return this.a.getString(R.string.CAR_ALPHA_JUMP_TITLE);
    }

    @Override // defpackage.jyq
    public cqkl c() {
        ((jwa) this.c).a.i.b();
        return cqkl.a;
    }

    @Override // defpackage.jyq
    public cqkl d() {
        jwa jwaVar = (jwa) this.c;
        jwaVar.a.b.a();
        jwf jwfVar = jwaVar.a;
        nop nopVar = jwfVar.h;
        kdi kdiVar = jwfVar.g;
        dcdc<jyo> dcdcVar = jwfVar.m;
        dbrn dbrnVar = jvz.a;
        jwf jwfVar2 = jwaVar.a;
        nopVar.k(kdiVar.k(dcdcVar, dbrnVar, jwfVar2.r, jwfVar2.k));
        jwaVar.a.b.b();
        return cqkl.a;
    }

    @Override // defpackage.jyq
    public cqkl e() {
        ((jwa) this.c).a.c.o();
        return cqkl.a;
    }

    @Override // defpackage.jyq
    public Boolean f() {
        return Boolean.valueOf(this.g == jyp.LIST);
    }

    @Override // defpackage.jyq
    public Boolean g() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.jyq
    @dzsi
    public CharSequence h() {
        return this.h;
    }

    @Override // defpackage.jyq
    public Boolean i(jyp jypVar) {
        return Boolean.valueOf(this.g == jypVar);
    }

    @Override // defpackage.jyq
    @dzsi
    public cjtd j() {
        ddho ddhoVar = this.e;
        if (ddhoVar != null) {
            return cjtd.a(ddhoVar);
        }
        return null;
    }

    @Override // defpackage.jyq
    @dzsi
    public cjtd k() {
        ddho ddhoVar = this.f;
        if (ddhoVar != null) {
            return cjtd.a(ddhoVar);
        }
        return null;
    }

    public void l() {
        this.h = null;
        this.g = jyp.LIST;
        cqkx.p(this);
    }

    public void m(CharSequence charSequence) {
        this.h = charSequence;
        this.g = jyp.MESSAGE;
        cqkx.p(this);
    }
}
