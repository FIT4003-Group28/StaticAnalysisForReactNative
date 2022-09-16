package defpackage;

import android.content.Context;
import android.view.View;
/* compiled from: PG */
/* renamed from: kli  reason: default package */
/* loaded from: classes7.dex */
public class kli implements klg {
    private final kls a;
    private boolean b = false;
    private int c = -1;
    private final ddho d;

    public kli(Context context, CharSequence charSequence, CharSequence charSequence2, ldm ldmVar, @dzsi cqtd cqtdVar, cqtd cqtdVar2, @dzsi CharSequence charSequence3, klr klrVar, int i, ddho ddhoVar, ddho ddhoVar2) {
        this.a = new kls(context, charSequence, charSequence2, ldmVar, cqtdVar, cqtdVar2, (CharSequence) null, klrVar, i, ddhoVar);
        this.d = ddhoVar2;
    }

    @Override // defpackage.klg
    public CharSequence a() {
        return this.a.a();
    }

    @Override // defpackage.klg
    public CharSequence b() {
        return this.a.b();
    }

    @Override // defpackage.klg
    @dzsi
    public CharSequence c() {
        return this.a.c();
    }

    @Override // defpackage.klg
    public cqkl d() {
        return this.a.d();
    }

    @Override // defpackage.klg
    public View.OnFocusChangeListener e() {
        return this.a.e();
    }

    @Override // defpackage.klg
    @dzsi
    public cqtd f() {
        return this.a.f();
    }

    @Override // defpackage.klg
    @dzsi
    public cqtd g() {
        return this.a.g();
    }

    @Override // defpackage.klg
    @dzsi
    public jic h() {
        return this.a.h();
    }

    @Override // defpackage.klg
    @dzsi
    public cjtd i() {
        if (this.b) {
            cjta b = cjtd.b();
            b.d = this.d;
            b.i(this.c);
            return b.a();
        }
        return this.a.i();
    }

    @Override // defpackage.klg
    public boolean j() {
        return true;
    }

    @Override // defpackage.klg
    public Boolean k() {
        return this.a.k();
    }

    public void l(int i) {
        this.c = i;
        this.b = true;
    }

    public void m(CharSequence charSequence) {
        this.a.l(charSequence);
        cqkx.p(this);
    }

    public kli(Context context, CharSequence charSequence, CharSequence charSequence2, ldm ldmVar, String str, @dzsi CharSequence charSequence3, klr klrVar, int i, ddho ddhoVar, ddho ddhoVar2) {
        this.a = new kls(context, charSequence, charSequence2, ldmVar, str, null, klrVar, i, ddhoVar);
        this.d = ddhoVar2;
    }
}
